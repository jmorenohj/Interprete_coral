// Generated from /home/jose/Documentos/Entrega3Lenguajes/Interprete_coral/grammar/CoralLanguage.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoralLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TKN_ASSIGN=1, TKN_PERIOD=2, TKN_COMMA=3, TKN_SEMICOLON=4, TKN_CLOSING_BRA=5, 
		TKN_OPENING_BRA=6, TKN_CLOSING_PAR=7, TKN_OPENING_PAR=8, TKN_PLUS=9, TKN_MINUS=10, 
		TKN_TIMES=11, TKN_DIV=12, TKN_MOD=13, TKN_EQUAL=14, TKN_NEQ=15, TKN_LESS=16, 
		TKN_LEQ=17, TKN_GREATER=18, TKN_GEQ=19, TKN_QUESTION_MARK=20, GET=21, 
		NEXT=22, INPUT=23, PUT=24, TO=25, OUTPUT=26, IF=27, ELSEIF=28, ELSE=29, 
		WHILE=30, FOR=31, INTEGER=32, FLOAT=33, ARRAY=34, FUNCTION=35, RETURNS=36, 
		SIZE=37, MAIN=38, OR=39, AND=40, NOTHING=41, NOT=42, SRN=43, ABS=44, SQRT=45, 
		POW=46, RAND=47, WITH=48, DECIMAL=49, PLACES=50, TKN_ID=51, TKN_INT=52, 
		TKN_FLOAT=53, TKN_STR=54, ESP=55, LINE_COMMENT=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TKN_ASSIGN", "TKN_PERIOD", "TKN_COMMA", "TKN_SEMICOLON", "TKN_CLOSING_BRA", 
			"TKN_OPENING_BRA", "TKN_CLOSING_PAR", "TKN_OPENING_PAR", "TKN_PLUS", 
			"TKN_MINUS", "TKN_TIMES", "TKN_DIV", "TKN_MOD", "TKN_EQUAL", "TKN_NEQ", 
			"TKN_LESS", "TKN_LEQ", "TKN_GREATER", "TKN_GEQ", "TKN_QUESTION_MARK", 
			"GET", "NEXT", "INPUT", "PUT", "TO", "OUTPUT", "IF", "ELSEIF", "ELSE", 
			"WHILE", "FOR", "INTEGER", "FLOAT", "ARRAY", "FUNCTION", "RETURNS", "SIZE", 
			"MAIN", "OR", "AND", "NOTHING", "NOT", "SRN", "ABS", "SQRT", "POW", "RAND", 
			"WITH", "DECIMAL", "PLACES", "TKN_ID", "TKN_INT", "TKN_FLOAT", "TKN_STR", 
			"ESP", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'.'", "','", "';'", "']'", "'['", "')'", "'('", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'?'", "'Get'", "'next'", "'input'", "'Put'", "'to'", "'output'", "'if'", 
			"'elseif'", "'else'", "'while'", "'for'", "'integer'", "'float'", "'array'", 
			"'Function'", "'returns'", "'size'", "'Main'", "'or'", "'and'", "'nothing'", 
			"'not'", "'SeedRandomNumbers'", "'AbsoluteValue'", "'SquareRoot'", "'RaiseToPower'", 
			"'RandomNumber'", "'with'", "'decimal'", "'places'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TKN_ASSIGN", "TKN_PERIOD", "TKN_COMMA", "TKN_SEMICOLON", "TKN_CLOSING_BRA", 
			"TKN_OPENING_BRA", "TKN_CLOSING_PAR", "TKN_OPENING_PAR", "TKN_PLUS", 
			"TKN_MINUS", "TKN_TIMES", "TKN_DIV", "TKN_MOD", "TKN_EQUAL", "TKN_NEQ", 
			"TKN_LESS", "TKN_LEQ", "TKN_GREATER", "TKN_GEQ", "TKN_QUESTION_MARK", 
			"GET", "NEXT", "INPUT", "PUT", "TO", "OUTPUT", "IF", "ELSEIF", "ELSE", 
			"WHILE", "FOR", "INTEGER", "FLOAT", "ARRAY", "FUNCTION", "RETURNS", "SIZE", 
			"MAIN", "OR", "AND", "NOTHING", "NOT", "SRN", "ABS", "SQRT", "POW", "RAND", 
			"WITH", "DECIMAL", "PLACES", "TKN_ID", "TKN_INT", "TKN_FLOAT", "TKN_STR", 
			"ESP", "LINE_COMMENT"
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


	public CoralLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoralLanguage.g4"; }

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
		"\u0004\u00008\u01a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00012\u00012\u00052\u0171\b2\n2\f2\u0174\t2\u0001"+
		"3\u00043\u0177\b3\u000b3\f3\u0178\u00014\u00044\u017c\b4\u000b4\f4\u017d"+
		"\u00014\u00014\u00014\u00044\u0183\b4\u000b4\f4\u0184\u00034\u0187\b4"+
		"\u00015\u00015\u00055\u018b\b5\n5\f5\u018e\t5\u00016\u00046\u0191\b6\u000b"+
		"6\f6\u0192\u00016\u00016\u00017\u00017\u00017\u00017\u00057\u019b\b7\n"+
		"7\f7\u019e\t7\u00017\u00017\u0000\u00008\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e"+
		"3g4i5k6m7o8\u0001\u0000\u0006\u0002\u0000AZaz\u0004\u000009AZ__az\u0001"+
		"\u000009\u0001\u0000..\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u01a8"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y"+
		"\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000"+
		"\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000"+
		"\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g"+
		"\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000"+
		"\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000"+
		"\u0001q\u0001\u0000\u0000\u0000\u0003s\u0001\u0000\u0000\u0000\u0005u"+
		"\u0001\u0000\u0000\u0000\u0007w\u0001\u0000\u0000\u0000\ty\u0001\u0000"+
		"\u0000\u0000\u000b{\u0001\u0000\u0000\u0000\r}\u0001\u0000\u0000\u0000"+
		"\u000f\u007f\u0001\u0000\u0000\u0000\u0011\u0081\u0001\u0000\u0000\u0000"+
		"\u0013\u0083\u0001\u0000\u0000\u0000\u0015\u0085\u0001\u0000\u0000\u0000"+
		"\u0017\u0087\u0001\u0000\u0000\u0000\u0019\u0089\u0001\u0000\u0000\u0000"+
		"\u001b\u008b\u0001\u0000\u0000\u0000\u001d\u008e\u0001\u0000\u0000\u0000"+
		"\u001f\u0091\u0001\u0000\u0000\u0000!\u0093\u0001\u0000\u0000\u0000#\u0096"+
		"\u0001\u0000\u0000\u0000%\u0098\u0001\u0000\u0000\u0000\'\u009b\u0001"+
		"\u0000\u0000\u0000)\u009d\u0001\u0000\u0000\u0000+\u00a1\u0001\u0000\u0000"+
		"\u0000-\u00a6\u0001\u0000\u0000\u0000/\u00ac\u0001\u0000\u0000\u00001"+
		"\u00b0\u0001\u0000\u0000\u00003\u00b3\u0001\u0000\u0000\u00005\u00ba\u0001"+
		"\u0000\u0000\u00007\u00bd\u0001\u0000\u0000\u00009\u00c4\u0001\u0000\u0000"+
		"\u0000;\u00c9\u0001\u0000\u0000\u0000=\u00cf\u0001\u0000\u0000\u0000?"+
		"\u00d3\u0001\u0000\u0000\u0000A\u00db\u0001\u0000\u0000\u0000C\u00e1\u0001"+
		"\u0000\u0000\u0000E\u00e7\u0001\u0000\u0000\u0000G\u00f0\u0001\u0000\u0000"+
		"\u0000I\u00f8\u0001\u0000\u0000\u0000K\u00fd\u0001\u0000\u0000\u0000M"+
		"\u0102\u0001\u0000\u0000\u0000O\u0105\u0001\u0000\u0000\u0000Q\u0109\u0001"+
		"\u0000\u0000\u0000S\u0111\u0001\u0000\u0000\u0000U\u0115\u0001\u0000\u0000"+
		"\u0000W\u0127\u0001\u0000\u0000\u0000Y\u0135\u0001\u0000\u0000\u0000["+
		"\u0140\u0001\u0000\u0000\u0000]\u014d\u0001\u0000\u0000\u0000_\u015a\u0001"+
		"\u0000\u0000\u0000a\u015f\u0001\u0000\u0000\u0000c\u0167\u0001\u0000\u0000"+
		"\u0000e\u016e\u0001\u0000\u0000\u0000g\u0176\u0001\u0000\u0000\u0000i"+
		"\u017b\u0001\u0000\u0000\u0000k\u0188\u0001\u0000\u0000\u0000m\u0190\u0001"+
		"\u0000\u0000\u0000o\u0196\u0001\u0000\u0000\u0000qr\u0005=\u0000\u0000"+
		"r\u0002\u0001\u0000\u0000\u0000st\u0005.\u0000\u0000t\u0004\u0001\u0000"+
		"\u0000\u0000uv\u0005,\u0000\u0000v\u0006\u0001\u0000\u0000\u0000wx\u0005"+
		";\u0000\u0000x\b\u0001\u0000\u0000\u0000yz\u0005]\u0000\u0000z\n\u0001"+
		"\u0000\u0000\u0000{|\u0005[\u0000\u0000|\f\u0001\u0000\u0000\u0000}~\u0005"+
		")\u0000\u0000~\u000e\u0001\u0000\u0000\u0000\u007f\u0080\u0005(\u0000"+
		"\u0000\u0080\u0010\u0001\u0000\u0000\u0000\u0081\u0082\u0005+\u0000\u0000"+
		"\u0082\u0012\u0001\u0000\u0000\u0000\u0083\u0084\u0005-\u0000\u0000\u0084"+
		"\u0014\u0001\u0000\u0000\u0000\u0085\u0086\u0005*\u0000\u0000\u0086\u0016"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005/\u0000\u0000\u0088\u0018\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005%\u0000\u0000\u008a\u001a\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005=\u0000\u0000\u008c\u008d\u0005=\u0000\u0000"+
		"\u008d\u001c\u0001\u0000\u0000\u0000\u008e\u008f\u0005!\u0000\u0000\u008f"+
		"\u0090\u0005=\u0000\u0000\u0090\u001e\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005<\u0000\u0000\u0092 \u0001\u0000\u0000\u0000\u0093\u0094\u0005<"+
		"\u0000\u0000\u0094\u0095\u0005=\u0000\u0000\u0095\"\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005>\u0000\u0000\u0097$\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005>\u0000\u0000\u0099\u009a\u0005=\u0000\u0000\u009a&\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005?\u0000\u0000\u009c(\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005G\u0000\u0000\u009e\u009f\u0005e\u0000\u0000\u009f"+
		"\u00a0\u0005t\u0000\u0000\u00a0*\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005"+
		"n\u0000\u0000\u00a2\u00a3\u0005e\u0000\u0000\u00a3\u00a4\u0005x\u0000"+
		"\u0000\u00a4\u00a5\u0005t\u0000\u0000\u00a5,\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005i\u0000\u0000\u00a7\u00a8\u0005n\u0000\u0000\u00a8\u00a9\u0005"+
		"p\u0000\u0000\u00a9\u00aa\u0005u\u0000\u0000\u00aa\u00ab\u0005t\u0000"+
		"\u0000\u00ab.\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005P\u0000\u0000\u00ad"+
		"\u00ae\u0005u\u0000\u0000\u00ae\u00af\u0005t\u0000\u0000\u00af0\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005t\u0000\u0000\u00b1\u00b2\u0005o\u0000"+
		"\u0000\u00b22\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005o\u0000\u0000\u00b4"+
		"\u00b5\u0005u\u0000\u0000\u00b5\u00b6\u0005t\u0000\u0000\u00b6\u00b7\u0005"+
		"p\u0000\u0000\u00b7\u00b8\u0005u\u0000\u0000\u00b8\u00b9\u0005t\u0000"+
		"\u0000\u00b94\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005i\u0000\u0000\u00bb"+
		"\u00bc\u0005f\u0000\u0000\u00bc6\u0001\u0000\u0000\u0000\u00bd\u00be\u0005"+
		"e\u0000\u0000\u00be\u00bf\u0005l\u0000\u0000\u00bf\u00c0\u0005s\u0000"+
		"\u0000\u00c0\u00c1\u0005e\u0000\u0000\u00c1\u00c2\u0005i\u0000\u0000\u00c2"+
		"\u00c3\u0005f\u0000\u0000\u00c38\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005"+
		"e\u0000\u0000\u00c5\u00c6\u0005l\u0000\u0000\u00c6\u00c7\u0005s\u0000"+
		"\u0000\u00c7\u00c8\u0005e\u0000\u0000\u00c8:\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0005w\u0000\u0000\u00ca\u00cb\u0005h\u0000\u0000\u00cb\u00cc\u0005"+
		"i\u0000\u0000\u00cc\u00cd\u0005l\u0000\u0000\u00cd\u00ce\u0005e\u0000"+
		"\u0000\u00ce<\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005f\u0000\u0000\u00d0"+
		"\u00d1\u0005o\u0000\u0000\u00d1\u00d2\u0005r\u0000\u0000\u00d2>\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005i\u0000\u0000\u00d4\u00d5\u0005n\u0000"+
		"\u0000\u00d5\u00d6\u0005t\u0000\u0000\u00d6\u00d7\u0005e\u0000\u0000\u00d7"+
		"\u00d8\u0005g\u0000\u0000\u00d8\u00d9\u0005e\u0000\u0000\u00d9\u00da\u0005"+
		"r\u0000\u0000\u00da@\u0001\u0000\u0000\u0000\u00db\u00dc\u0005f\u0000"+
		"\u0000\u00dc\u00dd\u0005l\u0000\u0000\u00dd\u00de\u0005o\u0000\u0000\u00de"+
		"\u00df\u0005a\u0000\u0000\u00df\u00e0\u0005t\u0000\u0000\u00e0B\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0005a\u0000\u0000\u00e2\u00e3\u0005r\u0000"+
		"\u0000\u00e3\u00e4\u0005r\u0000\u0000\u00e4\u00e5\u0005a\u0000\u0000\u00e5"+
		"\u00e6\u0005y\u0000\u0000\u00e6D\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		"F\u0000\u0000\u00e8\u00e9\u0005u\u0000\u0000\u00e9\u00ea\u0005n\u0000"+
		"\u0000\u00ea\u00eb\u0005c\u0000\u0000\u00eb\u00ec\u0005t\u0000\u0000\u00ec"+
		"\u00ed\u0005i\u0000\u0000\u00ed\u00ee\u0005o\u0000\u0000\u00ee\u00ef\u0005"+
		"n\u0000\u0000\u00efF\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005r\u0000"+
		"\u0000\u00f1\u00f2\u0005e\u0000\u0000\u00f2\u00f3\u0005t\u0000\u0000\u00f3"+
		"\u00f4\u0005u\u0000\u0000\u00f4\u00f5\u0005r\u0000\u0000\u00f5\u00f6\u0005"+
		"n\u0000\u0000\u00f6\u00f7\u0005s\u0000\u0000\u00f7H\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0005s\u0000\u0000\u00f9\u00fa\u0005i\u0000\u0000\u00fa"+
		"\u00fb\u0005z\u0000\u0000\u00fb\u00fc\u0005e\u0000\u0000\u00fcJ\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0005M\u0000\u0000\u00fe\u00ff\u0005a\u0000"+
		"\u0000\u00ff\u0100\u0005i\u0000\u0000\u0100\u0101\u0005n\u0000\u0000\u0101"+
		"L\u0001\u0000\u0000\u0000\u0102\u0103\u0005o\u0000\u0000\u0103\u0104\u0005"+
		"r\u0000\u0000\u0104N\u0001\u0000\u0000\u0000\u0105\u0106\u0005a\u0000"+
		"\u0000\u0106\u0107\u0005n\u0000\u0000\u0107\u0108\u0005d\u0000\u0000\u0108"+
		"P\u0001\u0000\u0000\u0000\u0109\u010a\u0005n\u0000\u0000\u010a\u010b\u0005"+
		"o\u0000\u0000\u010b\u010c\u0005t\u0000\u0000\u010c\u010d\u0005h\u0000"+
		"\u0000\u010d\u010e\u0005i\u0000\u0000\u010e\u010f\u0005n\u0000\u0000\u010f"+
		"\u0110\u0005g\u0000\u0000\u0110R\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"n\u0000\u0000\u0112\u0113\u0005o\u0000\u0000\u0113\u0114\u0005t\u0000"+
		"\u0000\u0114T\u0001\u0000\u0000\u0000\u0115\u0116\u0005S\u0000\u0000\u0116"+
		"\u0117\u0005e\u0000\u0000\u0117\u0118\u0005e\u0000\u0000\u0118\u0119\u0005"+
		"d\u0000\u0000\u0119\u011a\u0005R\u0000\u0000\u011a\u011b\u0005a\u0000"+
		"\u0000\u011b\u011c\u0005n\u0000\u0000\u011c\u011d\u0005d\u0000\u0000\u011d"+
		"\u011e\u0005o\u0000\u0000\u011e\u011f\u0005m\u0000\u0000\u011f\u0120\u0005"+
		"N\u0000\u0000\u0120\u0121\u0005u\u0000\u0000\u0121\u0122\u0005m\u0000"+
		"\u0000\u0122\u0123\u0005b\u0000\u0000\u0123\u0124\u0005e\u0000\u0000\u0124"+
		"\u0125\u0005r\u0000\u0000\u0125\u0126\u0005s\u0000\u0000\u0126V\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0005A\u0000\u0000\u0128\u0129\u0005b\u0000"+
		"\u0000\u0129\u012a\u0005s\u0000\u0000\u012a\u012b\u0005o\u0000\u0000\u012b"+
		"\u012c\u0005l\u0000\u0000\u012c\u012d\u0005u\u0000\u0000\u012d\u012e\u0005"+
		"t\u0000\u0000\u012e\u012f\u0005e\u0000\u0000\u012f\u0130\u0005V\u0000"+
		"\u0000\u0130\u0131\u0005a\u0000\u0000\u0131\u0132\u0005l\u0000\u0000\u0132"+
		"\u0133\u0005u\u0000\u0000\u0133\u0134\u0005e\u0000\u0000\u0134X\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0005S\u0000\u0000\u0136\u0137\u0005q\u0000"+
		"\u0000\u0137\u0138\u0005u\u0000\u0000\u0138\u0139\u0005a\u0000\u0000\u0139"+
		"\u013a\u0005r\u0000\u0000\u013a\u013b\u0005e\u0000\u0000\u013b\u013c\u0005"+
		"R\u0000\u0000\u013c\u013d\u0005o\u0000\u0000\u013d\u013e\u0005o\u0000"+
		"\u0000\u013e\u013f\u0005t\u0000\u0000\u013fZ\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0005R\u0000\u0000\u0141\u0142\u0005a\u0000\u0000\u0142\u0143\u0005"+
		"i\u0000\u0000\u0143\u0144\u0005s\u0000\u0000\u0144\u0145\u0005e\u0000"+
		"\u0000\u0145\u0146\u0005T\u0000\u0000\u0146\u0147\u0005o\u0000\u0000\u0147"+
		"\u0148\u0005P\u0000\u0000\u0148\u0149\u0005o\u0000\u0000\u0149\u014a\u0005"+
		"w\u0000\u0000\u014a\u014b\u0005e\u0000\u0000\u014b\u014c\u0005r\u0000"+
		"\u0000\u014c\\\u0001\u0000\u0000\u0000\u014d\u014e\u0005R\u0000\u0000"+
		"\u014e\u014f\u0005a\u0000\u0000\u014f\u0150\u0005n\u0000\u0000\u0150\u0151"+
		"\u0005d\u0000\u0000\u0151\u0152\u0005o\u0000\u0000\u0152\u0153\u0005m"+
		"\u0000\u0000\u0153\u0154\u0005N\u0000\u0000\u0154\u0155\u0005u\u0000\u0000"+
		"\u0155\u0156\u0005m\u0000\u0000\u0156\u0157\u0005b\u0000\u0000\u0157\u0158"+
		"\u0005e\u0000\u0000\u0158\u0159\u0005r\u0000\u0000\u0159^\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0005w\u0000\u0000\u015b\u015c\u0005i\u0000\u0000"+
		"\u015c\u015d\u0005t\u0000\u0000\u015d\u015e\u0005h\u0000\u0000\u015e`"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0005d\u0000\u0000\u0160\u0161\u0005"+
		"e\u0000\u0000\u0161\u0162\u0005c\u0000\u0000\u0162\u0163\u0005i\u0000"+
		"\u0000\u0163\u0164\u0005m\u0000\u0000\u0164\u0165\u0005a\u0000\u0000\u0165"+
		"\u0166\u0005l\u0000\u0000\u0166b\u0001\u0000\u0000\u0000\u0167\u0168\u0005"+
		"p\u0000\u0000\u0168\u0169\u0005l\u0000\u0000\u0169\u016a\u0005a\u0000"+
		"\u0000\u016a\u016b\u0005c\u0000\u0000\u016b\u016c\u0005e\u0000\u0000\u016c"+
		"\u016d\u0005s\u0000\u0000\u016dd\u0001\u0000\u0000\u0000\u016e\u0172\u0007"+
		"\u0000\u0000\u0000\u016f\u0171\u0007\u0001\u0000\u0000\u0170\u016f\u0001"+
		"\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173f\u0001\u0000"+
		"\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0177\u0007\u0002"+
		"\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000"+
		"\u0000\u0000\u0179h\u0001\u0000\u0000\u0000\u017a\u017c\u0007\u0002\u0000"+
		"\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000"+
		"\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000"+
		"\u0000\u017e\u0186\u0001\u0000\u0000\u0000\u017f\u0187\u0001\u0000\u0000"+
		"\u0000\u0180\u0182\u0007\u0003\u0000\u0000\u0181\u0183\u0007\u0002\u0000"+
		"\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000"+
		"\u0000\u0185\u0187\u0001\u0000\u0000\u0000\u0186\u017f\u0001\u0000\u0000"+
		"\u0000\u0186\u0180\u0001\u0000\u0000\u0000\u0187j\u0001\u0000\u0000\u0000"+
		"\u0188\u018c\u0007\u0000\u0000\u0000\u0189\u018b\u0007\u0001\u0000\u0000"+
		"\u018a\u0189\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000"+
		"\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000"+
		"\u018dl\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f"+
		"\u0191\u0007\u0004\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u00066\u0000\u0000\u0195n\u0001\u0000\u0000\u0000\u0196\u0197\u0005"+
		"/\u0000\u0000\u0197\u0198\u0005/\u0000\u0000\u0198\u019c\u0001\u0000\u0000"+
		"\u0000\u0199\u019b\b\u0005\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000"+
		"\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000"+
		"\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u01a0\u00067\u0000\u0000\u01a0"+
		"p\u0001\u0000\u0000\u0000\t\u0000\u0172\u0178\u017d\u0184\u0186\u018c"+
		"\u0192\u019c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}