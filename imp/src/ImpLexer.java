// Generated from Y:/Universita/Linguagg/Class exercises/imp/src/Imp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ImpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAT=1, BOOL=2, STRING=3, PLUS=4, MINUS=5, MUL=6, DIV=7, MOD=8, POW=9, 
		AND=10, OR=11, CONCAT=12, EQQ=13, NEQ=14, LEQ=15, GEQ=16, LT=17, GT=18, 
		NOT=19, IF=20, THEN=21, ELSE=22, WHILE=23, SKIPP=24, ASSIGN=25, OUT=26, 
		TOSTR=27, LPAR=28, RPAR=29, LBRACK=30, RBRACK=31, LBRACE=32, RBRACE=33, 
		SEMICOLON=34, ID=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NAT", "BOOL", "STRING", "STRCHR", "ESC", "POS", "PLUS", "MINUS", "MUL", 
			"DIV", "MOD", "POW", "AND", "OR", "CONCAT", "EQQ", "NEQ", "LEQ", "GEQ", 
			"LT", "GT", "NOT", "IF", "THEN", "ELSE", "WHILE", "SKIPP", "ASSIGN", 
			"OUT", "TOSTR", "LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
			"SEMICOLON", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'mod'", "'^'", "'&'", 
			"'|'", "'.'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'!'", "'if'", 
			"'then'", "'else'", "'while'", "'skip'", "'='", "'out'", "'tostr'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAT", "BOOL", "STRING", "PLUS", "MINUS", "MUL", "DIV", "MOD", 
			"POW", "AND", "OR", "CONCAT", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", 
			"NOT", "IF", "THEN", "ELSE", "WHILE", "SKIPP", "ASSIGN", "OUT", "TOSTR", 
			"LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "SEMICOLON", 
			"ID", "WS"
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


	public ImpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Imp.g4"; }

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
		"\u0004\u0000$\u00df\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000S\b\u0000\n\u0000\f\u0000"+
		"V\t\u0000\u0003\u0000X\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001c\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002g\b\u0002\n\u0002\f"+
		"\u0002j\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003p\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0005\u0005w\b\u0005\n\u0005\f\u0005z\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001%\u0004%\u00d5\b%\u000b%\f%\u00d6\u0001&\u0004&\u00da"+
		"\b&\u000b&\f&\u00db\u0001&\u0001&\u0000\u0000\'\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0000\t\u0000\u000b\u0000\r\u0004\u000f\u0005\u0011"+
		"\u0006\u0013\u0007\u0015\b\u0017\t\u0019\n\u001b\u000b\u001d\f\u001f\r"+
		"!\u000e#\u000f%\u0010\'\u0011)\u0012+\u0013-\u0014/\u00151\u00163\u0017"+
		"5\u00187\u00199\u001a;\u001b=\u001c?\u001dA\u001eC\u001fE G!I\"K#M$\u0001"+
		"\u0000\u0006\u0001\u000019\u0001\u000009\u0004\u0000\n\n\r\r\"\"\\\\\b"+
		"\u0000\"\"\'\'\\\\bbffnnrrtt\u0001\u0000az\u0003\u0000\t\n\r\r  \u00e3"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"+
		"\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"+
		"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"+
		"\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M"+
		"\u0001\u0000\u0000\u0000\u0001W\u0001\u0000\u0000\u0000\u0003b\u0001\u0000"+
		"\u0000\u0000\u0005d\u0001\u0000\u0000\u0000\u0007o\u0001\u0000\u0000\u0000"+
		"\tq\u0001\u0000\u0000\u0000\u000bt\u0001\u0000\u0000\u0000\r{\u0001\u0000"+
		"\u0000\u0000\u000f}\u0001\u0000\u0000\u0000\u0011\u007f\u0001\u0000\u0000"+
		"\u0000\u0013\u0081\u0001\u0000\u0000\u0000\u0015\u0083\u0001\u0000\u0000"+
		"\u0000\u0017\u0087\u0001\u0000\u0000\u0000\u0019\u0089\u0001\u0000\u0000"+
		"\u0000\u001b\u008b\u0001\u0000\u0000\u0000\u001d\u008d\u0001\u0000\u0000"+
		"\u0000\u001f\u008f\u0001\u0000\u0000\u0000!\u0092\u0001\u0000\u0000\u0000"+
		"#\u0095\u0001\u0000\u0000\u0000%\u0098\u0001\u0000\u0000\u0000\'\u009b"+
		"\u0001\u0000\u0000\u0000)\u009d\u0001\u0000\u0000\u0000+\u009f\u0001\u0000"+
		"\u0000\u0000-\u00a1\u0001\u0000\u0000\u0000/\u00a4\u0001\u0000\u0000\u0000"+
		"1\u00a9\u0001\u0000\u0000\u00003\u00ae\u0001\u0000\u0000\u00005\u00b4"+
		"\u0001\u0000\u0000\u00007\u00b9\u0001\u0000\u0000\u00009\u00bb\u0001\u0000"+
		"\u0000\u0000;\u00bf\u0001\u0000\u0000\u0000=\u00c5\u0001\u0000\u0000\u0000"+
		"?\u00c7\u0001\u0000\u0000\u0000A\u00c9\u0001\u0000\u0000\u0000C\u00cb"+
		"\u0001\u0000\u0000\u0000E\u00cd\u0001\u0000\u0000\u0000G\u00cf\u0001\u0000"+
		"\u0000\u0000I\u00d1\u0001\u0000\u0000\u0000K\u00d4\u0001\u0000\u0000\u0000"+
		"M\u00d9\u0001\u0000\u0000\u0000OX\u00050\u0000\u0000PT\u0007\u0000\u0000"+
		"\u0000QS\u0007\u0001\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UX\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WO\u0001\u0000\u0000\u0000"+
		"WP\u0001\u0000\u0000\u0000X\u0002\u0001\u0000\u0000\u0000YZ\u0005t\u0000"+
		"\u0000Z[\u0005r\u0000\u0000[\\\u0005u\u0000\u0000\\c\u0005e\u0000\u0000"+
		"]^\u0005f\u0000\u0000^_\u0005a\u0000\u0000_`\u0005l\u0000\u0000`a\u0005"+
		"s\u0000\u0000ac\u0005e\u0000\u0000bY\u0001\u0000\u0000\u0000b]\u0001\u0000"+
		"\u0000\u0000c\u0004\u0001\u0000\u0000\u0000dh\u0005\"\u0000\u0000eg\u0003"+
		"\u0007\u0003\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000kl\u0005\"\u0000\u0000l\u0006\u0001\u0000"+
		"\u0000\u0000mp\b\u0002\u0000\u0000np\u0003\t\u0004\u0000om\u0001\u0000"+
		"\u0000\u0000on\u0001\u0000\u0000\u0000p\b\u0001\u0000\u0000\u0000qr\u0005"+
		"\\\u0000\u0000rs\u0007\u0003\u0000\u0000s\n\u0001\u0000\u0000\u0000tx"+
		"\u0007\u0000\u0000\u0000uw\u0007\u0001\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y\f\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0005"+
		"+\u0000\u0000|\u000e\u0001\u0000\u0000\u0000}~\u0005-\u0000\u0000~\u0010"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005*\u0000\u0000\u0080\u0012\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005/\u0000\u0000\u0082\u0014\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005m\u0000\u0000\u0084\u0085\u0005o\u0000\u0000"+
		"\u0085\u0086\u0005d\u0000\u0000\u0086\u0016\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005^\u0000\u0000\u0088\u0018\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005&\u0000\u0000\u008a\u001a\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"|\u0000\u0000\u008c\u001c\u0001\u0000\u0000\u0000\u008d\u008e\u0005.\u0000"+
		"\u0000\u008e\u001e\u0001\u0000\u0000\u0000\u008f\u0090\u0005=\u0000\u0000"+
		"\u0090\u0091\u0005=\u0000\u0000\u0091 \u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005!\u0000\u0000\u0093\u0094\u0005=\u0000\u0000\u0094\"\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005<\u0000\u0000\u0096\u0097\u0005=\u0000\u0000"+
		"\u0097$\u0001\u0000\u0000\u0000\u0098\u0099\u0005>\u0000\u0000\u0099\u009a"+
		"\u0005=\u0000\u0000\u009a&\u0001\u0000\u0000\u0000\u009b\u009c\u0005<"+
		"\u0000\u0000\u009c(\u0001\u0000\u0000\u0000\u009d\u009e\u0005>\u0000\u0000"+
		"\u009e*\u0001\u0000\u0000\u0000\u009f\u00a0\u0005!\u0000\u0000\u00a0,"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005i\u0000\u0000\u00a2\u00a3\u0005"+
		"f\u0000\u0000\u00a3.\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005t\u0000"+
		"\u0000\u00a5\u00a6\u0005h\u0000\u0000\u00a6\u00a7\u0005e\u0000\u0000\u00a7"+
		"\u00a8\u0005n\u0000\u0000\u00a80\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"e\u0000\u0000\u00aa\u00ab\u0005l\u0000\u0000\u00ab\u00ac\u0005s\u0000"+
		"\u0000\u00ac\u00ad\u0005e\u0000\u0000\u00ad2\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0005w\u0000\u0000\u00af\u00b0\u0005h\u0000\u0000\u00b0\u00b1\u0005"+
		"i\u0000\u0000\u00b1\u00b2\u0005l\u0000\u0000\u00b2\u00b3\u0005e\u0000"+
		"\u0000\u00b34\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005s\u0000\u0000\u00b5"+
		"\u00b6\u0005k\u0000\u0000\u00b6\u00b7\u0005i\u0000\u0000\u00b7\u00b8\u0005"+
		"p\u0000\u0000\u00b86\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005=\u0000"+
		"\u0000\u00ba8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005o\u0000\u0000\u00bc"+
		"\u00bd\u0005u\u0000\u0000\u00bd\u00be\u0005t\u0000\u0000\u00be:\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0005t\u0000\u0000\u00c0\u00c1\u0005o\u0000"+
		"\u0000\u00c1\u00c2\u0005s\u0000\u0000\u00c2\u00c3\u0005t\u0000\u0000\u00c3"+
		"\u00c4\u0005r\u0000\u0000\u00c4<\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"(\u0000\u0000\u00c6>\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005)\u0000"+
		"\u0000\u00c8@\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005[\u0000\u0000\u00ca"+
		"B\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005]\u0000\u0000\u00ccD\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005{\u0000\u0000\u00ceF\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005}\u0000\u0000\u00d0H\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0005;\u0000\u0000\u00d2J\u0001\u0000\u0000\u0000\u00d3\u00d5\u0007"+
		"\u0004\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7L\u0001\u0000\u0000\u0000\u00d8\u00da\u0007\u0005"+
		"\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0006&\u0000"+
		"\u0000\u00deN\u0001\u0000\u0000\u0000\t\u0000TWbhox\u00d6\u00db\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}