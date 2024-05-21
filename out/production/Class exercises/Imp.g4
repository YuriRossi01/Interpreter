grammar Imp;

prog : com EOF ;

com : IF LPAR exp RPAR THEN LBRACE com RBRACE ELSE LBRACE com RBRACE    # if
    | ID ASSIGN exp                                                     # assign
    | ID  LBRACK exp RBRACK  ASSIGN exp                                 # arrayAssign
    | SKIPP                                                             # skip
    | com SEMICOLON com                                                 # seq
    | WHILE LPAR exp RPAR LBRACE com RBRACE                             # while
    | OUT LPAR exp RPAR                                                 # out
    ;

exp : NAT                                 # nat
    | BOOL                                # bool
    | STRING                              # string
    | TOSTR LPAR exp RPAR                 # tostr
    | LPAR exp RPAR                       # parExp
    | <assoc=right> exp POW exp           # pow
    | NOT exp                             # not
    | exp op=(DIV | MUL | MOD) exp        # divMulMod
    | exp op=(PLUS | MINUS) exp           # plusMinus
    | exp op=(LT | LEQ | GEQ | GT) exp    # cmpExp
    | exp op=(EQQ | NEQ) exp              # eqExp
    | exp op=(AND | OR | CONCAT) exp      # logicExp
    | ID                                  # id
    | ID LBRACK exp RBRACK                # access
    ;

NAT : '0' | [1-9][0-9]* ;
BOOL : 'true' | 'false' ;
STRING : '"' STRCHR* '"' ;
fragment STRCHR : ~["\\\r\n] | ESC ;
fragment ESC  : '\\'  [btnfr"'\\] ;
fragment POS  :  [1-9][0-9]* ;

PLUS  : '+' ;
MINUS : '-';
MUL   : '*' ;
DIV   : '/' ;
MOD   : 'mod' ;
POW   : '^' ;


AND : '&' ;
OR  : '|' ;
CONCAT : '.' ;

EQQ : '==' ;
NEQ : '!=' ;
LEQ : '<=' ;
GEQ : '>=' ;
LT  : '<' ;
GT  : '>' ;
NOT : '!' ;

IF     : 'if' ;
THEN   : 'then' ;
ELSE   : 'else' ;
WHILE  : 'while' ;
SKIPP  : 'skip' ;
ASSIGN : '=' ;
OUT    : 'out' ;
TOSTR : 'tostr' ;


LPAR      : '(' ;
RPAR      : ')' ;
LBRACK    : '[' ;
RBRACK    : ']' ;
LBRACE    : '{' ;
RBRACE    : '}' ;
SEMICOLON : ';' ;

ID : [a-z]+ ;

WS : [ \t\r\n]+ -> skip ;
