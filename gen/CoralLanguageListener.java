// Generated from /home/jose/Documentos/Entrega3.0lenguajes/Interprete_coral/grammar/CoralLanguage.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoralLanguageParser}.
 */
public interface CoralLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#inicial}.
	 * @param ctx the parse tree
	 */
	void enterInicial(CoralLanguageParser.InicialContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#inicial}.
	 * @param ctx the parse tree
	 */
	void exitInicial(CoralLanguageParser.InicialContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#functionchain}.
	 * @param ctx the parse tree
	 */
	void enterFunctionchain(CoralLanguageParser.FunctionchainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#functionchain}.
	 * @param ctx the parse tree
	 */
	void exitFunctionchain(CoralLanguageParser.FunctionchainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(CoralLanguageParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(CoralLanguageParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CoralLanguageParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CoralLanguageParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#returnopt}.
	 * @param ctx the parse tree
	 */
	void enterReturnopt(CoralLanguageParser.ReturnoptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#returnopt}.
	 * @param ctx the parse tree
	 */
	void exitReturnopt(CoralLanguageParser.ReturnoptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CoralLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CoralLanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CoralLanguageParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CoralLanguageParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#params_suffix}.
	 * @param ctx the parse tree
	 */
	void enterParams_suffix(CoralLanguageParser.Params_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#params_suffix}.
	 * @param ctx the parse tree
	 */
	void exitParams_suffix(CoralLanguageParser.Params_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CoralLanguageParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CoralLanguageParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#nonempty}.
	 * @param ctx the parse tree
	 */
	void enterNonempty(CoralLanguageParser.NonemptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#nonempty}.
	 * @param ctx the parse tree
	 */
	void exitNonempty(CoralLanguageParser.NonemptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVardeclaration(CoralLanguageParser.VardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVardeclaration(CoralLanguageParser.VardeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#arrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrdeclaration(CoralLanguageParser.ArrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#arrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrdeclaration(CoralLanguageParser.ArrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#arrdeclarationopt}.
	 * @param ctx the parse tree
	 */
	void enterArrdeclarationopt(CoralLanguageParser.ArrdeclarationoptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#arrdeclarationopt}.
	 * @param ctx the parse tree
	 */
	void exitArrdeclarationopt(CoralLanguageParser.ArrdeclarationoptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#idcall}.
	 * @param ctx the parse tree
	 */
	void enterIdcall(CoralLanguageParser.IdcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#idcall}.
	 * @param ctx the parse tree
	 */
	void exitIdcall(CoralLanguageParser.IdcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#idstuff}.
	 * @param ctx the parse tree
	 */
	void enterIdstuff(CoralLanguageParser.IdstuffContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#idstuff}.
	 * @param ctx the parse tree
	 */
	void exitIdstuff(CoralLanguageParser.IdstuffContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#idopt}.
	 * @param ctx the parse tree
	 */
	void enterIdopt(CoralLanguageParser.IdoptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#idopt}.
	 * @param ctx the parse tree
	 */
	void exitIdopt(CoralLanguageParser.IdoptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#dotsize}.
	 * @param ctx the parse tree
	 */
	void enterDotsize(CoralLanguageParser.DotsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#dotsize}.
	 * @param ctx the parse tree
	 */
	void exitDotsize(CoralLanguageParser.DotsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#arrpos}.
	 * @param ctx the parse tree
	 */
	void enterArrpos(CoralLanguageParser.ArrposContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#arrpos}.
	 * @param ctx the parse tree
	 */
	void exitArrpos(CoralLanguageParser.ArrposContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CoralLanguageParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CoralLanguageParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#arguments_suffix}.
	 * @param ctx the parse tree
	 */
	void enterArguments_suffix(CoralLanguageParser.Arguments_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#arguments_suffix}.
	 * @param ctx the parse tree
	 */
	void exitArguments_suffix(CoralLanguageParser.Arguments_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(CoralLanguageParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(CoralLanguageParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#inputstat}.
	 * @param ctx the parse tree
	 */
	void enterInputstat(CoralLanguageParser.InputstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#inputstat}.
	 * @param ctx the parse tree
	 */
	void exitInputstat(CoralLanguageParser.InputstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#outputstat}.
	 * @param ctx the parse tree
	 */
	void enterOutputstat(CoralLanguageParser.OutputstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#outputstat}.
	 * @param ctx the parse tree
	 */
	void exitOutputstat(CoralLanguageParser.OutputstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#outputopt}.
	 * @param ctx the parse tree
	 */
	void enterOutputopt(CoralLanguageParser.OutputoptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#outputopt}.
	 * @param ctx the parse tree
	 */
	void exitOutputopt(CoralLanguageParser.OutputoptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#outputending}.
	 * @param ctx the parse tree
	 */
	void enterOutputending(CoralLanguageParser.OutputendingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#outputending}.
	 * @param ctx the parse tree
	 */
	void exitOutputending(CoralLanguageParser.OutputendingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(CoralLanguageParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(CoralLanguageParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#elseifstat}.
	 * @param ctx the parse tree
	 */
	void enterElseifstat(CoralLanguageParser.ElseifstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#elseifstat}.
	 * @param ctx the parse tree
	 */
	void exitElseifstat(CoralLanguageParser.ElseifstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void enterElsestatement(CoralLanguageParser.ElsestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void exitElsestatement(CoralLanguageParser.ElsestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(CoralLanguageParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(CoralLanguageParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(CoralLanguageParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(CoralLanguageParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CoralLanguageParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CoralLanguageParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CoralLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CoralLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#expression_suffix}.
	 * @param ctx the parse tree
	 */
	void enterExpression_suffix(CoralLanguageParser.Expression_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#expression_suffix}.
	 * @param ctx the parse tree
	 */
	void exitExpression_suffix(CoralLanguageParser.Expression_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(CoralLanguageParser.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(CoralLanguageParser.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#expression1_suffix}.
	 * @param ctx the parse tree
	 */
	void enterExpression1_suffix(CoralLanguageParser.Expression1_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#expression1_suffix}.
	 * @param ctx the parse tree
	 */
	void exitExpression1_suffix(CoralLanguageParser.Expression1_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterExpression2(CoralLanguageParser.Expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitExpression2(CoralLanguageParser.Expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#aritm}.
	 * @param ctx the parse tree
	 */
	void enterAritm(CoralLanguageParser.AritmContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#aritm}.
	 * @param ctx the parse tree
	 */
	void exitAritm(CoralLanguageParser.AritmContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#plusneg}.
	 * @param ctx the parse tree
	 */
	void enterPlusneg(CoralLanguageParser.PlusnegContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#plusneg}.
	 * @param ctx the parse tree
	 */
	void exitPlusneg(CoralLanguageParser.PlusnegContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#idexpropt}.
	 * @param ctx the parse tree
	 */
	void enterIdexpropt(CoralLanguageParser.IdexproptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#idexpropt}.
	 * @param ctx the parse tree
	 */
	void exitIdexpropt(CoralLanguageParser.IdexproptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(CoralLanguageParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(CoralLanguageParser.BoolexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#boolexpr_suffix}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr_suffix(CoralLanguageParser.Boolexpr_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#boolexpr_suffix}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr_suffix(CoralLanguageParser.Boolexpr_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#boolexpr1}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr1(CoralLanguageParser.Boolexpr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#boolexpr1}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr1(CoralLanguageParser.Boolexpr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#boolexpr1_suffix}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr1_suffix(CoralLanguageParser.Boolexpr1_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#boolexpr1_suffix}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr1_suffix(CoralLanguageParser.Boolexpr1_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#boolexpr2}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr2(CoralLanguageParser.Boolexpr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#boolexpr2}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr2(CoralLanguageParser.Boolexpr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#boolexpr2_suffix}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr2_suffix(CoralLanguageParser.Boolexpr2_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#boolexpr2_suffix}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr2_suffix(CoralLanguageParser.Boolexpr2_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#boolexpr3}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr3(CoralLanguageParser.Boolexpr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#boolexpr3}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr3(CoralLanguageParser.Boolexpr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#boolexpr3_suffix}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr3_suffix(CoralLanguageParser.Boolexpr3_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#boolexpr3_suffix}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr3_suffix(CoralLanguageParser.Boolexpr3_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#boolexpr4}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr4(CoralLanguageParser.Boolexpr4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#boolexpr4}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr4(CoralLanguageParser.Boolexpr4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#boolexpr4_suffix}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr4_suffix(CoralLanguageParser.Boolexpr4_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#boolexpr4_suffix}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr4_suffix(CoralLanguageParser.Boolexpr4_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#boolexpr5}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr5(CoralLanguageParser.Boolexpr5Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#boolexpr5}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr5(CoralLanguageParser.Boolexpr5Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#boolexpr5_suffix}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr5_suffix(CoralLanguageParser.Boolexpr5_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#boolexpr5_suffix}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr5_suffix(CoralLanguageParser.Boolexpr5_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#boolexpr6}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr6(CoralLanguageParser.Boolexpr6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#boolexpr6}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr6(CoralLanguageParser.Boolexpr6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(CoralLanguageParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(CoralLanguageParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#comparers}.
	 * @param ctx the parse tree
	 */
	void enterComparers(CoralLanguageParser.ComparersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#comparers}.
	 * @param ctx the parse tree
	 */
	void exitComparers(CoralLanguageParser.ComparersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#builtin}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin(CoralLanguageParser.BuiltinContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#builtin}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin(CoralLanguageParser.BuiltinContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void enterSqrt(CoralLanguageParser.SqrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void exitSqrt(CoralLanguageParser.SqrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#srn}.
	 * @param ctx the parse tree
	 */
	void enterSrn(CoralLanguageParser.SrnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#srn}.
	 * @param ctx the parse tree
	 */
	void exitSrn(CoralLanguageParser.SrnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#rdm}.
	 * @param ctx the parse tree
	 */
	void enterRdm(CoralLanguageParser.RdmContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#rdm}.
	 * @param ctx the parse tree
	 */
	void exitRdm(CoralLanguageParser.RdmContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#abs}.
	 * @param ctx the parse tree
	 */
	void enterAbs(CoralLanguageParser.AbsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#abs}.
	 * @param ctx the parse tree
	 */
	void exitAbs(CoralLanguageParser.AbsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoralLanguageParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(CoralLanguageParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoralLanguageParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(CoralLanguageParser.PowContext ctx);
}