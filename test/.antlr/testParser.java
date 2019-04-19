// Generated from /Users/yasmineamr/Desktop/Semester 10/Compilers_lab/Nim-Grammar/test/test.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SPACE=3, NEWLINE=4, INDENT=5, COMMENT=6, MULTCOMMENT=7, 
		EQUALS_OPERATOR=8, ADD_OPERATOR=9, MUL_OPERATOR=10, MINUS_OPERATOR=11, 
		DIV_OPERATOR=12, BITWISE_NOT_OPERATOR=13, AND_OPERATOR=14, OR_OPERATOR=15, 
		LESS_THAN=16, GREATER_THAN=17, AT=18, MODULUS=19, NOT_OPERATOR=20, XOR_OPERATOR=21, 
		DOT=22, COMMA=23, COLON=24, OPEN_PAREN=25, CLOSE_PAREN=26, OPEN_BRACE=27, 
		CLOSE_BRACE=28, OPEN_BRACK=29, CLOSE_BRACK=30, SEMI_COLON=31, OTHER_TOKENS=32, 
		VARIABLE=33, AND=34, ADDR=35, AS=36, ASM=37, BIND=38, BLOCK=39, BREAK=40, 
		CASE=41, CAST=42, CONCEPT=43, CONST=44, CONTINUE=45, CONVERTER=46, DEFER=47, 
		DISCARD=48, DISTINCT=49, DIV=50, DO=51, ELIF=52, ELSE=53, END=54, ENUM=55, 
		EXCEPT=56, EXPORT=57, FINALLY=58, FOR=59, FROM=60, FUNC=61, IF=62, IMPORT=63, 
		IN=64, INCLUDE=65, INTERFACE=66, IS=67, ISNOT=68, ITERATOR=69, LET=70, 
		MACRO=71, METHOD=72, MIXIN=73, MOD=74, NIL=75, NOT=76, NOTIN=77, OBJECT=78, 
		OF=79, OR=80, OUT=81, PROC=82, PTR=83, RAISE=84, REF=85, RETURN=86, SHL=87, 
		SHR=88, STATIC=89, TEMPLATE=90, TRY=91, TUPLE=92, TYPE=93, USING=94, WHEN=95, 
		WHILE=96, XOR=97, YIELD=98, IDENTIFIER=99, INT_LIT=100, INT8_LIT=101, 
		INT16_LIT=102, INT32_LIT=103, INT64_LIT=104, UINT_LIT=105, UINT8_LIT=106, 
		UINT16_LIT=107, UINT32_LIT=108, UINT64_LIT=109, HEXDIGIT=110, OCTDIGIT=111, 
		BINDIGIT=112, HEX_LIT=113, DEC_LIT=114, OCT_LIT=115, BIN_LIT=116, EXP=117, 
		FLOAT_LIT=118, FLOAT32_SUFFIX=119, FLOAT32_LIT=120, FLOAT64_SUFFIX=121, 
		FLOAT64_LIT=122, TRIPLESTR_LIT=123, STR_LIT=124, CHAR_LIT=125, RSTR_LIT=126, 
		GENERALIZED_STR_LIT=127, GENERALIZED_TRIPLESTR_LIT=128, DIGIT=129, LETTER=130;
	public static final int
		RULE_dataType = 0, RULE_identifier = 1, RULE_number = 2, RULE_comma = 3, 
		RULE_colon = 4, RULE_equals = 5, RULE_plus = 6, RULE_declareStmt = 7, 
		RULE_simpleStmt = 8, RULE_plusStmt = 9, RULE_stmt = 10, RULE_module = 11, 
		RULE_start = 12;
	public static final String[] ruleNames = {
		"dataType", "identifier", "number", "comma", "colon", "equals", "plus", 
		"declareStmt", "simpleStmt", "plusStmt", "stmt", "module", "start"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'='", null, null, null, null, null, null, "'+'", "'*'", 
		"'-'", "'/'", "'~'", "'&'", "'|'", "'<'", "'>'", "'@'", "'%'", "'!'", 
		"'^'", "'.'", "','", "':'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", null, "'var'", "'and'", "'addr'", "'as'", "'asm'", "'bind'", "'block'", 
		"'break'", "'case'", "'cast'", "'concept'", "'const'", "'continue'", "'converter'", 
		"'defer'", "'discard'", "'distinct'", "'div'", "'do'", "'elif'", "'else'", 
		"'end'", "'enum'", "'except'", "'export'", "'finally'", "'for'", "'from'", 
		"'func'", "'if'", "'import'", "'in'", "'include'", "'interface'", "'is'", 
		"'isnot'", "'iterator'", "'let'", "'macro'", "'method'", "'mixin'", "'mod'", 
		"'nil'", "'not'", "'notin'", "'object'", "'of'", "'or'", "'out'", "'proc'", 
		"'ptr'", "'raise'", "'ref'", "'return'", "'shl'", "'shr'", "'static'", 
		"'template'", "'try'", "'tuple'", "'type'", "'using'", "'when'", "'while'", 
		"'xor'", "'yield'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "SPACE", "NEWLINE", "INDENT", "COMMENT", "MULTCOMMENT", 
		"EQUALS_OPERATOR", "ADD_OPERATOR", "MUL_OPERATOR", "MINUS_OPERATOR", "DIV_OPERATOR", 
		"BITWISE_NOT_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", "LESS_THAN", "GREATER_THAN", 
		"AT", "MODULUS", "NOT_OPERATOR", "XOR_OPERATOR", "DOT", "COMMA", "COLON", 
		"OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACK", 
		"CLOSE_BRACK", "SEMI_COLON", "OTHER_TOKENS", "VARIABLE", "AND", "ADDR", 
		"AS", "ASM", "BIND", "BLOCK", "BREAK", "CASE", "CAST", "CONCEPT", "CONST", 
		"CONTINUE", "CONVERTER", "DEFER", "DISCARD", "DISTINCT", "DIV", "DO", 
		"ELIF", "ELSE", "END", "ENUM", "EXCEPT", "EXPORT", "FINALLY", "FOR", "FROM", 
		"FUNC", "IF", "IMPORT", "IN", "INCLUDE", "INTERFACE", "IS", "ISNOT", "ITERATOR", 
		"LET", "MACRO", "METHOD", "MIXIN", "MOD", "NIL", "NOT", "NOTIN", "OBJECT", 
		"OF", "OR", "OUT", "PROC", "PTR", "RAISE", "REF", "RETURN", "SHL", "SHR", 
		"STATIC", "TEMPLATE", "TRY", "TUPLE", "TYPE", "USING", "WHEN", "WHILE", 
		"XOR", "YIELD", "IDENTIFIER", "INT_LIT", "INT8_LIT", "INT16_LIT", "INT32_LIT", 
		"INT64_LIT", "UINT_LIT", "UINT8_LIT", "UINT16_LIT", "UINT32_LIT", "UINT64_LIT", 
		"HEXDIGIT", "OCTDIGIT", "BINDIGIT", "HEX_LIT", "DEC_LIT", "OCT_LIT", "BIN_LIT", 
		"EXP", "FLOAT_LIT", "FLOAT32_SUFFIX", "FLOAT32_LIT", "FLOAT64_SUFFIX", 
		"FLOAT64_LIT", "TRIPLESTR_LIT", "STR_LIT", "CHAR_LIT", "RSTR_LIT", "GENERALIZED_STR_LIT", 
		"GENERALIZED_TRIPLESTR_LIT", "DIGIT", "LETTER"
	};
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
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(testParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(IDENTIFIER);
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
		public List<TerminalNode> DIGIT() { return getTokens(testParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(testParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				match(DIGIT);
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class CommaContext extends ParserRuleContext {
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(COMMA);
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

	public static class ColonContext extends ParserRuleContext {
		public ColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon; }
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(COLON);
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
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__1);
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

	public static class PlusContext extends ParserRuleContext {
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(ADD_OPERATOR);
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

	public static class DeclareStmtContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public DeclareStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStmt; }
	}

	public final DeclareStmtContext declareStmt() throws RecognitionException {
		DeclareStmtContext _localctx = new DeclareStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declareStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==LET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(44);
			identifier();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(45);
				comma();
				setState(46);
				identifier();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			colon();
			setState(54);
			dataType();
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

	public static class SimpleStmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			identifier();
			setState(57);
			equals();
			setState(58);
			number();
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

	public static class PlusStmtContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public PlusStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusStmt; }
	}

	public final PlusStmtContext plusStmt() throws RecognitionException {
		PlusStmtContext _localctx = new PlusStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_plusStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			identifier();
			setState(61);
			equals();
			setState(62);
			identifier();
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				match(ADD_OPERATOR);
				setState(64);
				identifier();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ADD_OPERATOR );
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

	public static class StmtContext extends ParserRuleContext {
		public DeclareStmtContext declareStmt() {
			return getRuleContext(DeclareStmtContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public PlusStmtContext plusStmt() {
			return getRuleContext(PlusStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				declareStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				simpleStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				plusStmt();
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

	public static class ModuleContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> INDENT() { return getTokens(testParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(testParser.INDENT, i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE || _la==LET || _la==IDENTIFIER) {
				{
				setState(74);
				stmt();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDENT) | (1L << SEMI_COLON) | (1L << VARIABLE))) != 0) || _la==LET || _la==IDENTIFIER) {
					{
					{
					setState(81);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SEMI_COLON:
						{
						setState(75);
						match(SEMI_COLON);
						}
						break;
					case INDENT:
						{
						setState(77); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(76);
							match(INDENT);
							}
							}
							setState(79); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==INDENT );
						}
						break;
					case VARIABLE:
					case LET:
					case IDENTIFIER:
						break;
					default:
						break;
					}
					setState(83);
					stmt();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class StartContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			module();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0084`\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\6\4\"\n\4\r\4\16\4#"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\63\n\t\f\t\16"+
		"\t\66\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\6\13D"+
		"\n\13\r\13\16\13E\3\f\3\f\3\f\5\fK\n\f\3\r\3\r\3\r\6\rP\n\r\r\r\16\rQ"+
		"\5\rT\n\r\3\r\7\rW\n\r\f\r\16\rZ\13\r\5\r\\\n\r\3\16\3\16\3\16\2\2\17"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\4\2##HH\2\\\2\34\3\2\2\2\4\36\3"+
		"\2\2\2\6!\3\2\2\2\b%\3\2\2\2\n\'\3\2\2\2\f)\3\2\2\2\16+\3\2\2\2\20-\3"+
		"\2\2\2\22:\3\2\2\2\24>\3\2\2\2\26J\3\2\2\2\30[\3\2\2\2\32]\3\2\2\2\34"+
		"\35\7\3\2\2\35\3\3\2\2\2\36\37\7e\2\2\37\5\3\2\2\2 \"\7\u0083\2\2! \3"+
		"\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\7\3\2\2\2%&\7\31\2\2&\t\3\2\2\2"+
		"\'(\7\32\2\2(\13\3\2\2\2)*\7\4\2\2*\r\3\2\2\2+,\7\13\2\2,\17\3\2\2\2-"+
		".\t\2\2\2.\64\5\4\3\2/\60\5\b\5\2\60\61\5\4\3\2\61\63\3\2\2\2\62/\3\2"+
		"\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2"+
		"\2\2\678\5\n\6\289\5\2\2\29\21\3\2\2\2:;\5\4\3\2;<\5\f\7\2<=\5\6\4\2="+
		"\23\3\2\2\2>?\5\4\3\2?@\5\f\7\2@C\5\4\3\2AB\7\13\2\2BD\5\4\3\2CA\3\2\2"+
		"\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\25\3\2\2\2GK\5\20\t\2HK\5\22\n\2IK\5"+
		"\24\13\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\27\3\2\2\2LX\5\26\f\2MT\7!\2\2"+
		"NP\7\7\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SM\3\2\2\2"+
		"SO\3\2\2\2ST\3\2\2\2TU\3\2\2\2UW\5\26\f\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2"+
		"\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[L\3\2\2\2[\\\3\2\2\2\\\31\3\2\2\2]^"+
		"\5\30\r\2^\33\3\2\2\2\n#\64EJQSX[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}