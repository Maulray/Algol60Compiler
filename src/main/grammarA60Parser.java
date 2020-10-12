// $ANTLR null C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g 2020-02-25 15:45:19
package main;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class grammarA60Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "ALORS", "ARRAYSEG", 
		"BOOLEXPR", "BORNES", "COMMENT", "CONDITION", "DEFINITION", "FOR_CONDITION", 
		"FOR_LIST", "FOR_LIST_ELEM", "FOR_STATEMENT", "IDENTIFIER", "IF", "IF_CLAUSE", 
		"IF_STATEMENT", "PARAMETER_DELIMITER", "PARAMETRES", "PARAM_LIST", "PROCEDURE_STATEMENT", 
		"PROCH", "PROG", "SINON", "SPECIFIER", "STATEMENT_BIS", "STEP", "STRING", 
		"TAIL", "TYPARPROCDEC", "TYPE", "UNLABELLED_BLOCK", "UNSIGNED_NUMBER", 
		"UNTIL", "VP", "WS", "'%'", "'&&'", "'&'", "'('", "')'", "'*'", "'**'", 
		"'+'", "','", "'-'", "'/'", "':'", "':='", "';'", "'<'", "'<='", "'<=>'", 
		"'<>'", "'='", "'=>'", "'>'", "'>='", "'AND'", "'FALSE'", "'OR'", "'TRUE'", 
		"'['", "']'", "'and'", "'array'", "'begin'", "'do'", "'else'", "'end'", 
		"'for'", "'go to'", "'goto'", "'if'", "'inline'", "'label'", "'label:'", 
		"'or'", "'own'", "'procedure'", "'step'", "'string'", "'switch'", "'then'", 
		"'until'", "'value'", "'while'", "'|'", "'||'", "'~'"
	};
	public static final int EOF=-1;
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
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int ACTION=4;
	public static final int ALORS=5;
	public static final int ARRAYSEG=6;
	public static final int BOOLEXPR=7;
	public static final int BORNES=8;
	public static final int COMMENT=9;
	public static final int CONDITION=10;
	public static final int DEFINITION=11;
	public static final int FOR_CONDITION=12;
	public static final int FOR_LIST=13;
	public static final int FOR_LIST_ELEM=14;
	public static final int FOR_STATEMENT=15;
	public static final int IDENTIFIER=16;
	public static final int IF=17;
	public static final int IF_CLAUSE=18;
	public static final int IF_STATEMENT=19;
	public static final int PARAMETER_DELIMITER=20;
	public static final int PARAMETRES=21;
	public static final int PARAM_LIST=22;
	public static final int PROCEDURE_STATEMENT=23;
	public static final int PROCH=24;
	public static final int PROG=25;
	public static final int SINON=26;
	public static final int SPECIFIER=27;
	public static final int STATEMENT_BIS=28;
	public static final int STEP=29;
	public static final int STRING=30;
	public static final int TAIL=31;
	public static final int TYPARPROCDEC=32;
	public static final int TYPE=33;
	public static final int UNLABELLED_BLOCK=34;
	public static final int UNSIGNED_NUMBER=35;
	public static final int UNTIL=36;
	public static final int VP=37;
	public static final int WS=38;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public grammarA60Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public grammarA60Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return grammarA60Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g"; }


	public static class root_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "root"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:41:1: root : program -> program ;
	public final grammarA60Parser.root_return root() throws RecognitionException {
		grammarA60Parser.root_return retval = new grammarA60Parser.root_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program1 =null;

		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:41:5: ( program -> program )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:42:5: program
			{
			pushFollow(FOLLOW_program_in_root255);
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
			// 42:13: -> program
			{
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
		return retval;
	}
	// $ANTLR end "root"


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:45:1: program : ( 'begin' unlabelled -> unlabelled | 'label' ':' program | declaration ';' program -> ^( PROG declaration program ) | 'inline' '(' STRING ')' ';' program );
	public final grammarA60Parser.program_return program() throws RecognitionException {
		grammarA60Parser.program_return retval = new grammarA60Parser.program_return();
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
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_unlabelled=new RewriteRuleSubtreeStream(adaptor,"rule unlabelled");
		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:45:8: ( 'begin' unlabelled -> unlabelled | 'label' ':' program | declaration ';' program -> ^( PROG declaration program ) | 'inline' '(' STRING ')' ';' program )
			int alt1=4;
			switch ( input.LA(1) ) {
			case 69:
				{
				alt1=1;
				}
				break;
			case 78:
				{
				alt1=2;
				}
				break;
			case TYPE:
			case 68:
			case 81:
			case 82:
			case 85:
				{
				alt1=3;
				}
				break;
			case 77:
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:46:5: 'begin' unlabelled
					{
					string_literal2=(Token)match(input,69,FOLLOW_69_in_program271);  
					stream_69.add(string_literal2);

					pushFollow(FOLLOW_unlabelled_in_program273);
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
					// 46:24: -> unlabelled
					{
						adaptor.addChild(root_0, stream_unlabelled.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:47:7: 'label' ':' program
					{
					root_0 = (Object)adaptor.nil();


					string_literal4=(Token)match(input,78,FOLLOW_78_in_program286); 
					string_literal4_tree = (Object)adaptor.create(string_literal4);
					adaptor.addChild(root_0, string_literal4_tree);

					char_literal5=(Token)match(input,50,FOLLOW_50_in_program288); 
					char_literal5_tree = (Object)adaptor.create(char_literal5);
					adaptor.addChild(root_0, char_literal5_tree);

					pushFollow(FOLLOW_program_in_program290);
					program6=program();
					state._fsp--;

					adaptor.addChild(root_0, program6.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:48:7: declaration ';' program
					{
					pushFollow(FOLLOW_declaration_in_program298);
					declaration7=declaration();
					state._fsp--;

					stream_declaration.add(declaration7.getTree());
					char_literal8=(Token)match(input,52,FOLLOW_52_in_program300);  
					stream_52.add(char_literal8);

					pushFollow(FOLLOW_program_in_program302);
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
					// 48:31: -> ^( PROG declaration program )
					{
						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:48:34: ^( PROG declaration program )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROG, "PROG"), root_1);
						adaptor.addChild(root_1, stream_declaration.nextTree());
						adaptor.addChild(root_1, stream_program.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:49:7: 'inline' '(' STRING ')' ';' program
					{
					root_0 = (Object)adaptor.nil();


					string_literal10=(Token)match(input,77,FOLLOW_77_in_program320); 
					string_literal10_tree = (Object)adaptor.create(string_literal10);
					adaptor.addChild(root_0, string_literal10_tree);

					char_literal11=(Token)match(input,42,FOLLOW_42_in_program322); 
					char_literal11_tree = (Object)adaptor.create(char_literal11);
					adaptor.addChild(root_0, char_literal11_tree);

					STRING12=(Token)match(input,STRING,FOLLOW_STRING_in_program324); 
					STRING12_tree = (Object)adaptor.create(STRING12);
					adaptor.addChild(root_0, STRING12_tree);

					char_literal13=(Token)match(input,43,FOLLOW_43_in_program326); 
					char_literal13_tree = (Object)adaptor.create(char_literal13);
					adaptor.addChild(root_0, char_literal13_tree);

					char_literal14=(Token)match(input,52,FOLLOW_52_in_program328); 
					char_literal14_tree = (Object)adaptor.create(char_literal14);
					adaptor.addChild(root_0, char_literal14_tree);

					pushFollow(FOLLOW_program_in_program330);
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
		return retval;
	}
	// $ANTLR end "program"


	public static class program_bis_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program_bis"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:53:1: program_bis : 'begin' unlabelled -> unlabelled ;
	public final grammarA60Parser.program_bis_return program_bis() throws RecognitionException {
		grammarA60Parser.program_bis_return retval = new grammarA60Parser.program_bis_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal16=null;
		ParserRuleReturnScope unlabelled17 =null;

		Object string_literal16_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleSubtreeStream stream_unlabelled=new RewriteRuleSubtreeStream(adaptor,"rule unlabelled");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:53:12: ( 'begin' unlabelled -> unlabelled )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:54:5: 'begin' unlabelled
			{
			string_literal16=(Token)match(input,69,FOLLOW_69_in_program_bis343);  
			stream_69.add(string_literal16);

			pushFollow(FOLLOW_unlabelled_in_program_bis345);
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
			// 54:23: -> unlabelled
			{
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
		return retval;
	}
	// $ANTLR end "program_bis"


	public static class program_ter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program_ter"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:57:1: program_ter : ( 'begin' unlabelled -> unlabelled | 'label' ( ':' ( program_bis | for_statement | conditional_statement ) | identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement ) ) );
	public final grammarA60Parser.program_ter_return program_ter() throws RecognitionException {
		grammarA60Parser.program_ter_return retval = new grammarA60Parser.program_ter_return();
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
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleSubtreeStream stream_unlabelled=new RewriteRuleSubtreeStream(adaptor,"rule unlabelled");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:57:12: ( 'begin' unlabelled -> unlabelled | 'label' ( ':' ( program_bis | for_statement | conditional_statement ) | identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement ) ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==69) ) {
				alt6=1;
			}
			else if ( (LA6_0==78) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:58:5: 'begin' unlabelled
					{
					string_literal18=(Token)match(input,69,FOLLOW_69_in_program_ter361);  
					stream_69.add(string_literal18);

					pushFollow(FOLLOW_unlabelled_in_program_ter363);
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
					// 58:24: -> unlabelled
					{
						adaptor.addChild(root_0, stream_unlabelled.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:59:11: 'label' ( ':' ( program_bis | for_statement | conditional_statement ) | identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement ) )
					{
					root_0 = (Object)adaptor.nil();


					string_literal20=(Token)match(input,78,FOLLOW_78_in_program_ter379); 
					string_literal20_tree = (Object)adaptor.create(string_literal20);
					adaptor.addChild(root_0, string_literal20_tree);

					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:60:13: ( ':' ( program_bis | for_statement | conditional_statement ) | identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement ) )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==50) ) {
						alt5=1;
					}
					else if ( (LA5_0==IDENTIFIER) ) {
						alt5=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:61:13: ':' ( program_bis | for_statement | conditional_statement )
							{
							char_literal21=(Token)match(input,50,FOLLOW_50_in_program_ter407); 
							char_literal21_tree = (Object)adaptor.create(char_literal21);
							adaptor.addChild(root_0, char_literal21_tree);

							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:62:17: ( program_bis | for_statement | conditional_statement )
							int alt2=3;
							switch ( input.LA(1) ) {
							case 69:
								{
								alt2=1;
								}
								break;
							case 73:
								{
								alt2=2;
								}
								break;
							case 76:
								{
								alt2=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 2, 0, input);
								throw nvae;
							}
							switch (alt2) {
								case 1 :
									// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:63:17: program_bis
									{
									pushFollow(FOLLOW_program_bis_in_program_ter443);
									program_bis22=program_bis();
									state._fsp--;

									adaptor.addChild(root_0, program_bis22.getTree());

									}
									break;
								case 2 :
									// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:64:19: for_statement
									{
									pushFollow(FOLLOW_for_statement_in_program_ter463);
									for_statement23=for_statement();
									state._fsp--;

									adaptor.addChild(root_0, for_statement23.getTree());

									}
									break;
								case 3 :
									// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:65:19: conditional_statement
									{
									pushFollow(FOLLOW_conditional_statement_in_program_ter483);
									conditional_statement24=conditional_statement();
									state._fsp--;

									adaptor.addChild(root_0, conditional_statement24.getTree());

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:67:15: identifier_list ';' ( specifier identifier_list ';' )* ( program_bis | for_statement | conditional_statement )
							{
							pushFollow(FOLLOW_identifier_list_in_program_ter517);
							identifier_list25=identifier_list();
							state._fsp--;

							adaptor.addChild(root_0, identifier_list25.getTree());

							char_literal26=(Token)match(input,52,FOLLOW_52_in_program_ter519); 
							char_literal26_tree = (Object)adaptor.create(char_literal26);
							adaptor.addChild(root_0, char_literal26_tree);

							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:67:35: ( specifier identifier_list ';' )*
							loop3:
							while (true) {
								int alt3=2;
								int LA3_0 = input.LA(1);
								if ( (LA3_0==TYPE||LA3_0==68||LA3_0==82||(LA3_0 >= 84 && LA3_0 <= 85)) ) {
									alt3=1;
								}

								switch (alt3) {
								case 1 :
									// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:67:36: specifier identifier_list ';'
									{
									pushFollow(FOLLOW_specifier_in_program_ter522);
									specifier27=specifier();
									state._fsp--;

									adaptor.addChild(root_0, specifier27.getTree());

									pushFollow(FOLLOW_identifier_list_in_program_ter524);
									identifier_list28=identifier_list();
									state._fsp--;

									adaptor.addChild(root_0, identifier_list28.getTree());

									char_literal29=(Token)match(input,52,FOLLOW_52_in_program_ter526); 
									char_literal29_tree = (Object)adaptor.create(char_literal29);
									adaptor.addChild(root_0, char_literal29_tree);

									}
									break;

								default :
									break loop3;
								}
							}

							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:68:17: ( program_bis | for_statement | conditional_statement )
							int alt4=3;
							switch ( input.LA(1) ) {
							case 69:
								{
								alt4=1;
								}
								break;
							case 73:
								{
								alt4=2;
								}
								break;
							case 76:
								{
								alt4=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 4, 0, input);
								throw nvae;
							}
							switch (alt4) {
								case 1 :
									// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:69:17: program_bis
									{
									pushFollow(FOLLOW_program_bis_in_program_ter564);
									program_bis30=program_bis();
									state._fsp--;

									adaptor.addChild(root_0, program_bis30.getTree());

									}
									break;
								case 2 :
									// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:70:19: for_statement
									{
									pushFollow(FOLLOW_for_statement_in_program_ter584);
									for_statement31=for_statement();
									state._fsp--;

									adaptor.addChild(root_0, for_statement31.getTree());

									}
									break;
								case 3 :
									// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:71:19: conditional_statement
									{
									pushFollow(FOLLOW_conditional_statement_in_program_ter604);
									conditional_statement32=conditional_statement();
									state._fsp--;

									adaptor.addChild(root_0, conditional_statement32.getTree());

									}
									break;

							}

							}
							break;

					}

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
		return retval;
	}
	// $ANTLR end "program_ter"


	public static class unlabelled_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unlabelled"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:76:1: unlabelled : ( unlabelled_block -> unlabelled_block | compound_tail -> compound_tail );
	public final grammarA60Parser.unlabelled_return unlabelled() throws RecognitionException {
		grammarA60Parser.unlabelled_return retval = new grammarA60Parser.unlabelled_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope unlabelled_block33 =null;
		ParserRuleReturnScope compound_tail34 =null;

		RewriteRuleSubtreeStream stream_unlabelled_block=new RewriteRuleSubtreeStream(adaptor,"rule unlabelled_block");
		RewriteRuleSubtreeStream stream_compound_tail=new RewriteRuleSubtreeStream(adaptor,"rule compound_tail");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:76:11: ( unlabelled_block -> unlabelled_block | compound_tail -> compound_tail )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==TYPE||LA7_0==68||(LA7_0 >= 81 && LA7_0 <= 82)||LA7_0==85) ) {
				alt7=1;
			}
			else if ( (LA7_0==IDENTIFIER||LA7_0==52||LA7_0==69||(LA7_0 >= 71 && LA7_0 <= 77)||LA7_0==79) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:77:5: unlabelled_block
					{
					pushFollow(FOLLOW_unlabelled_block_in_unlabelled650);
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
					// 77:22: -> unlabelled_block
					{
						adaptor.addChild(root_0, stream_unlabelled_block.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:78:7: compound_tail
					{
					pushFollow(FOLLOW_compound_tail_in_unlabelled662);
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
					// 78:21: -> compound_tail
					{
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
		return retval;
	}
	// $ANTLR end "unlabelled"


	public static class unlabelled_block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unlabelled_block"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:81:1: unlabelled_block : block_head compound_tail -> ^( UNLABELLED_BLOCK block_head compound_tail ) ;
	public final grammarA60Parser.unlabelled_block_return unlabelled_block() throws RecognitionException {
		grammarA60Parser.unlabelled_block_return retval = new grammarA60Parser.unlabelled_block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block_head35 =null;
		ParserRuleReturnScope compound_tail36 =null;

		RewriteRuleSubtreeStream stream_compound_tail=new RewriteRuleSubtreeStream(adaptor,"rule compound_tail");
		RewriteRuleSubtreeStream stream_block_head=new RewriteRuleSubtreeStream(adaptor,"rule block_head");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:81:17: ( block_head compound_tail -> ^( UNLABELLED_BLOCK block_head compound_tail ) )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:82:5: block_head compound_tail
			{
			pushFollow(FOLLOW_block_head_in_unlabelled_block678);
			block_head35=block_head();
			state._fsp--;

			stream_block_head.add(block_head35.getTree());
			pushFollow(FOLLOW_compound_tail_in_unlabelled_block680);
			compound_tail36=compound_tail();
			state._fsp--;

			stream_compound_tail.add(compound_tail36.getTree());
			// AST REWRITE
			// elements: compound_tail, block_head
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 82:30: -> ^( UNLABELLED_BLOCK block_head compound_tail )
			{
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:82:33: ^( UNLABELLED_BLOCK block_head compound_tail )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNLABELLED_BLOCK, "UNLABELLED_BLOCK"), root_1);
				adaptor.addChild(root_1, stream_block_head.nextTree());
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
		return retval;
	}
	// $ANTLR end "unlabelled_block"


	public static class block_head_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block_head"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:85:1: block_head : ( declaration ';' )+ -> ( declaration )+ ;
	public final grammarA60Parser.block_head_return block_head() throws RecognitionException {
		grammarA60Parser.block_head_return retval = new grammarA60Parser.block_head_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal38=null;
		ParserRuleReturnScope declaration37 =null;

		Object char_literal38_tree=null;
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:85:11: ( ( declaration ';' )+ -> ( declaration )+ )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:86:5: ( declaration ';' )+
			{
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:86:5: ( declaration ';' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==TYPE||LA8_0==68||(LA8_0 >= 81 && LA8_0 <= 82)||LA8_0==85) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:86:6: declaration ';'
					{
					pushFollow(FOLLOW_declaration_in_block_head703);
					declaration37=declaration();
					state._fsp--;

					stream_declaration.add(declaration37.getTree());
					char_literal38=(Token)match(input,52,FOLLOW_52_in_block_head705);  
					stream_52.add(char_literal38);

					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

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
			// 86:24: -> ( declaration )+
			{
				if ( !(stream_declaration.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_declaration.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "block_head"


	public static class compound_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "compound_tail"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:89:1: compound_tail : ( 'label:' )* statement ( ';' ( 'label:' )* statement )* 'end' -> ^( TAIL ( statement )+ ) ;
	public final grammarA60Parser.compound_tail_return compound_tail() throws RecognitionException {
		grammarA60Parser.compound_tail_return retval = new grammarA60Parser.compound_tail_return();
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
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:89:14: ( ( 'label:' )* statement ( ';' ( 'label:' )* statement )* 'end' -> ^( TAIL ( statement )+ ) )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:90:5: ( 'label:' )* statement ( ';' ( 'label:' )* statement )* 'end'
			{
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:90:5: ( 'label:' )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==79) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:90:6: 'label:'
					{
					string_literal39=(Token)match(input,79,FOLLOW_79_in_compound_tail725);  
					stream_79.add(string_literal39);

					}
					break;

				default :
					break loop9;
				}
			}

			pushFollow(FOLLOW_statement_in_compound_tail729);
			statement40=statement();
			state._fsp--;

			stream_statement.add(statement40.getTree());
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:90:27: ( ';' ( 'label:' )* statement )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==52) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:90:29: ';' ( 'label:' )* statement
					{
					char_literal41=(Token)match(input,52,FOLLOW_52_in_compound_tail733);  
					stream_52.add(char_literal41);

					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:90:33: ( 'label:' )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==79) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:90:34: 'label:'
							{
							string_literal42=(Token)match(input,79,FOLLOW_79_in_compound_tail736);  
							stream_79.add(string_literal42);

							}
							break;

						default :
							break loop10;
						}
					}

					pushFollow(FOLLOW_statement_in_compound_tail739);
					statement43=statement();
					state._fsp--;

					stream_statement.add(statement43.getTree());
					}
					break;

				default :
					break loop11;
				}
			}

			string_literal44=(Token)match(input,72,FOLLOW_72_in_compound_tail743);  
			stream_72.add(string_literal44);

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
			// 90:62: -> ^( TAIL ( statement )+ )
			{
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:90:65: ^( TAIL ( statement )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TAIL, "TAIL"), root_1);
				if ( !(stream_statement.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statement.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "compound_tail"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:93:1: statement : ( program_bis -> program_bis | conditional_statement -> conditional_statement | unlabelled_basic_statement -> unlabelled_basic_statement | for_statement -> for_statement | ->);
	public final grammarA60Parser.statement_return statement() throws RecognitionException {
		grammarA60Parser.statement_return retval = new grammarA60Parser.statement_return();
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

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:93:10: ( program_bis -> program_bis | conditional_statement -> conditional_statement | unlabelled_basic_statement -> unlabelled_basic_statement | for_statement -> for_statement | ->)
			int alt12=5;
			switch ( input.LA(1) ) {
			case 69:
				{
				alt12=1;
				}
				break;
			case 76:
				{
				alt12=2;
				}
				break;
			case IDENTIFIER:
			case 74:
			case 75:
			case 77:
				{
				alt12=3;
				}
				break;
			case 73:
				{
				alt12=4;
				}
				break;
			case 52:
			case 71:
			case 72:
				{
				alt12=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:94:5: program_bis
					{
					pushFollow(FOLLOW_program_bis_in_statement764);
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
					// 94:17: -> program_bis
					{
						adaptor.addChild(root_0, stream_program_bis.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:95:7: conditional_statement
					{
					pushFollow(FOLLOW_conditional_statement_in_statement776);
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
					// 95:29: -> conditional_statement
					{
						adaptor.addChild(root_0, stream_conditional_statement.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:96:11: unlabelled_basic_statement
					{
					pushFollow(FOLLOW_unlabelled_basic_statement_in_statement792);
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
					// 96:38: -> unlabelled_basic_statement
					{
						adaptor.addChild(root_0, stream_unlabelled_basic_statement.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:97:11: for_statement
					{
					pushFollow(FOLLOW_for_statement_in_statement808);
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
					// 97:25: -> for_statement
					{
						adaptor.addChild(root_0, stream_for_statement.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:98:11: 
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
					// 98:11: ->
					{
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
		return retval;
	}
	// $ANTLR end "statement"


	public static class statement_bis_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement_bis"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:101:1: statement_bis : ( specifier identifier_list ';' ( specifier identifier_list ';' )* after_statement_bis -> ^( STATEMENT_BIS ( ^( DEFINITION specifier identifier_list ) )+ after_statement_bis ) | after_statement_bis -> ^( STATEMENT_BIS after_statement_bis ) );
	public final grammarA60Parser.statement_bis_return statement_bis() throws RecognitionException {
		grammarA60Parser.statement_bis_return retval = new grammarA60Parser.statement_bis_return();
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
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_specifier=new RewriteRuleSubtreeStream(adaptor,"rule specifier");
		RewriteRuleSubtreeStream stream_after_statement_bis=new RewriteRuleSubtreeStream(adaptor,"rule after_statement_bis");
		RewriteRuleSubtreeStream stream_identifier_list=new RewriteRuleSubtreeStream(adaptor,"rule identifier_list");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:101:14: ( specifier identifier_list ';' ( specifier identifier_list ';' )* after_statement_bis -> ^( STATEMENT_BIS ( ^( DEFINITION specifier identifier_list ) )+ after_statement_bis ) | after_statement_bis -> ^( STATEMENT_BIS after_statement_bis ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==TYPE||LA14_0==68||LA14_0==82||(LA14_0 >= 84 && LA14_0 <= 85)) ) {
				alt14=1;
			}
			else if ( (LA14_0==69||LA14_0==73||LA14_0==76||LA14_0==78) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:102:5: specifier identifier_list ';' ( specifier identifier_list ';' )* after_statement_bis
					{
					pushFollow(FOLLOW_specifier_in_statement_bis836);
					specifier49=specifier();
					state._fsp--;

					stream_specifier.add(specifier49.getTree());
					pushFollow(FOLLOW_identifier_list_in_statement_bis838);
					identifier_list50=identifier_list();
					state._fsp--;

					stream_identifier_list.add(identifier_list50.getTree());
					char_literal51=(Token)match(input,52,FOLLOW_52_in_statement_bis840);  
					stream_52.add(char_literal51);

					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:102:35: ( specifier identifier_list ';' )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==TYPE||LA13_0==68||LA13_0==82||(LA13_0 >= 84 && LA13_0 <= 85)) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:102:36: specifier identifier_list ';'
							{
							pushFollow(FOLLOW_specifier_in_statement_bis843);
							specifier52=specifier();
							state._fsp--;

							stream_specifier.add(specifier52.getTree());
							pushFollow(FOLLOW_identifier_list_in_statement_bis845);
							identifier_list53=identifier_list();
							state._fsp--;

							stream_identifier_list.add(identifier_list53.getTree());
							char_literal54=(Token)match(input,52,FOLLOW_52_in_statement_bis847);  
							stream_52.add(char_literal54);

							}
							break;

						default :
							break loop13;
						}
					}

					pushFollow(FOLLOW_after_statement_bis_in_statement_bis851);
					after_statement_bis55=after_statement_bis();
					state._fsp--;

					stream_after_statement_bis.add(after_statement_bis55.getTree());
					// AST REWRITE
					// elements: specifier, after_statement_bis, identifier_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 102:88: -> ^( STATEMENT_BIS ( ^( DEFINITION specifier identifier_list ) )+ after_statement_bis )
					{
						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:102:91: ^( STATEMENT_BIS ( ^( DEFINITION specifier identifier_list ) )+ after_statement_bis )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENT_BIS, "STATEMENT_BIS"), root_1);
						if ( !(stream_specifier.hasNext()||stream_identifier_list.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_specifier.hasNext()||stream_identifier_list.hasNext() ) {
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:102:107: ^( DEFINITION specifier identifier_list )
							{
							Object root_2 = (Object)adaptor.nil();
							root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_2);
							adaptor.addChild(root_2, stream_specifier.nextTree());
							adaptor.addChild(root_2, stream_identifier_list.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_specifier.reset();
						stream_identifier_list.reset();

						adaptor.addChild(root_1, stream_after_statement_bis.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:103:7: after_statement_bis
					{
					pushFollow(FOLLOW_after_statement_bis_in_statement_bis876);
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
					// 103:26: -> ^( STATEMENT_BIS after_statement_bis )
					{
						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:103:30: ^( STATEMENT_BIS after_statement_bis )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENT_BIS, "STATEMENT_BIS"), root_1);
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
		return retval;
	}
	// $ANTLR end "statement_bis"


	public static class after_statement_bis_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "after_statement_bis"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:106:1: after_statement_bis : ( program_ter -> program_ter | for_statement | conditional_statement );
	public final grammarA60Parser.after_statement_bis_return after_statement_bis() throws RecognitionException {
		grammarA60Parser.after_statement_bis_return retval = new grammarA60Parser.after_statement_bis_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program_ter57 =null;
		ParserRuleReturnScope for_statement58 =null;
		ParserRuleReturnScope conditional_statement59 =null;

		RewriteRuleSubtreeStream stream_program_ter=new RewriteRuleSubtreeStream(adaptor,"rule program_ter");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:106:20: ( program_ter -> program_ter | for_statement | conditional_statement )
			int alt15=3;
			switch ( input.LA(1) ) {
			case 69:
			case 78:
				{
				alt15=1;
				}
				break;
			case 73:
				{
				alt15=2;
				}
				break;
			case 76:
				{
				alt15=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:107:5: program_ter
					{
					pushFollow(FOLLOW_program_ter_in_after_statement_bis896);
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
					// 107:17: -> program_ter
					{
						adaptor.addChild(root_0, stream_program_ter.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:108:7: for_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_for_statement_in_after_statement_bis908);
					for_statement58=for_statement();
					state._fsp--;

					adaptor.addChild(root_0, for_statement58.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:109:7: conditional_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_conditional_statement_in_after_statement_bis916);
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
		return retval;
	}
	// $ANTLR end "after_statement_bis"


	public static class for_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_statement"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:112:1: for_statement : for_clause statement -> ^( FOR_STATEMENT for_clause statement ) ;
	public final grammarA60Parser.for_statement_return for_statement() throws RecognitionException {
		grammarA60Parser.for_statement_return retval = new grammarA60Parser.for_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope for_clause60 =null;
		ParserRuleReturnScope statement61 =null;

		RewriteRuleSubtreeStream stream_for_clause=new RewriteRuleSubtreeStream(adaptor,"rule for_clause");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:112:14: ( for_clause statement -> ^( FOR_STATEMENT for_clause statement ) )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:113:5: for_clause statement
			{
			pushFollow(FOLLOW_for_clause_in_for_statement928);
			for_clause60=for_clause();
			state._fsp--;

			stream_for_clause.add(for_clause60.getTree());
			pushFollow(FOLLOW_statement_in_for_statement930);
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
			// 113:26: -> ^( FOR_STATEMENT for_clause statement )
			{
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:113:29: ^( FOR_STATEMENT for_clause statement )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_STATEMENT, "FOR_STATEMENT"), root_1);
				adaptor.addChild(root_1, stream_for_clause.nextTree());
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
		return retval;
	}
	// $ANTLR end "for_statement"


	public static class for_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_clause"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:116:1: for_clause : 'for' IDENTIFIER ':=' for_list_element 'do' -> ^( FOR_CONDITION IDENTIFIER for_list_element ) ;
	public final grammarA60Parser.for_clause_return for_clause() throws RecognitionException {
		grammarA60Parser.for_clause_return retval = new grammarA60Parser.for_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal62=null;
		Token IDENTIFIER63=null;
		Token string_literal64=null;
		Token string_literal66=null;
		ParserRuleReturnScope for_list_element65 =null;

		Object string_literal62_tree=null;
		Object IDENTIFIER63_tree=null;
		Object string_literal64_tree=null;
		Object string_literal66_tree=null;
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_for_list_element=new RewriteRuleSubtreeStream(adaptor,"rule for_list_element");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:116:11: ( 'for' IDENTIFIER ':=' for_list_element 'do' -> ^( FOR_CONDITION IDENTIFIER for_list_element ) )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:117:5: 'for' IDENTIFIER ':=' for_list_element 'do'
			{
			string_literal62=(Token)match(input,73,FOLLOW_73_in_for_clause952);  
			stream_73.add(string_literal62);

			IDENTIFIER63=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_for_clause954);  
			stream_IDENTIFIER.add(IDENTIFIER63);

			string_literal64=(Token)match(input,51,FOLLOW_51_in_for_clause956);  
			stream_51.add(string_literal64);

			pushFollow(FOLLOW_for_list_element_in_for_clause958);
			for_list_element65=for_list_element();
			state._fsp--;

			stream_for_list_element.add(for_list_element65.getTree());
			string_literal66=(Token)match(input,70,FOLLOW_70_in_for_clause960);  
			stream_70.add(string_literal66);

			// AST REWRITE
			// elements: IDENTIFIER, for_list_element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 117:49: -> ^( FOR_CONDITION IDENTIFIER for_list_element )
			{
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:117:52: ^( FOR_CONDITION IDENTIFIER for_list_element )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_CONDITION, "FOR_CONDITION"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_for_list_element.nextTree());
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
		return retval;
	}
	// $ANTLR end "for_clause"


	public static class for_list_element_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_list_element"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:125:1: for_list_element : boolean_expr ( 'step' exp1= expression 'until' exp2= expression -> ^( FOR_LIST_ELEM boolean_expr ^( STEP $exp1) ^( UNTIL $exp2) ) | 'while' expression -> ^( FOR_LIST_ELEM boolean_expr expression ) ) ;
	public final grammarA60Parser.for_list_element_return for_list_element() throws RecognitionException {
		grammarA60Parser.for_list_element_return retval = new grammarA60Parser.for_list_element_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal68=null;
		Token string_literal69=null;
		Token string_literal70=null;
		ParserRuleReturnScope exp1 =null;
		ParserRuleReturnScope exp2 =null;
		ParserRuleReturnScope boolean_expr67 =null;
		ParserRuleReturnScope expression71 =null;

		Object string_literal68_tree=null;
		Object string_literal69_tree=null;
		Object string_literal70_tree=null;
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_boolean_expr=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expr");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:125:17: ( boolean_expr ( 'step' exp1= expression 'until' exp2= expression -> ^( FOR_LIST_ELEM boolean_expr ^( STEP $exp1) ^( UNTIL $exp2) ) | 'while' expression -> ^( FOR_LIST_ELEM boolean_expr expression ) ) )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:126:5: boolean_expr ( 'step' exp1= expression 'until' exp2= expression -> ^( FOR_LIST_ELEM boolean_expr ^( STEP $exp1) ^( UNTIL $exp2) ) | 'while' expression -> ^( FOR_LIST_ELEM boolean_expr expression ) )
			{
			pushFollow(FOLLOW_boolean_expr_in_for_list_element987);
			boolean_expr67=boolean_expr();
			state._fsp--;

			stream_boolean_expr.add(boolean_expr67.getTree());
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:127:6: ( 'step' exp1= expression 'until' exp2= expression -> ^( FOR_LIST_ELEM boolean_expr ^( STEP $exp1) ^( UNTIL $exp2) ) | 'while' expression -> ^( FOR_LIST_ELEM boolean_expr expression ) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==83) ) {
				alt16=1;
			}
			else if ( (LA16_0==89) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:128:6: 'step' exp1= expression 'until' exp2= expression
					{
					string_literal68=(Token)match(input,83,FOLLOW_83_in_for_list_element1001);  
					stream_83.add(string_literal68);

					pushFollow(FOLLOW_expression_in_for_list_element1005);
					exp1=expression();
					state._fsp--;

					stream_expression.add(exp1.getTree());
					string_literal69=(Token)match(input,87,FOLLOW_87_in_for_list_element1007);  
					stream_87.add(string_literal69);

					pushFollow(FOLLOW_expression_in_for_list_element1011);
					exp2=expression();
					state._fsp--;

					stream_expression.add(exp2.getTree());
					// AST REWRITE
					// elements: exp2, exp1, boolean_expr
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
					// 128:53: -> ^( FOR_LIST_ELEM boolean_expr ^( STEP $exp1) ^( UNTIL $exp2) )
					{
						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:128:56: ^( FOR_LIST_ELEM boolean_expr ^( STEP $exp1) ^( UNTIL $exp2) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_LIST_ELEM, "FOR_LIST_ELEM"), root_1);
						adaptor.addChild(root_1, stream_boolean_expr.nextTree());
						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:128:85: ^( STEP $exp1)
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STEP, "STEP"), root_2);
						adaptor.addChild(root_2, stream_exp1.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:128:99: ^( UNTIL $exp2)
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNTIL, "UNTIL"), root_2);
						adaptor.addChild(root_2, stream_exp2.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:129:8: 'while' expression
					{
					string_literal70=(Token)match(input,89,FOLLOW_89_in_for_list_element1042);  
					stream_89.add(string_literal70);

					pushFollow(FOLLOW_expression_in_for_list_element1044);
					expression71=expression();
					state._fsp--;

					stream_expression.add(expression71.getTree());
					// AST REWRITE
					// elements: boolean_expr, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 129:27: -> ^( FOR_LIST_ELEM boolean_expr expression )
					{
						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:129:30: ^( FOR_LIST_ELEM boolean_expr expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_LIST_ELEM, "FOR_LIST_ELEM"), root_1);
						adaptor.addChild(root_1, stream_boolean_expr.nextTree());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

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
		return retval;
	}
	// $ANTLR end "for_list_element"


	public static class conditional_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditional_statement"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:134:1: conditional_statement : if_clause stat1= statement ( options {greedy=true; } : 'else' stat2= statement )? -> ^( IF_STATEMENT ^( CONDITION if_clause ) ^( ALORS $stat1) ( ^( SINON $stat2) )? ) ;
	public final grammarA60Parser.conditional_statement_return conditional_statement() throws RecognitionException {
		grammarA60Parser.conditional_statement_return retval = new grammarA60Parser.conditional_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal73=null;
		ParserRuleReturnScope stat1 =null;
		ParserRuleReturnScope stat2 =null;
		ParserRuleReturnScope if_clause72 =null;

		Object string_literal73_tree=null;
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_if_clause=new RewriteRuleSubtreeStream(adaptor,"rule if_clause");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:134:22: ( if_clause stat1= statement ( options {greedy=true; } : 'else' stat2= statement )? -> ^( IF_STATEMENT ^( CONDITION if_clause ) ^( ALORS $stat1) ( ^( SINON $stat2) )? ) )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:135:5: if_clause stat1= statement ( options {greedy=true; } : 'else' stat2= statement )?
			{
			pushFollow(FOLLOW_if_clause_in_conditional_statement1079);
			if_clause72=if_clause();
			state._fsp--;

			stream_if_clause.add(if_clause72.getTree());
			pushFollow(FOLLOW_statement_in_conditional_statement1083);
			stat1=statement();
			state._fsp--;

			stream_statement.add(stat1.getTree());
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:135:31: ( options {greedy=true; } : 'else' stat2= statement )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==71) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:135:55: 'else' stat2= statement
					{
					string_literal73=(Token)match(input,71,FOLLOW_71_in_conditional_statement1094);  
					stream_71.add(string_literal73);

					pushFollow(FOLLOW_statement_in_conditional_statement1098);
					stat2=statement();
					state._fsp--;

					stream_statement.add(stat2.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: stat1, if_clause, stat2
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
			// 135:80: -> ^( IF_STATEMENT ^( CONDITION if_clause ) ^( ALORS $stat1) ( ^( SINON $stat2) )? )
			{
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:135:83: ^( IF_STATEMENT ^( CONDITION if_clause ) ^( ALORS $stat1) ( ^( SINON $stat2) )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF_STATEMENT, "IF_STATEMENT"), root_1);
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:135:98: ^( CONDITION if_clause )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);
				adaptor.addChild(root_2, stream_if_clause.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:135:121: ^( ALORS $stat1)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALORS, "ALORS"), root_2);
				adaptor.addChild(root_2, stream_stat1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:135:137: ( ^( SINON $stat2) )?
				if ( stream_stat2.hasNext() ) {
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:135:137: ^( SINON $stat2)
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SINON, "SINON"), root_2);
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
		return retval;
	}
	// $ANTLR end "conditional_statement"


	public static class unlabelled_basic_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unlabelled_basic_statement"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:138:1: unlabelled_basic_statement : ( go_to_statement -> go_to_statement | 'inline' actual_parameter_list | IDENTIFIER ( '[' boolean_expr ( ',' boolean_expr )* ']' )? ( ( ( ':' ( ';' )? | ':=' ) expression )* -> ^( ACTION IDENTIFIER ( boolean_expr )* expression ) | ( actual_parameter_list ) -> ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list ) ) );
	public final grammarA60Parser.unlabelled_basic_statement_return unlabelled_basic_statement() throws RecognitionException {
		grammarA60Parser.unlabelled_basic_statement_return retval = new grammarA60Parser.unlabelled_basic_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal75=null;
		Token IDENTIFIER77=null;
		Token char_literal78=null;
		Token char_literal80=null;
		Token char_literal82=null;
		Token char_literal83=null;
		Token char_literal84=null;
		Token string_literal85=null;
		ParserRuleReturnScope go_to_statement74 =null;
		ParserRuleReturnScope actual_parameter_list76 =null;
		ParserRuleReturnScope boolean_expr79 =null;
		ParserRuleReturnScope boolean_expr81 =null;
		ParserRuleReturnScope expression86 =null;
		ParserRuleReturnScope actual_parameter_list87 =null;

		Object string_literal75_tree=null;
		Object IDENTIFIER77_tree=null;
		Object char_literal78_tree=null;
		Object char_literal80_tree=null;
		Object char_literal82_tree=null;
		Object char_literal83_tree=null;
		Object char_literal84_tree=null;
		Object string_literal85_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_go_to_statement=new RewriteRuleSubtreeStream(adaptor,"rule go_to_statement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_boolean_expr=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expr");
		RewriteRuleSubtreeStream stream_actual_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule actual_parameter_list");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:138:27: ( go_to_statement -> go_to_statement | 'inline' actual_parameter_list | IDENTIFIER ( '[' boolean_expr ( ',' boolean_expr )* ']' )? ( ( ( ':' ( ';' )? | ':=' ) expression )* -> ^( ACTION IDENTIFIER ( boolean_expr )* expression ) | ( actual_parameter_list ) -> ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list ) ) )
			int alt24=3;
			switch ( input.LA(1) ) {
			case 74:
			case 75:
				{
				alt24=1;
				}
				break;
			case 77:
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
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:139:5: go_to_statement
					{
					pushFollow(FOLLOW_go_to_statement_in_unlabelled_basic_statement1140);
					go_to_statement74=go_to_statement();
					state._fsp--;

					stream_go_to_statement.add(go_to_statement74.getTree());
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
					// 139:21: -> go_to_statement
					{
						adaptor.addChild(root_0, stream_go_to_statement.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:140:7: 'inline' actual_parameter_list
					{
					root_0 = (Object)adaptor.nil();


					string_literal75=(Token)match(input,77,FOLLOW_77_in_unlabelled_basic_statement1152); 
					string_literal75_tree = (Object)adaptor.create(string_literal75);
					adaptor.addChild(root_0, string_literal75_tree);

					pushFollow(FOLLOW_actual_parameter_list_in_unlabelled_basic_statement1154);
					actual_parameter_list76=actual_parameter_list();
					state._fsp--;

					adaptor.addChild(root_0, actual_parameter_list76.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:141:7: IDENTIFIER ( '[' boolean_expr ( ',' boolean_expr )* ']' )? ( ( ( ':' ( ';' )? | ':=' ) expression )* -> ^( ACTION IDENTIFIER ( boolean_expr )* expression ) | ( actual_parameter_list ) -> ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list ) )
					{
					IDENTIFIER77=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_unlabelled_basic_statement1162);  
					stream_IDENTIFIER.add(IDENTIFIER77);

					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:141:18: ( '[' boolean_expr ( ',' boolean_expr )* ']' )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==65) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:141:19: '[' boolean_expr ( ',' boolean_expr )* ']'
							{
							char_literal78=(Token)match(input,65,FOLLOW_65_in_unlabelled_basic_statement1165);  
							stream_65.add(char_literal78);

							pushFollow(FOLLOW_boolean_expr_in_unlabelled_basic_statement1166);
							boolean_expr79=boolean_expr();
							state._fsp--;

							stream_boolean_expr.add(boolean_expr79.getTree());
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:141:35: ( ',' boolean_expr )*
							loop18:
							while (true) {
								int alt18=2;
								int LA18_0 = input.LA(1);
								if ( (LA18_0==47) ) {
									alt18=1;
								}

								switch (alt18) {
								case 1 :
									// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:141:36: ',' boolean_expr
									{
									char_literal80=(Token)match(input,47,FOLLOW_47_in_unlabelled_basic_statement1169);  
									stream_47.add(char_literal80);

									pushFollow(FOLLOW_boolean_expr_in_unlabelled_basic_statement1170);
									boolean_expr81=boolean_expr();
									state._fsp--;

									stream_boolean_expr.add(boolean_expr81.getTree());
									}
									break;

								default :
									break loop18;
								}
							}

							char_literal82=(Token)match(input,66,FOLLOW_66_in_unlabelled_basic_statement1174);  
							stream_66.add(char_literal82);

							}
							break;

					}

					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:142:9: ( ( ( ':' ( ';' )? | ':=' ) expression )* -> ^( ACTION IDENTIFIER ( boolean_expr )* expression ) | ( actual_parameter_list ) -> ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list ) )
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( ((LA23_0 >= 50 && LA23_0 <= 52)||(LA23_0 >= 71 && LA23_0 <= 72)) ) {
						alt23=1;
					}
					else if ( (LA23_0==42) ) {
						alt23=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}

					switch (alt23) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:143:9: ( ( ':' ( ';' )? | ':=' ) expression )*
							{
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:143:9: ( ( ':' ( ';' )? | ':=' ) expression )*
							loop22:
							while (true) {
								int alt22=2;
								int LA22_0 = input.LA(1);
								if ( ((LA22_0 >= 50 && LA22_0 <= 51)) ) {
									alt22=1;
								}

								switch (alt22) {
								case 1 :
									// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:143:10: ( ':' ( ';' )? | ':=' ) expression
									{
									// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:143:10: ( ':' ( ';' )? | ':=' )
									int alt21=2;
									int LA21_0 = input.LA(1);
									if ( (LA21_0==50) ) {
										alt21=1;
									}
									else if ( (LA21_0==51) ) {
										alt21=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 21, 0, input);
										throw nvae;
									}

									switch (alt21) {
										case 1 :
											// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:143:11: ':' ( ';' )?
											{
											char_literal83=(Token)match(input,50,FOLLOW_50_in_unlabelled_basic_statement1198);  
											stream_50.add(char_literal83);

											// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:143:14: ( ';' )?
											int alt20=2;
											int LA20_0 = input.LA(1);
											if ( (LA20_0==52) ) {
												alt20=1;
											}
											switch (alt20) {
												case 1 :
													// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:143:14: ';'
													{
													char_literal84=(Token)match(input,52,FOLLOW_52_in_unlabelled_basic_statement1199);  
													stream_52.add(char_literal84);

													}
													break;

											}

											}
											break;
										case 2 :
											// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:143:19: ':='
											{
											string_literal85=(Token)match(input,51,FOLLOW_51_in_unlabelled_basic_statement1202);  
											stream_51.add(string_literal85);

											}
											break;

									}

									pushFollow(FOLLOW_expression_in_unlabelled_basic_statement1206);
									expression86=expression();
									state._fsp--;

									stream_expression.add(expression86.getTree());
									}
									break;

								default :
									break loop22;
								}
							}

							// AST REWRITE
							// elements: IDENTIFIER, boolean_expr, expression
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 143:39: -> ^( ACTION IDENTIFIER ( boolean_expr )* expression )
							{
								// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:143:42: ^( ACTION IDENTIFIER ( boolean_expr )* expression )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACTION, "ACTION"), root_1);
								adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
								// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:143:62: ( boolean_expr )*
								while ( stream_boolean_expr.hasNext() ) {
									adaptor.addChild(root_1, stream_boolean_expr.nextTree());
								}
								stream_boolean_expr.reset();

								adaptor.addChild(root_1, stream_expression.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:144:11: ( actual_parameter_list )
							{
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:144:11: ( actual_parameter_list )
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:144:12: actual_parameter_list
							{
							pushFollow(FOLLOW_actual_parameter_list_in_unlabelled_basic_statement1235);
							actual_parameter_list87=actual_parameter_list();
							state._fsp--;

							stream_actual_parameter_list.add(actual_parameter_list87.getTree());
							}

							// AST REWRITE
							// elements: IDENTIFIER, boolean_expr, actual_parameter_list
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 144:35: -> ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list )
							{
								// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:144:38: ^( ACTION IDENTIFIER ( boolean_expr )* actual_parameter_list )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACTION, "ACTION"), root_1);
								adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
								// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:144:58: ( boolean_expr )*
								while ( stream_boolean_expr.hasNext() ) {
									adaptor.addChild(root_1, stream_boolean_expr.nextTree());
								}
								stream_boolean_expr.reset();

								adaptor.addChild(root_1, stream_actual_parameter_list.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

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
		return retval;
	}
	// $ANTLR end "unlabelled_basic_statement"


	public static class go_to_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "go_to_statement"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:148:1: go_to_statement : ( 'goto' ^| 'go to' ^) expression ;
	public final grammarA60Parser.go_to_statement_return go_to_statement() throws RecognitionException {
		grammarA60Parser.go_to_statement_return retval = new grammarA60Parser.go_to_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal88=null;
		Token string_literal89=null;
		ParserRuleReturnScope expression90 =null;

		Object string_literal88_tree=null;
		Object string_literal89_tree=null;

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:148:16: ( ( 'goto' ^| 'go to' ^) expression )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:149:5: ( 'goto' ^| 'go to' ^) expression
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:149:5: ( 'goto' ^| 'go to' ^)
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==75) ) {
				alt25=1;
			}
			else if ( (LA25_0==74) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:149:6: 'goto' ^
					{
					string_literal88=(Token)match(input,75,FOLLOW_75_in_go_to_statement1272); 
					string_literal88_tree = (Object)adaptor.create(string_literal88);
					root_0 = (Object)adaptor.becomeRoot(string_literal88_tree, root_0);

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:149:16: 'go to' ^
					{
					string_literal89=(Token)match(input,74,FOLLOW_74_in_go_to_statement1277); 
					string_literal89_tree = (Object)adaptor.create(string_literal89);
					root_0 = (Object)adaptor.becomeRoot(string_literal89_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_expression_in_go_to_statement1281);
			expression90=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression90.getTree());

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
		return retval;
	}
	// $ANTLR end "go_to_statement"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:152:1: expression : ( boolean_expr -> boolean_expr | if_clause exp1= expression ( 'else' exp2= expression ) -> ^( IF ^( CONDITION if_clause ) ^( ALORS $exp1) ^( SINON $exp2) ) | go_to_statement | program );
	public final grammarA60Parser.expression_return expression() throws RecognitionException {
		grammarA60Parser.expression_return retval = new grammarA60Parser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal93=null;
		ParserRuleReturnScope exp1 =null;
		ParserRuleReturnScope exp2 =null;
		ParserRuleReturnScope boolean_expr91 =null;
		ParserRuleReturnScope if_clause92 =null;
		ParserRuleReturnScope go_to_statement94 =null;
		ParserRuleReturnScope program95 =null;

		Object string_literal93_tree=null;
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_boolean_expr=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expr");
		RewriteRuleSubtreeStream stream_if_clause=new RewriteRuleSubtreeStream(adaptor,"rule if_clause");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:152:11: ( boolean_expr -> boolean_expr | if_clause exp1= expression ( 'else' exp2= expression ) -> ^( IF ^( CONDITION if_clause ) ^( ALORS $exp1) ^( SINON $exp2) ) | go_to_statement | program )
			int alt26=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case UNSIGNED_NUMBER:
			case 42:
			case 46:
			case 48:
			case 62:
			case 64:
			case 92:
				{
				alt26=1;
				}
				break;
			case 76:
				{
				alt26=2;
				}
				break;
			case 74:
			case 75:
				{
				alt26=3;
				}
				break;
			case TYPE:
			case 68:
			case 69:
			case 77:
			case 78:
			case 81:
			case 82:
			case 85:
				{
				alt26=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:153:5: boolean_expr
					{
					pushFollow(FOLLOW_boolean_expr_in_expression1293);
					boolean_expr91=boolean_expr();
					state._fsp--;

					stream_boolean_expr.add(boolean_expr91.getTree());
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
					// 153:18: -> boolean_expr
					{
						adaptor.addChild(root_0, stream_boolean_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:154:11: if_clause exp1= expression ( 'else' exp2= expression )
					{
					pushFollow(FOLLOW_if_clause_in_expression1309);
					if_clause92=if_clause();
					state._fsp--;

					stream_if_clause.add(if_clause92.getTree());
					pushFollow(FOLLOW_expression_in_expression1313);
					exp1=expression();
					state._fsp--;

					stream_expression.add(exp1.getTree());
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:154:37: ( 'else' exp2= expression )
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:154:38: 'else' exp2= expression
					{
					string_literal93=(Token)match(input,71,FOLLOW_71_in_expression1316);  
					stream_71.add(string_literal93);

					pushFollow(FOLLOW_expression_in_expression1320);
					exp2=expression();
					state._fsp--;

					stream_expression.add(exp2.getTree());
					}

					// AST REWRITE
					// elements: exp1, if_clause, exp2
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
					// 154:62: -> ^( IF ^( CONDITION if_clause ) ^( ALORS $exp1) ^( SINON $exp2) )
					{
						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:154:65: ^( IF ^( CONDITION if_clause ) ^( ALORS $exp1) ^( SINON $exp2) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:154:70: ^( CONDITION if_clause )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);
						adaptor.addChild(root_2, stream_if_clause.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:154:93: ^( ALORS $exp1)
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALORS, "ALORS"), root_2);
						adaptor.addChild(root_2, stream_exp1.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:154:108: ^( SINON $exp2)
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SINON, "SINON"), root_2);
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
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:155:11: go_to_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_go_to_statement_in_expression1359);
					go_to_statement94=go_to_statement();
					state._fsp--;

					adaptor.addChild(root_0, go_to_statement94.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:156:11: program
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_program_in_expression1372);
					program95=program();
					state._fsp--;

					adaptor.addChild(root_0, program95.getTree());

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
		return retval;
	}
	// $ANTLR end "expression"


	public static class if_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_clause"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:159:1: if_clause : 'if' boolean_expr 'then' -> boolean_expr ;
	public final grammarA60Parser.if_clause_return if_clause() throws RecognitionException {
		grammarA60Parser.if_clause_return retval = new grammarA60Parser.if_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal96=null;
		Token string_literal98=null;
		ParserRuleReturnScope boolean_expr97 =null;

		Object string_literal96_tree=null;
		Object string_literal98_tree=null;
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_boolean_expr=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expr");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:159:10: ( 'if' boolean_expr 'then' -> boolean_expr )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:160:5: 'if' boolean_expr 'then'
			{
			string_literal96=(Token)match(input,76,FOLLOW_76_in_if_clause1385);  
			stream_76.add(string_literal96);

			pushFollow(FOLLOW_boolean_expr_in_if_clause1387);
			boolean_expr97=boolean_expr();
			state._fsp--;

			stream_boolean_expr.add(boolean_expr97.getTree());
			string_literal98=(Token)match(input,86,FOLLOW_86_in_if_clause1389);  
			stream_86.add(string_literal98);

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
			// 160:30: -> boolean_expr
			{
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
		return retval;
	}
	// $ANTLR end "if_clause"


	public static class boolean_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_expr"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:163:1: boolean_expr : logic_expr ( '<=>' logic_expr )* -> ( logic_expr )+ ;
	public final grammarA60Parser.boolean_expr_return boolean_expr() throws RecognitionException {
		grammarA60Parser.boolean_expr_return retval = new grammarA60Parser.boolean_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal100=null;
		ParserRuleReturnScope logic_expr99 =null;
		ParserRuleReturnScope logic_expr101 =null;

		Object string_literal100_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleSubtreeStream stream_logic_expr=new RewriteRuleSubtreeStream(adaptor,"rule logic_expr");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:163:13: ( logic_expr ( '<=>' logic_expr )* -> ( logic_expr )+ )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:164:5: logic_expr ( '<=>' logic_expr )*
			{
			pushFollow(FOLLOW_logic_expr_in_boolean_expr1405);
			logic_expr99=logic_expr();
			state._fsp--;

			stream_logic_expr.add(logic_expr99.getTree());
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:164:16: ( '<=>' logic_expr )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==55) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:164:18: '<=>' logic_expr
					{
					string_literal100=(Token)match(input,55,FOLLOW_55_in_boolean_expr1409);  
					stream_55.add(string_literal100);

					pushFollow(FOLLOW_logic_expr_in_boolean_expr1411);
					logic_expr101=logic_expr();
					state._fsp--;

					stream_logic_expr.add(logic_expr101.getTree());
					}
					break;

				default :
					break loop27;
				}
			}

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
			// 164:37: -> ( logic_expr )+
			{
				if ( !(stream_logic_expr.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_logic_expr.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "boolean_expr"


	public static class logic_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logic_expr"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:167:1: logic_expr : logic_expr_bis ( '=>' logic_expr_bis )* -> ( logic_expr_bis )+ ;
	public final grammarA60Parser.logic_expr_return logic_expr() throws RecognitionException {
		grammarA60Parser.logic_expr_return retval = new grammarA60Parser.logic_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal103=null;
		ParserRuleReturnScope logic_expr_bis102 =null;
		ParserRuleReturnScope logic_expr_bis104 =null;

		Object string_literal103_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleSubtreeStream stream_logic_expr_bis=new RewriteRuleSubtreeStream(adaptor,"rule logic_expr_bis");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:167:11: ( logic_expr_bis ( '=>' logic_expr_bis )* -> ( logic_expr_bis )+ )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:168:5: logic_expr_bis ( '=>' logic_expr_bis )*
			{
			pushFollow(FOLLOW_logic_expr_bis_in_logic_expr1430);
			logic_expr_bis102=logic_expr_bis();
			state._fsp--;

			stream_logic_expr_bis.add(logic_expr_bis102.getTree());
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:168:20: ( '=>' logic_expr_bis )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==58) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:168:22: '=>' logic_expr_bis
					{
					string_literal103=(Token)match(input,58,FOLLOW_58_in_logic_expr1434);  
					stream_58.add(string_literal103);

					pushFollow(FOLLOW_logic_expr_bis_in_logic_expr1436);
					logic_expr_bis104=logic_expr_bis();
					state._fsp--;

					stream_logic_expr_bis.add(logic_expr_bis104.getTree());
					}
					break;

				default :
					break loop28;
				}
			}

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
			// 168:44: -> ( logic_expr_bis )+
			{
				if ( !(stream_logic_expr_bis.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_logic_expr_bis.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "logic_expr"


	public static class logic_expr_bis_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logic_expr_bis"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:171:1: logic_expr_bis : logic_expr_ter ( ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter )* ;
	public final grammarA60Parser.logic_expr_bis_return logic_expr_bis() throws RecognitionException {
		grammarA60Parser.logic_expr_bis_return retval = new grammarA60Parser.logic_expr_bis_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal106=null;
		Token string_literal107=null;
		Token string_literal108=null;
		Token string_literal109=null;
		Token string_literal110=null;
		Token string_literal111=null;
		Token char_literal112=null;
		Token char_literal113=null;
		ParserRuleReturnScope logic_expr_ter105 =null;
		ParserRuleReturnScope logic_expr_ter114 =null;

		Object string_literal106_tree=null;
		Object string_literal107_tree=null;
		Object string_literal108_tree=null;
		Object string_literal109_tree=null;
		Object string_literal110_tree=null;
		Object string_literal111_tree=null;
		Object char_literal112_tree=null;
		Object char_literal113_tree=null;

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:171:15: ( logic_expr_ter ( ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter )* )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:172:5: logic_expr_ter ( ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logic_expr_ter_in_logic_expr_bis1455);
			logic_expr_ter105=logic_expr_ter();
			state._fsp--;

			adaptor.addChild(root_0, logic_expr_ter105.getTree());

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:172:20: ( ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( ((LA30_0 >= 40 && LA30_0 <= 41)||LA30_0==61||LA30_0==63||LA30_0==67||LA30_0==80||(LA30_0 >= 90 && LA30_0 <= 91)) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:173:9: ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^) logic_expr_ter
					{
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:173:9: ( 'OR' ^| 'or' ^| '||' ^| 'AND' ^| 'and' ^| '&&' ^| '&' ^| '|' ^)
					int alt29=8;
					switch ( input.LA(1) ) {
					case 63:
						{
						alt29=1;
						}
						break;
					case 80:
						{
						alt29=2;
						}
						break;
					case 91:
						{
						alt29=3;
						}
						break;
					case 61:
						{
						alt29=4;
						}
						break;
					case 67:
						{
						alt29=5;
						}
						break;
					case 40:
						{
						alt29=6;
						}
						break;
					case 41:
						{
						alt29=7;
						}
						break;
					case 90:
						{
						alt29=8;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}
					switch (alt29) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:174:9: 'OR' ^
							{
							string_literal106=(Token)match(input,63,FOLLOW_63_in_logic_expr_bis1477); 
							string_literal106_tree = (Object)adaptor.create(string_literal106);
							root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:175:11: 'or' ^
							{
							string_literal107=(Token)match(input,80,FOLLOW_80_in_logic_expr_bis1491); 
							string_literal107_tree = (Object)adaptor.create(string_literal107);
							root_0 = (Object)adaptor.becomeRoot(string_literal107_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:176:11: '||' ^
							{
							string_literal108=(Token)match(input,91,FOLLOW_91_in_logic_expr_bis1505); 
							string_literal108_tree = (Object)adaptor.create(string_literal108);
							root_0 = (Object)adaptor.becomeRoot(string_literal108_tree, root_0);

							}
							break;
						case 4 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:177:11: 'AND' ^
							{
							string_literal109=(Token)match(input,61,FOLLOW_61_in_logic_expr_bis1519); 
							string_literal109_tree = (Object)adaptor.create(string_literal109);
							root_0 = (Object)adaptor.becomeRoot(string_literal109_tree, root_0);

							}
							break;
						case 5 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:178:11: 'and' ^
							{
							string_literal110=(Token)match(input,67,FOLLOW_67_in_logic_expr_bis1533); 
							string_literal110_tree = (Object)adaptor.create(string_literal110);
							root_0 = (Object)adaptor.becomeRoot(string_literal110_tree, root_0);

							}
							break;
						case 6 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:179:11: '&&' ^
							{
							string_literal111=(Token)match(input,40,FOLLOW_40_in_logic_expr_bis1547); 
							string_literal111_tree = (Object)adaptor.create(string_literal111);
							root_0 = (Object)adaptor.becomeRoot(string_literal111_tree, root_0);

							}
							break;
						case 7 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:180:11: '&' ^
							{
							char_literal112=(Token)match(input,41,FOLLOW_41_in_logic_expr_bis1561); 
							char_literal112_tree = (Object)adaptor.create(char_literal112);
							root_0 = (Object)adaptor.becomeRoot(char_literal112_tree, root_0);

							}
							break;
						case 8 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:181:11: '|' ^
							{
							char_literal113=(Token)match(input,90,FOLLOW_90_in_logic_expr_bis1574); 
							char_literal113_tree = (Object)adaptor.create(char_literal113);
							root_0 = (Object)adaptor.becomeRoot(char_literal113_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_logic_expr_ter_in_logic_expr_bis1587);
					logic_expr_ter114=logic_expr_ter();
					state._fsp--;

					adaptor.addChild(root_0, logic_expr_ter114.getTree());

					}
					break;

				default :
					break loop30;
				}
			}

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
		return retval;
	}
	// $ANTLR end "logic_expr_bis"


	public static class logic_expr_ter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logic_expr_ter"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:185:1: logic_expr_ter : add_expr ( ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr )* ;
	public final grammarA60Parser.logic_expr_ter_return logic_expr_ter() throws RecognitionException {
		grammarA60Parser.logic_expr_ter_return retval = new grammarA60Parser.logic_expr_ter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal116=null;
		Token char_literal117=null;
		Token string_literal118=null;
		Token string_literal119=null;
		Token char_literal120=null;
		Token string_literal121=null;
		ParserRuleReturnScope add_expr115 =null;
		ParserRuleReturnScope add_expr122 =null;

		Object char_literal116_tree=null;
		Object char_literal117_tree=null;
		Object string_literal118_tree=null;
		Object string_literal119_tree=null;
		Object char_literal120_tree=null;
		Object string_literal121_tree=null;

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:185:15: ( add_expr ( ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr )* )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:186:5: add_expr ( ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_add_expr_in_logic_expr_ter1601);
			add_expr115=add_expr();
			state._fsp--;

			adaptor.addChild(root_0, add_expr115.getTree());

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:186:14: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( ((LA32_0 >= 53 && LA32_0 <= 54)||(LA32_0 >= 56 && LA32_0 <= 57)||(LA32_0 >= 59 && LA32_0 <= 60)) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:187:9: ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^) add_expr
					{
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:187:9: ( '<' ^| '>' ^| '<=' ^| '>=' ^| '=' ^| '<>' ^)
					int alt31=6;
					switch ( input.LA(1) ) {
					case 53:
						{
						alt31=1;
						}
						break;
					case 59:
						{
						alt31=2;
						}
						break;
					case 54:
						{
						alt31=3;
						}
						break;
					case 60:
						{
						alt31=4;
						}
						break;
					case 57:
						{
						alt31=5;
						}
						break;
					case 56:
						{
						alt31=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}
					switch (alt31) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:188:9: '<' ^
							{
							char_literal116=(Token)match(input,53,FOLLOW_53_in_logic_expr_ter1623); 
							char_literal116_tree = (Object)adaptor.create(char_literal116);
							root_0 = (Object)adaptor.becomeRoot(char_literal116_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:189:11: '>' ^
							{
							char_literal117=(Token)match(input,59,FOLLOW_59_in_logic_expr_ter1637); 
							char_literal117_tree = (Object)adaptor.create(char_literal117);
							root_0 = (Object)adaptor.becomeRoot(char_literal117_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:190:11: '<=' ^
							{
							string_literal118=(Token)match(input,54,FOLLOW_54_in_logic_expr_ter1651); 
							string_literal118_tree = (Object)adaptor.create(string_literal118);
							root_0 = (Object)adaptor.becomeRoot(string_literal118_tree, root_0);

							}
							break;
						case 4 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:191:11: '>=' ^
							{
							string_literal119=(Token)match(input,60,FOLLOW_60_in_logic_expr_ter1665); 
							string_literal119_tree = (Object)adaptor.create(string_literal119);
							root_0 = (Object)adaptor.becomeRoot(string_literal119_tree, root_0);

							}
							break;
						case 5 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:192:11: '=' ^
							{
							char_literal120=(Token)match(input,57,FOLLOW_57_in_logic_expr_ter1679); 
							char_literal120_tree = (Object)adaptor.create(char_literal120);
							root_0 = (Object)adaptor.becomeRoot(char_literal120_tree, root_0);

							}
							break;
						case 6 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:194:11: '<>' ^
							{
							string_literal121=(Token)match(input,56,FOLLOW_56_in_logic_expr_ter1702); 
							string_literal121_tree = (Object)adaptor.create(string_literal121);
							root_0 = (Object)adaptor.becomeRoot(string_literal121_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_add_expr_in_logic_expr_ter1716);
					add_expr122=add_expr();
					state._fsp--;

					adaptor.addChild(root_0, add_expr122.getTree());

					}
					break;

				default :
					break loop32;
				}
			}

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
		return retval;
	}
	// $ANTLR end "logic_expr_ter"


	public static class add_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "add_expr"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:198:1: add_expr : ( '+' )? mult_expr ( ( '+' ^| '-' ^) mult_expr )* ;
	public final grammarA60Parser.add_expr_return add_expr() throws RecognitionException {
		grammarA60Parser.add_expr_return retval = new grammarA60Parser.add_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal123=null;
		Token char_literal125=null;
		Token char_literal126=null;
		ParserRuleReturnScope mult_expr124 =null;
		ParserRuleReturnScope mult_expr127 =null;

		Object char_literal123_tree=null;
		Object char_literal125_tree=null;
		Object char_literal126_tree=null;

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:198:9: ( ( '+' )? mult_expr ( ( '+' ^| '-' ^) mult_expr )* )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:199:5: ( '+' )? mult_expr ( ( '+' ^| '-' ^) mult_expr )*
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:199:5: ( '+' )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==46) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:199:6: '+'
					{
					char_literal123=(Token)match(input,46,FOLLOW_46_in_add_expr1731); 
					char_literal123_tree = (Object)adaptor.create(char_literal123);
					adaptor.addChild(root_0, char_literal123_tree);

					}
					break;

			}

			pushFollow(FOLLOW_mult_expr_in_add_expr1735);
			mult_expr124=mult_expr();
			state._fsp--;

			adaptor.addChild(root_0, mult_expr124.getTree());

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:199:22: ( ( '+' ^| '-' ^) mult_expr )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==46||LA35_0==48) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:199:23: ( '+' ^| '-' ^) mult_expr
					{
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:199:23: ( '+' ^| '-' ^)
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==46) ) {
						alt34=1;
					}
					else if ( (LA34_0==48) ) {
						alt34=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						throw nvae;
					}

					switch (alt34) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:199:24: '+' ^
							{
							char_literal125=(Token)match(input,46,FOLLOW_46_in_add_expr1739); 
							char_literal125_tree = (Object)adaptor.create(char_literal125);
							root_0 = (Object)adaptor.becomeRoot(char_literal125_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:199:29: '-' ^
							{
							char_literal126=(Token)match(input,48,FOLLOW_48_in_add_expr1742); 
							char_literal126_tree = (Object)adaptor.create(char_literal126);
							root_0 = (Object)adaptor.becomeRoot(char_literal126_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_mult_expr_in_add_expr1746);
					mult_expr127=mult_expr();
					state._fsp--;

					adaptor.addChild(root_0, mult_expr127.getTree());

					}
					break;

				default :
					break loop35;
				}
			}

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
		return retval;
	}
	// $ANTLR end "add_expr"


	public static class mult_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mult_expr"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:202:1: mult_expr : factor_expr ( ( '*' ^| '/' ^| '%' ^) factor_expr )* ;
	public final grammarA60Parser.mult_expr_return mult_expr() throws RecognitionException {
		grammarA60Parser.mult_expr_return retval = new grammarA60Parser.mult_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal129=null;
		Token char_literal130=null;
		Token char_literal131=null;
		ParserRuleReturnScope factor_expr128 =null;
		ParserRuleReturnScope factor_expr132 =null;

		Object char_literal129_tree=null;
		Object char_literal130_tree=null;
		Object char_literal131_tree=null;

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:202:10: ( factor_expr ( ( '*' ^| '/' ^| '%' ^) factor_expr )* )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:203:5: factor_expr ( ( '*' ^| '/' ^| '%' ^) factor_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_expr_in_mult_expr1761);
			factor_expr128=factor_expr();
			state._fsp--;

			adaptor.addChild(root_0, factor_expr128.getTree());

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:203:17: ( ( '*' ^| '/' ^| '%' ^) factor_expr )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==39||LA37_0==44||LA37_0==49) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:204:9: ( '*' ^| '/' ^| '%' ^) factor_expr
					{
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:204:9: ( '*' ^| '/' ^| '%' ^)
					int alt36=3;
					switch ( input.LA(1) ) {
					case 44:
						{
						alt36=1;
						}
						break;
					case 49:
						{
						alt36=2;
						}
						break;
					case 39:
						{
						alt36=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 36, 0, input);
						throw nvae;
					}
					switch (alt36) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:205:9: '*' ^
							{
							char_literal129=(Token)match(input,44,FOLLOW_44_in_mult_expr1783); 
							char_literal129_tree = (Object)adaptor.create(char_literal129);
							root_0 = (Object)adaptor.becomeRoot(char_literal129_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:206:11: '/' ^
							{
							char_literal130=(Token)match(input,49,FOLLOW_49_in_mult_expr1796); 
							char_literal130_tree = (Object)adaptor.create(char_literal130);
							root_0 = (Object)adaptor.becomeRoot(char_literal130_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:207:11: '%' ^
							{
							char_literal131=(Token)match(input,39,FOLLOW_39_in_mult_expr1809); 
							char_literal131_tree = (Object)adaptor.create(char_literal131);
							root_0 = (Object)adaptor.becomeRoot(char_literal131_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_factor_expr_in_mult_expr1822);
					factor_expr132=factor_expr();
					state._fsp--;

					adaptor.addChild(root_0, factor_expr132.getTree());

					}
					break;

				default :
					break loop37;
				}
			}

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
		return retval;
	}
	// $ANTLR end "mult_expr"


	public static class factor_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor_expr"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:211:1: factor_expr : ( '~' )? value ( '**' ^ ( '~' )? value )* ;
	public final grammarA60Parser.factor_expr_return factor_expr() throws RecognitionException {
		grammarA60Parser.factor_expr_return retval = new grammarA60Parser.factor_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal133=null;
		Token string_literal135=null;
		Token char_literal136=null;
		ParserRuleReturnScope value134 =null;
		ParserRuleReturnScope value137 =null;

		Object char_literal133_tree=null;
		Object string_literal135_tree=null;
		Object char_literal136_tree=null;

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:211:12: ( ( '~' )? value ( '**' ^ ( '~' )? value )* )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:212:5: ( '~' )? value ( '**' ^ ( '~' )? value )*
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:212:5: ( '~' )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==92) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:212:6: '~'
					{
					char_literal133=(Token)match(input,92,FOLLOW_92_in_factor_expr1837); 
					char_literal133_tree = (Object)adaptor.create(char_literal133);
					adaptor.addChild(root_0, char_literal133_tree);

					}
					break;

			}

			pushFollow(FOLLOW_value_in_factor_expr1841);
			value134=value();
			state._fsp--;

			adaptor.addChild(root_0, value134.getTree());

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:212:18: ( '**' ^ ( '~' )? value )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==45) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:212:20: '**' ^ ( '~' )? value
					{
					string_literal135=(Token)match(input,45,FOLLOW_45_in_factor_expr1845); 
					string_literal135_tree = (Object)adaptor.create(string_literal135);
					root_0 = (Object)adaptor.becomeRoot(string_literal135_tree, root_0);

					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:212:26: ( '~' )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==92) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:212:27: '~'
							{
							char_literal136=(Token)match(input,92,FOLLOW_92_in_factor_expr1849); 
							char_literal136_tree = (Object)adaptor.create(char_literal136);
							adaptor.addChild(root_0, char_literal136_tree);

							}
							break;

					}

					pushFollow(FOLLOW_value_in_factor_expr1853);
					value137=value();
					state._fsp--;

					adaptor.addChild(root_0, value137.getTree());

					}
					break;

				default :
					break loop40;
				}
			}

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
		return retval;
	}
	// $ANTLR end "factor_expr"


	public static class value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:215:1: value : ( IDENTIFIER ( after_identifier )? -> ^( IDENTIFIER ( after_identifier )? ) | '-' ^ UNSIGNED_NUMBER | UNSIGNED_NUMBER -> UNSIGNED_NUMBER | '(' boolean_expr ')' -> boolean_expr | 'FALSE' | 'TRUE' );
	public final grammarA60Parser.value_return value() throws RecognitionException {
		grammarA60Parser.value_return retval = new grammarA60Parser.value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER138=null;
		Token char_literal140=null;
		Token UNSIGNED_NUMBER141=null;
		Token UNSIGNED_NUMBER142=null;
		Token char_literal143=null;
		Token char_literal145=null;
		Token string_literal146=null;
		Token string_literal147=null;
		ParserRuleReturnScope after_identifier139 =null;
		ParserRuleReturnScope boolean_expr144 =null;

		Object IDENTIFIER138_tree=null;
		Object char_literal140_tree=null;
		Object UNSIGNED_NUMBER141_tree=null;
		Object UNSIGNED_NUMBER142_tree=null;
		Object char_literal143_tree=null;
		Object char_literal145_tree=null;
		Object string_literal146_tree=null;
		Object string_literal147_tree=null;
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_UNSIGNED_NUMBER=new RewriteRuleTokenStream(adaptor,"token UNSIGNED_NUMBER");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_after_identifier=new RewriteRuleSubtreeStream(adaptor,"rule after_identifier");
		RewriteRuleSubtreeStream stream_boolean_expr=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expr");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:215:7: ( IDENTIFIER ( after_identifier )? -> ^( IDENTIFIER ( after_identifier )? ) | '-' ^ UNSIGNED_NUMBER | UNSIGNED_NUMBER -> UNSIGNED_NUMBER | '(' boolean_expr ')' -> boolean_expr | 'FALSE' | 'TRUE' )
			int alt42=6;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt42=1;
				}
				break;
			case 48:
				{
				alt42=2;
				}
				break;
			case UNSIGNED_NUMBER:
				{
				alt42=3;
				}
				break;
			case 42:
				{
				alt42=4;
				}
				break;
			case 62:
				{
				alt42=5;
				}
				break;
			case 64:
				{
				alt42=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:216:5: IDENTIFIER ( after_identifier )?
					{
					IDENTIFIER138=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_value1869);  
					stream_IDENTIFIER.add(IDENTIFIER138);

					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:216:16: ( after_identifier )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==42||LA41_0==65) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:216:17: after_identifier
							{
							pushFollow(FOLLOW_after_identifier_in_value1872);
							after_identifier139=after_identifier();
							state._fsp--;

							stream_after_identifier.add(after_identifier139.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: IDENTIFIER, after_identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 216:36: -> ^( IDENTIFIER ( after_identifier )? )
					{
						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:216:39: ^( IDENTIFIER ( after_identifier )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_IDENTIFIER.nextNode(), root_1);
						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:216:52: ( after_identifier )?
						if ( stream_after_identifier.hasNext() ) {
							adaptor.addChild(root_1, stream_after_identifier.nextTree());
						}
						stream_after_identifier.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:217:7: '-' ^ UNSIGNED_NUMBER
					{
					root_0 = (Object)adaptor.nil();


					char_literal140=(Token)match(input,48,FOLLOW_48_in_value1891); 
					char_literal140_tree = (Object)adaptor.create(char_literal140);
					root_0 = (Object)adaptor.becomeRoot(char_literal140_tree, root_0);

					UNSIGNED_NUMBER141=(Token)match(input,UNSIGNED_NUMBER,FOLLOW_UNSIGNED_NUMBER_in_value1894); 
					UNSIGNED_NUMBER141_tree = (Object)adaptor.create(UNSIGNED_NUMBER141);
					adaptor.addChild(root_0, UNSIGNED_NUMBER141_tree);

					}
					break;
				case 3 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:218:7: UNSIGNED_NUMBER
					{
					UNSIGNED_NUMBER142=(Token)match(input,UNSIGNED_NUMBER,FOLLOW_UNSIGNED_NUMBER_in_value1902);  
					stream_UNSIGNED_NUMBER.add(UNSIGNED_NUMBER142);

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
					// 218:23: -> UNSIGNED_NUMBER
					{
						adaptor.addChild(root_0, stream_UNSIGNED_NUMBER.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:219:7: '(' boolean_expr ')'
					{
					char_literal143=(Token)match(input,42,FOLLOW_42_in_value1914);  
					stream_42.add(char_literal143);

					pushFollow(FOLLOW_boolean_expr_in_value1916);
					boolean_expr144=boolean_expr();
					state._fsp--;

					stream_boolean_expr.add(boolean_expr144.getTree());
					char_literal145=(Token)match(input,43,FOLLOW_43_in_value1918);  
					stream_43.add(char_literal145);

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
					// 219:28: -> boolean_expr
					{
						adaptor.addChild(root_0, stream_boolean_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:220:7: 'FALSE'
					{
					root_0 = (Object)adaptor.nil();


					string_literal146=(Token)match(input,62,FOLLOW_62_in_value1930); 
					string_literal146_tree = (Object)adaptor.create(string_literal146);
					adaptor.addChild(root_0, string_literal146_tree);

					}
					break;
				case 6 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:221:7: 'TRUE'
					{
					root_0 = (Object)adaptor.nil();


					string_literal147=(Token)match(input,64,FOLLOW_64_in_value1938); 
					string_literal147_tree = (Object)adaptor.create(string_literal147);
					adaptor.addChild(root_0, string_literal147_tree);

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
		return retval;
	}
	// $ANTLR end "value"


	public static class after_identifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "after_identifier"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:224:1: after_identifier : ( actual_parameter_list | '[' boolean_expr ( ',' boolean_expr )* ']' -> ( boolean_expr )+ );
	public final grammarA60Parser.after_identifier_return after_identifier() throws RecognitionException {
		grammarA60Parser.after_identifier_return retval = new grammarA60Parser.after_identifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal149=null;
		Token char_literal151=null;
		Token char_literal153=null;
		ParserRuleReturnScope actual_parameter_list148 =null;
		ParserRuleReturnScope boolean_expr150 =null;
		ParserRuleReturnScope boolean_expr152 =null;

		Object char_literal149_tree=null;
		Object char_literal151_tree=null;
		Object char_literal153_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_boolean_expr=new RewriteRuleSubtreeStream(adaptor,"rule boolean_expr");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:224:17: ( actual_parameter_list | '[' boolean_expr ( ',' boolean_expr )* ']' -> ( boolean_expr )+ )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==42) ) {
				alt44=1;
			}
			else if ( (LA44_0==65) ) {
				alt44=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:225:5: actual_parameter_list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_actual_parameter_list_in_after_identifier1954);
					actual_parameter_list148=actual_parameter_list();
					state._fsp--;

					adaptor.addChild(root_0, actual_parameter_list148.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:226:7: '[' boolean_expr ( ',' boolean_expr )* ']'
					{
					char_literal149=(Token)match(input,65,FOLLOW_65_in_after_identifier1963);  
					stream_65.add(char_literal149);

					pushFollow(FOLLOW_boolean_expr_in_after_identifier1965);
					boolean_expr150=boolean_expr();
					state._fsp--;

					stream_boolean_expr.add(boolean_expr150.getTree());
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:226:24: ( ',' boolean_expr )*
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==47) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:226:25: ',' boolean_expr
							{
							char_literal151=(Token)match(input,47,FOLLOW_47_in_after_identifier1968);  
							stream_47.add(char_literal151);

							pushFollow(FOLLOW_boolean_expr_in_after_identifier1969);
							boolean_expr152=boolean_expr();
							state._fsp--;

							stream_boolean_expr.add(boolean_expr152.getTree());
							}
							break;

						default :
							break loop43;
						}
					}

					char_literal153=(Token)match(input,66,FOLLOW_66_in_after_identifier1973);  
					stream_66.add(char_literal153);

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
					// 226:47: -> ( boolean_expr )+
					{
						if ( !(stream_boolean_expr.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_boolean_expr.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "after_identifier"


	public static class if_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_statement"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:230:1: if_statement : if_clause program_bis ;
	public final grammarA60Parser.if_statement_return if_statement() throws RecognitionException {
		grammarA60Parser.if_statement_return retval = new grammarA60Parser.if_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope if_clause154 =null;
		ParserRuleReturnScope program_bis155 =null;


		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:230:13: ( if_clause program_bis )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:231:5: if_clause program_bis
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_if_clause_in_if_statement1992);
			if_clause154=if_clause();
			state._fsp--;

			adaptor.addChild(root_0, if_clause154.getTree());

			pushFollow(FOLLOW_program_bis_in_if_statement1994);
			program_bis155=program_bis();
			state._fsp--;

			adaptor.addChild(root_0, program_bis155.getTree());

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
		return retval;
	}
	// $ANTLR end "if_statement"


	public static class actual_parameter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actual_parameter"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:234:1: actual_parameter : ( STRING -> STRING | expression -> expression );
	public final grammarA60Parser.actual_parameter_return actual_parameter() throws RecognitionException {
		grammarA60Parser.actual_parameter_return retval = new grammarA60Parser.actual_parameter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING156=null;
		ParserRuleReturnScope expression157 =null;

		Object STRING156_tree=null;
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:234:17: ( STRING -> STRING | expression -> expression )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==STRING) ) {
				alt45=1;
			}
			else if ( (LA45_0==IDENTIFIER||LA45_0==TYPE||LA45_0==UNSIGNED_NUMBER||LA45_0==42||LA45_0==46||LA45_0==48||LA45_0==62||LA45_0==64||(LA45_0 >= 68 && LA45_0 <= 69)||(LA45_0 >= 74 && LA45_0 <= 78)||(LA45_0 >= 81 && LA45_0 <= 82)||LA45_0==85||LA45_0==92) ) {
				alt45=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}

			switch (alt45) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:235:5: STRING
					{
					STRING156=(Token)match(input,STRING,FOLLOW_STRING_in_actual_parameter2006);  
					stream_STRING.add(STRING156);

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
					// 235:12: -> STRING
					{
						adaptor.addChild(root_0, stream_STRING.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:236:11: expression
					{
					pushFollow(FOLLOW_expression_in_actual_parameter2022);
					expression157=expression();
					state._fsp--;

					stream_expression.add(expression157.getTree());
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
					// 236:22: -> expression
					{
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
		return retval;
	}
	// $ANTLR end "actual_parameter"


	public static class actual_parameter_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actual_parameter_list"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:239:1: actual_parameter_list : '(' actparam1= actual_parameter ( ',' actparam2= actual_parameter )* ')' ( IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')' )* -> ^( PARAM_LIST ( actual_parameter )+ ( IDENTIFIER ( actual_parameter )+ )* ) ;
	public final grammarA60Parser.actual_parameter_list_return actual_parameter_list() throws RecognitionException {
		grammarA60Parser.actual_parameter_list_return retval = new grammarA60Parser.actual_parameter_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal158=null;
		Token char_literal159=null;
		Token char_literal160=null;
		Token IDENTIFIER161=null;
		Token char_literal162=null;
		Token char_literal163=null;
		Token char_literal164=null;
		Token char_literal165=null;
		ParserRuleReturnScope actparam1 =null;
		ParserRuleReturnScope actparam2 =null;
		ParserRuleReturnScope actparam3 =null;
		ParserRuleReturnScope actparam4 =null;

		Object char_literal158_tree=null;
		Object char_literal159_tree=null;
		Object char_literal160_tree=null;
		Object IDENTIFIER161_tree=null;
		Object char_literal162_tree=null;
		Object char_literal163_tree=null;
		Object char_literal164_tree=null;
		Object char_literal165_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_actual_parameter=new RewriteRuleSubtreeStream(adaptor,"rule actual_parameter");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:239:22: ( '(' actparam1= actual_parameter ( ',' actparam2= actual_parameter )* ')' ( IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')' )* -> ^( PARAM_LIST ( actual_parameter )+ ( IDENTIFIER ( actual_parameter )+ )* ) )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:240:5: '(' actparam1= actual_parameter ( ',' actparam2= actual_parameter )* ')' ( IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')' )*
			{
			char_literal158=(Token)match(input,42,FOLLOW_42_in_actual_parameter_list2038);  
			stream_42.add(char_literal158);

			pushFollow(FOLLOW_actual_parameter_in_actual_parameter_list2042);
			actparam1=actual_parameter();
			state._fsp--;

			stream_actual_parameter.add(actparam1.getTree());
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:240:36: ( ',' actparam2= actual_parameter )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==47) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:240:37: ',' actparam2= actual_parameter
					{
					char_literal159=(Token)match(input,47,FOLLOW_47_in_actual_parameter_list2045);  
					stream_47.add(char_literal159);

					pushFollow(FOLLOW_actual_parameter_in_actual_parameter_list2049);
					actparam2=actual_parameter();
					state._fsp--;

					stream_actual_parameter.add(actparam2.getTree());
					}
					break;

				default :
					break loop46;
				}
			}

			char_literal160=(Token)match(input,43,FOLLOW_43_in_actual_parameter_list2053);  
			stream_43.add(char_literal160);

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:240:76: ( IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')' )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==IDENTIFIER) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:240:77: IDENTIFIER ':' '(' actparam3= actual_parameter ( ',' actparam4= actual_parameter )* ')'
					{
					IDENTIFIER161=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_actual_parameter_list2058);  
					stream_IDENTIFIER.add(IDENTIFIER161);

					char_literal162=(Token)match(input,50,FOLLOW_50_in_actual_parameter_list2060);  
					stream_50.add(char_literal162);

					char_literal163=(Token)match(input,42,FOLLOW_42_in_actual_parameter_list2062);  
					stream_42.add(char_literal163);

					pushFollow(FOLLOW_actual_parameter_in_actual_parameter_list2066);
					actparam3=actual_parameter();
					state._fsp--;

					stream_actual_parameter.add(actparam3.getTree());
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:240:123: ( ',' actparam4= actual_parameter )*
					loop47:
					while (true) {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==47) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:240:124: ',' actparam4= actual_parameter
							{
							char_literal164=(Token)match(input,47,FOLLOW_47_in_actual_parameter_list2069);  
							stream_47.add(char_literal164);

							pushFollow(FOLLOW_actual_parameter_in_actual_parameter_list2073);
							actparam4=actual_parameter();
							state._fsp--;

							stream_actual_parameter.add(actparam4.getTree());
							}
							break;

						default :
							break loop47;
						}
					}

					char_literal165=(Token)match(input,43,FOLLOW_43_in_actual_parameter_list2077);  
					stream_43.add(char_literal165);

					}
					break;

				default :
					break loop48;
				}
			}

			// AST REWRITE
			// elements: actual_parameter, IDENTIFIER, actual_parameter
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 241:5: -> ^( PARAM_LIST ( actual_parameter )+ ( IDENTIFIER ( actual_parameter )+ )* )
			{
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:241:8: ^( PARAM_LIST ( actual_parameter )+ ( IDENTIFIER ( actual_parameter )+ )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM_LIST, "PARAM_LIST"), root_1);
				if ( !(stream_actual_parameter.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_actual_parameter.hasNext() ) {
					adaptor.addChild(root_1, stream_actual_parameter.nextTree());
				}
				stream_actual_parameter.reset();

				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:241:39: ( IDENTIFIER ( actual_parameter )+ )*
				while ( stream_IDENTIFIER.hasNext() ) {
					adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
					if ( !(stream_actual_parameter.hasNext()) ) {
						throw new RewriteEarlyExitException();
					}
					while ( stream_actual_parameter.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "actual_parameter_list"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:244:1: declaration : ( type_array_proc_declaration | array_declaration | switch_declaration | procedure_declaration );
	public final grammarA60Parser.declaration_return declaration() throws RecognitionException {
		grammarA60Parser.declaration_return retval = new grammarA60Parser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_array_proc_declaration166 =null;
		ParserRuleReturnScope array_declaration167 =null;
		ParserRuleReturnScope switch_declaration168 =null;
		ParserRuleReturnScope procedure_declaration169 =null;


		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:244:12: ( type_array_proc_declaration | array_declaration | switch_declaration | procedure_declaration )
			int alt49=4;
			switch ( input.LA(1) ) {
			case TYPE:
			case 81:
				{
				alt49=1;
				}
				break;
			case 68:
				{
				alt49=2;
				}
				break;
			case 85:
				{
				alt49=3;
				}
				break;
			case 82:
				{
				alt49=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:245:5: type_array_proc_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_array_proc_declaration_in_declaration2112);
					type_array_proc_declaration166=type_array_proc_declaration();
					state._fsp--;

					adaptor.addChild(root_0, type_array_proc_declaration166.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:246:7: array_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_declaration_in_declaration2121);
					array_declaration167=array_declaration();
					state._fsp--;

					adaptor.addChild(root_0, array_declaration167.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:247:7: switch_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_switch_declaration_in_declaration2129);
					switch_declaration168=switch_declaration();
					state._fsp--;

					adaptor.addChild(root_0, switch_declaration168.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:248:7: procedure_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedure_declaration_in_declaration2137);
					procedure_declaration169=procedure_declaration();
					state._fsp--;

					adaptor.addChild(root_0, procedure_declaration169.getTree());

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
		return retval;
	}
	// $ANTLR end "declaration"


	public static class type_array_proc_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_array_proc_declaration"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:252:1: type_array_proc_declaration : ( 'own' type_array_proc_declaration_bis | TYPE type_array_proc_declaration_ter -> ^( TYPARPROCDEC TYPE type_array_proc_declaration_ter ) );
	public final grammarA60Parser.type_array_proc_declaration_return type_array_proc_declaration() throws RecognitionException {
		grammarA60Parser.type_array_proc_declaration_return retval = new grammarA60Parser.type_array_proc_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal170=null;
		Token TYPE172=null;
		ParserRuleReturnScope type_array_proc_declaration_bis171 =null;
		ParserRuleReturnScope type_array_proc_declaration_ter173 =null;

		Object string_literal170_tree=null;
		Object TYPE172_tree=null;
		RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
		RewriteRuleSubtreeStream stream_type_array_proc_declaration_ter=new RewriteRuleSubtreeStream(adaptor,"rule type_array_proc_declaration_ter");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:252:28: ( 'own' type_array_proc_declaration_bis | TYPE type_array_proc_declaration_ter -> ^( TYPARPROCDEC TYPE type_array_proc_declaration_ter ) )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==81) ) {
				alt50=1;
			}
			else if ( (LA50_0==TYPE) ) {
				alt50=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:253:5: 'own' type_array_proc_declaration_bis
					{
					root_0 = (Object)adaptor.nil();


					string_literal170=(Token)match(input,81,FOLLOW_81_in_type_array_proc_declaration2151); 
					string_literal170_tree = (Object)adaptor.create(string_literal170);
					adaptor.addChild(root_0, string_literal170_tree);

					pushFollow(FOLLOW_type_array_proc_declaration_bis_in_type_array_proc_declaration2153);
					type_array_proc_declaration_bis171=type_array_proc_declaration_bis();
					state._fsp--;

					adaptor.addChild(root_0, type_array_proc_declaration_bis171.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:254:11: TYPE type_array_proc_declaration_ter
					{
					TYPE172=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_array_proc_declaration2165);  
					stream_TYPE.add(TYPE172);

					pushFollow(FOLLOW_type_array_proc_declaration_ter_in_type_array_proc_declaration2169);
					type_array_proc_declaration_ter173=type_array_proc_declaration_ter();
					state._fsp--;

					stream_type_array_proc_declaration_ter.add(type_array_proc_declaration_ter173.getTree());
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
					// 254:50: -> ^( TYPARPROCDEC TYPE type_array_proc_declaration_ter )
					{
						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:254:53: ^( TYPARPROCDEC TYPE type_array_proc_declaration_ter )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPARPROCDEC, "TYPARPROCDEC"), root_1);
						adaptor.addChild(root_1, stream_TYPE.nextNode());
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
		return retval;
	}
	// $ANTLR end "type_array_proc_declaration"


	public static class type_array_proc_declaration_bis_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_array_proc_declaration_bis"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:257:1: type_array_proc_declaration_bis : ( array_declaration | TYPE ( type_list | array_declaration ) );
	public final grammarA60Parser.type_array_proc_declaration_bis_return type_array_proc_declaration_bis() throws RecognitionException {
		grammarA60Parser.type_array_proc_declaration_bis_return retval = new grammarA60Parser.type_array_proc_declaration_bis_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TYPE175=null;
		ParserRuleReturnScope array_declaration174 =null;
		ParserRuleReturnScope type_list176 =null;
		ParserRuleReturnScope array_declaration177 =null;

		Object TYPE175_tree=null;

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:257:32: ( array_declaration | TYPE ( type_list | array_declaration ) )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==68) ) {
				alt52=1;
			}
			else if ( (LA52_0==TYPE) ) {
				alt52=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:258:5: array_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_declaration_in_type_array_proc_declaration_bis2192);
					array_declaration174=array_declaration();
					state._fsp--;

					adaptor.addChild(root_0, array_declaration174.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:259:11: TYPE ( type_list | array_declaration )
					{
					root_0 = (Object)adaptor.nil();


					TYPE175=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_array_proc_declaration_bis2204); 
					TYPE175_tree = (Object)adaptor.create(TYPE175);
					adaptor.addChild(root_0, TYPE175_tree);

					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:259:16: ( type_list | array_declaration )
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==IDENTIFIER) ) {
						alt51=1;
					}
					else if ( (LA51_0==68) ) {
						alt51=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 51, 0, input);
						throw nvae;
					}

					switch (alt51) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:259:17: type_list
							{
							pushFollow(FOLLOW_type_list_in_type_array_proc_declaration_bis2207);
							type_list176=type_list();
							state._fsp--;

							adaptor.addChild(root_0, type_list176.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:259:28: array_declaration
							{
							pushFollow(FOLLOW_array_declaration_in_type_array_proc_declaration_bis2210);
							array_declaration177=array_declaration();
							state._fsp--;

							adaptor.addChild(root_0, array_declaration177.getTree());

							}
							break;

					}

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
		return retval;
	}
	// $ANTLR end "type_array_proc_declaration_bis"


	public static class type_array_proc_declaration_ter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_array_proc_declaration_ter"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:262:1: type_array_proc_declaration_ter : ( procedure_declaration | array_declaration | type_list -> type_list );
	public final grammarA60Parser.type_array_proc_declaration_ter_return type_array_proc_declaration_ter() throws RecognitionException {
		grammarA60Parser.type_array_proc_declaration_ter_return retval = new grammarA60Parser.type_array_proc_declaration_ter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope procedure_declaration178 =null;
		ParserRuleReturnScope array_declaration179 =null;
		ParserRuleReturnScope type_list180 =null;

		RewriteRuleSubtreeStream stream_type_list=new RewriteRuleSubtreeStream(adaptor,"rule type_list");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:262:32: ( procedure_declaration | array_declaration | type_list -> type_list )
			int alt53=3;
			switch ( input.LA(1) ) {
			case 82:
				{
				alt53=1;
				}
				break;
			case 68:
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
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:263:5: procedure_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedure_declaration_in_type_array_proc_declaration_ter2223);
					procedure_declaration178=procedure_declaration();
					state._fsp--;

					adaptor.addChild(root_0, procedure_declaration178.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:264:11: array_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_declaration_in_type_array_proc_declaration_ter2235);
					array_declaration179=array_declaration();
					state._fsp--;

					adaptor.addChild(root_0, array_declaration179.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:265:11: type_list
					{
					pushFollow(FOLLOW_type_list_in_type_array_proc_declaration_ter2247);
					type_list180=type_list();
					state._fsp--;

					stream_type_list.add(type_list180.getTree());
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
					// 265:21: -> type_list
					{
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
		return retval;
	}
	// $ANTLR end "type_array_proc_declaration_ter"


	public static class type_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_list"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:269:1: type_list : IDENTIFIER ( ',' IDENTIFIER )* -> ( IDENTIFIER )+ ;
	public final grammarA60Parser.type_list_return type_list() throws RecognitionException {
		grammarA60Parser.type_list_return retval = new grammarA60Parser.type_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER181=null;
		Token char_literal182=null;
		Token IDENTIFIER183=null;

		Object IDENTIFIER181_tree=null;
		Object char_literal182_tree=null;
		Object IDENTIFIER183_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:269:10: ( IDENTIFIER ( ',' IDENTIFIER )* -> ( IDENTIFIER )+ )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:270:5: IDENTIFIER ( ',' IDENTIFIER )*
			{
			IDENTIFIER181=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_list2264);  
			stream_IDENTIFIER.add(IDENTIFIER181);

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:270:16: ( ',' IDENTIFIER )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==47) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:270:17: ',' IDENTIFIER
					{
					char_literal182=(Token)match(input,47,FOLLOW_47_in_type_list2267);  
					stream_47.add(char_literal182);

					IDENTIFIER183=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_list2269);  
					stream_IDENTIFIER.add(IDENTIFIER183);

					}
					break;

				default :
					break loop54;
				}
			}

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
			// 270:34: -> ( IDENTIFIER )+
			{
				if ( !(stream_IDENTIFIER.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_IDENTIFIER.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "type_list"


	public static class bound_pair_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bound_pair"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:273:1: bound_pair : exp1= expression ':' exp2= expression -> ^( BORNES $exp1 $exp2) ;
	public final grammarA60Parser.bound_pair_return bound_pair() throws RecognitionException {
		grammarA60Parser.bound_pair_return retval = new grammarA60Parser.bound_pair_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal184=null;
		ParserRuleReturnScope exp1 =null;
		ParserRuleReturnScope exp2 =null;

		Object char_literal184_tree=null;
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:273:12: (exp1= expression ':' exp2= expression -> ^( BORNES $exp1 $exp2) )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:274:5: exp1= expression ':' exp2= expression
			{
			pushFollow(FOLLOW_expression_in_bound_pair2291);
			exp1=expression();
			state._fsp--;

			stream_expression.add(exp1.getTree());
			char_literal184=(Token)match(input,50,FOLLOW_50_in_bound_pair2293);  
			stream_50.add(char_literal184);

			pushFollow(FOLLOW_expression_in_bound_pair2297);
			exp2=expression();
			state._fsp--;

			stream_expression.add(exp2.getTree());
			// AST REWRITE
			// elements: exp2, exp1
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
			// 274:41: -> ^( BORNES $exp1 $exp2)
			{
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:274:44: ^( BORNES $exp1 $exp2)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BORNES, "BORNES"), root_1);
				adaptor.addChild(root_1, stream_exp1.nextTree());
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
		return retval;
	}
	// $ANTLR end "bound_pair"


	public static class bound_pair_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bound_pair_list"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:277:1: bound_pair_list : bound_pair ( ',' bound_pair )* -> ( bound_pair )+ ;
	public final grammarA60Parser.bound_pair_list_return bound_pair_list() throws RecognitionException {
		grammarA60Parser.bound_pair_list_return retval = new grammarA60Parser.bound_pair_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal186=null;
		ParserRuleReturnScope bound_pair185 =null;
		ParserRuleReturnScope bound_pair187 =null;

		Object char_literal186_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleSubtreeStream stream_bound_pair=new RewriteRuleSubtreeStream(adaptor,"rule bound_pair");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:277:16: ( bound_pair ( ',' bound_pair )* -> ( bound_pair )+ )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:278:5: bound_pair ( ',' bound_pair )*
			{
			pushFollow(FOLLOW_bound_pair_in_bound_pair_list2321);
			bound_pair185=bound_pair();
			state._fsp--;

			stream_bound_pair.add(bound_pair185.getTree());
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:278:16: ( ',' bound_pair )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==47) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:278:17: ',' bound_pair
					{
					char_literal186=(Token)match(input,47,FOLLOW_47_in_bound_pair_list2324);  
					stream_47.add(char_literal186);

					pushFollow(FOLLOW_bound_pair_in_bound_pair_list2326);
					bound_pair187=bound_pair();
					state._fsp--;

					stream_bound_pair.add(bound_pair187.getTree());
					}
					break;

				default :
					break loop55;
				}
			}

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
			// 278:34: -> ( bound_pair )+
			{
				if ( !(stream_bound_pair.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_bound_pair.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "bound_pair_list"


	public static class array_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_declaration"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:281:1: array_declaration : 'array' array_list ;
	public final grammarA60Parser.array_declaration_return array_declaration() throws RecognitionException {
		grammarA60Parser.array_declaration_return retval = new grammarA60Parser.array_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal188=null;
		ParserRuleReturnScope array_list189 =null;

		Object string_literal188_tree=null;

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:281:18: ( 'array' array_list )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:282:5: 'array' array_list
			{
			root_0 = (Object)adaptor.nil();


			string_literal188=(Token)match(input,68,FOLLOW_68_in_array_declaration2345); 
			string_literal188_tree = (Object)adaptor.create(string_literal188);
			adaptor.addChild(root_0, string_literal188_tree);

			pushFollow(FOLLOW_array_list_in_array_declaration2347);
			array_list189=array_list();
			state._fsp--;

			adaptor.addChild(root_0, array_list189.getTree());

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
		return retval;
	}
	// $ANTLR end "array_declaration"


	public static class array_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_list"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:285:1: array_list : array_segment ( ',' array_segment )* ;
	public final grammarA60Parser.array_list_return array_list() throws RecognitionException {
		grammarA60Parser.array_list_return retval = new grammarA60Parser.array_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal191=null;
		ParserRuleReturnScope array_segment190 =null;
		ParserRuleReturnScope array_segment192 =null;

		Object char_literal191_tree=null;

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:285:12: ( array_segment ( ',' array_segment )* )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:286:5: array_segment ( ',' array_segment )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_array_segment_in_array_list2360);
			array_segment190=array_segment();
			state._fsp--;

			adaptor.addChild(root_0, array_segment190.getTree());

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:286:19: ( ',' array_segment )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==47) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:286:20: ',' array_segment
					{
					char_literal191=(Token)match(input,47,FOLLOW_47_in_array_list2363); 
					char_literal191_tree = (Object)adaptor.create(char_literal191);
					adaptor.addChild(root_0, char_literal191_tree);

					pushFollow(FOLLOW_array_segment_in_array_list2365);
					array_segment192=array_segment();
					state._fsp--;

					adaptor.addChild(root_0, array_segment192.getTree());

					}
					break;

				default :
					break loop56;
				}
			}

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
		return retval;
	}
	// $ANTLR end "array_list"


	public static class array_segment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_segment"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:289:1: array_segment : IDENTIFIER ( '[' bound_pair_list ']' -> ^( ARRAYSEG IDENTIFIER bound_pair_list ) | array_segment -> ^( ARRAYSEG array_segment ) ) ;
	public final grammarA60Parser.array_segment_return array_segment() throws RecognitionException {
		grammarA60Parser.array_segment_return retval = new grammarA60Parser.array_segment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER193=null;
		Token char_literal194=null;
		Token char_literal196=null;
		ParserRuleReturnScope bound_pair_list195 =null;
		ParserRuleReturnScope array_segment197 =null;

		Object IDENTIFIER193_tree=null;
		Object char_literal194_tree=null;
		Object char_literal196_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_array_segment=new RewriteRuleSubtreeStream(adaptor,"rule array_segment");
		RewriteRuleSubtreeStream stream_bound_pair_list=new RewriteRuleSubtreeStream(adaptor,"rule bound_pair_list");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:289:14: ( IDENTIFIER ( '[' bound_pair_list ']' -> ^( ARRAYSEG IDENTIFIER bound_pair_list ) | array_segment -> ^( ARRAYSEG array_segment ) ) )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:290:5: IDENTIFIER ( '[' bound_pair_list ']' -> ^( ARRAYSEG IDENTIFIER bound_pair_list ) | array_segment -> ^( ARRAYSEG array_segment ) )
			{
			IDENTIFIER193=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_array_segment2379);  
			stream_IDENTIFIER.add(IDENTIFIER193);

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:290:16: ( '[' bound_pair_list ']' -> ^( ARRAYSEG IDENTIFIER bound_pair_list ) | array_segment -> ^( ARRAYSEG array_segment ) )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==65) ) {
				alt57=1;
			}
			else if ( (LA57_0==IDENTIFIER) ) {
				alt57=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:290:17: '[' bound_pair_list ']'
					{
					char_literal194=(Token)match(input,65,FOLLOW_65_in_array_segment2382);  
					stream_65.add(char_literal194);

					pushFollow(FOLLOW_bound_pair_list_in_array_segment2383);
					bound_pair_list195=bound_pair_list();
					state._fsp--;

					stream_bound_pair_list.add(bound_pair_list195.getTree());
					char_literal196=(Token)match(input,66,FOLLOW_66_in_array_segment2385);  
					stream_66.add(char_literal196);

					// AST REWRITE
					// elements: bound_pair_list, IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 290:40: -> ^( ARRAYSEG IDENTIFIER bound_pair_list )
					{
						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:290:43: ^( ARRAYSEG IDENTIFIER bound_pair_list )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYSEG, "ARRAYSEG"), root_1);
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						adaptor.addChild(root_1, stream_bound_pair_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:291:7: array_segment
					{
					pushFollow(FOLLOW_array_segment_in_array_segment2403);
					array_segment197=array_segment();
					state._fsp--;

					stream_array_segment.add(array_segment197.getTree());
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
					// 291:21: -> ^( ARRAYSEG array_segment )
					{
						// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:291:24: ^( ARRAYSEG array_segment )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYSEG, "ARRAYSEG"), root_1);
						adaptor.addChild(root_1, stream_array_segment.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

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
		return retval;
	}
	// $ANTLR end "array_segment"


	public static class switch_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switch_declaration"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:294:1: switch_declaration : 'switch' IDENTIFIER ':=' switch_list ;
	public final grammarA60Parser.switch_declaration_return switch_declaration() throws RecognitionException {
		grammarA60Parser.switch_declaration_return retval = new grammarA60Parser.switch_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal198=null;
		Token IDENTIFIER199=null;
		Token string_literal200=null;
		ParserRuleReturnScope switch_list201 =null;

		Object string_literal198_tree=null;
		Object IDENTIFIER199_tree=null;
		Object string_literal200_tree=null;

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:294:19: ( 'switch' IDENTIFIER ':=' switch_list )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:295:5: 'switch' IDENTIFIER ':=' switch_list
			{
			root_0 = (Object)adaptor.nil();


			string_literal198=(Token)match(input,85,FOLLOW_85_in_switch_declaration2424); 
			string_literal198_tree = (Object)adaptor.create(string_literal198);
			adaptor.addChild(root_0, string_literal198_tree);

			IDENTIFIER199=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_switch_declaration2426); 
			IDENTIFIER199_tree = (Object)adaptor.create(IDENTIFIER199);
			adaptor.addChild(root_0, IDENTIFIER199_tree);

			string_literal200=(Token)match(input,51,FOLLOW_51_in_switch_declaration2428); 
			string_literal200_tree = (Object)adaptor.create(string_literal200);
			adaptor.addChild(root_0, string_literal200_tree);

			pushFollow(FOLLOW_switch_list_in_switch_declaration2430);
			switch_list201=switch_list();
			state._fsp--;

			adaptor.addChild(root_0, switch_list201.getTree());

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
		return retval;
	}
	// $ANTLR end "switch_declaration"


	public static class switch_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "switch_list"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:298:1: switch_list : expression ( ',' expression )* ;
	public final grammarA60Parser.switch_list_return switch_list() throws RecognitionException {
		grammarA60Parser.switch_list_return retval = new grammarA60Parser.switch_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal203=null;
		ParserRuleReturnScope expression202 =null;
		ParserRuleReturnScope expression204 =null;

		Object char_literal203_tree=null;

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:298:12: ( expression ( ',' expression )* )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:299:5: expression ( ',' expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_switch_list2442);
			expression202=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression202.getTree());

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:299:16: ( ',' expression )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==47) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:299:17: ',' expression
					{
					char_literal203=(Token)match(input,47,FOLLOW_47_in_switch_list2445); 
					char_literal203_tree = (Object)adaptor.create(char_literal203);
					adaptor.addChild(root_0, char_literal203_tree);

					pushFollow(FOLLOW_expression_in_switch_list2447);
					expression204=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression204.getTree());

					}
					break;

				default :
					break loop58;
				}
			}

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
		return retval;
	}
	// $ANTLR end "switch_list"


	public static class procedure_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedure_declaration"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:302:1: procedure_declaration : 'procedure' procedure_heading ( statement_bis )? -> ^( PROCEDURE_STATEMENT procedure_heading ( statement_bis )? ) ;
	public final grammarA60Parser.procedure_declaration_return procedure_declaration() throws RecognitionException {
		grammarA60Parser.procedure_declaration_return retval = new grammarA60Parser.procedure_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal205=null;
		ParserRuleReturnScope procedure_heading206 =null;
		ParserRuleReturnScope statement_bis207 =null;

		Object string_literal205_tree=null;
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleSubtreeStream stream_procedure_heading=new RewriteRuleSubtreeStream(adaptor,"rule procedure_heading");
		RewriteRuleSubtreeStream stream_statement_bis=new RewriteRuleSubtreeStream(adaptor,"rule statement_bis");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:302:22: ( 'procedure' procedure_heading ( statement_bis )? -> ^( PROCEDURE_STATEMENT procedure_heading ( statement_bis )? ) )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:303:5: 'procedure' procedure_heading ( statement_bis )?
			{
			string_literal205=(Token)match(input,82,FOLLOW_82_in_procedure_declaration2461);  
			stream_82.add(string_literal205);

			pushFollow(FOLLOW_procedure_heading_in_procedure_declaration2463);
			procedure_heading206=procedure_heading();
			state._fsp--;

			stream_procedure_heading.add(procedure_heading206.getTree());
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:303:35: ( statement_bis )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==TYPE||(LA59_0 >= 68 && LA59_0 <= 69)||LA59_0==73||LA59_0==76||LA59_0==78||LA59_0==82||(LA59_0 >= 84 && LA59_0 <= 85)) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:303:36: statement_bis
					{
					pushFollow(FOLLOW_statement_bis_in_procedure_declaration2466);
					statement_bis207=statement_bis();
					state._fsp--;

					stream_statement_bis.add(statement_bis207.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: procedure_heading, statement_bis
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 303:52: -> ^( PROCEDURE_STATEMENT procedure_heading ( statement_bis )? )
			{
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:303:55: ^( PROCEDURE_STATEMENT procedure_heading ( statement_bis )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURE_STATEMENT, "PROCEDURE_STATEMENT"), root_1);
				adaptor.addChild(root_1, stream_procedure_heading.nextTree());
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:303:95: ( statement_bis )?
				if ( stream_statement_bis.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "procedure_declaration"


	public static class procedure_heading_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedure_heading"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:306:1: procedure_heading : IDENTIFIER ( formal_parameter_list )? ';' ( value_part )? -> ^( PROCH IDENTIFIER ^( PARAMETRES ( formal_parameter_list )? ( value_part )? ) ) ;
	public final grammarA60Parser.procedure_heading_return procedure_heading() throws RecognitionException {
		grammarA60Parser.procedure_heading_return retval = new grammarA60Parser.procedure_heading_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER208=null;
		Token char_literal210=null;
		ParserRuleReturnScope formal_parameter_list209 =null;
		ParserRuleReturnScope value_part211 =null;

		Object IDENTIFIER208_tree=null;
		Object char_literal210_tree=null;
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_formal_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule formal_parameter_list");
		RewriteRuleSubtreeStream stream_value_part=new RewriteRuleSubtreeStream(adaptor,"rule value_part");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:306:18: ( IDENTIFIER ( formal_parameter_list )? ';' ( value_part )? -> ^( PROCH IDENTIFIER ^( PARAMETRES ( formal_parameter_list )? ( value_part )? ) ) )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:307:5: IDENTIFIER ( formal_parameter_list )? ';' ( value_part )?
			{
			IDENTIFIER208=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_procedure_heading2493);  
			stream_IDENTIFIER.add(IDENTIFIER208);

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:307:16: ( formal_parameter_list )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==42) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:307:17: formal_parameter_list
					{
					pushFollow(FOLLOW_formal_parameter_list_in_procedure_heading2496);
					formal_parameter_list209=formal_parameter_list();
					state._fsp--;

					stream_formal_parameter_list.add(formal_parameter_list209.getTree());
					}
					break;

			}

			char_literal210=(Token)match(input,52,FOLLOW_52_in_procedure_heading2500);  
			stream_52.add(char_literal210);

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:307:45: ( value_part )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==88) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:307:46: value_part
					{
					pushFollow(FOLLOW_value_part_in_procedure_heading2503);
					value_part211=value_part();
					state._fsp--;

					stream_value_part.add(value_part211.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: IDENTIFIER, formal_parameter_list, value_part
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 307:59: -> ^( PROCH IDENTIFIER ^( PARAMETRES ( formal_parameter_list )? ( value_part )? ) )
			{
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:307:62: ^( PROCH IDENTIFIER ^( PARAMETRES ( formal_parameter_list )? ( value_part )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCH, "PROCH"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:307:81: ^( PARAMETRES ( formal_parameter_list )? ( value_part )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETRES, "PARAMETRES"), root_2);
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:307:94: ( formal_parameter_list )?
				if ( stream_formal_parameter_list.hasNext() ) {
					adaptor.addChild(root_2, stream_formal_parameter_list.nextTree());
				}
				stream_formal_parameter_list.reset();

				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:307:119: ( value_part )?
				if ( stream_value_part.hasNext() ) {
					adaptor.addChild(root_2, stream_value_part.nextTree());
				}
				stream_value_part.reset();

				adaptor.addChild(root_1, root_2);
				}

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
		return retval;
	}
	// $ANTLR end "procedure_heading"


	public static class specifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "specifier"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:311:1: specifier : ( 'string' | TYPE fact_type_array_procedure | 'array' | 'switch' | 'procedure' );
	public final grammarA60Parser.specifier_return specifier() throws RecognitionException {
		grammarA60Parser.specifier_return retval = new grammarA60Parser.specifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal212=null;
		Token TYPE213=null;
		Token string_literal215=null;
		Token string_literal216=null;
		Token string_literal217=null;
		ParserRuleReturnScope fact_type_array_procedure214 =null;

		Object string_literal212_tree=null;
		Object TYPE213_tree=null;
		Object string_literal215_tree=null;
		Object string_literal216_tree=null;
		Object string_literal217_tree=null;

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:311:10: ( 'string' | TYPE fact_type_array_procedure | 'array' | 'switch' | 'procedure' )
			int alt62=5;
			switch ( input.LA(1) ) {
			case 84:
				{
				alt62=1;
				}
				break;
			case TYPE:
				{
				alt62=2;
				}
				break;
			case 68:
				{
				alt62=3;
				}
				break;
			case 85:
				{
				alt62=4;
				}
				break;
			case 82:
				{
				alt62=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:312:5: 'string'
					{
					root_0 = (Object)adaptor.nil();


					string_literal212=(Token)match(input,84,FOLLOW_84_in_specifier2540); 
					string_literal212_tree = (Object)adaptor.create(string_literal212);
					adaptor.addChild(root_0, string_literal212_tree);

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:313:7: TYPE fact_type_array_procedure
					{
					root_0 = (Object)adaptor.nil();


					TYPE213=(Token)match(input,TYPE,FOLLOW_TYPE_in_specifier2548); 
					TYPE213_tree = (Object)adaptor.create(TYPE213);
					adaptor.addChild(root_0, TYPE213_tree);

					pushFollow(FOLLOW_fact_type_array_procedure_in_specifier2550);
					fact_type_array_procedure214=fact_type_array_procedure();
					state._fsp--;

					adaptor.addChild(root_0, fact_type_array_procedure214.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:314:7: 'array'
					{
					root_0 = (Object)adaptor.nil();


					string_literal215=(Token)match(input,68,FOLLOW_68_in_specifier2559); 
					string_literal215_tree = (Object)adaptor.create(string_literal215);
					adaptor.addChild(root_0, string_literal215_tree);

					}
					break;
				case 4 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:315:7: 'switch'
					{
					root_0 = (Object)adaptor.nil();


					string_literal216=(Token)match(input,85,FOLLOW_85_in_specifier2567); 
					string_literal216_tree = (Object)adaptor.create(string_literal216);
					adaptor.addChild(root_0, string_literal216_tree);

					}
					break;
				case 5 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:316:7: 'procedure'
					{
					root_0 = (Object)adaptor.nil();


					string_literal217=(Token)match(input,82,FOLLOW_82_in_specifier2575); 
					string_literal217_tree = (Object)adaptor.create(string_literal217);
					adaptor.addChild(root_0, string_literal217_tree);

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
		return retval;
	}
	// $ANTLR end "specifier"


	public static class fact_type_array_procedure_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fact_type_array_procedure"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:319:1: fact_type_array_procedure : ( 'procedure' | 'array' |);
	public final grammarA60Parser.fact_type_array_procedure_return fact_type_array_procedure() throws RecognitionException {
		grammarA60Parser.fact_type_array_procedure_return retval = new grammarA60Parser.fact_type_array_procedure_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal218=null;
		Token string_literal219=null;

		Object string_literal218_tree=null;
		Object string_literal219_tree=null;

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:319:26: ( 'procedure' | 'array' |)
			int alt63=3;
			switch ( input.LA(1) ) {
			case 82:
				{
				alt63=1;
				}
				break;
			case 68:
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
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:320:5: 'procedure'
					{
					root_0 = (Object)adaptor.nil();


					string_literal218=(Token)match(input,82,FOLLOW_82_in_fact_type_array_procedure2587); 
					string_literal218_tree = (Object)adaptor.create(string_literal218);
					adaptor.addChild(root_0, string_literal218_tree);

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:321:6: 'array'
					{
					root_0 = (Object)adaptor.nil();


					string_literal219=(Token)match(input,68,FOLLOW_68_in_fact_type_array_procedure2594); 
					string_literal219_tree = (Object)adaptor.create(string_literal219);
					adaptor.addChild(root_0, string_literal219_tree);

					}
					break;
				case 3 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:323:5: 
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
		return retval;
	}
	// $ANTLR end "fact_type_array_procedure"


	public static class value_part_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value_part"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:325:1: value_part : 'value' identifier_list ';' -> ^( VP identifier_list ) ;
	public final grammarA60Parser.value_part_return value_part() throws RecognitionException {
		grammarA60Parser.value_part_return retval = new grammarA60Parser.value_part_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal220=null;
		Token char_literal222=null;
		ParserRuleReturnScope identifier_list221 =null;

		Object string_literal220_tree=null;
		Object char_literal222_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_identifier_list=new RewriteRuleSubtreeStream(adaptor,"rule identifier_list");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:325:11: ( 'value' identifier_list ';' -> ^( VP identifier_list ) )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:326:5: 'value' identifier_list ';'
			{
			string_literal220=(Token)match(input,88,FOLLOW_88_in_value_part2613);  
			stream_88.add(string_literal220);

			pushFollow(FOLLOW_identifier_list_in_value_part2615);
			identifier_list221=identifier_list();
			state._fsp--;

			stream_identifier_list.add(identifier_list221.getTree());
			char_literal222=(Token)match(input,52,FOLLOW_52_in_value_part2617);  
			stream_52.add(char_literal222);

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
			// 326:33: -> ^( VP identifier_list )
			{
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:326:36: ^( VP identifier_list )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VP, "VP"), root_1);
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
		return retval;
	}
	// $ANTLR end "value_part"


	public static class identifier_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identifier_list"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:329:1: identifier_list : IDENTIFIER ( ',' IDENTIFIER )* -> ( IDENTIFIER )+ ;
	public final grammarA60Parser.identifier_list_return identifier_list() throws RecognitionException {
		grammarA60Parser.identifier_list_return retval = new grammarA60Parser.identifier_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER223=null;
		Token char_literal224=null;
		Token IDENTIFIER225=null;

		Object IDENTIFIER223_tree=null;
		Object char_literal224_tree=null;
		Object IDENTIFIER225_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:329:16: ( IDENTIFIER ( ',' IDENTIFIER )* -> ( IDENTIFIER )+ )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:330:5: IDENTIFIER ( ',' IDENTIFIER )*
			{
			IDENTIFIER223=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list2637);  
			stream_IDENTIFIER.add(IDENTIFIER223);

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:330:16: ( ',' IDENTIFIER )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==47) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:330:17: ',' IDENTIFIER
					{
					char_literal224=(Token)match(input,47,FOLLOW_47_in_identifier_list2640);  
					stream_47.add(char_literal224);

					IDENTIFIER225=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list2642);  
					stream_IDENTIFIER.add(IDENTIFIER225);

					}
					break;

				default :
					break loop64;
				}
			}

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
			// 330:34: -> ( IDENTIFIER )+
			{
				if ( !(stream_IDENTIFIER.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_IDENTIFIER.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "identifier_list"


	public static class formal_parameter_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formal_parameter_list"
	// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:334:1: formal_parameter_list : '(' IDENTIFIER ( ',' IDENTIFIER )* ')' ( IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')' )* -> ( IDENTIFIER )+ ;
	public final grammarA60Parser.formal_parameter_list_return formal_parameter_list() throws RecognitionException {
		grammarA60Parser.formal_parameter_list_return retval = new grammarA60Parser.formal_parameter_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal226=null;
		Token IDENTIFIER227=null;
		Token char_literal228=null;
		Token IDENTIFIER229=null;
		Token char_literal230=null;
		Token IDENTIFIER231=null;
		Token char_literal232=null;
		Token char_literal233=null;
		Token IDENTIFIER234=null;
		Token char_literal235=null;
		Token IDENTIFIER236=null;
		Token char_literal237=null;

		Object char_literal226_tree=null;
		Object IDENTIFIER227_tree=null;
		Object char_literal228_tree=null;
		Object IDENTIFIER229_tree=null;
		Object char_literal230_tree=null;
		Object IDENTIFIER231_tree=null;
		Object char_literal232_tree=null;
		Object char_literal233_tree=null;
		Object IDENTIFIER234_tree=null;
		Object char_literal235_tree=null;
		Object IDENTIFIER236_tree=null;
		Object char_literal237_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");

		try {
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:334:22: ( '(' IDENTIFIER ( ',' IDENTIFIER )* ')' ( IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')' )* -> ( IDENTIFIER )+ )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:335:5: '(' IDENTIFIER ( ',' IDENTIFIER )* ')' ( IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')' )*
			{
			char_literal226=(Token)match(input,42,FOLLOW_42_in_formal_parameter_list2662);  
			stream_42.add(char_literal226);

			IDENTIFIER227=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2664);  
			stream_IDENTIFIER.add(IDENTIFIER227);

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:335:20: ( ',' IDENTIFIER )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==47) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:335:21: ',' IDENTIFIER
					{
					char_literal228=(Token)match(input,47,FOLLOW_47_in_formal_parameter_list2667);  
					stream_47.add(char_literal228);

					IDENTIFIER229=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2669);  
					stream_IDENTIFIER.add(IDENTIFIER229);

					}
					break;

				default :
					break loop65;
				}
			}

			char_literal230=(Token)match(input,43,FOLLOW_43_in_formal_parameter_list2673);  
			stream_43.add(char_literal230);

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:335:44: ( IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')' )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==IDENTIFIER) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:335:45: IDENTIFIER ':' '(' IDENTIFIER ( ',' IDENTIFIER )* ')'
					{
					IDENTIFIER231=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2678);  
					stream_IDENTIFIER.add(IDENTIFIER231);

					char_literal232=(Token)match(input,50,FOLLOW_50_in_formal_parameter_list2680);  
					stream_50.add(char_literal232);

					char_literal233=(Token)match(input,42,FOLLOW_42_in_formal_parameter_list2682);  
					stream_42.add(char_literal233);

					IDENTIFIER234=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2684);  
					stream_IDENTIFIER.add(IDENTIFIER234);

					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:335:75: ( ',' IDENTIFIER )*
					loop66:
					while (true) {
						int alt66=2;
						int LA66_0 = input.LA(1);
						if ( (LA66_0==47) ) {
							alt66=1;
						}

						switch (alt66) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:335:76: ',' IDENTIFIER
							{
							char_literal235=(Token)match(input,47,FOLLOW_47_in_formal_parameter_list2687);  
							stream_47.add(char_literal235);

							IDENTIFIER236=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formal_parameter_list2689);  
							stream_IDENTIFIER.add(IDENTIFIER236);

							}
							break;

						default :
							break loop66;
						}
					}

					char_literal237=(Token)match(input,43,FOLLOW_43_in_formal_parameter_list2693);  
					stream_43.add(char_literal237);

					}
					break;

				default :
					break loop67;
				}
			}

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
			// 335:99: -> ( IDENTIFIER )+
			{
				if ( !(stream_IDENTIFIER.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_IDENTIFIER.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "formal_parameter_list"

	// Delegated rules



	public static final BitSet FOLLOW_program_in_root255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_program271 = new BitSet(new long[]{0x0010000200010000L,0x000000000026BF30L});
	public static final BitSet FOLLOW_unlabelled_in_program273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_program286 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_program288 = new BitSet(new long[]{0x0000000200000000L,0x0000000000266030L});
	public static final BitSet FOLLOW_program_in_program290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_program298 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_program300 = new BitSet(new long[]{0x0000000200000000L,0x0000000000266030L});
	public static final BitSet FOLLOW_program_in_program302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_program320 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_program322 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_STRING_in_program324 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_program326 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_program328 = new BitSet(new long[]{0x0000000200000000L,0x0000000000266030L});
	public static final BitSet FOLLOW_program_in_program330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_program_bis343 = new BitSet(new long[]{0x0010000200010000L,0x000000000026BF30L});
	public static final BitSet FOLLOW_unlabelled_in_program_bis345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_program_ter361 = new BitSet(new long[]{0x0010000200010000L,0x000000000026BF30L});
	public static final BitSet FOLLOW_unlabelled_in_program_ter363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_program_ter379 = new BitSet(new long[]{0x0004000000010000L});
	public static final BitSet FOLLOW_50_in_program_ter407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001220L});
	public static final BitSet FOLLOW_program_bis_in_program_ter443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statement_in_program_ter463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_statement_in_program_ter483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_list_in_program_ter517 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_program_ter519 = new BitSet(new long[]{0x0000000200000000L,0x0000000000341230L});
	public static final BitSet FOLLOW_specifier_in_program_ter522 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_identifier_list_in_program_ter524 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_program_ter526 = new BitSet(new long[]{0x0000000200000000L,0x0000000000341230L});
	public static final BitSet FOLLOW_program_bis_in_program_ter564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statement_in_program_ter584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_statement_in_program_ter604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unlabelled_block_in_unlabelled650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_tail_in_unlabelled662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_head_in_unlabelled_block678 = new BitSet(new long[]{0x0010000000010000L,0x000000000000BF20L});
	public static final BitSet FOLLOW_compound_tail_in_unlabelled_block680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_block_head703 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_block_head705 = new BitSet(new long[]{0x0000000200000002L,0x0000000000260010L});
	public static final BitSet FOLLOW_79_in_compound_tail725 = new BitSet(new long[]{0x0010000000010000L,0x000000000000BF20L});
	public static final BitSet FOLLOW_statement_in_compound_tail729 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_52_in_compound_tail733 = new BitSet(new long[]{0x0010000000010000L,0x000000000000BF20L});
	public static final BitSet FOLLOW_79_in_compound_tail736 = new BitSet(new long[]{0x0010000000010000L,0x000000000000BF20L});
	public static final BitSet FOLLOW_statement_in_compound_tail739 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_compound_tail743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_program_bis_in_statement764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_statement_in_statement776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unlabelled_basic_statement_in_statement792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statement_in_statement808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specifier_in_statement_bis836 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_identifier_list_in_statement_bis838 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_statement_bis840 = new BitSet(new long[]{0x0000000200000000L,0x0000000000345230L});
	public static final BitSet FOLLOW_specifier_in_statement_bis843 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_identifier_list_in_statement_bis845 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_statement_bis847 = new BitSet(new long[]{0x0000000200000000L,0x0000000000345230L});
	public static final BitSet FOLLOW_after_statement_bis_in_statement_bis851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_after_statement_bis_in_statement_bis876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_program_ter_in_after_statement_bis896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statement_in_after_statement_bis908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_statement_in_after_statement_bis916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_clause_in_for_statement928 = new BitSet(new long[]{0x0000000000010000L,0x0000000000003E20L});
	public static final BitSet FOLLOW_statement_in_for_statement930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_for_clause952 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_for_clause954 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_for_clause956 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_for_list_element_in_for_clause958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_for_clause960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_for_list_element987 = new BitSet(new long[]{0x0000000000000000L,0x0000000002080000L});
	public static final BitSet FOLLOW_83_in_for_list_element1001 = new BitSet(new long[]{0x4001440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_expression_in_for_list_element1005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_for_list_element1007 = new BitSet(new long[]{0x4001440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_expression_in_for_list_element1011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_for_list_element1042 = new BitSet(new long[]{0x4001440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_expression_in_for_list_element1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_clause_in_conditional_statement1079 = new BitSet(new long[]{0x0000000000010000L,0x0000000000003EA0L});
	public static final BitSet FOLLOW_statement_in_conditional_statement1083 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_conditional_statement1094 = new BitSet(new long[]{0x0000000000010000L,0x0000000000003E20L});
	public static final BitSet FOLLOW_statement_in_conditional_statement1098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_go_to_statement_in_unlabelled_basic_statement1140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_unlabelled_basic_statement1152 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_actual_parameter_list_in_unlabelled_basic_statement1154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_unlabelled_basic_statement1162 = new BitSet(new long[]{0x000C040000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_unlabelled_basic_statement1165 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_boolean_expr_in_unlabelled_basic_statement1166 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_47_in_unlabelled_basic_statement1169 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_boolean_expr_in_unlabelled_basic_statement1170 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_unlabelled_basic_statement1174 = new BitSet(new long[]{0x000C040000000002L});
	public static final BitSet FOLLOW_50_in_unlabelled_basic_statement1198 = new BitSet(new long[]{0x4011440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_52_in_unlabelled_basic_statement1199 = new BitSet(new long[]{0x4001440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_51_in_unlabelled_basic_statement1202 = new BitSet(new long[]{0x4001440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_expression_in_unlabelled_basic_statement1206 = new BitSet(new long[]{0x000C000000000002L});
	public static final BitSet FOLLOW_actual_parameter_list_in_unlabelled_basic_statement1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_go_to_statement1272 = new BitSet(new long[]{0x4001440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_74_in_go_to_statement1277 = new BitSet(new long[]{0x4001440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_expression_in_go_to_statement1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_expression1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_clause_in_expression1309 = new BitSet(new long[]{0x4001440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_expression_in_expression1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_expression1316 = new BitSet(new long[]{0x4001440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_expression_in_expression1320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_go_to_statement_in_expression1359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_program_in_expression1372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_if_clause1385 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_boolean_expr_in_if_clause1387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_if_clause1389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_expr_in_boolean_expr1405 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_boolean_expr1409 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_logic_expr_in_boolean_expr1411 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_logic_expr_bis_in_logic_expr1430 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_58_in_logic_expr1434 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_logic_expr_bis_in_logic_expr1436 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_logic_expr_ter_in_logic_expr_bis1455 = new BitSet(new long[]{0xA000030000000002L,0x000000000C010008L});
	public static final BitSet FOLLOW_63_in_logic_expr_bis1477 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_80_in_logic_expr_bis1491 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_91_in_logic_expr_bis1505 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_61_in_logic_expr_bis1519 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_67_in_logic_expr_bis1533 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_40_in_logic_expr_bis1547 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_41_in_logic_expr_bis1561 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_90_in_logic_expr_bis1574 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_logic_expr_ter_in_logic_expr_bis1587 = new BitSet(new long[]{0xA000030000000002L,0x000000000C010008L});
	public static final BitSet FOLLOW_add_expr_in_logic_expr_ter1601 = new BitSet(new long[]{0x1B60000000000002L});
	public static final BitSet FOLLOW_53_in_logic_expr_ter1623 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_59_in_logic_expr_ter1637 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_54_in_logic_expr_ter1651 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_60_in_logic_expr_ter1665 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_57_in_logic_expr_ter1679 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_56_in_logic_expr_ter1702 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_add_expr_in_logic_expr_ter1716 = new BitSet(new long[]{0x1B60000000000002L});
	public static final BitSet FOLLOW_46_in_add_expr1731 = new BitSet(new long[]{0x4001040800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_mult_expr_in_add_expr1735 = new BitSet(new long[]{0x0001400000000002L});
	public static final BitSet FOLLOW_46_in_add_expr1739 = new BitSet(new long[]{0x4001040800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_48_in_add_expr1742 = new BitSet(new long[]{0x4001040800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_mult_expr_in_add_expr1746 = new BitSet(new long[]{0x0001400000000002L});
	public static final BitSet FOLLOW_factor_expr_in_mult_expr1761 = new BitSet(new long[]{0x0002108000000002L});
	public static final BitSet FOLLOW_44_in_mult_expr1783 = new BitSet(new long[]{0x4001040800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_49_in_mult_expr1796 = new BitSet(new long[]{0x4001040800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_39_in_mult_expr1809 = new BitSet(new long[]{0x4001040800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_factor_expr_in_mult_expr1822 = new BitSet(new long[]{0x0002108000000002L});
	public static final BitSet FOLLOW_92_in_factor_expr1837 = new BitSet(new long[]{0x4001040800010000L,0x0000000000000001L});
	public static final BitSet FOLLOW_value_in_factor_expr1841 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_factor_expr1845 = new BitSet(new long[]{0x4001040800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_92_in_factor_expr1849 = new BitSet(new long[]{0x4001040800010000L,0x0000000000000001L});
	public static final BitSet FOLLOW_value_in_factor_expr1853 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_value1869 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_after_identifier_in_value1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_value1891 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_UNSIGNED_NUMBER_in_value1894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNSIGNED_NUMBER_in_value1902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_value1914 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_boolean_expr_in_value1916 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_value1918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_value1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_value1938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actual_parameter_list_in_after_identifier1954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_after_identifier1963 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_boolean_expr_in_after_identifier1965 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_47_in_after_identifier1968 = new BitSet(new long[]{0x4001440800010000L,0x0000000010000001L});
	public static final BitSet FOLLOW_boolean_expr_in_after_identifier1969 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_after_identifier1973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_clause_in_if_statement1992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_program_bis_in_if_statement1994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_actual_parameter2006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_actual_parameter2022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_actual_parameter_list2038 = new BitSet(new long[]{0x4001440A40010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_list2042 = new BitSet(new long[]{0x0000880000000000L});
	public static final BitSet FOLLOW_47_in_actual_parameter_list2045 = new BitSet(new long[]{0x4001440A40010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_list2049 = new BitSet(new long[]{0x0000880000000000L});
	public static final BitSet FOLLOW_43_in_actual_parameter_list2053 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_actual_parameter_list2058 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_actual_parameter_list2060 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_actual_parameter_list2062 = new BitSet(new long[]{0x4001440A40010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_list2066 = new BitSet(new long[]{0x0000880000000000L});
	public static final BitSet FOLLOW_47_in_actual_parameter_list2069 = new BitSet(new long[]{0x4001440A40010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_actual_parameter_in_actual_parameter_list2073 = new BitSet(new long[]{0x0000880000000000L});
	public static final BitSet FOLLOW_43_in_actual_parameter_list2077 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_type_array_proc_declaration_in_declaration2112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_declaration_in_declaration2121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switch_declaration_in_declaration2129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_declaration_in_declaration2137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_type_array_proc_declaration2151 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_type_array_proc_declaration_bis_in_type_array_proc_declaration2153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_array_proc_declaration2165 = new BitSet(new long[]{0x0000000000010000L,0x0000000000040010L});
	public static final BitSet FOLLOW_type_array_proc_declaration_ter_in_type_array_proc_declaration2169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_declaration_in_type_array_proc_declaration_bis2192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_array_proc_declaration_bis2204 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000010L});
	public static final BitSet FOLLOW_type_list_in_type_array_proc_declaration_bis2207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_declaration_in_type_array_proc_declaration_bis2210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_declaration_in_type_array_proc_declaration_ter2223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_declaration_in_type_array_proc_declaration_ter2235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_list_in_type_array_proc_declaration_ter2247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type_list2264 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_type_list2267 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type_list2269 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_expression_in_bound_pair2291 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_bound_pair2293 = new BitSet(new long[]{0x4001440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_expression_in_bound_pair2297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bound_pair_in_bound_pair_list2321 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_bound_pair_list2324 = new BitSet(new long[]{0x4001440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_bound_pair_in_bound_pair_list2326 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_68_in_array_declaration2345 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_array_list_in_array_declaration2347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_segment_in_array_list2360 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_array_list2363 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_array_segment_in_array_list2365 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_array_segment2379 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_array_segment2382 = new BitSet(new long[]{0x4001440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_bound_pair_list_in_array_segment2383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_array_segment2385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_segment_in_array_segment2403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_switch_declaration2424 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_switch_declaration2426 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_switch_declaration2428 = new BitSet(new long[]{0x4001440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_switch_list_in_switch_declaration2430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_switch_list2442 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_switch_list2445 = new BitSet(new long[]{0x4001440A00010000L,0x0000000010267C31L});
	public static final BitSet FOLLOW_expression_in_switch_list2447 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_82_in_procedure_declaration2461 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_procedure_heading_in_procedure_declaration2463 = new BitSet(new long[]{0x0000000200000002L,0x0000000000345230L});
	public static final BitSet FOLLOW_statement_bis_in_procedure_declaration2466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_procedure_heading2493 = new BitSet(new long[]{0x0010040000000000L});
	public static final BitSet FOLLOW_formal_parameter_list_in_procedure_heading2496 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_procedure_heading2500 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_value_part_in_procedure_heading2503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_specifier2540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_specifier2548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040010L});
	public static final BitSet FOLLOW_fact_type_array_procedure_in_specifier2550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_specifier2559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_specifier2567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_specifier2575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_fact_type_array_procedure2587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_fact_type_array_procedure2594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_value_part2613 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_identifier_list_in_value_part2615 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_value_part2617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list2637 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_identifier_list2640 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list2642 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_42_in_formal_parameter_list2662 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_formal_parameter_list2664 = new BitSet(new long[]{0x0000880000000000L});
	public static final BitSet FOLLOW_47_in_formal_parameter_list2667 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_formal_parameter_list2669 = new BitSet(new long[]{0x0000880000000000L});
	public static final BitSet FOLLOW_43_in_formal_parameter_list2673 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_formal_parameter_list2678 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_formal_parameter_list2680 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_formal_parameter_list2682 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_formal_parameter_list2684 = new BitSet(new long[]{0x0000880000000000L});
	public static final BitSet FOLLOW_47_in_formal_parameter_list2687 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_formal_parameter_list2689 = new BitSet(new long[]{0x0000880000000000L});
	public static final BitSet FOLLOW_43_in_formal_parameter_list2693 = new BitSet(new long[]{0x0000000000010002L});
}
