grammar ParserCool;

program : programBlocks;

programBlocks : classDefine SEMICOLON programBlocks //classes
              | EOF ;

classDefine : CLASS TYPEID (INHERITS TYPEID)? LBRACE (feature SEMICOLON)* RBRACE ;

feature : OBJECTID LPAREN (formal (COMMA formal)*)? RPAREN COLON TYPEID LBRACE expression RBRACE //method
        | OBJECTID COLON TYPEID (ASSIGNMENT expression)? ; //Var

formal : OBJECTID COLON TYPEID;


// method argument

expression : expression (ATSYM TYPEID)? DOT OBJECTID LPAREN (expression (COMMA expression)*)? RPAREN //methodCall
           | OBJECTID LPAREN (expression (COMMA expression)*)? RPAREN //ownMethodCall
           | IF expression THEN expression ELSE expression FI //if
           | WHILE expression LOOP expression POOL //while
           | LBRACE (expression SEMICOLON)+ RBRACE //block
           | LET OBJECTID COLON TYPEID (ASSIGNMENT expression)? (COMMA OBJECTID COLON TYPEID (ASSIGNMENT expression)?)* IN expression //letIn
           | CASE expression OF (OBJECTID COLON TYPEID CASE_ARROW expression SEMICOLON)+ ESAC //case
           | NEW TYPEID //new
           | TILDE expression //negative
           | ISVOID expression //isvoid
           | expression MULTIPLY expression //multiply
           | expression DIVISION expression //division
           | expression ADD expression //additon
           | expression SUB expression //subtraction
           | expression LESS_THAN expression //lessThan
           | expression LESS_EQUAL expression //lessEqual
           | expression EQUAL expression //equal
           | NOT expression //boolNot
           | LPAREN expression RPAREN //parentheses
           | OBJECTID //id
           | INT
           | STRING
           | TRUE
           | FALSE
           | OBJECTID ASSIGNMENT expression; //assignment;


// key words

CLASS    : ('c'|'C')('l'|'L')('a'|'A')('s'|'S')('s'|'S');
INHERITS : ('i'|'I')('h'|'H')('e'|'E')('r'|'R')('i'|'I')('t'|'T')('s'|'S');
TRUE	 : 't'('r'|'R')('u'|'U')('e'|'E');
FALSE    : 'f'('a'|'A')('l'|'L')('s'|'S')('e'|'E');
IF       : ('i'|'I')('f'|'F');
THEN     : ('t'|'T')('h'|'H')('e'|'E')('n'|'N');
ELSE     : ('e'|'E')('l'|'L')('s'|'S')('e'|'E');
FI       : ('f'|'F')('i'|'I');
WHILE    : ('w'|'W')('h'|'H')('i'|'I')('l'|'L')('e'|'E');
LOOP     : ('l'|'L')('o'|'O')('o'|'O')('p'|'P');
POOL     : ('p'|'P')('o'|'O')('o'|'O')('l'|'L');
IN       : ('i'|'I')('n'|'N');
ISVOID   : ('i'|'I')('s'|'S')('v'|'V')('o'|'O')('i'|'I')('d'|'D');
VOID	 :('v'|'V')('o'|'O')('i'|'I')('d'|'D');
LET      : ('l'|'L')('e'|'E')('t'|'T');
CASE     : ('c'|'C')('a'|'A')('s'|'S')('e'|'E');
ESAC     : ('e'|'E')('s'|'S')('a'|'A')('c'|'C');
NEW      : ('n'|'N')('e'|'E')('w'|'W');
OF       : ('o'|'O')('f'|'F');
NOT      : ('n'|'N')('o'|'O')('t'|'T');

// primitives

//STRING : '"' (ESC | ~ ["\\])* '"';
STRING   : '"'(~[\r\n])*'"';
INT      : [0-9]+;
TYPEID   : [A-Z] [_0-9A-Za-z]*;
OBJECTID : [a-z] [_0-9A-Za-z]*;

LPAREN	         : '(';
RPAREN	         : ')';
LBRACE	         : '{';
RBRACE	         : '}';
SEMICOLON        : ';';
COMMA	         : ',';
COLON	         : ':';
DOT	             : '.';
ATSYM	         : '@';
ASSIGNMENT       : '<-';
CASE_ARROW       : '=>';
ADD              : '+';
SUB              : '-';
MULTIPLY         : '*';
DIVISION         : '/';
LESS_THAN        : '<';
LESS_EQUAL       : '<=';
EQUAL            : '=';
TILDE            : '~';

//fragment ESC : '\\' (["\\/bfnrt] | UNICODE);
//fragment UNICODE : 'u' HEX HEX HEX HEX;
//fragment HEX : [0-9a-fA-F];

// comments & whitespaces

OPEN_COMMENT     : '(*';
CLOSE_COMMENT    : '*)';
COMMENT          : OPEN_COMMENT (COMMENT | .)*? CLOSE_COMMENT -> skip;
ONE_LINE_COMMENT : '--' (~ '\n')* '\n'? -> skip;
WS               : [ \t\r\n\f]+ -> skip;
