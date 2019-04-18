// Generated from new_milestone.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link new_milestoneParser}.
 */
public interface new_milestoneListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(new_milestoneParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(new_milestoneParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(new_milestoneParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(new_milestoneParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(new_milestoneParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(new_milestoneParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(new_milestoneParser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(new_milestoneParser.ColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#colcom}.
	 * @param ctx the parse tree
	 */
	void enterColcom(new_milestoneParser.ColcomContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#colcom}.
	 * @param ctx the parse tree
	 */
	void exitColcom(new_milestoneParser.ColcomContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(new_milestoneParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(new_milestoneParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperator(new_milestoneParser.PrefixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperator(new_milestoneParser.PrefixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#optInd}.
	 * @param ctx the parse tree
	 */
	void enterOptInd(new_milestoneParser.OptIndContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#optInd}.
	 * @param ctx the parse tree
	 */
	void exitOptInd(new_milestoneParser.OptIndContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#optPar}.
	 * @param ctx the parse tree
	 */
	void enterOptPar(new_milestoneParser.OptParContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#optPar}.
	 * @param ctx the parse tree
	 */
	void exitOptPar(new_milestoneParser.OptParContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(new_milestoneParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(new_milestoneParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#arrowExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrowExpr(new_milestoneParser.ArrowExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#arrowExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrowExpr(new_milestoneParser.ArrowExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(new_milestoneParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(new_milestoneParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(new_milestoneParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(new_milestoneParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(new_milestoneParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(new_milestoneParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#cmpExpr}.
	 * @param ctx the parse tree
	 */
	void enterCmpExpr(new_milestoneParser.CmpExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#cmpExpr}.
	 * @param ctx the parse tree
	 */
	void exitCmpExpr(new_milestoneParser.CmpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#sliceExpr}.
	 * @param ctx the parse tree
	 */
	void enterSliceExpr(new_milestoneParser.SliceExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#sliceExpr}.
	 * @param ctx the parse tree
	 */
	void exitSliceExpr(new_milestoneParser.SliceExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#ampExpr}.
	 * @param ctx the parse tree
	 */
	void enterAmpExpr(new_milestoneParser.AmpExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#ampExpr}.
	 * @param ctx the parse tree
	 */
	void exitAmpExpr(new_milestoneParser.AmpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#plusExpr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(new_milestoneParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#plusExpr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(new_milestoneParser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(new_milestoneParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(new_milestoneParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#dollarExpr}.
	 * @param ctx the parse tree
	 */
	void enterDollarExpr(new_milestoneParser.DollarExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#dollarExpr}.
	 * @param ctx the parse tree
	 */
	void exitDollarExpr(new_milestoneParser.DollarExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(new_milestoneParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(new_milestoneParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#indexExpr}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(new_milestoneParser.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#indexExpr}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(new_milestoneParser.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#indexExprList}.
	 * @param ctx the parse tree
	 */
	void enterIndexExprList(new_milestoneParser.IndexExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#indexExprList}.
	 * @param ctx the parse tree
	 */
	void exitIndexExprList(new_milestoneParser.IndexExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#exprColonEqExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprColonEqExpr(new_milestoneParser.ExprColonEqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#exprColonEqExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprColonEqExpr(new_milestoneParser.ExprColonEqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(new_milestoneParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(new_milestoneParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#dotExpr}.
	 * @param ctx the parse tree
	 */
	void enterDotExpr(new_milestoneParser.DotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#dotExpr}.
	 * @param ctx the parse tree
	 */
	void exitDotExpr(new_milestoneParser.DotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdent(new_milestoneParser.QualifiedIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdent(new_milestoneParser.QualifiedIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#exprColonEqExprList}.
	 * @param ctx the parse tree
	 */
	void enterExprColonEqExprList(new_milestoneParser.ExprColonEqExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#exprColonEqExprList}.
	 * @param ctx the parse tree
	 */
	void exitExprColonEqExprList(new_milestoneParser.ExprColonEqExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#setOrTableConstr}.
	 * @param ctx the parse tree
	 */
	void enterSetOrTableConstr(new_milestoneParser.SetOrTableConstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#setOrTableConstr}.
	 * @param ctx the parse tree
	 */
	void exitSetOrTableConstr(new_milestoneParser.SetOrTableConstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#castExpr}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(new_milestoneParser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#castExpr}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(new_milestoneParser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#parKeyw}.
	 * @param ctx the parse tree
	 */
	void enterParKeyw(new_milestoneParser.ParKeywContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#parKeyw}.
	 * @param ctx the parse tree
	 */
	void exitParKeyw(new_milestoneParser.ParKeywContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#par}.
	 * @param ctx the parse tree
	 */
	void enterPar(new_milestoneParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#par}.
	 * @param ctx the parse tree
	 */
	void exitPar(new_milestoneParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(new_milestoneParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(new_milestoneParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#generalizedLit}.
	 * @param ctx the parse tree
	 */
	void enterGeneralizedLit(new_milestoneParser.GeneralizedLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#generalizedLit}.
	 * @param ctx the parse tree
	 */
	void exitGeneralizedLit(new_milestoneParser.GeneralizedLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#identOrLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIdentOrLiteral(new_milestoneParser.IdentOrLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#identOrLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIdentOrLiteral(new_milestoneParser.IdentOrLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#tupleConstr}.
	 * @param ctx the parse tree
	 */
	void enterTupleConstr(new_milestoneParser.TupleConstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#tupleConstr}.
	 * @param ctx the parse tree
	 */
	void exitTupleConstr(new_milestoneParser.TupleConstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#arrayConstr}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstr(new_milestoneParser.ArrayConstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#arrayConstr}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstr(new_milestoneParser.ArrayConstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#primarySuffix}.
	 * @param ctx the parse tree
	 */
	void enterPrimarySuffix(new_milestoneParser.PrimarySuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#primarySuffix}.
	 * @param ctx the parse tree
	 */
	void exitPrimarySuffix(new_milestoneParser.PrimarySuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(new_milestoneParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(new_milestoneParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(new_milestoneParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(new_milestoneParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#whenExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhenExpr(new_milestoneParser.WhenExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#whenExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhenExpr(new_milestoneParser.WhenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(new_milestoneParser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(new_milestoneParser.PragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#exprColonExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprColonExpr(new_milestoneParser.ExprColonExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#exprColonExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprColonExpr(new_milestoneParser.ExprColonExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#identVis}.
	 * @param ctx the parse tree
	 */
	void enterIdentVis(new_milestoneParser.IdentVisContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#identVis}.
	 * @param ctx the parse tree
	 */
	void exitIdentVis(new_milestoneParser.IdentVisContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#identVisDot}.
	 * @param ctx the parse tree
	 */
	void enterIdentVisDot(new_milestoneParser.IdentVisDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#identVisDot}.
	 * @param ctx the parse tree
	 */
	void exitIdentVisDot(new_milestoneParser.IdentVisDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#identWithPragma}.
	 * @param ctx the parse tree
	 */
	void enterIdentWithPragma(new_milestoneParser.IdentWithPragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#identWithPragma}.
	 * @param ctx the parse tree
	 */
	void exitIdentWithPragma(new_milestoneParser.IdentWithPragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#identWithPragmaDot}.
	 * @param ctx the parse tree
	 */
	void enterIdentWithPragmaDot(new_milestoneParser.IdentWithPragmaDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#identWithPragmaDot}.
	 * @param ctx the parse tree
	 */
	void exitIdentWithPragmaDot(new_milestoneParser.IdentWithPragmaDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#declColonEquals}.
	 * @param ctx the parse tree
	 */
	void enterDeclColonEquals(new_milestoneParser.DeclColonEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#declColonEquals}.
	 * @param ctx the parse tree
	 */
	void exitDeclColonEquals(new_milestoneParser.DeclColonEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#identColonEquals}.
	 * @param ctx the parse tree
	 */
	void enterIdentColonEquals(new_milestoneParser.IdentColonEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#identColonEquals}.
	 * @param ctx the parse tree
	 */
	void exitIdentColonEquals(new_milestoneParser.IdentColonEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#inlTupleDecl}.
	 * @param ctx the parse tree
	 */
	void enterInlTupleDecl(new_milestoneParser.InlTupleDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#inlTupleDecl}.
	 * @param ctx the parse tree
	 */
	void exitInlTupleDecl(new_milestoneParser.InlTupleDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#extTupleDecl}.
	 * @param ctx the parse tree
	 */
	void enterExtTupleDecl(new_milestoneParser.ExtTupleDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#extTupleDecl}.
	 * @param ctx the parse tree
	 */
	void exitExtTupleDecl(new_milestoneParser.ExtTupleDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#tupleClass}.
	 * @param ctx the parse tree
	 */
	void enterTupleClass(new_milestoneParser.TupleClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#tupleClass}.
	 * @param ctx the parse tree
	 */
	void exitTupleClass(new_milestoneParser.TupleClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(new_milestoneParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(new_milestoneParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#paramListArrow}.
	 * @param ctx the parse tree
	 */
	void enterParamListArrow(new_milestoneParser.ParamListArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#paramListArrow}.
	 * @param ctx the parse tree
	 */
	void exitParamListArrow(new_milestoneParser.ParamListArrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#paramListColon}.
	 * @param ctx the parse tree
	 */
	void enterParamListColon(new_milestoneParser.ParamListColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#paramListColon}.
	 * @param ctx the parse tree
	 */
	void exitParamListColon(new_milestoneParser.ParamListColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#doBlock}.
	 * @param ctx the parse tree
	 */
	void enterDoBlock(new_milestoneParser.DoBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#doBlock}.
	 * @param ctx the parse tree
	 */
	void exitDoBlock(new_milestoneParser.DoBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#doBlocks}.
	 * @param ctx the parse tree
	 */
	void enterDoBlocks(new_milestoneParser.DoBlocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#doBlocks}.
	 * @param ctx the parse tree
	 */
	void exitDoBlocks(new_milestoneParser.DoBlocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#procExpr}.
	 * @param ctx the parse tree
	 */
	void enterProcExpr(new_milestoneParser.ProcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#procExpr}.
	 * @param ctx the parse tree
	 */
	void exitProcExpr(new_milestoneParser.ProcExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(new_milestoneParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(new_milestoneParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(new_milestoneParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(new_milestoneParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#typeKeyw}.
	 * @param ctx the parse tree
	 */
	void enterTypeKeyw(new_milestoneParser.TypeKeywContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#typeKeyw}.
	 * @param ctx the parse tree
	 */
	void exitTypeKeyw(new_milestoneParser.TypeKeywContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(new_milestoneParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(new_milestoneParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#typeDesc}.
	 * @param ctx the parse tree
	 */
	void enterTypeDesc(new_milestoneParser.TypeDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#typeDesc}.
	 * @param ctx the parse tree
	 */
	void exitTypeDesc(new_milestoneParser.TypeDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#typeDefAux}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefAux(new_milestoneParser.TypeDefAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#typeDefAux}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefAux(new_milestoneParser.TypeDefAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#macroColon}.
	 * @param ctx the parse tree
	 */
	void enterMacroColon(new_milestoneParser.MacroColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#macroColon}.
	 * @param ctx the parse tree
	 */
	void exitMacroColon(new_milestoneParser.MacroColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(new_milestoneParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(new_milestoneParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(new_milestoneParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(new_milestoneParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#exportStmt}.
	 * @param ctx the parse tree
	 */
	void enterExportStmt(new_milestoneParser.ExportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#exportStmt}.
	 * @param ctx the parse tree
	 */
	void exitExportStmt(new_milestoneParser.ExportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#includeStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStmt(new_milestoneParser.IncludeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#includeStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStmt(new_milestoneParser.IncludeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#fromStmt}.
	 * @param ctx the parse tree
	 */
	void enterFromStmt(new_milestoneParser.FromStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#fromStmt}.
	 * @param ctx the parse tree
	 */
	void exitFromStmt(new_milestoneParser.FromStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(new_milestoneParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(new_milestoneParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#raiseStmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStmt(new_milestoneParser.RaiseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#raiseStmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStmt(new_milestoneParser.RaiseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#yieldStmt}.
	 * @param ctx the parse tree
	 */
	void enterYieldStmt(new_milestoneParser.YieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#yieldStmt}.
	 * @param ctx the parse tree
	 */
	void exitYieldStmt(new_milestoneParser.YieldStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#discardStmt}.
	 * @param ctx the parse tree
	 */
	void enterDiscardStmt(new_milestoneParser.DiscardStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#discardStmt}.
	 * @param ctx the parse tree
	 */
	void exitDiscardStmt(new_milestoneParser.DiscardStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(new_milestoneParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(new_milestoneParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(new_milestoneParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(new_milestoneParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#condStmt}.
	 * @param ctx the parse tree
	 */
	void enterCondStmt(new_milestoneParser.CondStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#condStmt}.
	 * @param ctx the parse tree
	 */
	void exitCondStmt(new_milestoneParser.CondStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(new_milestoneParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(new_milestoneParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#whenStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhenStmt(new_milestoneParser.WhenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#whenStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhenStmt(new_milestoneParser.WhenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(new_milestoneParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(new_milestoneParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#ofBranch}.
	 * @param ctx the parse tree
	 */
	void enterOfBranch(new_milestoneParser.OfBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#ofBranch}.
	 * @param ctx the parse tree
	 */
	void exitOfBranch(new_milestoneParser.OfBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#ofBranches}.
	 * @param ctx the parse tree
	 */
	void enterOfBranches(new_milestoneParser.OfBranchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#ofBranches}.
	 * @param ctx the parse tree
	 */
	void exitOfBranches(new_milestoneParser.OfBranchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void enterCaseStmt(new_milestoneParser.CaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void exitCaseStmt(new_milestoneParser.CaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void enterTryStmt(new_milestoneParser.TryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void exitTryStmt(new_milestoneParser.TryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#tryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTryExpr(new_milestoneParser.TryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#tryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTryExpr(new_milestoneParser.TryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#exceptBlock}.
	 * @param ctx the parse tree
	 */
	void enterExceptBlock(new_milestoneParser.ExceptBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#exceptBlock}.
	 * @param ctx the parse tree
	 */
	void exitExceptBlock(new_milestoneParser.ExceptBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(new_milestoneParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(new_milestoneParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(new_milestoneParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(new_milestoneParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#staticStmt}.
	 * @param ctx the parse tree
	 */
	void enterStaticStmt(new_milestoneParser.StaticStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#staticStmt}.
	 * @param ctx the parse tree
	 */
	void exitStaticStmt(new_milestoneParser.StaticStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#deferStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeferStmt(new_milestoneParser.DeferStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#deferStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeferStmt(new_milestoneParser.DeferStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#asmStmt}.
	 * @param ctx the parse tree
	 */
	void enterAsmStmt(new_milestoneParser.AsmStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#asmStmt}.
	 * @param ctx the parse tree
	 */
	void exitAsmStmt(new_milestoneParser.AsmStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#genericParam}.
	 * @param ctx the parse tree
	 */
	void enterGenericParam(new_milestoneParser.GenericParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#genericParam}.
	 * @param ctx the parse tree
	 */
	void exitGenericParam(new_milestoneParser.GenericParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#genericParamList}.
	 * @param ctx the parse tree
	 */
	void enterGenericParamList(new_milestoneParser.GenericParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#genericParamList}.
	 * @param ctx the parse tree
	 */
	void exitGenericParamList(new_milestoneParser.GenericParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(new_milestoneParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(new_milestoneParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#indAndComment}.
	 * @param ctx the parse tree
	 */
	void enterIndAndComment(new_milestoneParser.IndAndCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#indAndComment}.
	 * @param ctx the parse tree
	 */
	void exitIndAndComment(new_milestoneParser.IndAndCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#routine}.
	 * @param ctx the parse tree
	 */
	void enterRoutine(new_milestoneParser.RoutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#routine}.
	 * @param ctx the parse tree
	 */
	void exitRoutine(new_milestoneParser.RoutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#commentStmt}.
	 * @param ctx the parse tree
	 */
	void enterCommentStmt(new_milestoneParser.CommentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#commentStmt}.
	 * @param ctx the parse tree
	 */
	void exitCommentStmt(new_milestoneParser.CommentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(new_milestoneParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(new_milestoneParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#objectWhen}.
	 * @param ctx the parse tree
	 */
	void enterObjectWhen(new_milestoneParser.ObjectWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#objectWhen}.
	 * @param ctx the parse tree
	 */
	void exitObjectWhen(new_milestoneParser.ObjectWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#objectBranch}.
	 * @param ctx the parse tree
	 */
	void enterObjectBranch(new_milestoneParser.ObjectBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#objectBranch}.
	 * @param ctx the parse tree
	 */
	void exitObjectBranch(new_milestoneParser.ObjectBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#objectBranches}.
	 * @param ctx the parse tree
	 */
	void enterObjectBranches(new_milestoneParser.ObjectBranchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#objectBranches}.
	 * @param ctx the parse tree
	 */
	void exitObjectBranches(new_milestoneParser.ObjectBranchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#objectCase}.
	 * @param ctx the parse tree
	 */
	void enterObjectCase(new_milestoneParser.ObjectCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#objectCase}.
	 * @param ctx the parse tree
	 */
	void exitObjectCase(new_milestoneParser.ObjectCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#objectPart}.
	 * @param ctx the parse tree
	 */
	void enterObjectPart(new_milestoneParser.ObjectPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#objectPart}.
	 * @param ctx the parse tree
	 */
	void exitObjectPart(new_milestoneParser.ObjectPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#typeClassParam}.
	 * @param ctx the parse tree
	 */
	void enterTypeClassParam(new_milestoneParser.TypeClassParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#typeClassParam}.
	 * @param ctx the parse tree
	 */
	void exitTypeClassParam(new_milestoneParser.TypeClassParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#typeClass}.
	 * @param ctx the parse tree
	 */
	void enterTypeClass(new_milestoneParser.TypeClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#typeClass}.
	 * @param ctx the parse tree
	 */
	void exitTypeClass(new_milestoneParser.TypeClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(new_milestoneParser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(new_milestoneParser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#varTuple}.
	 * @param ctx the parse tree
	 */
	void enterVarTuple(new_milestoneParser.VarTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#varTuple}.
	 * @param ctx the parse tree
	 */
	void exitVarTuple(new_milestoneParser.VarTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(new_milestoneParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(new_milestoneParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#bindStmt}.
	 * @param ctx the parse tree
	 */
	void enterBindStmt(new_milestoneParser.BindStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#bindStmt}.
	 * @param ctx the parse tree
	 */
	void exitBindStmt(new_milestoneParser.BindStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#mixinStmt}.
	 * @param ctx the parse tree
	 */
	void enterMixinStmt(new_milestoneParser.MixinStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#mixinStmt}.
	 * @param ctx the parse tree
	 */
	void exitMixinStmt(new_milestoneParser.MixinStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#pragmaStmt}.
	 * @param ctx the parse tree
	 */
	void enterPragmaStmt(new_milestoneParser.PragmaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#pragmaStmt}.
	 * @param ctx the parse tree
	 */
	void exitPragmaStmt(new_milestoneParser.PragmaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(new_milestoneParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(new_milestoneParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#echoStmt}.
	 * @param ctx the parse tree
	 */
	void enterEchoStmt(new_milestoneParser.EchoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#echoStmt}.
	 * @param ctx the parse tree
	 */
	void exitEchoStmt(new_milestoneParser.EchoStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#complexOrSimpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterComplexOrSimpleStmt(new_milestoneParser.ComplexOrSimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#complexOrSimpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitComplexOrSimpleStmt(new_milestoneParser.ComplexOrSimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link new_milestoneParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(new_milestoneParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link new_milestoneParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(new_milestoneParser.StmtContext ctx);
}