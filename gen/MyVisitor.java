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
            System.out.println("Vardeclaration "+ctx.vardeclaration().TKN_ID().getText());
            visitBody(ctx.body());
        }else if(ctx.idcall()!=null){
            System.out.println("id");
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

        }
        return null;
    }

    @Override
    public T visitBoolexpr_suffix(CoralLanguageParser.Boolexpr_suffixContext ctx){
        return null;
    }

    @Override
    public T visitBoolexpr1(CoralLanguageParser.Boolexpr1Context ctx){
        return null;
    }

}
