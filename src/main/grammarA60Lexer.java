// $ANTLR null C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g 2020-02-25 15:45:19
package main;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class grammarA60Lexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public grammarA60Lexer() {} 
	public grammarA60Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public grammarA60Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g"; }

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:7:7: ( '%' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:7:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:8:7: ( '&&' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:8:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:9:7: ( '&' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:9:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:10:7: ( '(' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:10:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:11:7: ( ')' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:11:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:12:7: ( '*' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:12:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:13:7: ( '**' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:13:9: '**'
			{
			match("**"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:14:7: ( '+' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:14:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:15:7: ( ',' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:15:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:16:7: ( '-' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:16:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:17:7: ( '/' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:17:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:18:7: ( ':' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:18:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:19:7: ( ':=' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:19:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:20:7: ( ';' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:20:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:21:7: ( '<' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:21:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:22:7: ( '<=' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:22:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:23:7: ( '<=>' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:23:9: '<=>'
			{
			match("<=>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:24:7: ( '<>' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:24:9: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:25:7: ( '=' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:25:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:26:7: ( '=>' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:26:9: '=>'
			{
			match("=>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:27:7: ( '>' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:27:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:28:7: ( '>=' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:28:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:29:7: ( 'AND' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:29:9: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:30:7: ( 'FALSE' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:30:9: 'FALSE'
			{
			match("FALSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:31:7: ( 'OR' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:31:9: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:32:7: ( 'TRUE' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:32:9: 'TRUE'
			{
			match("TRUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:33:7: ( '[' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:33:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:34:7: ( ']' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:34:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:35:7: ( 'and' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:35:9: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:36:7: ( 'array' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:36:9: 'array'
			{
			match("array"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:37:7: ( 'begin' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:37:9: 'begin'
			{
			match("begin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:38:7: ( 'do' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:38:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:39:7: ( 'else' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:39:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:40:7: ( 'end' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:40:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:41:7: ( 'for' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:41:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:42:7: ( 'go to' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:42:9: 'go to'
			{
			match("go to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:43:7: ( 'goto' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:43:9: 'goto'
			{
			match("goto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:44:7: ( 'if' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:44:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:45:7: ( 'inline' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:45:9: 'inline'
			{
			match("inline"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:46:7: ( 'label' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:46:9: 'label'
			{
			match("label"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:47:7: ( 'label:' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:47:9: 'label:'
			{
			match("label:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:48:7: ( 'or' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:48:9: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:49:7: ( 'own' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:49:9: 'own'
			{
			match("own"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:50:7: ( 'procedure' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:50:9: 'procedure'
			{
			match("procedure"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:51:7: ( 'step' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:51:9: 'step'
			{
			match("step"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:52:7: ( 'string' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:52:9: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:53:7: ( 'switch' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:53:9: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:54:7: ( 'then' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:54:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:55:7: ( 'until' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:55:9: 'until'
			{
			match("until"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:56:7: ( 'value' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:56:9: 'value'
			{
			match("value"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:57:7: ( 'while' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:57:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:58:7: ( '|' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:58:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:59:7: ( '||' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:59:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:60:7: ( '~' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:60:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__92"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:338:5: ( 'real' | 'integer' | 'boolean' )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 'r':
				{
				alt1=1;
				}
				break;
			case 'i':
				{
				alt1=2;
				}
				break;
			case 'b':
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:339:5: 'real'
					{
					match("real"); 

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:340:10: 'integer'
					{
					match("integer"); 

					}
					break;
				case 3 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:341:10: 'boolean'
					{
					match("boolean"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:344:11: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:345:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:345:25: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "PARAMETER_DELIMITER"
	public final void mPARAMETER_DELIMITER() throws RecognitionException {
		try {
			int _type = PARAMETER_DELIMITER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:348:20: ( ')' ( 'a' .. 'z' | 'A' .. 'Z' )+ ':' '(' | ',' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==')') ) {
				alt4=1;
			}
			else if ( (LA4_0==',') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:349:5: ')' ( 'a' .. 'z' | 'A' .. 'Z' )+ ':' '('
					{
					match(')'); 
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:349:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:
							{
							if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match(':'); 
					match('('); 
					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:350:7: ','
					{
					match(','); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARAMETER_DELIMITER"

	// $ANTLR start "UNSIGNED_NUMBER"
	public final void mUNSIGNED_NUMBER() throws RecognitionException {
		try {
			int _type = UNSIGNED_NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:353:16: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ ( 'e' ( '+' | '-' | ' ' ) ( '0' .. '9' )+ )? | ( 'e' ( '+' | '-' | ' ' ) ( '0' .. '9' )+ ) )? )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:354:5: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ ( 'e' ( '+' | '-' | ' ' ) ( '0' .. '9' )+ )? | ( 'e' ( '+' | '-' | ' ' ) ( '0' .. '9' )+ ) )?
			{
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:354:5: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:355:9: ( '.' ( '0' .. '9' )+ ( 'e' ( '+' | '-' | ' ' ) ( '0' .. '9' )+ )? | ( 'e' ( '+' | '-' | ' ' ) ( '0' .. '9' )+ ) )?
			int alt10=3;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='.') ) {
				alt10=1;
			}
			else if ( (LA10_0=='e') ) {
				alt10=2;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:356:9: '.' ( '0' .. '9' )+ ( 'e' ( '+' | '-' | ' ' ) ( '0' .. '9' )+ )?
					{
					match('.'); 
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:356:12: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:356:24: ( 'e' ( '+' | '-' | ' ' ) ( '0' .. '9' )+ )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='e') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:356:25: 'e' ( '+' | '-' | ' ' ) ( '0' .. '9' )+
							{
							match('e'); 
							if ( input.LA(1)==' '||input.LA(1)=='+'||input.LA(1)=='-' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:361:14: ( '0' .. '9' )+
							int cnt7=0;
							loop7:
							while (true) {
								int alt7=2;
								int LA7_0 = input.LA(1);
								if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
									alt7=1;
								}

								switch (alt7) {
								case 1 :
									// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									if ( cnt7 >= 1 ) break loop7;
									EarlyExitException eee = new EarlyExitException(7, input);
									throw eee;
								}
								cnt7++;
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:362:11: ( 'e' ( '+' | '-' | ' ' ) ( '0' .. '9' )+ )
					{
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:362:11: ( 'e' ( '+' | '-' | ' ' ) ( '0' .. '9' )+ )
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:362:12: 'e' ( '+' | '-' | ' ' ) ( '0' .. '9' )+
					{
					match('e'); 
					if ( input.LA(1)==' '||input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:367:14: ( '0' .. '9' )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNSIGNED_NUMBER"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:371:7: ( '\"' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | ' ' | '.' | '(' | ')' | '[' | ']' | ',' | '_' | ';' | '\\'' | ':' | '<' | '=' | '>' | '\\\\\"' | '~' | '/' | '\\\\' | '+' | '-' | '*' )* '\"' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:5: '\"' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | ' ' | '.' | '(' | ')' | '[' | ']' | ',' | '_' | ';' | '\\'' | ':' | '<' | '=' | '>' | '\\\\\"' | '~' | '/' | '\\\\' | '+' | '-' | '*' )* '\"'
			{
			match('\"'); 
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:9: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | ' ' | '.' | '(' | ')' | '[' | ']' | ',' | '_' | ';' | '\\'' | ':' | '<' | '=' | '>' | '\\\\\"' | '~' | '/' | '\\\\' | '+' | '-' | '*' )*
			loop11:
			while (true) {
				int alt11=25;
				switch ( input.LA(1) ) {
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt11=1;
					}
					break;
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					{
					alt11=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					alt11=3;
					}
					break;
				case ' ':
					{
					alt11=4;
					}
					break;
				case '.':
					{
					alt11=5;
					}
					break;
				case '(':
					{
					alt11=6;
					}
					break;
				case ')':
					{
					alt11=7;
					}
					break;
				case '[':
					{
					alt11=8;
					}
					break;
				case ']':
					{
					alt11=9;
					}
					break;
				case ',':
					{
					alt11=10;
					}
					break;
				case '_':
					{
					alt11=11;
					}
					break;
				case ';':
					{
					alt11=12;
					}
					break;
				case '\'':
					{
					alt11=13;
					}
					break;
				case ':':
					{
					alt11=14;
					}
					break;
				case '<':
					{
					alt11=15;
					}
					break;
				case '=':
					{
					alt11=16;
					}
					break;
				case '>':
					{
					alt11=17;
					}
					break;
				case '\\':
					{
					int LA11_19 = input.LA(2);
					if ( (LA11_19=='\"') ) {
						int LA11_25 = input.LA(3);
						if ( (LA11_25==' '||LA11_25=='\"'||(LA11_25 >= '\'' && LA11_25 <= '>')||(LA11_25 >= 'A' && LA11_25 <= ']')||LA11_25=='_'||(LA11_25 >= 'a' && LA11_25 <= 'z')||LA11_25=='~') ) {
							alt11=18;
						}
						else {
							alt11=21;
						}

					}
					else if ( (LA11_19==' '||(LA11_19 >= '\'' && LA11_19 <= '>')||(LA11_19 >= 'A' && LA11_19 <= ']')||LA11_19=='_'||(LA11_19 >= 'a' && LA11_19 <= 'z')||LA11_19=='~') ) {
						alt11=21;
					}

					}
					break;
				case '~':
					{
					alt11=19;
					}
					break;
				case '/':
					{
					alt11=20;
					}
					break;
				case '+':
					{
					alt11=22;
					}
					break;
				case '-':
					{
					alt11=23;
					}
					break;
				case '*':
					{
					alt11=24;
					}
					break;
				}
				switch (alt11) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:11: ( 'a' .. 'z' )
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:24: ( 'A' .. 'Z' )
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:37: ( '0' .. '9' )
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 4 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:50: ' '
					{
					match(' '); 
					}
					break;
				case 5 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:56: '.'
					{
					match('.'); 
					}
					break;
				case 6 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:63: '('
					{
					match('('); 
					}
					break;
				case 7 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:69: ')'
					{
					match(')'); 
					}
					break;
				case 8 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:75: '['
					{
					match('['); 
					}
					break;
				case 9 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:81: ']'
					{
					match(']'); 
					}
					break;
				case 10 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:87: ','
					{
					match(','); 
					}
					break;
				case 11 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:93: '_'
					{
					match('_'); 
					}
					break;
				case 12 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:99: ';'
					{
					match(';'); 
					}
					break;
				case 13 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:105: '\\''
					{
					match('\''); 
					}
					break;
				case 14 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:112: ':'
					{
					match(':'); 
					}
					break;
				case 15 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:118: '<'
					{
					match('<'); 
					}
					break;
				case 16 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:124: '='
					{
					match('='); 
					}
					break;
				case 17 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:130: '>'
					{
					match('>'); 
					}
					break;
				case 18 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:136: '\\\\\"'
					{
					match("\\\""); 

					}
					break;
				case 19 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:143: '~'
					{
					match('~'); 
					}
					break;
				case 20 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:149: '/'
					{
					match('/'); 
					}
					break;
				case 21 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:155: '\\\\'
					{
					match('\\'); 
					}
					break;
				case 22 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:162: '+'
					{
					match('+'); 
					}
					break;
				case 23 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:168: '-'
					{
					match('-'); 
					}
					break;
				case 24 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:372:174: '*'
					{
					match('*'); 
					}
					break;

				default :
					break loop11;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:375:8: ( ( ( 'comment' | '#' ) (~ ';' )* ';' ) )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:376:5: ( ( 'comment' | '#' ) (~ ';' )* ';' )
			{
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:376:5: ( ( 'comment' | '#' ) (~ ';' )* ';' )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:376:6: ( 'comment' | '#' ) (~ ';' )* ';'
			{
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:376:6: ( 'comment' | '#' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='c') ) {
				alt12=1;
			}
			else if ( (LA12_0=='#') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:376:7: 'comment'
					{
					match("comment"); 

					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:376:17: '#'
					{
					match('#'); 
					}
					break;

			}

			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:376:22: (~ ';' )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '\u0000' && LA13_0 <= ':')||(LA13_0 >= '<' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ':')||(input.LA(1) >= '<' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop13;
				}
			}

			match(';'); 
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:379:3: ( ( ' ' | '\\r' | '\\n' | '\\t' | 'EOF' )+ )
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:380:5: ( ' ' | '\\r' | '\\n' | '\\t' | 'EOF' )+
			{
			// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:380:5: ( ' ' | '\\r' | '\\n' | '\\t' | 'EOF' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=6;
				switch ( input.LA(1) ) {
				case ' ':
					{
					alt14=1;
					}
					break;
				case '\r':
					{
					alt14=2;
					}
					break;
				case '\n':
					{
					alt14=3;
					}
					break;
				case '\t':
					{
					alt14=4;
					}
					break;
				case 'E':
					{
					alt14=5;
					}
					break;
				}
				switch (alt14) {
				case 1 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:380:6: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:380:10: '\\r'
					{
					match('\r'); 
					}
					break;
				case 3 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:380:15: '\\n'
					{
					match('\n'); 
					}
					break;
				case 4 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:380:20: '\\t'
					{
					match('\t'); 
					}
					break;
				case 5 :
					// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:380:25: 'EOF'
					{
					match("EOF"); 

					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:8: ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | TYPE | IDENTIFIER | PARAMETER_DELIMITER | UNSIGNED_NUMBER | STRING | COMMENT | WS )
		int alt15=61;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:10: T__39
				{
				mT__39(); 

				}
				break;
			case 2 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:16: T__40
				{
				mT__40(); 

				}
				break;
			case 3 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:22: T__41
				{
				mT__41(); 

				}
				break;
			case 4 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:28: T__42
				{
				mT__42(); 

				}
				break;
			case 5 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:34: T__43
				{
				mT__43(); 

				}
				break;
			case 6 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:40: T__44
				{
				mT__44(); 

				}
				break;
			case 7 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:46: T__45
				{
				mT__45(); 

				}
				break;
			case 8 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:52: T__46
				{
				mT__46(); 

				}
				break;
			case 9 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:58: T__47
				{
				mT__47(); 

				}
				break;
			case 10 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:64: T__48
				{
				mT__48(); 

				}
				break;
			case 11 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:70: T__49
				{
				mT__49(); 

				}
				break;
			case 12 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:76: T__50
				{
				mT__50(); 

				}
				break;
			case 13 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:82: T__51
				{
				mT__51(); 

				}
				break;
			case 14 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:88: T__52
				{
				mT__52(); 

				}
				break;
			case 15 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:94: T__53
				{
				mT__53(); 

				}
				break;
			case 16 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:100: T__54
				{
				mT__54(); 

				}
				break;
			case 17 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:106: T__55
				{
				mT__55(); 

				}
				break;
			case 18 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:112: T__56
				{
				mT__56(); 

				}
				break;
			case 19 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:118: T__57
				{
				mT__57(); 

				}
				break;
			case 20 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:124: T__58
				{
				mT__58(); 

				}
				break;
			case 21 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:130: T__59
				{
				mT__59(); 

				}
				break;
			case 22 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:136: T__60
				{
				mT__60(); 

				}
				break;
			case 23 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:142: T__61
				{
				mT__61(); 

				}
				break;
			case 24 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:148: T__62
				{
				mT__62(); 

				}
				break;
			case 25 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:154: T__63
				{
				mT__63(); 

				}
				break;
			case 26 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:160: T__64
				{
				mT__64(); 

				}
				break;
			case 27 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:166: T__65
				{
				mT__65(); 

				}
				break;
			case 28 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:172: T__66
				{
				mT__66(); 

				}
				break;
			case 29 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:178: T__67
				{
				mT__67(); 

				}
				break;
			case 30 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:184: T__68
				{
				mT__68(); 

				}
				break;
			case 31 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:190: T__69
				{
				mT__69(); 

				}
				break;
			case 32 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:196: T__70
				{
				mT__70(); 

				}
				break;
			case 33 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:202: T__71
				{
				mT__71(); 

				}
				break;
			case 34 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:208: T__72
				{
				mT__72(); 

				}
				break;
			case 35 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:214: T__73
				{
				mT__73(); 

				}
				break;
			case 36 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:220: T__74
				{
				mT__74(); 

				}
				break;
			case 37 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:226: T__75
				{
				mT__75(); 

				}
				break;
			case 38 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:232: T__76
				{
				mT__76(); 

				}
				break;
			case 39 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:238: T__77
				{
				mT__77(); 

				}
				break;
			case 40 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:244: T__78
				{
				mT__78(); 

				}
				break;
			case 41 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:250: T__79
				{
				mT__79(); 

				}
				break;
			case 42 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:256: T__80
				{
				mT__80(); 

				}
				break;
			case 43 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:262: T__81
				{
				mT__81(); 

				}
				break;
			case 44 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:268: T__82
				{
				mT__82(); 

				}
				break;
			case 45 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:274: T__83
				{
				mT__83(); 

				}
				break;
			case 46 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:280: T__84
				{
				mT__84(); 

				}
				break;
			case 47 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:286: T__85
				{
				mT__85(); 

				}
				break;
			case 48 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:292: T__86
				{
				mT__86(); 

				}
				break;
			case 49 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:298: T__87
				{
				mT__87(); 

				}
				break;
			case 50 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:304: T__88
				{
				mT__88(); 

				}
				break;
			case 51 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:310: T__89
				{
				mT__89(); 

				}
				break;
			case 52 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:316: T__90
				{
				mT__90(); 

				}
				break;
			case 53 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:322: T__91
				{
				mT__91(); 

				}
				break;
			case 54 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:328: T__92
				{
				mT__92(); 

				}
				break;
			case 55 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:334: TYPE
				{
				mTYPE(); 

				}
				break;
			case 56 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:339: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 57 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:350: PARAMETER_DELIMITER
				{
				mPARAMETER_DELIMITER(); 

				}
				break;
			case 58 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:370: UNSIGNED_NUMBER
				{
				mUNSIGNED_NUMBER(); 

				}
				break;
			case 59 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:386: STRING
				{
				mSTRING(); 

				}
				break;
			case 60 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:393: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 61 :
				// C:\\Users\\malau\\Documents\\TNCY\\2A\\Compil\\hantz7u\\grammarA60.g:1:401: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\2\uffff\1\57\1\uffff\1\60\1\63\4\uffff\1\66\1\uffff\1\71\1\73\1\75\4"+
		"\55\2\uffff\17\55\1\130\1\uffff\2\55\2\uffff\1\55\14\uffff\1\135\6\uffff"+
		"\2\55\1\140\5\55\1\146\4\55\1\154\2\55\1\160\10\55\2\uffff\3\55\2\uffff"+
		"\1\175\1\55\1\uffff\1\55\1\u0080\3\55\1\uffff\1\55\1\u0085\1\u0086\1\uffff"+
		"\1\55\1\uffff\3\55\1\uffff\1\u008b\13\55\1\uffff\1\55\1\u0098\1\uffff"+
		"\3\55\1\u009c\2\uffff\1\u009d\3\55\1\uffff\1\55\1\u00a2\2\55\1\u00a5\3"+
		"\55\1\u00a9\2\55\1\u00ab\1\uffff\1\u00ac\1\u00ad\1\55\2\uffff\2\55\1\u00b2"+
		"\1\55\1\uffff\2\55\1\uffff\1\u00b6\1\u00b7\1\u00b8\1\uffff\1\55\3\uffff"+
		"\1\55\1\u00bb\1\55\2\uffff\1\55\1\u00be\1\u00bf\3\uffff\1\55\1\u00a9\1"+
		"\uffff\1\u00a9\1\55\2\uffff\3\55\1\u00c4\1\uffff";
	static final String DFA15_eofS =
		"\u00c5\uffff";
	static final String DFA15_minS =
		"\1\11\1\uffff\1\46\1\uffff\1\101\1\52\4\uffff\1\75\1\uffff\1\75\1\76\1"+
		"\75\1\116\1\101\2\122\2\uffff\1\156\1\145\1\157\1\154\2\157\1\146\1\141"+
		"\2\162\1\164\1\150\1\156\1\141\1\150\1\174\1\uffff\1\145\1\157\2\uffff"+
		"\1\117\14\uffff\1\76\6\uffff\1\104\1\114\1\60\1\125\1\144\1\162\1\147"+
		"\1\157\1\60\1\163\1\144\1\162\1\40\1\60\1\154\1\142\1\60\1\156\1\157\1"+
		"\145\1\151\1\145\1\164\1\154\1\151\2\uffff\1\141\1\155\1\106\2\uffff\1"+
		"\60\1\123\1\uffff\1\105\1\60\1\141\1\151\1\154\1\uffff\1\145\2\60\1\uffff"+
		"\1\157\1\uffff\1\151\2\145\1\uffff\1\60\1\143\1\160\1\151\1\164\1\156"+
		"\1\151\1\165\2\154\1\155\1\11\1\uffff\1\105\1\60\1\uffff\1\171\1\156\1"+
		"\145\1\60\2\uffff\1\60\1\156\1\147\1\154\1\uffff\1\145\1\60\1\156\1\143"+
		"\1\60\1\154\2\145\1\60\1\145\1\117\1\60\1\uffff\2\60\1\141\2\uffff\2\145"+
		"\1\60\1\144\1\uffff\1\147\1\150\1\uffff\3\60\1\uffff\1\156\3\uffff\1\156"+
		"\1\60\1\162\2\uffff\1\165\2\60\3\uffff\1\164\1\60\1\uffff\1\60\1\162\2"+
		"\uffff\1\0\1\145\1\0\1\60\1\uffff";
	static final String DFA15_maxS =
		"\1\176\1\uffff\1\46\1\uffff\1\172\1\52\4\uffff\1\75\1\uffff\2\76\1\75"+
		"\1\116\1\101\2\122\2\uffff\1\162\2\157\1\156\2\157\1\156\1\141\1\167\1"+
		"\162\1\167\1\150\1\156\1\141\1\150\1\174\1\uffff\1\145\1\157\2\uffff\1"+
		"\117\14\uffff\1\76\6\uffff\1\104\1\114\1\172\1\125\1\144\1\162\1\147\1"+
		"\157\1\172\1\163\1\144\1\162\1\164\1\172\1\164\1\142\1\172\1\156\1\157"+
		"\1\162\1\151\1\145\1\164\1\154\1\151\2\uffff\1\141\1\155\1\106\2\uffff"+
		"\1\172\1\123\1\uffff\1\105\1\172\1\141\1\151\1\154\1\uffff\1\145\2\172"+
		"\1\uffff\1\157\1\uffff\1\151\2\145\1\uffff\1\172\1\143\1\160\1\151\1\164"+
		"\1\156\1\151\1\165\2\154\1\155\1\105\1\uffff\1\105\1\172\1\uffff\1\171"+
		"\1\156\1\145\1\172\2\uffff\1\172\1\156\1\147\1\154\1\uffff\1\145\1\172"+
		"\1\156\1\143\1\172\1\154\2\145\1\172\1\145\1\117\1\172\1\uffff\2\172\1"+
		"\141\2\uffff\2\145\1\172\1\144\1\uffff\1\147\1\150\1\uffff\3\172\1\uffff"+
		"\1\156\3\uffff\1\156\1\172\1\162\2\uffff\1\165\2\172\3\uffff\1\164\1\172"+
		"\1\uffff\1\172\1\162\2\uffff\1\uffff\1\145\1\uffff\1\172\1\uffff";
	static final String DFA15_acceptS =
		"\1\uffff\1\1\1\uffff\1\4\2\uffff\1\10\1\11\1\12\1\13\1\uffff\1\16\7\uffff"+
		"\1\33\1\34\20\uffff\1\66\2\uffff\1\72\1\73\1\uffff\1\74\1\75\1\70\1\2"+
		"\1\3\1\5\1\71\1\7\1\6\1\11\1\15\1\14\1\uffff\1\22\1\17\1\24\1\23\1\26"+
		"\1\25\31\uffff\1\65\1\64\3\uffff\1\21\1\20\2\uffff\1\31\5\uffff\1\40\3"+
		"\uffff\1\44\1\uffff\1\46\3\uffff\1\52\14\uffff\1\27\2\uffff\1\35\4\uffff"+
		"\1\42\1\43\4\uffff\1\53\14\uffff\1\32\3\uffff\1\41\1\45\4\uffff\1\55\2"+
		"\uffff\1\60\3\uffff\1\67\1\uffff\1\30\1\36\1\37\3\uffff\1\51\1\50\3\uffff"+
		"\1\61\1\62\1\63\2\uffff\1\47\2\uffff\1\56\1\57\4\uffff\1\54";
	static final String DFA15_specialS =
		"\u00c0\uffff\1\1\1\uffff\1\0\2\uffff}>";
	static final String[] DFA15_transitionS = {
			"\2\54\2\uffff\1\54\22\uffff\1\54\1\uffff\1\51\1\53\1\uffff\1\1\1\2\1"+
			"\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\12\50\1\12\1\13\1\14\1\15"+
			"\1\16\2\uffff\1\17\3\55\1\52\1\20\10\55\1\21\4\55\1\22\6\55\1\23\1\uffff"+
			"\1\24\3\uffff\1\25\1\26\1\47\1\27\1\30\1\31\1\32\1\55\1\33\2\55\1\34"+
			"\2\55\1\35\1\36\1\55\1\46\1\37\1\40\1\41\1\42\1\43\3\55\1\uffff\1\44"+
			"\1\uffff\1\45",
			"",
			"\1\56",
			"",
			"\32\61\6\uffff\32\61",
			"\1\62",
			"",
			"",
			"",
			"",
			"\1\65",
			"",
			"\1\67\1\70",
			"\1\72",
			"\1\74",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"",
			"",
			"\1\102\3\uffff\1\103",
			"\1\104\11\uffff\1\105",
			"\1\106",
			"\1\107\1\uffff\1\110",
			"\1\111",
			"\1\112",
			"\1\113\7\uffff\1\114",
			"\1\115",
			"\1\116\4\uffff\1\117",
			"\1\120",
			"\1\121\2\uffff\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"",
			"\1\131",
			"\1\132",
			"",
			"",
			"\1\133",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\134",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\136",
			"\1\137",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152\123\uffff\1\153",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\155\7\uffff\1\156",
			"\1\157",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\161",
			"\1\162",
			"\1\163\14\uffff\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"",
			"",
			"\1\172",
			"\1\173",
			"\1\174",
			"",
			"",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\176",
			"",
			"\1\177",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"",
			"\1\u0084",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"",
			"\1\u0087",
			"",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\2\54\2\uffff\1\54\22\uffff\1\54\44\uffff\1\u0096",
			"",
			"\1\u0097",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"",
			"",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"",
			"\1\u00a1",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\u00a3",
			"\1\u00a4",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\u00aa",
			"\1\133",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\u00ae",
			"",
			"",
			"\1\u00af",
			"\1\u00b0",
			"\12\55\1\u00b1\6\uffff\32\55\6\uffff\32\55",
			"\1\u00b3",
			"",
			"\1\u00b4",
			"\1\u00b5",
			"",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"",
			"\1\u00b9",
			"",
			"",
			"",
			"\1\u00ba",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\u00bc",
			"",
			"",
			"\1\u00bd",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"",
			"",
			"",
			"\1\u00c0",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\u00c1",
			"",
			"",
			"\60\53\12\u00c2\7\53\32\u00c2\6\53\32\u00c2\uff85\53",
			"\1\u00c3",
			"\60\53\12\u00c2\7\53\32\u00c2\6\53\32\u00c2\uff85\53",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | TYPE | IDENTIFIER | PARAMETER_DELIMITER | UNSIGNED_NUMBER | STRING | COMMENT | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA15_194 = input.LA(1);
						s = -1;
						if ( ((LA15_194 >= '\u0000' && LA15_194 <= '/')||(LA15_194 >= ':' && LA15_194 <= '@')||(LA15_194 >= '[' && LA15_194 <= '`')||(LA15_194 >= '{' && LA15_194 <= '\uFFFF')) ) {s = 43;}
						else if ( ((LA15_194 >= '0' && LA15_194 <= '9')||(LA15_194 >= 'A' && LA15_194 <= 'Z')||(LA15_194 >= 'a' && LA15_194 <= 'z')) ) {s = 194;}
						else s = 45;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA15_192 = input.LA(1);
						s = -1;
						if ( ((LA15_192 >= '0' && LA15_192 <= '9')||(LA15_192 >= 'A' && LA15_192 <= 'Z')||(LA15_192 >= 'a' && LA15_192 <= 'z')) ) {s = 194;}
						else if ( ((LA15_192 >= '\u0000' && LA15_192 <= '/')||(LA15_192 >= ':' && LA15_192 <= '@')||(LA15_192 >= '[' && LA15_192 <= '`')||(LA15_192 >= '{' && LA15_192 <= '\uFFFF')) ) {s = 43;}
						else s = 45;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 15, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
