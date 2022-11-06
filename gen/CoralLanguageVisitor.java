// Generated from /home/jose/Documentos/Entrega3Lenguajes/Interprete_coral/grammar/CoralLanguage.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoralLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoralLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#inicial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicial(CoralLanguageParser.InicialContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#functionchain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionchain(CoralLanguageParser.FunctionchainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(CoralLanguageParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CoralLanguageParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#returnopt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnopt(CoralLanguageParser.ReturnoptContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CoralLanguageParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(CoralLanguageParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#params_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams_suffix(CoralLanguageParser.Params_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CoralLanguageParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#nonempty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonempty(CoralLanguageParser.NonemptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#vardeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclaration(CoralLanguageParser.VardeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#arrdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrdeclaration(CoralLanguageParser.ArrdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#arrdeclarationopt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrdeclarationopt(CoralLanguageParser.ArrdeclarationoptContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#idcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdcall(CoralLanguageParser.IdcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#idstuff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdstuff(CoralLanguageParser.IdstuffContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#idopt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdopt(CoralLanguageParser.IdoptContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#dotsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotsize(CoralLanguageParser.DotsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#arrpos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrpos(CoralLanguageParser.ArrposContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(CoralLanguageParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#arguments_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_suffix(CoralLanguageParser.Arguments_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(CoralLanguageParser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#inputstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputstat(CoralLanguageParser.InputstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#outputstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputstat(CoralLanguageParser.OutputstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#outputopt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputopt(CoralLanguageParser.OutputoptContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#outputending}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputending(CoralLanguageParser.OutputendingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(CoralLanguageParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#elseifstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifstat(CoralLanguageParser.ElseifstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#elsestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestatement(CoralLanguageParser.ElsestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#whileloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop(CoralLanguageParser.WhileloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(CoralLanguageParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CoralLanguageParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CoralLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#expression_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_suffix(CoralLanguageParser.Expression_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(CoralLanguageParser.Expression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#expression1_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1_suffix(CoralLanguageParser.Expression1_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression2(CoralLanguageParser.Expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#aritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritm(CoralLanguageParser.AritmContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#plusneg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusneg(CoralLanguageParser.PlusnegContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#idexpropt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdexpropt(CoralLanguageParser.IdexproptContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr(CoralLanguageParser.BoolexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#boolexpr_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr_suffix(CoralLanguageParser.Boolexpr_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#boolexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr1(CoralLanguageParser.Boolexpr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#boolexpr1_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr1_suffix(CoralLanguageParser.Boolexpr1_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#boolexpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr2(CoralLanguageParser.Boolexpr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#boolexpr2_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr2_suffix(CoralLanguageParser.Boolexpr2_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#boolexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr3(CoralLanguageParser.Boolexpr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#boolexpr3_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr3_suffix(CoralLanguageParser.Boolexpr3_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#boolexpr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr4(CoralLanguageParser.Boolexpr4Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#boolexpr4_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr4_suffix(CoralLanguageParser.Boolexpr4_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#boolexpr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr5(CoralLanguageParser.Boolexpr5Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#boolexpr5_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr5_suffix(CoralLanguageParser.Boolexpr5_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#boolexpr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr6(CoralLanguageParser.Boolexpr6Context ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(CoralLanguageParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#comparers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparers(CoralLanguageParser.ComparersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#builtin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltin(CoralLanguageParser.BuiltinContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#sqrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt(CoralLanguageParser.SqrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#srn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrn(CoralLanguageParser.SrnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#rdm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdm(CoralLanguageParser.RdmContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#abs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs(CoralLanguageParser.AbsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoralLanguageParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(CoralLanguageParser.PowContext ctx);
}