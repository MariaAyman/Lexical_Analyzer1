import org.antlr.v4.runtime.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private LexerCool lex;
    private CommonTokenStream tStream; // بتاخد stream بتاع lexer
    private List<Token> tokens;
    private List<Token> errors;//t
    private List<String> outTokens;

    public Test(String file){
        CharStream cStream;
        try{
            cStream = CharStreams.fromFileName(file);
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        lex = new LexerCool(cStream);
        tStream = new CommonTokenStream(lex);
        tStream.fill();
        tokens = tStream.getTokens();
        lexer();
    }

    private void lexer(){
        outTokens = new ArrayList<>();
        errors = new ArrayList<>();
        String[] ruleNames = lex.getRuleNames();
        int size = ruleNames.length;
        for(Token i : tokens){
            if(i.getType() > 0){
                if(ruleNames[i.getType() - 1].equals("ERROR")){
                    errors.add(i);
                }
                else{
                    outTokens.add(Integer.toString(i.getLine()));
                    String type = ruleNames[i.getType() - 1];
                    outTokens.add(type);
                    if(type.equals("Literal") || type.equals("Digit") || type.equals("Digits")
                            || type.equals("Num") || type.equals("Letter") || type.equals("ID") ){
                        outTokens.add(i.getText());
                    }
                }
            }
        }

        if(!errors.isEmpty()){
            returnErrors();
        }
    }

    public void returnErrors(){
        StringBuilder ret = new StringBuilder();
        for(Token i : errors){
            ret.append(
                    String.format("Lexer Error: Line %s invalid character %s\n" , i.getLine() , i.getText())
            );
        }
        throw new RuntimeException(ret.toString());
    }

    public void returnTokens(String outFile){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            for(String i : outTokens){
                writer.write(i + "\n");
            }
            writer.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
