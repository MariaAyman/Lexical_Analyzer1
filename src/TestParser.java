import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestParser {
    private ParserCoolParser cParser;

    public TestParser(Test lex){
        cParser = new ParserCoolParser(lex.getTokenStream());
        cParser.removeErrorListeners();
        cParser.addErrorListener(PErrorListener.listenerObj);
    }

    public String getContextSyntaxTree(){
        ParserCoolParser.ProgramContext pContext = cParser.program();
        String tree = pContext.toStringTree(cParser);
        return tree;
    }

    public void writeContextSyntaxTree(String outFile){
        String tree = getContextSyntaxTree();
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            writer.write(tree);
            writer.close();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
