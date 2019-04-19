# Generated from test.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0084")
        buf.write("`\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t")
        buf.write("\16\3\2\3\2\3\3\3\3\3\4\6\4\"\n\4\r\4\16\4#\3\5\3\5\3")
        buf.write("\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\63\n\t")
        buf.write("\f\t\16\t\66\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13")
        buf.write("\3\13\3\13\3\13\6\13D\n\13\r\13\16\13E\3\f\3\f\3\f\5\f")
        buf.write("K\n\f\3\r\3\r\3\r\6\rP\n\r\r\r\16\rQ\5\rT\n\r\3\r\7\r")
        buf.write("W\n\r\f\r\16\rZ\13\r\5\r\\\n\r\3\16\3\16\3\16\2\2\17\2")
        buf.write("\4\6\b\n\f\16\20\22\24\26\30\32\2\3\4\2##HH\2\\\2\34\3")
        buf.write("\2\2\2\4\36\3\2\2\2\6!\3\2\2\2\b%\3\2\2\2\n\'\3\2\2\2")
        buf.write("\f)\3\2\2\2\16+\3\2\2\2\20-\3\2\2\2\22:\3\2\2\2\24>\3")
        buf.write("\2\2\2\26J\3\2\2\2\30[\3\2\2\2\32]\3\2\2\2\34\35\7\3\2")
        buf.write("\2\35\3\3\2\2\2\36\37\7e\2\2\37\5\3\2\2\2 \"\7\u0083\2")
        buf.write("\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\7\3\2\2\2")
        buf.write("%&\7\31\2\2&\t\3\2\2\2\'(\7\32\2\2(\13\3\2\2\2)*\7\4\2")
        buf.write("\2*\r\3\2\2\2+,\7\13\2\2,\17\3\2\2\2-.\t\2\2\2.\64\5\4")
        buf.write("\3\2/\60\5\b\5\2\60\61\5\4\3\2\61\63\3\2\2\2\62/\3\2\2")
        buf.write("\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2")
        buf.write("\2\2\66\64\3\2\2\2\678\5\n\6\289\5\2\2\29\21\3\2\2\2:")
        buf.write(";\5\4\3\2;<\5\f\7\2<=\5\6\4\2=\23\3\2\2\2>?\5\4\3\2?@")
        buf.write("\5\f\7\2@C\5\4\3\2AB\7\13\2\2BD\5\4\3\2CA\3\2\2\2DE\3")
        buf.write("\2\2\2EC\3\2\2\2EF\3\2\2\2F\25\3\2\2\2GK\5\20\t\2HK\5")
        buf.write("\22\n\2IK\5\24\13\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\27")
        buf.write("\3\2\2\2LX\5\26\f\2MT\7!\2\2NP\7\7\2\2ON\3\2\2\2PQ\3\2")
        buf.write("\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SM\3\2\2\2SO\3\2\2\2")
        buf.write("ST\3\2\2\2TU\3\2\2\2UW\5\26\f\2VS\3\2\2\2WZ\3\2\2\2XV")
        buf.write("\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[L\3\2\2\2[\\\3")
        buf.write("\2\2\2\\\31\3\2\2\2]^\5\30\r\2^\33\3\2\2\2\n#\64EJQSX")
        buf.write("[")
        return buf.getvalue()


class testParser ( Parser ):

    grammarFileName = "test.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'int'", "'='", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'+'", "'*'", "'-'", "'/'", "'~'", "'&'", "'|'", "'<'", 
                     "'>'", "'@'", "'%'", "'!'", "'^'", "'.'", "','", "':'", 
                     "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "<INVALID>", 
                     "'var'", "'and'", "'addr'", "'as'", "'asm'", "'bind'", 
                     "'block'", "'break'", "'case'", "'cast'", "'concept'", 
                     "'const'", "'continue'", "'converter'", "'defer'", 
                     "'discard'", "'distinct'", "'div'", "'do'", "'elif'", 
                     "'else'", "'end'", "'enum'", "'except'", "'export'", 
                     "'finally'", "'for'", "'from'", "'func'", "'if'", "'import'", 
                     "'in'", "'include'", "'interface'", "'is'", "'isnot'", 
                     "'iterator'", "'let'", "'macro'", "'method'", "'mixin'", 
                     "'mod'", "'nil'", "'not'", "'notin'", "'object'", "'of'", 
                     "'or'", "'out'", "'proc'", "'ptr'", "'raise'", "'ref'", 
                     "'return'", "'shl'", "'shr'", "'static'", "'template'", 
                     "'try'", "'tuple'", "'type'", "'using'", "'when'", 
                     "'while'", "'xor'", "'yield'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "SPACE", "NEWLINE", 
                      "INDENT", "COMMENT", "MULTCOMMENT", "EQUALS_OPERATOR", 
                      "ADD_OPERATOR", "MUL_OPERATOR", "MINUS_OPERATOR", 
                      "DIV_OPERATOR", "BITWISE_NOT_OPERATOR", "AND_OPERATOR", 
                      "OR_OPERATOR", "LESS_THAN", "GREATER_THAN", "AT", 
                      "MODULUS", "NOT_OPERATOR", "XOR_OPERATOR", "DOT", 
                      "COMMA", "COLON", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACE", 
                      "CLOSE_BRACE", "OPEN_BRACK", "CLOSE_BRACK", "SEMI_COLON", 
                      "OTHER_TOKENS", "VARIABLE", "AND", "ADDR", "AS", "ASM", 
                      "BIND", "BLOCK", "BREAK", "CASE", "CAST", "CONCEPT", 
                      "CONST", "CONTINUE", "CONVERTER", "DEFER", "DISCARD", 
                      "DISTINCT", "DIV", "DO", "ELIF", "ELSE", "END", "ENUM", 
                      "EXCEPT", "EXPORT", "FINALLY", "FOR", "FROM", "FUNC", 
                      "IF", "IMPORT", "IN", "INCLUDE", "INTERFACE", "IS", 
                      "ISNOT", "ITERATOR", "LET", "MACRO", "METHOD", "MIXIN", 
                      "MOD", "NIL", "NOT", "NOTIN", "OBJECT", "OF", "OR", 
                      "OUT", "PROC", "PTR", "RAISE", "REF", "RETURN", "SHL", 
                      "SHR", "STATIC", "TEMPLATE", "TRY", "TUPLE", "TYPE", 
                      "USING", "WHEN", "WHILE", "XOR", "YIELD", "IDENTIFIER", 
                      "INT_LIT", "INT8_LIT", "INT16_LIT", "INT32_LIT", "INT64_LIT", 
                      "UINT_LIT", "UINT8_LIT", "UINT16_LIT", "UINT32_LIT", 
                      "UINT64_LIT", "HEXDIGIT", "OCTDIGIT", "BINDIGIT", 
                      "HEX_LIT", "DEC_LIT", "OCT_LIT", "BIN_LIT", "EXP", 
                      "FLOAT_LIT", "FLOAT32_SUFFIX", "FLOAT32_LIT", "FLOAT64_SUFFIX", 
                      "FLOAT64_LIT", "TRIPLESTR_LIT", "STR_LIT", "CHAR_LIT", 
                      "RSTR_LIT", "GENERALIZED_STR_LIT", "GENERALIZED_TRIPLESTR_LIT", 
                      "DIGIT", "LETTER" ]

    RULE_dataType = 0
    RULE_identifier = 1
    RULE_number = 2
    RULE_comma = 3
    RULE_colon = 4
    RULE_equals = 5
    RULE_plus = 6
    RULE_declareStmt = 7
    RULE_simpleStmt = 8
    RULE_plusStmt = 9
    RULE_stmt = 10
    RULE_module = 11
    RULE_start = 12

    ruleNames =  [ "dataType", "identifier", "number", "comma", "colon", 
                   "equals", "plus", "declareStmt", "simpleStmt", "plusStmt", 
                   "stmt", "module", "start" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    SPACE=3
    NEWLINE=4
    INDENT=5
    COMMENT=6
    MULTCOMMENT=7
    EQUALS_OPERATOR=8
    ADD_OPERATOR=9
    MUL_OPERATOR=10
    MINUS_OPERATOR=11
    DIV_OPERATOR=12
    BITWISE_NOT_OPERATOR=13
    AND_OPERATOR=14
    OR_OPERATOR=15
    LESS_THAN=16
    GREATER_THAN=17
    AT=18
    MODULUS=19
    NOT_OPERATOR=20
    XOR_OPERATOR=21
    DOT=22
    COMMA=23
    COLON=24
    OPEN_PAREN=25
    CLOSE_PAREN=26
    OPEN_BRACE=27
    CLOSE_BRACE=28
    OPEN_BRACK=29
    CLOSE_BRACK=30
    SEMI_COLON=31
    OTHER_TOKENS=32
    VARIABLE=33
    AND=34
    ADDR=35
    AS=36
    ASM=37
    BIND=38
    BLOCK=39
    BREAK=40
    CASE=41
    CAST=42
    CONCEPT=43
    CONST=44
    CONTINUE=45
    CONVERTER=46
    DEFER=47
    DISCARD=48
    DISTINCT=49
    DIV=50
    DO=51
    ELIF=52
    ELSE=53
    END=54
    ENUM=55
    EXCEPT=56
    EXPORT=57
    FINALLY=58
    FOR=59
    FROM=60
    FUNC=61
    IF=62
    IMPORT=63
    IN=64
    INCLUDE=65
    INTERFACE=66
    IS=67
    ISNOT=68
    ITERATOR=69
    LET=70
    MACRO=71
    METHOD=72
    MIXIN=73
    MOD=74
    NIL=75
    NOT=76
    NOTIN=77
    OBJECT=78
    OF=79
    OR=80
    OUT=81
    PROC=82
    PTR=83
    RAISE=84
    REF=85
    RETURN=86
    SHL=87
    SHR=88
    STATIC=89
    TEMPLATE=90
    TRY=91
    TUPLE=92
    TYPE=93
    USING=94
    WHEN=95
    WHILE=96
    XOR=97
    YIELD=98
    IDENTIFIER=99
    INT_LIT=100
    INT8_LIT=101
    INT16_LIT=102
    INT32_LIT=103
    INT64_LIT=104
    UINT_LIT=105
    UINT8_LIT=106
    UINT16_LIT=107
    UINT32_LIT=108
    UINT64_LIT=109
    HEXDIGIT=110
    OCTDIGIT=111
    BINDIGIT=112
    HEX_LIT=113
    DEC_LIT=114
    OCT_LIT=115
    BIN_LIT=116
    EXP=117
    FLOAT_LIT=118
    FLOAT32_SUFFIX=119
    FLOAT32_LIT=120
    FLOAT64_SUFFIX=121
    FLOAT64_LIT=122
    TRIPLESTR_LIT=123
    STR_LIT=124
    CHAR_LIT=125
    RSTR_LIT=126
    GENERALIZED_STR_LIT=127
    GENERALIZED_TRIPLESTR_LIT=128
    DIGIT=129
    LETTER=130

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class DataTypeContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return testParser.RULE_dataType

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDataType" ):
                listener.enterDataType(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDataType" ):
                listener.exitDataType(self)




    def dataType(self):

        localctx = testParser.DataTypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_dataType)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 26
            self.match(testParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IdentifierContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self):
            return self.getToken(testParser.IDENTIFIER, 0)

        def getRuleIndex(self):
            return testParser.RULE_identifier

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIdentifier" ):
                listener.enterIdentifier(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIdentifier" ):
                listener.exitIdentifier(self)




    def identifier(self):

        localctx = testParser.IdentifierContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_identifier)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 28
            self.match(testParser.IDENTIFIER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NumberContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DIGIT(self, i:int=None):
            if i is None:
                return self.getTokens(testParser.DIGIT)
            else:
                return self.getToken(testParser.DIGIT, i)

        def getRuleIndex(self):
            return testParser.RULE_number

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNumber" ):
                listener.enterNumber(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNumber" ):
                listener.exitNumber(self)




    def number(self):

        localctx = testParser.NumberContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_number)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 31 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 30
                self.match(testParser.DIGIT)
                self.state = 33 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==testParser.DIGIT):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CommaContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COMMA(self):
            return self.getToken(testParser.COMMA, 0)

        def getRuleIndex(self):
            return testParser.RULE_comma

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComma" ):
                listener.enterComma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComma" ):
                listener.exitComma(self)




    def comma(self):

        localctx = testParser.CommaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_comma)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.match(testParser.COMMA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ColonContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COLON(self):
            return self.getToken(testParser.COLON, 0)

        def getRuleIndex(self):
            return testParser.RULE_colon

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterColon" ):
                listener.enterColon(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitColon" ):
                listener.exitColon(self)




    def colon(self):

        localctx = testParser.ColonContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_colon)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 37
            self.match(testParser.COLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EqualsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return testParser.RULE_equals

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEquals" ):
                listener.enterEquals(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEquals" ):
                listener.exitEquals(self)




    def equals(self):

        localctx = testParser.EqualsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_equals)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 39
            self.match(testParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PlusContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ADD_OPERATOR(self):
            return self.getToken(testParser.ADD_OPERATOR, 0)

        def getRuleIndex(self):
            return testParser.RULE_plus

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPlus" ):
                listener.enterPlus(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPlus" ):
                listener.exitPlus(self)




    def plus(self):

        localctx = testParser.PlusContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_plus)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 41
            self.match(testParser.ADD_OPERATOR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclareStmtContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def identifier(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(testParser.IdentifierContext)
            else:
                return self.getTypedRuleContext(testParser.IdentifierContext,i)


        def colon(self):
            return self.getTypedRuleContext(testParser.ColonContext,0)


        def dataType(self):
            return self.getTypedRuleContext(testParser.DataTypeContext,0)


        def LET(self):
            return self.getToken(testParser.LET, 0)

        def VARIABLE(self):
            return self.getToken(testParser.VARIABLE, 0)

        def comma(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(testParser.CommaContext)
            else:
                return self.getTypedRuleContext(testParser.CommaContext,i)


        def getRuleIndex(self):
            return testParser.RULE_declareStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDeclareStmt" ):
                listener.enterDeclareStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDeclareStmt" ):
                listener.exitDeclareStmt(self)




    def declareStmt(self):

        localctx = testParser.DeclareStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_declareStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 43
            _la = self._input.LA(1)
            if not(_la==testParser.VARIABLE or _la==testParser.LET):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 44
            self.identifier()
            self.state = 50
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==testParser.COMMA:
                self.state = 45
                self.comma()
                self.state = 46
                self.identifier()
                self.state = 52
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 53
            self.colon()
            self.state = 54
            self.dataType()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SimpleStmtContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def identifier(self):
            return self.getTypedRuleContext(testParser.IdentifierContext,0)


        def equals(self):
            return self.getTypedRuleContext(testParser.EqualsContext,0)


        def number(self):
            return self.getTypedRuleContext(testParser.NumberContext,0)


        def getRuleIndex(self):
            return testParser.RULE_simpleStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSimpleStmt" ):
                listener.enterSimpleStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSimpleStmt" ):
                listener.exitSimpleStmt(self)




    def simpleStmt(self):

        localctx = testParser.SimpleStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_simpleStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 56
            self.identifier()
            self.state = 57
            self.equals()
            self.state = 58
            self.number()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PlusStmtContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def identifier(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(testParser.IdentifierContext)
            else:
                return self.getTypedRuleContext(testParser.IdentifierContext,i)


        def equals(self):
            return self.getTypedRuleContext(testParser.EqualsContext,0)


        def ADD_OPERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(testParser.ADD_OPERATOR)
            else:
                return self.getToken(testParser.ADD_OPERATOR, i)

        def getRuleIndex(self):
            return testParser.RULE_plusStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPlusStmt" ):
                listener.enterPlusStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPlusStmt" ):
                listener.exitPlusStmt(self)




    def plusStmt(self):

        localctx = testParser.PlusStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_plusStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 60
            self.identifier()
            self.state = 61
            self.equals()
            self.state = 62
            self.identifier()
            self.state = 65 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 63
                self.match(testParser.ADD_OPERATOR)
                self.state = 64
                self.identifier()
                self.state = 67 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==testParser.ADD_OPERATOR):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StmtContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def declareStmt(self):
            return self.getTypedRuleContext(testParser.DeclareStmtContext,0)


        def simpleStmt(self):
            return self.getTypedRuleContext(testParser.SimpleStmtContext,0)


        def plusStmt(self):
            return self.getTypedRuleContext(testParser.PlusStmtContext,0)


        def getRuleIndex(self):
            return testParser.RULE_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStmt" ):
                listener.enterStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStmt" ):
                listener.exitStmt(self)




    def stmt(self):

        localctx = testParser.StmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_stmt)
        try:
            self.state = 72
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 69
                self.declareStmt()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 70
                self.simpleStmt()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 71
                self.plusStmt()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ModuleContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(testParser.StmtContext)
            else:
                return self.getTypedRuleContext(testParser.StmtContext,i)


        def SEMI_COLON(self, i:int=None):
            if i is None:
                return self.getTokens(testParser.SEMI_COLON)
            else:
                return self.getToken(testParser.SEMI_COLON, i)

        def INDENT(self, i:int=None):
            if i is None:
                return self.getTokens(testParser.INDENT)
            else:
                return self.getToken(testParser.INDENT, i)

        def getRuleIndex(self):
            return testParser.RULE_module

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterModule" ):
                listener.enterModule(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitModule" ):
                listener.exitModule(self)




    def module(self):

        localctx = testParser.ModuleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_module)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 89
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==testParser.VARIABLE or _la==testParser.LET or _la==testParser.IDENTIFIER:
                self.state = 74
                self.stmt()
                self.state = 86
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << testParser.INDENT) | (1 << testParser.SEMI_COLON) | (1 << testParser.VARIABLE))) != 0) or _la==testParser.LET or _la==testParser.IDENTIFIER:
                    self.state = 81
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [testParser.SEMI_COLON]:
                        self.state = 75
                        self.match(testParser.SEMI_COLON)
                        pass
                    elif token in [testParser.INDENT]:
                        self.state = 77 
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
                        while True:
                            self.state = 76
                            self.match(testParser.INDENT)
                            self.state = 79 
                            self._errHandler.sync(self)
                            _la = self._input.LA(1)
                            if not (_la==testParser.INDENT):
                                break

                        pass
                    elif token in [testParser.VARIABLE, testParser.LET, testParser.IDENTIFIER]:
                        pass
                    else:
                        pass
                    self.state = 83
                    self.stmt()
                    self.state = 88
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StartContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def module(self):
            return self.getTypedRuleContext(testParser.ModuleContext,0)


        def getRuleIndex(self):
            return testParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)




    def start(self):

        localctx = testParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_start)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 91
            self.module()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





