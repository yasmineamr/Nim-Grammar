// Generated from milestone_2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link milestone_2Parser}.
 */
public interface milestone_2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(milestone_2Parser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(milestone_2Parser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(milestone_2Parser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(milestone_2Parser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(milestone_2Parser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(milestone_2Parser.ColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#colcom}.
	 * @param ctx the parse tree
	 */
	void enterColcom(milestone_2Parser.ColcomContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#colcom}.
	 * @param ctx the parse tree
	 */
	void exitColcom(milestone_2Parser.ColcomContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(milestone_2Parser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(milestone_2Parser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperator(milestone_2Parser.PrefixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperator(milestone_2Parser.PrefixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#optInd}.
	 * @param ctx the parse tree
	 */
	void enterOptInd(milestone_2Parser.OptIndContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#optInd}.
	 * @param ctx the parse tree
	 */
	void exitOptInd(milestone_2Parser.OptIndContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(milestone_2Parser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(milestone_2Parser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#arrowExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrowExpr(milestone_2Parser.ArrowExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#arrowExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrowExpr(milestone_2Parser.ArrowExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(milestone_2Parser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(milestone_2Parser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(milestone_2Parser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(milestone_2Parser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(milestone_2Parser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(milestone_2Parser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#cmpExpr}.
	 * @param ctx the parse tree
	 */
	void enterCmpExpr(milestone_2Parser.CmpExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#cmpExpr}.
	 * @param ctx the parse tree
	 */
	void exitCmpExpr(milestone_2Parser.CmpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#sliceExpr}.
	 * @param ctx the parse tree
	 */
	void enterSliceExpr(milestone_2Parser.SliceExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#sliceExpr}.
	 * @param ctx the parse tree
	 */
	void exitSliceExpr(milestone_2Parser.SliceExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#ampExpr}.
	 * @param ctx the parse tree
	 */
	void enterAmpExpr(milestone_2Parser.AmpExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#ampExpr}.
	 * @param ctx the parse tree
	 */
	void exitAmpExpr(milestone_2Parser.AmpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#plusExpr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(milestone_2Parser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#plusExpr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(milestone_2Parser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(milestone_2Parser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(milestone_2Parser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#dollarExpr}.
	 * @param ctx the parse tree
	 */
	void enterDollarExpr(milestone_2Parser.DollarExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#dollarExpr}.
	 * @param ctx the parse tree
	 */
	void exitDollarExpr(milestone_2Parser.DollarExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(milestone_2Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(milestone_2Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#identOrLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIdentOrLiteral(milestone_2Parser.IdentOrLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#identOrLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIdentOrLiteral(milestone_2Parser.IdentOrLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#par}.
	 * @param ctx the parse tree
	 */
	void enterPar(milestone_2Parser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#par}.
	 * @param ctx the parse tree
	 */
	void exitPar(milestone_2Parser.ParContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#condExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(milestone_2Parser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#condExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(milestone_2Parser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(milestone_2Parser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(milestone_2Parser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(milestone_2Parser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(milestone_2Parser.PragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(milestone_2Parser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(milestone_2Parser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(milestone_2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(milestone_2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#typeKeyw}.
	 * @param ctx the parse tree
	 */
	void enterTypeKeyw(milestone_2Parser.TypeKeywContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#typeKeyw}.
	 * @param ctx the parse tree
	 */
	void exitTypeKeyw(milestone_2Parser.TypeKeywContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#typeDesc}.
	 * @param ctx the parse tree
	 */
	void enterTypeDesc(milestone_2Parser.TypeDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#typeDesc}.
	 * @param ctx the parse tree
	 */
	void exitTypeDesc(milestone_2Parser.TypeDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#optPar}.
	 * @param ctx the parse tree
	 */
	void enterOptPar(milestone_2Parser.OptParContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#optPar}.
	 * @param ctx the parse tree
	 */
	void exitOptPar(milestone_2Parser.OptParContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#generalizedLit}.
	 * @param ctx the parse tree
	 */
	void enterGeneralizedLit(milestone_2Parser.GeneralizedLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#generalizedLit}.
	 * @param ctx the parse tree
	 */
	void exitGeneralizedLit(milestone_2Parser.GeneralizedLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(milestone_2Parser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(milestone_2Parser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(milestone_2Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(milestone_2Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#primarySuffix}.
	 * @param ctx the parse tree
	 */
	void enterPrimarySuffix(milestone_2Parser.PrimarySuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#primarySuffix}.
	 * @param ctx the parse tree
	 */
	void exitPrimarySuffix(milestone_2Parser.PrimarySuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#arrayConstr}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstr(milestone_2Parser.ArrayConstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#arrayConstr}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstr(milestone_2Parser.ArrayConstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#setOrTableConstr}.
	 * @param ctx the parse tree
	 */
	void enterSetOrTableConstr(milestone_2Parser.SetOrTableConstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#setOrTableConstr}.
	 * @param ctx the parse tree
	 */
	void exitSetOrTableConstr(milestone_2Parser.SetOrTableConstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#castExpr}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(milestone_2Parser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#castExpr}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(milestone_2Parser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#exprColonEqExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprColonEqExpr(milestone_2Parser.ExprColonEqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#exprColonEqExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprColonEqExpr(milestone_2Parser.ExprColonEqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#parKeyw}.
	 * @param ctx the parse tree
	 */
	void enterParKeyw(milestone_2Parser.ParKeywContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#parKeyw}.
	 * @param ctx the parse tree
	 */
	void exitParKeyw(milestone_2Parser.ParKeywContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(milestone_2Parser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(milestone_2Parser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#complexOrSimpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterComplexOrSimpleStmt(milestone_2Parser.ComplexOrSimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#complexOrSimpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitComplexOrSimpleStmt(milestone_2Parser.ComplexOrSimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#pragmaStmt}.
	 * @param ctx the parse tree
	 */
	void enterPragmaStmt(milestone_2Parser.PragmaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#pragmaStmt}.
	 * @param ctx the parse tree
	 */
	void exitPragmaStmt(milestone_2Parser.PragmaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(milestone_2Parser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(milestone_2Parser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(milestone_2Parser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(milestone_2Parser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#includeStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStmt(milestone_2Parser.IncludeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#includeStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStmt(milestone_2Parser.IncludeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(milestone_2Parser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(milestone_2Parser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#raiseStmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStmt(milestone_2Parser.RaiseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#raiseStmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStmt(milestone_2Parser.RaiseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#yieldStmt}.
	 * @param ctx the parse tree
	 */
	void enterYieldStmt(milestone_2Parser.YieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#yieldStmt}.
	 * @param ctx the parse tree
	 */
	void exitYieldStmt(milestone_2Parser.YieldStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#discardStmt}.
	 * @param ctx the parse tree
	 */
	void enterDiscardStmt(milestone_2Parser.DiscardStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#discardStmt}.
	 * @param ctx the parse tree
	 */
	void exitDiscardStmt(milestone_2Parser.DiscardStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(milestone_2Parser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(milestone_2Parser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(milestone_2Parser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(milestone_2Parser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#condStmt}.
	 * @param ctx the parse tree
	 */
	void enterCondStmt(milestone_2Parser.CondStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#condStmt}.
	 * @param ctx the parse tree
	 */
	void exitCondStmt(milestone_2Parser.CondStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(milestone_2Parser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(milestone_2Parser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#whenStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhenStmt(milestone_2Parser.WhenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#whenStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhenStmt(milestone_2Parser.WhenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(milestone_2Parser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(milestone_2Parser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#commentStmt}.
	 * @param ctx the parse tree
	 */
	void enterCommentStmt(milestone_2Parser.CommentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#commentStmt}.
	 * @param ctx the parse tree
	 */
	void exitCommentStmt(milestone_2Parser.CommentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(milestone_2Parser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(milestone_2Parser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(milestone_2Parser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(milestone_2Parser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#staticStmt}.
	 * @param ctx the parse tree
	 */
	void enterStaticStmt(milestone_2Parser.StaticStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#staticStmt}.
	 * @param ctx the parse tree
	 */
	void exitStaticStmt(milestone_2Parser.StaticStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#deferStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeferStmt(milestone_2Parser.DeferStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#deferStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeferStmt(milestone_2Parser.DeferStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#asmStmt}.
	 * @param ctx the parse tree
	 */
	void enterAsmStmt(milestone_2Parser.AsmStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#asmStmt}.
	 * @param ctx the parse tree
	 */
	void exitAsmStmt(milestone_2Parser.AsmStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#colonBody}.
	 * @param ctx the parse tree
	 */
	void enterColonBody(milestone_2Parser.ColonBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#colonBody}.
	 * @param ctx the parse tree
	 */
	void exitColonBody(milestone_2Parser.ColonBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#identVis}.
	 * @param ctx the parse tree
	 */
	void enterIdentVis(milestone_2Parser.IdentVisContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#identVis}.
	 * @param ctx the parse tree
	 */
	void exitIdentVis(milestone_2Parser.IdentVisContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#identVisDot}.
	 * @param ctx the parse tree
	 */
	void enterIdentVisDot(milestone_2Parser.IdentVisDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#identVisDot}.
	 * @param ctx the parse tree
	 */
	void exitIdentVisDot(milestone_2Parser.IdentVisDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#identWithPragma}.
	 * @param ctx the parse tree
	 */
	void enterIdentWithPragma(milestone_2Parser.IdentWithPragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#identWithPragma}.
	 * @param ctx the parse tree
	 */
	void exitIdentWithPragma(milestone_2Parser.IdentWithPragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(milestone_2Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(milestone_2Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(milestone_2Parser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(milestone_2Parser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(milestone_2Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(milestone_2Parser.StartContext ctx);
}