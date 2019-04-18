# Generated from milestone_2.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .milestone_2Parser import milestone_2Parser
else:
    from milestone_2Parser import milestone_2Parser

# This class defines a complete listener for a parse tree produced by milestone_2Parser.
class milestone_2Listener(ParseTreeListener):

    # Enter a parse tree produced by milestone_2Parser#comma.
    def enterComma(self, ctx:milestone_2Parser.CommaContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#comma.
    def exitComma(self, ctx:milestone_2Parser.CommaContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#semicolon.
    def enterSemicolon(self, ctx:milestone_2Parser.SemicolonContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#semicolon.
    def exitSemicolon(self, ctx:milestone_2Parser.SemicolonContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#colon.
    def enterColon(self, ctx:milestone_2Parser.ColonContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#colon.
    def exitColon(self, ctx:milestone_2Parser.ColonContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#colcom.
    def enterColcom(self, ctx:milestone_2Parser.ColcomContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#colcom.
    def exitColcom(self, ctx:milestone_2Parser.ColcomContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#operator.
    def enterOperator(self, ctx:milestone_2Parser.OperatorContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#operator.
    def exitOperator(self, ctx:milestone_2Parser.OperatorContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#prefixOperator.
    def enterPrefixOperator(self, ctx:milestone_2Parser.PrefixOperatorContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#prefixOperator.
    def exitPrefixOperator(self, ctx:milestone_2Parser.PrefixOperatorContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#optInd.
    def enterOptInd(self, ctx:milestone_2Parser.OptIndContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#optInd.
    def exitOptInd(self, ctx:milestone_2Parser.OptIndContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#simpleExpr.
    def enterSimpleExpr(self, ctx:milestone_2Parser.SimpleExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#simpleExpr.
    def exitSimpleExpr(self, ctx:milestone_2Parser.SimpleExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#arrowExpr.
    def enterArrowExpr(self, ctx:milestone_2Parser.ArrowExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#arrowExpr.
    def exitArrowExpr(self, ctx:milestone_2Parser.ArrowExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#assignExpr.
    def enterAssignExpr(self, ctx:milestone_2Parser.AssignExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#assignExpr.
    def exitAssignExpr(self, ctx:milestone_2Parser.AssignExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#orExpr.
    def enterOrExpr(self, ctx:milestone_2Parser.OrExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#orExpr.
    def exitOrExpr(self, ctx:milestone_2Parser.OrExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#andExpr.
    def enterAndExpr(self, ctx:milestone_2Parser.AndExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#andExpr.
    def exitAndExpr(self, ctx:milestone_2Parser.AndExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#cmpExpr.
    def enterCmpExpr(self, ctx:milestone_2Parser.CmpExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#cmpExpr.
    def exitCmpExpr(self, ctx:milestone_2Parser.CmpExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#sliceExpr.
    def enterSliceExpr(self, ctx:milestone_2Parser.SliceExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#sliceExpr.
    def exitSliceExpr(self, ctx:milestone_2Parser.SliceExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#ampExpr.
    def enterAmpExpr(self, ctx:milestone_2Parser.AmpExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#ampExpr.
    def exitAmpExpr(self, ctx:milestone_2Parser.AmpExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#plusExpr.
    def enterPlusExpr(self, ctx:milestone_2Parser.PlusExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#plusExpr.
    def exitPlusExpr(self, ctx:milestone_2Parser.PlusExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#mulExpr.
    def enterMulExpr(self, ctx:milestone_2Parser.MulExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#mulExpr.
    def exitMulExpr(self, ctx:milestone_2Parser.MulExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#dollarExpr.
    def enterDollarExpr(self, ctx:milestone_2Parser.DollarExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#dollarExpr.
    def exitDollarExpr(self, ctx:milestone_2Parser.DollarExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#primary.
    def enterPrimary(self, ctx:milestone_2Parser.PrimaryContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#primary.
    def exitPrimary(self, ctx:milestone_2Parser.PrimaryContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#identOrLiteral.
    def enterIdentOrLiteral(self, ctx:milestone_2Parser.IdentOrLiteralContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#identOrLiteral.
    def exitIdentOrLiteral(self, ctx:milestone_2Parser.IdentOrLiteralContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#par.
    def enterPar(self, ctx:milestone_2Parser.ParContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#par.
    def exitPar(self, ctx:milestone_2Parser.ParContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#condExpr.
    def enterCondExpr(self, ctx:milestone_2Parser.CondExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#condExpr.
    def exitCondExpr(self, ctx:milestone_2Parser.CondExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#ifExpr.
    def enterIfExpr(self, ctx:milestone_2Parser.IfExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#ifExpr.
    def exitIfExpr(self, ctx:milestone_2Parser.IfExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#pragma.
    def enterPragma(self, ctx:milestone_2Parser.PragmaContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#pragma.
    def exitPragma(self, ctx:milestone_2Parser.PragmaContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#test.
    def enterTest(self, ctx:milestone_2Parser.TestContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#test.
    def exitTest(self, ctx:milestone_2Parser.TestContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#expr.
    def enterExpr(self, ctx:milestone_2Parser.ExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#expr.
    def exitExpr(self, ctx:milestone_2Parser.ExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#typeKeyw.
    def enterTypeKeyw(self, ctx:milestone_2Parser.TypeKeywContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#typeKeyw.
    def exitTypeKeyw(self, ctx:milestone_2Parser.TypeKeywContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#typeDesc.
    def enterTypeDesc(self, ctx:milestone_2Parser.TypeDescContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#typeDesc.
    def exitTypeDesc(self, ctx:milestone_2Parser.TypeDescContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#optPar.
    def enterOptPar(self, ctx:milestone_2Parser.OptParContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#optPar.
    def exitOptPar(self, ctx:milestone_2Parser.OptParContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#generalizedLit.
    def enterGeneralizedLit(self, ctx:milestone_2Parser.GeneralizedLitContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#generalizedLit.
    def exitGeneralizedLit(self, ctx:milestone_2Parser.GeneralizedLitContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#symbol.
    def enterSymbol(self, ctx:milestone_2Parser.SymbolContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#symbol.
    def exitSymbol(self, ctx:milestone_2Parser.SymbolContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#literal.
    def enterLiteral(self, ctx:milestone_2Parser.LiteralContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#literal.
    def exitLiteral(self, ctx:milestone_2Parser.LiteralContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#primarySuffix.
    def enterPrimarySuffix(self, ctx:milestone_2Parser.PrimarySuffixContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#primarySuffix.
    def exitPrimarySuffix(self, ctx:milestone_2Parser.PrimarySuffixContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#arrayConstr.
    def enterArrayConstr(self, ctx:milestone_2Parser.ArrayConstrContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#arrayConstr.
    def exitArrayConstr(self, ctx:milestone_2Parser.ArrayConstrContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#setOrTableConstr.
    def enterSetOrTableConstr(self, ctx:milestone_2Parser.SetOrTableConstrContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#setOrTableConstr.
    def exitSetOrTableConstr(self, ctx:milestone_2Parser.SetOrTableConstrContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#castExpr.
    def enterCastExpr(self, ctx:milestone_2Parser.CastExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#castExpr.
    def exitCastExpr(self, ctx:milestone_2Parser.CastExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#exprColonEqExpr.
    def enterExprColonEqExpr(self, ctx:milestone_2Parser.ExprColonEqExprContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#exprColonEqExpr.
    def exitExprColonEqExpr(self, ctx:milestone_2Parser.ExprColonEqExprContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#parKeyw.
    def enterParKeyw(self, ctx:milestone_2Parser.ParKeywContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#parKeyw.
    def exitParKeyw(self, ctx:milestone_2Parser.ParKeywContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#simpleStmt.
    def enterSimpleStmt(self, ctx:milestone_2Parser.SimpleStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#simpleStmt.
    def exitSimpleStmt(self, ctx:milestone_2Parser.SimpleStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#complexOrSimpleStmt.
    def enterComplexOrSimpleStmt(self, ctx:milestone_2Parser.ComplexOrSimpleStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#complexOrSimpleStmt.
    def exitComplexOrSimpleStmt(self, ctx:milestone_2Parser.ComplexOrSimpleStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#pragmaStmt.
    def enterPragmaStmt(self, ctx:milestone_2Parser.PragmaStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#pragmaStmt.
    def exitPragmaStmt(self, ctx:milestone_2Parser.PragmaStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#exprStmt.
    def enterExprStmt(self, ctx:milestone_2Parser.ExprStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#exprStmt.
    def exitExprStmt(self, ctx:milestone_2Parser.ExprStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#importStmt.
    def enterImportStmt(self, ctx:milestone_2Parser.ImportStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#importStmt.
    def exitImportStmt(self, ctx:milestone_2Parser.ImportStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#includeStmt.
    def enterIncludeStmt(self, ctx:milestone_2Parser.IncludeStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#includeStmt.
    def exitIncludeStmt(self, ctx:milestone_2Parser.IncludeStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#returnStmt.
    def enterReturnStmt(self, ctx:milestone_2Parser.ReturnStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#returnStmt.
    def exitReturnStmt(self, ctx:milestone_2Parser.ReturnStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#raiseStmt.
    def enterRaiseStmt(self, ctx:milestone_2Parser.RaiseStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#raiseStmt.
    def exitRaiseStmt(self, ctx:milestone_2Parser.RaiseStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#yieldStmt.
    def enterYieldStmt(self, ctx:milestone_2Parser.YieldStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#yieldStmt.
    def exitYieldStmt(self, ctx:milestone_2Parser.YieldStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#discardStmt.
    def enterDiscardStmt(self, ctx:milestone_2Parser.DiscardStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#discardStmt.
    def exitDiscardStmt(self, ctx:milestone_2Parser.DiscardStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#breakStmt.
    def enterBreakStmt(self, ctx:milestone_2Parser.BreakStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#breakStmt.
    def exitBreakStmt(self, ctx:milestone_2Parser.BreakStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#continueStmt.
    def enterContinueStmt(self, ctx:milestone_2Parser.ContinueStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#continueStmt.
    def exitContinueStmt(self, ctx:milestone_2Parser.ContinueStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#condStmt.
    def enterCondStmt(self, ctx:milestone_2Parser.CondStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#condStmt.
    def exitCondStmt(self, ctx:milestone_2Parser.CondStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#ifStmt.
    def enterIfStmt(self, ctx:milestone_2Parser.IfStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#ifStmt.
    def exitIfStmt(self, ctx:milestone_2Parser.IfStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#whenStmt.
    def enterWhenStmt(self, ctx:milestone_2Parser.WhenStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#whenStmt.
    def exitWhenStmt(self, ctx:milestone_2Parser.WhenStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#whileStmt.
    def enterWhileStmt(self, ctx:milestone_2Parser.WhileStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#whileStmt.
    def exitWhileStmt(self, ctx:milestone_2Parser.WhileStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#commentStmt.
    def enterCommentStmt(self, ctx:milestone_2Parser.CommentStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#commentStmt.
    def exitCommentStmt(self, ctx:milestone_2Parser.CommentStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#forStmt.
    def enterForStmt(self, ctx:milestone_2Parser.ForStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#forStmt.
    def exitForStmt(self, ctx:milestone_2Parser.ForStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#blockStmt.
    def enterBlockStmt(self, ctx:milestone_2Parser.BlockStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#blockStmt.
    def exitBlockStmt(self, ctx:milestone_2Parser.BlockStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#staticStmt.
    def enterStaticStmt(self, ctx:milestone_2Parser.StaticStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#staticStmt.
    def exitStaticStmt(self, ctx:milestone_2Parser.StaticStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#deferStmt.
    def enterDeferStmt(self, ctx:milestone_2Parser.DeferStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#deferStmt.
    def exitDeferStmt(self, ctx:milestone_2Parser.DeferStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#asmStmt.
    def enterAsmStmt(self, ctx:milestone_2Parser.AsmStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#asmStmt.
    def exitAsmStmt(self, ctx:milestone_2Parser.AsmStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#colonBody.
    def enterColonBody(self, ctx:milestone_2Parser.ColonBodyContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#colonBody.
    def exitColonBody(self, ctx:milestone_2Parser.ColonBodyContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#identVis.
    def enterIdentVis(self, ctx:milestone_2Parser.IdentVisContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#identVis.
    def exitIdentVis(self, ctx:milestone_2Parser.IdentVisContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#identVisDot.
    def enterIdentVisDot(self, ctx:milestone_2Parser.IdentVisDotContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#identVisDot.
    def exitIdentVisDot(self, ctx:milestone_2Parser.IdentVisDotContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#identWithPragma.
    def enterIdentWithPragma(self, ctx:milestone_2Parser.IdentWithPragmaContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#identWithPragma.
    def exitIdentWithPragma(self, ctx:milestone_2Parser.IdentWithPragmaContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#stmt.
    def enterStmt(self, ctx:milestone_2Parser.StmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#stmt.
    def exitStmt(self, ctx:milestone_2Parser.StmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#module.
    def enterModule(self, ctx:milestone_2Parser.ModuleContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#module.
    def exitModule(self, ctx:milestone_2Parser.ModuleContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#start.
    def enterStart(self, ctx:milestone_2Parser.StartContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#start.
    def exitStart(self, ctx:milestone_2Parser.StartContext):
        pass


