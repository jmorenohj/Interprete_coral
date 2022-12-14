// Generated from /Users/puntored/Desktop/UN/programming_languages/Interprete_coral/grammar/CoralLanguage.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoralLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TKN_ASSIGN=1, TKN_PERIOD=2, TKN_COMMA=3, TKN_SEMICOLON=4, TKN_CLOSING_BRA=5, 
		TKN_OPENING_BRA=6, TKN_CLOSING_PAR=7, TKN_OPENING_PAR=8, TKN_PLUS=9, TKN_MINUS=10, 
		TKN_TIMES=11, TKN_OPENING_CB=12, TKN_CLOSING_CB=13, TKN_DIV=14, TKN_MOD=15, 
		TKN_EQUAL=16, TKN_NEQ=17, TKN_LESS=18, TKN_LEQ=19, TKN_GREATER=20, TKN_GEQ=21, 
		TKN_QUESTION_MARK=22, GET=23, NEXT=24, INPUT=25, PUT=26, TO=27, OUTPUT=28, 
		IF=29, ELSEIF=30, ELSE=31, WHILE=32, FOR=33, INTEGER=34, FLOAT=35, ARRAY=36, 
		FUNCTION=37, RETURNS=38, SIZE=39, MAIN=40, OR=41, AND=42, NOTHING=43, 
		NOT=44, SRN=45, ABS=46, SQRT=47, POW=48, RAND=49, WITH=50, DECIMAL=51, 
		PLACES=52, TKN_ID=53, TKN_INT=54, TKN_FLOAT=55, TKN_STR=56, ESP=57, LINE_COMMENT=58;
	public static final int
		RULE_inicial = 0, RULE_functionchain = 1, RULE_funcion = 2, RULE_main = 3, 
		RULE_returnopt = 4, RULE_type = 5, RULE_params = 6, RULE_params_suffix = 7, 
		RULE_body = 8, RULE_nonempty = 9, RULE_vardeclaration = 10, RULE_arrdeclaration = 11, 
		RULE_arrdeclarationopt = 12, RULE_idcall = 13, RULE_idstuff = 14, RULE_idopt = 15, 
		RULE_dotsize = 16, RULE_arrpos = 17, RULE_arguments = 18, RULE_arguments_suffix = 19, 
		RULE_assignation = 20, RULE_inputstat = 21, RULE_outputstat = 22, RULE_outputopt = 23, 
		RULE_outputending = 24, RULE_ifstatement = 25, RULE_elseifstat = 26, RULE_elsestatement = 27, 
		RULE_whileloop = 28, RULE_forloop = 29, RULE_number = 30, RULE_expression = 31, 
		RULE_expression_suffix = 32, RULE_expression1 = 33, RULE_expression1_suffix = 34, 
		RULE_expression2 = 35, RULE_aritm = 36, RULE_plusneg = 37, RULE_idexpropt = 38, 
		RULE_boolexpr = 39, RULE_boolexpr_suffix = 40, RULE_boolexpr1 = 41, RULE_boolexpr1_suffix = 42, 
		RULE_boolexpr2 = 43, RULE_boolexpr2_suffix = 44, RULE_boolexpr3 = 45, 
		RULE_boolexpr3_suffix = 46, RULE_boolexpr4 = 47, RULE_boolexpr4_suffix = 48, 
		RULE_boolexpr5 = 49, RULE_boolexpr5_suffix = 50, RULE_boolexpr6 = 51, 
		RULE_equals = 52, RULE_comparers = 53, RULE_builtin = 54, RULE_sqrt = 55, 
		RULE_srn = 56, RULE_rdm = 57, RULE_abs = 58, RULE_pow = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicial", "functionchain", "funcion", "main", "returnopt", "type", "params", 
			"params_suffix", "body", "nonempty", "vardeclaration", "arrdeclaration", 
			"arrdeclarationopt", "idcall", "idstuff", "idopt", "dotsize", "arrpos", 
			"arguments", "arguments_suffix", "assignation", "inputstat", "outputstat", 
			"outputopt", "outputending", "ifstatement", "elseifstat", "elsestatement", 
			"whileloop", "forloop", "number", "expression", "expression_suffix", 
			"expression1", "expression1_suffix", "expression2", "aritm", "plusneg", 
			"idexpropt", "boolexpr", "boolexpr_suffix", "boolexpr1", "boolexpr1_suffix", 
			"boolexpr2", "boolexpr2_suffix", "boolexpr3", "boolexpr3_suffix", "boolexpr4", 
			"boolexpr4_suffix", "boolexpr5", "boolexpr5_suffix", "boolexpr6", "equals", 
			"comparers", "builtin", "sqrt", "srn", "rdm", "abs", "pow"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'.'", "','", "';'", "']'", "'['", "')'", "'('", "'+'", 
			"'-'", "'*'", "'{'", "'}'", "'/'", "'%'", "'=='", "'!='", "'<'", "'<='", 
			"'>'", "'>='", "'?'", "'Get'", "'next'", "'input'", "'Put'", "'to'", 
			"'output'", "'if'", "'elseif'", "'else'", "'while'", "'for'", "'integer'", 
			"'float'", "'array'", "'Function'", "'returns'", "'size'", "'Main'", 
			"'or'", "'and'", "'nothing'", "'not'", "'SeedRandomNumbers'", "'AbsoluteValue'", 
			"'SquareRoot'", "'RaiseToPower'", "'RandomNumber'", "'with'", "'decimal'", 
			"'places'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TKN_ASSIGN", "TKN_PERIOD", "TKN_COMMA", "TKN_SEMICOLON", "TKN_CLOSING_BRA", 
			"TKN_OPENING_BRA", "TKN_CLOSING_PAR", "TKN_OPENING_PAR", "TKN_PLUS", 
			"TKN_MINUS", "TKN_TIMES", "TKN_OPENING_CB", "TKN_CLOSING_CB", "TKN_DIV", 
			"TKN_MOD", "TKN_EQUAL", "TKN_NEQ", "TKN_LESS", "TKN_LEQ", "TKN_GREATER", 
			"TKN_GEQ", "TKN_QUESTION_MARK", "GET", "NEXT", "INPUT", "PUT", "TO", 
			"OUTPUT", "IF", "ELSEIF", "ELSE", "WHILE", "FOR", "INTEGER", "FLOAT", 
			"ARRAY", "FUNCTION", "RETURNS", "SIZE", "MAIN", "OR", "AND", "NOTHING", 
			"NOT", "SRN", "ABS", "SQRT", "POW", "RAND", "WITH", "DECIMAL", "PLACES", 
			"TKN_ID", "TKN_INT", "TKN_FLOAT", "TKN_STR", "ESP", "LINE_COMMENT"
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

	@Override
	public String getGrammarFileName() { return "CoralLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoralLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicialContext extends ParserRuleContext {
		public List<TerminalNode> FUNCTION() { return getTokens(CoralLanguageParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(CoralLanguageParser.FUNCTION, i);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public FunctionchainContext functionchain() {
			return getRuleContext(FunctionchainContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public NonemptyContext nonempty() {
			return getRuleContext(NonemptyContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public InicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterInicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitInicial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitInicial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicialContext inicial() throws RecognitionException {
		InicialContext _localctx = new InicialContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicial);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(FUNCTION);
				setState(121);
				funcion();
				setState(122);
				match(FUNCTION);
				setState(123);
				functionchain();
				setState(124);
				main();
				}
				break;
			case TKN_OPENING_PAR:
			case TKN_PLUS:
			case TKN_MINUS:
			case PUT:
			case IF:
			case WHILE:
			case FOR:
			case INTEGER:
			case FLOAT:
			case SRN:
			case ABS:
			case SQRT:
			case POW:
			case RAND:
			case TKN_ID:
			case TKN_INT:
			case TKN_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				nonempty();
				setState(127);
				body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionchainContext extends ParserRuleContext {
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(CoralLanguageParser.FUNCTION, 0); }
		public FunctionchainContext functionchain() {
			return getRuleContext(FunctionchainContext.class,0);
		}
		public FunctionchainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionchain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterFunctionchain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitFunctionchain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitFunctionchain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionchainContext functionchain() throws RecognitionException {
		FunctionchainContext _localctx = new FunctionchainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionchain);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				funcion();
				setState(132);
				match(FUNCTION);
				setState(133);
				functionchain();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode TKN_ID() { return getToken(CoralLanguageParser.TKN_ID, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(CoralLanguageParser.TKN_OPENING_PAR, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(CoralLanguageParser.TKN_CLOSING_PAR, 0); }
		public TerminalNode RETURNS() { return getToken(CoralLanguageParser.RETURNS, 0); }
		public ReturnoptContext returnopt() {
			return getRuleContext(ReturnoptContext.class,0);
		}
		public TerminalNode TKN_OPENING_CB() { return getToken(CoralLanguageParser.TKN_OPENING_CB, 0); }
		public NonemptyContext nonempty() {
			return getRuleContext(NonemptyContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode TKN_CLOSING_CB() { return getToken(CoralLanguageParser.TKN_CLOSING_CB, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(TKN_ID);
			setState(139);
			match(TKN_OPENING_PAR);
			setState(140);
			params();
			setState(141);
			match(TKN_CLOSING_PAR);
			setState(142);
			match(RETURNS);
			setState(143);
			returnopt();
			setState(144);
			match(TKN_OPENING_CB);
			setState(145);
			nonempty();
			setState(146);
			body();
			setState(147);
			match(TKN_CLOSING_CB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CoralLanguageParser.MAIN, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(CoralLanguageParser.TKN_OPENING_PAR, 0); }
		public TerminalNode TKN_CLOSING_PAR() { return getToken(CoralLanguageParser.TKN_CLOSING_PAR, 0); }
		public TerminalNode RETURNS() { return getToken(CoralLanguageParser.RETURNS, 0); }
		public TerminalNode NOTHING() { return getToken(CoralLanguageParser.NOTHING, 0); }
		public TerminalNode TKN_OPENING_CB() { return getToken(CoralLanguageParser.TKN_OPENING_CB, 0); }
		public NonemptyContext nonempty() {
			return getRuleContext(NonemptyContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode TKN_CLOSING_CB() { return getToken(CoralLanguageParser.TKN_CLOSING_CB, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(MAIN);
			setState(150);
			match(TKN_OPENING_PAR);
			setState(151);
			match(TKN_CLOSING_PAR);
			setState(152);
			match(RETURNS);
			setState(153);
			match(NOTHING);
			setState(154);
			match(TKN_OPENING_CB);
			setState(155);
			nonempty();
			setState(156);
			body();
			setState(157);
			match(TKN_CLOSING_CB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnoptContext extends ParserRuleContext {
		public VardeclarationContext vardeclaration() {
			return getRuleContext(VardeclarationContext.class,0);
		}
		public TerminalNode NOTHING() { return getToken(CoralLanguageParser.NOTHING, 0); }
		public ReturnoptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnopt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterReturnopt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitReturnopt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitReturnopt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnoptContext returnopt() throws RecognitionException {
		ReturnoptContext _localctx = new ReturnoptContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnopt);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				vardeclaration();
				}
				break;
			case NOTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(NOTHING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(CoralLanguageParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(CoralLanguageParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TKN_ID() { return getToken(CoralLanguageParser.TKN_ID, 0); }
		public Params_suffixContext params_suffix() {
			return getRuleContext(Params_suffixContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				type();
				setState(166);
				match(TKN_ID);
				setState(167);
				params_suffix();
				}
				break;
			case TKN_CLOSING_PAR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Params_suffixContext extends ParserRuleContext {
		public TerminalNode TKN_COMMA() { return getToken(CoralLanguageParser.TKN_COMMA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TKN_ID() { return getToken(CoralLanguageParser.TKN_ID, 0); }
		public Params_suffixContext params_suffix() {
			return getRuleContext(Params_suffixContext.class,0);
		}
		public Params_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterParams_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitParams_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitParams_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Params_suffixContext params_suffix() throws RecognitionException {
		Params_suffixContext _localctx = new Params_suffixContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params_suffix);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(TKN_COMMA);
				setState(173);
				type();
				setState(174);
				match(TKN_ID);
				setState(175);
				params_suffix();
				}
				break;
			case TKN_CLOSING_PAR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public NonemptyContext nonempty() {
			return getRuleContext(NonemptyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_body);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				nonempty();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonemptyContext extends ParserRuleContext {
		public VardeclarationContext vardeclaration() {
			return getRuleContext(VardeclarationContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public IdcallContext idcall() {
			return getRuleContext(IdcallContext.class,0);
		}
		public OutputstatContext outputstat() {
			return getRuleContext(OutputstatContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public SrnContext srn() {
			return getRuleContext(SrnContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NonemptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonempty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterNonempty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitNonempty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitNonempty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonemptyContext nonempty() throws RecognitionException {
		NonemptyContext _localctx = new NonemptyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nonempty);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				vardeclaration();
				setState(185);
				body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				idcall();
				setState(188);
				body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				outputstat();
				setState(191);
				body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				forloop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				whileloop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				ifstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				srn();
				setState(197);
				body();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrdeclarationContext arrdeclaration() {
			return getRuleContext(ArrdeclarationContext.class,0);
		}
		public TerminalNode TKN_ID() { return getToken(CoralLanguageParser.TKN_ID, 0); }
		public VardeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterVardeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitVardeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitVardeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclarationContext vardeclaration() throws RecognitionException {
		VardeclarationContext _localctx = new VardeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vardeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			type();
			setState(203);
			arrdeclaration();
			setState(204);
			match(TKN_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrdeclarationContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(CoralLanguageParser.ARRAY, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(CoralLanguageParser.TKN_OPENING_PAR, 0); }
		public ArrdeclarationoptContext arrdeclarationopt() {
			return getRuleContext(ArrdeclarationoptContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(CoralLanguageParser.TKN_CLOSING_PAR, 0); }
		public ArrdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterArrdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitArrdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitArrdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrdeclarationContext arrdeclaration() throws RecognitionException {
		ArrdeclarationContext _localctx = new ArrdeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrdeclaration);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(ARRAY);
				setState(207);
				match(TKN_OPENING_PAR);
				setState(208);
				arrdeclarationopt();
				setState(209);
				match(TKN_CLOSING_PAR);
				}
				break;
			case TKN_ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrdeclarationoptContext extends ParserRuleContext {
		public TerminalNode TKN_INT() { return getToken(CoralLanguageParser.TKN_INT, 0); }
		public TerminalNode TKN_QUESTION_MARK() { return getToken(CoralLanguageParser.TKN_QUESTION_MARK, 0); }
		public ArrdeclarationoptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrdeclarationopt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterArrdeclarationopt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitArrdeclarationopt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitArrdeclarationopt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrdeclarationoptContext arrdeclarationopt() throws RecognitionException {
		ArrdeclarationoptContext _localctx = new ArrdeclarationoptContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrdeclarationopt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !(_la==TKN_QUESTION_MARK || _la==TKN_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdcallContext extends ParserRuleContext {
		public IdoptContext idopt() {
			return getRuleContext(IdoptContext.class,0);
		}
		public IdstuffContext idstuff() {
			return getRuleContext(IdstuffContext.class,0);
		}
		public TerminalNode TKN_ID() { return getToken(CoralLanguageParser.TKN_ID, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(CoralLanguageParser.TKN_OPENING_PAR, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(CoralLanguageParser.TKN_CLOSING_PAR, 0); }
		public IdcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterIdcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitIdcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitIdcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdcallContext idcall() throws RecognitionException {
		IdcallContext _localctx = new IdcallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_idcall);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				idopt();
				setState(217);
				idstuff();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(TKN_ID);
				setState(220);
				match(TKN_OPENING_PAR);
				setState(221);
				arguments();
				setState(222);
				match(TKN_CLOSING_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdstuffContext extends ParserRuleContext {
		public TerminalNode TKN_ASSIGN() { return getToken(CoralLanguageParser.TKN_ASSIGN, 0); }
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public IdstuffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idstuff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterIdstuff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitIdstuff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitIdstuff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdstuffContext idstuff() throws RecognitionException {
		IdstuffContext _localctx = new IdstuffContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_idstuff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(TKN_ASSIGN);
			setState(227);
			assignation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdoptContext extends ParserRuleContext {
		public TerminalNode TKN_ID() { return getToken(CoralLanguageParser.TKN_ID, 0); }
		public ArrposContext arrpos() {
			return getRuleContext(ArrposContext.class,0);
		}
		public DotsizeContext dotsize() {
			return getRuleContext(DotsizeContext.class,0);
		}
		public IdoptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idopt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterIdopt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitIdopt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitIdopt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdoptContext idopt() throws RecognitionException {
		IdoptContext _localctx = new IdoptContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_idopt);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(TKN_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(TKN_ID);
				setState(231);
				arrpos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(TKN_ID);
				setState(233);
				dotsize();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotsizeContext extends ParserRuleContext {
		public TerminalNode TKN_PERIOD() { return getToken(CoralLanguageParser.TKN_PERIOD, 0); }
		public TerminalNode SIZE() { return getToken(CoralLanguageParser.SIZE, 0); }
		public DotsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterDotsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitDotsize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitDotsize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotsizeContext dotsize() throws RecognitionException {
		DotsizeContext _localctx = new DotsizeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dotsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(TKN_PERIOD);
			setState(237);
			match(SIZE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrposContext extends ParserRuleContext {
		public TerminalNode TKN_OPENING_BRA() { return getToken(CoralLanguageParser.TKN_OPENING_BRA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TKN_CLOSING_BRA() { return getToken(CoralLanguageParser.TKN_CLOSING_BRA, 0); }
		public ArrposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrpos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterArrpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitArrpos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitArrpos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrposContext arrpos() throws RecognitionException {
		ArrposContext _localctx = new ArrposContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(TKN_OPENING_BRA);
			setState(240);
			expression();
			setState(241);
			match(TKN_CLOSING_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arguments_suffixContext arguments_suffix() {
			return getRuleContext(Arguments_suffixContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arguments);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_OPENING_PAR:
			case TKN_PLUS:
			case TKN_MINUS:
			case ABS:
			case SQRT:
			case POW:
			case RAND:
			case TKN_ID:
			case TKN_INT:
			case TKN_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				expression();
				setState(244);
				arguments_suffix();
				}
				break;
			case TKN_CLOSING_PAR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arguments_suffixContext extends ParserRuleContext {
		public TerminalNode TKN_COMMA() { return getToken(CoralLanguageParser.TKN_COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arguments_suffixContext arguments_suffix() {
			return getRuleContext(Arguments_suffixContext.class,0);
		}
		public Arguments_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterArguments_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitArguments_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitArguments_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arguments_suffixContext arguments_suffix() throws RecognitionException {
		Arguments_suffixContext _localctx = new Arguments_suffixContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arguments_suffix);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(TKN_COMMA);
				setState(250);
				expression();
				setState(251);
				arguments_suffix();
				}
				break;
			case TKN_CLOSING_PAR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InputstatContext inputstat() {
			return getRuleContext(InputstatContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitAssignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitAssignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignation);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_OPENING_PAR:
			case TKN_PLUS:
			case TKN_MINUS:
			case ABS:
			case SQRT:
			case POW:
			case RAND:
			case TKN_ID:
			case TKN_INT:
			case TKN_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				expression();
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				inputstat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputstatContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CoralLanguageParser.GET, 0); }
		public TerminalNode NEXT() { return getToken(CoralLanguageParser.NEXT, 0); }
		public TerminalNode INPUT() { return getToken(CoralLanguageParser.INPUT, 0); }
		public InputstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterInputstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitInputstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitInputstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputstatContext inputstat() throws RecognitionException {
		InputstatContext _localctx = new InputstatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inputstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(GET);
			setState(261);
			match(NEXT);
			setState(262);
			match(INPUT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputstatContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(CoralLanguageParser.PUT, 0); }
		public OutputoptContext outputopt() {
			return getRuleContext(OutputoptContext.class,0);
		}
		public TerminalNode TO() { return getToken(CoralLanguageParser.TO, 0); }
		public TerminalNode OUTPUT() { return getToken(CoralLanguageParser.OUTPUT, 0); }
		public OutputendingContext outputending() {
			return getRuleContext(OutputendingContext.class,0);
		}
		public OutputstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterOutputstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitOutputstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitOutputstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputstatContext outputstat() throws RecognitionException {
		OutputstatContext _localctx = new OutputstatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_outputstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(PUT);
			setState(265);
			outputopt();
			setState(266);
			match(TO);
			setState(267);
			match(OUTPUT);
			setState(268);
			outputending();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputoptContext extends ParserRuleContext {
		public TerminalNode TKN_STR() { return getToken(CoralLanguageParser.TKN_STR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OutputoptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputopt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterOutputopt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitOutputopt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitOutputopt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputoptContext outputopt() throws RecognitionException {
		OutputoptContext _localctx = new OutputoptContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_outputopt);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(TKN_STR);
				}
				break;
			case TKN_OPENING_PAR:
			case TKN_PLUS:
			case TKN_MINUS:
			case ABS:
			case SQRT:
			case POW:
			case RAND:
			case TKN_ID:
			case TKN_INT:
			case TKN_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputendingContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(CoralLanguageParser.WITH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(CoralLanguageParser.DECIMAL, 0); }
		public TerminalNode PLACES() { return getToken(CoralLanguageParser.PLACES, 0); }
		public OutputendingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputending; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterOutputending(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitOutputending(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitOutputending(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputendingContext outputending() throws RecognitionException {
		OutputendingContext _localctx = new OutputendingContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_outputending);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(WITH);
				setState(275);
				expression();
				setState(276);
				match(DECIMAL);
				setState(277);
				match(PLACES);
				}
				break;
			case EOF:
			case TKN_OPENING_PAR:
			case TKN_PLUS:
			case TKN_MINUS:
			case TKN_CLOSING_CB:
			case PUT:
			case IF:
			case ELSE:
			case WHILE:
			case FOR:
			case INTEGER:
			case FLOAT:
			case SRN:
			case ABS:
			case SQRT:
			case POW:
			case RAND:
			case TKN_ID:
			case TKN_INT:
			case TKN_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CoralLanguageParser.IF, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode TKN_OPENING_CB() { return getToken(CoralLanguageParser.TKN_OPENING_CB, 0); }
		public NonemptyContext nonempty() {
			return getRuleContext(NonemptyContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode TKN_CLOSING_CB() { return getToken(CoralLanguageParser.TKN_CLOSING_CB, 0); }
		public ElseifstatContext elseifstat() {
			return getRuleContext(ElseifstatContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(IF);
			setState(283);
			boolexpr();
			setState(284);
			match(TKN_OPENING_CB);
			setState(285);
			nonempty();
			setState(286);
			body();
			setState(287);
			match(TKN_CLOSING_CB);
			setState(288);
			elseifstat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifstatContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(CoralLanguageParser.ELSEIF, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode TKN_OPENING_CB() { return getToken(CoralLanguageParser.TKN_OPENING_CB, 0); }
		public NonemptyContext nonempty() {
			return getRuleContext(NonemptyContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode TKN_CLOSING_CB() { return getToken(CoralLanguageParser.TKN_CLOSING_CB, 0); }
		public ElseifstatContext elseifstat() {
			return getRuleContext(ElseifstatContext.class,0);
		}
		public ElsestatementContext elsestatement() {
			return getRuleContext(ElsestatementContext.class,0);
		}
		public ElseifstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterElseifstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitElseifstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitElseifstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifstatContext elseifstat() throws RecognitionException {
		ElseifstatContext _localctx = new ElseifstatContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_elseifstat);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(ELSEIF);
				setState(291);
				boolexpr();
				setState(292);
				match(TKN_OPENING_CB);
				setState(293);
				nonempty();
				setState(294);
				body();
				setState(295);
				match(TKN_CLOSING_CB);
				setState(296);
				elseifstat();
				setState(297);
				elsestatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				elsestatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsestatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CoralLanguageParser.ELSE, 0); }
		public TerminalNode TKN_OPENING_CB() { return getToken(CoralLanguageParser.TKN_OPENING_CB, 0); }
		public NonemptyContext nonempty() {
			return getRuleContext(NonemptyContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode TKN_CLOSING_CB() { return getToken(CoralLanguageParser.TKN_CLOSING_CB, 0); }
		public ElsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterElsestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitElsestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitElsestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestatementContext elsestatement() throws RecognitionException {
		ElsestatementContext _localctx = new ElsestatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elsestatement);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(ELSE);
				setState(304);
				match(TKN_OPENING_CB);
				setState(305);
				nonempty();
				setState(306);
				body();
				setState(307);
				match(TKN_CLOSING_CB);
				setState(308);
				body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileloopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CoralLanguageParser.WHILE, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode TKN_OPENING_CB() { return getToken(CoralLanguageParser.TKN_OPENING_CB, 0); }
		public NonemptyContext nonempty() {
			return getRuleContext(NonemptyContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode TKN_CLOSING_CB() { return getToken(CoralLanguageParser.TKN_CLOSING_CB, 0); }
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitWhileloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitWhileloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(WHILE);
			setState(314);
			boolexpr();
			setState(315);
			match(TKN_OPENING_CB);
			setState(316);
			nonempty();
			setState(317);
			body();
			setState(318);
			match(TKN_CLOSING_CB);
			setState(319);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CoralLanguageParser.FOR, 0); }
		public List<TerminalNode> TKN_ID() { return getTokens(CoralLanguageParser.TKN_ID); }
		public TerminalNode TKN_ID(int i) {
			return getToken(CoralLanguageParser.TKN_ID, i);
		}
		public List<IdstuffContext> idstuff() {
			return getRuleContexts(IdstuffContext.class);
		}
		public IdstuffContext idstuff(int i) {
			return getRuleContext(IdstuffContext.class,i);
		}
		public List<TerminalNode> TKN_SEMICOLON() { return getTokens(CoralLanguageParser.TKN_SEMICOLON); }
		public TerminalNode TKN_SEMICOLON(int i) {
			return getToken(CoralLanguageParser.TKN_SEMICOLON, i);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode TKN_OPENING_CB() { return getToken(CoralLanguageParser.TKN_OPENING_CB, 0); }
		public NonemptyContext nonempty() {
			return getRuleContext(NonemptyContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode TKN_CLOSING_CB() { return getToken(CoralLanguageParser.TKN_CLOSING_CB, 0); }
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitForloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(FOR);
			setState(322);
			match(TKN_ID);
			setState(323);
			idstuff();
			setState(324);
			match(TKN_SEMICOLON);
			setState(325);
			boolexpr();
			setState(326);
			match(TKN_SEMICOLON);
			setState(327);
			match(TKN_ID);
			setState(328);
			idstuff();
			setState(329);
			match(TKN_OPENING_CB);
			setState(330);
			nonempty();
			setState(331);
			body();
			setState(332);
			match(TKN_CLOSING_CB);
			setState(333);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode TKN_INT() { return getToken(CoralLanguageParser.TKN_INT, 0); }
		public TerminalNode TKN_FLOAT() { return getToken(CoralLanguageParser.TKN_FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !(_la==TKN_INT || _la==TKN_FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Expression_suffixContext expression_suffix() {
			return getRuleContext(Expression_suffixContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			expression1();
			setState(338);
			expression_suffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_suffixContext extends ParserRuleContext {
		public TerminalNode TKN_MINUS() { return getToken(CoralLanguageParser.TKN_MINUS, 0); }
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Expression_suffixContext expression_suffix() {
			return getRuleContext(Expression_suffixContext.class,0);
		}
		public TerminalNode TKN_PLUS() { return getToken(CoralLanguageParser.TKN_PLUS, 0); }
		public Expression_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterExpression_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitExpression_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitExpression_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_suffixContext expression_suffix() throws RecognitionException {
		Expression_suffixContext _localctx = new Expression_suffixContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression_suffix);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(TKN_MINUS);
				setState(341);
				expression1();
				setState(342);
				expression_suffix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(TKN_PLUS);
				setState(345);
				expression1();
				setState(346);
				expression_suffix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression1Context extends ParserRuleContext {
		public PlusnegContext plusneg() {
			return getRuleContext(PlusnegContext.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Expression1_suffixContext expression1_suffix() {
			return getRuleContext(Expression1_suffixContext.class,0);
		}
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		Expression1Context _localctx = new Expression1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_expression1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			plusneg();
			setState(352);
			expression2();
			setState(353);
			expression1_suffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression1_suffixContext extends ParserRuleContext {
		public AritmContext aritm() {
			return getRuleContext(AritmContext.class,0);
		}
		public PlusnegContext plusneg() {
			return getRuleContext(PlusnegContext.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Expression1_suffixContext expression1_suffix() {
			return getRuleContext(Expression1_suffixContext.class,0);
		}
		public Expression1_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterExpression1_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitExpression1_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitExpression1_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression1_suffixContext expression1_suffix() throws RecognitionException {
		Expression1_suffixContext _localctx = new Expression1_suffixContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expression1_suffix);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_TIMES:
			case TKN_DIV:
			case TKN_MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				aritm();
				setState(356);
				plusneg();
				setState(357);
				expression2();
				setState(358);
				expression1_suffix();
				}
				break;
			case EOF:
			case TKN_COMMA:
			case TKN_SEMICOLON:
			case TKN_CLOSING_BRA:
			case TKN_CLOSING_PAR:
			case TKN_OPENING_PAR:
			case TKN_PLUS:
			case TKN_MINUS:
			case TKN_OPENING_CB:
			case TKN_CLOSING_CB:
			case PUT:
			case TO:
			case IF:
			case ELSE:
			case WHILE:
			case FOR:
			case INTEGER:
			case FLOAT:
			case SRN:
			case ABS:
			case SQRT:
			case POW:
			case RAND:
			case DECIMAL:
			case TKN_ID:
			case TKN_INT:
			case TKN_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression2Context extends ParserRuleContext {
		public IdexproptContext idexpropt() {
			return getRuleContext(IdexproptContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode TKN_OPENING_PAR() { return getToken(CoralLanguageParser.TKN_OPENING_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(CoralLanguageParser.TKN_CLOSING_PAR, 0); }
		public BuiltinContext builtin() {
			return getRuleContext(BuiltinContext.class,0);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression2);
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				idexpropt();
				}
				break;
			case TKN_INT:
			case TKN_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				number();
				}
				break;
			case TKN_OPENING_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(TKN_OPENING_PAR);
				setState(366);
				expression();
				setState(367);
				match(TKN_CLOSING_PAR);
				}
				break;
			case ABS:
			case SQRT:
			case POW:
			case RAND:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				builtin();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AritmContext extends ParserRuleContext {
		public TerminalNode TKN_MOD() { return getToken(CoralLanguageParser.TKN_MOD, 0); }
		public TerminalNode TKN_DIV() { return getToken(CoralLanguageParser.TKN_DIV, 0); }
		public TerminalNode TKN_TIMES() { return getToken(CoralLanguageParser.TKN_TIMES, 0); }
		public AritmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterAritm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitAritm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitAritm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AritmContext aritm() throws RecognitionException {
		AritmContext _localctx = new AritmContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_aritm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TKN_TIMES) | (1L << TKN_DIV) | (1L << TKN_MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusnegContext extends ParserRuleContext {
		public TerminalNode TKN_MINUS() { return getToken(CoralLanguageParser.TKN_MINUS, 0); }
		public TerminalNode TKN_PLUS() { return getToken(CoralLanguageParser.TKN_PLUS, 0); }
		public PlusnegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusneg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterPlusneg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitPlusneg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitPlusneg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusnegContext plusneg() throws RecognitionException {
		PlusnegContext _localctx = new PlusnegContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_plusneg);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(TKN_MINUS);
				}
				break;
			case TKN_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(TKN_PLUS);
				}
				break;
			case TKN_OPENING_PAR:
			case NOT:
			case ABS:
			case SQRT:
			case POW:
			case RAND:
			case TKN_ID:
			case TKN_INT:
			case TKN_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdexproptContext extends ParserRuleContext {
		public TerminalNode TKN_ID() { return getToken(CoralLanguageParser.TKN_ID, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(CoralLanguageParser.TKN_OPENING_PAR, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(CoralLanguageParser.TKN_CLOSING_PAR, 0); }
		public IdoptContext idopt() {
			return getRuleContext(IdoptContext.class,0);
		}
		public IdexproptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpropt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterIdexpropt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitIdexpropt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitIdexpropt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdexproptContext idexpropt() throws RecognitionException {
		IdexproptContext _localctx = new IdexproptContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_idexpropt);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(TKN_ID);
				setState(380);
				match(TKN_OPENING_PAR);
				setState(381);
				arguments();
				setState(382);
				match(TKN_CLOSING_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				idopt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolexprContext extends ParserRuleContext {
		public Boolexpr1Context boolexpr1() {
			return getRuleContext(Boolexpr1Context.class,0);
		}
		public Boolexpr_suffixContext boolexpr_suffix() {
			return getRuleContext(Boolexpr_suffixContext.class,0);
		}
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBoolexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBoolexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		BoolexprContext _localctx = new BoolexprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_boolexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			boolexpr1();
			setState(388);
			boolexpr_suffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolexpr_suffixContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(CoralLanguageParser.OR, 0); }
		public Boolexpr1Context boolexpr1() {
			return getRuleContext(Boolexpr1Context.class,0);
		}
		public Boolexpr_suffixContext boolexpr_suffix() {
			return getRuleContext(Boolexpr_suffixContext.class,0);
		}
		public Boolexpr_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBoolexpr_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBoolexpr_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBoolexpr_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr_suffixContext boolexpr_suffix() throws RecognitionException {
		Boolexpr_suffixContext _localctx = new Boolexpr_suffixContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_boolexpr_suffix);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(OR);
				setState(391);
				boolexpr1();
				setState(392);
				boolexpr_suffix();
				}
				break;
			case TKN_SEMICOLON:
			case TKN_CLOSING_PAR:
			case TKN_OPENING_CB:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolexpr1Context extends ParserRuleContext {
		public Boolexpr2Context boolexpr2() {
			return getRuleContext(Boolexpr2Context.class,0);
		}
		public Boolexpr1_suffixContext boolexpr1_suffix() {
			return getRuleContext(Boolexpr1_suffixContext.class,0);
		}
		public Boolexpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBoolexpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBoolexpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBoolexpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr1Context boolexpr1() throws RecognitionException {
		Boolexpr1Context _localctx = new Boolexpr1Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_boolexpr1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			boolexpr2();
			setState(398);
			boolexpr1_suffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolexpr1_suffixContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(CoralLanguageParser.AND, 0); }
		public Boolexpr2Context boolexpr2() {
			return getRuleContext(Boolexpr2Context.class,0);
		}
		public Boolexpr1_suffixContext boolexpr1_suffix() {
			return getRuleContext(Boolexpr1_suffixContext.class,0);
		}
		public Boolexpr1_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr1_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBoolexpr1_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBoolexpr1_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBoolexpr1_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr1_suffixContext boolexpr1_suffix() throws RecognitionException {
		Boolexpr1_suffixContext _localctx = new Boolexpr1_suffixContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_boolexpr1_suffix);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(AND);
				setState(401);
				boolexpr2();
				setState(402);
				boolexpr1_suffix();
				}
				break;
			case TKN_SEMICOLON:
			case TKN_CLOSING_PAR:
			case TKN_OPENING_CB:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolexpr2Context extends ParserRuleContext {
		public Boolexpr3Context boolexpr3() {
			return getRuleContext(Boolexpr3Context.class,0);
		}
		public Boolexpr2_suffixContext boolexpr2_suffix() {
			return getRuleContext(Boolexpr2_suffixContext.class,0);
		}
		public Boolexpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBoolexpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBoolexpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBoolexpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr2Context boolexpr2() throws RecognitionException {
		Boolexpr2Context _localctx = new Boolexpr2Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_boolexpr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			boolexpr3();
			setState(408);
			boolexpr2_suffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolexpr2_suffixContext extends ParserRuleContext {
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public Boolexpr3Context boolexpr3() {
			return getRuleContext(Boolexpr3Context.class,0);
		}
		public Boolexpr2_suffixContext boolexpr2_suffix() {
			return getRuleContext(Boolexpr2_suffixContext.class,0);
		}
		public Boolexpr2_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr2_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBoolexpr2_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBoolexpr2_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBoolexpr2_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr2_suffixContext boolexpr2_suffix() throws RecognitionException {
		Boolexpr2_suffixContext _localctx = new Boolexpr2_suffixContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_boolexpr2_suffix);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_EQUAL:
			case TKN_NEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				equals();
				setState(411);
				boolexpr3();
				setState(412);
				boolexpr2_suffix();
				}
				break;
			case TKN_SEMICOLON:
			case TKN_CLOSING_PAR:
			case TKN_OPENING_CB:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolexpr3Context extends ParserRuleContext {
		public Boolexpr4Context boolexpr4() {
			return getRuleContext(Boolexpr4Context.class,0);
		}
		public Boolexpr3_suffixContext boolexpr3_suffix() {
			return getRuleContext(Boolexpr3_suffixContext.class,0);
		}
		public Boolexpr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBoolexpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBoolexpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBoolexpr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr3Context boolexpr3() throws RecognitionException {
		Boolexpr3Context _localctx = new Boolexpr3Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_boolexpr3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			boolexpr4();
			setState(418);
			boolexpr3_suffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolexpr3_suffixContext extends ParserRuleContext {
		public ComparersContext comparers() {
			return getRuleContext(ComparersContext.class,0);
		}
		public Boolexpr4Context boolexpr4() {
			return getRuleContext(Boolexpr4Context.class,0);
		}
		public Boolexpr3_suffixContext boolexpr3_suffix() {
			return getRuleContext(Boolexpr3_suffixContext.class,0);
		}
		public Boolexpr3_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr3_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBoolexpr3_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBoolexpr3_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBoolexpr3_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr3_suffixContext boolexpr3_suffix() throws RecognitionException {
		Boolexpr3_suffixContext _localctx = new Boolexpr3_suffixContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_boolexpr3_suffix);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_LESS:
			case TKN_LEQ:
			case TKN_GREATER:
			case TKN_GEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				comparers();
				setState(421);
				boolexpr4();
				setState(422);
				boolexpr3_suffix();
				}
				break;
			case TKN_SEMICOLON:
			case TKN_CLOSING_PAR:
			case TKN_OPENING_CB:
			case TKN_EQUAL:
			case TKN_NEQ:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolexpr4Context extends ParserRuleContext {
		public Boolexpr5Context boolexpr5() {
			return getRuleContext(Boolexpr5Context.class,0);
		}
		public Boolexpr4_suffixContext boolexpr4_suffix() {
			return getRuleContext(Boolexpr4_suffixContext.class,0);
		}
		public Boolexpr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBoolexpr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBoolexpr4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBoolexpr4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr4Context boolexpr4() throws RecognitionException {
		Boolexpr4Context _localctx = new Boolexpr4Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_boolexpr4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			boolexpr5();
			setState(428);
			boolexpr4_suffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolexpr4_suffixContext extends ParserRuleContext {
		public TerminalNode TKN_MINUS() { return getToken(CoralLanguageParser.TKN_MINUS, 0); }
		public Boolexpr5Context boolexpr5() {
			return getRuleContext(Boolexpr5Context.class,0);
		}
		public Boolexpr4_suffixContext boolexpr4_suffix() {
			return getRuleContext(Boolexpr4_suffixContext.class,0);
		}
		public TerminalNode TKN_PLUS() { return getToken(CoralLanguageParser.TKN_PLUS, 0); }
		public Boolexpr4_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr4_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBoolexpr4_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBoolexpr4_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBoolexpr4_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr4_suffixContext boolexpr4_suffix() throws RecognitionException {
		Boolexpr4_suffixContext _localctx = new Boolexpr4_suffixContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_boolexpr4_suffix);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(TKN_MINUS);
				setState(431);
				boolexpr5();
				setState(432);
				boolexpr4_suffix();
				}
				break;
			case TKN_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(TKN_PLUS);
				setState(435);
				boolexpr5();
				setState(436);
				boolexpr4_suffix();
				}
				break;
			case TKN_SEMICOLON:
			case TKN_CLOSING_PAR:
			case TKN_OPENING_CB:
			case TKN_EQUAL:
			case TKN_NEQ:
			case TKN_LESS:
			case TKN_LEQ:
			case TKN_GREATER:
			case TKN_GEQ:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolexpr5Context extends ParserRuleContext {
		public PlusnegContext plusneg() {
			return getRuleContext(PlusnegContext.class,0);
		}
		public Boolexpr6Context boolexpr6() {
			return getRuleContext(Boolexpr6Context.class,0);
		}
		public Boolexpr5_suffixContext boolexpr5_suffix() {
			return getRuleContext(Boolexpr5_suffixContext.class,0);
		}
		public Boolexpr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBoolexpr5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBoolexpr5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBoolexpr5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr5Context boolexpr5() throws RecognitionException {
		Boolexpr5Context _localctx = new Boolexpr5Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_boolexpr5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			plusneg();
			setState(442);
			boolexpr6();
			setState(443);
			boolexpr5_suffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolexpr5_suffixContext extends ParserRuleContext {
		public AritmContext aritm() {
			return getRuleContext(AritmContext.class,0);
		}
		public PlusnegContext plusneg() {
			return getRuleContext(PlusnegContext.class,0);
		}
		public Boolexpr6Context boolexpr6() {
			return getRuleContext(Boolexpr6Context.class,0);
		}
		public Boolexpr5_suffixContext boolexpr5_suffix() {
			return getRuleContext(Boolexpr5_suffixContext.class,0);
		}
		public Boolexpr5_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr5_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBoolexpr5_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBoolexpr5_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBoolexpr5_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr5_suffixContext boolexpr5_suffix() throws RecognitionException {
		Boolexpr5_suffixContext _localctx = new Boolexpr5_suffixContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_boolexpr5_suffix);
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_TIMES:
			case TKN_DIV:
			case TKN_MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				aritm();
				setState(446);
				plusneg();
				setState(447);
				boolexpr6();
				setState(448);
				boolexpr5_suffix();
				}
				break;
			case TKN_SEMICOLON:
			case TKN_CLOSING_PAR:
			case TKN_PLUS:
			case TKN_MINUS:
			case TKN_OPENING_CB:
			case TKN_EQUAL:
			case TKN_NEQ:
			case TKN_LESS:
			case TKN_LEQ:
			case TKN_GREATER:
			case TKN_GEQ:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolexpr6Context extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(CoralLanguageParser.NOT, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(CoralLanguageParser.TKN_OPENING_PAR, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(CoralLanguageParser.TKN_CLOSING_PAR, 0); }
		public BuiltinContext builtin() {
			return getRuleContext(BuiltinContext.class,0);
		}
		public IdexproptContext idexpropt() {
			return getRuleContext(IdexproptContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Boolexpr6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBoolexpr6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBoolexpr6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBoolexpr6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr6Context boolexpr6() throws RecognitionException {
		Boolexpr6Context _localctx = new Boolexpr6Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_boolexpr6);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(NOT);
				setState(454);
				match(TKN_OPENING_PAR);
				setState(455);
				boolexpr();
				setState(456);
				match(TKN_CLOSING_PAR);
				}
				break;
			case TKN_OPENING_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(TKN_OPENING_PAR);
				setState(459);
				boolexpr();
				setState(460);
				match(TKN_CLOSING_PAR);
				}
				break;
			case ABS:
			case SQRT:
			case POW:
			case RAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				builtin();
				}
				break;
			case TKN_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				idexpropt();
				}
				break;
			case TKN_INT:
			case TKN_FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(464);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualsContext extends ParserRuleContext {
		public TerminalNode TKN_EQUAL() { return getToken(CoralLanguageParser.TKN_EQUAL, 0); }
		public TerminalNode TKN_NEQ() { return getToken(CoralLanguageParser.TKN_NEQ, 0); }
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_equals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !(_la==TKN_EQUAL || _la==TKN_NEQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparersContext extends ParserRuleContext {
		public TerminalNode TKN_LESS() { return getToken(CoralLanguageParser.TKN_LESS, 0); }
		public TerminalNode TKN_LEQ() { return getToken(CoralLanguageParser.TKN_LEQ, 0); }
		public TerminalNode TKN_GREATER() { return getToken(CoralLanguageParser.TKN_GREATER, 0); }
		public TerminalNode TKN_GEQ() { return getToken(CoralLanguageParser.TKN_GEQ, 0); }
		public ComparersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterComparers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitComparers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitComparers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparersContext comparers() throws RecognitionException {
		ComparersContext _localctx = new ComparersContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_comparers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TKN_LESS) | (1L << TKN_LEQ) | (1L << TKN_GREATER) | (1L << TKN_GEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuiltinContext extends ParserRuleContext {
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public RdmContext rdm() {
			return getRuleContext(RdmContext.class,0);
		}
		public AbsContext abs() {
			return getRuleContext(AbsContext.class,0);
		}
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public BuiltinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterBuiltin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitBuiltin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitBuiltin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltinContext builtin() throws RecognitionException {
		BuiltinContext _localctx = new BuiltinContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_builtin);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRT:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				sqrt();
				}
				break;
			case RAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				rdm();
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				abs();
				}
				break;
			case POW:
				enterOuterAlt(_localctx, 4);
				{
				setState(474);
				pow();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqrtContext extends ParserRuleContext {
		public TerminalNode SQRT() { return getToken(CoralLanguageParser.SQRT, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(CoralLanguageParser.TKN_OPENING_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(CoralLanguageParser.TKN_CLOSING_PAR, 0); }
		public SqrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterSqrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitSqrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitSqrt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqrtContext sqrt() throws RecognitionException {
		SqrtContext _localctx = new SqrtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(SQRT);
			setState(478);
			match(TKN_OPENING_PAR);
			setState(479);
			expression();
			setState(480);
			match(TKN_CLOSING_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SrnContext extends ParserRuleContext {
		public TerminalNode SRN() { return getToken(CoralLanguageParser.SRN, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(CoralLanguageParser.TKN_OPENING_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(CoralLanguageParser.TKN_CLOSING_PAR, 0); }
		public SrnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_srn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterSrn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitSrn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitSrn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SrnContext srn() throws RecognitionException {
		SrnContext _localctx = new SrnContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_srn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(SRN);
			setState(483);
			match(TKN_OPENING_PAR);
			setState(484);
			expression();
			setState(485);
			match(TKN_CLOSING_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RdmContext extends ParserRuleContext {
		public TerminalNode RAND() { return getToken(CoralLanguageParser.RAND, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(CoralLanguageParser.TKN_OPENING_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TKN_COMMA() { return getToken(CoralLanguageParser.TKN_COMMA, 0); }
		public TerminalNode TKN_CLOSING_PAR() { return getToken(CoralLanguageParser.TKN_CLOSING_PAR, 0); }
		public RdmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterRdm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitRdm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitRdm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RdmContext rdm() throws RecognitionException {
		RdmContext _localctx = new RdmContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_rdm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(RAND);
			setState(488);
			match(TKN_OPENING_PAR);
			setState(489);
			expression();
			setState(490);
			match(TKN_COMMA);
			setState(491);
			expression();
			setState(492);
			match(TKN_CLOSING_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbsContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(CoralLanguageParser.ABS, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(CoralLanguageParser.TKN_OPENING_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TKN_CLOSING_PAR() { return getToken(CoralLanguageParser.TKN_CLOSING_PAR, 0); }
		public AbsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterAbs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitAbs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitAbs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsContext abs() throws RecognitionException {
		AbsContext _localctx = new AbsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_abs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(ABS);
			setState(495);
			match(TKN_OPENING_PAR);
			setState(496);
			expression();
			setState(497);
			match(TKN_CLOSING_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowContext extends ParserRuleContext {
		public TerminalNode POW() { return getToken(CoralLanguageParser.POW, 0); }
		public TerminalNode TKN_OPENING_PAR() { return getToken(CoralLanguageParser.TKN_OPENING_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TKN_COMMA() { return getToken(CoralLanguageParser.TKN_COMMA, 0); }
		public TerminalNode TKN_CLOSING_PAR() { return getToken(CoralLanguageParser.TKN_CLOSING_PAR, 0); }
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoralLanguageListener ) ((CoralLanguageListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoralLanguageVisitor ) return ((CoralLanguageVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_pow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(POW);
			setState(500);
			match(TKN_OPENING_PAR);
			setState(501);
			expression();
			setState(502);
			match(TKN_COMMA);
			setState(503);
			expression();
			setState(504);
			match(TKN_CLOSING_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u01fb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0082\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0089\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00a2"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00ab\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b3\b\u0007\u0001"+
		"\b\u0001\b\u0003\b\u00b7\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00c9\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00d5\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00e1\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00eb\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00f8\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00ff\b\u0013\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0103\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0111\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0119\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u012e\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0138"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u015e\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u016a"+
		"\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0173\b#"+
		"\u0001$\u0001$\u0001%\u0001%\u0001%\u0003%\u017a\b%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u0182\b&\u0001\'\u0001\'\u0001\'\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0003(\u018c\b(\u0001)\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0003*\u0196\b*\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0003,\u01a0\b,\u0001-\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0003.\u01aa\b.\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u01b8"+
		"\b0\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u01c4\b2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u01d2\b3\u00014\u00014\u00015\u0001"+
		"5\u00016\u00016\u00016\u00016\u00036\u01dc\b6\u00017\u00017\u00017\u0001"+
		"7\u00017\u00018\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0000\u0000<\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\u0000\u0006\u0001\u0000\""+
		"#\u0002\u0000\u0016\u001666\u0001\u000067\u0002\u0000\u000b\u000b\u000e"+
		"\u000f\u0001\u0000\u0010\u0011\u0001\u0000\u0012\u0015\u01ee\u0000\u0081"+
		"\u0001\u0000\u0000\u0000\u0002\u0088\u0001\u0000\u0000\u0000\u0004\u008a"+
		"\u0001\u0000\u0000\u0000\u0006\u0095\u0001\u0000\u0000\u0000\b\u00a1\u0001"+
		"\u0000\u0000\u0000\n\u00a3\u0001\u0000\u0000\u0000\f\u00aa\u0001\u0000"+
		"\u0000\u0000\u000e\u00b2\u0001\u0000\u0000\u0000\u0010\u00b6\u0001\u0000"+
		"\u0000\u0000\u0012\u00c8\u0001\u0000\u0000\u0000\u0014\u00ca\u0001\u0000"+
		"\u0000\u0000\u0016\u00d4\u0001\u0000\u0000\u0000\u0018\u00d6\u0001\u0000"+
		"\u0000\u0000\u001a\u00e0\u0001\u0000\u0000\u0000\u001c\u00e2\u0001\u0000"+
		"\u0000\u0000\u001e\u00ea\u0001\u0000\u0000\u0000 \u00ec\u0001\u0000\u0000"+
		"\u0000\"\u00ef\u0001\u0000\u0000\u0000$\u00f7\u0001\u0000\u0000\u0000"+
		"&\u00fe\u0001\u0000\u0000\u0000(\u0102\u0001\u0000\u0000\u0000*\u0104"+
		"\u0001\u0000\u0000\u0000,\u0108\u0001\u0000\u0000\u0000.\u0110\u0001\u0000"+
		"\u0000\u00000\u0118\u0001\u0000\u0000\u00002\u011a\u0001\u0000\u0000\u0000"+
		"4\u012d\u0001\u0000\u0000\u00006\u0137\u0001\u0000\u0000\u00008\u0139"+
		"\u0001\u0000\u0000\u0000:\u0141\u0001\u0000\u0000\u0000<\u014f\u0001\u0000"+
		"\u0000\u0000>\u0151\u0001\u0000\u0000\u0000@\u015d\u0001\u0000\u0000\u0000"+
		"B\u015f\u0001\u0000\u0000\u0000D\u0169\u0001\u0000\u0000\u0000F\u0172"+
		"\u0001\u0000\u0000\u0000H\u0174\u0001\u0000\u0000\u0000J\u0179\u0001\u0000"+
		"\u0000\u0000L\u0181\u0001\u0000\u0000\u0000N\u0183\u0001\u0000\u0000\u0000"+
		"P\u018b\u0001\u0000\u0000\u0000R\u018d\u0001\u0000\u0000\u0000T\u0195"+
		"\u0001\u0000\u0000\u0000V\u0197\u0001\u0000\u0000\u0000X\u019f\u0001\u0000"+
		"\u0000\u0000Z\u01a1\u0001\u0000\u0000\u0000\\\u01a9\u0001\u0000\u0000"+
		"\u0000^\u01ab\u0001\u0000\u0000\u0000`\u01b7\u0001\u0000\u0000\u0000b"+
		"\u01b9\u0001\u0000\u0000\u0000d\u01c3\u0001\u0000\u0000\u0000f\u01d1\u0001"+
		"\u0000\u0000\u0000h\u01d3\u0001\u0000\u0000\u0000j\u01d5\u0001\u0000\u0000"+
		"\u0000l\u01db\u0001\u0000\u0000\u0000n\u01dd\u0001\u0000\u0000\u0000p"+
		"\u01e2\u0001\u0000\u0000\u0000r\u01e7\u0001\u0000\u0000\u0000t\u01ee\u0001"+
		"\u0000\u0000\u0000v\u01f3\u0001\u0000\u0000\u0000xy\u0005%\u0000\u0000"+
		"yz\u0003\u0004\u0002\u0000z{\u0005%\u0000\u0000{|\u0003\u0002\u0001\u0000"+
		"|}\u0003\u0006\u0003\u0000}\u0082\u0001\u0000\u0000\u0000~\u007f\u0003"+
		"\u0012\t\u0000\u007f\u0080\u0003\u0010\b\u0000\u0080\u0082\u0001\u0000"+
		"\u0000\u0000\u0081x\u0001\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000"+
		"\u0082\u0001\u0001\u0000\u0000\u0000\u0083\u0084\u0003\u0004\u0002\u0000"+
		"\u0084\u0085\u0005%\u0000\u0000\u0085\u0086\u0003\u0002\u0001\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088"+
		"\u0083\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u0003\u0001\u0000\u0000\u0000\u008a\u008b\u00055\u0000\u0000\u008b\u008c"+
		"\u0005\b\u0000\u0000\u008c\u008d\u0003\f\u0006\u0000\u008d\u008e\u0005"+
		"\u0007\u0000\u0000\u008e\u008f\u0005&\u0000\u0000\u008f\u0090\u0003\b"+
		"\u0004\u0000\u0090\u0091\u0005\f\u0000\u0000\u0091\u0092\u0003\u0012\t"+
		"\u0000\u0092\u0093\u0003\u0010\b\u0000\u0093\u0094\u0005\r\u0000\u0000"+
		"\u0094\u0005\u0001\u0000\u0000\u0000\u0095\u0096\u0005(\u0000\u0000\u0096"+
		"\u0097\u0005\b\u0000\u0000\u0097\u0098\u0005\u0007\u0000\u0000\u0098\u0099"+
		"\u0005&\u0000\u0000\u0099\u009a\u0005+\u0000\u0000\u009a\u009b\u0005\f"+
		"\u0000\u0000\u009b\u009c\u0003\u0012\t\u0000\u009c\u009d\u0003\u0010\b"+
		"\u0000\u009d\u009e\u0005\r\u0000\u0000\u009e\u0007\u0001\u0000\u0000\u0000"+
		"\u009f\u00a2\u0003\u0014\n\u0000\u00a0\u00a2\u0005+\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\t\u0001\u0000\u0000\u0000\u00a3\u00a4\u0007\u0000\u0000\u0000\u00a4\u000b"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003\n\u0005\u0000\u00a6\u00a7\u0005"+
		"5\u0000\u0000\u00a7\u00a8\u0003\u000e\u0007\u0000\u00a8\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a5\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\r\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005\u0003\u0000\u0000\u00ad\u00ae\u0003\n\u0005\u0000"+
		"\u00ae\u00af\u00055\u0000\u0000\u00af\u00b0\u0003\u000e\u0007\u0000\u00b0"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3"+
		"\u000f\u0001\u0000\u0000\u0000\u00b4\u00b7\u0003\u0012\t\u0000\u00b5\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b7\u0011\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0003\u0014\n\u0000\u00b9\u00ba\u0003\u0010\b\u0000\u00ba\u00c9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0003\u001a\r\u0000\u00bc\u00bd\u0003\u0010"+
		"\b\u0000\u00bd\u00c9\u0001\u0000\u0000\u0000\u00be\u00bf\u0003,\u0016"+
		"\u0000\u00bf\u00c0\u0003\u0010\b\u0000\u00c0\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c9\u0003:\u001d\u0000\u00c2\u00c9\u00038\u001c\u0000\u00c3\u00c9"+
		"\u00032\u0019\u0000\u00c4\u00c5\u0003p8\u0000\u00c5\u00c6\u0003\u0010"+
		"\b\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c9\u0003>\u001f"+
		"\u0000\u00c8\u00b8\u0001\u0000\u0000\u0000\u00c8\u00bb\u0001\u0000\u0000"+
		"\u0000\u00c8\u00be\u0001\u0000\u0000\u0000\u00c8\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c2\u0001\u0000\u0000\u0000\u00c8\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u0013\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003\n\u0005\u0000"+
		"\u00cb\u00cc\u0003\u0016\u000b\u0000\u00cc\u00cd\u00055\u0000\u0000\u00cd"+
		"\u0015\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005$\u0000\u0000\u00cf\u00d0"+
		"\u0005\b\u0000\u0000\u00d0\u00d1\u0003\u0018\f\u0000\u00d1\u00d2\u0005"+
		"\u0007\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d4\u00ce\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u0017\u0001\u0000\u0000\u0000\u00d6\u00d7\u0007"+
		"\u0001\u0000\u0000\u00d7\u0019\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003"+
		"\u001e\u000f\u0000\u00d9\u00da\u0003\u001c\u000e\u0000\u00da\u00e1\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u00055\u0000\u0000\u00dc\u00dd\u0005\b"+
		"\u0000\u0000\u00dd\u00de\u0003$\u0012\u0000\u00de\u00df\u0005\u0007\u0000"+
		"\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00d8\u0001\u0000\u0000"+
		"\u0000\u00e0\u00db\u0001\u0000\u0000\u0000\u00e1\u001b\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0005\u0001\u0000\u0000\u00e3\u00e4\u0003(\u0014\u0000"+
		"\u00e4\u001d\u0001\u0000\u0000\u0000\u00e5\u00eb\u00055\u0000\u0000\u00e6"+
		"\u00e7\u00055\u0000\u0000\u00e7\u00eb\u0003\"\u0011\u0000\u00e8\u00e9"+
		"\u00055\u0000\u0000\u00e9\u00eb\u0003 \u0010\u0000\u00ea\u00e5\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e6\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000"+
		"\u0000\u0000\u00eb\u001f\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0002"+
		"\u0000\u0000\u00ed\u00ee\u0005\'\u0000\u0000\u00ee!\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005\u0006\u0000\u0000\u00f0\u00f1\u0003>\u001f\u0000"+
		"\u00f1\u00f2\u0005\u0005\u0000\u0000\u00f2#\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0003>\u001f\u0000\u00f4\u00f5\u0003&\u0013\u0000\u00f5\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8%\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0005\u0003\u0000\u0000\u00fa\u00fb\u0003>\u001f"+
		"\u0000\u00fb\u00fc\u0003&\u0013\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000"+
		"\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\'\u0001\u0000\u0000\u0000\u0100"+
		"\u0103\u0003>\u001f\u0000\u0101\u0103\u0003*\u0015\u0000\u0102\u0100\u0001"+
		"\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103)\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0005\u0017\u0000\u0000\u0105\u0106\u0005\u0018"+
		"\u0000\u0000\u0106\u0107\u0005\u0019\u0000\u0000\u0107+\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0005\u001a\u0000\u0000\u0109\u010a\u0003.\u0017\u0000"+
		"\u010a\u010b\u0005\u001b\u0000\u0000\u010b\u010c\u0005\u001c\u0000\u0000"+
		"\u010c\u010d\u00030\u0018\u0000\u010d-\u0001\u0000\u0000\u0000\u010e\u0111"+
		"\u00058\u0000\u0000\u010f\u0111\u0003>\u001f\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111/\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u00052\u0000\u0000\u0113\u0114\u0003>\u001f\u0000\u0114"+
		"\u0115\u00053\u0000\u0000\u0115\u0116\u00054\u0000\u0000\u0116\u0119\u0001"+
		"\u0000\u0000\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0112\u0001"+
		"\u0000\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u01191\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0005\u001d\u0000\u0000\u011b\u011c\u0003N\'"+
		"\u0000\u011c\u011d\u0005\f\u0000\u0000\u011d\u011e\u0003\u0012\t\u0000"+
		"\u011e\u011f\u0003\u0010\b\u0000\u011f\u0120\u0005\r\u0000\u0000\u0120"+
		"\u0121\u00034\u001a\u0000\u01213\u0001\u0000\u0000\u0000\u0122\u0123\u0005"+
		"\u001e\u0000\u0000\u0123\u0124\u0003N\'\u0000\u0124\u0125\u0005\f\u0000"+
		"\u0000\u0125\u0126\u0003\u0012\t\u0000\u0126\u0127\u0003\u0010\b\u0000"+
		"\u0127\u0128\u0005\r\u0000\u0000\u0128\u0129\u00034\u001a\u0000\u0129"+
		"\u012a\u00036\u001b\u0000\u012a\u012e\u0001\u0000\u0000\u0000\u012b\u012e"+
		"\u00036\u001b\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u0122\u0001"+
		"\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012c\u0001"+
		"\u0000\u0000\u0000\u012e5\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u001f"+
		"\u0000\u0000\u0130\u0131\u0005\f\u0000\u0000\u0131\u0132\u0003\u0012\t"+
		"\u0000\u0132\u0133\u0003\u0010\b\u0000\u0133\u0134\u0005\r\u0000\u0000"+
		"\u0134\u0135\u0003\u0010\b\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136"+
		"\u0138\u0001\u0000\u0000\u0000\u0137\u012f\u0001\u0000\u0000\u0000\u0137"+
		"\u0136\u0001\u0000\u0000\u0000\u01387\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0005 \u0000\u0000\u013a\u013b\u0003N\'\u0000\u013b\u013c\u0005\f\u0000"+
		"\u0000\u013c\u013d\u0003\u0012\t\u0000\u013d\u013e\u0003\u0010\b\u0000"+
		"\u013e\u013f\u0005\r\u0000\u0000\u013f\u0140\u0003\u0010\b\u0000\u0140"+
		"9\u0001\u0000\u0000\u0000\u0141\u0142\u0005!\u0000\u0000\u0142\u0143\u0005"+
		"5\u0000\u0000\u0143\u0144\u0003\u001c\u000e\u0000\u0144\u0145\u0005\u0004"+
		"\u0000\u0000\u0145\u0146\u0003N\'\u0000\u0146\u0147\u0005\u0004\u0000"+
		"\u0000\u0147\u0148\u00055\u0000\u0000\u0148\u0149\u0003\u001c\u000e\u0000"+
		"\u0149\u014a\u0005\f\u0000\u0000\u014a\u014b\u0003\u0012\t\u0000\u014b"+
		"\u014c\u0003\u0010\b\u0000\u014c\u014d\u0005\r\u0000\u0000\u014d\u014e"+
		"\u0003\u0010\b\u0000\u014e;\u0001\u0000\u0000\u0000\u014f\u0150\u0007"+
		"\u0002\u0000\u0000\u0150=\u0001\u0000\u0000\u0000\u0151\u0152\u0003B!"+
		"\u0000\u0152\u0153\u0003@ \u0000\u0153?\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0005\n\u0000\u0000\u0155\u0156\u0003B!\u0000\u0156\u0157\u0003"+
		"@ \u0000\u0157\u015e\u0001\u0000\u0000\u0000\u0158\u0159\u0005\t\u0000"+
		"\u0000\u0159\u015a\u0003B!\u0000\u015a\u015b\u0003@ \u0000\u015b\u015e"+
		"\u0001\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u0154"+
		"\u0001\u0000\u0000\u0000\u015d\u0158\u0001\u0000\u0000\u0000\u015d\u015c"+
		"\u0001\u0000\u0000\u0000\u015eA\u0001\u0000\u0000\u0000\u015f\u0160\u0003"+
		"J%\u0000\u0160\u0161\u0003F#\u0000\u0161\u0162\u0003D\"\u0000\u0162C\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0003H$\u0000\u0164\u0165\u0003J%\u0000"+
		"\u0165\u0166\u0003F#\u0000\u0166\u0167\u0003D\"\u0000\u0167\u016a\u0001"+
		"\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u0163\u0001"+
		"\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016aE\u0001\u0000"+
		"\u0000\u0000\u016b\u0173\u0003L&\u0000\u016c\u0173\u0003<\u001e\u0000"+
		"\u016d\u016e\u0005\b\u0000\u0000\u016e\u016f\u0003>\u001f\u0000\u016f"+
		"\u0170\u0005\u0007\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171"+
		"\u0173\u0003l6\u0000\u0172\u016b\u0001\u0000\u0000\u0000\u0172\u016c\u0001"+
		"\u0000\u0000\u0000\u0172\u016d\u0001\u0000\u0000\u0000\u0172\u0171\u0001"+
		"\u0000\u0000\u0000\u0173G\u0001\u0000\u0000\u0000\u0174\u0175\u0007\u0003"+
		"\u0000\u0000\u0175I\u0001\u0000\u0000\u0000\u0176\u017a\u0005\n\u0000"+
		"\u0000\u0177\u017a\u0005\t\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000"+
		"\u0179\u0176\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000"+
		"\u0179\u0178\u0001\u0000\u0000\u0000\u017aK\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u00055\u0000\u0000\u017c\u017d\u0005\b\u0000\u0000\u017d\u017e"+
		"\u0003$\u0012\u0000\u017e\u017f\u0005\u0007\u0000\u0000\u017f\u0182\u0001"+
		"\u0000\u0000\u0000\u0180\u0182\u0003\u001e\u000f\u0000\u0181\u017b\u0001"+
		"\u0000\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182M\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0003R)\u0000\u0184\u0185\u0003P(\u0000\u0185"+
		"O\u0001\u0000\u0000\u0000\u0186\u0187\u0005)\u0000\u0000\u0187\u0188\u0003"+
		"R)\u0000\u0188\u0189\u0003P(\u0000\u0189\u018c\u0001\u0000\u0000\u0000"+
		"\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0186\u0001\u0000\u0000\u0000"+
		"\u018b\u018a\u0001\u0000\u0000\u0000\u018cQ\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0003V+\u0000\u018e\u018f\u0003T*\u0000\u018fS\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0005*\u0000\u0000\u0191\u0192\u0003V+\u0000\u0192"+
		"\u0193\u0003T*\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0196\u0001"+
		"\u0000\u0000\u0000\u0195\u0190\u0001\u0000\u0000\u0000\u0195\u0194\u0001"+
		"\u0000\u0000\u0000\u0196U\u0001\u0000\u0000\u0000\u0197\u0198\u0003Z-"+
		"\u0000\u0198\u0199\u0003X,\u0000\u0199W\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0003h4\u0000\u019b\u019c\u0003Z-\u0000\u019c\u019d\u0003X,\u0000"+
		"\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u01a0\u0001\u0000\u0000\u0000"+
		"\u019f\u019a\u0001\u0000\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000"+
		"\u01a0Y\u0001\u0000\u0000\u0000\u01a1\u01a2\u0003^/\u0000\u01a2\u01a3"+
		"\u0003\\.\u0000\u01a3[\u0001\u0000\u0000\u0000\u01a4\u01a5\u0003j5\u0000"+
		"\u01a5\u01a6\u0003^/\u0000\u01a6\u01a7\u0003\\.\u0000\u01a7\u01aa\u0001"+
		"\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa]\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0003b1\u0000\u01ac\u01ad\u0003`0\u0000\u01ad"+
		"_\u0001\u0000\u0000\u0000\u01ae\u01af\u0005\n\u0000\u0000\u01af\u01b0"+
		"\u0003b1\u0000\u01b0\u01b1\u0003`0\u0000\u01b1\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0005\t\u0000\u0000\u01b3\u01b4\u0003b1\u0000\u01b4"+
		"\u01b5\u0003`0\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b7\u01ae\u0001\u0000\u0000\u0000\u01b7\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8a\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0003J%\u0000\u01ba\u01bb\u0003f3\u0000\u01bb"+
		"\u01bc\u0003d2\u0000\u01bcc\u0001\u0000\u0000\u0000\u01bd\u01be\u0003"+
		"H$\u0000\u01be\u01bf\u0003J%\u0000\u01bf\u01c0\u0003f3\u0000\u01c0\u01c1"+
		"\u0003d2\u0000\u01c1\u01c4\u0001\u0000\u0000\u0000\u01c2\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c3\u01bd\u0001\u0000\u0000\u0000\u01c3\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c4e\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005,\u0000\u0000"+
		"\u01c6\u01c7\u0005\b\u0000\u0000\u01c7\u01c8\u0003N\'\u0000\u01c8\u01c9"+
		"\u0005\u0007\u0000\u0000\u01c9\u01d2\u0001\u0000\u0000\u0000\u01ca\u01cb"+
		"\u0005\b\u0000\u0000\u01cb\u01cc\u0003N\'\u0000\u01cc\u01cd\u0005\u0007"+
		"\u0000\u0000\u01cd\u01d2\u0001\u0000\u0000\u0000\u01ce\u01d2\u0003l6\u0000"+
		"\u01cf\u01d2\u0003L&\u0000\u01d0\u01d2\u0003<\u001e\u0000\u01d1\u01c5"+
		"\u0001\u0000\u0000\u0000\u01d1\u01ca\u0001\u0000\u0000\u0000\u01d1\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d2g\u0001\u0000\u0000\u0000\u01d3\u01d4\u0007"+
		"\u0004\u0000\u0000\u01d4i\u0001\u0000\u0000\u0000\u01d5\u01d6\u0007\u0005"+
		"\u0000\u0000\u01d6k\u0001\u0000\u0000\u0000\u01d7\u01dc\u0003n7\u0000"+
		"\u01d8\u01dc\u0003r9\u0000\u01d9\u01dc\u0003t:\u0000\u01da\u01dc\u0003"+
		"v;\u0000\u01db\u01d7\u0001\u0000\u0000\u0000\u01db\u01d8\u0001\u0000\u0000"+
		"\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01da\u0001\u0000\u0000"+
		"\u0000\u01dcm\u0001\u0000\u0000\u0000\u01dd\u01de\u0005/\u0000\u0000\u01de"+
		"\u01df\u0005\b\u0000\u0000\u01df\u01e0\u0003>\u001f\u0000\u01e0\u01e1"+
		"\u0005\u0007\u0000\u0000\u01e1o\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005"+
		"-\u0000\u0000\u01e3\u01e4\u0005\b\u0000\u0000\u01e4\u01e5\u0003>\u001f"+
		"\u0000\u01e5\u01e6\u0005\u0007\u0000\u0000\u01e6q\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u00051\u0000\u0000\u01e8\u01e9\u0005\b\u0000\u0000\u01e9"+
		"\u01ea\u0003>\u001f\u0000\u01ea\u01eb\u0005\u0003\u0000\u0000\u01eb\u01ec"+
		"\u0003>\u001f\u0000\u01ec\u01ed\u0005\u0007\u0000\u0000\u01eds\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ef\u0005.\u0000\u0000\u01ef\u01f0\u0005\b\u0000"+
		"\u0000\u01f0\u01f1\u0003>\u001f\u0000\u01f1\u01f2\u0005\u0007\u0000\u0000"+
		"\u01f2u\u0001\u0000\u0000\u0000\u01f3\u01f4\u00050\u0000\u0000\u01f4\u01f5"+
		"\u0005\b\u0000\u0000\u01f5\u01f6\u0003>\u001f\u0000\u01f6\u01f7\u0005"+
		"\u0003\u0000\u0000\u01f7\u01f8\u0003>\u001f\u0000\u01f8\u01f9\u0005\u0007"+
		"\u0000\u0000\u01f9w\u0001\u0000\u0000\u0000\u001e\u0081\u0088\u00a1\u00aa"+
		"\u00b2\u00b6\u00c8\u00d4\u00e0\u00ea\u00f7\u00fe\u0102\u0110\u0118\u012d"+
		"\u0137\u015d\u0169\u0172\u0179\u0181\u018b\u0195\u019f\u01a9\u01b7\u01c3"+
		"\u01d1\u01db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}