# Generated from new_milestone.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .new_milestoneParser import new_milestoneParser
else:
    from new_milestoneParser import new_milestoneParser

# This class defines a complete listener for a parse tree produced by new_milestoneParser.
class new_milestoneListener(ParseTreeListener):

    # Enter a parse tree produced by new_milestoneParser#module.
    def enterModule(self, ctx:new_milestoneParser.ModuleContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#module.
    def exitModule(self, ctx:new_milestoneParser.ModuleContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#comma.
    def enterComma(self, ctx:new_milestoneParser.CommaContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#comma.
    def exitComma(self, ctx:new_milestoneParser.CommaContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#semicolon.
    def enterSemicolon(self, ctx:new_milestoneParser.SemicolonContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#semicolon.
    def exitSemicolon(self, ctx:new_milestoneParser.SemicolonContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#colon.
    def enterColon(self, ctx:new_milestoneParser.ColonContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#colon.
    def exitColon(self, ctx:new_milestoneParser.ColonContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#colcom.
    def enterColcom(self, ctx:new_milestoneParser.ColcomContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#colcom.
    def exitColcom(self, ctx:new_milestoneParser.ColcomContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#operator.
    def enterOperator(self, ctx:new_milestoneParser.OperatorContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#operator.
    def exitOperator(self, ctx:new_milestoneParser.OperatorContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#prefixOperator.
    def enterPrefixOperator(self, ctx:new_milestoneParser.PrefixOperatorContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#prefixOperator.
    def exitPrefixOperator(self, ctx:new_milestoneParser.PrefixOperatorContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#optInd.
    def enterOptInd(self, ctx:new_milestoneParser.OptIndContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#optInd.
    def exitOptInd(self, ctx:new_milestoneParser.OptIndContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#optPar.
    def enterOptPar(self, ctx:new_milestoneParser.OptParContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#optPar.
    def exitOptPar(self, ctx:new_milestoneParser.OptParContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#simpleExpr.
    def enterSimpleExpr(self, ctx:new_milestoneParser.SimpleExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#simpleExpr.
    def exitSimpleExpr(self, ctx:new_milestoneParser.SimpleExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#arrowExpr.
    def enterArrowExpr(self, ctx:new_milestoneParser.ArrowExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#arrowExpr.
    def exitArrowExpr(self, ctx:new_milestoneParser.ArrowExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#assignExpr.
    def enterAssignExpr(self, ctx:new_milestoneParser.AssignExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#assignExpr.
    def exitAssignExpr(self, ctx:new_milestoneParser.AssignExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#orExpr.
    def enterOrExpr(self, ctx:new_milestoneParser.OrExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#orExpr.
    def exitOrExpr(self, ctx:new_milestoneParser.OrExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#andExpr.
    def enterAndExpr(self, ctx:new_milestoneParser.AndExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#andExpr.
    def exitAndExpr(self, ctx:new_milestoneParser.AndExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#cmpExpr.
    def enterCmpExpr(self, ctx:new_milestoneParser.CmpExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#cmpExpr.
    def exitCmpExpr(self, ctx:new_milestoneParser.CmpExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#sliceExpr.
    def enterSliceExpr(self, ctx:new_milestoneParser.SliceExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#sliceExpr.
    def exitSliceExpr(self, ctx:new_milestoneParser.SliceExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#ampExpr.
    def enterAmpExpr(self, ctx:new_milestoneParser.AmpExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#ampExpr.
    def exitAmpExpr(self, ctx:new_milestoneParser.AmpExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#plusExpr.
    def enterPlusExpr(self, ctx:new_milestoneParser.PlusExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#plusExpr.
    def exitPlusExpr(self, ctx:new_milestoneParser.PlusExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#mulExpr.
    def enterMulExpr(self, ctx:new_milestoneParser.MulExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#mulExpr.
    def exitMulExpr(self, ctx:new_milestoneParser.MulExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#dollarExpr.
    def enterDollarExpr(self, ctx:new_milestoneParser.DollarExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#dollarExpr.
    def exitDollarExpr(self, ctx:new_milestoneParser.DollarExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#symbol.
    def enterSymbol(self, ctx:new_milestoneParser.SymbolContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#symbol.
    def exitSymbol(self, ctx:new_milestoneParser.SymbolContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#indexExpr.
    def enterIndexExpr(self, ctx:new_milestoneParser.IndexExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#indexExpr.
    def exitIndexExpr(self, ctx:new_milestoneParser.IndexExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#indexExprList.
    def enterIndexExprList(self, ctx:new_milestoneParser.IndexExprListContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#indexExprList.
    def exitIndexExprList(self, ctx:new_milestoneParser.IndexExprListContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#exprColonEqExpr.
    def enterExprColonEqExpr(self, ctx:new_milestoneParser.ExprColonEqExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#exprColonEqExpr.
    def exitExprColonEqExpr(self, ctx:new_milestoneParser.ExprColonEqExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#exprList.
    def enterExprList(self, ctx:new_milestoneParser.ExprListContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#exprList.
    def exitExprList(self, ctx:new_milestoneParser.ExprListContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#dotExpr.
    def enterDotExpr(self, ctx:new_milestoneParser.DotExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#dotExpr.
    def exitDotExpr(self, ctx:new_milestoneParser.DotExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#qualifiedIdent.
    def enterQualifiedIdent(self, ctx:new_milestoneParser.QualifiedIdentContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#qualifiedIdent.
    def exitQualifiedIdent(self, ctx:new_milestoneParser.QualifiedIdentContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#exprColonEqExprList.
    def enterExprColonEqExprList(self, ctx:new_milestoneParser.ExprColonEqExprListContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#exprColonEqExprList.
    def exitExprColonEqExprList(self, ctx:new_milestoneParser.ExprColonEqExprListContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#setOrTableConstr.
    def enterSetOrTableConstr(self, ctx:new_milestoneParser.SetOrTableConstrContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#setOrTableConstr.
    def exitSetOrTableConstr(self, ctx:new_milestoneParser.SetOrTableConstrContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#castExpr.
    def enterCastExpr(self, ctx:new_milestoneParser.CastExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#castExpr.
    def exitCastExpr(self, ctx:new_milestoneParser.CastExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#parKeyw.
    def enterParKeyw(self, ctx:new_milestoneParser.ParKeywContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#parKeyw.
    def exitParKeyw(self, ctx:new_milestoneParser.ParKeywContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#par.
    def enterPar(self, ctx:new_milestoneParser.ParContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#par.
    def exitPar(self, ctx:new_milestoneParser.ParContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#literal.
    def enterLiteral(self, ctx:new_milestoneParser.LiteralContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#literal.
    def exitLiteral(self, ctx:new_milestoneParser.LiteralContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#generalizedLit.
    def enterGeneralizedLit(self, ctx:new_milestoneParser.GeneralizedLitContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#generalizedLit.
    def exitGeneralizedLit(self, ctx:new_milestoneParser.GeneralizedLitContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#identOrLiteral.
    def enterIdentOrLiteral(self, ctx:new_milestoneParser.IdentOrLiteralContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#identOrLiteral.
    def exitIdentOrLiteral(self, ctx:new_milestoneParser.IdentOrLiteralContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#tupleConstr.
    def enterTupleConstr(self, ctx:new_milestoneParser.TupleConstrContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#tupleConstr.
    def exitTupleConstr(self, ctx:new_milestoneParser.TupleConstrContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#arrayConstr.
    def enterArrayConstr(self, ctx:new_milestoneParser.ArrayConstrContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#arrayConstr.
    def exitArrayConstr(self, ctx:new_milestoneParser.ArrayConstrContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#primarySuffix.
    def enterPrimarySuffix(self, ctx:new_milestoneParser.PrimarySuffixContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#primarySuffix.
    def exitPrimarySuffix(self, ctx:new_milestoneParser.PrimarySuffixContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#condExpr.
    def enterCondExpr(self, ctx:new_milestoneParser.CondExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#condExpr.
    def exitCondExpr(self, ctx:new_milestoneParser.CondExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#ifExpr.
    def enterIfExpr(self, ctx:new_milestoneParser.IfExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#ifExpr.
    def exitIfExpr(self, ctx:new_milestoneParser.IfExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#whenExpr.
    def enterWhenExpr(self, ctx:new_milestoneParser.WhenExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#whenExpr.
    def exitWhenExpr(self, ctx:new_milestoneParser.WhenExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#pragma.
    def enterPragma(self, ctx:new_milestoneParser.PragmaContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#pragma.
    def exitPragma(self, ctx:new_milestoneParser.PragmaContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#exprColonExpr.
    def enterExprColonExpr(self, ctx:new_milestoneParser.ExprColonExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#exprColonExpr.
    def exitExprColonExpr(self, ctx:new_milestoneParser.ExprColonExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#identVis.
    def enterIdentVis(self, ctx:new_milestoneParser.IdentVisContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#identVis.
    def exitIdentVis(self, ctx:new_milestoneParser.IdentVisContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#identVisDot.
    def enterIdentVisDot(self, ctx:new_milestoneParser.IdentVisDotContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#identVisDot.
    def exitIdentVisDot(self, ctx:new_milestoneParser.IdentVisDotContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#identWithPragma.
    def enterIdentWithPragma(self, ctx:new_milestoneParser.IdentWithPragmaContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#identWithPragma.
    def exitIdentWithPragma(self, ctx:new_milestoneParser.IdentWithPragmaContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#identWithPragmaDot.
    def enterIdentWithPragmaDot(self, ctx:new_milestoneParser.IdentWithPragmaDotContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#identWithPragmaDot.
    def exitIdentWithPragmaDot(self, ctx:new_milestoneParser.IdentWithPragmaDotContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#declColonEquals.
    def enterDeclColonEquals(self, ctx:new_milestoneParser.DeclColonEqualsContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#declColonEquals.
    def exitDeclColonEquals(self, ctx:new_milestoneParser.DeclColonEqualsContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#identColonEquals.
    def enterIdentColonEquals(self, ctx:new_milestoneParser.IdentColonEqualsContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#identColonEquals.
    def exitIdentColonEquals(self, ctx:new_milestoneParser.IdentColonEqualsContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#inlTupleDecl.
    def enterInlTupleDecl(self, ctx:new_milestoneParser.InlTupleDeclContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#inlTupleDecl.
    def exitInlTupleDecl(self, ctx:new_milestoneParser.InlTupleDeclContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#extTupleDecl.
    def enterExtTupleDecl(self, ctx:new_milestoneParser.ExtTupleDeclContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#extTupleDecl.
    def exitExtTupleDecl(self, ctx:new_milestoneParser.ExtTupleDeclContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#tupleClass.
    def enterTupleClass(self, ctx:new_milestoneParser.TupleClassContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#tupleClass.
    def exitTupleClass(self, ctx:new_milestoneParser.TupleClassContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#paramList.
    def enterParamList(self, ctx:new_milestoneParser.ParamListContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#paramList.
    def exitParamList(self, ctx:new_milestoneParser.ParamListContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#paramListArrow.
    def enterParamListArrow(self, ctx:new_milestoneParser.ParamListArrowContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#paramListArrow.
    def exitParamListArrow(self, ctx:new_milestoneParser.ParamListArrowContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#paramListColon.
    def enterParamListColon(self, ctx:new_milestoneParser.ParamListColonContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#paramListColon.
    def exitParamListColon(self, ctx:new_milestoneParser.ParamListColonContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#doBlock.
    def enterDoBlock(self, ctx:new_milestoneParser.DoBlockContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#doBlock.
    def exitDoBlock(self, ctx:new_milestoneParser.DoBlockContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#doBlocks.
    def enterDoBlocks(self, ctx:new_milestoneParser.DoBlocksContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#doBlocks.
    def exitDoBlocks(self, ctx:new_milestoneParser.DoBlocksContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#procExpr.
    def enterProcExpr(self, ctx:new_milestoneParser.ProcExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#procExpr.
    def exitProcExpr(self, ctx:new_milestoneParser.ProcExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#distinct.
    def enterDistinct(self, ctx:new_milestoneParser.DistinctContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#distinct.
    def exitDistinct(self, ctx:new_milestoneParser.DistinctContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#expr.
    def enterExpr(self, ctx:new_milestoneParser.ExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#expr.
    def exitExpr(self, ctx:new_milestoneParser.ExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#typeKeyw.
    def enterTypeKeyw(self, ctx:new_milestoneParser.TypeKeywContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#typeKeyw.
    def exitTypeKeyw(self, ctx:new_milestoneParser.TypeKeywContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#primary.
    def enterPrimary(self, ctx:new_milestoneParser.PrimaryContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#primary.
    def exitPrimary(self, ctx:new_milestoneParser.PrimaryContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#typeDesc.
    def enterTypeDesc(self, ctx:new_milestoneParser.TypeDescContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#typeDesc.
    def exitTypeDesc(self, ctx:new_milestoneParser.TypeDescContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#typeDefAux.
    def enterTypeDefAux(self, ctx:new_milestoneParser.TypeDefAuxContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#typeDefAux.
    def exitTypeDefAux(self, ctx:new_milestoneParser.TypeDefAuxContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#macroColon.
    def enterMacroColon(self, ctx:new_milestoneParser.MacroColonContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#macroColon.
    def exitMacroColon(self, ctx:new_milestoneParser.MacroColonContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#exprStmt.
    def enterExprStmt(self, ctx:new_milestoneParser.ExprStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#exprStmt.
    def exitExprStmt(self, ctx:new_milestoneParser.ExprStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#importStmt.
    def enterImportStmt(self, ctx:new_milestoneParser.ImportStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#importStmt.
    def exitImportStmt(self, ctx:new_milestoneParser.ImportStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#exportStmt.
    def enterExportStmt(self, ctx:new_milestoneParser.ExportStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#exportStmt.
    def exitExportStmt(self, ctx:new_milestoneParser.ExportStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#includeStmt.
    def enterIncludeStmt(self, ctx:new_milestoneParser.IncludeStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#includeStmt.
    def exitIncludeStmt(self, ctx:new_milestoneParser.IncludeStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#fromStmt.
    def enterFromStmt(self, ctx:new_milestoneParser.FromStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#fromStmt.
    def exitFromStmt(self, ctx:new_milestoneParser.FromStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#returnStmt.
    def enterReturnStmt(self, ctx:new_milestoneParser.ReturnStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#returnStmt.
    def exitReturnStmt(self, ctx:new_milestoneParser.ReturnStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#raiseStmt.
    def enterRaiseStmt(self, ctx:new_milestoneParser.RaiseStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#raiseStmt.
    def exitRaiseStmt(self, ctx:new_milestoneParser.RaiseStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#yieldStmt.
    def enterYieldStmt(self, ctx:new_milestoneParser.YieldStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#yieldStmt.
    def exitYieldStmt(self, ctx:new_milestoneParser.YieldStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#discardStmt.
    def enterDiscardStmt(self, ctx:new_milestoneParser.DiscardStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#discardStmt.
    def exitDiscardStmt(self, ctx:new_milestoneParser.DiscardStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#breakStmt.
    def enterBreakStmt(self, ctx:new_milestoneParser.BreakStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#breakStmt.
    def exitBreakStmt(self, ctx:new_milestoneParser.BreakStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#continueStmt.
    def enterContinueStmt(self, ctx:new_milestoneParser.ContinueStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#continueStmt.
    def exitContinueStmt(self, ctx:new_milestoneParser.ContinueStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#condStmt.
    def enterCondStmt(self, ctx:new_milestoneParser.CondStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#condStmt.
    def exitCondStmt(self, ctx:new_milestoneParser.CondStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#ifStmt.
    def enterIfStmt(self, ctx:new_milestoneParser.IfStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#ifStmt.
    def exitIfStmt(self, ctx:new_milestoneParser.IfStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#whenStmt.
    def enterWhenStmt(self, ctx:new_milestoneParser.WhenStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#whenStmt.
    def exitWhenStmt(self, ctx:new_milestoneParser.WhenStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#whileStmt.
    def enterWhileStmt(self, ctx:new_milestoneParser.WhileStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#whileStmt.
    def exitWhileStmt(self, ctx:new_milestoneParser.WhileStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#ofBranch.
    def enterOfBranch(self, ctx:new_milestoneParser.OfBranchContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#ofBranch.
    def exitOfBranch(self, ctx:new_milestoneParser.OfBranchContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#ofBranches.
    def enterOfBranches(self, ctx:new_milestoneParser.OfBranchesContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#ofBranches.
    def exitOfBranches(self, ctx:new_milestoneParser.OfBranchesContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#caseStmt.
    def enterCaseStmt(self, ctx:new_milestoneParser.CaseStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#caseStmt.
    def exitCaseStmt(self, ctx:new_milestoneParser.CaseStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#tryStmt.
    def enterTryStmt(self, ctx:new_milestoneParser.TryStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#tryStmt.
    def exitTryStmt(self, ctx:new_milestoneParser.TryStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#tryExpr.
    def enterTryExpr(self, ctx:new_milestoneParser.TryExprContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#tryExpr.
    def exitTryExpr(self, ctx:new_milestoneParser.TryExprContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#exceptBlock.
    def enterExceptBlock(self, ctx:new_milestoneParser.ExceptBlockContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#exceptBlock.
    def exitExceptBlock(self, ctx:new_milestoneParser.ExceptBlockContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#forStmt.
    def enterForStmt(self, ctx:new_milestoneParser.ForStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#forStmt.
    def exitForStmt(self, ctx:new_milestoneParser.ForStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#blockStmt.
    def enterBlockStmt(self, ctx:new_milestoneParser.BlockStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#blockStmt.
    def exitBlockStmt(self, ctx:new_milestoneParser.BlockStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#staticStmt.
    def enterStaticStmt(self, ctx:new_milestoneParser.StaticStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#staticStmt.
    def exitStaticStmt(self, ctx:new_milestoneParser.StaticStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#deferStmt.
    def enterDeferStmt(self, ctx:new_milestoneParser.DeferStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#deferStmt.
    def exitDeferStmt(self, ctx:new_milestoneParser.DeferStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#asmStmt.
    def enterAsmStmt(self, ctx:new_milestoneParser.AsmStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#asmStmt.
    def exitAsmStmt(self, ctx:new_milestoneParser.AsmStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#genericParam.
    def enterGenericParam(self, ctx:new_milestoneParser.GenericParamContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#genericParam.
    def exitGenericParam(self, ctx:new_milestoneParser.GenericParamContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#genericParamList.
    def enterGenericParamList(self, ctx:new_milestoneParser.GenericParamListContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#genericParamList.
    def exitGenericParamList(self, ctx:new_milestoneParser.GenericParamListContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#pattern.
    def enterPattern(self, ctx:new_milestoneParser.PatternContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#pattern.
    def exitPattern(self, ctx:new_milestoneParser.PatternContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#indAndComment.
    def enterIndAndComment(self, ctx:new_milestoneParser.IndAndCommentContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#indAndComment.
    def exitIndAndComment(self, ctx:new_milestoneParser.IndAndCommentContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#routine.
    def enterRoutine(self, ctx:new_milestoneParser.RoutineContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#routine.
    def exitRoutine(self, ctx:new_milestoneParser.RoutineContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#commentStmt.
    def enterCommentStmt(self, ctx:new_milestoneParser.CommentStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#commentStmt.
    def exitCommentStmt(self, ctx:new_milestoneParser.CommentStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#constant.
    def enterConstant(self, ctx:new_milestoneParser.ConstantContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#constant.
    def exitConstant(self, ctx:new_milestoneParser.ConstantContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#objectWhen.
    def enterObjectWhen(self, ctx:new_milestoneParser.ObjectWhenContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#objectWhen.
    def exitObjectWhen(self, ctx:new_milestoneParser.ObjectWhenContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#objectBranch.
    def enterObjectBranch(self, ctx:new_milestoneParser.ObjectBranchContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#objectBranch.
    def exitObjectBranch(self, ctx:new_milestoneParser.ObjectBranchContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#objectBranches.
    def enterObjectBranches(self, ctx:new_milestoneParser.ObjectBranchesContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#objectBranches.
    def exitObjectBranches(self, ctx:new_milestoneParser.ObjectBranchesContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#objectCase.
    def enterObjectCase(self, ctx:new_milestoneParser.ObjectCaseContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#objectCase.
    def exitObjectCase(self, ctx:new_milestoneParser.ObjectCaseContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#objectPart.
    def enterObjectPart(self, ctx:new_milestoneParser.ObjectPartContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#objectPart.
    def exitObjectPart(self, ctx:new_milestoneParser.ObjectPartContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#typeClassParam.
    def enterTypeClassParam(self, ctx:new_milestoneParser.TypeClassParamContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#typeClassParam.
    def exitTypeClassParam(self, ctx:new_milestoneParser.TypeClassParamContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#typeClass.
    def enterTypeClass(self, ctx:new_milestoneParser.TypeClassContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#typeClass.
    def exitTypeClass(self, ctx:new_milestoneParser.TypeClassContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#typeDef.
    def enterTypeDef(self, ctx:new_milestoneParser.TypeDefContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#typeDef.
    def exitTypeDef(self, ctx:new_milestoneParser.TypeDefContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#varTuple.
    def enterVarTuple(self, ctx:new_milestoneParser.VarTupleContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#varTuple.
    def exitVarTuple(self, ctx:new_milestoneParser.VarTupleContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#variable.
    def enterVariable(self, ctx:new_milestoneParser.VariableContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#variable.
    def exitVariable(self, ctx:new_milestoneParser.VariableContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#bindStmt.
    def enterBindStmt(self, ctx:new_milestoneParser.BindStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#bindStmt.
    def exitBindStmt(self, ctx:new_milestoneParser.BindStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#mixinStmt.
    def enterMixinStmt(self, ctx:new_milestoneParser.MixinStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#mixinStmt.
    def exitMixinStmt(self, ctx:new_milestoneParser.MixinStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#pragmaStmt.
    def enterPragmaStmt(self, ctx:new_milestoneParser.PragmaStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#pragmaStmt.
    def exitPragmaStmt(self, ctx:new_milestoneParser.PragmaStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#simpleStmt.
    def enterSimpleStmt(self, ctx:new_milestoneParser.SimpleStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#simpleStmt.
    def exitSimpleStmt(self, ctx:new_milestoneParser.SimpleStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#echoStmt.
    def enterEchoStmt(self, ctx:new_milestoneParser.EchoStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#echoStmt.
    def exitEchoStmt(self, ctx:new_milestoneParser.EchoStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#complexOrSimpleStmt.
    def enterComplexOrSimpleStmt(self, ctx:new_milestoneParser.ComplexOrSimpleStmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#complexOrSimpleStmt.
    def exitComplexOrSimpleStmt(self, ctx:new_milestoneParser.ComplexOrSimpleStmtContext):
        pass


    # Enter a parse tree produced by new_milestoneParser#stmt.
    def enterStmt(self, ctx:new_milestoneParser.StmtContext):
        pass

    # Exit a parse tree produced by new_milestoneParser#stmt.
    def exitStmt(self, ctx:new_milestoneParser.StmtContext):
        pass


