import java.io.IOException;

public class Lexer_Main {
    public static void main(String[] args) throws IOException{
        String file = "src/bad.cl";
        if(args.length >= 1)
            file = args[0];
        Test lexer = new Test(file);
        lexer.returnTokens(file + "-lex");
    }
}
