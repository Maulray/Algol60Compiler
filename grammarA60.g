grammar grammarA60;

options {
    language=Java;
    backtrack=false;
    output=AST;
    k=1;
}

tokens{
    PARAM_LIST;
    ARRAYSEG;
    BOOLEXPR;
    BORNES;
    TAIL;
    CONDITION;
    IF_STATEMENT;
    FOR_CONDITION;
    FOR_LIST;
    FOR_LIST_ELEM;
    FOR_STATEMENT;
    IF;
    IF_CLAUSE;
    PROCEDURE_STATEMENT;
    PROCH;
    PROG;
    SINON;
    STATEMENT_BIS;
    TYPARPROCDEC;
    ACTION;
    UNLABELLED_BLOCK;
    VP;
    ALORS;
    SPECIFIER;
    DEFINITION;
    PARAMETRES;
    STEP;
    UNTIL;
}

root:
    program -> program
;

program:
    'begin' unlabelled ->  unlabelled
    | 'label' ':' program
    | declaration ';' program -> ^(PROG declaration program)
    | 'inline' '(' STRING ')' ';' program

;

program_bis:
    'begin' unlabelled->  unlabelled
;

program_ter:
    'begin' unlabelled -> unlabelled
        | 'label'
            (
            ':'
                (
                program_bis
                | for_statement
                | conditional_statement
                )
            | identifier_list ';' (specifier identifier_list ';')*
                (
                program_bis
                | for_statement
                | conditional_statement
                )
            )
  ;

unlabelled:
    unlabelled_block -> unlabelled_block
    | compound_tail -> compound_tail
;

unlabelled_block:
    block_head compound_tail -> ^(UNLABELLED_BLOCK block_head compound_tail)
;

block_head:
    (declaration ';')+ -> declaration+
;

compound_tail:
    ('label:')* statement ( ';' ('label:')*statement)* 'end' -> ^(TAIL statement+)
;

statement:
    program_bis -> program_bis
    | conditional_statement -> conditional_statement
        | unlabelled_basic_statement -> unlabelled_basic_statement
        | for_statement -> for_statement
        | ->
;

statement_bis:
    specifier identifier_list ';' (specifier identifier_list ';')* after_statement_bis -> ^(STATEMENT_BIS ^(DEFINITION specifier identifier_list)+ after_statement_bis)
    | after_statement_bis->  ^(STATEMENT_BIS after_statement_bis)
;

after_statement_bis:
    program_ter -> program_ter
    | for_statement
    | conditional_statement
;

for_statement:
    for_clause statement -> ^(FOR_STATEMENT for_clause statement)
;

for_clause:
    'for' IDENTIFIER ':=' for_list_element 'do' -> ^(FOR_CONDITION IDENTIFIER for_list_element)
;

//for_list:
//    (',' for_list_element)* -> ^(FOR_LIST for_list_element*) //car sinon quand y'a pas de for_list ça enracine pas donc l'ast se crée pas

//;

for_list_element:
    boolean_expr
    	(
    	'step' exp1=expression 'until' exp2=expression -> ^(FOR_LIST_ELEM boolean_expr ^(STEP $exp1) ^(UNTIL $exp2))
    	| 'while' expression -> ^(FOR_LIST_ELEM boolean_expr expression)
    	//|(',' expression) -> ^(FOR_LIST_ELEM boolean_expr expression*) // à voir si on a encore besoin de for_list maintenant que j'ai rajouté ça
    	)
;

conditional_statement:
    if_clause stat1=statement (options{greedy=true;}: 'else' stat2=statement)? -> ^(IF_STATEMENT ^(CONDITION if_clause) ^(ALORS $stat1) ^(SINON $stat2)?) //je ne sais pas s'il faut print le else huhu
;

unlabelled_basic_statement:
    go_to_statement -> go_to_statement
    | 'inline' actual_parameter_list
    | IDENTIFIER ('['boolean_expr (','boolean_expr )*']')?
        (
       	((':'';'?|':=')  expression)* -> ^(ACTION IDENTIFIER boolean_expr* expression) //C du caca // =Rajout sauvage du '='
        | (actual_parameter_list) -> ^(ACTION IDENTIFIER boolean_expr* actual_parameter_list)
        )
;

go_to_statement:
    ('goto'^ | 'go to'^) expression
;

expression:
    boolean_expr -> boolean_expr
        | if_clause exp1=expression ('else' exp2=expression) -> ^(IF ^(CONDITION if_clause) ^(ALORS $exp1) ^(SINON $exp2))
        | go_to_statement //rajouté
        | program //rajouté
;

if_clause:
    'if' boolean_expr 'then' -> boolean_expr
;

boolean_expr:
    logic_expr ( '<=>' logic_expr)* -> logic_expr+
;

logic_expr:
    logic_expr_bis ( '=>' logic_expr_bis)* -> logic_expr_bis+
;

logic_expr_bis:
    logic_expr_ter (
        (
        'OR'^ //-> ^(LOGEXPRBIS logic_expr_ter+)
        | 'or'^ //-> ^(LOGEXPRBIS logic_expr_ter+)
        | '||'^ //-> ^(LOGEXPRBIS logic_expr_ter+)
        | 'AND'^ //-> ^(LOGEXPRBIS logic_expr_ter+)
        | 'and'^ //-> ^(LOGEXPRBIS logic_expr_ter+)
        | '&&'^ //-> ^(LOGEXPRBIS logic_expr_ter+)
        | '&'^
        | '|'^
        ) logic_expr_ter)*
;

logic_expr_ter:
    add_expr (
        (
        '<'^ //->  ^(LOGEXRTER add_expr+)
        | '>'^ //->  ^(LOGEXRTER add_expr+)
        | '<='^ //->  ^(LOGEXRTER add_expr+)
        | '>='^ //->  ^(LOGEXRTER add_expr+)
        | '='^ //->  ^(LOGEXRTER add_expr+)
        //| '=='^
        | '<>'^ //->  ^(LOGEXRTER add_expr+)
        ) add_expr)*
;

add_expr:
    ('+')? mult_expr (('+'^|'-'^) mult_expr)* //C'est moche mais ça passe
;

mult_expr:
    factor_expr (
        (
        '*'^
        | '/'^
        | '%'^
        ) factor_expr)*
;

factor_expr:
    ('~')? value ( '**'^ ('~')? value)* //-> value+
;

value :
    IDENTIFIER (after_identifier)? -> ^(IDENTIFIER after_identifier?)
    | '-'^ UNSIGNED_NUMBER
    | UNSIGNED_NUMBER -> UNSIGNED_NUMBER
    | '(' boolean_expr ')' -> boolean_expr
    | 'FALSE'
    | 'TRUE'
    ;

after_identifier:
    actual_parameter_list //-> ^(AFTERIDENTIFIER actual_parameter_list)
    | '[' boolean_expr (','boolean_expr)* ']' ->  boolean_expr+
;


if_statement:
    if_clause program_bis
;

actual_parameter:
    STRING -> STRING
        | expression -> expression
;

actual_parameter_list:
    '(' actparam1=actual_parameter (',' actparam2=actual_parameter)* ')'   (IDENTIFIER ':' '(' actparam3=actual_parameter (',' actparam4=actual_parameter)* ')')*
    -> ^(PARAM_LIST actual_parameter+ (IDENTIFIER actual_parameter+)*)
;

declaration:
    type_array_proc_declaration //-> ^(TYPARPROCDEC type_array_proc_declaration)//type_array_proc_declaration
    | array_declaration
    | switch_declaration
    | procedure_declaration

;
/*Changement probablement à ce niveau là*/
type_array_proc_declaration:
    'own' type_array_proc_declaration_bis
        | TYPE   type_array_proc_declaration_ter -> ^(TYPARPROCDEC TYPE type_array_proc_declaration_ter) //^(TYPARPROCDEC TYPE type_array_proc_declaration_ter)
;

type_array_proc_declaration_bis:
    array_declaration
        | TYPE (type_list| array_declaration)
;

type_array_proc_declaration_ter:
    procedure_declaration
        | array_declaration
        | type_list -> type_list
;


type_list:
    IDENTIFIER (',' IDENTIFIER)* -> IDENTIFIER+
;

bound_pair :
    exp1=expression ':' exp2=expression -> ^(BORNES $exp1 $exp2)
;

bound_pair_list:
    bound_pair (',' bound_pair)* -> bound_pair+
;

array_declaration:
    'array' array_list
;

array_list :
    array_segment (',' array_segment)*
;

array_segment:
    IDENTIFIER ('['bound_pair_list ']' -> ^(ARRAYSEG IDENTIFIER bound_pair_list)
    | array_segment -> ^(ARRAYSEG array_segment))
;

switch_declaration:
    'switch' IDENTIFIER ':=' switch_list
;

switch_list:
    expression (',' expression)*
;

procedure_declaration:
    'procedure' procedure_heading (statement_bis)? -> ^(PROCEDURE_STATEMENT procedure_heading (statement_bis)?)
;

procedure_heading:
    IDENTIFIER (formal_parameter_list)? ';' (value_part)? -> ^(PROCH IDENTIFIER ^(PARAMETRES (formal_parameter_list)? (value_part)?))
;


specifier:
    'string'
    | TYPE fact_type_array_procedure //-> ^(SPECIFIER TYPE fact_type_array_procedure)
    | 'array'
    | 'switch'
    | 'procedure'
;

fact_type_array_procedure:
    'procedure'
    |'array'
    | 
;

value_part:
    'value' identifier_list ';' -> ^(VP identifier_list)
;

identifier_list:
    IDENTIFIER (',' IDENTIFIER)* -> IDENTIFIER+
;


formal_parameter_list:
    '(' IDENTIFIER (',' IDENTIFIER)* ')'   (IDENTIFIER ':' '(' IDENTIFIER (',' IDENTIFIER)* ')')* -> IDENTIFIER+
;

TYPE:
    'real'
       | 'integer'
       | 'boolean'
;

IDENTIFIER:
    ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z' | '0'..'9')*
;

PARAMETER_DELIMITER:
    ')' ('a'..'z' | 'A'..'Z')+ ':' '('
    | ','
;

UNSIGNED_NUMBER:
    ('0'..'9')+
        (
        '.'('0'..'9')+ ('e'
            (
            '+'
            | '-'
            | ' '
            )('0'..'9')+)?
        | ('e'
            (
            '+'
            | '-'
            | ' '
            )('0'..'9')+)
        )?
;

STRING:
    '"' ( ('a'..'z') | ('A'..'Z') | ('0'..'9') | ' ' | '.' |  '(' | ')' | '[' | ']' | ',' | '_' | ';' | '\'' | ':' | '<' | '=' | '>' | '\\"'| '~' | '/' | '\\' | '+' | '-' | '*' )* '"'
;

COMMENT:
    (('comment'|'#') (~';')* ';') {$channel=HIDDEN;}
;

WS:
    (' '|'\r'|'\n'|'\t'|'EOF')+ {$channel=HIDDEN;}
    ;
