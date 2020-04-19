import java.io.IOException;

public class Lexer_Main {
    public static void main(String[] args) throws IOException{
        String file = "src/good.cl";

        if(args.length >= 1)
            file = args[0];
     //Lexer
        Test lexer = new Test(file);
        lexer.returnTokens(file + "-lex");
     //Parser
        TestParser parser = new TestParser(lexer);
        parser.writeContextSyntaxTree(file + "-cst");
    }
}
