import controller.VariableController;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) throws Exception{
        CoralLanguageLexer lexer = new CoralLanguageLexer(CharStreams.fromFileName("input/in.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CoralLanguageParser parser = new CoralLanguageParser(tokens);
        ParseTree tree = parser.inicial();
        MyVisitor loader = new MyVisitor();
        loader.visit(tree);
    }
}




