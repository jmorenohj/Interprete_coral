import controller.AssignVariableStrategy;
import controller.StackController;
import controller.VariableController;
import models.DataTypes;
import models.Variable;
import java.util.ArrayList;

import java.util.*;
import java.text.NumberFormat;
import java.lang.Math;

public class MyVisitor<T> extends CoralLanguageBaseVisitor<T> {


    Scanner scanner = new Scanner(System.in);

    @Override
    public T visitInicial(CoralLanguageParser.InicialContext ctx) {

        if (ctx.funcion() != null) {
            CoralLanguageParser.FunctionchainContext funChain = ctx.functionchain();
            VariableController.INSTANCE.addVariable(ctx.funcion().TKN_ID().getText(),"FUNCTION",ctx.funcion());
            while(funChain.FUNCTION()!=null){
                VariableController.INSTANCE.addVariable(funChain.funcion().TKN_ID().getText(),"FUNCTION",funChain.funcion());
                funChain = funChain.functionchain();
            }
            return visitMain(ctx.main());
        } else {
            return visitChildren(ctx);
        }
    }

    @Override
    public T visitMain(CoralLanguageParser.MainContext ctx) {
        visitNonempty(ctx.nonempty());
        visitBody(ctx.body());
        return null;
    }

    @Override
    public T visitFuncion(CoralLanguageParser.FuncionContext ctx){
        VariableController.INSTANCE.createScope(ctx.TKN_ID().getText());
        Boolean returns = ctx.returnopt().NOTHING()==null;
        String returnVarName;
        Variable returnVar;
        if(returns){
            returnVarName = ctx.returnopt().vardeclaration().TKN_ID().getText();
            VariableController.INSTANCE.addVariable(returnVarName,ctx.returnopt().vardeclaration().type().getText(),null,ctx.TKN_ID().getText());
            returnVar = VariableController.INSTANCE.getVariable(returnVarName,ctx.TKN_ID().getText());
        }

        visitNonempty(ctx.nonempty());






        return null;
    }

    @Override
    public T visitBody(CoralLanguageParser.BodyContext ctx){
        if(ctx.nonempty()!=null) {
            return visitNonempty(ctx.nonempty());
        }
        return null;
    }

    @Override
    public T visitNonempty(CoralLanguageParser.NonemptyContext ctx) {
        if (ctx.vardeclaration() != null) {
            System.out.println(StackController.INSTANCE.getScope());
            VariableController.INSTANCE.addFromStackContext(ctx.vardeclaration(),StackController.INSTANCE.getScope());
            visitBody(ctx.body());
        } else if (ctx.idcall() != null) {
            visitIdcall(ctx.idcall());
            visitBody(ctx.body());
        } else if (ctx.outputstat() != null) {
            visitOutputstat(ctx.outputstat());
            visitBody(ctx.body());
        } else if (ctx.forloop() != null) {
            visitForloop(ctx.forloop());
        } else if (ctx.whileloop() != null) {
            System.out.println("While");
            visitWhileloop(ctx.whileloop());
        } else if (ctx.ifstatement() != null) {
            System.out.println("if");
        } else if (ctx.srn() != null) {
            System.out.println("Srn");
            visitBody(ctx.body());
        }
        return null;
    }

    @Override
    public T visitForloop(CoralLanguageParser.ForloopContext ctx) {
        System.out.println("##### FOR LOOP #####");
        System.out.println(ctx.getText());
        return null;
    }

    @Override
    public T visitIdcall(CoralLanguageParser.IdcallContext ctx) {
        String currentVarName = ctx.TKN_ID().getText();
        Variable var = VariableController.INSTANCE.getVariable(currentVarName);
        System.out.println(ctx.arguments());
        if (ctx.arguments() == null) {
            AssignVariableStrategy strategy = AssignVariableStrategy.ONLY_VALUE;
            Integer arrPosition = null;
            //WHEN IS A VAR
            if (!ctx.idopt().getText().isEmpty()) {
                // WHEN IS ACCESSING INTO AN ARR POSITION OR DOT_SIZE
                if (ctx.idopt().arrpos() != null && !ctx.idopt().arrpos().getText().isEmpty()) {
                    //WHEN IS ACCESSING INTO AN ARRPOSITION
                    strategy = AssignVariableStrategy.ARR_POSITION;
                    double value = Double.parseDouble(this.visitExpression(ctx.idopt().arrpos().expression()).toString());
                    arrPosition = (int) value;
                } else {
                    strategy = AssignVariableStrategy.DOT_SIZE;
                }
            }
            //ASSIGNATION VALUE
            Double valueToAssign;
            if (ctx.idstuff().assignation().expression() != null) {
                valueToAssign = Double.parseDouble(this.visitExpression(ctx.idstuff().assignation().expression()).toString());
            } else {
                valueToAssign = scanner.nextDouble();
            }
            switch (strategy) {
                case DOT_SIZE -> VariableController.INSTANCE.setArraySize(currentVarName, valueToAssign.intValue());
                case ARR_POSITION ->
                        VariableController.INSTANCE.setArrayElement(currentVarName, arrPosition, valueToAssign.intValue());
                case ONLY_VALUE -> VariableController.INSTANCE.setVariable(currentVarName, valueToAssign);
            }
            System.out.println(VariableController.INSTANCE.getVariable(currentVarName));
        } else {
            //WHEN IS A CALL FUNCTION
            System.out.println(ctx.TKN_CLOSING_PAR());
            System.out.println(ctx.arguments());
            System.out.println(ctx.TKN_CLOSING_PAR());
        }
        return visitChildren(ctx);
    }




    @Override
    public T visitOutputstat(CoralLanguageParser.OutputstatContext ctx) {
        if (ctx.outputopt().TKN_STR() != null) {
            System.out.println(ctx.outputopt().TKN_STR().getText());
        } else {
            Double res = (Double) visitExpression(ctx.outputopt().expression());
            NumberFormat nf = NumberFormat.getInstance();
            if (ctx.outputending().expression() != null) {
                Integer places = (Integer) (int) (double) (Double) visitExpression(ctx.outputending().expression());
                nf.setMaximumFractionDigits(places);
                System.out.println(nf.format(res));
            } else {
                nf.setMaximumFractionDigits(0);
                System.out.println(nf.format(res));
            }
        }
        return null;
    }


    @Override
    public T visitWhileloop(CoralLanguageParser.WhileloopContext ctx) {
        while ((Boolean) visitBoolexpr(ctx.boolexpr())) {
            visitNonempty(ctx.nonempty());
        }
        return null;
    }

    @Override
    public T visitExpression(CoralLanguageParser.ExpressionContext ctx) {
        Double res = (Double) visitExpression1(ctx.expression1());
        if (ctx.expression_suffix().TKN_MINUS() != null) {
            res = res - (Double) visitExpression_suffix(ctx.expression_suffix());
        } else if (ctx.expression_suffix().TKN_PLUS() != null) {
            res = res + (Double) visitExpression_suffix(ctx.expression_suffix());
        }
        return (T) res;

    }

    @Override
    public T visitExpression_suffix(CoralLanguageParser.Expression_suffixContext ctx) {
        Double res = (Double) visitExpression1(ctx.expression1());
        if (ctx.expression_suffix().TKN_MINUS() != null) {
            res = res - (Double) visitExpression_suffix(ctx.expression_suffix());
        } else if (ctx.expression_suffix().TKN_MINUS() != null) {
            res = res - (Double) visitExpression_suffix(ctx.expression_suffix());
        }
        return (T) res;
    }

    @Override
    public T visitExpression1(CoralLanguageParser.Expression1Context ctx) {
        Double res = Double.parseDouble(visitExpression2(ctx.expression2()).toString());
        if (ctx.plusneg().TKN_MINUS() != null) res = -res;
        if (ctx.expression1_suffix().aritm() == null) return (T) res;
        if (ctx.expression1_suffix().aritm().TKN_DIV() != null) {
            res = res / (Double) visitExpression1_suffix(ctx.expression1_suffix());
        } else if (ctx.expression1_suffix().aritm().TKN_MOD() != null) {
            res = res % (Double) visitExpression1_suffix(ctx.expression1_suffix());
        } else if (ctx.expression1_suffix().aritm().TKN_TIMES() != null) {
            res = res * (Double) visitExpression1_suffix(ctx.expression1_suffix());
        }
        return (T) res;
    }

    @Override
    public T visitExpression1_suffix(CoralLanguageParser.Expression1_suffixContext ctx) {
        Double res = (Double) visitExpression2(ctx.expression2());
        if (ctx.plusneg().TKN_MINUS() != null) res = -res;
        if (ctx.expression1_suffix().aritm() == null) return (T) res;
        if (ctx.expression1_suffix().aritm().TKN_DIV() != null) {
            res = res / (Double) visitExpression1_suffix(ctx.expression1_suffix());
        } else if (ctx.expression1_suffix().aritm().TKN_MOD() != null) {
            res = res % (Double) visitExpression1_suffix(ctx.expression1_suffix());
        } else if (ctx.expression1_suffix().aritm().TKN_TIMES() != null) {
            res = res * (Double) visitExpression1_suffix(ctx.expression1_suffix());
        }
        return (T) res;
    }

    @Override
    public T visitExpression2(CoralLanguageParser.Expression2Context ctx) {
        if (ctx.idexpropt() != null && ctx.idexpropt().TKN_ID()!=null ) {
            Variable variable = VariableController.INSTANCE.getVariable(ctx.idexpropt().TKN_ID().getText());
            if(variable.getType()== DataTypes.FUNCTION){
                CoralLanguageParser.FuncionContext func = (CoralLanguageParser.FuncionContext)variable.getValue();
                StackController.INSTANCE.addScope(func.TKN_ID().getText());

                return (T)visitFuncion((CoralLanguageParser.FuncionContext)variable.getValue());
            }else{
                return (T) variable.getValue();
            }

        } else if (ctx.number() != null) {
            return (T) (Double) Double.parseDouble(ctx.number().getText());
        } else if (ctx.expression() != null) {
            return visitExpression(ctx.expression());
        } else if (ctx.builtin() != null) {
            return visitBuiltin(ctx.builtin());
        }
        return null;
    }

    @Override
    public T visitBuiltin(CoralLanguageParser.BuiltinContext ctx) {
        if (ctx.sqrt() != null) {
            return (T) (Double) Math.sqrt((Double) visitExpression(ctx.sqrt().expression()));
        } else if (ctx.rdm() != null) {
            Double min = (Double) visitExpression(ctx.rdm().expression(0));
            Double max = (Double) visitExpression(ctx.rdm().expression(1));
            if (max < min) {
                int line = ctx.rdm().TKN_OPENING_PAR().getSymbol().getLine();
                int col = ctx.rdm().TKN_CLOSING_PAR().getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semantico, los límites están mal definidos.\n", line, col);
                System.exit(-1);
                return null;
            }
            Double random = Math.random() * (max - min + 1) + min;
            return (T) random;
        } else if (ctx.abs() != null) {
            return (T) (Double) Math.abs((Double) visitExpression(ctx.abs().expression()));
        } else if (ctx.pow() != null) {
            return (T) (Double) Math.pow((Double) visitExpression(ctx.pow().expression(0)), (Double) visitExpression(ctx.pow().expression(1)));
        }
        return null;
    }

    @Override
    public T visitBoolexpr(CoralLanguageParser.BoolexprContext ctx) {
        if (ctx.boolexpr_suffix().OR() != null) {
            Boolean res = (Boolean) visitBoolexpr1(ctx.boolexpr1()) || (Boolean) visitBoolexpr_suffix(ctx.boolexpr_suffix());
            return (T) res;
        }
        return visitBoolexpr1(ctx.boolexpr1());

    }

    @Override
    public T visitBoolexpr_suffix(CoralLanguageParser.Boolexpr_suffixContext ctx) {
        if (ctx.boolexpr_suffix().OR() != null) {
            Boolean res = (Boolean) visitBoolexpr1(ctx.boolexpr1()) || (Boolean) visitBoolexpr_suffix(ctx.boolexpr_suffix());
            return (T) res;
        }
        return visitBoolexpr1(ctx.boolexpr1());

    }

    @Override
    public T visitBoolexpr1(CoralLanguageParser.Boolexpr1Context ctx) {
        if (ctx.boolexpr1_suffix().AND() != null) {
            Boolean res = (Boolean) visitBoolexpr2(ctx.boolexpr2()) && (Boolean) visitBoolexpr1_suffix(ctx.boolexpr1_suffix());
            return (T) res;
        }
        return visitBoolexpr2(ctx.boolexpr2());
    }

    @Override
    public T visitBoolexpr1_suffix(CoralLanguageParser.Boolexpr1_suffixContext ctx) {
        if (ctx.boolexpr1_suffix().AND() != null) {
            Boolean res = (Boolean) visitBoolexpr2(ctx.boolexpr2()) && (Boolean) visitBoolexpr1_suffix(ctx.boolexpr1_suffix());
            return (T) res;
        }
        return visitBoolexpr2(ctx.boolexpr2());
    }

    @Override
    public T visitBoolexpr2(CoralLanguageParser.Boolexpr2Context ctx) {
        Double tmp = (Double) visitBoolexpr3(ctx.boolexpr3());
        Boolean res;
        if (ctx.boolexpr2_suffix().equals() == null) {
            if (tmp == 1.0) res = true;
            else res = false;
            return (T) res;
        }
        if (ctx.boolexpr2_suffix().equals().TKN_EQUAL() != null) {
            if ((double) tmp == (double) (Double) visitBoolexpr2_suffix(ctx.boolexpr2_suffix())) res = true;
            else res = false;
        } else {
            if ((double) tmp != (double) (Double) visitBoolexpr2_suffix(ctx.boolexpr2_suffix())) res = true;
            else res = false;
        }
        return (T) res;
    }

    @Override
    public T
    visitBoolexpr2_suffix(CoralLanguageParser.Boolexpr2_suffixContext ctx) {
        Double res = (Double) visitBoolexpr3(ctx.boolexpr3());
        if (ctx.boolexpr2_suffix().equals() == null) return (T) res;
        if (ctx.boolexpr2_suffix().equals().TKN_EQUAL() != null) {
            if ((double) res == (double) (Double) visitBoolexpr2_suffix(ctx.boolexpr2_suffix())) res = 1.0;
            else res = 0.0;
        } else {
            if ((double) res != (double) (Double) visitBoolexpr2_suffix(ctx.boolexpr2_suffix())) res = 1.0;
            else res = 0.0;
        }
        return (T) res;
    }

    @Override
    public T visitBoolexpr3(CoralLanguageParser.Boolexpr3Context ctx) {
        Double res = (Double) visitBoolexpr4(ctx.boolexpr4());
        if (ctx.boolexpr3_suffix().comparers() == null) return (T) res;
        if (ctx.boolexpr3_suffix().comparers().TKN_LESS() != null) {
            if ((double) res < (double) (Double) visitBoolexpr3_suffix(ctx.boolexpr3_suffix())) res = 1.0;
            else res = 0.0;
            return (T) res;
        } else if (ctx.boolexpr3_suffix().comparers().TKN_LEQ() != null) {
            if ((double) res <= (double) (Double) visitBoolexpr3_suffix(ctx.boolexpr3_suffix())) res = 1.0;
            else res = 0.0;
            return (T) res;
        } else if (ctx.boolexpr3_suffix().comparers().TKN_GREATER() != null) {
            if ((double) res > (double) (Double) visitBoolexpr3_suffix(ctx.boolexpr3_suffix())) res = 1.0;
            else res = 0.0;
            return (T) res;
        } else if (ctx.boolexpr3_suffix().comparers().TKN_GEQ() != null) {
            if ((double) res >= (double) (Double) visitBoolexpr3_suffix(ctx.boolexpr3_suffix())) res = 1.0;
            else res = 0.0;
            return (T) res;
        }
        return (T) res;
    }

    @Override
    public T visitBoolexpr3_suffix(CoralLanguageParser.Boolexpr3_suffixContext ctx) {
        Double res = (Double) visitBoolexpr4(ctx.boolexpr4());
        if (ctx.boolexpr3_suffix().comparers() == null) return (T) res;
        if (ctx.boolexpr3_suffix().comparers().TKN_LESS() != null) {
            if ((double) res < (double) (Double) visitBoolexpr3_suffix(ctx.boolexpr3_suffix())) res = 1.0;
            else res = 0.0;
            return (T) res;
        } else if (ctx.boolexpr3_suffix().comparers().TKN_LEQ() != null) {
            if ((double) res <= (double) (Double) visitBoolexpr3_suffix(ctx.boolexpr3_suffix())) res = 1.0;
            else res = 0.0;
            return (T) res;
        } else if (ctx.boolexpr3_suffix().comparers().TKN_GREATER() != null) {
            if ((double) res > (double) (Double) visitBoolexpr3_suffix(ctx.boolexpr3_suffix())) res = 1.0;
            else res = 0.0;
            return (T) res;
        } else if (ctx.boolexpr3_suffix().comparers().TKN_GEQ() != null) {
            if ((double) res >= (double) (Double) visitBoolexpr3_suffix(ctx.boolexpr3_suffix())) res = 1.0;
            else res = 0.0;
            return (T) res;
        }
        return (T) res;
    }

    @Override
    public T visitBoolexpr4(CoralLanguageParser.Boolexpr4Context ctx) {
        Double res = (Double) visitBoolexpr5(ctx.boolexpr5());
        if (ctx.boolexpr4_suffix().TKN_MINUS() != null) {
            res = res - (Double) visitBoolexpr4_suffix(ctx.boolexpr4_suffix());
        } else if (ctx.boolexpr4_suffix().TKN_PLUS() != null) {
            res = res + (Double) visitBoolexpr4_suffix(ctx.boolexpr4_suffix());
        }
        return (T) res;
    }

    @Override
    public T visitBoolexpr4_suffix(CoralLanguageParser.Boolexpr4_suffixContext ctx) {
        Double res = (Double) visitBoolexpr5(ctx.boolexpr5());
        if (ctx.boolexpr4_suffix().TKN_MINUS() != null) {
            res = res - (Double) visitBoolexpr4_suffix(ctx.boolexpr4_suffix());
        } else if (ctx.boolexpr4_suffix().TKN_PLUS() != null) {
            res = res + (Double) visitBoolexpr4_suffix(ctx.boolexpr4_suffix());
        }
        return (T) res;
    }

    @Override
    public T visitBoolexpr5(CoralLanguageParser.Boolexpr5Context ctx) {
        Double res = (Double) visitBoolexpr6(ctx.boolexpr6());
        if (ctx.plusneg().TKN_MINUS() != null) res = -res;
        if (ctx.boolexpr5_suffix().aritm() == null) return (T) res;
        if (ctx.boolexpr5_suffix().aritm().TKN_MOD() != null) {
            res = res % (Double) visitBoolexpr5_suffix(ctx.boolexpr5_suffix());
        } else if (ctx.boolexpr5_suffix().aritm().TKN_DIV() != null) {
            res = res / (Double) visitBoolexpr5_suffix(ctx.boolexpr5_suffix());
        } else if (ctx.boolexpr5_suffix().aritm().TKN_TIMES() != null) {
            res = res * (Double) visitBoolexpr5_suffix(ctx.boolexpr5_suffix());
        }
        return (T) res;
    }


    @Override
    public T visitBoolexpr5_suffix(CoralLanguageParser.Boolexpr5_suffixContext ctx) {
        Double res = (Double) visitBoolexpr6(ctx.boolexpr6());
        if (ctx.plusneg().TKN_MINUS() != null) res = -res;
        if (ctx.boolexpr5_suffix().aritm() == null) return (T) res;
        if (ctx.boolexpr5_suffix().aritm().TKN_MOD() != null) {
            res = res % (Double) visitBoolexpr5_suffix(ctx.boolexpr5_suffix());
        } else if (ctx.boolexpr5_suffix().aritm().TKN_DIV() != null) {
            res = res / (Double) visitBoolexpr5_suffix(ctx.boolexpr5_suffix());
        } else if (ctx.boolexpr5_suffix().aritm().TKN_TIMES() != null) {
            res = res * (Double) visitBoolexpr5_suffix(ctx.boolexpr5_suffix());
        }
        return (T) res;
    }

    @Override
    public T visitBoolexpr6(CoralLanguageParser.Boolexpr6Context ctx) {
        if (ctx.NOT() != null) {
            Boolean boolexpr = !(Boolean) visitBoolexpr(ctx.boolexpr());
            Double res;
            if (boolexpr) res = 1.0;
            else res = 0.0;
            return (T) res;
        } else if (ctx.builtin() != null) {
            return visitBuiltin(ctx.builtin());
        } else if (ctx.number() != null) {
            return (T) (Double) Double.parseDouble(ctx.number().getText());
        } else if (ctx.TKN_ID() != null) {
            System.out.println("Id access");
        } else {
            Boolean boolexpr = !(Boolean) visitBoolexpr(ctx.boolexpr());
            Double res;
            if (boolexpr) res = 1.0;
            else res = 0.0;
            return (T) res;
        }
        return null;
    }


}
