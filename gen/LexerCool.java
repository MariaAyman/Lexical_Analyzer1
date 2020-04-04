// Generated from D:/#Mera#/compiler projects/Lexical_Analyzer1/src\LexerCool.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerCool extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Digit=1, Digits=2, Num=3, Letter=4, Relop=5, TRUE=6, FALSE=7, Literal=8, 
		BOOL_CONST=9, WS=10, SEMICOLON=11, DARROW=12, LPAREN=13, RPAREN=14, COMMA=15, 
		PLUS=16, MINUS=17, STAR=18, SLASH=19, TILDE=20, LBRACE=21, RBRACE=22, 
		DOT=23, ASSIGN=24, ATSYM=25, COLON=26, DoubleQout=27, CASE=28, ESAC=29, 
		IF=30, FI=31, WHILE=32, THEN=33, ELSE=34, LOOP=35, POOL=36, CLASS=37, 
		IN=38, INHERITS=39, OF=40, LET=41, NEW=42, VOID=43, NOT=44, STRING=45, 
		INT=46, ID=47, ERROR=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Digit", "Digits", "Num", "Letter", "Relop", "TRUE", "FALSE", "Literal", 
			"BOOL_CONST", "WS", "SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COMMA", 
			"PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LBRACE", "RBRACE", "DOT", 
			"ASSIGN", "ATSYM", "COLON", "DoubleQout", "CASE", "ESAC", "IF", "FI", 
			"WHILE", "THEN", "ELSE", "LOOP", "POOL", "CLASS", "IN", "INHERITS", "OF", 
			"LET", "NEW", "VOID", "NOT", "STRING", "INT", "ID", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "';'", 
			"'=>'", "'('", "')'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'{'", 
			"'}'", "'.'", "'<-'", "'@'", "':'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Digit", "Digits", "Num", "Letter", "Relop", "TRUE", "FALSE", "Literal", 
			"BOOL_CONST", "WS", "SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COMMA", 
			"PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LBRACE", "RBRACE", "DOT", 
			"ASSIGN", "ATSYM", "COLON", "DoubleQout", "CASE", "ESAC", "IF", "FI", 
			"WHILE", "THEN", "ELSE", "LOOP", "POOL", "CLASS", "IN", "INHERITS", "OF", 
			"LET", "NEW", "VOID", "NOT", "STRING", "INT", "ID", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LexerCool(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerCool.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0136\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\6\3g\n\3\r\3"+
		"\16\3h\3\4\3\4\3\4\5\4n\n\4\3\4\3\4\5\4r\n\4\3\4\5\4u\n\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\5\6}\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u009f\n\t\f\t\16\t\u00a2\13\t\3\t\3\t\3\n\3\n\5\n\u00a8"+
		"\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3."+
		"\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u0130\n\60\f\60\16\60\u0133"+
		"\13\60\3\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"\3\2\30\3\2\62;\4\2--//\4\2C\\c|\4\2TTtt\4\2WWww\4\2GGgg\4\2CCcc\4\2N"+
		"Nnn\4\2UUuu\5\2\13\f\17\17\"\"\4\2EEee\4\2KKkk\4\2HHhh\4\2YYyy\4\2JJj"+
		"j\4\2VVvv\4\2PPpp\4\2QQqq\4\2RRrr\4\2XXxx\4\2FFff\4\2IIii\2\u0153\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\3c\3\2\2\2\5f\3\2\2\2\7j\3\2\2\2\tv\3\2\2\2\13|\3\2\2\2\r~\3\2\2\2"+
		"\17\u0083\3\2\2\2\21\u0089\3\2\2\2\23\u00a7\3\2\2\2\25\u00a9\3\2\2\2\27"+
		"\u00ad\3\2\2\2\31\u00af\3\2\2\2\33\u00b2\3\2\2\2\35\u00b4\3\2\2\2\37\u00b6"+
		"\3\2\2\2!\u00b8\3\2\2\2#\u00ba\3\2\2\2%\u00bc\3\2\2\2\'\u00be\3\2\2\2"+
		")\u00c0\3\2\2\2+\u00c2\3\2\2\2-\u00c4\3\2\2\2/\u00c6\3\2\2\2\61\u00c8"+
		"\3\2\2\2\63\u00cb\3\2\2\2\65\u00cd\3\2\2\2\67\u00cf\3\2\2\29\u00d1\3\2"+
		"\2\2;\u00d6\3\2\2\2=\u00db\3\2\2\2?\u00de\3\2\2\2A\u00e1\3\2\2\2C\u00e7"+
		"\3\2\2\2E\u00ec\3\2\2\2G\u00f1\3\2\2\2I\u00f6\3\2\2\2K\u00fb\3\2\2\2M"+
		"\u0101\3\2\2\2O\u0104\3\2\2\2Q\u010c\3\2\2\2S\u010f\3\2\2\2U\u0113\3\2"+
		"\2\2W\u0117\3\2\2\2Y\u011c\3\2\2\2[\u0120\3\2\2\2]\u0127\3\2\2\2_\u012b"+
		"\3\2\2\2a\u0134\3\2\2\2cd\t\2\2\2d\4\3\2\2\2eg\5\3\2\2fe\3\2\2\2gh\3\2"+
		"\2\2hf\3\2\2\2hi\3\2\2\2i\6\3\2\2\2jm\5\5\3\2kl\13\2\2\2ln\5\5\3\2mk\3"+
		"\2\2\2mn\3\2\2\2nt\3\2\2\2oq\7g\2\2pr\t\3\2\2qp\3\2\2\2qr\3\2\2\2rs\3"+
		"\2\2\2su\5\5\3\2to\3\2\2\2tu\3\2\2\2u\b\3\2\2\2vw\t\4\2\2w\n\3\2\2\2x"+
		"}\7>\2\2yz\7>\2\2z}\7?\2\2{}\7?\2\2|x\3\2\2\2|y\3\2\2\2|{\3\2\2\2}\f\3"+
		"\2\2\2~\177\7v\2\2\177\u0080\t\5\2\2\u0080\u0081\t\6\2\2\u0081\u0082\t"+
		"\7\2\2\u0082\16\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\t\b\2\2\u0085\u0086"+
		"\t\t\2\2\u0086\u0087\t\n\2\2\u0087\u0088\t\7\2\2\u0088\20\3\2\2\2\u0089"+
		"\u00a0\5\67\34\2\u008a\u009f\5\t\5\2\u008b\u009f\5\27\f\2\u008c\u009f"+
		"\5\31\r\2\u008d\u009f\5\33\16\2\u008e\u009f\5\35\17\2\u008f\u009f\5\37"+
		"\20\2\u0090\u009f\5!\21\2\u0091\u009f\5#\22\2\u0092\u009f\5%\23\2\u0093"+
		"\u009f\5)\25\2\u0094\u009f\5+\26\2\u0095\u009f\5-\27\2\u0096\u009f\5/"+
		"\30\2\u0097\u009f\5\61\31\2\u0098\u009f\5\63\32\2\u0099\u009f\5\65\33"+
		"\2\u009a\u009f\5\67\34\2\u009b\u009f\5\3\2\2\u009c\u009f\5\13\6\2\u009d"+
		"\u009f\5\25\13\2\u009e\u008a\3\2\2\2\u009e\u008b\3\2\2\2\u009e\u008c\3"+
		"\2\2\2\u009e\u008d\3\2\2\2\u009e\u008e\3\2\2\2\u009e\u008f\3\2\2\2\u009e"+
		"\u0090\3\2\2\2\u009e\u0091\3\2\2\2\u009e\u0092\3\2\2\2\u009e\u0093\3\2"+
		"\2\2\u009e\u0094\3\2\2\2\u009e\u0095\3\2\2\2\u009e\u0096\3\2\2\2\u009e"+
		"\u0097\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2"+
		"\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\5\67\34\2\u00a4\22\3\2\2\2\u00a5"+
		"\u00a8\5\r\7\2\u00a6\u00a8\5\17\b\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3"+
		"\2\2\2\u00a8\24\3\2\2\2\u00a9\u00aa\t\13\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\b\13\2\2\u00ac\26\3\2\2\2\u00ad\u00ae\7=\2\2\u00ae\30\3\2\2\2\u00af"+
		"\u00b0\7?\2\2\u00b0\u00b1\7@\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3"+
		"\34\3\2\2\2\u00b4\u00b5\7+\2\2\u00b5\36\3\2\2\2\u00b6\u00b7\7.\2\2\u00b7"+
		" \3\2\2\2\u00b8\u00b9\7-\2\2\u00b9\"\3\2\2\2\u00ba\u00bb\7/\2\2\u00bb"+
		"$\3\2\2\2\u00bc\u00bd\7,\2\2\u00bd&\3\2\2\2\u00be\u00bf\7\61\2\2\u00bf"+
		"(\3\2\2\2\u00c0\u00c1\7\u0080\2\2\u00c1*\3\2\2\2\u00c2\u00c3\7}\2\2\u00c3"+
		",\3\2\2\2\u00c4\u00c5\7\177\2\2\u00c5.\3\2\2\2\u00c6\u00c7\7\60\2\2\u00c7"+
		"\60\3\2\2\2\u00c8\u00c9\7>\2\2\u00c9\u00ca\7/\2\2\u00ca\62\3\2\2\2\u00cb"+
		"\u00cc\7B\2\2\u00cc\64\3\2\2\2\u00cd\u00ce\7<\2\2\u00ce\66\3\2\2\2\u00cf"+
		"\u00d0\7$\2\2\u00d08\3\2\2\2\u00d1\u00d2\t\f\2\2\u00d2\u00d3\t\b\2\2\u00d3"+
		"\u00d4\t\n\2\2\u00d4\u00d5\t\7\2\2\u00d5:\3\2\2\2\u00d6\u00d7\t\7\2\2"+
		"\u00d7\u00d8\t\n\2\2\u00d8\u00d9\t\b\2\2\u00d9\u00da\t\f\2\2\u00da<\3"+
		"\2\2\2\u00db\u00dc\t\r\2\2\u00dc\u00dd\t\16\2\2\u00dd>\3\2\2\2\u00de\u00df"+
		"\t\16\2\2\u00df\u00e0\t\r\2\2\u00e0@\3\2\2\2\u00e1\u00e2\t\17\2\2\u00e2"+
		"\u00e3\t\20\2\2\u00e3\u00e4\t\r\2\2\u00e4\u00e5\t\t\2\2\u00e5\u00e6\t"+
		"\7\2\2\u00e6B\3\2\2\2\u00e7\u00e8\t\21\2\2\u00e8\u00e9\t\20\2\2\u00e9"+
		"\u00ea\t\7\2\2\u00ea\u00eb\t\22\2\2\u00ebD\3\2\2\2\u00ec\u00ed\t\7\2\2"+
		"\u00ed\u00ee\t\t\2\2\u00ee\u00ef\t\n\2\2\u00ef\u00f0\t\7\2\2\u00f0F\3"+
		"\2\2\2\u00f1\u00f2\t\t\2\2\u00f2\u00f3\t\23\2\2\u00f3\u00f4\t\23\2\2\u00f4"+
		"\u00f5\t\24\2\2\u00f5H\3\2\2\2\u00f6\u00f7\t\24\2\2\u00f7\u00f8\t\23\2"+
		"\2\u00f8\u00f9\t\23\2\2\u00f9\u00fa\t\t\2\2\u00faJ\3\2\2\2\u00fb\u00fc"+
		"\t\f\2\2\u00fc\u00fd\t\t\2\2\u00fd\u00fe\t\b\2\2\u00fe\u00ff\t\n\2\2\u00ff"+
		"\u0100\t\n\2\2\u0100L\3\2\2\2\u0101\u0102\t\r\2\2\u0102\u0103\t\22\2\2"+
		"\u0103N\3\2\2\2\u0104\u0105\t\r\2\2\u0105\u0106\t\20\2\2\u0106\u0107\t"+
		"\7\2\2\u0107\u0108\t\5\2\2\u0108\u0109\t\r\2\2\u0109\u010a\t\21\2\2\u010a"+
		"\u010b\t\n\2\2\u010bP\3\2\2\2\u010c\u010d\t\23\2\2\u010d\u010e\t\16\2"+
		"\2\u010eR\3\2\2\2\u010f\u0110\t\t\2\2\u0110\u0111\t\7\2\2\u0111\u0112"+
		"\t\21\2\2\u0112T\3\2\2\2\u0113\u0114\t\22\2\2\u0114\u0115\t\7\2\2\u0115"+
		"\u0116\t\17\2\2\u0116V\3\2\2\2\u0117\u0118\t\25\2\2\u0118\u0119\t\23\2"+
		"\2\u0119\u011a\t\r\2\2\u011a\u011b\t\26\2\2\u011bX\3\2\2\2\u011c\u011d"+
		"\t\22\2\2\u011d\u011e\t\23\2\2\u011e\u011f\t\21\2\2\u011fZ\3\2\2\2\u0120"+
		"\u0121\t\n\2\2\u0121\u0122\t\21\2\2\u0122\u0123\t\5\2\2\u0123\u0124\t"+
		"\r\2\2\u0124\u0125\t\22\2\2\u0125\u0126\t\27\2\2\u0126\\\3\2\2\2\u0127"+
		"\u0128\t\r\2\2\u0128\u0129\t\22\2\2\u0129\u012a\t\21\2\2\u012a^\3\2\2"+
		"\2\u012b\u0131\5\t\5\2\u012c\u0130\5\t\5\2\u012d\u0130\5\3\2\2\u012e\u0130"+
		"\7a\2\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132`\3\2\2\2"+
		"\u0133\u0131\3\2\2\2\u0134\u0135\13\2\2\2\u0135b\3\2\2\2\r\2hmqt|\u009e"+
		"\u00a0\u00a7\u012f\u0131\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}