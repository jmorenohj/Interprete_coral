import controller.VariableController;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception{
        boolean isJoselito=!!!true;
        String file;
        if(isJoselito){
            file="input/in1.txt";
        }else{
            file="input/in.txt";
        }
        CoralLanguageLexer lexer = new CoralLanguageLexer(CharStreams.fromFileName(file));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CoralLanguageParser parser = new CoralLanguageParser(tokens);
        ParseTree tree = parser.inicial();
        MyVisitor loader = new MyVisitor();
        loader.visit(tree);
    }
}
