# Programming-Assignment---The-Lexer
## Project overview
 lexical analyzer, also called a scanner, using a lexical analyzer generator. You will describe the set of tokens for
 #### Classroom Object Oriented Language (COOL)
 in an appropriate input format and the analyzer generator will generate the tokens.
 ## For more information about lexical analyzer [check this link](https://www.tutorialspoint.com/compiler_design/compiler_design_lexical_analysis.htm)
 ## Specifications:
 A program that takes a single command-line argument (e.g., file.cl). That argument will be an ASCII text Cool source file. The program must either indicate that there is an error in the input (e.g., a malformed string) or emit file.cl-lex, a serialized list of Cool tokens.

## Prerequisites
* 1-IntelliJ IDEA  or similar ide [intilj](https://www.jetbrains.com/idea/download/#section=windows)
* 2-install JDK 
* 3-then follow this link : [Steps for installing ANTLR and Intelli-J IDE
](https://docs.google.com/document/d/1LZq93o6nc8j_m212T5monJFApjqdmuyK8uvRKLwuCok/edit)

###  Test cases 
good.cl and bad.cl. The first should lex correctly and yield a sequence of tokens. The second should contain an error  print error message
 that contain line_number and terminate the program .
 The .cl-lex File Format:
#### If there are no errors in file.cl the  program should create file.cl-lex and serialize the tokens to it. Each token is represented by a pair (or triplet) of lines. The first line holds the line number. The second line gives the name of the token. The optional third line holds additional information (i.e., the lexeme) for identifiers, integers, strings and types. For example, for an integer token the third line should contain the decimal integer value.
### Installation
 * download or clone the project in your pc 
 * unzip it
 * open with your editor IntelliJ IDEA  or similar ide  and go to src directry and run [Lexer_Main.java](https://github.com/Esraa22M/Lexical_Analyzer1/blob/master/src/Lexer_Main.java) file
    * from [L5](https://github.com/Esraa22M/Lexical_Analyzer1/blob/master/src/Lexer_Main.java#L5) put the path of your input file 
      like this #### input_file = "file_path";
     * or you can run from cmd and put the input file name as a parameter after the [Lexer_Main.java]
 



