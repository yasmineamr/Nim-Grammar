// Generated from test.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(testParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(testParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(testParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(testParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(testParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(testParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(testParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(testParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(testParser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(testParser.ColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(testParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(testParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(testParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(testParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStmt(testParser.DeclareStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStmt(testParser.DeclareStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(testParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(testParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#plusStmt}.
	 * @param ctx the parse tree
	 */
	void enterPlusStmt(testParser.PlusStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#plusStmt}.
	 * @param ctx the parse tree
	 */
	void exitPlusStmt(testParser.PlusStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(testParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(testParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(testParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(testParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(testParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(testParser.StartContext ctx);
}