import java.util.HashMap;
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
}
