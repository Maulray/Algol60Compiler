/*<<<<<<< Updated upstream:output/grammarA60Parserold.java
package main;

// $ANTLR null C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g 2020-01-19 17:11:56
=======
// $ANTLR null /home/maiwenn/Documents/2A/hantz7u/grammarA60.g 2020-02-07 11:41:04
>>>>>>> Stashed changes:output/grammarA60Parser.java

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
<<<<<<< Updated upstream:output/grammarA60Parserold.java
public class grammarA60Parserold extends Parser {
=======
public class grammarA60Parser extends DebugParser {
>>>>>>> Stashed changes:output/grammarA60Parser.java
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "ALORS", "ARRAYSEG", 
		"BOOLEXPR", "BORNES", "COMMENT", "CONDITION", "FOR_CONDITION", "FOR_LIST", 
		"FOR_LIST_ELEM", "FOR_STATEMENT", "IDENTIFIER", "IF", "IF_CLAUSE", "IF_STATEMENT", 
		"PARAMETER_DELIMITER", "PARAM_LIST", "PROCEDURE_STATEMENT", "PROCH", "PROG", 
		"SINON", "STATEMENT_BIS", "STRING", "TAIL", "TYPARPROCDEC", "TYPE", "UNLABELLED_BLOCK", 
		"UNSIGNED_NUMBER", "VP", "WS", "'%'", "'&&'", "'&'", "'('", "')'", "'*'", 
		"'**'", "'+'", "','", "'-'", "'/'", "':'", "':='", "';'", "'<'", "'<='", 
		"'<=>'", "'<>'", "'='", "'=>'", "'>'", "'>='", "'AND'", "'FALSE'", "'OR'", 
		"'TRUE'", "'['", "']'", "'and'", "'array'", "'begin'", "'do'", "'else'", 
		"'end'", "'for'", "'go to'", "'goto'", "'if'", "'inline'", "'label'", 
		"'label:'", "'or'", "'own'", "'procedure'", "'step'", "'string'", "'switch'", 
		"'then'", "'until'", "'value'", "'while'", "'|'", "'||'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int ACTION=4;
	public static final int ALORS=5;
	public static final int ARRAYSEG=6;
	public static final int BOOLEXPR=7;
	public static final int BORNES=8;
	public static final int COMMENT=9;
	public static final int CONDITION=10;
	public static final int FOR_CONDITION=11;
	public static final int FOR_LIST=12;
	public static final int FOR_LIST_ELEM=13;
	public static final int FOR_STATEMENT=14;
	public static final int IDENTIFIER=15;
	public static final int IF=16;
	public static final int IF_CLAUSE=17;
	public static final int IF_STATEMENT=18;
	public static final int PARAMETER_DELIMITER=19;
	public static final int PARAM_LIST=20;
	public static final int PROCEDURE_STATEMENT=21;
	public static final int PROCH=22;
	public static final int PROG=23;
	public static final int SINON=24;
	public static final int STATEMENT_BIS=25;
	public static final int STRING=26;
	public static final int TAIL=27;
	public static final int TYPARPROCDEC=28;
	public static final int TYPE=29;
	public static final int UNLABELLED_BLOCK=30;
	public static final int UNSIGNED_NUMBER=31;
	public static final int VP=32;
	public static final int WS=33;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


<<<<<<< Updated upstream:output/grammarA60Parserold.java
	public grammarA60Parserold(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public grammarA60Parserold(TokenStream input, RecognizerSharedState state) {
=======
	public static final String[] ruleNames = new String[] {
		"invalidRule", "add_expr", "compound_tail", "procedure_declaration", "program", 
		"unlabelled", "for_list_element", "for_statement", "unlabelled_block", 
		"go_to_statement", "statement_bis", "block_head", "for_clause", "conditional_statement", 
		"bound_pair_list", "program_bis", "bound_pair", "logic_expr_ter", "mult_expr", 
		"type_array_proc_declaration", "actual_parameter", "array_segment", "type_array_proc_declaration_bis", 
		"array_list", "after_identifier", "statement", "actual_parameter_list", 
		"array_declaration", "switch_list", "procedure_heading", "type_array_proc_declaration_ter", 
		"specifier", "expression", "if_clause", "fact_type_array_procedure", "if_statement", 
		"boolean_expr", "logic_expr", "factor_expr", "formal_parameter_list", 
		"logic_expr_bis", "declaration", "value", "type_list", "identifier_list", 
		"unlabelled_basic_statement", "program_ter", "root", "value_part", "after_statement_bis", 
		"for_list", "switch_declaration"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public grammarA60Parser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public grammarA60Parser(TokenStream input, int port, RecognizerSharedState state) {
>>>>>>> Stashed changes:output/grammarA60Parser.java
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public grammarA60Parser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	@Override public String[] getTokenNames() { return grammarA60Parserold.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g"; }
=======

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return grammarA60Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/maiwenn/Documents/2A/hantz7u/grammarA60.g"; }
>>>>>>> Stashed changes:output/grammarA60Parser.java


	public static class root_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "root"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:36:1: root : program -> program ;
	public final grammarA60Parserold.root_return root() throws RecognitionException {
		grammarA60Parserold.root_return retval = new grammarA60Parserold.root_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:41:1: root : program -> program ;
	public final grammarA60Parser.root_return root() throws RecognitionException {
		grammarA60Parser.root_return retval = new grammarA60Parser.root_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program1 =null;

		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try { dbg.enterRule(getGrammarFileName(), "root");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:36:5: ( program -> program )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:37:5: program
			{
			pushFollow(FOLLOW_program_in_root220);
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:41:5: ( program -> program )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:42:5: program
			{
			dbg.location(42,5);
			pushFollow(FOLLOW_program_in_root255);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			program1=program();
			state._fsp--;

			stream_program.add(program1.getTree());
			// AST REWRITE
			// elements: program
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 37:13: -> program
			{
				dbg.location(42,16);
				adaptor.addChild(root_0, stream_program.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(43, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "root");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "root"


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:40:1: program : ( 'begin' unlabelled -> unlabelled | 'label' ':' program | declaration ';' program -> ^( PROG declaration program ) | 'inline' '(' STRING ')' ';' program );
	public final grammarA60Parserold.program_return program() throws RecognitionException {
		grammarA60Parserold.program_return retval = new grammarA60Parserold.program_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:45:1: program : ( 'begin' unlabelled -> unlabelled | 'label' ':' program | declaration ';' program -> ^( PROG declaration program ) | 'inline' '(' STRING ')' ';' program );
	public final grammarA60Parser.program_return program() throws RecognitionException {
		grammarA60Parser.program_return retval = new grammarA60Parser.program_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal2=null;
		Token string_literal4=null;
		Token char_literal5=null;
		Token char_literal8=null;
		Token string_literal10=null;
		Token char_literal11=null;
		Token STRING12=null;
		Token char_literal13=null;
		Token char_literal14=null;
		ParserRuleReturnScope unlabelled3 =null;
		ParserRuleReturnScope program6 =null;
		ParserRuleReturnScope declaration7 =null;
		ParserRuleReturnScope program9 =null;
		ParserRuleReturnScope program15 =null;

		Object string_literal2_tree=null;
		Object string_literal4_tree=null;
		Object char_literal5_tree=null;
		Object char_literal8_tree=null;
		Object string_literal10_tree=null;
		Object char_literal11_tree=null;
		Object STRING12_tree=null;
		Object char_literal13_tree=null;
		Object char_literal14_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_unlabelled=new RewriteRuleSubtreeStream(adaptor,"rule unlabelled");
		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:40:8: ( 'begin' unlabelled -> unlabelled | 'label' ':' program | declaration ';' program -> ^( PROG declaration program ) | 'inline' '(' STRING ')' ';' program )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:45:8: ( 'begin' unlabelled -> unlabelled | 'label' ':' program | declaration ';' program -> ^( PROG declaration program ) | 'inline' '(' STRING ')' ';' program )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt1=4;
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			switch ( input.LA(1) ) {
			case 64:
				{
				alt1=1;
				}
				break;
			case 73:
				{
				alt1=2;
				}
				break;
			case TYPE:
			case 63:
			case 76:
			case 77:
			case 80:
				{
				alt1=3;
				}
				break;
			case 72:
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:41:5: 'begin' unlabelled
					{
					string_literal2=(Token)match(input,64,FOLLOW_64_in_program236);  
					stream_64.add(string_literal2);

					pushFollow(FOLLOW_unlabelled_in_program238);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:46:5: 'begin' unlabelled
					{
					dbg.location(46,5);
					string_literal2=(Token)match(input,69,FOLLOW_69_in_program271);  
					stream_69.add(string_literal2);
					dbg.location(46,13);
					pushFollow(FOLLOW_unlabelled_in_program273);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					unlabelled3=unlabelled();
					state._fsp--;

					stream_unlabelled.add(unlabelled3.getTree());
					// AST REWRITE
					// elements: unlabelled
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 41:24: -> unlabelled
					{
						dbg.location(46,28);
						adaptor.addChild(root_0, stream_unlabelled.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:42:7: 'label' ':' program
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:47:7: 'label' ':' program
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					string_literal4=(Token)match(input,73,FOLLOW_73_in_program251); 
					string_literal4_tree = (Object)adaptor.create(string_literal4);
					adaptor.addChild(root_0, string_literal4_tree);

					char_literal5=(Token)match(input,45,FOLLOW_45_in_program253); 
					char_literal5_tree = (Object)adaptor.create(char_literal5);
					adaptor.addChild(root_0, char_literal5_tree);

					pushFollow(FOLLOW_program_in_program255);
=======
					dbg.location(47,7);
					string_literal4=(Token)match(input,78,FOLLOW_78_in_program286); 
					string_literal4_tree = (Object)adaptor.create(string_literal4);
					adaptor.addChild(root_0, string_literal4_tree);
					dbg.location(47,15);
					char_literal5=(Token)match(input,50,FOLLOW_50_in_program288); 
					char_literal5_tree = (Object)adaptor.create(char_literal5);
					adaptor.addChild(root_0, char_literal5_tree);
					dbg.location(47,19);
					pushFollow(FOLLOW_program_in_program290);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					program6=program();
					state._fsp--;

					adaptor.addChild(root_0, program6.getTree());

					}
					break;
				case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:43:7: declaration ';' program
					{
					pushFollow(FOLLOW_declaration_in_program263);
					declaration7=declaration();
					state._fsp--;

					stream_declaration.add(declaration7.getTree());
					char_literal8=(Token)match(input,47,FOLLOW_47_in_program265);  
					stream_47.add(char_literal8);

					pushFollow(FOLLOW_program_in_program267);
=======
					dbg.enterAlt(3);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:48:7: declaration ';' program
					{
					dbg.location(48,7);
					pushFollow(FOLLOW_declaration_in_program298);
					declaration7=declaration();
					state._fsp--;

					stream_declaration.add(declaration7.getTree());dbg.location(48,19);
					char_literal8=(Token)match(input,52,FOLLOW_52_in_program300);  
					stream_52.add(char_literal8);
					dbg.location(48,23);
					pushFollow(FOLLOW_program_in_program302);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					program9=program();
					state._fsp--;

					stream_program.add(program9.getTree());
					// AST REWRITE
					// elements: program, declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 43:31: -> ^( PROG declaration program )
					{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
						// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:43:34: ^( PROG declaration program )
=======
						dbg.location(48,34);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:48:34: ^( PROG declaration program )
>>>>>>> Stashed changes:output/grammarA60Parser.java
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(48,36);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROG, "PROG"), root_1);
						dbg.location(48,41);
						adaptor.addChild(root_1, stream_declaration.nextTree());dbg.location(48,53);
						adaptor.addChild(root_1, stream_program.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:44:7: 'inline' '(' STRING ')' ';' program
=======
					dbg.enterAlt(4);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:49:7: 'inline' '(' STRING ')' ';' program
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					string_literal10=(Token)match(input,72,FOLLOW_72_in_program285); 
					string_literal10_tree = (Object)adaptor.create(string_literal10);
					adaptor.addChild(root_0, string_literal10_tree);

					char_literal11=(Token)match(input,37,FOLLOW_37_in_program287); 
					char_literal11_tree = (Object)adaptor.create(char_literal11);
					adaptor.addChild(root_0, char_literal11_tree);

					STRING12=(Token)match(input,STRING,FOLLOW_STRING_in_program289); 
					STRING12_tree = (Object)adaptor.create(STRING12);
					adaptor.addChild(root_0, STRING12_tree);

					char_literal13=(Token)match(input,38,FOLLOW_38_in_program291); 
					char_literal13_tree = (Object)adaptor.create(char_literal13);
					adaptor.addChild(root_0, char_literal13_tree);

					char_literal14=(Token)match(input,47,FOLLOW_47_in_program293); 
					char_literal14_tree = (Object)adaptor.create(char_literal14);
					adaptor.addChild(root_0, char_literal14_tree);

					pushFollow(FOLLOW_program_in_program295);
=======
					dbg.location(49,7);
					string_literal10=(Token)match(input,77,FOLLOW_77_in_program320); 
					string_literal10_tree = (Object)adaptor.create(string_literal10);
					adaptor.addChild(root_0, string_literal10_tree);
					dbg.location(49,16);
					char_literal11=(Token)match(input,42,FOLLOW_42_in_program322); 
					char_literal11_tree = (Object)adaptor.create(char_literal11);
					adaptor.addChild(root_0, char_literal11_tree);
					dbg.location(49,20);
					STRING12=(Token)match(input,STRING,FOLLOW_STRING_in_program324); 
					STRING12_tree = (Object)adaptor.create(STRING12);
					adaptor.addChild(root_0, STRING12_tree);
					dbg.location(49,27);
					char_literal13=(Token)match(input,43,FOLLOW_43_in_program326); 
					char_literal13_tree = (Object)adaptor.create(char_literal13);
					adaptor.addChild(root_0, char_literal13_tree);
					dbg.location(49,31);
					char_literal14=(Token)match(input,52,FOLLOW_52_in_program328); 
					char_literal14_tree = (Object)adaptor.create(char_literal14);
					adaptor.addChild(root_0, char_literal14_tree);
					dbg.location(49,35);
					pushFollow(FOLLOW_program_in_program330);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					program15=program();
					state._fsp--;

					adaptor.addChild(root_0, program15.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(51, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "program"


	public static class program_bis_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program_bis"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:48:1: program_bis : 'begin' unlabelled -> unlabelled ;
	public final grammarA60Parserold.program_bis_return program_bis() throws RecognitionException {
		grammarA60Parserold.program_bis_return retval = new grammarA60Parserold.program_bis_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:53:1: program_bis : 'begin' unlabelled -> unlabelled ;
	public final grammarA60Parser.program_bis_return program_bis() throws RecognitionException {
		grammarA60Parser.program_bis_return retval = new grammarA60Parser.program_bis_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal16=null;
		ParserRuleReturnScope unlabelled17 =null;

		Object string_literal16_tree=null;
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_unlabelled=new RewriteRuleSubtreeStream(adaptor,"rule unlabelled");

		try { dbg.enterRule(getGrammarFileName(), "program_bis");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(53, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:48:12: ( 'begin' unlabelled -> unlabelled )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:49:5: 'begin' unlabelled
			{
			string_literal16=(Token)match(input,64,FOLLOW_64_in_program_bis308);  
			stream_64.add(string_literal16);

			pushFollow(FOLLOW_unlabelled_in_program_bis310);
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:53:12: ( 'begin' unlabelled -> unlabelled )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:54:5: 'begin' unlabelled
			{
			dbg.location(54,5);
			string_literal16=(Token)match(input,69,FOLLOW_69_in_program_bis343);  
			stream_69.add(string_literal16);
			dbg.location(54,13);
			pushFollow(FOLLOW_unlabelled_in_program_bis345);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			unlabelled17=unlabelled();
			state._fsp--;

			stream_unlabelled.add(unlabelled17.getTree());
			// AST REWRITE
			// elements: unlabelled
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 49:23: -> unlabelled
			{
				dbg.location(54,27);
				adaptor.addChild(root_0, stream_unlabelled.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(55, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program_bis");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "program_bis"


	public static class program_ter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program_ter"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:52:1: program_ter : ( 'begin' unlabelled -> unlabelled | 'label' ( ':' ( program_bis | for_statement | conditional_statement ) | identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement ) ) );
	public final grammarA60Parserold.program_ter_return program_ter() throws RecognitionException {
		grammarA60Parserold.program_ter_return retval = new grammarA60Parserold.program_ter_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:57:1: program_ter : ( 'begin' unlabelled -> unlabelled | 'label' ( ':' ( program_bis | for_statement | conditional_statement ) | identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement ) ) );
	public final grammarA60Parser.program_ter_return program_ter() throws RecognitionException {
		grammarA60Parser.program_ter_return retval = new grammarA60Parser.program_ter_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal18=null;
		Token string_literal20=null;
		Token char_literal21=null;
		Token char_literal26=null;
		Token char_literal29=null;
		ParserRuleReturnScope unlabelled19 =null;
		ParserRuleReturnScope program_bis22 =null;
		ParserRuleReturnScope for_statement23 =null;
		ParserRuleReturnScope conditional_statement24 =null;
		ParserRuleReturnScope identifier_list25 =null;
		ParserRuleReturnScope specifier27 =null;
		ParserRuleReturnScope identifier_list28 =null;
		ParserRuleReturnScope program_bis30 =null;
		ParserRuleReturnScope for_statement31 =null;
		ParserRuleReturnScope conditional_statement32 =null;

		Object string_literal18_tree=null;
		Object string_literal20_tree=null;
		Object char_literal21_tree=null;
		Object char_literal26_tree=null;
		Object char_literal29_tree=null;
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_unlabelled=new RewriteRuleSubtreeStream(adaptor,"rule unlabelled");

		try { dbg.enterRule(getGrammarFileName(), "program_ter");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:52:12: ( 'begin' unlabelled -> unlabelled | 'label' ( ':' ( program_bis | for_statement | conditional_statement ) | identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement ) ) )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:57:12: ( 'begin' unlabelled -> unlabelled | 'label' ( ':' ( program_bis | for_statement | conditional_statement ) | identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement ) ) )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==64) ) {
				alt6=1;
			}
			else if ( (LA6_0==73) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:53:5: 'begin' unlabelled
					{
					string_literal18=(Token)match(input,64,FOLLOW_64_in_program_ter326);  
					stream_64.add(string_literal18);

					pushFollow(FOLLOW_unlabelled_in_program_ter328);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:58:5: 'begin' unlabelled
					{
					dbg.location(58,5);
					string_literal18=(Token)match(input,69,FOLLOW_69_in_program_ter361);  
					stream_69.add(string_literal18);
					dbg.location(58,13);
					pushFollow(FOLLOW_unlabelled_in_program_ter363);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					unlabelled19=unlabelled();
					state._fsp--;

					stream_unlabelled.add(unlabelled19.getTree());
					// AST REWRITE
					// elements: unlabelled
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 53:24: -> unlabelled
					{
						dbg.location(58,27);
						adaptor.addChild(root_0, stream_unlabelled.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:54:11: 'label' ( ':' ( program_bis | for_statement | conditional_statement ) | identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement ) )
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:59:11: 'label' ( ':' ( program_bis | for_statement | conditional_statement ) | identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement ) )
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					string_literal20=(Token)match(input,73,FOLLOW_73_in_program_ter344); 
					string_literal20_tree = (Object)adaptor.create(string_literal20);
					adaptor.addChild(root_0, string_literal20_tree);

					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:55:13: ( ':' ( program_bis | for_statement | conditional_statement ) | identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement ) )
=======
					dbg.location(59,11);
					string_literal20=(Token)match(input,78,FOLLOW_78_in_program_ter379); 
					string_literal20_tree = (Object)adaptor.create(string_literal20);
					adaptor.addChild(root_0, string_literal20_tree);
					dbg.location(60,13);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:60:13: ( ':' ( program_bis | for_statement | conditional_statement ) | identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement ) )
>>>>>>> Stashed changes:output/grammarA60Parser.java
					int alt5=2;
					try { dbg.enterSubRule(5);
					try { dbg.enterDecision(5, decisionCanBacktrack[5]);

					int LA5_0 = input.LA(1);
					if ( (LA5_0==45) ) {
						alt5=1;
					}
					else if ( (LA5_0==IDENTIFIER) ) {
						alt5=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(5);}

					switch (alt5) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:56:13: ':' ( program_bis | for_statement | conditional_statement )
							{
							char_literal21=(Token)match(input,45,FOLLOW_45_in_program_ter372); 
							char_literal21_tree = (Object)adaptor.create(char_literal21);
							adaptor.addChild(root_0, char_literal21_tree);

							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:57:17: ( program_bis | for_statement | conditional_statement )
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:61:13: ':' ( program_bis | for_statement | conditional_statement )
							{
							dbg.location(61,13);
							char_literal21=(Token)match(input,50,FOLLOW_50_in_program_ter407); 
							char_literal21_tree = (Object)adaptor.create(char_literal21);
							adaptor.addChild(root_0, char_literal21_tree);
							dbg.location(62,17);
							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:62:17: ( program_bis | for_statement | conditional_statement )
>>>>>>> Stashed changes:output/grammarA60Parser.java
							int alt2=3;
							try { dbg.enterSubRule(2);
							try { dbg.enterDecision(2, decisionCanBacktrack[2]);

							switch ( input.LA(1) ) {
							case 64:
								{
								alt2=1;
								}
								break;
							case 68:
								{
								alt2=2;
								}
								break;
							case 71:
								{
								alt2=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 2, 0, input);
								dbg.recognitionException(nvae);
								throw nvae;
							}
							} finally {dbg.exitDecision(2);}

							switch (alt2) {
								case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
									// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:58:17: program_bis
									{
									pushFollow(FOLLOW_program_bis_in_program_ter408);
=======
									dbg.enterAlt(1);

									// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:63:17: program_bis
									{
									dbg.location(63,17);
									pushFollow(FOLLOW_program_bis_in_program_ter443);
>>>>>>> Stashed changes:output/grammarA60Parser.java
									program_bis22=program_bis();
									state._fsp--;

									adaptor.addChild(root_0, program_bis22.getTree());

									}
									break;
								case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
									// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:59:19: for_statement
									{
									pushFollow(FOLLOW_for_statement_in_program_ter428);
=======
									dbg.enterAlt(2);

									// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:64:19: for_statement
									{
									dbg.location(64,19);
									pushFollow(FOLLOW_for_statement_in_program_ter463);
>>>>>>> Stashed changes:output/grammarA60Parser.java
									for_statement23=for_statement();
									state._fsp--;

									adaptor.addChild(root_0, for_statement23.getTree());

									}
									break;
								case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
									// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:60:19: conditional_statement
									{
									pushFollow(FOLLOW_conditional_statement_in_program_ter448);
=======
									dbg.enterAlt(3);

									// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:65:19: conditional_statement
									{
									dbg.location(65,19);
									pushFollow(FOLLOW_conditional_statement_in_program_ter483);
>>>>>>> Stashed changes:output/grammarA60Parser.java
									conditional_statement24=conditional_statement();
									state._fsp--;

									adaptor.addChild(root_0, conditional_statement24.getTree());

									}
									break;

							}
							} finally {dbg.exitSubRule(2);}

							}
							break;
						case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:62:15: identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement )
							{
							pushFollow(FOLLOW_identifier_list_in_program_ter482);
=======
							dbg.enterAlt(2);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:67:15: identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement )
							{
							dbg.location(67,15);
							pushFollow(FOLLOW_identifier_list_in_program_ter517);
>>>>>>> Stashed changes:output/grammarA60Parser.java
							identifier_list25=identifier_list();
							state._fsp--;

							adaptor.addChild(root_0, identifier_list25.getTree());
<<<<<<< Updated upstream:output/grammarA60Parserold.java

							char_literal26=(Token)match(input,47,FOLLOW_47_in_program_ter484); 
=======
							dbg.location(67,31);
							char_literal26=(Token)match(input,52,FOLLOW_52_in_program_ter519); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							char_literal26_tree = (Object)adaptor.create(char_literal26);
							adaptor.addChild(root_0, char_literal26_tree);
							dbg.location(67,35);
							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:67:35: ( specifier identifier_list ';' )*
							try { dbg.enterSubRule(3);

<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:62:35: ( specifier identifier_list ';' )*
=======
>>>>>>> Stashed changes:output/grammarA60Parser.java
							loop3:
							while (true) {
								int alt3=2;
								try { dbg.enterDecision(3, decisionCanBacktrack[3]);

								int LA3_0 = input.LA(1);
								if ( (LA3_0==TYPE||LA3_0==63||LA3_0==77||(LA3_0 >= 79 && LA3_0 <= 80)) ) {
									alt3=1;
								}

								} finally {dbg.exitDecision(3);}

								switch (alt3) {
								case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
									// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:62:36: specifier identifier_list ';'
									{
									pushFollow(FOLLOW_specifier_in_program_ter487);
=======
									dbg.enterAlt(1);

									// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:67:36: specifier identifier_list ';'
									{
									dbg.location(67,36);
									pushFollow(FOLLOW_specifier_in_program_ter522);
>>>>>>> Stashed changes:output/grammarA60Parser.java
									specifier27=specifier();
									state._fsp--;

									adaptor.addChild(root_0, specifier27.getTree());
<<<<<<< Updated upstream:output/grammarA60Parserold.java

									pushFollow(FOLLOW_identifier_list_in_program_ter489);
=======
									dbg.location(67,46);
									pushFollow(FOLLOW_identifier_list_in_program_ter524);
>>>>>>> Stashed changes:output/grammarA60Parser.java
									identifier_list28=identifier_list();
									state._fsp--;

									adaptor.addChild(root_0, identifier_list28.getTree());
<<<<<<< Updated upstream:output/grammarA60Parserold.java

									char_literal29=(Token)match(input,47,FOLLOW_47_in_program_ter491); 
=======
									dbg.location(67,62);
									char_literal29=(Token)match(input,52,FOLLOW_52_in_program_ter526); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
									char_literal29_tree = (Object)adaptor.create(char_literal29);
									adaptor.addChild(root_0, char_literal29_tree);

									}
									break;

								default :
									break loop3;
								}
							}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:63:17: ( program_bis | for_statement | conditional_statement )
=======
							} finally {dbg.exitSubRule(3);}
							dbg.location(68,17);
							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:68:17: ( program_bis | for_statement | conditional_statement )
>>>>>>> Stashed changes:output/grammarA60Parser.java
							int alt4=3;
							try { dbg.enterSubRule(4);
							try { dbg.enterDecision(4, decisionCanBacktrack[4]);

							switch ( input.LA(1) ) {
							case 64:
								{
								alt4=1;
								}
								break;
							case 68:
								{
								alt4=2;
								}
								break;
							case 71:
								{
								alt4=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 4, 0, input);
								dbg.recognitionException(nvae);
								throw nvae;
							}
							} finally {dbg.exitDecision(4);}

							switch (alt4) {
								case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
									// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:64:17: program_bis
									{
									pushFollow(FOLLOW_program_bis_in_program_ter529);
=======
									dbg.enterAlt(1);

									// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:69:17: program_bis
									{
									dbg.location(69,17);
									pushFollow(FOLLOW_program_bis_in_program_ter564);
>>>>>>> Stashed changes:output/grammarA60Parser.java
									program_bis30=program_bis();
									state._fsp--;

									adaptor.addChild(root_0, program_bis30.getTree());

									}
									break;
								case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
									// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:65:19: for_statement
									{
									pushFollow(FOLLOW_for_statement_in_program_ter549);
=======
									dbg.enterAlt(2);

									// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:70:19: for_statement
									{
									dbg.location(70,19);
									pushFollow(FOLLOW_for_statement_in_program_ter584);
>>>>>>> Stashed changes:output/grammarA60Parser.java
									for_statement31=for_statement();
									state._fsp--;

									adaptor.addChild(root_0, for_statement31.getTree());

									}
									break;
								case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
									// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:66:19: conditional_statement
									{
									pushFollow(FOLLOW_conditional_statement_in_program_ter569);
=======
									dbg.enterAlt(3);

									// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:71:19: conditional_statement
									{
									dbg.location(71,19);
									pushFollow(FOLLOW_conditional_statement_in_program_ter604);
>>>>>>> Stashed changes:output/grammarA60Parser.java
									conditional_statement32=conditional_statement();
									state._fsp--;

									adaptor.addChild(root_0, conditional_statement32.getTree());

									}
									break;

							}
							} finally {dbg.exitSubRule(4);}

							}
							break;

					}
					} finally {dbg.exitSubRule(5);}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(74, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program_ter");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "program_ter"


	public static class unlabelled_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unlabelled"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:71:1: unlabelled : ( unlabelled_block -> unlabelled_block | compound_tail -> compound_tail );
	public final grammarA60Parserold.unlabelled_return unlabelled() throws RecognitionException {
		grammarA60Parserold.unlabelled_return retval = new grammarA60Parserold.unlabelled_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:76:1: unlabelled : ( unlabelled_block -> unlabelled_block | compound_tail -> compound_tail );
	public final grammarA60Parser.unlabelled_return unlabelled() throws RecognitionException {
		grammarA60Parser.unlabelled_return retval = new grammarA60Parser.unlabelled_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope unlabelled_block33 =null;
		ParserRuleReturnScope compound_tail34 =null;

		RewriteRuleSubtreeStream stream_unlabelled_block=new RewriteRuleSubtreeStream(adaptor,"rule unlabelled_block");
		RewriteRuleSubtreeStream stream_compound_tail=new RewriteRuleSubtreeStream(adaptor,"rule compound_tail");

		try { dbg.enterRule(getGrammarFileName(), "unlabelled");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:71:11: ( unlabelled_block -> unlabelled_block | compound_tail -> compound_tail )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:76:11: ( unlabelled_block -> unlabelled_block | compound_tail -> compound_tail )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt7=2;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==TYPE||LA7_0==63||(LA7_0 >= 76 && LA7_0 <= 77)||LA7_0==80) ) {
				alt7=1;
			}
			else if ( (LA7_0==IDENTIFIER||LA7_0==47||LA7_0==64||(LA7_0 >= 66 && LA7_0 <= 72)||LA7_0==74) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:72:5: unlabelled_block
					{
					pushFollow(FOLLOW_unlabelled_block_in_unlabelled615);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:77:5: unlabelled_block
					{
					dbg.location(77,5);
					pushFollow(FOLLOW_unlabelled_block_in_unlabelled650);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					unlabelled_block33=unlabelled_block();
					state._fsp--;

					stream_unlabelled_block.add(unlabelled_block33.getTree());
					// AST REWRITE
					// elements: unlabelled_block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 72:22: -> unlabelled_block
					{
						dbg.location(77,25);
						adaptor.addChild(root_0, stream_unlabelled_block.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:73:7: compound_tail
					{
					pushFollow(FOLLOW_compound_tail_in_unlabelled627);
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:78:7: compound_tail
					{
					dbg.location(78,7);
					pushFollow(FOLLOW_compound_tail_in_unlabelled662);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					compound_tail34=compound_tail();
					state._fsp--;

					stream_compound_tail.add(compound_tail34.getTree());
					// AST REWRITE
					// elements: compound_tail
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 73:21: -> compound_tail
					{
						dbg.location(78,24);
						adaptor.addChild(root_0, stream_compound_tail.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(79, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unlabelled");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "unlabelled"


	public static class unlabelled_block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unlabelled_block"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:76:1: unlabelled_block : block_head compound_tail -> ^( UNLABELLED_BLOCK block_head compound_tail ) ;
	public final grammarA60Parserold.unlabelled_block_return unlabelled_block() throws RecognitionException {
		grammarA60Parserold.unlabelled_block_return retval = new grammarA60Parserold.unlabelled_block_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:81:1: unlabelled_block : block_head compound_tail -> ^( UNLABELLED_BLOCK block_head compound_tail ) ;
	public final grammarA60Parser.unlabelled_block_return unlabelled_block() throws RecognitionException {
		grammarA60Parser.unlabelled_block_return retval = new grammarA60Parser.unlabelled_block_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block_head35 =null;
		ParserRuleReturnScope compound_tail36 =null;

		RewriteRuleSubtreeStream stream_compound_tail=new RewriteRuleSubtreeStream(adaptor,"rule compound_tail");
		RewriteRuleSubtreeStream stream_block_head=new RewriteRuleSubtreeStream(adaptor,"rule block_head");

		try { dbg.enterRule(getGrammarFileName(), "unlabelled_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(81, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:76:17: ( block_head compound_tail -> ^( UNLABELLED_BLOCK block_head compound_tail ) )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:77:5: block_head compound_tail
			{
			pushFollow(FOLLOW_block_head_in_unlabelled_block643);
			block_head35=block_head();
			state._fsp--;

			stream_block_head.add(block_head35.getTree());
			pushFollow(FOLLOW_compound_tail_in_unlabelled_block645);
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:81:17: ( block_head compound_tail -> ^( UNLABELLED_BLOCK block_head compound_tail ) )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:82:5: block_head compound_tail
			{
			dbg.location(82,5);
			pushFollow(FOLLOW_block_head_in_unlabelled_block678);
			block_head35=block_head();
			state._fsp--;

			stream_block_head.add(block_head35.getTree());dbg.location(82,16);
			pushFollow(FOLLOW_compound_tail_in_unlabelled_block680);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			compound_tail36=compound_tail();
			state._fsp--;

			stream_compound_tail.add(compound_tail36.getTree());
			// AST REWRITE
			// elements: block_head, compound_tail
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 77:30: -> ^( UNLABELLED_BLOCK block_head compound_tail )
			{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:77:33: ^( UNLABELLED_BLOCK block_head compound_tail )
=======
				dbg.location(82,33);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:82:33: ^( UNLABELLED_BLOCK block_head compound_tail )
>>>>>>> Stashed changes:output/grammarA60Parser.java
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(82,35);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNLABELLED_BLOCK, "UNLABELLED_BLOCK"), root_1);
				dbg.location(82,52);
				adaptor.addChild(root_1, stream_block_head.nextTree());dbg.location(82,63);
				adaptor.addChild(root_1, stream_compound_tail.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(83, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unlabelled_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "unlabelled_block"


	public static class block_head_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block_head"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:80:1: block_head : ( declaration ';' )+ -> ( declaration )+ ;
	public final grammarA60Parserold.block_head_return block_head() throws RecognitionException {
		grammarA60Parserold.block_head_return retval = new grammarA60Parserold.block_head_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:85:1: block_head : ( declaration ';' )+ -> ( declaration )+ ;
	public final grammarA60Parser.block_head_return block_head() throws RecognitionException {
		grammarA60Parser.block_head_return retval = new grammarA60Parser.block_head_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal38=null;
		ParserRuleReturnScope declaration37 =null;

		Object char_literal38_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try { dbg.enterRule(getGrammarFileName(), "block_head");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(85, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:80:11: ( ( declaration ';' )+ -> ( declaration )+ )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:81:5: ( declaration ';' )+
			{
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:81:5: ( declaration ';' )+
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:85:11: ( ( declaration ';' )+ -> ( declaration )+ )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:86:5: ( declaration ';' )+
			{
			dbg.location(86,5);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:86:5: ( declaration ';' )+
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int cnt8=0;
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				int LA8_0 = input.LA(1);
				if ( (LA8_0==TYPE||LA8_0==63||(LA8_0 >= 76 && LA8_0 <= 77)||LA8_0==80) ) {
					alt8=1;
				}

				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:81:6: declaration ';'
					{
					pushFollow(FOLLOW_declaration_in_block_head668);
					declaration37=declaration();
					state._fsp--;

					stream_declaration.add(declaration37.getTree());
					char_literal38=(Token)match(input,47,FOLLOW_47_in_block_head670);  
					stream_47.add(char_literal38);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:86:6: declaration ';'
					{
					dbg.location(86,6);
					pushFollow(FOLLOW_declaration_in_block_head703);
					declaration37=declaration();
					state._fsp--;

					stream_declaration.add(declaration37.getTree());dbg.location(86,18);
					char_literal38=(Token)match(input,52,FOLLOW_52_in_block_head705);  
					stream_52.add(char_literal38);
>>>>>>> Stashed changes:output/grammarA60Parser.java

					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt8++;
			}
			} finally {dbg.exitSubRule(8);}

			// AST REWRITE
			// elements: declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 81:24: -> ( declaration )+
			{
				dbg.location(86,27);
				if ( !(stream_declaration.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_declaration.hasNext() ) {
					dbg.location(86,27);
					adaptor.addChild(root_0, stream_declaration.nextTree());
				}
				stream_declaration.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(87, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block_head");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "block_head"


	public static class compound_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "compound_tail"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:84:1: compound_tail : ( 'label:' )* statement ( ';' ( 'label:' )* statement )* 'end' -> ^( TAIL ( statement )+ ) ;
	public final grammarA60Parserold.compound_tail_return compound_tail() throws RecognitionException {
		grammarA60Parserold.compound_tail_return retval = new grammarA60Parserold.compound_tail_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:89:1: compound_tail : ( 'label:' )* statement ( ';' ( 'label:' )* statement )* 'end' -> ^( TAIL ( statement )+ ) ;
	public final grammarA60Parser.compound_tail_return compound_tail() throws RecognitionException {
		grammarA60Parser.compound_tail_return retval = new grammarA60Parser.compound_tail_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal39=null;
		Token char_literal41=null;
		Token string_literal42=null;
		Token string_literal44=null;
		ParserRuleReturnScope statement40 =null;
		ParserRuleReturnScope statement43 =null;

		Object string_literal39_tree=null;
		Object char_literal41_tree=null;
		Object string_literal42_tree=null;
		Object string_literal44_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try { dbg.enterRule(getGrammarFileName(), "compound_tail");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(89, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:84:14: ( ( 'label:' )* statement ( ';' ( 'label:' )* statement )* 'end' -> ^( TAIL ( statement )+ ) )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:85:5: ( 'label:' )* statement ( ';' ( 'label:' )* statement )* 'end'
			{
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:85:5: ( 'label:' )*
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:89:14: ( ( 'label:' )* statement ( ';' ( 'label:' )* statement )* 'end' -> ^( TAIL ( statement )+ ) )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:90:5: ( 'label:' )* statement ( ';' ( 'label:' )* statement )* 'end'
			{
			dbg.location(90,5);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:90:5: ( 'label:' )*
			try { dbg.enterSubRule(9);

>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( (LA9_0==74) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:85:6: 'label:'
					{
					string_literal39=(Token)match(input,74,FOLLOW_74_in_compound_tail690);  
					stream_74.add(string_literal39);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:90:6: 'label:'
					{
					dbg.location(90,6);
					string_literal39=(Token)match(input,79,FOLLOW_79_in_compound_tail725);  
					stream_79.add(string_literal39);
>>>>>>> Stashed changes:output/grammarA60Parser.java

					}
					break;

				default :
					break loop9;
				}
			}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

			pushFollow(FOLLOW_statement_in_compound_tail694);
			statement40=statement();
			state._fsp--;

			stream_statement.add(statement40.getTree());
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:85:27: ( ';' ( 'label:' )* statement )*
=======
			} finally {dbg.exitSubRule(9);}
			dbg.location(90,17);
			pushFollow(FOLLOW_statement_in_compound_tail729);
			statement40=statement();
			state._fsp--;

			stream_statement.add(statement40.getTree());dbg.location(90,27);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:90:27: ( ';' ( 'label:' )* statement )*
			try { dbg.enterSubRule(11);

>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==47) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:85:29: ';' ( 'label:' )* statement
					{
					char_literal41=(Token)match(input,47,FOLLOW_47_in_compound_tail698);  
					stream_47.add(char_literal41);

					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:85:33: ( 'label:' )*
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:90:29: ';' ( 'label:' )* statement
					{
					dbg.location(90,29);
					char_literal41=(Token)match(input,52,FOLLOW_52_in_compound_tail733);  
					stream_52.add(char_literal41);
					dbg.location(90,33);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:90:33: ( 'label:' )*
					try { dbg.enterSubRule(10);

>>>>>>> Stashed changes:output/grammarA60Parser.java
					loop10:
					while (true) {
						int alt10=2;
						try { dbg.enterDecision(10, decisionCanBacktrack[10]);

						int LA10_0 = input.LA(1);
						if ( (LA10_0==74) ) {
							alt10=1;
						}

						} finally {dbg.exitDecision(10);}

						switch (alt10) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:85:34: 'label:'
							{
							string_literal42=(Token)match(input,74,FOLLOW_74_in_compound_tail701);  
							stream_74.add(string_literal42);
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:90:34: 'label:'
							{
							dbg.location(90,34);
							string_literal42=(Token)match(input,79,FOLLOW_79_in_compound_tail736);  
							stream_79.add(string_literal42);
>>>>>>> Stashed changes:output/grammarA60Parser.java

							}
							break;

						default :
							break loop10;
						}
					}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

					pushFollow(FOLLOW_statement_in_compound_tail704);
=======
					} finally {dbg.exitSubRule(10);}
					dbg.location(90,44);
					pushFollow(FOLLOW_statement_in_compound_tail739);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					statement43=statement();
					state._fsp--;

					stream_statement.add(statement43.getTree());
					}
					break;

				default :
					break loop11;
				}
			}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

			string_literal44=(Token)match(input,67,FOLLOW_67_in_compound_tail708);  
			stream_67.add(string_literal44);
=======
			} finally {dbg.exitSubRule(11);}
			dbg.location(90,56);
			string_literal44=(Token)match(input,72,FOLLOW_72_in_compound_tail743);  
			stream_72.add(string_literal44);
>>>>>>> Stashed changes:output/grammarA60Parser.java

			// AST REWRITE
			// elements: statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 85:62: -> ^( TAIL ( statement )+ )
			{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:85:65: ^( TAIL ( statement )+ )
=======
				dbg.location(90,65);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:90:65: ^( TAIL ( statement )+ )
>>>>>>> Stashed changes:output/grammarA60Parser.java
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(90,67);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TAIL, "TAIL"), root_1);
				dbg.location(90,72);
				if ( !(stream_statement.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statement.hasNext() ) {
					dbg.location(90,72);
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(91, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "compound_tail");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "compound_tail"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:88:1: statement : ( program_bis -> program_bis | conditional_statement -> conditional_statement | unlabelled_basic_statement -> unlabelled_basic_statement | for_statement -> for_statement | ->);
	public final grammarA60Parserold.statement_return statement() throws RecognitionException {
		grammarA60Parserold.statement_return retval = new grammarA60Parserold.statement_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:93:1: statement : ( program_bis -> program_bis | conditional_statement -> conditional_statement | unlabelled_basic_statement -> unlabelled_basic_statement | for_statement -> for_statement | ->);
	public final grammarA60Parser.statement_return statement() throws RecognitionException {
		grammarA60Parser.statement_return retval = new grammarA60Parser.statement_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program_bis45 =null;
		ParserRuleReturnScope conditional_statement46 =null;
		ParserRuleReturnScope unlabelled_basic_statement47 =null;
		ParserRuleReturnScope for_statement48 =null;

		RewriteRuleSubtreeStream stream_program_bis=new RewriteRuleSubtreeStream(adaptor,"rule program_bis");
		RewriteRuleSubtreeStream stream_unlabelled_basic_statement=new RewriteRuleSubtreeStream(adaptor,"rule unlabelled_basic_statement");
		RewriteRuleSubtreeStream stream_for_statement=new RewriteRuleSubtreeStream(adaptor,"rule for_statement");
		RewriteRuleSubtreeStream stream_conditional_statement=new RewriteRuleSubtreeStream(adaptor,"rule conditional_statement");

		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(93, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:88:10: ( program_bis -> program_bis | conditional_statement -> conditional_statement | unlabelled_basic_statement -> unlabelled_basic_statement | for_statement -> for_statement | ->)
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:93:10: ( program_bis -> program_bis | conditional_statement -> conditional_statement | unlabelled_basic_statement -> unlabelled_basic_statement | for_statement -> for_statement | ->)
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt12=5;
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			switch ( input.LA(1) ) {
			case 64:
				{
				alt12=1;
				}
				break;
			case 71:
				{
				alt12=2;
				}
				break;
			case IDENTIFIER:
			case 69:
			case 70:
			case 72:
				{
				alt12=3;
				}
				break;
			case 68:
				{
				alt12=4;
				}
				break;
			case 47:
			case 66:
			case 67:
				{
				alt12=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:89:5: program_bis
					{
					pushFollow(FOLLOW_program_bis_in_statement729);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:94:5: program_bis
					{
					dbg.location(94,5);
					pushFollow(FOLLOW_program_bis_in_statement764);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					program_bis45=program_bis();
					state._fsp--;

					stream_program_bis.add(program_bis45.getTree());
					// AST REWRITE
					// elements: program_bis
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 89:17: -> program_bis
					{
						dbg.location(94,20);
						adaptor.addChild(root_0, stream_program_bis.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:90:7: conditional_statement
					{
					pushFollow(FOLLOW_conditional_statement_in_statement741);
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:95:7: conditional_statement
					{
					dbg.location(95,7);
					pushFollow(FOLLOW_conditional_statement_in_statement776);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					conditional_statement46=conditional_statement();
					state._fsp--;

					stream_conditional_statement.add(conditional_statement46.getTree());
					// AST REWRITE
					// elements: conditional_statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 90:29: -> conditional_statement
					{
						dbg.location(95,32);
						adaptor.addChild(root_0, stream_conditional_statement.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:91:11: unlabelled_basic_statement
					{
					pushFollow(FOLLOW_unlabelled_basic_statement_in_statement757);
=======
					dbg.enterAlt(3);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:96:11: unlabelled_basic_statement
					{
					dbg.location(96,11);
					pushFollow(FOLLOW_unlabelled_basic_statement_in_statement792);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					unlabelled_basic_statement47=unlabelled_basic_statement();
					state._fsp--;

					stream_unlabelled_basic_statement.add(unlabelled_basic_statement47.getTree());
					// AST REWRITE
					// elements: unlabelled_basic_statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 91:38: -> unlabelled_basic_statement
					{
						dbg.location(96,41);
						adaptor.addChild(root_0, stream_unlabelled_basic_statement.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:92:11: for_statement
					{
					pushFollow(FOLLOW_for_statement_in_statement773);
=======
					dbg.enterAlt(4);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:97:11: for_statement
					{
					dbg.location(97,11);
					pushFollow(FOLLOW_for_statement_in_statement808);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					for_statement48=for_statement();
					state._fsp--;

					stream_for_statement.add(for_statement48.getTree());
					// AST REWRITE
					// elements: for_statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 92:25: -> for_statement
					{
						dbg.location(97,28);
						adaptor.addChild(root_0, stream_for_statement.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:93:11: 
=======
					dbg.enterAlt(5);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:98:11: 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 93:11: ->
					{
						dbg.location(99,0);
						root_0 = null;
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(99, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "statement"


	public static class statement_bis_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement_bis"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:96:1: statement_bis : ( specifier identifier_list ';' ( specifier identifier_list ';' )* after_statement_bis -> ^( STATEMENT_BIS ( specifier identifier_list )+ after_statement_bis ) | after_statement_bis -> ^( STATEMENT_BIS after_statement_bis ) );
	public final grammarA60Parserold.statement_bis_return statement_bis() throws RecognitionException {
		grammarA60Parserold.statement_bis_return retval = new grammarA60Parserold.statement_bis_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:101:1: statement_bis : ( specifier identifier_list ';' ( specifier identifier_list ';' )* after_statement_bis -> ^( STATEMENT_BIS ( ^( DEFINITION specifier identifier_list ) )+ after_statement_bis ) | after_statement_bis -> ^( STATEMENT_BIS after_statement_bis ) );
	public final grammarA60Parser.statement_bis_return statement_bis() throws RecognitionException {
		grammarA60Parser.statement_bis_return retval = new grammarA60Parser.statement_bis_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal51=null;
		Token char_literal54=null;
		ParserRuleReturnScope specifier49 =null;
		ParserRuleReturnScope identifier_list50 =null;
		ParserRuleReturnScope specifier52 =null;
		ParserRuleReturnScope identifier_list53 =null;
		ParserRuleReturnScope after_statement_bis55 =null;
		ParserRuleReturnScope after_statement_bis56 =null;

		Object char_literal51_tree=null;
		Object char_literal54_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleSubtreeStream stream_specifier=new RewriteRuleSubtreeStream(adaptor,"rule specifier");
		RewriteRuleSubtreeStream stream_after_statement_bis=new RewriteRuleSubtreeStream(adaptor,"rule after_statement_bis");
		RewriteRuleSubtreeStream stream_identifier_list=new RewriteRuleSubtreeStream(adaptor,"rule identifier_list");

		try { dbg.enterRule(getGrammarFileName(), "statement_bis");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(101, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:96:14: ( specifier identifier_list ';' ( specifier identifier_list ';' )* after_statement_bis -> ^( STATEMENT_BIS ( specifier identifier_list )+ after_statement_bis ) | after_statement_bis -> ^( STATEMENT_BIS after_statement_bis ) )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:101:14: ( specifier identifier_list ';' ( specifier identifier_list ';' )* after_statement_bis -> ^( STATEMENT_BIS ( ^( DEFINITION specifier identifier_list ) )+ after_statement_bis ) | after_statement_bis -> ^( STATEMENT_BIS after_statement_bis ) )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt14=2;
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==TYPE||LA14_0==63||LA14_0==77||(LA14_0 >= 79 && LA14_0 <= 80)) ) {
				alt14=1;
			}
			else if ( (LA14_0==64||LA14_0==68||LA14_0==71||LA14_0==73) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:97:5: specifier identifier_list ';' ( specifier identifier_list ';' )* after_statement_bis
					{
					pushFollow(FOLLOW_specifier_in_statement_bis801);
					specifier49=specifier();
					state._fsp--;

					stream_specifier.add(specifier49.getTree());
					pushFollow(FOLLOW_identifier_list_in_statement_bis803);
					identifier_list50=identifier_list();
					state._fsp--;

					stream_identifier_list.add(identifier_list50.getTree());
					char_literal51=(Token)match(input,47,FOLLOW_47_in_statement_bis805);  
					stream_47.add(char_literal51);

					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:97:35: ( specifier identifier_list ';' )*
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:102:5: specifier identifier_list ';' ( specifier identifier_list ';' )* after_statement_bis
					{
					dbg.location(102,5);
					pushFollow(FOLLOW_specifier_in_statement_bis836);
					specifier49=specifier();
					state._fsp--;

					stream_specifier.add(specifier49.getTree());dbg.location(102,15);
					pushFollow(FOLLOW_identifier_list_in_statement_bis838);
					identifier_list50=identifier_list();
					state._fsp--;

					stream_identifier_list.add(identifier_list50.getTree());dbg.location(102,31);
					char_literal51=(Token)match(input,52,FOLLOW_52_in_statement_bis840);  
					stream_52.add(char_literal51);
					dbg.location(102,35);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:102:35: ( specifier identifier_list ';' )*
					try { dbg.enterSubRule(13);

>>>>>>> Stashed changes:output/grammarA60Parser.java
					loop13:
					while (true) {
						int alt13=2;
						try { dbg.enterDecision(13, decisionCanBacktrack[13]);

						int LA13_0 = input.LA(1);
						if ( (LA13_0==TYPE||LA13_0==63||LA13_0==77||(LA13_0 >= 79 && LA13_0 <= 80)) ) {
							alt13=1;
						}

						} finally {dbg.exitDecision(13);}

						switch (alt13) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:97:36: specifier identifier_list ';'
							{
							pushFollow(FOLLOW_specifier_in_statement_bis808);
							specifier52=specifier();
							state._fsp--;

							stream_specifier.add(specifier52.getTree());
							pushFollow(FOLLOW_identifier_list_in_statement_bis810);
							identifier_list53=identifier_list();
							state._fsp--;

							stream_identifier_list.add(identifier_list53.getTree());
							char_literal54=(Token)match(input,47,FOLLOW_47_in_statement_bis812);  
							stream_47.add(char_literal54);
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:102:36: specifier identifier_list ';'
							{
							dbg.location(102,36);
							pushFollow(FOLLOW_specifier_in_statement_bis843);
							specifier52=specifier();
							state._fsp--;

							stream_specifier.add(specifier52.getTree());dbg.location(102,46);
							pushFollow(FOLLOW_identifier_list_in_statement_bis845);
							identifier_list53=identifier_list();
							state._fsp--;

							stream_identifier_list.add(identifier_list53.getTree());dbg.location(102,62);
							char_literal54=(Token)match(input,52,FOLLOW_52_in_statement_bis847);  
							stream_52.add(char_literal54);
>>>>>>> Stashed changes:output/grammarA60Parser.java

							}
							break;

						default :
							break loop13;
						}
					}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

					pushFollow(FOLLOW_after_statement_bis_in_statement_bis816);
=======
					} finally {dbg.exitSubRule(13);}
					dbg.location(102,68);
					pushFollow(FOLLOW_after_statement_bis_in_statement_bis851);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					after_statement_bis55=after_statement_bis();
					state._fsp--;

					stream_after_statement_bis.add(after_statement_bis55.getTree());
					// AST REWRITE
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// elements: identifier_list, after_statement_bis, specifier
=======
					// elements: specifier, identifier_list, after_statement_bis
>>>>>>> Stashed changes:output/grammarA60Parser.java
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 97:88: -> ^( STATEMENT_BIS ( specifier identifier_list )+ after_statement_bis )
					{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
						// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:97:91: ^( STATEMENT_BIS ( specifier identifier_list )+ after_statement_bis )
=======
						dbg.location(102,91);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:102:91: ^( STATEMENT_BIS ( ^( DEFINITION specifier identifier_list ) )+ after_statement_bis )
>>>>>>> Stashed changes:output/grammarA60Parser.java
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(102,93);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENT_BIS, "STATEMENT_BIS"), root_1);
						dbg.location(102,107);
						if ( !(stream_specifier.hasNext()||stream_identifier_list.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
<<<<<<< Updated upstream:output/grammarA60Parserold.java
						while ( stream_identifier_list.hasNext()||stream_specifier.hasNext() ) {
							adaptor.addChild(root_1, stream_specifier.nextTree());
							adaptor.addChild(root_1, stream_identifier_list.nextTree());
=======
						while ( stream_specifier.hasNext()||stream_identifier_list.hasNext() ) {
							dbg.location(102,107);
							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:102:107: ^( DEFINITION specifier identifier_list )
							{
							Object root_2 = (Object)adaptor.nil();
							dbg.location(102,109);
							root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_2);
							dbg.location(102,120);
							adaptor.addChild(root_2, stream_specifier.nextTree());dbg.location(102,130);
							adaptor.addChild(root_2, stream_identifier_list.nextTree());
							adaptor.addChild(root_1, root_2);
							}

>>>>>>> Stashed changes:output/grammarA60Parser.java
						}
						stream_specifier.reset();
						stream_identifier_list.reset();
						dbg.location(102,148);
						adaptor.addChild(root_1, stream_after_statement_bis.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:98:7: after_statement_bis
					{
					pushFollow(FOLLOW_after_statement_bis_in_statement_bis839);
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:103:7: after_statement_bis
					{
					dbg.location(103,7);
					pushFollow(FOLLOW_after_statement_bis_in_statement_bis876);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					after_statement_bis56=after_statement_bis();
					state._fsp--;

					stream_after_statement_bis.add(after_statement_bis56.getTree());
					// AST REWRITE
					// elements: after_statement_bis
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 98:27: -> ^( STATEMENT_BIS after_statement_bis )
					{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
						// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:98:30: ^( STATEMENT_BIS after_statement_bis )
=======
						dbg.location(103,30);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:103:30: ^( STATEMENT_BIS after_statement_bis )
>>>>>>> Stashed changes:output/grammarA60Parser.java
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(103,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENT_BIS, "STATEMENT_BIS"), root_1);
						dbg.location(103,46);
						adaptor.addChild(root_1, stream_after_statement_bis.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(104, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement_bis");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "statement_bis"


	public static class after_statement_bis_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "after_statement_bis"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:101:1: after_statement_bis : ( program_ter -> program_ter | for_statement | conditional_statement );
	public final grammarA60Parserold.after_statement_bis_return after_statement_bis() throws RecognitionException {
		grammarA60Parserold.after_statement_bis_return retval = new grammarA60Parserold.after_statement_bis_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:106:1: after_statement_bis : ( program_ter -> program_ter | for_statement | conditional_statement );
	public final grammarA60Parser.after_statement_bis_return after_statement_bis() throws RecognitionException {
		grammarA60Parser.after_statement_bis_return retval = new grammarA60Parser.after_statement_bis_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program_ter57 =null;
		ParserRuleReturnScope for_statement58 =null;
		ParserRuleReturnScope conditional_statement59 =null;

		RewriteRuleSubtreeStream stream_program_ter=new RewriteRuleSubtreeStream(adaptor,"rule program_ter");

		try { dbg.enterRule(getGrammarFileName(), "after_statement_bis");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:101:20: ( program_ter -> program_ter | for_statement | conditional_statement )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:106:20: ( program_ter -> program_ter | for_statement | conditional_statement )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt15=3;
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			switch ( input.LA(1) ) {
			case 64:
			case 73:
				{
				alt15=1;
				}
				break;
			case 68:
				{
				alt15=2;
				}
				break;
			case 71:
				{
				alt15=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:102:5: program_ter
					{
					pushFollow(FOLLOW_program_ter_in_after_statement_bis859);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:107:5: program_ter
					{
					dbg.location(107,5);
					pushFollow(FOLLOW_program_ter_in_after_statement_bis896);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					program_ter57=program_ter();
					state._fsp--;

					stream_program_ter.add(program_ter57.getTree());
					// AST REWRITE
					// elements: program_ter
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 102:17: -> program_ter
					{
						dbg.location(107,20);
						adaptor.addChild(root_0, stream_program_ter.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:103:7: for_statement
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:108:7: for_statement
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					pushFollow(FOLLOW_for_statement_in_after_statement_bis871);
=======
					dbg.location(108,7);
					pushFollow(FOLLOW_for_statement_in_after_statement_bis908);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					for_statement58=for_statement();
					state._fsp--;

					adaptor.addChild(root_0, for_statement58.getTree());

					}
					break;
				case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:104:7: conditional_statement
=======
					dbg.enterAlt(3);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:109:7: conditional_statement
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					pushFollow(FOLLOW_conditional_statement_in_after_statement_bis879);
=======
					dbg.location(109,7);
					pushFollow(FOLLOW_conditional_statement_in_after_statement_bis916);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					conditional_statement59=conditional_statement();
					state._fsp--;

					adaptor.addChild(root_0, conditional_statement59.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(110, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "after_statement_bis");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "after_statement_bis"


	public static class for_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_statement"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:107:1: for_statement : for_clause statement -> ^( FOR_STATEMENT for_clause statement ) ;
	public final grammarA60Parserold.for_statement_return for_statement() throws RecognitionException {
		grammarA60Parserold.for_statement_return retval = new grammarA60Parserold.for_statement_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:112:1: for_statement : for_clause statement -> ^( FOR_STATEMENT for_clause statement ) ;
	public final grammarA60Parser.for_statement_return for_statement() throws RecognitionException {
		grammarA60Parser.for_statement_return retval = new grammarA60Parser.for_statement_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope for_clause60 =null;
		ParserRuleReturnScope statement61 =null;

		RewriteRuleSubtreeStream stream_for_clause=new RewriteRuleSubtreeStream(adaptor,"rule for_clause");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try { dbg.enterRule(getGrammarFileName(), "for_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(112, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:107:14: ( for_clause statement -> ^( FOR_STATEMENT for_clause statement ) )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:108:5: for_clause statement
			{
			pushFollow(FOLLOW_for_clause_in_for_statement891);
			for_clause60=for_clause();
			state._fsp--;

			stream_for_clause.add(for_clause60.getTree());
			pushFollow(FOLLOW_statement_in_for_statement893);
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:112:14: ( for_clause statement -> ^( FOR_STATEMENT for_clause statement ) )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:113:5: for_clause statement
			{
			dbg.location(113,5);
			pushFollow(FOLLOW_for_clause_in_for_statement928);
			for_clause60=for_clause();
			state._fsp--;

			stream_for_clause.add(for_clause60.getTree());dbg.location(113,16);
			pushFollow(FOLLOW_statement_in_for_statement930);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			statement61=statement();
			state._fsp--;

			stream_statement.add(statement61.getTree());
			// AST REWRITE
			// elements: statement, for_clause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 108:26: -> ^( FOR_STATEMENT for_clause statement )
			{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:108:29: ^( FOR_STATEMENT for_clause statement )
=======
				dbg.location(113,29);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:113:29: ^( FOR_STATEMENT for_clause statement )
>>>>>>> Stashed changes:output/grammarA60Parser.java
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(113,31);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_STATEMENT, "FOR_STATEMENT"), root_1);
				dbg.location(113,45);
				adaptor.addChild(root_1, stream_for_clause.nextTree());dbg.location(113,56);
				adaptor.addChild(root_1, stream_statement.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(114, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "for_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "for_statement"


	public static class for_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_clause"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:111:1: for_clause : 'for' IDENTIFIER ':=' for_list_element for_list 'do' -> ^( FOR_CONDITION IDENTIFIER for_list_element for_list ) ;
	public final grammarA60Parserold.for_clause_return for_clause() throws RecognitionException {
		grammarA60Parserold.for_clause_return retval = new grammarA60Parserold.for_clause_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:116:1: for_clause : 'for' IDENTIFIER ':=' for_list_element for_list 'do' -> ^( FOR_CONDITION IDENTIFIER for_list_element for_list ) ;
	public final grammarA60Parser.for_clause_return for_clause() throws RecognitionException {
		grammarA60Parser.for_clause_return retval = new grammarA60Parser.for_clause_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal62=null;
		Token IDENTIFIER63=null;
		Token string_literal64=null;
		Token string_literal67=null;
		ParserRuleReturnScope for_list_element65 =null;
		ParserRuleReturnScope for_list66 =null;

		Object string_literal62_tree=null;
		Object IDENTIFIER63_tree=null;
		Object string_literal64_tree=null;
		Object string_literal67_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_for_list=new RewriteRuleSubtreeStream(adaptor,"rule for_list");
		RewriteRuleSubtreeStream stream_for_list_element=new RewriteRuleSubtreeStream(adaptor,"rule for_list_element");

		try { dbg.enterRule(getGrammarFileName(), "for_clause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(116, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:111:11: ( 'for' IDENTIFIER ':=' for_list_element for_list 'do' -> ^( FOR_CONDITION IDENTIFIER for_list_element for_list ) )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:112:5: 'for' IDENTIFIER ':=' for_list_element for_list 'do'
			{
			string_literal62=(Token)match(input,68,FOLLOW_68_in_for_clause915);  
			stream_68.add(string_literal62);

			IDENTIFIER63=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_for_clause917);  
			stream_IDENTIFIER.add(IDENTIFIER63);

			string_literal64=(Token)match(input,46,FOLLOW_46_in_for_clause919);  
			stream_46.add(string_literal64);

			pushFollow(FOLLOW_for_list_element_in_for_clause921);
			for_list_element65=for_list_element();
			state._fsp--;

			stream_for_list_element.add(for_list_element65.getTree());
			pushFollow(FOLLOW_for_list_in_for_clause923);
			for_list66=for_list();
			state._fsp--;

			stream_for_list.add(for_list66.getTree());
			string_literal67=(Token)match(input,65,FOLLOW_65_in_for_clause925);  
			stream_65.add(string_literal67);
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:116:11: ( 'for' IDENTIFIER ':=' for_list_element for_list 'do' -> ^( FOR_CONDITION IDENTIFIER for_list_element for_list ) )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:117:5: 'for' IDENTIFIER ':=' for_list_element for_list 'do'
			{
			dbg.location(117,5);
			string_literal62=(Token)match(input,73,FOLLOW_73_in_for_clause952);  
			stream_73.add(string_literal62);
			dbg.location(117,11);
			IDENTIFIER63=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_for_clause954);  
			stream_IDENTIFIER.add(IDENTIFIER63);
			dbg.location(117,22);
			string_literal64=(Token)match(input,51,FOLLOW_51_in_for_clause956);  
			stream_51.add(string_literal64);
			dbg.location(117,27);
			pushFollow(FOLLOW_for_list_element_in_for_clause958);
			for_list_element65=for_list_element();
			state._fsp--;

			stream_for_list_element.add(for_list_element65.getTree());dbg.location(117,44);
			pushFollow(FOLLOW_for_list_in_for_clause960);
			for_list66=for_list();
			state._fsp--;

			stream_for_list.add(for_list66.getTree());dbg.location(117,53);
			string_literal67=(Token)match(input,70,FOLLOW_70_in_for_clause962);  
			stream_70.add(string_literal67);
>>>>>>> Stashed changes:output/grammarA60Parser.java

			// AST REWRITE
			// elements: for_list, IDENTIFIER, for_list_element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 112:58: -> ^( FOR_CONDITION IDENTIFIER for_list_element for_list )
			{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:112:61: ^( FOR_CONDITION IDENTIFIER for_list_element for_list )
=======
				dbg.location(117,61);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:117:61: ^( FOR_CONDITION IDENTIFIER for_list_element for_list )
>>>>>>> Stashed changes:output/grammarA60Parser.java
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(117,63);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_CONDITION, "FOR_CONDITION"), root_1);
				dbg.location(117,77);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());dbg.location(117,88);
				adaptor.addChild(root_1, stream_for_list_element.nextTree());dbg.location(117,105);
				adaptor.addChild(root_1, stream_for_list.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(118, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "for_clause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "for_clause"


	public static class for_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_list"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:115:1: for_list : ( ',' for_list_element )* -> ^( FOR_LIST ( for_list_element )* ) ;
	public final grammarA60Parserold.for_list_return for_list() throws RecognitionException {
		grammarA60Parserold.for_list_return retval = new grammarA60Parserold.for_list_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:120:1: for_list : ( ',' for_list_element )* -> ^( FOR_LIST ( for_list_element )* ) ;
	public final grammarA60Parser.for_list_return for_list() throws RecognitionException {
		grammarA60Parser.for_list_return retval = new grammarA60Parser.for_list_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal68=null;
		ParserRuleReturnScope for_list_element69 =null;

		Object char_literal68_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_for_list_element=new RewriteRuleSubtreeStream(adaptor,"rule for_list_element");

		try { dbg.enterRule(getGrammarFileName(), "for_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(120, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:115:9: ( ( ',' for_list_element )* -> ^( FOR_LIST ( for_list_element )* ) )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:116:5: ( ',' for_list_element )*
			{
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:116:5: ( ',' for_list_element )*
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:120:9: ( ( ',' for_list_element )* -> ^( FOR_LIST ( for_list_element )* ) )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:121:5: ( ',' for_list_element )*
			{
			dbg.location(121,5);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:121:5: ( ',' for_list_element )*
			try { dbg.enterSubRule(16);

>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop16:
			while (true) {
				int alt16=2;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				int LA16_0 = input.LA(1);
				if ( (LA16_0==42) ) {
					alt16=1;
				}

				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:116:6: ',' for_list_element
					{
					char_literal68=(Token)match(input,42,FOLLOW_42_in_for_list950);  
					stream_42.add(char_literal68);

					pushFollow(FOLLOW_for_list_element_in_for_list952);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:121:6: ',' for_list_element
					{
					dbg.location(121,6);
					char_literal68=(Token)match(input,47,FOLLOW_47_in_for_list987);  
					stream_47.add(char_literal68);
					dbg.location(121,10);
					pushFollow(FOLLOW_for_list_element_in_for_list989);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					for_list_element69=for_list_element();
					state._fsp--;

					stream_for_list_element.add(for_list_element69.getTree());
					}
					break;

				default :
					break loop16;
				}
			}
			} finally {dbg.exitSubRule(16);}

			// AST REWRITE
			// elements: for_list_element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 116:29: -> ^( FOR_LIST ( for_list_element )* )
			{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:116:32: ^( FOR_LIST ( for_list_element )* )
=======
				dbg.location(121,32);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:121:32: ^( FOR_LIST ( for_list_element )* )
>>>>>>> Stashed changes:output/grammarA60Parser.java
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(121,34);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_LIST, "FOR_LIST"), root_1);
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:116:43: ( for_list_element )*
=======
				dbg.location(121,43);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:121:43: ( for_list_element )*
>>>>>>> Stashed changes:output/grammarA60Parser.java
				while ( stream_for_list_element.hasNext() ) {
					dbg.location(121,43);
					adaptor.addChild(root_1, stream_for_list_element.nextTree());
				}
				stream_for_list_element.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(123, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "for_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "for_list"


	public static class for_list_element_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_list_element"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:120:1: for_list_element : boolean_expr ( 'step' exp1= expression 'until' exp2= expression -> ^( FOR_LIST_ELEM boolean_expr $exp1 $exp2) | 'while' expression -> ^( FOR_LIST_ELEM boolean_expr expression ) ) ;
	public final grammarA60Parserold.for_list_element_return for_list_element() throws RecognitionException {
		grammarA60Parserold.for_list_element_return retval = new grammarA60Parserold.for_list_element_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:125:1: for_list_element : boolean_expr ( 'step' exp1= expression 'until' exp2= expression -> ^( FOR_LIST_ELEM boolean_expr ^( STEP $exp1) ^( UNTIL $exp2) ) | 'while' expression -> ^( FOR_LIST_ELEM boolean_expr expression ) ) ;
	public final grammarA60Parser.for_list_element_return for_list_element() throws RecognitionException {
		grammarA60Parser.for_list_element_return retval = new grammarA60Parser.for_list_element_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal71=null;
		Token string_literal72=null;
		Token string_literal73=null;
		ParserRuleReturnScope exp1 =null;
		ParserRuleReturnScope exp2 =null;
		ParserRuleReturnScope boolean_expr70 =null;
		ParserRuleReturnScope expression74 =null;

		Object string_literal71_tree=null;
		Object string_literal72_tree=null;
		Object string_literal73_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_boolean_expr=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expr");

		try { dbg.enterRule(getGrammarFileName(), "for_list_element");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(125, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:120:17: ( boolean_expr ( 'step' exp1= expression 'until' exp2= expression -> ^( FOR_LIST_ELEM boolean_expr $exp1 $exp2) | 'while' expression -> ^( FOR_LIST_ELEM boolean_expr expression ) ) )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:121:5: boolean_expr ( 'step' exp1= expression 'until' exp2= expression -> ^( FOR_LIST_ELEM boolean_expr $exp1 $exp2) | 'while' expression -> ^( FOR_LIST_ELEM boolean_expr expression ) )
			{
			pushFollow(FOLLOW_boolean_expr_in_for_list_element977);
			boolean_expr70=boolean_expr();
			state._fsp--;

			stream_boolean_expr.add(boolean_expr70.getTree());
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:122:6: ( 'step' exp1= expression 'until' exp2= expression -> ^( FOR_LIST_ELEM boolean_expr $exp1 $exp2) | 'while' expression -> ^( FOR_LIST_ELEM boolean_expr expression ) )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:125:17: ( boolean_expr ( 'step' exp1= expression 'until' exp2= expression -> ^( FOR_LIST_ELEM boolean_expr ^( STEP $exp1) ^( UNTIL $exp2) ) | 'while' expression -> ^( FOR_LIST_ELEM boolean_expr expression ) ) )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:126:5: boolean_expr ( 'step' exp1= expression 'until' exp2= expression -> ^( FOR_LIST_ELEM boolean_expr ^( STEP $exp1) ^( UNTIL $exp2) ) | 'while' expression -> ^( FOR_LIST_ELEM boolean_expr expression ) )
			{
			dbg.location(126,5);
			pushFollow(FOLLOW_boolean_expr_in_for_list_element1014);
			boolean_expr70=boolean_expr();
			state._fsp--;

			stream_boolean_expr.add(boolean_expr70.getTree());dbg.location(127,6);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:127:6: ( 'step' exp1= expression 'until' exp2= expression -> ^( FOR_LIST_ELEM boolean_expr ^( STEP $exp1) ^( UNTIL $exp2) ) | 'while' expression -> ^( FOR_LIST_ELEM boolean_expr expression ) )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==78) ) {
				alt17=1;
			}
			else if ( (LA17_0==84) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:123:6: 'step' exp1= expression 'until' exp2= expression
					{
					string_literal71=(Token)match(input,78,FOLLOW_78_in_for_list_element991);  
					stream_78.add(string_literal71);

					pushFollow(FOLLOW_expression_in_for_list_element995);
					exp1=expression();
					state._fsp--;

					stream_expression.add(exp1.getTree());
					string_literal72=(Token)match(input,82,FOLLOW_82_in_for_list_element997);  
					stream_82.add(string_literal72);

					pushFollow(FOLLOW_expression_in_for_list_element1001);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:128:6: 'step' exp1= expression 'until' exp2= expression
					{
					dbg.location(128,6);
					string_literal71=(Token)match(input,83,FOLLOW_83_in_for_list_element1028);  
					stream_83.add(string_literal71);
					dbg.location(128,17);
					pushFollow(FOLLOW_expression_in_for_list_element1032);
					exp1=expression();
					state._fsp--;

					stream_expression.add(exp1.getTree());dbg.location(128,29);
					string_literal72=(Token)match(input,87,FOLLOW_87_in_for_list_element1034);  
					stream_87.add(string_literal72);
					dbg.location(128,41);
					pushFollow(FOLLOW_expression_in_for_list_element1038);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					exp2=expression();
					state._fsp--;

					stream_expression.add(exp2.getTree());
					// AST REWRITE
					// elements: boolean_expr, exp2, exp1
					// token labels: 
					// rule labels: exp2, exp1, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_exp2=new RewriteRuleSubtreeStream(adaptor,"rule exp2",exp2!=null?exp2.getTree():null);
					RewriteRuleSubtreeStream stream_exp1=new RewriteRuleSubtreeStream(adaptor,"rule exp1",exp1!=null?exp1.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 123:53: -> ^( FOR_LIST_ELEM boolean_expr $exp1 $exp2)
					{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
						// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:123:56: ^( FOR_LIST_ELEM boolean_expr $exp1 $exp2)
=======
						dbg.location(128,56);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:128:56: ^( FOR_LIST_ELEM boolean_expr ^( STEP $exp1) ^( UNTIL $exp2) )
>>>>>>> Stashed changes:output/grammarA60Parser.java
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(128,58);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_LIST_ELEM, "FOR_LIST_ELEM"), root_1);
<<<<<<< Updated upstream:output/grammarA60Parserold.java
						adaptor.addChild(root_1, stream_boolean_expr.nextTree());
						adaptor.addChild(root_1, stream_exp1.nextTree());
						adaptor.addChild(root_1, stream_exp2.nextTree());
=======
						dbg.location(128,72);
						adaptor.addChild(root_1, stream_boolean_expr.nextTree());dbg.location(128,85);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:128:85: ^( STEP $exp1)
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(128,87);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STEP, "STEP"), root_2);
						dbg.location(128,93);
						adaptor.addChild(root_2, stream_exp1.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(128,99);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:128:99: ^( UNTIL $exp2)
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(128,101);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNTIL, "UNTIL"), root_2);
						dbg.location(128,108);
						adaptor.addChild(root_2, stream_exp2.nextTree());
						adaptor.addChild(root_1, root_2);
						}

>>>>>>> Stashed changes:output/grammarA60Parser.java
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:124:8: 'while' expression
					{
					string_literal73=(Token)match(input,84,FOLLOW_84_in_for_list_element1024);  
					stream_84.add(string_literal73);

					pushFollow(FOLLOW_expression_in_for_list_element1026);
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:129:8: 'while' expression
					{
					dbg.location(129,8);
					string_literal73=(Token)match(input,89,FOLLOW_89_in_for_list_element1069);  
					stream_89.add(string_literal73);
					dbg.location(129,16);
					pushFollow(FOLLOW_expression_in_for_list_element1071);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					expression74=expression();
					state._fsp--;

					stream_expression.add(expression74.getTree());
					// AST REWRITE
					// elements: expression, boolean_expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 124:27: -> ^( FOR_LIST_ELEM boolean_expr expression )
					{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
						// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:124:30: ^( FOR_LIST_ELEM boolean_expr expression )
=======
						dbg.location(129,30);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:129:30: ^( FOR_LIST_ELEM boolean_expr expression )
>>>>>>> Stashed changes:output/grammarA60Parser.java
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(129,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_LIST_ELEM, "FOR_LIST_ELEM"), root_1);
						dbg.location(129,46);
						adaptor.addChild(root_1, stream_boolean_expr.nextTree());dbg.location(129,59);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(17);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(132, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "for_list_element");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "for_list_element"


	public static class conditional_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditional_statement"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:129:1: conditional_statement : if_clause stat1= statement ( options {greedy=true; } : 'else' stat2= statement ) -> ^( IF_STATEMENT ^( CONDITION if_clause ) ^( ALORS $stat1) ( ^( SINON $stat2) )? ) ;
	public final grammarA60Parserold.conditional_statement_return conditional_statement() throws RecognitionException {
		grammarA60Parserold.conditional_statement_return retval = new grammarA60Parserold.conditional_statement_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:134:1: conditional_statement : if_clause stat1= statement ( options {greedy=true; } : 'else' stat2= statement ) -> ^( IF_STATEMENT ^( CONDITION if_clause ) ^( ALORS $stat1) ( ^( SINON $stat2) )? ) ;
	public final grammarA60Parser.conditional_statement_return conditional_statement() throws RecognitionException {
		grammarA60Parser.conditional_statement_return retval = new grammarA60Parser.conditional_statement_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal76=null;
		ParserRuleReturnScope stat1 =null;
		ParserRuleReturnScope stat2 =null;
		ParserRuleReturnScope if_clause75 =null;

		Object string_literal76_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_if_clause=new RewriteRuleSubtreeStream(adaptor,"rule if_clause");

		try { dbg.enterRule(getGrammarFileName(), "conditional_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(134, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:129:22: ( if_clause stat1= statement ( options {greedy=true; } : 'else' stat2= statement ) -> ^( IF_STATEMENT ^( CONDITION if_clause ) ^( ALORS $stat1) ( ^( SINON $stat2) )? ) )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:130:5: if_clause stat1= statement ( options {greedy=true; } : 'else' stat2= statement )
			{
			pushFollow(FOLLOW_if_clause_in_conditional_statement1061);
			if_clause75=if_clause();
			state._fsp--;

			stream_if_clause.add(if_clause75.getTree());
			pushFollow(FOLLOW_statement_in_conditional_statement1065);
			stat1=statement();
			state._fsp--;

			stream_statement.add(stat1.getTree());
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:130:31: ( options {greedy=true; } : 'else' stat2= statement )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:130:55: 'else' stat2= statement
			{
			string_literal76=(Token)match(input,66,FOLLOW_66_in_conditional_statement1076);  
			stream_66.add(string_literal76);

			pushFollow(FOLLOW_statement_in_conditional_statement1080);
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:134:22: ( if_clause stat1= statement ( options {greedy=true; } : 'else' stat2= statement ) -> ^( IF_STATEMENT ^( CONDITION if_clause ) ^( ALORS $stat1) ( ^( SINON $stat2) )? ) )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:135:5: if_clause stat1= statement ( options {greedy=true; } : 'else' stat2= statement )
			{
			dbg.location(135,5);
			pushFollow(FOLLOW_if_clause_in_conditional_statement1106);
			if_clause75=if_clause();
			state._fsp--;

			stream_if_clause.add(if_clause75.getTree());dbg.location(135,20);
			pushFollow(FOLLOW_statement_in_conditional_statement1110);
			stat1=statement();
			state._fsp--;

			stream_statement.add(stat1.getTree());dbg.location(135,31);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:135:31: ( options {greedy=true; } : 'else' stat2= statement )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:135:55: 'else' stat2= statement
			{
			dbg.location(135,55);
			string_literal76=(Token)match(input,71,FOLLOW_71_in_conditional_statement1121);  
			stream_71.add(string_literal76);
			dbg.location(135,67);
			pushFollow(FOLLOW_statement_in_conditional_statement1125);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			stat2=statement();
			state._fsp--;

			stream_statement.add(stat2.getTree());
			}

			// AST REWRITE
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// elements: if_clause, stat2, stat1
=======
			// elements: stat1, stat2, if_clause
>>>>>>> Stashed changes:output/grammarA60Parser.java
			// token labels: 
			// rule labels: stat2, stat1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_stat2=new RewriteRuleSubtreeStream(adaptor,"rule stat2",stat2!=null?stat2.getTree():null);
			RewriteRuleSubtreeStream stream_stat1=new RewriteRuleSubtreeStream(adaptor,"rule stat1",stat1!=null?stat1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 130:79: -> ^( IF_STATEMENT ^( CONDITION if_clause ) ^( ALORS $stat1) ( ^( SINON $stat2) )? )
			{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:130:82: ^( IF_STATEMENT ^( CONDITION if_clause ) ^( ALORS $stat1) ( ^( SINON $stat2) )? )
=======
				dbg.location(135,82);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:135:82: ^( IF_STATEMENT ^( CONDITION if_clause ) ^( ALORS $stat1) ( ^( SINON $stat2) )? )
>>>>>>> Stashed changes:output/grammarA60Parser.java
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(135,84);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF_STATEMENT, "IF_STATEMENT"), root_1);
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:130:97: ^( CONDITION if_clause )
=======
				dbg.location(135,97);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:135:97: ^( CONDITION if_clause )
>>>>>>> Stashed changes:output/grammarA60Parser.java
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(135,99);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);
				dbg.location(135,109);
				adaptor.addChild(root_2, stream_if_clause.nextTree());
				adaptor.addChild(root_1, root_2);
				}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:130:120: ^( ALORS $stat1)
=======
				dbg.location(135,120);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:135:120: ^( ALORS $stat1)
>>>>>>> Stashed changes:output/grammarA60Parser.java
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(135,122);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALORS, "ALORS"), root_2);
				dbg.location(135,129);
				adaptor.addChild(root_2, stream_stat1.nextTree());
				adaptor.addChild(root_1, root_2);
				}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:130:136: ( ^( SINON $stat2) )?
				if ( stream_stat2.hasNext() ) {
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:130:136: ^( SINON $stat2)
=======
				dbg.location(135,136);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:135:136: ( ^( SINON $stat2) )?
				if ( stream_stat2.hasNext() ) {
					dbg.location(135,136);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:135:136: ^( SINON $stat2)
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					Object root_2 = (Object)adaptor.nil();
					dbg.location(135,138);
					root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SINON, "SINON"), root_2);
					dbg.location(135,145);
					adaptor.addChild(root_2, stream_stat2.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_stat2.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(136, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conditional_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "conditional_statement"


	public static class unlabelled_basic_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unlabelled_basic_statement"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:133:1: unlabelled_basic_statement : ( go_to_statement -> go_to_statement | 'inline' actual_parameter_list | IDENTIFIER ( '[' boolean_expr ( ',' boolean_expr )* ']' )? ( ( ( ':' ( ';' )? | ':=' ) expression )* -> ^( ACTION IDENTIFIER ( boolean_expr )* expression ) | ( actual_parameter_list ) -> ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list ) ) );
	public final grammarA60Parserold.unlabelled_basic_statement_return unlabelled_basic_statement() throws RecognitionException {
		grammarA60Parserold.unlabelled_basic_statement_return retval = new grammarA60Parserold.unlabelled_basic_statement_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:138:1: unlabelled_basic_statement : ( go_to_statement -> go_to_statement | 'inline' actual_parameter_list | IDENTIFIER ( '[' boolean_expr ( ',' boolean_expr )* ']' )? ( ( ( ':' ( ';' )? | ':=' ) expression )* -> ^( ACTION IDENTIFIER ( boolean_expr )* expression ) | ( actual_parameter_list ) -> ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list ) ) );
	public final grammarA60Parser.unlabelled_basic_statement_return unlabelled_basic_statement() throws RecognitionException {
		grammarA60Parser.unlabelled_basic_statement_return retval = new grammarA60Parser.unlabelled_basic_statement_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal78=null;
		Token IDENTIFIER80=null;
		Token char_literal81=null;
		Token char_literal83=null;
		Token char_literal85=null;
		Token char_literal86=null;
		Token char_literal87=null;
		Token string_literal88=null;
		ParserRuleReturnScope go_to_statement77 =null;
		ParserRuleReturnScope actual_parameter_list79 =null;
		ParserRuleReturnScope boolean_expr82 =null;
		ParserRuleReturnScope boolean_expr84 =null;
		ParserRuleReturnScope expression89 =null;
		ParserRuleReturnScope actual_parameter_list90 =null;

		Object string_literal78_tree=null;
		Object IDENTIFIER80_tree=null;
		Object char_literal81_tree=null;
		Object char_literal83_tree=null;
		Object char_literal85_tree=null;
		Object char_literal86_tree=null;
		Object char_literal87_tree=null;
		Object string_literal88_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_go_to_statement=new RewriteRuleSubtreeStream(adaptor,"rule go_to_statement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_boolean_expr=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expr");
		RewriteRuleSubtreeStream stream_actual_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule actual_parameter_list");

		try { dbg.enterRule(getGrammarFileName(), "unlabelled_basic_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(138, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:133:27: ( go_to_statement -> go_to_statement | 'inline' actual_parameter_list | IDENTIFIER ( '[' boolean_expr ( ',' boolean_expr )* ']' )? ( ( ( ':' ( ';' )? | ':=' ) expression )* -> ^( ACTION IDENTIFIER ( boolean_expr )* expression ) | ( actual_parameter_list ) -> ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list ) ) )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:138:27: ( go_to_statement -> go_to_statement | 'inline' actual_parameter_list | IDENTIFIER ( '[' boolean_expr ( ',' boolean_expr )* ']' )? ( ( ( ':' ( ';' )? | ':=' ) expression )* -> ^( ACTION IDENTIFIER ( boolean_expr )* expression ) | ( actual_parameter_list ) -> ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list ) ) )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt24=3;
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			switch ( input.LA(1) ) {
			case 69:
			case 70:
				{
				alt24=1;
				}
				break;
			case 72:
				{
				alt24=2;
				}
				break;
			case IDENTIFIER:
				{
				alt24=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:134:5: go_to_statement
					{
					pushFollow(FOLLOW_go_to_statement_in_unlabelled_basic_statement1121);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:139:5: go_to_statement
					{
					dbg.location(139,5);
					pushFollow(FOLLOW_go_to_statement_in_unlabelled_basic_statement1166);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					go_to_statement77=go_to_statement();
					state._fsp--;

					stream_go_to_statement.add(go_to_statement77.getTree());
					// AST REWRITE
					// elements: go_to_statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 134:21: -> go_to_statement
					{
						dbg.location(139,24);
						adaptor.addChild(root_0, stream_go_to_statement.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:135:7: 'inline' actual_parameter_list
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:140:7: 'inline' actual_parameter_list
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					string_literal78=(Token)match(input,72,FOLLOW_72_in_unlabelled_basic_statement1133); 
					string_literal78_tree = (Object)adaptor.create(string_literal78);
					adaptor.addChild(root_0, string_literal78_tree);

					pushFollow(FOLLOW_actual_parameter_list_in_unlabelled_basic_statement1135);
=======
					dbg.location(140,7);
					string_literal78=(Token)match(input,77,FOLLOW_77_in_unlabelled_basic_statement1178); 
					string_literal78_tree = (Object)adaptor.create(string_literal78);
					adaptor.addChild(root_0, string_literal78_tree);
					dbg.location(140,16);
					pushFollow(FOLLOW_actual_parameter_list_in_unlabelled_basic_statement1180);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					actual_parameter_list79=actual_parameter_list();
					state._fsp--;

					adaptor.addChild(root_0, actual_parameter_list79.getTree());

					}
					break;
				case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:136:7: IDENTIFIER ( '[' boolean_expr ( ',' boolean_expr )* ']' )? ( ( ( ':' ( ';' )? | ':=' ) expression )* -> ^( ACTION IDENTIFIER ( boolean_expr )* expression ) | ( actual_parameter_list ) -> ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list ) )
					{
					IDENTIFIER80=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_unlabelled_basic_statement1143);  
					stream_IDENTIFIER.add(IDENTIFIER80);

					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:136:18: ( '[' boolean_expr ( ',' boolean_expr )* ']' )?
=======
					dbg.enterAlt(3);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:141:7: IDENTIFIER ( '[' boolean_expr ( ',' boolean_expr )* ']' )? ( ( ( ':' ( ';' )? | ':=' ) expression )* -> ^( ACTION IDENTIFIER ( boolean_expr )* expression ) | ( actual_parameter_list ) -> ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list ) )
					{
					dbg.location(141,7);
					IDENTIFIER80=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_unlabelled_basic_statement1188);  
					stream_IDENTIFIER.add(IDENTIFIER80);
					dbg.location(141,18);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:141:18: ( '[' boolean_expr ( ',' boolean_expr )* ']' )?
>>>>>>> Stashed changes:output/grammarA60Parser.java
					int alt19=2;
					try { dbg.enterSubRule(19);
					try { dbg.enterDecision(19, decisionCanBacktrack[19]);

					int LA19_0 = input.LA(1);
					if ( (LA19_0==60) ) {
						alt19=1;
					}
					} finally {dbg.exitDecision(19);}

					switch (alt19) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:136:19: '[' boolean_expr ( ',' boolean_expr )* ']'
							{
							char_literal81=(Token)match(input,60,FOLLOW_60_in_unlabelled_basic_statement1146);  
							stream_60.add(char_literal81);

							pushFollow(FOLLOW_boolean_expr_in_unlabelled_basic_statement1147);
							boolean_expr82=boolean_expr();
							state._fsp--;

							stream_boolean_expr.add(boolean_expr82.getTree());
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:136:35: ( ',' boolean_expr )*
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:141:19: '[' boolean_expr ( ',' boolean_expr )* ']'
							{
							dbg.location(141,19);
							char_literal81=(Token)match(input,65,FOLLOW_65_in_unlabelled_basic_statement1191);  
							stream_65.add(char_literal81);
							dbg.location(141,22);
							pushFollow(FOLLOW_boolean_expr_in_unlabelled_basic_statement1192);
							boolean_expr82=boolean_expr();
							state._fsp--;

							stream_boolean_expr.add(boolean_expr82.getTree());dbg.location(141,35);
							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:141:35: ( ',' boolean_expr )*
							try { dbg.enterSubRule(18);

>>>>>>> Stashed changes:output/grammarA60Parser.java
							loop18:
							while (true) {
								int alt18=2;
								try { dbg.enterDecision(18, decisionCanBacktrack[18]);

								int LA18_0 = input.LA(1);
								if ( (LA18_0==42) ) {
									alt18=1;
								}

								} finally {dbg.exitDecision(18);}

								switch (alt18) {
								case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
									// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:136:36: ',' boolean_expr
									{
									char_literal83=(Token)match(input,42,FOLLOW_42_in_unlabelled_basic_statement1150);  
									stream_42.add(char_literal83);

									pushFollow(FOLLOW_boolean_expr_in_unlabelled_basic_statement1151);
=======
									dbg.enterAlt(1);

									// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:141:36: ',' boolean_expr
									{
									dbg.location(141,36);
									char_literal83=(Token)match(input,47,FOLLOW_47_in_unlabelled_basic_statement1195);  
									stream_47.add(char_literal83);
									dbg.location(141,39);
									pushFollow(FOLLOW_boolean_expr_in_unlabelled_basic_statement1196);
>>>>>>> Stashed changes:output/grammarA60Parser.java
									boolean_expr84=boolean_expr();
									state._fsp--;

									stream_boolean_expr.add(boolean_expr84.getTree());
									}
									break;

								default :
									break loop18;
								}
							}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

							char_literal85=(Token)match(input,61,FOLLOW_61_in_unlabelled_basic_statement1155);  
							stream_61.add(char_literal85);
=======
							} finally {dbg.exitSubRule(18);}
							dbg.location(141,54);
							char_literal85=(Token)match(input,66,FOLLOW_66_in_unlabelled_basic_statement1200);  
							stream_66.add(char_literal85);
>>>>>>> Stashed changes:output/grammarA60Parser.java

							}
							break;

					}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:137:9: ( ( ( ':' ( ';' )? | ':=' ) expression )* -> ^( ACTION IDENTIFIER ( boolean_expr )* expression ) | ( actual_parameter_list ) -> ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list ) )
=======
					} finally {dbg.exitSubRule(19);}
					dbg.location(142,9);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:142:9: ( ( ( ':' ( ';' )? | ':=' ) expression )* -> ^( ACTION IDENTIFIER ( boolean_expr )* expression ) | ( actual_parameter_list ) -> ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list ) )
>>>>>>> Stashed changes:output/grammarA60Parser.java
					int alt23=2;
					try { dbg.enterSubRule(23);
					try { dbg.enterDecision(23, decisionCanBacktrack[23]);

					int LA23_0 = input.LA(1);
					if ( ((LA23_0 >= 45 && LA23_0 <= 47)||(LA23_0 >= 66 && LA23_0 <= 67)) ) {
						alt23=1;
					}
					else if ( (LA23_0==37) ) {
						alt23=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(23);}

					switch (alt23) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:138:9: ( ( ':' ( ';' )? | ':=' ) expression )*
							{
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:138:9: ( ( ':' ( ';' )? | ':=' ) expression )*
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:143:9: ( ( ':' ( ';' )? | ':=' ) expression )*
							{
							dbg.location(143,9);
							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:143:9: ( ( ':' ( ';' )? | ':=' ) expression )*
							try { dbg.enterSubRule(22);

>>>>>>> Stashed changes:output/grammarA60Parser.java
							loop22:
							while (true) {
								int alt22=2;
								try { dbg.enterDecision(22, decisionCanBacktrack[22]);

								int LA22_0 = input.LA(1);
								if ( ((LA22_0 >= 45 && LA22_0 <= 46)) ) {
									alt22=1;
								}

								} finally {dbg.exitDecision(22);}

								switch (alt22) {
								case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
									// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:138:10: ( ':' ( ';' )? | ':=' ) expression
									{
									// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:138:10: ( ':' ( ';' )? | ':=' )
=======
									dbg.enterAlt(1);

									// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:143:10: ( ':' ( ';' )? | ':=' ) expression
									{
									dbg.location(143,10);
									// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:143:10: ( ':' ( ';' )? | ':=' )
>>>>>>> Stashed changes:output/grammarA60Parser.java
									int alt21=2;
									try { dbg.enterSubRule(21);
									try { dbg.enterDecision(21, decisionCanBacktrack[21]);

									int LA21_0 = input.LA(1);
									if ( (LA21_0==45) ) {
										alt21=1;
									}
									else if ( (LA21_0==46) ) {
										alt21=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 21, 0, input);
										dbg.recognitionException(nvae);
										throw nvae;
									}

									} finally {dbg.exitDecision(21);}

									switch (alt21) {
										case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
											// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:138:11: ':' ( ';' )?
											{
											char_literal86=(Token)match(input,45,FOLLOW_45_in_unlabelled_basic_statement1179);  
											stream_45.add(char_literal86);

											// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:138:14: ( ';' )?
=======
											dbg.enterAlt(1);

											// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:143:11: ':' ( ';' )?
											{
											dbg.location(143,11);
											char_literal86=(Token)match(input,50,FOLLOW_50_in_unlabelled_basic_statement1224);  
											stream_50.add(char_literal86);
											dbg.location(143,14);
											// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:143:14: ( ';' )?
>>>>>>> Stashed changes:output/grammarA60Parser.java
											int alt20=2;
											try { dbg.enterSubRule(20);
											try { dbg.enterDecision(20, decisionCanBacktrack[20]);

											int LA20_0 = input.LA(1);
											if ( (LA20_0==47) ) {
												alt20=1;
											}
											} finally {dbg.exitDecision(20);}

											switch (alt20) {
												case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
													// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:138:14: ';'
													{
													char_literal87=(Token)match(input,47,FOLLOW_47_in_unlabelled_basic_statement1180);  
													stream_47.add(char_literal87);
=======
													dbg.enterAlt(1);

													// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:143:14: ';'
													{
													dbg.location(143,14);
													char_literal87=(Token)match(input,52,FOLLOW_52_in_unlabelled_basic_statement1225);  
													stream_52.add(char_literal87);
>>>>>>> Stashed changes:output/grammarA60Parser.java

													}
													break;

											}
											} finally {dbg.exitSubRule(20);}

											}
											break;
										case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
											// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:138:19: ':='
											{
											string_literal88=(Token)match(input,46,FOLLOW_46_in_unlabelled_basic_statement1183);  
											stream_46.add(string_literal88);
=======
											dbg.enterAlt(2);

											// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:143:19: ':='
											{
											dbg.location(143,19);
											string_literal88=(Token)match(input,51,FOLLOW_51_in_unlabelled_basic_statement1228);  
											stream_51.add(string_literal88);
>>>>>>> Stashed changes:output/grammarA60Parser.java

											}
											break;

									}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

									pushFollow(FOLLOW_expression_in_unlabelled_basic_statement1187);
=======
									} finally {dbg.exitSubRule(21);}
									dbg.location(143,26);
									pushFollow(FOLLOW_expression_in_unlabelled_basic_statement1232);
>>>>>>> Stashed changes:output/grammarA60Parser.java
									expression89=expression();
									state._fsp--;

									stream_expression.add(expression89.getTree());
									}
									break;

								default :
									break loop22;
								}
							}
							} finally {dbg.exitSubRule(22);}

							// AST REWRITE
							// elements: expression, boolean_expr, IDENTIFIER
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 138:39: -> ^( ACTION IDENTIFIER ( boolean_expr )* expression )
							{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
								// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:138:42: ^( ACTION IDENTIFIER ( boolean_expr )* expression )
=======
								dbg.location(143,42);
								// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:143:42: ^( ACTION IDENTIFIER ( boolean_expr )* expression )
>>>>>>> Stashed changes:output/grammarA60Parser.java
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(143,44);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACTION, "ACTION"), root_1);
<<<<<<< Updated upstream:output/grammarA60Parserold.java
								adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
								// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:138:62: ( boolean_expr )*
=======
								dbg.location(143,51);
								adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());dbg.location(143,62);
								// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:143:62: ( boolean_expr )*
>>>>>>> Stashed changes:output/grammarA60Parser.java
								while ( stream_boolean_expr.hasNext() ) {
									dbg.location(143,62);
									adaptor.addChild(root_1, stream_boolean_expr.nextTree());
								}
								stream_boolean_expr.reset();
								dbg.location(143,76);
								adaptor.addChild(root_1, stream_expression.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:139:11: ( actual_parameter_list )
							{
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:139:11: ( actual_parameter_list )
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:139:12: actual_parameter_list
							{
							pushFollow(FOLLOW_actual_parameter_list_in_unlabelled_basic_statement1216);
=======
							dbg.enterAlt(2);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:144:11: ( actual_parameter_list )
							{
							dbg.location(144,11);
							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:144:11: ( actual_parameter_list )
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:144:12: actual_parameter_list
							{
							dbg.location(144,12);
							pushFollow(FOLLOW_actual_parameter_list_in_unlabelled_basic_statement1261);
>>>>>>> Stashed changes:output/grammarA60Parser.java
							actual_parameter_list90=actual_parameter_list();
							state._fsp--;

							stream_actual_parameter_list.add(actual_parameter_list90.getTree());
							}

							// AST REWRITE
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// elements: actual_parameter_list, IDENTIFIER, boolean_expr
=======
							// elements: IDENTIFIER, actual_parameter_list, boolean_expr
>>>>>>> Stashed changes:output/grammarA60Parser.java
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 139:35: -> ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list )
							{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
								// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:139:38: ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list )
=======
								dbg.location(144,38);
								// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:144:38: ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list )
>>>>>>> Stashed changes:output/grammarA60Parser.java
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(144,40);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACTION, "ACTION"), root_1);
<<<<<<< Updated upstream:output/grammarA60Parserold.java
								adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
								// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:139:58: ( boolean_expr )*
=======
								dbg.location(144,47);
								adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());dbg.location(144,58);
								// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:144:58: ( boolean_expr )*
>>>>>>> Stashed changes:output/grammarA60Parser.java
								while ( stream_boolean_expr.hasNext() ) {
									dbg.location(144,58);
									adaptor.addChild(root_1, stream_boolean_expr.nextTree());
								}
								stream_boolean_expr.reset();
								dbg.location(144,72);
								adaptor.addChild(root_1, stream_actual_parameter_list.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(23);}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(146, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unlabelled_basic_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "unlabelled_basic_statement"


	public static class go_to_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "go_to_statement"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:143:1: go_to_statement : ( 'goto' ^| 'go to' ^) expression ;
	public final grammarA60Parserold.go_to_statement_return go_to_statement() throws RecognitionException {
		grammarA60Parserold.go_to_statement_return retval = new grammarA60Parserold.go_to_statement_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:148:1: go_to_statement : ( 'goto' ^| 'go to' ^) expression ;
	public final grammarA60Parser.go_to_statement_return go_to_statement() throws RecognitionException {
		grammarA60Parser.go_to_statement_return retval = new grammarA60Parser.go_to_statement_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal91=null;
		Token string_literal92=null;
		ParserRuleReturnScope expression93 =null;

		Object string_literal91_tree=null;
		Object string_literal92_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "go_to_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(148, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:143:16: ( ( 'goto' ^| 'go to' ^) expression )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:144:5: ( 'goto' ^| 'go to' ^) expression
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:148:16: ( ( 'goto' ^| 'go to' ^) expression )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:149:5: ( 'goto' ^| 'go to' ^) expression
>>>>>>> Stashed changes:output/grammarA60Parser.java
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:144:5: ( 'goto' ^| 'go to' ^)
=======
			dbg.location(149,5);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:149:5: ( 'goto' ^| 'go to' ^)
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt25=2;
			try { dbg.enterSubRule(25);
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			int LA25_0 = input.LA(1);
			if ( (LA25_0==70) ) {
				alt25=1;
			}
			else if ( (LA25_0==69) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:144:6: 'goto' ^
					{
					string_literal91=(Token)match(input,70,FOLLOW_70_in_go_to_statement1253); 
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:149:6: 'goto' ^
					{
					dbg.location(149,12);
					string_literal91=(Token)match(input,75,FOLLOW_75_in_go_to_statement1298); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					string_literal91_tree = (Object)adaptor.create(string_literal91);
					root_0 = (Object)adaptor.becomeRoot(string_literal91_tree, root_0);

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:144:16: 'go to' ^
					{
					string_literal92=(Token)match(input,69,FOLLOW_69_in_go_to_statement1258); 
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:149:16: 'go to' ^
					{
					dbg.location(149,23);
					string_literal92=(Token)match(input,74,FOLLOW_74_in_go_to_statement1303); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					string_literal92_tree = (Object)adaptor.create(string_literal92);
					root_0 = (Object)adaptor.becomeRoot(string_literal92_tree, root_0);

					}
					break;

			}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

			pushFollow(FOLLOW_expression_in_go_to_statement1262);
=======
			} finally {dbg.exitSubRule(25);}
			dbg.location(149,26);
			pushFollow(FOLLOW_expression_in_go_to_statement1307);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			expression93=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression93.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(150, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "go_to_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "go_to_statement"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:147:1: expression : ( boolean_expr -> boolean_expr | if_clause exp1= expression ( 'else' exp2= expression ) -> ^( IF ^( CONDITION if_clause ) ^( ALORS $exp1) ^( SINON $exp2) ) | go_to_statement | program );
	public final grammarA60Parserold.expression_return expression() throws RecognitionException {
		grammarA60Parserold.expression_return retval = new grammarA60Parserold.expression_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:152:1: expression : ( boolean_expr -> boolean_expr | if_clause exp1= expression ( 'else' exp2= expression ) -> ^( IF ^( CONDITION if_clause ) ^( ALORS $exp1) ^( SINON $exp2) ) | go_to_statement | program );
	public final grammarA60Parser.expression_return expression() throws RecognitionException {
		grammarA60Parser.expression_return retval = new grammarA60Parser.expression_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal96=null;
		ParserRuleReturnScope exp1 =null;
		ParserRuleReturnScope exp2 =null;
		ParserRuleReturnScope boolean_expr94 =null;
		ParserRuleReturnScope if_clause95 =null;
		ParserRuleReturnScope go_to_statement97 =null;
		ParserRuleReturnScope program98 =null;

		Object string_literal96_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_boolean_expr=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expr");
		RewriteRuleSubtreeStream stream_if_clause=new RewriteRuleSubtreeStream(adaptor,"rule if_clause");

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(152, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:147:11: ( boolean_expr -> boolean_expr | if_clause exp1= expression ( 'else' exp2= expression ) -> ^( IF ^( CONDITION if_clause ) ^( ALORS $exp1) ^( SINON $exp2) ) | go_to_statement | program )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:152:11: ( boolean_expr -> boolean_expr | if_clause exp1= expression ( 'else' exp2= expression ) -> ^( IF ^( CONDITION if_clause ) ^( ALORS $exp1) ^( SINON $exp2) ) | go_to_statement | program )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt26=4;
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case UNSIGNED_NUMBER:
			case 37:
			case 41:
			case 43:
			case 57:
			case 59:
			case 87:
				{
				alt26=1;
				}
				break;
			case 71:
				{
				alt26=2;
				}
				break;
			case 69:
			case 70:
				{
				alt26=3;
				}
				break;
			case TYPE:
			case 63:
			case 64:
			case 72:
			case 73:
			case 76:
			case 77:
			case 80:
				{
				alt26=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:148:5: boolean_expr
					{
					pushFollow(FOLLOW_boolean_expr_in_expression1274);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:153:5: boolean_expr
					{
					dbg.location(153,5);
					pushFollow(FOLLOW_boolean_expr_in_expression1319);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					boolean_expr94=boolean_expr();
					state._fsp--;

					stream_boolean_expr.add(boolean_expr94.getTree());
					// AST REWRITE
					// elements: boolean_expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 148:18: -> boolean_expr
					{
						dbg.location(153,21);
						adaptor.addChild(root_0, stream_boolean_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:149:11: if_clause exp1= expression ( 'else' exp2= expression )
					{
					pushFollow(FOLLOW_if_clause_in_expression1290);
					if_clause95=if_clause();
					state._fsp--;

					stream_if_clause.add(if_clause95.getTree());
					pushFollow(FOLLOW_expression_in_expression1294);
					exp1=expression();
					state._fsp--;

					stream_expression.add(exp1.getTree());
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:149:37: ( 'else' exp2= expression )
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:149:38: 'else' exp2= expression
					{
					string_literal96=(Token)match(input,66,FOLLOW_66_in_expression1297);  
					stream_66.add(string_literal96);

					pushFollow(FOLLOW_expression_in_expression1301);
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:154:11: if_clause exp1= expression ( 'else' exp2= expression )
					{
					dbg.location(154,11);
					pushFollow(FOLLOW_if_clause_in_expression1335);
					if_clause95=if_clause();
					state._fsp--;

					stream_if_clause.add(if_clause95.getTree());dbg.location(154,25);
					pushFollow(FOLLOW_expression_in_expression1339);
					exp1=expression();
					state._fsp--;

					stream_expression.add(exp1.getTree());dbg.location(154,37);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:154:37: ( 'else' exp2= expression )
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:154:38: 'else' exp2= expression
					{
					dbg.location(154,38);
					string_literal96=(Token)match(input,71,FOLLOW_71_in_expression1342);  
					stream_71.add(string_literal96);
					dbg.location(154,49);
					pushFollow(FOLLOW_expression_in_expression1346);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					exp2=expression();
					state._fsp--;

					stream_expression.add(exp2.getTree());
					}

					// AST REWRITE
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// elements: exp1, exp2, if_clause
=======
					// elements: if_clause, exp2, exp1
>>>>>>> Stashed changes:output/grammarA60Parser.java
					// token labels: 
					// rule labels: exp2, exp1, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_exp2=new RewriteRuleSubtreeStream(adaptor,"rule exp2",exp2!=null?exp2.getTree():null);
					RewriteRuleSubtreeStream stream_exp1=new RewriteRuleSubtreeStream(adaptor,"rule exp1",exp1!=null?exp1.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 149:62: -> ^( IF ^( CONDITION if_clause ) ^( ALORS $exp1) ^( SINON $exp2) )
					{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
						// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:149:65: ^( IF ^( CONDITION if_clause ) ^( ALORS $exp1) ^( SINON $exp2) )
=======
						dbg.location(154,65);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:154:65: ^( IF ^( CONDITION if_clause ) ^( ALORS $exp1) ^( SINON $exp2) )
>>>>>>> Stashed changes:output/grammarA60Parser.java
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(154,67);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
<<<<<<< Updated upstream:output/grammarA60Parserold.java
						// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:149:70: ^( CONDITION if_clause )
=======
						dbg.location(154,70);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:154:70: ^( CONDITION if_clause )
>>>>>>> Stashed changes:output/grammarA60Parser.java
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(154,72);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);
						dbg.location(154,82);
						adaptor.addChild(root_2, stream_if_clause.nextTree());
						adaptor.addChild(root_1, root_2);
						}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

						// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:149:93: ^( ALORS $exp1)
=======
						dbg.location(154,93);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:154:93: ^( ALORS $exp1)
>>>>>>> Stashed changes:output/grammarA60Parser.java
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(154,95);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALORS, "ALORS"), root_2);
						dbg.location(154,102);
						adaptor.addChild(root_2, stream_exp1.nextTree());
						adaptor.addChild(root_1, root_2);
						}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

						// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:149:108: ^( SINON $exp2)
=======
						dbg.location(154,108);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:154:108: ^( SINON $exp2)
>>>>>>> Stashed changes:output/grammarA60Parser.java
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(154,110);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SINON, "SINON"), root_2);
						dbg.location(154,117);
						adaptor.addChild(root_2, stream_exp2.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:150:11: go_to_statement
=======
					dbg.enterAlt(3);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:155:11: go_to_statement
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					pushFollow(FOLLOW_go_to_statement_in_expression1340);
=======
					dbg.location(155,11);
					pushFollow(FOLLOW_go_to_statement_in_expression1385);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					go_to_statement97=go_to_statement();
					state._fsp--;

					adaptor.addChild(root_0, go_to_statement97.getTree());

					}
					break;
				case 4 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:151:11: program
=======
					dbg.enterAlt(4);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:156:11: program
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					pushFollow(FOLLOW_program_in_expression1353);
=======
					dbg.location(156,11);
					pushFollow(FOLLOW_program_in_expression1398);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					program98=program();
					state._fsp--;

					adaptor.addChild(root_0, program98.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(157, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expression"


	public static class if_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_clause"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:154:1: if_clause : 'if' boolean_expr 'then' -> boolean_expr ;
	public final grammarA60Parserold.if_clause_return if_clause() throws RecognitionException {
		grammarA60Parserold.if_clause_return retval = new grammarA60Parserold.if_clause_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:159:1: if_clause : 'if' boolean_expr 'then' -> boolean_expr ;
	public final grammarA60Parser.if_clause_return if_clause() throws RecognitionException {
		grammarA60Parser.if_clause_return retval = new grammarA60Parser.if_clause_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal99=null;
		Token string_literal101=null;
		ParserRuleReturnScope boolean_expr100 =null;

		Object string_literal99_tree=null;
		Object string_literal101_tree=null;
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleSubtreeStream stream_boolean_expr=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expr");

		try { dbg.enterRule(getGrammarFileName(), "if_clause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(159, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:154:10: ( 'if' boolean_expr 'then' -> boolean_expr )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:155:5: 'if' boolean_expr 'then'
			{
			string_literal99=(Token)match(input,71,FOLLOW_71_in_if_clause1366);  
			stream_71.add(string_literal99);

			pushFollow(FOLLOW_boolean_expr_in_if_clause1368);
			boolean_expr100=boolean_expr();
			state._fsp--;

			stream_boolean_expr.add(boolean_expr100.getTree());
			string_literal101=(Token)match(input,81,FOLLOW_81_in_if_clause1370);  
			stream_81.add(string_literal101);
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:159:10: ( 'if' boolean_expr 'then' -> boolean_expr )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:160:5: 'if' boolean_expr 'then'
			{
			dbg.location(160,5);
			string_literal99=(Token)match(input,76,FOLLOW_76_in_if_clause1411);  
			stream_76.add(string_literal99);
			dbg.location(160,10);
			pushFollow(FOLLOW_boolean_expr_in_if_clause1413);
			boolean_expr100=boolean_expr();
			state._fsp--;

			stream_boolean_expr.add(boolean_expr100.getTree());dbg.location(160,23);
			string_literal101=(Token)match(input,86,FOLLOW_86_in_if_clause1415);  
			stream_86.add(string_literal101);
>>>>>>> Stashed changes:output/grammarA60Parser.java

			// AST REWRITE
			// elements: boolean_expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 155:30: -> boolean_expr
			{
				dbg.location(160,33);
				adaptor.addChild(root_0, stream_boolean_expr.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(161, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "if_clause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "if_clause"


	public static class boolean_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_expr"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:158:1: boolean_expr : logic_expr ( '<=>' logic_expr )* -> ( logic_expr )+ ;
	public final grammarA60Parserold.boolean_expr_return boolean_expr() throws RecognitionException {
		grammarA60Parserold.boolean_expr_return retval = new grammarA60Parserold.boolean_expr_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:163:1: boolean_expr : logic_expr ( '<=>' logic_expr )* -> ( logic_expr )+ ;
	public final grammarA60Parser.boolean_expr_return boolean_expr() throws RecognitionException {
		grammarA60Parser.boolean_expr_return retval = new grammarA60Parser.boolean_expr_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal103=null;
		ParserRuleReturnScope logic_expr102 =null;
		ParserRuleReturnScope logic_expr104 =null;

		Object string_literal103_tree=null;
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_logic_expr=new RewriteRuleSubtreeStream(adaptor,"rule logic_expr");

		try { dbg.enterRule(getGrammarFileName(), "boolean_expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(163, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:158:13: ( logic_expr ( '<=>' logic_expr )* -> ( logic_expr )+ )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:159:5: logic_expr ( '<=>' logic_expr )*
			{
			pushFollow(FOLLOW_logic_expr_in_boolean_expr1386);
			logic_expr102=logic_expr();
			state._fsp--;

			stream_logic_expr.add(logic_expr102.getTree());
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:159:16: ( '<=>' logic_expr )*
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:163:13: ( logic_expr ( '<=>' logic_expr )* -> ( logic_expr )+ )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:164:5: logic_expr ( '<=>' logic_expr )*
			{
			dbg.location(164,5);
			pushFollow(FOLLOW_logic_expr_in_boolean_expr1431);
			logic_expr102=logic_expr();
			state._fsp--;

			stream_logic_expr.add(logic_expr102.getTree());dbg.location(164,16);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:164:16: ( '<=>' logic_expr )*
			try { dbg.enterSubRule(27);

>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop27:
			while (true) {
				int alt27=2;
				try { dbg.enterDecision(27, decisionCanBacktrack[27]);

				int LA27_0 = input.LA(1);
				if ( (LA27_0==50) ) {
					alt27=1;
				}

				} finally {dbg.exitDecision(27);}

				switch (alt27) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:159:18: '<=>' logic_expr
					{
					string_literal103=(Token)match(input,50,FOLLOW_50_in_boolean_expr1390);  
					stream_50.add(string_literal103);

					pushFollow(FOLLOW_logic_expr_in_boolean_expr1392);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:164:18: '<=>' logic_expr
					{
					dbg.location(164,18);
					string_literal103=(Token)match(input,55,FOLLOW_55_in_boolean_expr1435);  
					stream_55.add(string_literal103);
					dbg.location(164,24);
					pushFollow(FOLLOW_logic_expr_in_boolean_expr1437);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					logic_expr104=logic_expr();
					state._fsp--;

					stream_logic_expr.add(logic_expr104.getTree());
					}
					break;

				default :
					break loop27;
				}
			}
			} finally {dbg.exitSubRule(27);}

			// AST REWRITE
			// elements: logic_expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 159:37: -> ( logic_expr )+
			{
				dbg.location(164,40);
				if ( !(stream_logic_expr.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_logic_expr.hasNext() ) {
					dbg.location(164,40);
					adaptor.addChild(root_0, stream_logic_expr.nextTree());
				}
				stream_logic_expr.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(165, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "boolean_expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "boolean_expr"


	public static class logic_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logic_expr"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:162:1: logic_expr : logic_expr_bis ( '=>' logic_expr_bis )* -> ( logic_expr_bis )+ ;
	public final grammarA60Parserold.logic_expr_return logic_expr() throws RecognitionException {
		grammarA60Parserold.logic_expr_return retval = new grammarA60Parserold.logic_expr_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:167:1: logic_expr : logic_expr_bis ( '=>' logic_expr_bis )* -> ( logic_expr_bis )+ ;
	public final grammarA60Parser.logic_expr_return logic_expr() throws RecognitionException {
		grammarA60Parser.logic_expr_return retval = new grammarA60Parser.logic_expr_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal106=null;
		ParserRuleReturnScope logic_expr_bis105 =null;
		ParserRuleReturnScope logic_expr_bis107 =null;

		Object string_literal106_tree=null;
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_logic_expr_bis=new RewriteRuleSubtreeStream(adaptor,"rule logic_expr_bis");

		try { dbg.enterRule(getGrammarFileName(), "logic_expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(167, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:162:11: ( logic_expr_bis ( '=>' logic_expr_bis )* -> ( logic_expr_bis )+ )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:163:5: logic_expr_bis ( '=>' logic_expr_bis )*
			{
			pushFollow(FOLLOW_logic_expr_bis_in_logic_expr1411);
			logic_expr_bis105=logic_expr_bis();
			state._fsp--;

			stream_logic_expr_bis.add(logic_expr_bis105.getTree());
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:163:20: ( '=>' logic_expr_bis )*
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:167:11: ( logic_expr_bis ( '=>' logic_expr_bis )* -> ( logic_expr_bis )+ )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:168:5: logic_expr_bis ( '=>' logic_expr_bis )*
			{
			dbg.location(168,5);
			pushFollow(FOLLOW_logic_expr_bis_in_logic_expr1456);
			logic_expr_bis105=logic_expr_bis();
			state._fsp--;

			stream_logic_expr_bis.add(logic_expr_bis105.getTree());dbg.location(168,20);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:168:20: ( '=>' logic_expr_bis )*
			try { dbg.enterSubRule(28);

>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop28:
			while (true) {
				int alt28=2;
				try { dbg.enterDecision(28, decisionCanBacktrack[28]);

				int LA28_0 = input.LA(1);
				if ( (LA28_0==53) ) {
					alt28=1;
				}

				} finally {dbg.exitDecision(28);}

				switch (alt28) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:163:22: '=>' logic_expr_bis
					{
					string_literal106=(Token)match(input,53,FOLLOW_53_in_logic_expr1415);  
					stream_53.add(string_literal106);

					pushFollow(FOLLOW_logic_expr_bis_in_logic_expr1417);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:168:22: '=>' logic_expr_bis
					{
					dbg.location(168,22);
					string_literal106=(Token)match(input,58,FOLLOW_58_in_logic_expr1460);  
					stream_58.add(string_literal106);
					dbg.location(168,27);
					pushFollow(FOLLOW_logic_expr_bis_in_logic_expr1462);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					logic_expr_bis107=logic_expr_bis();
					state._fsp--;

					stream_logic_expr_bis.add(logic_expr_bis107.getTree());
					}
					break;

				default :
					break loop28;
				}
			}
			} finally {dbg.exitSubRule(28);}

			// AST REWRITE
			// elements: logic_expr_bis
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 163:44: -> ( logic_expr_bis )+
			{
				dbg.location(168,47);
				if ( !(stream_logic_expr_bis.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_logic_expr_bis.hasNext() ) {
					dbg.location(168,47);
					adaptor.addChild(root_0, stream_logic_expr_bis.nextTree());
				}
				stream_logic_expr_bis.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(169, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "logic_expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "logic_expr"


	public static class logic_expr_bis_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logic_expr_bis"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:166:1: logic_expr_bis : logic_expr_ter ( ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter )* ;
	public final grammarA60Parserold.logic_expr_bis_return logic_expr_bis() throws RecognitionException {
		grammarA60Parserold.logic_expr_bis_return retval = new grammarA60Parserold.logic_expr_bis_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:171:1: logic_expr_bis : logic_expr_ter ( ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter )* ;
	public final grammarA60Parser.logic_expr_bis_return logic_expr_bis() throws RecognitionException {
		grammarA60Parser.logic_expr_bis_return retval = new grammarA60Parser.logic_expr_bis_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal109=null;
		Token string_literal110=null;
		Token string_literal111=null;
		Token string_literal112=null;
		Token string_literal113=null;
		Token string_literal114=null;
		Token char_literal115=null;
		Token char_literal116=null;
		ParserRuleReturnScope logic_expr_ter108 =null;
		ParserRuleReturnScope logic_expr_ter117 =null;

		Object string_literal109_tree=null;
		Object string_literal110_tree=null;
		Object string_literal111_tree=null;
		Object string_literal112_tree=null;
		Object string_literal113_tree=null;
		Object string_literal114_tree=null;
		Object char_literal115_tree=null;
		Object char_literal116_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "logic_expr_bis");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(171, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:166:15: ( logic_expr_ter ( ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter )* )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:167:5: logic_expr_ter ( ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter )*
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:171:15: ( logic_expr_ter ( ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter )* )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:172:5: logic_expr_ter ( ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter )*
>>>>>>> Stashed changes:output/grammarA60Parser.java
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
			pushFollow(FOLLOW_logic_expr_ter_in_logic_expr_bis1436);
=======
			dbg.location(172,5);
			pushFollow(FOLLOW_logic_expr_ter_in_logic_expr_bis1481);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			logic_expr_ter108=logic_expr_ter();
			state._fsp--;

			adaptor.addChild(root_0, logic_expr_ter108.getTree());
			dbg.location(172,20);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:172:20: ( ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter )*
			try { dbg.enterSubRule(30);

<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:167:20: ( ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter )*
=======
>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop30:
			while (true) {
				int alt30=2;
				try { dbg.enterDecision(30, decisionCanBacktrack[30]);

				int LA30_0 = input.LA(1);
				if ( ((LA30_0 >= 35 && LA30_0 <= 36)||LA30_0==56||LA30_0==58||LA30_0==62||LA30_0==75||(LA30_0 >= 85 && LA30_0 <= 86)) ) {
					alt30=1;
				}

				} finally {dbg.exitDecision(30);}

				switch (alt30) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:168:9: ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter
					{
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:168:9: ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^)
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:173:9: ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter
					{
					dbg.location(173,9);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:173:9: ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^)
>>>>>>> Stashed changes:output/grammarA60Parser.java
					int alt29=8;
					try { dbg.enterSubRule(29);
					try { dbg.enterDecision(29, decisionCanBacktrack[29]);

					switch ( input.LA(1) ) {
					case 58:
						{
						alt29=1;
						}
						break;
					case 75:
						{
						alt29=2;
						}
						break;
					case 86:
						{
						alt29=3;
						}
						break;
					case 56:
						{
						alt29=4;
						}
						break;
					case 62:
						{
						alt29=5;
						}
						break;
					case 35:
						{
						alt29=6;
						}
						break;
					case 36:
						{
						alt29=7;
						}
						break;
					case 85:
						{
						alt29=8;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(29);}

					switch (alt29) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:169:9: 'OR' ^
							{
							string_literal109=(Token)match(input,58,FOLLOW_58_in_logic_expr_bis1458); 
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:174:9: 'OR' ^
							{
							dbg.location(174,13);
							string_literal109=(Token)match(input,63,FOLLOW_63_in_logic_expr_bis1503); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							string_literal109_tree = (Object)adaptor.create(string_literal109);
							root_0 = (Object)adaptor.becomeRoot(string_literal109_tree, root_0);

							}
							break;
						case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:170:11: 'or' ^
							{
							string_literal110=(Token)match(input,75,FOLLOW_75_in_logic_expr_bis1472); 
=======
							dbg.enterAlt(2);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:175:11: 'or' ^
							{
							dbg.location(175,15);
							string_literal110=(Token)match(input,80,FOLLOW_80_in_logic_expr_bis1517); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							string_literal110_tree = (Object)adaptor.create(string_literal110);
							root_0 = (Object)adaptor.becomeRoot(string_literal110_tree, root_0);

							}
							break;
						case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:171:11: '||' ^
							{
							string_literal111=(Token)match(input,86,FOLLOW_86_in_logic_expr_bis1486); 
=======
							dbg.enterAlt(3);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:176:11: '||' ^
							{
							dbg.location(176,15);
							string_literal111=(Token)match(input,91,FOLLOW_91_in_logic_expr_bis1531); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							string_literal111_tree = (Object)adaptor.create(string_literal111);
							root_0 = (Object)adaptor.becomeRoot(string_literal111_tree, root_0);

							}
							break;
						case 4 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:172:11: 'AND' ^
							{
							string_literal112=(Token)match(input,56,FOLLOW_56_in_logic_expr_bis1500); 
=======
							dbg.enterAlt(4);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:177:11: 'AND' ^
							{
							dbg.location(177,16);
							string_literal112=(Token)match(input,61,FOLLOW_61_in_logic_expr_bis1545); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							string_literal112_tree = (Object)adaptor.create(string_literal112);
							root_0 = (Object)adaptor.becomeRoot(string_literal112_tree, root_0);

							}
							break;
						case 5 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:173:11: 'and' ^
							{
							string_literal113=(Token)match(input,62,FOLLOW_62_in_logic_expr_bis1514); 
=======
							dbg.enterAlt(5);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:178:11: 'and' ^
							{
							dbg.location(178,16);
							string_literal113=(Token)match(input,67,FOLLOW_67_in_logic_expr_bis1559); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							string_literal113_tree = (Object)adaptor.create(string_literal113);
							root_0 = (Object)adaptor.becomeRoot(string_literal113_tree, root_0);

							}
							break;
						case 6 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:174:11: '&&' ^
							{
							string_literal114=(Token)match(input,35,FOLLOW_35_in_logic_expr_bis1528); 
=======
							dbg.enterAlt(6);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:179:11: '&&' ^
							{
							dbg.location(179,15);
							string_literal114=(Token)match(input,40,FOLLOW_40_in_logic_expr_bis1573); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							string_literal114_tree = (Object)adaptor.create(string_literal114);
							root_0 = (Object)adaptor.becomeRoot(string_literal114_tree, root_0);

							}
							break;
						case 7 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:175:11: '&' ^
							{
							char_literal115=(Token)match(input,36,FOLLOW_36_in_logic_expr_bis1542); 
=======
							dbg.enterAlt(7);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:180:11: '&' ^
							{
							dbg.location(180,14);
							char_literal115=(Token)match(input,41,FOLLOW_41_in_logic_expr_bis1587); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							char_literal115_tree = (Object)adaptor.create(char_literal115);
							root_0 = (Object)adaptor.becomeRoot(char_literal115_tree, root_0);

							}
							break;
						case 8 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:176:11: '|' ^
							{
							char_literal116=(Token)match(input,85,FOLLOW_85_in_logic_expr_bis1555); 
=======
							dbg.enterAlt(8);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:181:11: '|' ^
							{
							dbg.location(181,14);
							char_literal116=(Token)match(input,90,FOLLOW_90_in_logic_expr_bis1600); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							char_literal116_tree = (Object)adaptor.create(char_literal116);
							root_0 = (Object)adaptor.becomeRoot(char_literal116_tree, root_0);

							}
							break;

					}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

					pushFollow(FOLLOW_logic_expr_ter_in_logic_expr_bis1568);
=======
					} finally {dbg.exitSubRule(29);}
					dbg.location(182,11);
					pushFollow(FOLLOW_logic_expr_ter_in_logic_expr_bis1613);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					logic_expr_ter117=logic_expr_ter();
					state._fsp--;

					adaptor.addChild(root_0, logic_expr_ter117.getTree());

					}
					break;

				default :
					break loop30;
				}
			}
			} finally {dbg.exitSubRule(30);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(183, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "logic_expr_bis");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "logic_expr_bis"


	public static class logic_expr_ter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logic_expr_ter"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:180:1: logic_expr_ter : add_expr ( ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr )* ;
	public final grammarA60Parserold.logic_expr_ter_return logic_expr_ter() throws RecognitionException {
		grammarA60Parserold.logic_expr_ter_return retval = new grammarA60Parserold.logic_expr_ter_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:185:1: logic_expr_ter : add_expr ( ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr )* ;
	public final grammarA60Parser.logic_expr_ter_return logic_expr_ter() throws RecognitionException {
		grammarA60Parser.logic_expr_ter_return retval = new grammarA60Parser.logic_expr_ter_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal119=null;
		Token char_literal120=null;
		Token string_literal121=null;
		Token string_literal122=null;
		Token char_literal123=null;
		Token string_literal124=null;
		ParserRuleReturnScope add_expr118 =null;
		ParserRuleReturnScope add_expr125 =null;

		Object char_literal119_tree=null;
		Object char_literal120_tree=null;
		Object string_literal121_tree=null;
		Object string_literal122_tree=null;
		Object char_literal123_tree=null;
		Object string_literal124_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "logic_expr_ter");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(185, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:180:15: ( add_expr ( ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr )* )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:181:5: add_expr ( ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr )*
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:185:15: ( add_expr ( ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr )* )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:186:5: add_expr ( ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr )*
>>>>>>> Stashed changes:output/grammarA60Parser.java
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
			pushFollow(FOLLOW_add_expr_in_logic_expr_ter1582);
=======
			dbg.location(186,5);
			pushFollow(FOLLOW_add_expr_in_logic_expr_ter1627);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			add_expr118=add_expr();
			state._fsp--;

			adaptor.addChild(root_0, add_expr118.getTree());
			dbg.location(186,14);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:186:14: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr )*
			try { dbg.enterSubRule(32);

<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:181:14: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr )*
=======
>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop32:
			while (true) {
				int alt32=2;
				try { dbg.enterDecision(32, decisionCanBacktrack[32]);

				int LA32_0 = input.LA(1);
				if ( ((LA32_0 >= 48 && LA32_0 <= 49)||(LA32_0 >= 51 && LA32_0 <= 52)||(LA32_0 >= 54 && LA32_0 <= 55)) ) {
					alt32=1;
				}

				} finally {dbg.exitDecision(32);}

				switch (alt32) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:182:9: ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr
					{
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:182:9: ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^)
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:187:9: ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr
					{
					dbg.location(187,9);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:187:9: ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^)
>>>>>>> Stashed changes:output/grammarA60Parser.java
					int alt31=6;
					try { dbg.enterSubRule(31);
					try { dbg.enterDecision(31, decisionCanBacktrack[31]);

					switch ( input.LA(1) ) {
					case 48:
						{
						alt31=1;
						}
						break;
					case 54:
						{
						alt31=2;
						}
						break;
					case 49:
						{
						alt31=3;
						}
						break;
					case 55:
						{
						alt31=4;
						}
						break;
					case 52:
						{
						alt31=5;
						}
						break;
					case 51:
						{
						alt31=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(31);}

					switch (alt31) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:183:9: '<' ^
							{
							char_literal119=(Token)match(input,48,FOLLOW_48_in_logic_expr_ter1604); 
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:188:9: '<' ^
							{
							dbg.location(188,12);
							char_literal119=(Token)match(input,53,FOLLOW_53_in_logic_expr_ter1649); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							char_literal119_tree = (Object)adaptor.create(char_literal119);
							root_0 = (Object)adaptor.becomeRoot(char_literal119_tree, root_0);

							}
							break;
						case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:184:11: '>' ^
							{
							char_literal120=(Token)match(input,54,FOLLOW_54_in_logic_expr_ter1618); 
=======
							dbg.enterAlt(2);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:189:11: '>' ^
							{
							dbg.location(189,14);
							char_literal120=(Token)match(input,59,FOLLOW_59_in_logic_expr_ter1663); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							char_literal120_tree = (Object)adaptor.create(char_literal120);
							root_0 = (Object)adaptor.becomeRoot(char_literal120_tree, root_0);

							}
							break;
						case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:185:11: '<=' ^
							{
							string_literal121=(Token)match(input,49,FOLLOW_49_in_logic_expr_ter1632); 
=======
							dbg.enterAlt(3);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:190:11: '<=' ^
							{
							dbg.location(190,15);
							string_literal121=(Token)match(input,54,FOLLOW_54_in_logic_expr_ter1677); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							string_literal121_tree = (Object)adaptor.create(string_literal121);
							root_0 = (Object)adaptor.becomeRoot(string_literal121_tree, root_0);

							}
							break;
						case 4 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:186:11: '>=' ^
							{
							string_literal122=(Token)match(input,55,FOLLOW_55_in_logic_expr_ter1646); 
=======
							dbg.enterAlt(4);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:191:11: '>=' ^
							{
							dbg.location(191,15);
							string_literal122=(Token)match(input,60,FOLLOW_60_in_logic_expr_ter1691); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							string_literal122_tree = (Object)adaptor.create(string_literal122);
							root_0 = (Object)adaptor.becomeRoot(string_literal122_tree, root_0);

							}
							break;
						case 5 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:187:11: '=' ^
							{
							char_literal123=(Token)match(input,52,FOLLOW_52_in_logic_expr_ter1660); 
=======
							dbg.enterAlt(5);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:192:11: '=' ^
							{
							dbg.location(192,14);
							char_literal123=(Token)match(input,57,FOLLOW_57_in_logic_expr_ter1705); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							char_literal123_tree = (Object)adaptor.create(char_literal123);
							root_0 = (Object)adaptor.becomeRoot(char_literal123_tree, root_0);

							}
							break;
						case 6 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:189:11: '<>' ^
							{
							string_literal124=(Token)match(input,51,FOLLOW_51_in_logic_expr_ter1683); 
=======
							dbg.enterAlt(6);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:194:11: '<>' ^
							{
							dbg.location(194,15);
							string_literal124=(Token)match(input,56,FOLLOW_56_in_logic_expr_ter1728); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							string_literal124_tree = (Object)adaptor.create(string_literal124);
							root_0 = (Object)adaptor.becomeRoot(string_literal124_tree, root_0);

							}
							break;

					}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

					pushFollow(FOLLOW_add_expr_in_logic_expr_ter1697);
=======
					} finally {dbg.exitSubRule(31);}
					dbg.location(195,11);
					pushFollow(FOLLOW_add_expr_in_logic_expr_ter1742);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					add_expr125=add_expr();
					state._fsp--;

					adaptor.addChild(root_0, add_expr125.getTree());

					}
					break;

				default :
					break loop32;
				}
			}
			} finally {dbg.exitSubRule(32);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(196, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "logic_expr_ter");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "logic_expr_ter"


	public static class add_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "add_expr"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:193:1: add_expr : ( '+' )? mult_expr ( ( '+' ^| '-' ^) mult_expr )* ;
	public final grammarA60Parserold.add_expr_return add_expr() throws RecognitionException {
		grammarA60Parserold.add_expr_return retval = new grammarA60Parserold.add_expr_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:198:1: add_expr : ( '+' )? mult_expr ( ( '+' ^| '-' ^) mult_expr )* ;
	public final grammarA60Parser.add_expr_return add_expr() throws RecognitionException {
		grammarA60Parser.add_expr_return retval = new grammarA60Parser.add_expr_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal126=null;
		Token char_literal128=null;
		Token char_literal129=null;
		ParserRuleReturnScope mult_expr127 =null;
		ParserRuleReturnScope mult_expr130 =null;

		Object char_literal126_tree=null;
		Object char_literal128_tree=null;
		Object char_literal129_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "add_expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(198, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:193:9: ( ( '+' )? mult_expr ( ( '+' ^| '-' ^) mult_expr )* )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:194:5: ( '+' )? mult_expr ( ( '+' ^| '-' ^) mult_expr )*
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:198:9: ( ( '+' )? mult_expr ( ( '+' ^| '-' ^) mult_expr )* )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:199:5: ( '+' )? mult_expr ( ( '+' ^| '-' ^) mult_expr )*
>>>>>>> Stashed changes:output/grammarA60Parser.java
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:194:5: ( '+' )?
=======
			dbg.location(199,5);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:199:5: ( '+' )?
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt33=2;
			try { dbg.enterSubRule(33);
			try { dbg.enterDecision(33, decisionCanBacktrack[33]);

			int LA33_0 = input.LA(1);
			if ( (LA33_0==41) ) {
				alt33=1;
			}
			} finally {dbg.exitDecision(33);}

			switch (alt33) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:194:6: '+'
					{
					char_literal126=(Token)match(input,41,FOLLOW_41_in_add_expr1712); 
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:199:6: '+'
					{
					dbg.location(199,6);
					char_literal126=(Token)match(input,46,FOLLOW_46_in_add_expr1757); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					char_literal126_tree = (Object)adaptor.create(char_literal126);
					adaptor.addChild(root_0, char_literal126_tree);

					}
					break;

			}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

			pushFollow(FOLLOW_mult_expr_in_add_expr1716);
=======
			} finally {dbg.exitSubRule(33);}
			dbg.location(199,12);
			pushFollow(FOLLOW_mult_expr_in_add_expr1761);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			mult_expr127=mult_expr();
			state._fsp--;

			adaptor.addChild(root_0, mult_expr127.getTree());
			dbg.location(199,22);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:199:22: ( ( '+' ^| '-' ^) mult_expr )*
			try { dbg.enterSubRule(35);

<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:194:22: ( ( '+' ^| '-' ^) mult_expr )*
=======
>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop35:
			while (true) {
				int alt35=2;
				try { dbg.enterDecision(35, decisionCanBacktrack[35]);

				int LA35_0 = input.LA(1);
				if ( (LA35_0==41||LA35_0==43) ) {
					alt35=1;
				}

				} finally {dbg.exitDecision(35);}

				switch (alt35) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:194:23: ( '+' ^| '-' ^) mult_expr
					{
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:194:23: ( '+' ^| '-' ^)
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:199:23: ( '+' ^| '-' ^) mult_expr
					{
					dbg.location(199,23);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:199:23: ( '+' ^| '-' ^)
>>>>>>> Stashed changes:output/grammarA60Parser.java
					int alt34=2;
					try { dbg.enterSubRule(34);
					try { dbg.enterDecision(34, decisionCanBacktrack[34]);

					int LA34_0 = input.LA(1);
					if ( (LA34_0==41) ) {
						alt34=1;
					}
					else if ( (LA34_0==43) ) {
						alt34=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(34);}

					switch (alt34) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:194:24: '+' ^
							{
							char_literal128=(Token)match(input,41,FOLLOW_41_in_add_expr1720); 
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:199:24: '+' ^
							{
							dbg.location(199,27);
							char_literal128=(Token)match(input,46,FOLLOW_46_in_add_expr1765); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							char_literal128_tree = (Object)adaptor.create(char_literal128);
							root_0 = (Object)adaptor.becomeRoot(char_literal128_tree, root_0);

							}
							break;
						case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:194:29: '-' ^
							{
							char_literal129=(Token)match(input,43,FOLLOW_43_in_add_expr1723); 
=======
							dbg.enterAlt(2);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:199:29: '-' ^
							{
							dbg.location(199,32);
							char_literal129=(Token)match(input,48,FOLLOW_48_in_add_expr1768); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							char_literal129_tree = (Object)adaptor.create(char_literal129);
							root_0 = (Object)adaptor.becomeRoot(char_literal129_tree, root_0);

							}
							break;

					}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

					pushFollow(FOLLOW_mult_expr_in_add_expr1727);
=======
					} finally {dbg.exitSubRule(34);}
					dbg.location(199,35);
					pushFollow(FOLLOW_mult_expr_in_add_expr1772);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					mult_expr130=mult_expr();
					state._fsp--;

					adaptor.addChild(root_0, mult_expr130.getTree());

					}
					break;

				default :
					break loop35;
				}
			}
			} finally {dbg.exitSubRule(35);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(200, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "add_expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "add_expr"


	public static class mult_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mult_expr"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:197:1: mult_expr : factor_expr ( ( '*' ^| '/' ^| '%' ^) factor_expr )* ;
	public final grammarA60Parserold.mult_expr_return mult_expr() throws RecognitionException {
		grammarA60Parserold.mult_expr_return retval = new grammarA60Parserold.mult_expr_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:202:1: mult_expr : factor_expr ( ( '*' ^| '/' ^| '%' ^) factor_expr )* ;
	public final grammarA60Parser.mult_expr_return mult_expr() throws RecognitionException {
		grammarA60Parser.mult_expr_return retval = new grammarA60Parser.mult_expr_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal132=null;
		Token char_literal133=null;
		Token char_literal134=null;
		ParserRuleReturnScope factor_expr131 =null;
		ParserRuleReturnScope factor_expr135 =null;

		Object char_literal132_tree=null;
		Object char_literal133_tree=null;
		Object char_literal134_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "mult_expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(202, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:197:10: ( factor_expr ( ( '*' ^| '/' ^| '%' ^) factor_expr )* )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:198:5: factor_expr ( ( '*' ^| '/' ^| '%' ^) factor_expr )*
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:202:10: ( factor_expr ( ( '*' ^| '/' ^| '%' ^) factor_expr )* )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:203:5: factor_expr ( ( '*' ^| '/' ^| '%' ^) factor_expr )*
>>>>>>> Stashed changes:output/grammarA60Parser.java
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
			pushFollow(FOLLOW_factor_expr_in_mult_expr1742);
=======
			dbg.location(203,5);
			pushFollow(FOLLOW_factor_expr_in_mult_expr1787);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			factor_expr131=factor_expr();
			state._fsp--;

			adaptor.addChild(root_0, factor_expr131.getTree());
			dbg.location(203,17);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:203:17: ( ( '*' ^| '/' ^| '%' ^) factor_expr )*
			try { dbg.enterSubRule(37);

<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:198:17: ( ( '*' ^| '/' ^| '%' ^) factor_expr )*
=======
>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop37:
			while (true) {
				int alt37=2;
				try { dbg.enterDecision(37, decisionCanBacktrack[37]);

				int LA37_0 = input.LA(1);
				if ( (LA37_0==34||LA37_0==39||LA37_0==44) ) {
					alt37=1;
				}

				} finally {dbg.exitDecision(37);}

				switch (alt37) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:199:9: ( '*' ^| '/' ^| '%' ^) factor_expr
					{
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:199:9: ( '*' ^| '/' ^| '%' ^)
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:204:9: ( '*' ^| '/' ^| '%' ^) factor_expr
					{
					dbg.location(204,9);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:204:9: ( '*' ^| '/' ^| '%' ^)
>>>>>>> Stashed changes:output/grammarA60Parser.java
					int alt36=3;
					try { dbg.enterSubRule(36);
					try { dbg.enterDecision(36, decisionCanBacktrack[36]);

					switch ( input.LA(1) ) {
					case 39:
						{
						alt36=1;
						}
						break;
					case 44:
						{
						alt36=2;
						}
						break;
					case 34:
						{
						alt36=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 36, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(36);}

					switch (alt36) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:200:9: '*' ^
							{
							char_literal132=(Token)match(input,39,FOLLOW_39_in_mult_expr1764); 
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:205:9: '*' ^
							{
							dbg.location(205,12);
							char_literal132=(Token)match(input,44,FOLLOW_44_in_mult_expr1809); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							char_literal132_tree = (Object)adaptor.create(char_literal132);
							root_0 = (Object)adaptor.becomeRoot(char_literal132_tree, root_0);

							}
							break;
						case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:201:11: '/' ^
							{
							char_literal133=(Token)match(input,44,FOLLOW_44_in_mult_expr1777); 
=======
							dbg.enterAlt(2);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:206:11: '/' ^
							{
							dbg.location(206,14);
							char_literal133=(Token)match(input,49,FOLLOW_49_in_mult_expr1822); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							char_literal133_tree = (Object)adaptor.create(char_literal133);
							root_0 = (Object)adaptor.becomeRoot(char_literal133_tree, root_0);

							}
							break;
						case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:202:11: '%' ^
							{
							char_literal134=(Token)match(input,34,FOLLOW_34_in_mult_expr1790); 
=======
							dbg.enterAlt(3);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:207:11: '%' ^
							{
							dbg.location(207,14);
							char_literal134=(Token)match(input,39,FOLLOW_39_in_mult_expr1835); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							char_literal134_tree = (Object)adaptor.create(char_literal134);
							root_0 = (Object)adaptor.becomeRoot(char_literal134_tree, root_0);

							}
							break;

					}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

					pushFollow(FOLLOW_factor_expr_in_mult_expr1803);
=======
					} finally {dbg.exitSubRule(36);}
					dbg.location(208,11);
					pushFollow(FOLLOW_factor_expr_in_mult_expr1848);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					factor_expr135=factor_expr();
					state._fsp--;

					adaptor.addChild(root_0, factor_expr135.getTree());

					}
					break;

				default :
					break loop37;
				}
			}
			} finally {dbg.exitSubRule(37);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(209, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mult_expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "mult_expr"


	public static class factor_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor_expr"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:206:1: factor_expr : ( '~' )? value ( '**' ( '~' )? value )* ;
	public final grammarA60Parserold.factor_expr_return factor_expr() throws RecognitionException {
		grammarA60Parserold.factor_expr_return retval = new grammarA60Parserold.factor_expr_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:211:1: factor_expr : ( '~' )? value ( '**' ^ ( '~' )? value )* ;
	public final grammarA60Parser.factor_expr_return factor_expr() throws RecognitionException {
		grammarA60Parser.factor_expr_return retval = new grammarA60Parser.factor_expr_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal136=null;
		Token string_literal138=null;
		Token char_literal139=null;
		ParserRuleReturnScope value137 =null;
		ParserRuleReturnScope value140 =null;

		Object char_literal136_tree=null;
		Object string_literal138_tree=null;
		Object char_literal139_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "factor_expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(211, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:206:12: ( ( '~' )? value ( '**' ( '~' )? value )* )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:207:5: ( '~' )? value ( '**' ( '~' )? value )*
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:211:12: ( ( '~' )? value ( '**' ^ ( '~' )? value )* )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:212:5: ( '~' )? value ( '**' ^ ( '~' )? value )*
>>>>>>> Stashed changes:output/grammarA60Parser.java
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:207:5: ( '~' )?
=======
			dbg.location(212,5);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:212:5: ( '~' )?
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt38=2;
			try { dbg.enterSubRule(38);
			try { dbg.enterDecision(38, decisionCanBacktrack[38]);

			int LA38_0 = input.LA(1);
			if ( (LA38_0==87) ) {
				alt38=1;
			}
			} finally {dbg.exitDecision(38);}

			switch (alt38) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:207:6: '~'
					{
					char_literal136=(Token)match(input,87,FOLLOW_87_in_factor_expr1818); 
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:212:6: '~'
					{
					dbg.location(212,6);
					char_literal136=(Token)match(input,92,FOLLOW_92_in_factor_expr1863); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					char_literal136_tree = (Object)adaptor.create(char_literal136);
					adaptor.addChild(root_0, char_literal136_tree);

					}
					break;

			}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

			pushFollow(FOLLOW_value_in_factor_expr1822);
=======
			} finally {dbg.exitSubRule(38);}
			dbg.location(212,12);
			pushFollow(FOLLOW_value_in_factor_expr1867);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			value137=value();
			state._fsp--;

			adaptor.addChild(root_0, value137.getTree());
			dbg.location(212,18);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:212:18: ( '**' ^ ( '~' )? value )*
			try { dbg.enterSubRule(40);

<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:207:18: ( '**' ( '~' )? value )*
=======
>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop40:
			while (true) {
				int alt40=2;
				try { dbg.enterDecision(40, decisionCanBacktrack[40]);

				int LA40_0 = input.LA(1);
				if ( (LA40_0==40) ) {
					alt40=1;
				}

				} finally {dbg.exitDecision(40);}

				switch (alt40) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:207:20: '**' ( '~' )? value
					{
					string_literal138=(Token)match(input,40,FOLLOW_40_in_factor_expr1826); 
					string_literal138_tree = (Object)adaptor.create(string_literal138);
					adaptor.addChild(root_0, string_literal138_tree);

					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:207:25: ( '~' )?
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:212:20: '**' ^ ( '~' )? value
					{
					dbg.location(212,24);
					string_literal138=(Token)match(input,45,FOLLOW_45_in_factor_expr1871); 
					string_literal138_tree = (Object)adaptor.create(string_literal138);
					root_0 = (Object)adaptor.becomeRoot(string_literal138_tree, root_0);
					dbg.location(212,26);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:212:26: ( '~' )?
>>>>>>> Stashed changes:output/grammarA60Parser.java
					int alt39=2;
					try { dbg.enterSubRule(39);
					try { dbg.enterDecision(39, decisionCanBacktrack[39]);

					int LA39_0 = input.LA(1);
					if ( (LA39_0==87) ) {
						alt39=1;
					}
					} finally {dbg.exitDecision(39);}

					switch (alt39) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:207:26: '~'
							{
							char_literal139=(Token)match(input,87,FOLLOW_87_in_factor_expr1829); 
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:212:27: '~'
							{
							dbg.location(212,27);
							char_literal139=(Token)match(input,92,FOLLOW_92_in_factor_expr1875); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
							char_literal139_tree = (Object)adaptor.create(char_literal139);
							adaptor.addChild(root_0, char_literal139_tree);

							}
							break;

					}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

					pushFollow(FOLLOW_value_in_factor_expr1833);
=======
					} finally {dbg.exitSubRule(39);}
					dbg.location(212,33);
					pushFollow(FOLLOW_value_in_factor_expr1879);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					value140=value();
					state._fsp--;

					adaptor.addChild(root_0, value140.getTree());

					}
					break;

				default :
					break loop40;
				}
			}
			} finally {dbg.exitSubRule(40);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(213, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "factor_expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "factor_expr"


	public static class value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:210:1: value : ( IDENTIFIER ( after_identifier )? -> IDENTIFIER ( after_identifier )? | '-' ^ UNSIGNED_NUMBER | UNSIGNED_NUMBER -> UNSIGNED_NUMBER | '(' boolean_expr ')' -> boolean_expr | 'FALSE' | 'TRUE' );
	public final grammarA60Parserold.value_return value() throws RecognitionException {
		grammarA60Parserold.value_return retval = new grammarA60Parserold.value_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:215:1: value : ( IDENTIFIER ( after_identifier )? -> ^( IDENTIFIER ( after_identifier )? ) | '-' ^ UNSIGNED_NUMBER | UNSIGNED_NUMBER -> UNSIGNED_NUMBER | '(' boolean_expr ')' -> boolean_expr | 'FALSE' | 'TRUE' );
	public final grammarA60Parser.value_return value() throws RecognitionException {
		grammarA60Parser.value_return retval = new grammarA60Parser.value_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER141=null;
		Token char_literal143=null;
		Token UNSIGNED_NUMBER144=null;
		Token UNSIGNED_NUMBER145=null;
		Token char_literal146=null;
		Token char_literal148=null;
		Token string_literal149=null;
		Token string_literal150=null;
		ParserRuleReturnScope after_identifier142 =null;
		ParserRuleReturnScope boolean_expr147 =null;

		Object IDENTIFIER141_tree=null;
		Object char_literal143_tree=null;
		Object UNSIGNED_NUMBER144_tree=null;
		Object UNSIGNED_NUMBER145_tree=null;
		Object char_literal146_tree=null;
		Object char_literal148_tree=null;
		Object string_literal149_tree=null;
		Object string_literal150_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_UNSIGNED_NUMBER=new RewriteRuleTokenStream(adaptor,"token UNSIGNED_NUMBER");
		RewriteRuleSubtreeStream stream_after_identifier=new RewriteRuleSubtreeStream(adaptor,"rule after_identifier");
		RewriteRuleSubtreeStream stream_boolean_expr=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expr");

		try { dbg.enterRule(getGrammarFileName(), "value");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(215, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:210:7: ( IDENTIFIER ( after_identifier )? -> IDENTIFIER ( after_identifier )? | '-' ^ UNSIGNED_NUMBER | UNSIGNED_NUMBER -> UNSIGNED_NUMBER | '(' boolean_expr ')' -> boolean_expr | 'FALSE' | 'TRUE' )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:215:7: ( IDENTIFIER ( after_identifier )? -> ^( IDENTIFIER ( after_identifier )? ) | '-' ^ UNSIGNED_NUMBER | UNSIGNED_NUMBER -> UNSIGNED_NUMBER | '(' boolean_expr ')' -> boolean_expr | 'FALSE' | 'TRUE' )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt42=6;
			try { dbg.enterDecision(42, decisionCanBacktrack[42]);

			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt42=1;
				}
				break;
			case 43:
				{
				alt42=2;
				}
				break;
			case UNSIGNED_NUMBER:
				{
				alt42=3;
				}
				break;
			case 37:
				{
				alt42=4;
				}
				break;
			case 57:
				{
				alt42=5;
				}
				break;
			case 59:
				{
				alt42=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(42);}

			switch (alt42) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:211:5: IDENTIFIER ( after_identifier )?
					{
					IDENTIFIER141=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_value1849);  
					stream_IDENTIFIER.add(IDENTIFIER141);

					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:211:16: ( after_identifier )?
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:216:5: IDENTIFIER ( after_identifier )?
					{
					dbg.location(216,5);
					IDENTIFIER141=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_value1895);  
					stream_IDENTIFIER.add(IDENTIFIER141);
					dbg.location(216,16);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:216:16: ( after_identifier )?
>>>>>>> Stashed changes:output/grammarA60Parser.java
					int alt41=2;
					try { dbg.enterSubRule(41);
					try { dbg.enterDecision(41, decisionCanBacktrack[41]);

					int LA41_0 = input.LA(1);
					if ( (LA41_0==37||LA41_0==60) ) {
						alt41=1;
					}
					} finally {dbg.exitDecision(41);}

					switch (alt41) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:211:17: after_identifier
							{
							pushFollow(FOLLOW_after_identifier_in_value1852);
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:216:17: after_identifier
							{
							dbg.location(216,17);
							pushFollow(FOLLOW_after_identifier_in_value1898);
>>>>>>> Stashed changes:output/grammarA60Parser.java
							after_identifier142=after_identifier();
							state._fsp--;

							stream_after_identifier.add(after_identifier142.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(41);}

					// AST REWRITE
					// elements: after_identifier, IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 211:36: -> IDENTIFIER ( after_identifier )?
					{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
						adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());
						// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:211:50: ( after_identifier )?
						if ( stream_after_identifier.hasNext() ) {
							adaptor.addChild(root_0, stream_after_identifier.nextTree());
=======
						dbg.location(216,39);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:216:39: ^( IDENTIFIER ( after_identifier )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(216,41);
						root_1 = (Object)adaptor.becomeRoot(stream_IDENTIFIER.nextNode(), root_1);
						dbg.location(216,52);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:216:52: ( after_identifier )?
						if ( stream_after_identifier.hasNext() ) {
							dbg.location(216,52);
							adaptor.addChild(root_1, stream_after_identifier.nextTree());
>>>>>>> Stashed changes:output/grammarA60Parser.java
						}
						stream_after_identifier.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:212:7: '-' ^ UNSIGNED_NUMBER
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:217:7: '-' ^ UNSIGNED_NUMBER
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					char_literal143=(Token)match(input,43,FOLLOW_43_in_value1869); 
					char_literal143_tree = (Object)adaptor.create(char_literal143);
					root_0 = (Object)adaptor.becomeRoot(char_literal143_tree, root_0);

					UNSIGNED_NUMBER144=(Token)match(input,UNSIGNED_NUMBER,FOLLOW_UNSIGNED_NUMBER_in_value1872); 
=======
					dbg.location(217,10);
					char_literal143=(Token)match(input,48,FOLLOW_48_in_value1917); 
					char_literal143_tree = (Object)adaptor.create(char_literal143);
					root_0 = (Object)adaptor.becomeRoot(char_literal143_tree, root_0);
					dbg.location(217,12);
					UNSIGNED_NUMBER144=(Token)match(input,UNSIGNED_NUMBER,FOLLOW_UNSIGNED_NUMBER_in_value1920); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					UNSIGNED_NUMBER144_tree = (Object)adaptor.create(UNSIGNED_NUMBER144);
					adaptor.addChild(root_0, UNSIGNED_NUMBER144_tree);

					}
					break;
				case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:213:7: UNSIGNED_NUMBER
					{
					UNSIGNED_NUMBER145=(Token)match(input,UNSIGNED_NUMBER,FOLLOW_UNSIGNED_NUMBER_in_value1880);  
=======
					dbg.enterAlt(3);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:218:7: UNSIGNED_NUMBER
					{
					dbg.location(218,7);
					UNSIGNED_NUMBER145=(Token)match(input,UNSIGNED_NUMBER,FOLLOW_UNSIGNED_NUMBER_in_value1928);  
>>>>>>> Stashed changes:output/grammarA60Parser.java
					stream_UNSIGNED_NUMBER.add(UNSIGNED_NUMBER145);

					// AST REWRITE
					// elements: UNSIGNED_NUMBER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 213:23: -> UNSIGNED_NUMBER
					{
						dbg.location(218,26);
						adaptor.addChild(root_0, stream_UNSIGNED_NUMBER.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:214:7: '(' boolean_expr ')'
					{
					char_literal146=(Token)match(input,37,FOLLOW_37_in_value1892);  
					stream_37.add(char_literal146);

					pushFollow(FOLLOW_boolean_expr_in_value1894);
					boolean_expr147=boolean_expr();
					state._fsp--;

					stream_boolean_expr.add(boolean_expr147.getTree());
					char_literal148=(Token)match(input,38,FOLLOW_38_in_value1896);  
					stream_38.add(char_literal148);
=======
					dbg.enterAlt(4);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:219:7: '(' boolean_expr ')'
					{
					dbg.location(219,7);
					char_literal146=(Token)match(input,42,FOLLOW_42_in_value1940);  
					stream_42.add(char_literal146);
					dbg.location(219,11);
					pushFollow(FOLLOW_boolean_expr_in_value1942);
					boolean_expr147=boolean_expr();
					state._fsp--;

					stream_boolean_expr.add(boolean_expr147.getTree());dbg.location(219,24);
					char_literal148=(Token)match(input,43,FOLLOW_43_in_value1944);  
					stream_43.add(char_literal148);
>>>>>>> Stashed changes:output/grammarA60Parser.java

					// AST REWRITE
					// elements: boolean_expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 214:28: -> boolean_expr
					{
						dbg.location(219,31);
						adaptor.addChild(root_0, stream_boolean_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:215:7: 'FALSE'
=======
					dbg.enterAlt(5);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:220:7: 'FALSE'
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					string_literal149=(Token)match(input,57,FOLLOW_57_in_value1908); 
=======
					dbg.location(220,7);
					string_literal149=(Token)match(input,62,FOLLOW_62_in_value1956); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					string_literal149_tree = (Object)adaptor.create(string_literal149);
					adaptor.addChild(root_0, string_literal149_tree);

					}
					break;
				case 6 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:216:7: 'TRUE'
=======
					dbg.enterAlt(6);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:221:7: 'TRUE'
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					string_literal150=(Token)match(input,59,FOLLOW_59_in_value1916); 
=======
					dbg.location(221,7);
					string_literal150=(Token)match(input,64,FOLLOW_64_in_value1964); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					string_literal150_tree = (Object)adaptor.create(string_literal150);
					adaptor.addChild(root_0, string_literal150_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(222, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "value");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "value"


	public static class after_identifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "after_identifier"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:219:1: after_identifier : ( actual_parameter_list | '[' boolean_expr ( ',' boolean_expr )* ']' -> ( boolean_expr )+ );
	public final grammarA60Parserold.after_identifier_return after_identifier() throws RecognitionException {
		grammarA60Parserold.after_identifier_return retval = new grammarA60Parserold.after_identifier_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:224:1: after_identifier : ( actual_parameter_list | '[' boolean_expr ( ',' boolean_expr )* ']' -> ( boolean_expr )+ );
	public final grammarA60Parser.after_identifier_return after_identifier() throws RecognitionException {
		grammarA60Parser.after_identifier_return retval = new grammarA60Parser.after_identifier_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal152=null;
		Token char_literal154=null;
		Token char_literal156=null;
		ParserRuleReturnScope actual_parameter_list151 =null;
		ParserRuleReturnScope boolean_expr153 =null;
		ParserRuleReturnScope boolean_expr155 =null;

		Object char_literal152_tree=null;
		Object char_literal154_tree=null;
		Object char_literal156_tree=null;
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_boolean_expr=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expr");

		try { dbg.enterRule(getGrammarFileName(), "after_identifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(224, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:219:17: ( actual_parameter_list | '[' boolean_expr ( ',' boolean_expr )* ']' -> ( boolean_expr )+ )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:224:17: ( actual_parameter_list | '[' boolean_expr ( ',' boolean_expr )* ']' -> ( boolean_expr )+ )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt44=2;
			try { dbg.enterDecision(44, decisionCanBacktrack[44]);

			int LA44_0 = input.LA(1);
			if ( (LA44_0==37) ) {
				alt44=1;
			}
			else if ( (LA44_0==60) ) {
				alt44=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(44);}

			switch (alt44) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:220:5: actual_parameter_list
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:225:5: actual_parameter_list
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					pushFollow(FOLLOW_actual_parameter_list_in_after_identifier1932);
=======
					dbg.location(225,5);
					pushFollow(FOLLOW_actual_parameter_list_in_after_identifier1980);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					actual_parameter_list151=actual_parameter_list();
					state._fsp--;

					adaptor.addChild(root_0, actual_parameter_list151.getTree());

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:221:7: '[' boolean_expr ( ',' boolean_expr )* ']'
					{
					char_literal152=(Token)match(input,60,FOLLOW_60_in_after_identifier1940);  
					stream_60.add(char_literal152);

					pushFollow(FOLLOW_boolean_expr_in_after_identifier1942);
					boolean_expr153=boolean_expr();
					state._fsp--;

					stream_boolean_expr.add(boolean_expr153.getTree());
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:221:24: ( ',' boolean_expr )*
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:226:7: '[' boolean_expr ( ',' boolean_expr )* ']'
					{
					dbg.location(226,7);
					char_literal152=(Token)match(input,65,FOLLOW_65_in_after_identifier1989);  
					stream_65.add(char_literal152);
					dbg.location(226,11);
					pushFollow(FOLLOW_boolean_expr_in_after_identifier1991);
					boolean_expr153=boolean_expr();
					state._fsp--;

					stream_boolean_expr.add(boolean_expr153.getTree());dbg.location(226,24);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:226:24: ( ',' boolean_expr )*
					try { dbg.enterSubRule(43);

>>>>>>> Stashed changes:output/grammarA60Parser.java
					loop43:
					while (true) {
						int alt43=2;
						try { dbg.enterDecision(43, decisionCanBacktrack[43]);

						int LA43_0 = input.LA(1);
						if ( (LA43_0==42) ) {
							alt43=1;
						}

						} finally {dbg.exitDecision(43);}

						switch (alt43) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:221:25: ',' boolean_expr
							{
							char_literal154=(Token)match(input,42,FOLLOW_42_in_after_identifier1945);  
							stream_42.add(char_literal154);

							pushFollow(FOLLOW_boolean_expr_in_after_identifier1946);
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:226:25: ',' boolean_expr
							{
							dbg.location(226,25);
							char_literal154=(Token)match(input,47,FOLLOW_47_in_after_identifier1994);  
							stream_47.add(char_literal154);
							dbg.location(226,28);
							pushFollow(FOLLOW_boolean_expr_in_after_identifier1995);
>>>>>>> Stashed changes:output/grammarA60Parser.java
							boolean_expr155=boolean_expr();
							state._fsp--;

							stream_boolean_expr.add(boolean_expr155.getTree());
							}
							break;

						default :
							break loop43;
						}
					}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

					char_literal156=(Token)match(input,61,FOLLOW_61_in_after_identifier1950);  
					stream_61.add(char_literal156);
=======
					} finally {dbg.exitSubRule(43);}
					dbg.location(226,43);
					char_literal156=(Token)match(input,66,FOLLOW_66_in_after_identifier1999);  
					stream_66.add(char_literal156);
>>>>>>> Stashed changes:output/grammarA60Parser.java

					// AST REWRITE
					// elements: boolean_expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 221:47: -> ( boolean_expr )+
					{
						dbg.location(226,51);
						if ( !(stream_boolean_expr.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_boolean_expr.hasNext() ) {
							dbg.location(226,51);
							adaptor.addChild(root_0, stream_boolean_expr.nextTree());
						}
						stream_boolean_expr.reset();

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(227, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "after_identifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "after_identifier"


	public static class if_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_statement"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:225:1: if_statement : if_clause program_bis ;
	public final grammarA60Parserold.if_statement_return if_statement() throws RecognitionException {
		grammarA60Parserold.if_statement_return retval = new grammarA60Parserold.if_statement_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:230:1: if_statement : if_clause program_bis ;
	public final grammarA60Parser.if_statement_return if_statement() throws RecognitionException {
		grammarA60Parser.if_statement_return retval = new grammarA60Parser.if_statement_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope if_clause157 =null;
		ParserRuleReturnScope program_bis158 =null;


		try { dbg.enterRule(getGrammarFileName(), "if_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(230, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:225:13: ( if_clause program_bis )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:226:5: if_clause program_bis
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:230:13: ( if_clause program_bis )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:231:5: if_clause program_bis
>>>>>>> Stashed changes:output/grammarA60Parser.java
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
			pushFollow(FOLLOW_if_clause_in_if_statement1968);
=======
			dbg.location(231,5);
			pushFollow(FOLLOW_if_clause_in_if_statement2018);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			if_clause157=if_clause();
			state._fsp--;

			adaptor.addChild(root_0, if_clause157.getTree());
<<<<<<< Updated upstream:output/grammarA60Parserold.java

			pushFollow(FOLLOW_program_bis_in_if_statement1970);
=======
			dbg.location(231,15);
			pushFollow(FOLLOW_program_bis_in_if_statement2020);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			program_bis158=program_bis();
			state._fsp--;

			adaptor.addChild(root_0, program_bis158.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(232, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "if_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "if_statement"


	public static class actual_parameter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actual_parameter"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:229:1: actual_parameter : ( STRING -> STRING | expression -> expression );
	public final grammarA60Parserold.actual_parameter_return actual_parameter() throws RecognitionException {
		grammarA60Parserold.actual_parameter_return retval = new grammarA60Parserold.actual_parameter_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:234:1: actual_parameter : ( STRING -> STRING | expression -> expression );
	public final grammarA60Parser.actual_parameter_return actual_parameter() throws RecognitionException {
		grammarA60Parser.actual_parameter_return retval = new grammarA60Parser.actual_parameter_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING159=null;
		ParserRuleReturnScope expression160 =null;

		Object STRING159_tree=null;
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try { dbg.enterRule(getGrammarFileName(), "actual_parameter");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(234, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:229:17: ( STRING -> STRING | expression -> expression )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:234:17: ( STRING -> STRING | expression -> expression )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt45=2;
			try { dbg.enterDecision(45, decisionCanBacktrack[45]);

			int LA45_0 = input.LA(1);
			if ( (LA45_0==STRING) ) {
				alt45=1;
			}
			else if ( (LA45_0==IDENTIFIER||LA45_0==TYPE||LA45_0==UNSIGNED_NUMBER||LA45_0==37||LA45_0==41||LA45_0==43||LA45_0==57||LA45_0==59||(LA45_0 >= 63 && LA45_0 <= 64)||(LA45_0 >= 69 && LA45_0 <= 73)||(LA45_0 >= 76 && LA45_0 <= 77)||LA45_0==80||LA45_0==87) ) {
				alt45=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(45);}

			switch (alt45) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:230:5: STRING
					{
					STRING159=(Token)match(input,STRING,FOLLOW_STRING_in_actual_parameter1982);  
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:235:5: STRING
					{
					dbg.location(235,5);
					STRING159=(Token)match(input,STRING,FOLLOW_STRING_in_actual_parameter2032);  
>>>>>>> Stashed changes:output/grammarA60Parser.java
					stream_STRING.add(STRING159);

					// AST REWRITE
					// elements: STRING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 230:12: -> STRING
					{
						dbg.location(235,15);
						adaptor.addChild(root_0, stream_STRING.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:231:11: expression
					{
					pushFollow(FOLLOW_expression_in_actual_parameter1998);
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:236:11: expression
					{
					dbg.location(236,11);
					pushFollow(FOLLOW_expression_in_actual_parameter2048);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					expression160=expression();
					state._fsp--;

					stream_expression.add(expression160.getTree());
					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 231:22: -> expression
					{
						dbg.location(236,25);
						adaptor.addChild(root_0, stream_expression.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(237, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "actual_parameter");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "actual_parameter"


	public static class actual_parameter_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actual_parameter_list"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:234:1: actual_parameter_list : '(' actparam1= actual_parameter ( ',' actparam2= actual_parameter )* ')' ( IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')' )* -> ^( PARAM_LIST ( actual_parameter )+ ( IDENTIFIER ( actual_parameter )+ )* ) ;
	public final grammarA60Parserold.actual_parameter_list_return actual_parameter_list() throws RecognitionException {
		grammarA60Parserold.actual_parameter_list_return retval = new grammarA60Parserold.actual_parameter_list_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:239:1: actual_parameter_list : '(' actparam1= actual_parameter ( ',' actparam2= actual_parameter )* ')' ( IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')' )* -> ^( PARAM_LIST ( actual_parameter )+ ( IDENTIFIER ( actual_parameter )+ )* ) ;
	public final grammarA60Parser.actual_parameter_list_return actual_parameter_list() throws RecognitionException {
		grammarA60Parser.actual_parameter_list_return retval = new grammarA60Parser.actual_parameter_list_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal161=null;
		Token char_literal162=null;
		Token char_literal163=null;
		Token IDENTIFIER164=null;
		Token char_literal165=null;
		Token char_literal166=null;
		Token char_literal167=null;
		Token char_literal168=null;
		ParserRuleReturnScope actparam1 =null;
		ParserRuleReturnScope actparam2 =null;
		ParserRuleReturnScope actparam3 =null;
		ParserRuleReturnScope actparam4 =null;

		Object char_literal161_tree=null;
		Object char_literal162_tree=null;
		Object char_literal163_tree=null;
		Object IDENTIFIER164_tree=null;
		Object char_literal165_tree=null;
		Object char_literal166_tree=null;
		Object char_literal167_tree=null;
		Object char_literal168_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_actual_parameter=new RewriteRuleSubtreeStream(adaptor,"rule actual_parameter");

		try { dbg.enterRule(getGrammarFileName(), "actual_parameter_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(239, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:234:22: ( '(' actparam1= actual_parameter ( ',' actparam2= actual_parameter )* ')' ( IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')' )* -> ^( PARAM_LIST ( actual_parameter )+ ( IDENTIFIER ( actual_parameter )+ )* ) )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:235:5: '(' actparam1= actual_parameter ( ',' actparam2= actual_parameter )* ')' ( IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')' )*
			{
			char_literal161=(Token)match(input,37,FOLLOW_37_in_actual_parameter_list2014);  
			stream_37.add(char_literal161);

			pushFollow(FOLLOW_actual_parameter_in_actual_parameter_list2018);
			actparam1=actual_parameter();
			state._fsp--;

			stream_actual_parameter.add(actparam1.getTree());
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:235:36: ( ',' actparam2= actual_parameter )*
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:239:22: ( '(' actparam1= actual_parameter ( ',' actparam2= actual_parameter )* ')' ( IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')' )* -> ^( PARAM_LIST ( actual_parameter )+ ( IDENTIFIER ( actual_parameter )+ )* ) )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:240:5: '(' actparam1= actual_parameter ( ',' actparam2= actual_parameter )* ')' ( IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')' )*
			{
			dbg.location(240,5);
			char_literal161=(Token)match(input,42,FOLLOW_42_in_actual_parameter_list2064);  
			stream_42.add(char_literal161);
			dbg.location(240,18);
			pushFollow(FOLLOW_actual_parameter_in_actual_parameter_list2068);
			actparam1=actual_parameter();
			state._fsp--;

			stream_actual_parameter.add(actparam1.getTree());dbg.location(240,36);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:240:36: ( ',' actparam2= actual_parameter )*
			try { dbg.enterSubRule(46);

>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop46:
			while (true) {
				int alt46=2;
				try { dbg.enterDecision(46, decisionCanBacktrack[46]);

				int LA46_0 = input.LA(1);
				if ( (LA46_0==42) ) {
					alt46=1;
				}

				} finally {dbg.exitDecision(46);}

				switch (alt46) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:235:37: ',' actparam2= actual_parameter
					{
					char_literal162=(Token)match(input,42,FOLLOW_42_in_actual_parameter_list2021);  
					stream_42.add(char_literal162);

					pushFollow(FOLLOW_actual_parameter_in_actual_parameter_list2025);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:240:37: ',' actparam2= actual_parameter
					{
					dbg.location(240,37);
					char_literal162=(Token)match(input,47,FOLLOW_47_in_actual_parameter_list2071);  
					stream_47.add(char_literal162);
					dbg.location(240,50);
					pushFollow(FOLLOW_actual_parameter_in_actual_parameter_list2075);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					actparam2=actual_parameter();
					state._fsp--;

					stream_actual_parameter.add(actparam2.getTree());
					}
					break;

				default :
					break loop46;
				}
			}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

			char_literal163=(Token)match(input,38,FOLLOW_38_in_actual_parameter_list2029);  
			stream_38.add(char_literal163);

			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:235:76: ( IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')' )*
=======
			} finally {dbg.exitSubRule(46);}
			dbg.location(240,70);
			char_literal163=(Token)match(input,43,FOLLOW_43_in_actual_parameter_list2079);  
			stream_43.add(char_literal163);
			dbg.location(240,76);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:240:76: ( IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')' )*
			try { dbg.enterSubRule(48);

>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop48:
			while (true) {
				int alt48=2;
				try { dbg.enterDecision(48, decisionCanBacktrack[48]);

				int LA48_0 = input.LA(1);
				if ( (LA48_0==IDENTIFIER) ) {
					alt48=1;
				}

				} finally {dbg.exitDecision(48);}

				switch (alt48) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:235:77: IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')'
					{
					IDENTIFIER164=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_actual_parameter_list2034);  
					stream_IDENTIFIER.add(IDENTIFIER164);

					char_literal165=(Token)match(input,45,FOLLOW_45_in_actual_parameter_list2036);  
					stream_45.add(char_literal165);

					char_literal166=(Token)match(input,37,FOLLOW_37_in_actual_parameter_list2038);  
					stream_37.add(char_literal166);

					pushFollow(FOLLOW_actual_parameter_in_actual_parameter_list2042);
					actparam3=actual_parameter();
					state._fsp--;

					stream_actual_parameter.add(actparam3.getTree());
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:235:123: ( ',' actparam4= actual_parameter )*
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:240:77: IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')'
					{
					dbg.location(240,77);
					IDENTIFIER164=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_actual_parameter_list2084);  
					stream_IDENTIFIER.add(IDENTIFIER164);
					dbg.location(240,88);
					char_literal165=(Token)match(input,50,FOLLOW_50_in_actual_parameter_list2086);  
					stream_50.add(char_literal165);
					dbg.location(240,92);
					char_literal166=(Token)match(input,42,FOLLOW_42_in_actual_parameter_list2088);  
					stream_42.add(char_literal166);
					dbg.location(240,105);
					pushFollow(FOLLOW_actual_parameter_in_actual_parameter_list2092);
					actparam3=actual_parameter();
					state._fsp--;

					stream_actual_parameter.add(actparam3.getTree());dbg.location(240,123);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:240:123: ( ',' actparam4= actual_parameter )*
					try { dbg.enterSubRule(47);

>>>>>>> Stashed changes:output/grammarA60Parser.java
					loop47:
					while (true) {
						int alt47=2;
						try { dbg.enterDecision(47, decisionCanBacktrack[47]);

						int LA47_0 = input.LA(1);
						if ( (LA47_0==42) ) {
							alt47=1;
						}

						} finally {dbg.exitDecision(47);}

						switch (alt47) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:235:124: ',' actparam4= actual_parameter
							{
							char_literal167=(Token)match(input,42,FOLLOW_42_in_actual_parameter_list2045);  
							stream_42.add(char_literal167);

							pushFollow(FOLLOW_actual_parameter_in_actual_parameter_list2049);
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:240:124: ',' actparam4= actual_parameter
							{
							dbg.location(240,124);
							char_literal167=(Token)match(input,47,FOLLOW_47_in_actual_parameter_list2095);  
							stream_47.add(char_literal167);
							dbg.location(240,137);
							pushFollow(FOLLOW_actual_parameter_in_actual_parameter_list2099);
>>>>>>> Stashed changes:output/grammarA60Parser.java
							actparam4=actual_parameter();
							state._fsp--;

							stream_actual_parameter.add(actparam4.getTree());
							}
							break;

						default :
							break loop47;
						}
					}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

					char_literal168=(Token)match(input,38,FOLLOW_38_in_actual_parameter_list2053);  
					stream_38.add(char_literal168);
=======
					} finally {dbg.exitSubRule(47);}
					dbg.location(240,157);
					char_literal168=(Token)match(input,43,FOLLOW_43_in_actual_parameter_list2103);  
					stream_43.add(char_literal168);
>>>>>>> Stashed changes:output/grammarA60Parser.java

					}
					break;

				default :
					break loop48;
				}
			}
			} finally {dbg.exitSubRule(48);}

			// AST REWRITE
			// elements: IDENTIFIER, actual_parameter, actual_parameter
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 236:5: -> ^( PARAM_LIST ( actual_parameter )+ ( IDENTIFIER ( actual_parameter )+ )* )
			{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:236:8: ^( PARAM_LIST ( actual_parameter )+ ( IDENTIFIER ( actual_parameter )+ )* )
=======
				dbg.location(241,8);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:241:8: ^( PARAM_LIST ( actual_parameter )+ ( IDENTIFIER ( actual_parameter )+ )* )
>>>>>>> Stashed changes:output/grammarA60Parser.java
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(241,10);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM_LIST, "PARAM_LIST"), root_1);
				dbg.location(241,21);
				if ( !(stream_actual_parameter.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_actual_parameter.hasNext() ) {
					dbg.location(241,21);
					adaptor.addChild(root_1, stream_actual_parameter.nextTree());
				}
				stream_actual_parameter.reset();
<<<<<<< Updated upstream:output/grammarA60Parserold.java

				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:236:39: ( IDENTIFIER ( actual_parameter )+ )*
=======
				dbg.location(241,39);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:241:39: ( IDENTIFIER ( actual_parameter )+ )*
>>>>>>> Stashed changes:output/grammarA60Parser.java
				while ( stream_IDENTIFIER.hasNext() ) {
					dbg.location(241,40);
					adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());dbg.location(241,51);
					if ( !(stream_actual_parameter.hasNext()) ) {
						throw new RewriteEarlyExitException();
					}
					while ( stream_actual_parameter.hasNext() ) {
						dbg.location(241,51);
						adaptor.addChild(root_1, stream_actual_parameter.nextTree());
					}
					stream_actual_parameter.reset();

				}
				stream_IDENTIFIER.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(242, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "actual_parameter_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "actual_parameter_list"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:239:1: declaration : ( type_array_proc_declaration -> type_array_proc_declaration | array_declaration | switch_declaration | procedure_declaration );
	public final grammarA60Parserold.declaration_return declaration() throws RecognitionException {
		grammarA60Parserold.declaration_return retval = new grammarA60Parserold.declaration_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:244:1: declaration : ( type_array_proc_declaration | array_declaration | switch_declaration | procedure_declaration );
	public final grammarA60Parser.declaration_return declaration() throws RecognitionException {
		grammarA60Parser.declaration_return retval = new grammarA60Parser.declaration_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_array_proc_declaration169 =null;
		ParserRuleReturnScope array_declaration170 =null;
		ParserRuleReturnScope switch_declaration171 =null;
		ParserRuleReturnScope procedure_declaration172 =null;

		RewriteRuleSubtreeStream stream_type_array_proc_declaration=new RewriteRuleSubtreeStream(adaptor,"rule type_array_proc_declaration");

		try { dbg.enterRule(getGrammarFileName(), "declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(244, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:239:12: ( type_array_proc_declaration -> type_array_proc_declaration | array_declaration | switch_declaration | procedure_declaration )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:244:12: ( type_array_proc_declaration | array_declaration | switch_declaration | procedure_declaration )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt49=4;
			try { dbg.enterDecision(49, decisionCanBacktrack[49]);

			switch ( input.LA(1) ) {
			case TYPE:
			case 76:
				{
				alt49=1;
				}
				break;
			case 63:
				{
				alt49=2;
				}
				break;
			case 80:
				{
				alt49=3;
				}
				break;
			case 77:
				{
				alt49=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(49);}

			switch (alt49) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:240:5: type_array_proc_declaration
					{
					pushFollow(FOLLOW_type_array_proc_declaration_in_declaration2088);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:245:5: type_array_proc_declaration
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(245,5);
					pushFollow(FOLLOW_type_array_proc_declaration_in_declaration2138);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					type_array_proc_declaration169=type_array_proc_declaration();
					state._fsp--;

					stream_type_array_proc_declaration.add(type_array_proc_declaration169.getTree());
					// AST REWRITE
					// elements: type_array_proc_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 240:33: -> type_array_proc_declaration
					{
						adaptor.addChild(root_0, stream_type_array_proc_declaration.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:241:7: array_declaration
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:246:7: array_declaration
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					pushFollow(FOLLOW_array_declaration_in_declaration2100);
=======
					dbg.location(246,7);
					pushFollow(FOLLOW_array_declaration_in_declaration2147);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					array_declaration170=array_declaration();
					state._fsp--;

					adaptor.addChild(root_0, array_declaration170.getTree());

					}
					break;
				case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:242:7: switch_declaration
=======
					dbg.enterAlt(3);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:247:7: switch_declaration
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					pushFollow(FOLLOW_switch_declaration_in_declaration2108);
=======
					dbg.location(247,7);
					pushFollow(FOLLOW_switch_declaration_in_declaration2155);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					switch_declaration171=switch_declaration();
					state._fsp--;

					adaptor.addChild(root_0, switch_declaration171.getTree());

					}
					break;
				case 4 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:243:7: procedure_declaration
=======
					dbg.enterAlt(4);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:248:7: procedure_declaration
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					pushFollow(FOLLOW_procedure_declaration_in_declaration2116);
=======
					dbg.location(248,7);
					pushFollow(FOLLOW_procedure_declaration_in_declaration2163);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					procedure_declaration172=procedure_declaration();
					state._fsp--;

					adaptor.addChild(root_0, procedure_declaration172.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(250, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "declaration"


	public static class type_array_proc_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_array_proc_declaration"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:247:1: type_array_proc_declaration : ( 'own' type_array_proc_declaration_bis | TYPE type_array_proc_declaration_ter -> ^( TYPARPROCDEC TYPE type_array_proc_declaration_ter ) );
	public final grammarA60Parserold.type_array_proc_declaration_return type_array_proc_declaration() throws RecognitionException {
		grammarA60Parserold.type_array_proc_declaration_return retval = new grammarA60Parserold.type_array_proc_declaration_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:252:1: type_array_proc_declaration : ( 'own' type_array_proc_declaration_bis | TYPE type_array_proc_declaration_ter -> ^( TYPARPROCDEC TYPE type_array_proc_declaration_ter ) );
	public final grammarA60Parser.type_array_proc_declaration_return type_array_proc_declaration() throws RecognitionException {
		grammarA60Parser.type_array_proc_declaration_return retval = new grammarA60Parser.type_array_proc_declaration_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal173=null;
		Token TYPE175=null;
		ParserRuleReturnScope type_array_proc_declaration_bis174 =null;
		ParserRuleReturnScope type_array_proc_declaration_ter176 =null;

		Object string_literal173_tree=null;
		Object TYPE175_tree=null;
		RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
		RewriteRuleSubtreeStream stream_type_array_proc_declaration_ter=new RewriteRuleSubtreeStream(adaptor,"rule type_array_proc_declaration_ter");

		try { dbg.enterRule(getGrammarFileName(), "type_array_proc_declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(252, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:247:28: ( 'own' type_array_proc_declaration_bis | TYPE type_array_proc_declaration_ter -> ^( TYPARPROCDEC TYPE type_array_proc_declaration_ter ) )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:252:28: ( 'own' type_array_proc_declaration_bis | TYPE type_array_proc_declaration_ter -> ^( TYPARPROCDEC TYPE type_array_proc_declaration_ter ) )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt50=2;
			try { dbg.enterDecision(50, decisionCanBacktrack[50]);

			int LA50_0 = input.LA(1);
			if ( (LA50_0==76) ) {
				alt50=1;
			}
			else if ( (LA50_0==TYPE) ) {
				alt50=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(50);}

			switch (alt50) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:248:5: 'own' type_array_proc_declaration_bis
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:253:5: 'own' type_array_proc_declaration_bis
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					string_literal173=(Token)match(input,76,FOLLOW_76_in_type_array_proc_declaration2129); 
					string_literal173_tree = (Object)adaptor.create(string_literal173);
					adaptor.addChild(root_0, string_literal173_tree);

					pushFollow(FOLLOW_type_array_proc_declaration_bis_in_type_array_proc_declaration2131);
=======
					dbg.location(253,5);
					string_literal173=(Token)match(input,81,FOLLOW_81_in_type_array_proc_declaration2177); 
					string_literal173_tree = (Object)adaptor.create(string_literal173);
					adaptor.addChild(root_0, string_literal173_tree);
					dbg.location(253,11);
					pushFollow(FOLLOW_type_array_proc_declaration_bis_in_type_array_proc_declaration2179);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					type_array_proc_declaration_bis174=type_array_proc_declaration_bis();
					state._fsp--;

					adaptor.addChild(root_0, type_array_proc_declaration_bis174.getTree());

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:249:11: TYPE type_array_proc_declaration_ter
					{
					TYPE175=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_array_proc_declaration2143);  
					stream_TYPE.add(TYPE175);

					pushFollow(FOLLOW_type_array_proc_declaration_ter_in_type_array_proc_declaration2147);
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:254:11: TYPE type_array_proc_declaration_ter
					{
					dbg.location(254,11);
					TYPE175=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_array_proc_declaration2191);  
					stream_TYPE.add(TYPE175);
					dbg.location(254,18);
					pushFollow(FOLLOW_type_array_proc_declaration_ter_in_type_array_proc_declaration2195);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					type_array_proc_declaration_ter176=type_array_proc_declaration_ter();
					state._fsp--;

					stream_type_array_proc_declaration_ter.add(type_array_proc_declaration_ter176.getTree());
					// AST REWRITE
					// elements: type_array_proc_declaration_ter, TYPE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 249:50: -> ^( TYPARPROCDEC TYPE type_array_proc_declaration_ter )
					{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
						// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:249:53: ^( TYPARPROCDEC TYPE type_array_proc_declaration_ter )
=======
						dbg.location(254,53);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:254:53: ^( TYPARPROCDEC TYPE type_array_proc_declaration_ter )
>>>>>>> Stashed changes:output/grammarA60Parser.java
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(254,55);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPARPROCDEC, "TYPARPROCDEC"), root_1);
						dbg.location(254,68);
						adaptor.addChild(root_1, stream_TYPE.nextNode());dbg.location(254,73);
						adaptor.addChild(root_1, stream_type_array_proc_declaration_ter.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(255, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type_array_proc_declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "type_array_proc_declaration"


	public static class type_array_proc_declaration_bis_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_array_proc_declaration_bis"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:252:1: type_array_proc_declaration_bis : ( array_declaration | TYPE ( type_list | array_declaration ) );
	public final grammarA60Parserold.type_array_proc_declaration_bis_return type_array_proc_declaration_bis() throws RecognitionException {
		grammarA60Parserold.type_array_proc_declaration_bis_return retval = new grammarA60Parserold.type_array_proc_declaration_bis_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:257:1: type_array_proc_declaration_bis : ( array_declaration | TYPE ( type_list | array_declaration ) );
	public final grammarA60Parser.type_array_proc_declaration_bis_return type_array_proc_declaration_bis() throws RecognitionException {
		grammarA60Parser.type_array_proc_declaration_bis_return retval = new grammarA60Parser.type_array_proc_declaration_bis_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TYPE178=null;
		ParserRuleReturnScope array_declaration177 =null;
		ParserRuleReturnScope type_list179 =null;
		ParserRuleReturnScope array_declaration180 =null;

		Object TYPE178_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "type_array_proc_declaration_bis");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(257, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:252:32: ( array_declaration | TYPE ( type_list | array_declaration ) )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:257:32: ( array_declaration | TYPE ( type_list | array_declaration ) )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt52=2;
			try { dbg.enterDecision(52, decisionCanBacktrack[52]);

			int LA52_0 = input.LA(1);
			if ( (LA52_0==63) ) {
				alt52=1;
			}
			else if ( (LA52_0==TYPE) ) {
				alt52=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(52);}

			switch (alt52) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:253:5: array_declaration
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:258:5: array_declaration
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					pushFollow(FOLLOW_array_declaration_in_type_array_proc_declaration_bis2169);
=======
					dbg.location(258,5);
					pushFollow(FOLLOW_array_declaration_in_type_array_proc_declaration_bis2218);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					array_declaration177=array_declaration();
					state._fsp--;

					adaptor.addChild(root_0, array_declaration177.getTree());

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:254:11: TYPE ( type_list | array_declaration )
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:259:11: TYPE ( type_list | array_declaration )
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					TYPE178=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_array_proc_declaration_bis2181); 
					TYPE178_tree = (Object)adaptor.create(TYPE178);
					adaptor.addChild(root_0, TYPE178_tree);

					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:254:16: ( type_list | array_declaration )
=======
					dbg.location(259,11);
					TYPE178=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_array_proc_declaration_bis2230); 
					TYPE178_tree = (Object)adaptor.create(TYPE178);
					adaptor.addChild(root_0, TYPE178_tree);
					dbg.location(259,16);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:259:16: ( type_list | array_declaration )
>>>>>>> Stashed changes:output/grammarA60Parser.java
					int alt51=2;
					try { dbg.enterSubRule(51);
					try { dbg.enterDecision(51, decisionCanBacktrack[51]);

					int LA51_0 = input.LA(1);
					if ( (LA51_0==IDENTIFIER) ) {
						alt51=1;
					}
					else if ( (LA51_0==63) ) {
						alt51=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 51, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(51);}

					switch (alt51) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:254:17: type_list
							{
							pushFollow(FOLLOW_type_list_in_type_array_proc_declaration_bis2184);
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:259:17: type_list
							{
							dbg.location(259,17);
							pushFollow(FOLLOW_type_list_in_type_array_proc_declaration_bis2233);
>>>>>>> Stashed changes:output/grammarA60Parser.java
							type_list179=type_list();
							state._fsp--;

							adaptor.addChild(root_0, type_list179.getTree());

							}
							break;
						case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:254:28: array_declaration
							{
							pushFollow(FOLLOW_array_declaration_in_type_array_proc_declaration_bis2187);
=======
							dbg.enterAlt(2);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:259:28: array_declaration
							{
							dbg.location(259,28);
							pushFollow(FOLLOW_array_declaration_in_type_array_proc_declaration_bis2236);
>>>>>>> Stashed changes:output/grammarA60Parser.java
							array_declaration180=array_declaration();
							state._fsp--;

							adaptor.addChild(root_0, array_declaration180.getTree());

							}
							break;

					}
					} finally {dbg.exitSubRule(51);}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(260, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type_array_proc_declaration_bis");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "type_array_proc_declaration_bis"


	public static class type_array_proc_declaration_ter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_array_proc_declaration_ter"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:257:1: type_array_proc_declaration_ter : ( procedure_declaration | array_declaration | type_list -> type_list );
	public final grammarA60Parserold.type_array_proc_declaration_ter_return type_array_proc_declaration_ter() throws RecognitionException {
		grammarA60Parserold.type_array_proc_declaration_ter_return retval = new grammarA60Parserold.type_array_proc_declaration_ter_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:262:1: type_array_proc_declaration_ter : ( procedure_declaration | array_declaration | type_list -> type_list );
	public final grammarA60Parser.type_array_proc_declaration_ter_return type_array_proc_declaration_ter() throws RecognitionException {
		grammarA60Parser.type_array_proc_declaration_ter_return retval = new grammarA60Parser.type_array_proc_declaration_ter_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope procedure_declaration181 =null;
		ParserRuleReturnScope array_declaration182 =null;
		ParserRuleReturnScope type_list183 =null;

		RewriteRuleSubtreeStream stream_type_list=new RewriteRuleSubtreeStream(adaptor,"rule type_list");

		try { dbg.enterRule(getGrammarFileName(), "type_array_proc_declaration_ter");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(262, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:257:32: ( procedure_declaration | array_declaration | type_list -> type_list )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:262:32: ( procedure_declaration | array_declaration | type_list -> type_list )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt53=3;
			try { dbg.enterDecision(53, decisionCanBacktrack[53]);

			switch ( input.LA(1) ) {
			case 77:
				{
				alt53=1;
				}
				break;
			case 63:
				{
				alt53=2;
				}
				break;
			case IDENTIFIER:
				{
				alt53=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(53);}

			switch (alt53) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:258:5: procedure_declaration
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:263:5: procedure_declaration
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					pushFollow(FOLLOW_procedure_declaration_in_type_array_proc_declaration_ter2200);
=======
					dbg.location(263,5);
					pushFollow(FOLLOW_procedure_declaration_in_type_array_proc_declaration_ter2249);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					procedure_declaration181=procedure_declaration();
					state._fsp--;

					adaptor.addChild(root_0, procedure_declaration181.getTree());

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:259:11: array_declaration
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:264:11: array_declaration
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					pushFollow(FOLLOW_array_declaration_in_type_array_proc_declaration_ter2212);
=======
					dbg.location(264,11);
					pushFollow(FOLLOW_array_declaration_in_type_array_proc_declaration_ter2261);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					array_declaration182=array_declaration();
					state._fsp--;

					adaptor.addChild(root_0, array_declaration182.getTree());

					}
					break;
				case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:260:11: type_list
					{
					pushFollow(FOLLOW_type_list_in_type_array_proc_declaration_ter2224);
=======
					dbg.enterAlt(3);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:265:11: type_list
					{
					dbg.location(265,11);
					pushFollow(FOLLOW_type_list_in_type_array_proc_declaration_ter2273);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					type_list183=type_list();
					state._fsp--;

					stream_type_list.add(type_list183.getTree());
					// AST REWRITE
					// elements: type_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 260:21: -> type_list
					{
						dbg.location(265,24);
						adaptor.addChild(root_0, stream_type_list.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(266, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type_array_proc_declaration_ter");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "type_array_proc_declaration_ter"


	public static class type_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_list"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:264:1: type_list : IDENTIFIER ( ',' IDENTIFIER )* -> ( IDENTIFIER )+ ;
	public final grammarA60Parserold.type_list_return type_list() throws RecognitionException {
		grammarA60Parserold.type_list_return retval = new grammarA60Parserold.type_list_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:269:1: type_list : IDENTIFIER ( ',' IDENTIFIER )* -> ( IDENTIFIER )+ ;
	public final grammarA60Parser.type_list_return type_list() throws RecognitionException {
		grammarA60Parser.type_list_return retval = new grammarA60Parser.type_list_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER184=null;
		Token char_literal185=null;
		Token IDENTIFIER186=null;

		Object IDENTIFIER184_tree=null;
		Object char_literal185_tree=null;
		Object IDENTIFIER186_tree=null;
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");

		try { dbg.enterRule(getGrammarFileName(), "type_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(269, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:264:10: ( IDENTIFIER ( ',' IDENTIFIER )* -> ( IDENTIFIER )+ )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:265:5: IDENTIFIER ( ',' IDENTIFIER )*
			{
			IDENTIFIER184=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_list2241);  
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:269:10: ( IDENTIFIER ( ',' IDENTIFIER )* -> ( IDENTIFIER )+ )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:270:5: IDENTIFIER ( ',' IDENTIFIER )*
			{
			dbg.location(270,5);
			IDENTIFIER184=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_list2290);  
>>>>>>> Stashed changes:output/grammarA60Parser.java
			stream_IDENTIFIER.add(IDENTIFIER184);
			dbg.location(270,16);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:270:16: ( ',' IDENTIFIER )*
			try { dbg.enterSubRule(54);

<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:265:16: ( ',' IDENTIFIER )*
=======
>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop54:
			while (true) {
				int alt54=2;
				try { dbg.enterDecision(54, decisionCanBacktrack[54]);

				int LA54_0 = input.LA(1);
				if ( (LA54_0==42) ) {
					alt54=1;
				}

				} finally {dbg.exitDecision(54);}

				switch (alt54) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:265:17: ',' IDENTIFIER
					{
					char_literal185=(Token)match(input,42,FOLLOW_42_in_type_list2244);  
					stream_42.add(char_literal185);

					IDENTIFIER186=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_list2246);  
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:270:17: ',' IDENTIFIER
					{
					dbg.location(270,17);
					char_literal185=(Token)match(input,47,FOLLOW_47_in_type_list2293);  
					stream_47.add(char_literal185);
					dbg.location(270,21);
					IDENTIFIER186=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_list2295);  
>>>>>>> Stashed changes:output/grammarA60Parser.java
					stream_IDENTIFIER.add(IDENTIFIER186);

					}
					break;

				default :
					break loop54;
				}
			}
			} finally {dbg.exitSubRule(54);}

			// AST REWRITE
			// elements: IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 265:34: -> ( IDENTIFIER )+
			{
				dbg.location(270,37);
				if ( !(stream_IDENTIFIER.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_IDENTIFIER.hasNext() ) {
					dbg.location(270,37);
					adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());
				}
				stream_IDENTIFIER.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(271, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "type_list"


	public static class bound_pair_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bound_pair"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:268:1: bound_pair : exp1= expression ':' exp2= expression -> ^( BORNES $exp1 $exp2) ;
	public final grammarA60Parserold.bound_pair_return bound_pair() throws RecognitionException {
		grammarA60Parserold.bound_pair_return retval = new grammarA60Parserold.bound_pair_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:273:1: bound_pair : exp1= expression ':' exp2= expression -> ^( BORNES $exp1 $exp2) ;
	public final grammarA60Parser.bound_pair_return bound_pair() throws RecognitionException {
		grammarA60Parser.bound_pair_return retval = new grammarA60Parser.bound_pair_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal187=null;
		ParserRuleReturnScope exp1 =null;
		ParserRuleReturnScope exp2 =null;

		Object char_literal187_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try { dbg.enterRule(getGrammarFileName(), "bound_pair");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(273, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:268:12: (exp1= expression ':' exp2= expression -> ^( BORNES $exp1 $exp2) )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:269:5: exp1= expression ':' exp2= expression
			{
			pushFollow(FOLLOW_expression_in_bound_pair2268);
			exp1=expression();
			state._fsp--;

			stream_expression.add(exp1.getTree());
			char_literal187=(Token)match(input,45,FOLLOW_45_in_bound_pair2270);  
			stream_45.add(char_literal187);

			pushFollow(FOLLOW_expression_in_bound_pair2274);
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:273:12: (exp1= expression ':' exp2= expression -> ^( BORNES $exp1 $exp2) )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:274:5: exp1= expression ':' exp2= expression
			{
			dbg.location(274,9);
			pushFollow(FOLLOW_expression_in_bound_pair2317);
			exp1=expression();
			state._fsp--;

			stream_expression.add(exp1.getTree());dbg.location(274,21);
			char_literal187=(Token)match(input,50,FOLLOW_50_in_bound_pair2319);  
			stream_50.add(char_literal187);
			dbg.location(274,29);
			pushFollow(FOLLOW_expression_in_bound_pair2323);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			exp2=expression();
			state._fsp--;

			stream_expression.add(exp2.getTree());
			// AST REWRITE
			// elements: exp1, exp2
			// token labels: 
			// rule labels: exp2, exp1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_exp2=new RewriteRuleSubtreeStream(adaptor,"rule exp2",exp2!=null?exp2.getTree():null);
			RewriteRuleSubtreeStream stream_exp1=new RewriteRuleSubtreeStream(adaptor,"rule exp1",exp1!=null?exp1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 269:41: -> ^( BORNES $exp1 $exp2)
			{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:269:44: ^( BORNES $exp1 $exp2)
=======
				dbg.location(274,44);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:274:44: ^( BORNES $exp1 $exp2)
>>>>>>> Stashed changes:output/grammarA60Parser.java
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(274,46);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BORNES, "BORNES"), root_1);
				dbg.location(274,54);
				adaptor.addChild(root_1, stream_exp1.nextTree());dbg.location(274,60);
				adaptor.addChild(root_1, stream_exp2.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(275, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bound_pair");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bound_pair"


	public static class bound_pair_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bound_pair_list"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:272:1: bound_pair_list : bound_pair ( ',' bound_pair )* -> ( bound_pair )+ ;
	public final grammarA60Parserold.bound_pair_list_return bound_pair_list() throws RecognitionException {
		grammarA60Parserold.bound_pair_list_return retval = new grammarA60Parserold.bound_pair_list_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:277:1: bound_pair_list : bound_pair ( ',' bound_pair )* -> ( bound_pair )+ ;
	public final grammarA60Parser.bound_pair_list_return bound_pair_list() throws RecognitionException {
		grammarA60Parser.bound_pair_list_return retval = new grammarA60Parser.bound_pair_list_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal189=null;
		ParserRuleReturnScope bound_pair188 =null;
		ParserRuleReturnScope bound_pair190 =null;

		Object char_literal189_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_bound_pair=new RewriteRuleSubtreeStream(adaptor,"rule bound_pair");

		try { dbg.enterRule(getGrammarFileName(), "bound_pair_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(277, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:272:16: ( bound_pair ( ',' bound_pair )* -> ( bound_pair )+ )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:273:5: bound_pair ( ',' bound_pair )*
			{
			pushFollow(FOLLOW_bound_pair_in_bound_pair_list2298);
			bound_pair188=bound_pair();
			state._fsp--;

			stream_bound_pair.add(bound_pair188.getTree());
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:273:16: ( ',' bound_pair )*
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:277:16: ( bound_pair ( ',' bound_pair )* -> ( bound_pair )+ )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:278:5: bound_pair ( ',' bound_pair )*
			{
			dbg.location(278,5);
			pushFollow(FOLLOW_bound_pair_in_bound_pair_list2347);
			bound_pair188=bound_pair();
			state._fsp--;

			stream_bound_pair.add(bound_pair188.getTree());dbg.location(278,16);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:278:16: ( ',' bound_pair )*
			try { dbg.enterSubRule(55);

>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop55:
			while (true) {
				int alt55=2;
				try { dbg.enterDecision(55, decisionCanBacktrack[55]);

				int LA55_0 = input.LA(1);
				if ( (LA55_0==42) ) {
					alt55=1;
				}

				} finally {dbg.exitDecision(55);}

				switch (alt55) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:273:17: ',' bound_pair
					{
					char_literal189=(Token)match(input,42,FOLLOW_42_in_bound_pair_list2301);  
					stream_42.add(char_literal189);

					pushFollow(FOLLOW_bound_pair_in_bound_pair_list2303);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:278:17: ',' bound_pair
					{
					dbg.location(278,17);
					char_literal189=(Token)match(input,47,FOLLOW_47_in_bound_pair_list2350);  
					stream_47.add(char_literal189);
					dbg.location(278,21);
					pushFollow(FOLLOW_bound_pair_in_bound_pair_list2352);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					bound_pair190=bound_pair();
					state._fsp--;

					stream_bound_pair.add(bound_pair190.getTree());
					}
					break;

				default :
					break loop55;
				}
			}
			} finally {dbg.exitSubRule(55);}

			// AST REWRITE
			// elements: bound_pair
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 273:34: -> ( bound_pair )+
			{
				dbg.location(278,37);
				if ( !(stream_bound_pair.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_bound_pair.hasNext() ) {
					dbg.location(278,37);
					adaptor.addChild(root_0, stream_bound_pair.nextTree());
				}
				stream_bound_pair.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(279, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bound_pair_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bound_pair_list"


	public static class array_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_declaration"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:276:1: array_declaration : 'array' array_list ;
	public final grammarA60Parserold.array_declaration_return array_declaration() throws RecognitionException {
		grammarA60Parserold.array_declaration_return retval = new grammarA60Parserold.array_declaration_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:281:1: array_declaration : 'array' array_list ;
	public final grammarA60Parser.array_declaration_return array_declaration() throws RecognitionException {
		grammarA60Parser.array_declaration_return retval = new grammarA60Parser.array_declaration_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal191=null;
		ParserRuleReturnScope array_list192 =null;

		Object string_literal191_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "array_declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(281, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:276:18: ( 'array' array_list )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:277:5: 'array' array_list
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:281:18: ( 'array' array_list )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:282:5: 'array' array_list
>>>>>>> Stashed changes:output/grammarA60Parser.java
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
			string_literal191=(Token)match(input,63,FOLLOW_63_in_array_declaration2322); 
			string_literal191_tree = (Object)adaptor.create(string_literal191);
			adaptor.addChild(root_0, string_literal191_tree);

			pushFollow(FOLLOW_array_list_in_array_declaration2324);
=======
			dbg.location(282,5);
			string_literal191=(Token)match(input,68,FOLLOW_68_in_array_declaration2371); 
			string_literal191_tree = (Object)adaptor.create(string_literal191);
			adaptor.addChild(root_0, string_literal191_tree);
			dbg.location(282,13);
			pushFollow(FOLLOW_array_list_in_array_declaration2373);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			array_list192=array_list();
			state._fsp--;

			adaptor.addChild(root_0, array_list192.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(283, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "array_declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "array_declaration"


	public static class array_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_list"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:280:1: array_list : array_segment ( ',' array_segment )* ;
	public final grammarA60Parserold.array_list_return array_list() throws RecognitionException {
		grammarA60Parserold.array_list_return retval = new grammarA60Parserold.array_list_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:285:1: array_list : array_segment ( ',' array_segment )* ;
	public final grammarA60Parser.array_list_return array_list() throws RecognitionException {
		grammarA60Parser.array_list_return retval = new grammarA60Parser.array_list_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal194=null;
		ParserRuleReturnScope array_segment193 =null;
		ParserRuleReturnScope array_segment195 =null;

		Object char_literal194_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "array_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(285, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:280:12: ( array_segment ( ',' array_segment )* )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:281:5: array_segment ( ',' array_segment )*
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:285:12: ( array_segment ( ',' array_segment )* )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:286:5: array_segment ( ',' array_segment )*
>>>>>>> Stashed changes:output/grammarA60Parser.java
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
			pushFollow(FOLLOW_array_segment_in_array_list2337);
=======
			dbg.location(286,5);
			pushFollow(FOLLOW_array_segment_in_array_list2386);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			array_segment193=array_segment();
			state._fsp--;

			adaptor.addChild(root_0, array_segment193.getTree());
			dbg.location(286,19);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:286:19: ( ',' array_segment )*
			try { dbg.enterSubRule(56);

<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:281:19: ( ',' array_segment )*
=======
>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop56:
			while (true) {
				int alt56=2;
				try { dbg.enterDecision(56, decisionCanBacktrack[56]);

				int LA56_0 = input.LA(1);
				if ( (LA56_0==42) ) {
					alt56=1;
				}

				} finally {dbg.exitDecision(56);}

				switch (alt56) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:281:20: ',' array_segment
					{
					char_literal194=(Token)match(input,42,FOLLOW_42_in_array_list2340); 
					char_literal194_tree = (Object)adaptor.create(char_literal194);
					adaptor.addChild(root_0, char_literal194_tree);

					pushFollow(FOLLOW_array_segment_in_array_list2342);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:286:20: ',' array_segment
					{
					dbg.location(286,20);
					char_literal194=(Token)match(input,47,FOLLOW_47_in_array_list2389); 
					char_literal194_tree = (Object)adaptor.create(char_literal194);
					adaptor.addChild(root_0, char_literal194_tree);
					dbg.location(286,24);
					pushFollow(FOLLOW_array_segment_in_array_list2391);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					array_segment195=array_segment();
					state._fsp--;

					adaptor.addChild(root_0, array_segment195.getTree());

					}
					break;

				default :
					break loop56;
				}
			}
			} finally {dbg.exitSubRule(56);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(287, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "array_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "array_list"


	public static class array_segment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_segment"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:284:1: array_segment : IDENTIFIER ( '[' bound_pair_list ']' -> ^( ARRAYSEG IDENTIFIER bound_pair_list ) | array_segment -> ^( ARRAYSEG array_segment ) ) ;
	public final grammarA60Parserold.array_segment_return array_segment() throws RecognitionException {
		grammarA60Parserold.array_segment_return retval = new grammarA60Parserold.array_segment_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:289:1: array_segment : IDENTIFIER ( '[' bound_pair_list ']' -> ^( ARRAYSEG IDENTIFIER bound_pair_list ) | array_segment -> ^( ARRAYSEG array_segment ) ) ;
	public final grammarA60Parser.array_segment_return array_segment() throws RecognitionException {
		grammarA60Parser.array_segment_return retval = new grammarA60Parser.array_segment_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER196=null;
		Token char_literal197=null;
		Token char_literal199=null;
		ParserRuleReturnScope bound_pair_list198 =null;
		ParserRuleReturnScope array_segment200 =null;

		Object IDENTIFIER196_tree=null;
		Object char_literal197_tree=null;
		Object char_literal199_tree=null;
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_array_segment=new RewriteRuleSubtreeStream(adaptor,"rule array_segment");
		RewriteRuleSubtreeStream stream_bound_pair_list=new RewriteRuleSubtreeStream(adaptor,"rule bound_pair_list");

		try { dbg.enterRule(getGrammarFileName(), "array_segment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(289, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:284:14: ( IDENTIFIER ( '[' bound_pair_list ']' -> ^( ARRAYSEG IDENTIFIER bound_pair_list ) | array_segment -> ^( ARRAYSEG array_segment ) ) )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:285:5: IDENTIFIER ( '[' bound_pair_list ']' -> ^( ARRAYSEG IDENTIFIER bound_pair_list ) | array_segment -> ^( ARRAYSEG array_segment ) )
			{
			IDENTIFIER196=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_array_segment2356);  
			stream_IDENTIFIER.add(IDENTIFIER196);

			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:285:16: ( '[' bound_pair_list ']' -> ^( ARRAYSEG IDENTIFIER bound_pair_list ) | array_segment -> ^( ARRAYSEG array_segment ) )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:289:14: ( IDENTIFIER ( '[' bound_pair_list ']' -> ^( ARRAYSEG IDENTIFIER bound_pair_list ) | array_segment -> ^( ARRAYSEG array_segment ) ) )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:290:5: IDENTIFIER ( '[' bound_pair_list ']' -> ^( ARRAYSEG IDENTIFIER bound_pair_list ) | array_segment -> ^( ARRAYSEG array_segment ) )
			{
			dbg.location(290,5);
			IDENTIFIER196=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_array_segment2405);  
			stream_IDENTIFIER.add(IDENTIFIER196);
			dbg.location(290,16);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:290:16: ( '[' bound_pair_list ']' -> ^( ARRAYSEG IDENTIFIER bound_pair_list ) | array_segment -> ^( ARRAYSEG array_segment ) )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt57=2;
			try { dbg.enterSubRule(57);
			try { dbg.enterDecision(57, decisionCanBacktrack[57]);

			int LA57_0 = input.LA(1);
			if ( (LA57_0==60) ) {
				alt57=1;
			}
			else if ( (LA57_0==IDENTIFIER) ) {
				alt57=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(57);}

			switch (alt57) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:285:17: '[' bound_pair_list ']'
					{
					char_literal197=(Token)match(input,60,FOLLOW_60_in_array_segment2359);  
					stream_60.add(char_literal197);

					pushFollow(FOLLOW_bound_pair_list_in_array_segment2360);
					bound_pair_list198=bound_pair_list();
					state._fsp--;

					stream_bound_pair_list.add(bound_pair_list198.getTree());
					char_literal199=(Token)match(input,61,FOLLOW_61_in_array_segment2362);  
					stream_61.add(char_literal199);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:290:17: '[' bound_pair_list ']'
					{
					dbg.location(290,17);
					char_literal197=(Token)match(input,65,FOLLOW_65_in_array_segment2408);  
					stream_65.add(char_literal197);
					dbg.location(290,20);
					pushFollow(FOLLOW_bound_pair_list_in_array_segment2409);
					bound_pair_list198=bound_pair_list();
					state._fsp--;

					stream_bound_pair_list.add(bound_pair_list198.getTree());dbg.location(290,36);
					char_literal199=(Token)match(input,66,FOLLOW_66_in_array_segment2411);  
					stream_66.add(char_literal199);
>>>>>>> Stashed changes:output/grammarA60Parser.java

					// AST REWRITE
					// elements: IDENTIFIER, bound_pair_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 285:40: -> ^( ARRAYSEG IDENTIFIER bound_pair_list )
					{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
						// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:285:43: ^( ARRAYSEG IDENTIFIER bound_pair_list )
=======
						dbg.location(290,43);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:290:43: ^( ARRAYSEG IDENTIFIER bound_pair_list )
>>>>>>> Stashed changes:output/grammarA60Parser.java
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(290,45);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYSEG, "ARRAYSEG"), root_1);
						dbg.location(290,54);
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());dbg.location(290,65);
						adaptor.addChild(root_1, stream_bound_pair_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:286:7: array_segment
					{
					pushFollow(FOLLOW_array_segment_in_array_segment2380);
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:291:7: array_segment
					{
					dbg.location(291,7);
					pushFollow(FOLLOW_array_segment_in_array_segment2429);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					array_segment200=array_segment();
					state._fsp--;

					stream_array_segment.add(array_segment200.getTree());
					// AST REWRITE
					// elements: array_segment
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 286:21: -> ^( ARRAYSEG array_segment )
					{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
						// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:286:24: ^( ARRAYSEG array_segment )
=======
						dbg.location(291,24);
						// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:291:24: ^( ARRAYSEG array_segment )
>>>>>>> Stashed changes:output/grammarA60Parser.java
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(291,26);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYSEG, "ARRAYSEG"), root_1);
						dbg.location(291,35);
						adaptor.addChild(root_1, stream_array_segment.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(57);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(292, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "array_segment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "array_segment"


	public static class switch_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switch_declaration"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:289:1: switch_declaration : 'switch' IDENTIFIER ':=' switch_list ;
	public final grammarA60Parserold.switch_declaration_return switch_declaration() throws RecognitionException {
		grammarA60Parserold.switch_declaration_return retval = new grammarA60Parserold.switch_declaration_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:294:1: switch_declaration : 'switch' IDENTIFIER ':=' switch_list ;
	public final grammarA60Parser.switch_declaration_return switch_declaration() throws RecognitionException {
		grammarA60Parser.switch_declaration_return retval = new grammarA60Parser.switch_declaration_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal201=null;
		Token IDENTIFIER202=null;
		Token string_literal203=null;
		ParserRuleReturnScope switch_list204 =null;

		Object string_literal201_tree=null;
		Object IDENTIFIER202_tree=null;
		Object string_literal203_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "switch_declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(294, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:289:19: ( 'switch' IDENTIFIER ':=' switch_list )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:290:5: 'switch' IDENTIFIER ':=' switch_list
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:294:19: ( 'switch' IDENTIFIER ':=' switch_list )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:295:5: 'switch' IDENTIFIER ':=' switch_list
>>>>>>> Stashed changes:output/grammarA60Parser.java
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
			string_literal201=(Token)match(input,80,FOLLOW_80_in_switch_declaration2401); 
			string_literal201_tree = (Object)adaptor.create(string_literal201);
			adaptor.addChild(root_0, string_literal201_tree);

			IDENTIFIER202=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_switch_declaration2403); 
			IDENTIFIER202_tree = (Object)adaptor.create(IDENTIFIER202);
			adaptor.addChild(root_0, IDENTIFIER202_tree);

			string_literal203=(Token)match(input,46,FOLLOW_46_in_switch_declaration2405); 
			string_literal203_tree = (Object)adaptor.create(string_literal203);
			adaptor.addChild(root_0, string_literal203_tree);

			pushFollow(FOLLOW_switch_list_in_switch_declaration2407);
=======
			dbg.location(295,5);
			string_literal201=(Token)match(input,85,FOLLOW_85_in_switch_declaration2450); 
			string_literal201_tree = (Object)adaptor.create(string_literal201);
			adaptor.addChild(root_0, string_literal201_tree);
			dbg.location(295,14);
			IDENTIFIER202=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_switch_declaration2452); 
			IDENTIFIER202_tree = (Object)adaptor.create(IDENTIFIER202);
			adaptor.addChild(root_0, IDENTIFIER202_tree);
			dbg.location(295,25);
			string_literal203=(Token)match(input,51,FOLLOW_51_in_switch_declaration2454); 
			string_literal203_tree = (Object)adaptor.create(string_literal203);
			adaptor.addChild(root_0, string_literal203_tree);
			dbg.location(295,30);
			pushFollow(FOLLOW_switch_list_in_switch_declaration2456);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			switch_list204=switch_list();
			state._fsp--;

			adaptor.addChild(root_0, switch_list204.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(296, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "switch_declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "switch_declaration"


	public static class switch_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switch_list"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:293:1: switch_list : expression ( ',' expression )* ;
	public final grammarA60Parserold.switch_list_return switch_list() throws RecognitionException {
		grammarA60Parserold.switch_list_return retval = new grammarA60Parserold.switch_list_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:298:1: switch_list : expression ( ',' expression )* ;
	public final grammarA60Parser.switch_list_return switch_list() throws RecognitionException {
		grammarA60Parser.switch_list_return retval = new grammarA60Parser.switch_list_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal206=null;
		ParserRuleReturnScope expression205 =null;
		ParserRuleReturnScope expression207 =null;

		Object char_literal206_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "switch_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(298, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:293:12: ( expression ( ',' expression )* )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:294:5: expression ( ',' expression )*
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:298:12: ( expression ( ',' expression )* )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:299:5: expression ( ',' expression )*
>>>>>>> Stashed changes:output/grammarA60Parser.java
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
			pushFollow(FOLLOW_expression_in_switch_list2419);
=======
			dbg.location(299,5);
			pushFollow(FOLLOW_expression_in_switch_list2468);
>>>>>>> Stashed changes:output/grammarA60Parser.java
			expression205=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression205.getTree());
			dbg.location(299,16);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:299:16: ( ',' expression )*
			try { dbg.enterSubRule(58);

<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:294:16: ( ',' expression )*
=======
>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop58:
			while (true) {
				int alt58=2;
				try { dbg.enterDecision(58, decisionCanBacktrack[58]);

				int LA58_0 = input.LA(1);
				if ( (LA58_0==42) ) {
					alt58=1;
				}

				} finally {dbg.exitDecision(58);}

				switch (alt58) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:294:17: ',' expression
					{
					char_literal206=(Token)match(input,42,FOLLOW_42_in_switch_list2422); 
					char_literal206_tree = (Object)adaptor.create(char_literal206);
					adaptor.addChild(root_0, char_literal206_tree);

					pushFollow(FOLLOW_expression_in_switch_list2424);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:299:17: ',' expression
					{
					dbg.location(299,17);
					char_literal206=(Token)match(input,47,FOLLOW_47_in_switch_list2471); 
					char_literal206_tree = (Object)adaptor.create(char_literal206);
					adaptor.addChild(root_0, char_literal206_tree);
					dbg.location(299,21);
					pushFollow(FOLLOW_expression_in_switch_list2473);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					expression207=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression207.getTree());

					}
					break;

				default :
					break loop58;
				}
			}
			} finally {dbg.exitSubRule(58);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(300, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "switch_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "switch_list"


	public static class procedure_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedure_declaration"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:297:1: procedure_declaration : 'procedure' procedure_heading ( statement_bis )? -> ^( PROCEDURE_STATEMENT procedure_heading ( statement_bis )? ) ;
	public final grammarA60Parserold.procedure_declaration_return procedure_declaration() throws RecognitionException {
		grammarA60Parserold.procedure_declaration_return retval = new grammarA60Parserold.procedure_declaration_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:302:1: procedure_declaration : 'procedure' procedure_heading ( statement_bis )? -> ^( PROCEDURE_STATEMENT procedure_heading ( statement_bis )? ) ;
	public final grammarA60Parser.procedure_declaration_return procedure_declaration() throws RecognitionException {
		grammarA60Parser.procedure_declaration_return retval = new grammarA60Parser.procedure_declaration_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal208=null;
		ParserRuleReturnScope procedure_heading209 =null;
		ParserRuleReturnScope statement_bis210 =null;

		Object string_literal208_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleSubtreeStream stream_procedure_heading=new RewriteRuleSubtreeStream(adaptor,"rule procedure_heading");
		RewriteRuleSubtreeStream stream_statement_bis=new RewriteRuleSubtreeStream(adaptor,"rule statement_bis");

		try { dbg.enterRule(getGrammarFileName(), "procedure_declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(302, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:297:22: ( 'procedure' procedure_heading ( statement_bis )? -> ^( PROCEDURE_STATEMENT procedure_heading ( statement_bis )? ) )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:298:5: 'procedure' procedure_heading ( statement_bis )?
			{
			string_literal208=(Token)match(input,77,FOLLOW_77_in_procedure_declaration2438);  
			stream_77.add(string_literal208);

			pushFollow(FOLLOW_procedure_heading_in_procedure_declaration2440);
			procedure_heading209=procedure_heading();
			state._fsp--;

			stream_procedure_heading.add(procedure_heading209.getTree());
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:298:35: ( statement_bis )?
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:302:22: ( 'procedure' procedure_heading ( statement_bis )? -> ^( PROCEDURE_STATEMENT procedure_heading ( statement_bis )? ) )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:303:5: 'procedure' procedure_heading ( statement_bis )?
			{
			dbg.location(303,5);
			string_literal208=(Token)match(input,82,FOLLOW_82_in_procedure_declaration2487);  
			stream_82.add(string_literal208);
			dbg.location(303,17);
			pushFollow(FOLLOW_procedure_heading_in_procedure_declaration2489);
			procedure_heading209=procedure_heading();
			state._fsp--;

			stream_procedure_heading.add(procedure_heading209.getTree());dbg.location(303,35);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:303:35: ( statement_bis )?
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt59=2;
			try { dbg.enterSubRule(59);
			try { dbg.enterDecision(59, decisionCanBacktrack[59]);

			int LA59_0 = input.LA(1);
			if ( (LA59_0==TYPE||(LA59_0 >= 63 && LA59_0 <= 64)||LA59_0==68||LA59_0==71||LA59_0==73||LA59_0==77||(LA59_0 >= 79 && LA59_0 <= 80)) ) {
				alt59=1;
			}
			} finally {dbg.exitDecision(59);}

			switch (alt59) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:298:36: statement_bis
					{
					pushFollow(FOLLOW_statement_bis_in_procedure_declaration2443);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:303:36: statement_bis
					{
					dbg.location(303,36);
					pushFollow(FOLLOW_statement_bis_in_procedure_declaration2492);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					statement_bis210=statement_bis();
					state._fsp--;

					stream_statement_bis.add(statement_bis210.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(59);}

			// AST REWRITE
			// elements: statement_bis, procedure_heading
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 298:52: -> ^( PROCEDURE_STATEMENT procedure_heading ( statement_bis )? )
			{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:298:55: ^( PROCEDURE_STATEMENT procedure_heading ( statement_bis )? )
=======
				dbg.location(303,55);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:303:55: ^( PROCEDURE_STATEMENT procedure_heading ( statement_bis )? )
>>>>>>> Stashed changes:output/grammarA60Parser.java
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(303,57);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURE_STATEMENT, "PROCEDURE_STATEMENT"), root_1);
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				adaptor.addChild(root_1, stream_procedure_heading.nextTree());
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:298:95: ( statement_bis )?
=======
				dbg.location(303,77);
				adaptor.addChild(root_1, stream_procedure_heading.nextTree());dbg.location(303,95);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:303:95: ( statement_bis )?
>>>>>>> Stashed changes:output/grammarA60Parser.java
				if ( stream_statement_bis.hasNext() ) {
					dbg.location(303,96);
					adaptor.addChild(root_1, stream_statement_bis.nextTree());
				}
				stream_statement_bis.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(304, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "procedure_declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "procedure_declaration"


	public static class procedure_heading_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedure_heading"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:301:1: procedure_heading : IDENTIFIER ( formal_parameter_list )? ';' ( value_part )? -> ^( PROCH IDENTIFIER ( formal_parameter_list )? ( value_part )? ) ;
	public final grammarA60Parserold.procedure_heading_return procedure_heading() throws RecognitionException {
		grammarA60Parserold.procedure_heading_return retval = new grammarA60Parserold.procedure_heading_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:306:1: procedure_heading : IDENTIFIER ( formal_parameter_list )? ';' ( value_part )? -> ^( PROCH IDENTIFIER ^( PARAMETRES ( formal_parameter_list )? ( value_part )? ) ) ;
	public final grammarA60Parser.procedure_heading_return procedure_heading() throws RecognitionException {
		grammarA60Parser.procedure_heading_return retval = new grammarA60Parser.procedure_heading_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER211=null;
		Token char_literal213=null;
		ParserRuleReturnScope formal_parameter_list212 =null;
		ParserRuleReturnScope value_part214 =null;

		Object IDENTIFIER211_tree=null;
		Object char_literal213_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_formal_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule formal_parameter_list");
		RewriteRuleSubtreeStream stream_value_part=new RewriteRuleSubtreeStream(adaptor,"rule value_part");

		try { dbg.enterRule(getGrammarFileName(), "procedure_heading");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(306, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:301:18: ( IDENTIFIER ( formal_parameter_list )? ';' ( value_part )? -> ^( PROCH IDENTIFIER ( formal_parameter_list )? ( value_part )? ) )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:302:5: IDENTIFIER ( formal_parameter_list )? ';' ( value_part )?
			{
			IDENTIFIER211=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_procedure_heading2470);  
			stream_IDENTIFIER.add(IDENTIFIER211);

			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:302:16: ( formal_parameter_list )?
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:306:18: ( IDENTIFIER ( formal_parameter_list )? ';' ( value_part )? -> ^( PROCH IDENTIFIER ^( PARAMETRES ( formal_parameter_list )? ( value_part )? ) ) )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:307:5: IDENTIFIER ( formal_parameter_list )? ';' ( value_part )?
			{
			dbg.location(307,5);
			IDENTIFIER211=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_procedure_heading2519);  
			stream_IDENTIFIER.add(IDENTIFIER211);
			dbg.location(307,16);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:307:16: ( formal_parameter_list )?
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt60=2;
			try { dbg.enterSubRule(60);
			try { dbg.enterDecision(60, decisionCanBacktrack[60]);

			int LA60_0 = input.LA(1);
			if ( (LA60_0==37) ) {
				alt60=1;
			}
			} finally {dbg.exitDecision(60);}

			switch (alt60) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:302:17: formal_parameter_list
					{
					pushFollow(FOLLOW_formal_parameter_list_in_procedure_heading2473);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:307:17: formal_parameter_list
					{
					dbg.location(307,17);
					pushFollow(FOLLOW_formal_parameter_list_in_procedure_heading2522);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					formal_parameter_list212=formal_parameter_list();
					state._fsp--;

					stream_formal_parameter_list.add(formal_parameter_list212.getTree());
					}
					break;

			}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

			char_literal213=(Token)match(input,47,FOLLOW_47_in_procedure_heading2477);  
			stream_47.add(char_literal213);

			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:302:45: ( value_part )?
=======
			} finally {dbg.exitSubRule(60);}
			dbg.location(307,41);
			char_literal213=(Token)match(input,52,FOLLOW_52_in_procedure_heading2526);  
			stream_52.add(char_literal213);
			dbg.location(307,45);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:307:45: ( value_part )?
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt61=2;
			try { dbg.enterSubRule(61);
			try { dbg.enterDecision(61, decisionCanBacktrack[61]);

			int LA61_0 = input.LA(1);
			if ( (LA61_0==83) ) {
				alt61=1;
			}
			} finally {dbg.exitDecision(61);}

			switch (alt61) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:302:46: value_part
					{
					pushFollow(FOLLOW_value_part_in_procedure_heading2480);
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:307:46: value_part
					{
					dbg.location(307,46);
					pushFollow(FOLLOW_value_part_in_procedure_heading2529);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					value_part214=value_part();
					state._fsp--;

					stream_value_part.add(value_part214.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(61);}

			// AST REWRITE
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// elements: formal_parameter_list, IDENTIFIER, value_part
=======
			// elements: IDENTIFIER, formal_parameter_list, value_part
>>>>>>> Stashed changes:output/grammarA60Parser.java
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 302:59: -> ^( PROCH IDENTIFIER ( formal_parameter_list )? ( value_part )? )
			{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:302:62: ^( PROCH IDENTIFIER ( formal_parameter_list )? ( value_part )? )
=======
				dbg.location(307,62);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:307:62: ^( PROCH IDENTIFIER ^( PARAMETRES ( formal_parameter_list )? ( value_part )? ) )
>>>>>>> Stashed changes:output/grammarA60Parser.java
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(307,64);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCH, "PROCH"), root_1);
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:302:81: ( formal_parameter_list )?
				if ( stream_formal_parameter_list.hasNext() ) {
					adaptor.addChild(root_1, stream_formal_parameter_list.nextTree());
				}
				stream_formal_parameter_list.reset();

				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:302:106: ( value_part )?
				if ( stream_value_part.hasNext() ) {
					adaptor.addChild(root_1, stream_value_part.nextTree());
=======
				dbg.location(307,70);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());dbg.location(307,81);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:307:81: ^( PARAMETRES ( formal_parameter_list )? ( value_part )? )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(307,83);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETRES, "PARAMETRES"), root_2);
				dbg.location(307,94);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:307:94: ( formal_parameter_list )?
				if ( stream_formal_parameter_list.hasNext() ) {
					dbg.location(307,95);
					adaptor.addChild(root_2, stream_formal_parameter_list.nextTree());
				}
				stream_formal_parameter_list.reset();
				dbg.location(307,119);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:307:119: ( value_part )?
				if ( stream_value_part.hasNext() ) {
					dbg.location(307,120);
					adaptor.addChild(root_2, stream_value_part.nextTree());
>>>>>>> Stashed changes:output/grammarA60Parser.java
				}
				stream_value_part.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(308, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "procedure_heading");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "procedure_heading"


	public static class specifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "specifier"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:306:1: specifier : ( 'string' | TYPE fact_type_array_procedure | 'array' | 'switch' | 'procedure' );
	public final grammarA60Parserold.specifier_return specifier() throws RecognitionException {
		grammarA60Parserold.specifier_return retval = new grammarA60Parserold.specifier_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:311:1: specifier : ( 'string' | TYPE fact_type_array_procedure | 'array' | 'switch' | 'procedure' );
	public final grammarA60Parser.specifier_return specifier() throws RecognitionException {
		grammarA60Parser.specifier_return retval = new grammarA60Parser.specifier_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal215=null;
		Token TYPE216=null;
		Token string_literal218=null;
		Token string_literal219=null;
		Token string_literal220=null;
		ParserRuleReturnScope fact_type_array_procedure217 =null;

		Object string_literal215_tree=null;
		Object TYPE216_tree=null;
		Object string_literal218_tree=null;
		Object string_literal219_tree=null;
		Object string_literal220_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "specifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(311, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:306:10: ( 'string' | TYPE fact_type_array_procedure | 'array' | 'switch' | 'procedure' )
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:311:10: ( 'string' | TYPE fact_type_array_procedure | 'array' | 'switch' | 'procedure' )
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt62=5;
			try { dbg.enterDecision(62, decisionCanBacktrack[62]);

			switch ( input.LA(1) ) {
			case 79:
				{
				alt62=1;
				}
				break;
			case TYPE:
				{
				alt62=2;
				}
				break;
			case 63:
				{
				alt62=3;
				}
				break;
			case 80:
				{
				alt62=4;
				}
				break;
			case 77:
				{
				alt62=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(62);}

			switch (alt62) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:307:5: 'string'
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:312:5: 'string'
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					string_literal215=(Token)match(input,79,FOLLOW_79_in_specifier2513); 
=======
					dbg.location(312,5);
					string_literal215=(Token)match(input,84,FOLLOW_84_in_specifier2566); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					string_literal215_tree = (Object)adaptor.create(string_literal215);
					adaptor.addChild(root_0, string_literal215_tree);

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:308:7: TYPE fact_type_array_procedure
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:313:7: TYPE fact_type_array_procedure
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					TYPE216=(Token)match(input,TYPE,FOLLOW_TYPE_in_specifier2521); 
					TYPE216_tree = (Object)adaptor.create(TYPE216);
					adaptor.addChild(root_0, TYPE216_tree);

					pushFollow(FOLLOW_fact_type_array_procedure_in_specifier2523);
=======
					dbg.location(313,7);
					TYPE216=(Token)match(input,TYPE,FOLLOW_TYPE_in_specifier2574); 
					TYPE216_tree = (Object)adaptor.create(TYPE216);
					adaptor.addChild(root_0, TYPE216_tree);
					dbg.location(313,12);
					pushFollow(FOLLOW_fact_type_array_procedure_in_specifier2576);
>>>>>>> Stashed changes:output/grammarA60Parser.java
					fact_type_array_procedure217=fact_type_array_procedure();
					state._fsp--;

					adaptor.addChild(root_0, fact_type_array_procedure217.getTree());

					}
					break;
				case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:309:7: 'array'
=======
					dbg.enterAlt(3);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:314:7: 'array'
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					string_literal218=(Token)match(input,63,FOLLOW_63_in_specifier2531); 
=======
					dbg.location(314,7);
					string_literal218=(Token)match(input,68,FOLLOW_68_in_specifier2585); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					string_literal218_tree = (Object)adaptor.create(string_literal218);
					adaptor.addChild(root_0, string_literal218_tree);

					}
					break;
				case 4 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:310:7: 'switch'
=======
					dbg.enterAlt(4);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:315:7: 'switch'
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					string_literal219=(Token)match(input,80,FOLLOW_80_in_specifier2539); 
=======
					dbg.location(315,7);
					string_literal219=(Token)match(input,85,FOLLOW_85_in_specifier2593); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					string_literal219_tree = (Object)adaptor.create(string_literal219);
					adaptor.addChild(root_0, string_literal219_tree);

					}
					break;
				case 5 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:311:7: 'procedure'
=======
					dbg.enterAlt(5);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:316:7: 'procedure'
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					string_literal220=(Token)match(input,77,FOLLOW_77_in_specifier2547); 
=======
					dbg.location(316,7);
					string_literal220=(Token)match(input,82,FOLLOW_82_in_specifier2601); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					string_literal220_tree = (Object)adaptor.create(string_literal220);
					adaptor.addChild(root_0, string_literal220_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(317, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "specifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "specifier"


	public static class fact_type_array_procedure_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fact_type_array_procedure"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:314:1: fact_type_array_procedure : ( 'procedure' | 'array' |);
	public final grammarA60Parserold.fact_type_array_procedure_return fact_type_array_procedure() throws RecognitionException {
		grammarA60Parserold.fact_type_array_procedure_return retval = new grammarA60Parserold.fact_type_array_procedure_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:319:1: fact_type_array_procedure : ( 'procedure' | 'array' |);
	public final grammarA60Parser.fact_type_array_procedure_return fact_type_array_procedure() throws RecognitionException {
		grammarA60Parser.fact_type_array_procedure_return retval = new grammarA60Parser.fact_type_array_procedure_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal221=null;
		Token string_literal222=null;

		Object string_literal221_tree=null;
		Object string_literal222_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "fact_type_array_procedure");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(319, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:314:26: ( 'procedure' | 'array' |)
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:319:26: ( 'procedure' | 'array' |)
>>>>>>> Stashed changes:output/grammarA60Parser.java
			int alt63=3;
			try { dbg.enterDecision(63, decisionCanBacktrack[63]);

			switch ( input.LA(1) ) {
			case 77:
				{
				alt63=1;
				}
				break;
			case 63:
				{
				alt63=2;
				}
				break;
			case IDENTIFIER:
				{
				alt63=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(63);}

			switch (alt63) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:315:5: 'procedure'
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:320:5: 'procedure'
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					string_literal221=(Token)match(input,77,FOLLOW_77_in_fact_type_array_procedure2559); 
=======
					dbg.location(320,5);
					string_literal221=(Token)match(input,82,FOLLOW_82_in_fact_type_array_procedure2613); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					string_literal221_tree = (Object)adaptor.create(string_literal221);
					adaptor.addChild(root_0, string_literal221_tree);

					}
					break;
				case 2 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:316:6: 'array'
=======
					dbg.enterAlt(2);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:321:6: 'array'
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< Updated upstream:output/grammarA60Parserold.java
					string_literal222=(Token)match(input,63,FOLLOW_63_in_fact_type_array_procedure2566); 
=======
					dbg.location(321,6);
					string_literal222=(Token)match(input,68,FOLLOW_68_in_fact_type_array_procedure2620); 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					string_literal222_tree = (Object)adaptor.create(string_literal222);
					adaptor.addChild(root_0, string_literal222_tree);

					}
					break;
				case 3 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:318:5: 
=======
					dbg.enterAlt(3);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:323:5: 
>>>>>>> Stashed changes:output/grammarA60Parser.java
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(323, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fact_type_array_procedure");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fact_type_array_procedure"


	public static class value_part_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value_part"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:320:1: value_part : 'value' identifier_list ';' -> ^( VP identifier_list ) ;
	public final grammarA60Parserold.value_part_return value_part() throws RecognitionException {
		grammarA60Parserold.value_part_return retval = new grammarA60Parserold.value_part_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:325:1: value_part : 'value' identifier_list ';' -> ^( VP identifier_list ) ;
	public final grammarA60Parser.value_part_return value_part() throws RecognitionException {
		grammarA60Parser.value_part_return retval = new grammarA60Parser.value_part_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal223=null;
		Token char_literal225=null;
		ParserRuleReturnScope identifier_list224 =null;

		Object string_literal223_tree=null;
		Object char_literal225_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleSubtreeStream stream_identifier_list=new RewriteRuleSubtreeStream(adaptor,"rule identifier_list");

		try { dbg.enterRule(getGrammarFileName(), "value_part");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(325, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:320:11: ( 'value' identifier_list ';' -> ^( VP identifier_list ) )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:321:5: 'value' identifier_list ';'
			{
			string_literal223=(Token)match(input,83,FOLLOW_83_in_value_part2584);  
			stream_83.add(string_literal223);

			pushFollow(FOLLOW_identifier_list_in_value_part2586);
			identifier_list224=identifier_list();
			state._fsp--;

			stream_identifier_list.add(identifier_list224.getTree());
			char_literal225=(Token)match(input,47,FOLLOW_47_in_value_part2588);  
			stream_47.add(char_literal225);
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:325:11: ( 'value' identifier_list ';' -> ^( VP identifier_list ) )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:326:5: 'value' identifier_list ';'
			{
			dbg.location(326,5);
			string_literal223=(Token)match(input,88,FOLLOW_88_in_value_part2639);  
			stream_88.add(string_literal223);
			dbg.location(326,13);
			pushFollow(FOLLOW_identifier_list_in_value_part2641);
			identifier_list224=identifier_list();
			state._fsp--;

			stream_identifier_list.add(identifier_list224.getTree());dbg.location(326,29);
			char_literal225=(Token)match(input,52,FOLLOW_52_in_value_part2643);  
			stream_52.add(char_literal225);
>>>>>>> Stashed changes:output/grammarA60Parser.java

			// AST REWRITE
			// elements: identifier_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 321:33: -> ^( VP identifier_list )
			{
<<<<<<< Updated upstream:output/grammarA60Parserold.java
				// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:321:36: ^( VP identifier_list )
=======
				dbg.location(326,36);
				// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:326:36: ^( VP identifier_list )
>>>>>>> Stashed changes:output/grammarA60Parser.java
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(326,38);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VP, "VP"), root_1);
				dbg.location(326,41);
				adaptor.addChild(root_1, stream_identifier_list.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(327, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "value_part");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "value_part"


	public static class identifier_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identifier_list"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:324:1: identifier_list : IDENTIFIER ( ',' IDENTIFIER )* -> ( IDENTIFIER )+ ;
	public final grammarA60Parserold.identifier_list_return identifier_list() throws RecognitionException {
		grammarA60Parserold.identifier_list_return retval = new grammarA60Parserold.identifier_list_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:329:1: identifier_list : IDENTIFIER ( ',' IDENTIFIER )* -> ( IDENTIFIER )+ ;
	public final grammarA60Parser.identifier_list_return identifier_list() throws RecognitionException {
		grammarA60Parser.identifier_list_return retval = new grammarA60Parser.identifier_list_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER226=null;
		Token char_literal227=null;
		Token IDENTIFIER228=null;

		Object IDENTIFIER226_tree=null;
		Object char_literal227_tree=null;
		Object IDENTIFIER228_tree=null;
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");

		try { dbg.enterRule(getGrammarFileName(), "identifier_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(329, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:324:16: ( IDENTIFIER ( ',' IDENTIFIER )* -> ( IDENTIFIER )+ )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:325:5: IDENTIFIER ( ',' IDENTIFIER )*
			{
			IDENTIFIER226=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list2608);  
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:329:16: ( IDENTIFIER ( ',' IDENTIFIER )* -> ( IDENTIFIER )+ )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:330:5: IDENTIFIER ( ',' IDENTIFIER )*
			{
			dbg.location(330,5);
			IDENTIFIER226=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list2663);  
>>>>>>> Stashed changes:output/grammarA60Parser.java
			stream_IDENTIFIER.add(IDENTIFIER226);
			dbg.location(330,16);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:330:16: ( ',' IDENTIFIER )*
			try { dbg.enterSubRule(64);

<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:325:16: ( ',' IDENTIFIER )*
=======
>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop64:
			while (true) {
				int alt64=2;
				try { dbg.enterDecision(64, decisionCanBacktrack[64]);

				int LA64_0 = input.LA(1);
				if ( (LA64_0==42) ) {
					alt64=1;
				}

				} finally {dbg.exitDecision(64);}

				switch (alt64) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:325:17: ',' IDENTIFIER
					{
					char_literal227=(Token)match(input,42,FOLLOW_42_in_identifier_list2611);  
					stream_42.add(char_literal227);

					IDENTIFIER228=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list2613);  
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:330:17: ',' IDENTIFIER
					{
					dbg.location(330,17);
					char_literal227=(Token)match(input,47,FOLLOW_47_in_identifier_list2666);  
					stream_47.add(char_literal227);
					dbg.location(330,21);
					IDENTIFIER228=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list2668);  
>>>>>>> Stashed changes:output/grammarA60Parser.java
					stream_IDENTIFIER.add(IDENTIFIER228);

					}
					break;

				default :
					break loop64;
				}
			}
			} finally {dbg.exitSubRule(64);}

			// AST REWRITE
			// elements: IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 325:34: -> ( IDENTIFIER )+
			{
				dbg.location(330,37);
				if ( !(stream_IDENTIFIER.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_IDENTIFIER.hasNext() ) {
					dbg.location(330,37);
					adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());
				}
				stream_IDENTIFIER.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(331, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "identifier_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "identifier_list"


	public static class formal_parameter_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formal_parameter_list"
<<<<<<< Updated upstream:output/grammarA60Parserold.java
	// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:329:1: formal_parameter_list : '(' IDENTIFIER ( ',' IDENTIFIER )* ')' ( IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')' )* -> ( IDENTIFIER )+ ;
	public final grammarA60Parserold.formal_parameter_list_return formal_parameter_list() throws RecognitionException {
		grammarA60Parserold.formal_parameter_list_return retval = new grammarA60Parserold.formal_parameter_list_return();
=======
	// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:334:1: formal_parameter_list : '(' IDENTIFIER ( ',' IDENTIFIER )* ')' ( IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')' )* -> ( IDENTIFIER )+ ;
	public final grammarA60Parser.formal_parameter_list_return formal_parameter_list() throws RecognitionException {
		grammarA60Parser.formal_parameter_list_return retval = new grammarA60Parser.formal_parameter_list_return();
>>>>>>> Stashed changes:output/grammarA60Parser.java
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal229=null;
		Token IDENTIFIER230=null;
		Token char_literal231=null;
		Token IDENTIFIER232=null;
		Token char_literal233=null;
		Token IDENTIFIER234=null;
		Token char_literal235=null;
		Token char_literal236=null;
		Token IDENTIFIER237=null;
		Token char_literal238=null;
		Token IDENTIFIER239=null;
		Token char_literal240=null;

		Object char_literal229_tree=null;
		Object IDENTIFIER230_tree=null;
		Object char_literal231_tree=null;
		Object IDENTIFIER232_tree=null;
		Object char_literal233_tree=null;
		Object IDENTIFIER234_tree=null;
		Object char_literal235_tree=null;
		Object char_literal236_tree=null;
		Object IDENTIFIER237_tree=null;
		Object char_literal238_tree=null;
		Object IDENTIFIER239_tree=null;
		Object char_literal240_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");

		try { dbg.enterRule(getGrammarFileName(), "formal_parameter_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(334, 0);

		try {
<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:329:22: ( '(' IDENTIFIER ( ',' IDENTIFIER )* ')' ( IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')' )* -> ( IDENTIFIER )+ )
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:330:5: '(' IDENTIFIER ( ',' IDENTIFIER )* ')' ( IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')' )*
			{
			char_literal229=(Token)match(input,37,FOLLOW_37_in_formal_parameter_list2633);  
			stream_37.add(char_literal229);

			IDENTIFIER230=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2635);  
=======
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:334:22: ( '(' IDENTIFIER ( ',' IDENTIFIER )* ')' ( IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')' )* -> ( IDENTIFIER )+ )
			dbg.enterAlt(1);

			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:335:5: '(' IDENTIFIER ( ',' IDENTIFIER )* ')' ( IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')' )*
			{
			dbg.location(335,5);
			char_literal229=(Token)match(input,42,FOLLOW_42_in_formal_parameter_list2688);  
			stream_42.add(char_literal229);
			dbg.location(335,9);
			IDENTIFIER230=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2690);  
>>>>>>> Stashed changes:output/grammarA60Parser.java
			stream_IDENTIFIER.add(IDENTIFIER230);
			dbg.location(335,20);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:335:20: ( ',' IDENTIFIER )*
			try { dbg.enterSubRule(65);

<<<<<<< Updated upstream:output/grammarA60Parserold.java
			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:330:20: ( ',' IDENTIFIER )*
=======
>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop65:
			while (true) {
				int alt65=2;
				try { dbg.enterDecision(65, decisionCanBacktrack[65]);

				int LA65_0 = input.LA(1);
				if ( (LA65_0==42) ) {
					alt65=1;
				}

				} finally {dbg.exitDecision(65);}

				switch (alt65) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:330:21: ',' IDENTIFIER
					{
					char_literal231=(Token)match(input,42,FOLLOW_42_in_formal_parameter_list2638);  
					stream_42.add(char_literal231);

					IDENTIFIER232=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2640);  
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:335:21: ',' IDENTIFIER
					{
					dbg.location(335,21);
					char_literal231=(Token)match(input,47,FOLLOW_47_in_formal_parameter_list2693);  
					stream_47.add(char_literal231);
					dbg.location(335,25);
					IDENTIFIER232=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2695);  
>>>>>>> Stashed changes:output/grammarA60Parser.java
					stream_IDENTIFIER.add(IDENTIFIER232);

					}
					break;

				default :
					break loop65;
				}
			}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

			char_literal233=(Token)match(input,38,FOLLOW_38_in_formal_parameter_list2644);  
			stream_38.add(char_literal233);

			// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:330:44: ( IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')' )*
=======
			} finally {dbg.exitSubRule(65);}
			dbg.location(335,38);
			char_literal233=(Token)match(input,43,FOLLOW_43_in_formal_parameter_list2699);  
			stream_43.add(char_literal233);
			dbg.location(335,44);
			// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:335:44: ( IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')' )*
			try { dbg.enterSubRule(67);

>>>>>>> Stashed changes:output/grammarA60Parser.java
			loop67:
			while (true) {
				int alt67=2;
				try { dbg.enterDecision(67, decisionCanBacktrack[67]);

				int LA67_0 = input.LA(1);
				if ( (LA67_0==IDENTIFIER) ) {
					alt67=1;
				}

				} finally {dbg.exitDecision(67);}

				switch (alt67) {
				case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:330:45: IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')'
					{
					IDENTIFIER234=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2649);  
					stream_IDENTIFIER.add(IDENTIFIER234);

					char_literal235=(Token)match(input,45,FOLLOW_45_in_formal_parameter_list2651);  
					stream_45.add(char_literal235);

					char_literal236=(Token)match(input,37,FOLLOW_37_in_formal_parameter_list2653);  
					stream_37.add(char_literal236);

					IDENTIFIER237=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2655);  
=======
					dbg.enterAlt(1);

					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:335:45: IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')'
					{
					dbg.location(335,45);
					IDENTIFIER234=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2704);  
					stream_IDENTIFIER.add(IDENTIFIER234);
					dbg.location(335,56);
					char_literal235=(Token)match(input,50,FOLLOW_50_in_formal_parameter_list2706);  
					stream_50.add(char_literal235);
					dbg.location(335,60);
					char_literal236=(Token)match(input,42,FOLLOW_42_in_formal_parameter_list2708);  
					stream_42.add(char_literal236);
					dbg.location(335,64);
					IDENTIFIER237=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2710);  
>>>>>>> Stashed changes:output/grammarA60Parser.java
					stream_IDENTIFIER.add(IDENTIFIER237);
					dbg.location(335,75);
					// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:335:75: ( ',' IDENTIFIER )*
					try { dbg.enterSubRule(66);

<<<<<<< Updated upstream:output/grammarA60Parserold.java
					// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:330:75: ( ',' IDENTIFIER )*
=======
>>>>>>> Stashed changes:output/grammarA60Parser.java
					loop66:
					while (true) {
						int alt66=2;
						try { dbg.enterDecision(66, decisionCanBacktrack[66]);

						int LA66_0 = input.LA(1);
						if ( (LA66_0==42) ) {
							alt66=1;
						}

						} finally {dbg.exitDecision(66);}

						switch (alt66) {
						case 1 :
<<<<<<< Updated upstream:output/grammarA60Parserold.java
							// C:\\Users\\Utilisateur\\Desktop\\2A\\PCL\\hantz7u\\grammarA60.g:330:76: ',' IDENTIFIER
							{
							char_literal238=(Token)match(input,42,FOLLOW_42_in_formal_parameter_list2658);  
							stream_42.add(char_literal238);

							IDENTIFIER239=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2660);  
=======
							dbg.enterAlt(1);

							// /home/maiwenn/Documents/2A/hantz7u/grammarA60.g:335:76: ',' IDENTIFIER
							{
							dbg.location(335,76);
							char_literal238=(Token)match(input,47,FOLLOW_47_in_formal_parameter_list2713);  
							stream_47.add(char_literal238);
							dbg.location(335,80);
							IDENTIFIER239=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2715);  
>>>>>>> Stashed changes:output/grammarA60Parser.java
							stream_IDENTIFIER.add(IDENTIFIER239);

							}
							break;

						default :
							break loop66;
						}
					}
<<<<<<< Updated upstream:output/grammarA60Parserold.java

					char_literal240=(Token)match(input,38,FOLLOW_38_in_formal_parameter_list2664);  
					stream_38.add(char_literal240);
=======
					} finally {dbg.exitSubRule(66);}
					dbg.location(335,93);
					char_literal240=(Token)match(input,43,FOLLOW_43_in_formal_parameter_list2719);  
					stream_43.add(char_literal240);
>>>>>>> Stashed changes:output/grammarA60Parser.java

					}
					break;

				default :
					break loop67;
				}
			}
			} finally {dbg.exitSubRule(67);}

			// AST REWRITE
			// elements: IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 330:99: -> ( IDENTIFIER )+
			{
				dbg.location(335,102);
				if ( !(stream_IDENTIFIER.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_IDENTIFIER.hasNext() ) {
					dbg.location(335,102);
					adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());
				}
				stream_IDENTIFIER.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(336, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "formal_parameter_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "formal_parameter_list"

	// Delegated rules



	public static final BitSet FOLLOW_program_in_root220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_program236 = new BitSet(new long[]{0x8000800020008000L,0x00000000000135F9L});
	public static final BitSet FOLLOW_unlabelled_in_program238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_program251 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_program253 = new BitSet(new long[]{0x8000000020000000L,0x0000000000013301L});
	public static final BitSet FOLLOW_program_in_program255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_program263 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_program265 = new BitSet(new long[]{0x8000000020000000L,0x0000000000013301L});
	public static final BitSet FOLLOW_program_in_program267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_program285 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_program287 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_STRING_in_program289 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_program291 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_program293 = new BitSet(new long[]{0x8000000020000000L,0x0000000000013301L});
	public static final BitSet FOLLOW_program_in_program295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_program_bis308 = new BitSet(new long[]{0x8000800020008000L,0x00000000000135F9L});
	public static final BitSet FOLLOW_unlabelled_in_program_bis310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_program_ter326 = new BitSet(new long[]{0x8000800020008000L,0x00000000000135F9L});
	public static final BitSet FOLLOW_unlabelled_in_program_ter328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_program_ter344 = new BitSet(new long[]{0x0000200000008000L});
	public static final BitSet FOLLOW_45_in_program_ter372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000091L});
	public static final BitSet FOLLOW_program_bis_in_program_ter408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statement_in_program_ter428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_statement_in_program_ter448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_list_in_program_ter482 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_program_ter484 = new BitSet(new long[]{0x8000000020000000L,0x000000000001A091L});
	public static final BitSet FOLLOW_specifier_in_program_ter487 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_list_in_program_ter489 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_program_ter491 = new BitSet(new long[]{0x8000000020000000L,0x000000000001A091L});
	public static final BitSet FOLLOW_program_bis_in_program_ter529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statement_in_program_ter549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_statement_in_program_ter569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unlabelled_block_in_unlabelled615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_tail_in_unlabelled627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_head_in_unlabelled_block643 = new BitSet(new long[]{0x0000800000008000L,0x00000000000005F9L});
	public static final BitSet FOLLOW_compound_tail_in_unlabelled_block645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_block_head668 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_block_head670 = new BitSet(new long[]{0x8000000020000002L,0x0000000000013000L});
	public static final BitSet FOLLOW_74_in_compound_tail690 = new BitSet(new long[]{0x0000800000008000L,0x00000000000005F9L});
	public static final BitSet FOLLOW_statement_in_compound_tail694 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_47_in_compound_tail698 = new BitSet(new long[]{0x0000800000008000L,0x00000000000005F9L});
	public static final BitSet FOLLOW_74_in_compound_tail701 = new BitSet(new long[]{0x0000800000008000L,0x00000000000005F9L});
	public static final BitSet FOLLOW_statement_in_compound_tail704 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_compound_tail708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_program_bis_in_statement729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_statement_in_statement741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unlabelled_basic_statement_in_statement757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statement_in_statement773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specifier_in_statement_bis801 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_list_in_statement_bis803 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_statement_bis805 = new BitSet(new long[]{0x8000000020000000L,0x000000000001A291L});
	public static final BitSet FOLLOW_specifier_in_statement_bis808 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_list_in_statement_bis810 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_statement_bis812 = new BitSet(new long[]{0x8000000020000000L,0x000000000001A291L});
	public static final BitSet FOLLOW_after_statement_bis_in_statement_bis816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_after_statement_bis_in_statement_bis839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_program_ter_in_after_statement_bis859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statement_in_after_statement_bis871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_statement_in_after_statement_bis879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_clause_in_for_statement891 = new BitSet(new long[]{0x0000000000008000L,0x00000000000001F1L});
	public static final BitSet FOLLOW_statement_in_for_statement893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_for_clause915 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_for_clause917 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_for_clause919 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_for_list_element_in_for_clause921 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_for_list_in_for_clause923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_for_clause925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_for_list950 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_for_list_element_in_for_list952 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_for_list_element977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
	public static final BitSet FOLLOW_78_in_for_list_element991 = new BitSet(new long[]{0x8A000A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_expression_in_for_list_element995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_for_list_element997 = new BitSet(new long[]{0x8A000A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_expression_in_for_list_element1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_for_list_element1024 = new BitSet(new long[]{0x8A000A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_expression_in_for_list_element1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_clause_in_conditional_statement1061 = new BitSet(new long[]{0x0000000000008000L,0x00000000000001F5L});
	public static final BitSet FOLLOW_statement_in_conditional_statement1065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_conditional_statement1076 = new BitSet(new long[]{0x0000000000008000L,0x00000000000001F1L});
	public static final BitSet FOLLOW_statement_in_conditional_statement1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_go_to_statement_in_unlabelled_basic_statement1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_unlabelled_basic_statement1133 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_actual_parameter_list_in_unlabelled_basic_statement1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_unlabelled_basic_statement1143 = new BitSet(new long[]{0x1000602000000002L});
	public static final BitSet FOLLOW_60_in_unlabelled_basic_statement1146 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_boolean_expr_in_unlabelled_basic_statement1147 = new BitSet(new long[]{0x2000040000000000L});
	public static final BitSet FOLLOW_42_in_unlabelled_basic_statement1150 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_boolean_expr_in_unlabelled_basic_statement1151 = new BitSet(new long[]{0x2000040000000000L});
	public static final BitSet FOLLOW_61_in_unlabelled_basic_statement1155 = new BitSet(new long[]{0x0000602000000002L});
	public static final BitSet FOLLOW_45_in_unlabelled_basic_statement1179 = new BitSet(new long[]{0x8A008A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_47_in_unlabelled_basic_statement1180 = new BitSet(new long[]{0x8A000A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_46_in_unlabelled_basic_statement1183 = new BitSet(new long[]{0x8A000A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_expression_in_unlabelled_basic_statement1187 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_actual_parameter_list_in_unlabelled_basic_statement1216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_go_to_statement1253 = new BitSet(new long[]{0x8A000A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_69_in_go_to_statement1258 = new BitSet(new long[]{0x8A000A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_expression_in_go_to_statement1262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_expression1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_clause_in_expression1290 = new BitSet(new long[]{0x8A000A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_expression_in_expression1294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_expression1297 = new BitSet(new long[]{0x8A000A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_expression_in_expression1301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_go_to_statement_in_expression1340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_program_in_expression1353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_if_clause1366 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_boolean_expr_in_if_clause1368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_if_clause1370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_expr_in_boolean_expr1386 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_50_in_boolean_expr1390 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_logic_expr_in_boolean_expr1392 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_logic_expr_bis_in_logic_expr1411 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_logic_expr1415 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_logic_expr_bis_in_logic_expr1417 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_logic_expr_ter_in_logic_expr_bis1436 = new BitSet(new long[]{0x4500001800000002L,0x0000000000600800L});
	public static final BitSet FOLLOW_58_in_logic_expr_bis1458 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_75_in_logic_expr_bis1472 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_86_in_logic_expr_bis1486 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_56_in_logic_expr_bis1500 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_62_in_logic_expr_bis1514 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_35_in_logic_expr_bis1528 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_36_in_logic_expr_bis1542 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_85_in_logic_expr_bis1555 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_logic_expr_ter_in_logic_expr_bis1568 = new BitSet(new long[]{0x4500001800000002L,0x0000000000600800L});
	public static final BitSet FOLLOW_add_expr_in_logic_expr_ter1582 = new BitSet(new long[]{0x00DB000000000002L});
	public static final BitSet FOLLOW_48_in_logic_expr_ter1604 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_54_in_logic_expr_ter1618 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_49_in_logic_expr_ter1632 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_55_in_logic_expr_ter1646 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_52_in_logic_expr_ter1660 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_51_in_logic_expr_ter1683 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_add_expr_in_logic_expr_ter1697 = new BitSet(new long[]{0x00DB000000000002L});
	public static final BitSet FOLLOW_41_in_add_expr1712 = new BitSet(new long[]{0x0A00082080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_mult_expr_in_add_expr1716 = new BitSet(new long[]{0x00000A0000000002L});
	public static final BitSet FOLLOW_41_in_add_expr1720 = new BitSet(new long[]{0x0A00082080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_43_in_add_expr1723 = new BitSet(new long[]{0x0A00082080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_mult_expr_in_add_expr1727 = new BitSet(new long[]{0x00000A0000000002L});
	public static final BitSet FOLLOW_factor_expr_in_mult_expr1742 = new BitSet(new long[]{0x0000108400000002L});
	public static final BitSet FOLLOW_39_in_mult_expr1764 = new BitSet(new long[]{0x0A00082080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_44_in_mult_expr1777 = new BitSet(new long[]{0x0A00082080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_34_in_mult_expr1790 = new BitSet(new long[]{0x0A00082080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_factor_expr_in_mult_expr1803 = new BitSet(new long[]{0x0000108400000002L});
	public static final BitSet FOLLOW_87_in_factor_expr1818 = new BitSet(new long[]{0x0A00082080008000L});
	public static final BitSet FOLLOW_value_in_factor_expr1822 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_factor_expr1826 = new BitSet(new long[]{0x0A00082080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_factor_expr1829 = new BitSet(new long[]{0x0A00082080008000L});
	public static final BitSet FOLLOW_value_in_factor_expr1833 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_value1849 = new BitSet(new long[]{0x1000002000000002L});
	public static final BitSet FOLLOW_after_identifier_in_value1852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_value1869 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_UNSIGNED_NUMBER_in_value1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNSIGNED_NUMBER_in_value1880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_value1892 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_boolean_expr_in_value1894 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_value1896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_value1908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_value1916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actual_parameter_list_in_after_identifier1932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_after_identifier1940 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_boolean_expr_in_after_identifier1942 = new BitSet(new long[]{0x2000040000000000L});
	public static final BitSet FOLLOW_42_in_after_identifier1945 = new BitSet(new long[]{0x0A000A2080008000L,0x0000000000800000L});
	public static final BitSet FOLLOW_boolean_expr_in_after_identifier1946 = new BitSet(new long[]{0x2000040000000000L});
	public static final BitSet FOLLOW_61_in_after_identifier1950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_clause_in_if_statement1968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_program_bis_in_if_statement1970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_actual_parameter1982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_actual_parameter1998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_actual_parameter_list2014 = new BitSet(new long[]{0x8A000A20A4008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_list2018 = new BitSet(new long[]{0x0000044000000000L});
	public static final BitSet FOLLOW_42_in_actual_parameter_list2021 = new BitSet(new long[]{0x8A000A20A4008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_list2025 = new BitSet(new long[]{0x0000044000000000L});
	public static final BitSet FOLLOW_38_in_actual_parameter_list2029 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_actual_parameter_list2034 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_actual_parameter_list2036 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_actual_parameter_list2038 = new BitSet(new long[]{0x8A000A20A4008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_list2042 = new BitSet(new long[]{0x0000044000000000L});
	public static final BitSet FOLLOW_42_in_actual_parameter_list2045 = new BitSet(new long[]{0x8A000A20A4008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_list2049 = new BitSet(new long[]{0x0000044000000000L});
	public static final BitSet FOLLOW_38_in_actual_parameter_list2053 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_type_array_proc_declaration_in_declaration2088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_declaration_in_declaration2100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switch_declaration_in_declaration2108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_declaration_in_declaration2116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_type_array_proc_declaration2129 = new BitSet(new long[]{0x8000000020000000L});
	public static final BitSet FOLLOW_type_array_proc_declaration_bis_in_type_array_proc_declaration2131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_array_proc_declaration2143 = new BitSet(new long[]{0x8000000000008000L,0x0000000000002000L});
	public static final BitSet FOLLOW_type_array_proc_declaration_ter_in_type_array_proc_declaration2147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_declaration_in_type_array_proc_declaration_bis2169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_array_proc_declaration_bis2181 = new BitSet(new long[]{0x8000000000008000L});
	public static final BitSet FOLLOW_type_list_in_type_array_proc_declaration_bis2184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_declaration_in_type_array_proc_declaration_bis2187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_declaration_in_type_array_proc_declaration_ter2200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_declaration_in_type_array_proc_declaration_ter2212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_list_in_type_array_proc_declaration_ter2224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type_list2241 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_type_list2244 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type_list2246 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_expression_in_bound_pair2268 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_bound_pair2270 = new BitSet(new long[]{0x8A000A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_expression_in_bound_pair2274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bound_pair_in_bound_pair_list2298 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_bound_pair_list2301 = new BitSet(new long[]{0x8A000A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_bound_pair_in_bound_pair_list2303 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_63_in_array_declaration2322 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_array_list_in_array_declaration2324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_segment_in_array_list2337 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_array_list2340 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_array_segment_in_array_list2342 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_array_segment2356 = new BitSet(new long[]{0x1000000000008000L});
	public static final BitSet FOLLOW_60_in_array_segment2359 = new BitSet(new long[]{0x8A000A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_bound_pair_list_in_array_segment2360 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_array_segment2362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_segment_in_array_segment2380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_switch_declaration2401 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_switch_declaration2403 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_switch_declaration2405 = new BitSet(new long[]{0x8A000A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_switch_list_in_switch_declaration2407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_switch_list2419 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_switch_list2422 = new BitSet(new long[]{0x8A000A20A0008000L,0x00000000008133E1L});
	public static final BitSet FOLLOW_expression_in_switch_list2424 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_77_in_procedure_declaration2438 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration2440 = new BitSet(new long[]{0x8000000020000002L,0x000000000001A291L});
	public static final BitSet FOLLOW_statement_bis_in_procedure_declaration2443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_procedure_heading2470 = new BitSet(new long[]{0x0000802000000000L});
	public static final BitSet FOLLOW_formal_parameter_list_in_procedure_heading2473 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_procedure_heading2477 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_value_part_in_procedure_heading2480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_specifier2513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_specifier2521 = new BitSet(new long[]{0x8000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fact_type_array_procedure_in_specifier2523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_specifier2531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_specifier2539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_specifier2547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_fact_type_array_procedure2559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_fact_type_array_procedure2566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_value_part2584 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_list_in_value_part2586 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_value_part2588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list2608 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_identifier_list2611 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list2613 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_37_in_formal_parameter_list2633 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_formal_parameter_list2635 = new BitSet(new long[]{0x0000044000000000L});
	public static final BitSet FOLLOW_42_in_formal_parameter_list2638 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_formal_parameter_list2640 = new BitSet(new long[]{0x0000044000000000L});
	public static final BitSet FOLLOW_38_in_formal_parameter_list2644 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_formal_parameter_list2649 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_formal_parameter_list2651 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_formal_parameter_list2653 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_formal_parameter_list2655 = new BitSet(new long[]{0x0000044000000000L});
	public static final BitSet FOLLOW_42_in_formal_parameter_list2658 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_formal_parameter_list2660 = new BitSet(new long[]{0x0000044000000000L});
	public static final BitSet FOLLOW_38_in_formal_parameter_list2664 = new BitSet(new long[]{0x0000000000008002L});
}*/
