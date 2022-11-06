import controller.VariableController;

import java.util.HashMap;
import java.lang.Math;
public class MyVisitor<T> extends CoralLanguageBaseVisitor<T> {
    HashMap<String,Object> table = new HashMap<>();
    @Override
    public T visitInicial(CoralLanguageParser.InicialContext ctx){
        if(ctx.funcion()!=null){
            System.out.println("Función");
        }else{
            return visitChildren(ctx);
        }
        return null;
    }

    @Override
    public T visitNonempty(CoralLanguageParser.NonemptyContext ctx){
        System.out.println("NonEmpty ");
        if(ctx.vardeclaration()!=null){
            VariableController.INSTANCE.addFromVardeclarationContext(ctx.vardeclaration());
            visitBody(ctx.body());
        }else if(ctx.idcall()!=null){
            System.out.println("id");
            System.out.println(ctx.idcall().getText());
            visitBody(ctx.body());
        }else if(ctx.outputstat()!=null){
            System.out.println("Output");
            visitBody(ctx.body());
        }else if(ctx.forloop()!=null){
            System.out.println("for");
            visitNonempty(ctx.nonempty());
        }else if(ctx.whileloop()!=null){
            System.out.println("While");
            visitNonempty(ctx.nonempty());
        }else if(ctx.ifstatement()!=null){
            System.out.println("if");
        }else if(ctx.srn()!=null){
            System.out.println("Srn");
            visitBody(ctx.body());
        }
        return null;
    }

    @Override
    public T visitBody(CoralLanguageParser.BodyContext ctx){
        if(ctx.nonempty()!=null){
            visitNonempty(ctx.nonempty());
        }
        return null;
    }


    @Override
    public T visitExpression(CoralLanguageParser.ExpressionContext ctx){
        if(ctx.expression_suffix()!=null){
            Double res = (Double)visitExpression1(ctx.expression1())+(Double)visitExpression_suffix(ctx.expression_suffix());
            System.out.println(res);
            return (T)res;

        }else {
            return visitExpression1(ctx.expression1());
        }
    }

    @Override
    public T visitExpression_suffix(CoralLanguageParser.Expression_suffixContext ctx){
        if(ctx.expression_suffix()!=null){
            Double res;
            if(ctx.TKN_MINUS()!=null){
                res = -(Double)visitExpression1(ctx.expression1()) + (Double)visitExpression_suffix(ctx.expression_suffix());
            }else{
                res = (Double)visitExpression1(ctx.expression1()) + (Double)visitExpression_suffix(ctx.expression_suffix());
            }
            return (T)res;
        }else{
            Double res;
            if(ctx.TKN_MINUS()!=null){
                res = -(Double)visitExpression1(ctx.expression1()) ;
            }else{
                res = (Double)visitExpression1(ctx.expression1())  ;
            }
            return (T)res;
        }
    }

    @Override
    public T visitExpression1(CoralLanguageParser.Expression1Context ctx){
        if(ctx.expression1_suffix()!=null){
            Double res;
            if(ctx.expression1_suffix().aritm().TKN_DIV()!=null){
                if(ctx.plusneg().TKN_MINUS()!=null){
                    res = -(Double)visitExpression2(ctx.expression2())/(Double)visitExpression1_suffix(ctx.expression1_suffix());
                }else{
                    res = (Double)visitExpression2(ctx.expression2())/(Double)visitExpression1_suffix(ctx.expression1_suffix());
                }
            }else if(ctx.expression1_suffix().aritm().TKN_MOD()!=null){
                if(ctx.plusneg().TKN_MINUS()!=null){
                    res = -(Double)visitExpression2(ctx.expression2())%(Double)visitExpression1_suffix(ctx.expression1_suffix());
                }else{
                    res = (Double)visitExpression2(ctx.expression2())%(Double)visitExpression1_suffix(ctx.expression1_suffix());
                }
            }else if(ctx.expression1_suffix().aritm().TKN_TIMES()!=null){
                if(ctx.plusneg().TKN_MINUS()!=null){
                    res = -(Double)visitExpression2(ctx.expression2())*(Double)visitExpression1_suffix(ctx.expression1_suffix());
                }else{
                    res = (Double)visitExpression2(ctx.expression2())*(Double)visitExpression1_suffix(ctx.expression1_suffix());
                }
            }else{
                res = 0.0;
            }

            return (T)res;
        }else{
            Double res;
            if(ctx.plusneg().TKN_MINUS()!=null){
                res = -(Double)visitExpression2(ctx.expression2());
            }else{
                res = (Double)visitExpression2(ctx.expression2());
            }
            return (T)res;
        }
    }

    @Override
    public T visitExpression1_suffix(CoralLanguageParser.Expression1_suffixContext ctx){
        if(ctx.expression1_suffix()!=null){
            Double res;
            if(ctx.expression1_suffix().aritm().TKN_DIV()!=null){
                if(ctx.plusneg().TKN_MINUS()!=null){
                    res = -(Double)visitExpression2(ctx.expression2())/(Double)visitExpression1_suffix(ctx.expression1_suffix());
                }else{
                    res = (Double)visitExpression2(ctx.expression2())/(Double)visitExpression1_suffix(ctx.expression1_suffix());
                }
            }else if(ctx.expression1_suffix().aritm().TKN_MOD()!=null){
                if(ctx.plusneg().TKN_MINUS()!=null){
                    res = -(Double)visitExpression2(ctx.expression2())%(Double)visitExpression1_suffix(ctx.expression1_suffix());
                }else{
                    res = (Double)visitExpression2(ctx.expression2())%(Double)visitExpression1_suffix(ctx.expression1_suffix());
                }
            }else if(ctx.expression1_suffix().aritm().TKN_TIMES()!=null){
                if(ctx.plusneg().TKN_MINUS()!=null){
                    res = -(Double)visitExpression2(ctx.expression2())*(Double)visitExpression1_suffix(ctx.expression1_suffix());
                }else{
                    res = (Double)visitExpression2(ctx.expression2())*(Double)visitExpression1_suffix(ctx.expression1_suffix());
                }
            }else{
                res = 0.0;
            }

            return (T)res;
        }else{
            Double res;
            if(ctx.plusneg().TKN_MINUS()!=null){
                res = -(Double)visitExpression2(ctx.expression2());
            }else{
                res = (Double)visitExpression2(ctx.expression2());
            }
            return (T)res;
        }
    }
    @Override
    public T visitExpression2(CoralLanguageParser.Expression2Context ctx){
        if(ctx.idexpropt()!=null){
            System.out.println("Id access");
        }else if(ctx.number()!=null){
            return (T)(Double)Double.parseDouble(ctx.number().getText());
        }else if(ctx.expression()!=null){
            return visitExpression(ctx.expression());
        }else if(ctx.builtin()!=null){
            return visitBuiltin(ctx.builtin());
        }
        return null;
    }

    @Override
    public T visitBuiltin(CoralLanguageParser.BuiltinContext ctx) {
        if(ctx.sqrt()!=null){
            return (T)(Double)Math.sqrt((Double)visitExpression(ctx.sqrt().expression()));
        }else if(ctx.rdm()!=null){
            Double min = (Double)visitExpression(ctx.rdm().expression(0));
            Double max = (Double)visitExpression(ctx.rdm().expression(1));
            if(max<min){
                int line = ctx.rdm().TKN_OPENING_PAR().getSymbol().getLine();
                int col = ctx.rdm().TKN_CLOSING_PAR().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, los límites están mal definidos.\n", line, col);
                System.exit(-1);
                return null;
            }
            Double random = Math.random()*(max-min+1)+min;
            return (T)random;
        }else if(ctx.abs()!=null){
            return (T)(Double)Math.abs((Double)visitExpression(ctx.abs().expression()));
        }else if(ctx.pow()!=null){
            return (T)(Double)Math.pow((Double)visitExpression(ctx.pow().expression(0)),(Double)visitExpression(ctx.pow().expression(1)));
        }
        return null;
    }

    @Override
    public T visitBoolexpr(CoralLanguageParser.BoolexprContext ctx){
        if(ctx.boolexpr_suffix()!=null){
            Boolean res = (Boolean)visitBoolexpr1(ctx.boolexpr1()) || (Boolean)visitBoolexpr_suffix(ctx.boolexpr_suffix());
            return (T)res;
        }
        return visitBoolexpr1(ctx.boolexpr1());

    }

    @Override
    public T visitBoolexpr_suffix(CoralLanguageParser.Boolexpr_suffixContext ctx){
        if(ctx.boolexpr_suffix()!=null){
            Boolean res = (Boolean)visitBoolexpr1(ctx.boolexpr1()) || (Boolean)visitBoolexpr_suffix(ctx.boolexpr_suffix());
            return (T)res;
        }
        return visitBoolexpr1(ctx.boolexpr1());

    }

    @Override
    public T visitBoolexpr1(CoralLanguageParser.Boolexpr1Context ctx){
        if(ctx.boolexpr1_suffix()!=null){
            Boolean res = (Boolean)visitBoolexpr2(ctx.boolexpr2()) || (Boolean)visitBoolexpr1_suffix(ctx.boolexpr1_suffix());
            return (T)res;
        }
        return visitBoolexpr2(ctx.boolexpr2());
    }

    @Override
    public T visitBoolexpr1_suffix(CoralLanguageParser.Boolexpr1_suffixContext ctx) {
        if(ctx.boolexpr1_suffix()!=null){
            Boolean res = (Boolean)visitBoolexpr2(ctx.boolexpr2()) || (Boolean)visitBoolexpr1_suffix(ctx.boolexpr1_suffix());
            return (T)res;
        }
        return visitBoolexpr2(ctx.boolexpr2());
    }

    @Override
    public T visitBoolexpr2(CoralLanguageParser.Boolexpr2Context ctx) {
        if(ctx.boolexpr2_suffix().equals().TKN_EQUAL()!=null){
            Boolean res = (Boolean)visitBoolexpr3(ctx.boolexpr3()) == (Boolean)visitBoolexpr2_suffix(ctx.boolexpr2_suffix());
            return (T)res;
        }else if(ctx.boolexpr2_suffix().equals().TKN_NEQ()!=null){
            Boolean res = (Boolean)visitBoolexpr3(ctx.boolexpr3()) != (Boolean)visitBoolexpr2_suffix(ctx.boolexpr2_suffix());
            return (T)res;
        }
        return (T)visitBoolexpr3(ctx.boolexpr3());
    }

    @Override public T
    visitBoolexpr2_suffix(CoralLanguageParser.Boolexpr2_suffixContext ctx) {
        if(ctx.boolexpr2_suffix().equals().TKN_EQUAL()!=null){
            Boolean res = (Boolean)visitBoolexpr3(ctx.boolexpr3()) == (Boolean)visitBoolexpr2_suffix(ctx.boolexpr2_suffix());
            return (T)res;
        }else if(ctx.boolexpr2_suffix().equals().TKN_NEQ()!=null){
            Boolean res = (Boolean)visitBoolexpr3(ctx.boolexpr3()) != (Boolean)visitBoolexpr2_suffix(ctx.boolexpr2_suffix());
            return (T)res;
        }
        return (T)visitBoolexpr3(ctx.boolexpr3());
    }

    @Override
    public T visitBoolexpr3(CoralLanguageParser.Boolexpr3Context ctx) {
        if(ctx.boolexpr3_suffix().comparers().TKN_LESS()!=null){
            Boolean res = (Double)visitBoolexpr4(ctx.boolexpr4()) < (Double)visitBoolexpr3_suffix(ctx.boolexpr3_suffix());
            return (T)res;
        }else if(ctx.boolexpr3_suffix().comparers().TKN_LEQ()!=null){
            Boolean res = (Double)visitBoolexpr4(ctx.boolexpr4()) <= (Double)visitBoolexpr3_suffix(ctx.boolexpr3_suffix());
            return (T)res;
        }else if(ctx.boolexpr3_suffix().comparers().TKN_GREATER()!=null){
            Boolean res = (Double)visitBoolexpr4(ctx.boolexpr4()) > (Double)visitBoolexpr3_suffix(ctx.boolexpr3_suffix());
            return (T)res;
        }else if(ctx.boolexpr3_suffix().comparers().TKN_GEQ()!=null){
            Boolean res = (Double)visitBoolexpr4(ctx.boolexpr4()) >= (Double)visitBoolexpr3_suffix(ctx.boolexpr3_suffix());
            return (T)res;
        }
        return (T)visitBoolexpr4(ctx.boolexpr4());
    }

    @Override
    public T visitBoolexpr3_suffix(CoralLanguageParser.Boolexpr3_suffixContext ctx) {
        if(ctx.boolexpr3_suffix().comparers().TKN_LESS()!=null){
            Boolean res = (Double)visitBoolexpr4(ctx.boolexpr4()) < (Double)visitBoolexpr3_suffix(ctx.boolexpr3_suffix());
            return (T)res;
        }else if(ctx.boolexpr3_suffix().comparers().TKN_LEQ()!=null){
            Boolean res = (Double)visitBoolexpr4(ctx.boolexpr4()) <= (Double)visitBoolexpr3_suffix(ctx.boolexpr3_suffix());
            return (T)res;
        }else if(ctx.boolexpr3_suffix().comparers().TKN_GREATER()!=null){
            Boolean res = (Double)visitBoolexpr4(ctx.boolexpr4()) > (Double)visitBoolexpr3_suffix(ctx.boolexpr3_suffix());
            return (T)res;
        }else if(ctx.boolexpr3_suffix().comparers().TKN_GEQ()!=null){
            Boolean res = (Double)visitBoolexpr4(ctx.boolexpr4()) >= (Double)visitBoolexpr3_suffix(ctx.boolexpr3_suffix());
            return (T)res;
        }
        return (T)visitBoolexpr4(ctx.boolexpr4());
    }

    @Override
    public T visitBoolexpr4(CoralLanguageParser.Boolexpr4Context ctx) {
        if(ctx.boolexpr4_suffix().TKN_MINUS()!=null){
            Double res = (Double)visitBoolexpr5(ctx.boolexpr5()) - (Double)visitBoolexpr4_suffix(ctx.boolexpr4_suffix());
            return (T)res;
        }else if(ctx.boolexpr4_suffix().TKN_PLUS()!=null){
            Double res = (Double)visitBoolexpr5(ctx.boolexpr5()) + (Double)visitBoolexpr4_suffix(ctx.boolexpr4_suffix());
            return (T)res;
        }
        return visitBoolexpr5(ctx.boolexpr5());
    }

    @Override
    public T visitBoolexpr4_suffix(CoralLanguageParser.Boolexpr4_suffixContext ctx) {
        if(ctx.boolexpr4_suffix().TKN_MINUS()!=null){
            Double res = (Double)visitBoolexpr5(ctx.boolexpr5()) - (Double)visitBoolexpr4_suffix(ctx.boolexpr4_suffix());
            return (T)res;
        }else if(ctx.boolexpr4_suffix().TKN_PLUS()!=null){
            Double res = (Double)visitBoolexpr5(ctx.boolexpr5()) + (Double)visitBoolexpr4_suffix(ctx.boolexpr4_suffix());
            return (T)res;
        }
        return visitBoolexpr5(ctx.boolexpr5());
    }

    @Override
    public T visitBoolexpr5(CoralLanguageParser.Boolexpr5Context ctx) {
        Double res = (Double)visitBoolexpr6(ctx.boolexpr6());
        if(ctx.plusneg().TKN_MINUS()!=null)res = -res;
        if(ctx.boolexpr5_suffix().aritm().TKN_MOD()!=null){
            res = res % (Double)visitBoolexpr5_suffix(ctx.boolexpr5_suffix());
        }else if(ctx.boolexpr5_suffix().aritm().TKN_DIV()!=null){
            res = res / (Double)visitBoolexpr5_suffix(ctx.boolexpr5_suffix());
        }else if(ctx.boolexpr5_suffix().aritm().TKN_TIMES()!=null){
            res = res * (Double)visitBoolexpr5_suffix(ctx.boolexpr5_suffix());
        }
        return (T)res;
    }


    @Override
    public T visitBoolexpr5_suffix(CoralLanguageParser.Boolexpr5_suffixContext ctx) {
        Double res = (Double)visitBoolexpr6(ctx.boolexpr6());
        if(ctx.plusneg().TKN_MINUS()!=null)res = -res;
        if(ctx.boolexpr5_suffix().aritm().TKN_MOD()!=null){
            res = res % (Double)visitBoolexpr5_suffix(ctx.boolexpr5_suffix());
        }else if(ctx.boolexpr5_suffix().aritm().TKN_DIV()!=null){
            res = res / (Double)visitBoolexpr5_suffix(ctx.boolexpr5_suffix());
        }else if(ctx.boolexpr5_suffix().aritm().TKN_TIMES()!=null){
            res = res * (Double)visitBoolexpr5_suffix(ctx.boolexpr5_suffix());
        }
        return (T)res;
    }

    @Override
    public T visitBoolexpr6(CoralLanguageParser.Boolexpr6Context ctx) {
        if(ctx.NOT()!=null){
            Boolean boolexpr = !(Boolean)visitBoolexpr(ctx.boolexpr());
            Double res;
            if(boolexpr)res = 1.0;
            else res = 0.0;
            return (T)res;
        }else if(ctx.builtin()!=null){
            return visitBuiltin(ctx.builtin());
        }else if(ctx.number()!=null){
            return (T)(Double)Double.parseDouble(ctx.number().getText());
        }else if(ctx.TKN_ID()!=null){
            System.out.println("Id access");
        }else{
            Boolean boolexpr = !(Boolean)visitBoolexpr(ctx.boolexpr());
            Double res;
            if(boolexpr)res = 1.0;
            else res = 0.0;
            return (T)res;
        }
        return null;
    }


}
