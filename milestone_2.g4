grammar milestone_2;

///////////////////// MILESTONE 1/////////////////////////////

SPACE : [ \t] -> skip;
NEWLINE     : [\r\n]+ -> skip;

INDENT : ('    ')+;
COMMENT : ('#' | '##') ~[\n]* -> skip;
MULTCOMMENT :  (('#[' .* ']#') | ('##[' .* ']##')) -> skip;

EQUALS_OPERATOR : '=' | '==';
ADD_OPERATOR : '+';
MUL_OPERATOR : '*';
MINUS_OPERATOR : '-';
DIV_OPERATOR : '/';
BITWISE_NOT_OPERATOR : '~';
AND_OPERATOR : '&';
OR_OPERATOR : '|';
LESS_THAN : '<';
GREATER_THAN : '>';
AT : '@';
MODULUS : '%';
NOT_OPERATOR : '!';
XOR_OPERATOR : '^';



DOT : '.' ;
COMMA : ',' ;
COLON : ':';
OPEN_PAREN : '(';
CLOSE_PAREN : ')';
OPEN_BRACE : '{';
CLOSE_BRACE : '}';
OPEN_BRACK : '[';
CLOSE_BRACK : ']';
SEMI_COLON : ';';
OTHER_TOKENS : ('`' | '[.' | '.]' | '{.' | '.}' | '(.' | '.)' | '[:');


VARIABLE : 'var';
AND : 'and';
ADDR : 'addr';
AS : 'as';
ASM : 'asm';
BIND : 'bind';
BLOCK : 'block';
BREAK : 'break';
CASE : 'case';
CAST : 'cast';
CONCEPT : 'concept';
CONST : 'const';
CONTINUE : 'continue';
CONVERTER : 'converter';
DEFER : 'defer';
DISCARD : 'discard';
DISTINCT : 'distinct';
DIV : 'div';
DO : 'do';
ELIF : 'elif';
ELSE : 'else';
END : 'end';
ENUM : 'enum';
EXCEPT : 'except';
EXPORT : 'export';
FINALLY : 'finally';
FOR : 'for';
FROM : 'from';
FUNC : 'func';
IF : 'if';
IMPORT : 'import';
IN : 'in';
INCLUDE : 'include';
INTERFACE : 'interface';
IS : 'is';
ISNOT : 'isnot';
ITERATOR : 'iterator';
LET : 'let';
MACRO : 'macro';
METHOD : 'method';
MIXIN : 'mixin';
MOD : 'mod';
NIL : 'nil';
NOT : 'not';
NOTIN : 'notin';
OBJECT : 'object';
OF : 'of';
OR : 'or';
OUT : 'out';
PROC : 'proc';
PTR : 'ptr';
RAISE : 'raise';
REF : 'ref';
RETURN :'return';
SHL : 'shl';
SHR : 'shr';
STATIC : 'static';
TEMPLATE : 'template';
TRY : 'try';
TUPLE : 'tuple';
TYPE : 'type';
USING : 'using';
WHEN : 'when';
WHILE : 'while';
XOR : 'xor';
YIELD : 'yield';

IDENTIFIER : LETTER+ ('_'? (LETTER | DIGIT))*;

INT_LIT : HEX_LIT
        | DEC_LIT
        | OCT_LIT
        | BIN_LIT;

INT8_LIT : INT_LIT '\'' ('i' | 'I') '8';
INT16_LIT : INT_LIT '\'' ('i' | 'I') '16';
INT32_LIT : INT_LIT '\'' ('i' | 'I') '32';
INT64_LIT : INT_LIT '\'' ('i' | 'I') '64';

UINT_LIT : INT_LIT '\'' ('u' | 'U');
UINT8_LIT : INT_LIT '\'' ('u' | 'U') '8';
UINT16_LIT : INT_LIT '\'' ('u' | 'U') '16';
UINT32_LIT : INT_LIT '\'' ('u' | 'U') '32';
UINT64_LIT : INT_LIT '\'' ('u' | 'U') '64';

HEXDIGIT : DIGIT+ | 'A'..'F' | 'a'..'f';
OCTDIGIT : '0'..'7';
BINDIGIT : '0'..'1';
HEX_LIT : '0' ('x' | 'X' ) HEXDIGIT+ ( '_' HEXDIGIT+ )*;
DEC_LIT : DIGIT+ ( '_' DIGIT+ )*;
OCT_LIT : '0' 'o' OCTDIGIT+ ( '_' OCTDIGIT+ )*;
BIN_LIT : '0' ('b' | 'B' ) BINDIGIT+ ( '_' BINDIGIT+ )*;


EXP : ('e' | 'E' ) ('+' | '-') DIGIT+ ( '_' DIGIT+ )*;
FLOAT_LIT : DIGIT+ ('_' DIGIT+)* (('.' DIGIT+ ('_' DIGIT+)* EXP?) |EXP);
FLOAT32_SUFFIX : '\'' ('f' | 'F') '32';
FLOAT32_LIT : HEX_LIT '\'' FLOAT32_SUFFIX
            | (FLOAT_LIT | DEC_LIT | OCT_LIT | BIN_LIT) FLOAT32_SUFFIX;
FLOAT64_SUFFIX : '\'' ( ('f' | 'F') '64' ) | 'd' | 'D';
FLOAT64_LIT : HEX_LIT '\'' FLOAT64_SUFFIX
            | (FLOAT_LIT | DEC_LIT | OCT_LIT | BIN_LIT) FLOAT64_SUFFIX;

TRIPLESTR_LIT : '"""' .*? '"""';


STR_LIT : ('"'~["]* ('\\n' | '\\p' | '\\r' | '\\c' | '\\l' | '\\f' | '\\t' | '\\v' | '\\\\' | '\\"'
          | '\\\'' | '\\'[0-9] | '\\a' | '\\b' | '\\e' | '\\x' HEXDIGIT HEXDIGIT )? ~["]* '"');


CHAR_LIT : ('\''~[']* ('\\n' | '\\p' | '\\r' | '\\c' | '\\l' | '\\f' | '\\t' | '\\v' | '\\\\' | '\\"'
          | '\\\'' | '\\'[0-9] | '\\a' | '\\b' | '\\e' | '\\x' HEXDIGIT HEXDIGIT )? ~[']* '\'');


RSTR_LIT : 'r"'~["]*'"';

GENERALIZED_STR_LIT : IDENTIFIER STR_LIT;

GENERALIZED_TRIPLESTR_LIT : IDENTIFIER TRIPLESTR_LIT;

DIGIT : [0-9] ;
LETTER : [a-zA-Z];

///////////////////END MILESTONE 1 //////////////////////////////////////

// MILESTONE 2:

comma : ',' COMMENT?;
semicolon : ';' COMMENT?;
colon : ':' COMMENT?;
colcom : ':' COMMENT?;

OP0 : '->' | '=>';

OP1 : '+=' | '*=';

OP2 : AT | '?';

OP3 : OR | XOR;

OP4 : AND;

//== <= < >= > != in notin is isnot not of
OP5 : '==' | '<=' | '>=' | GREATER_THAN | '!=' | IN | NOTIN | ISNOT | NOT | OF ;

OP6 : '..';

OP7 : AND_OPERATOR;

OP8 : ADD_OPERATOR | MINUS_OPERATOR;
//	* / div mod shl shr %
OP9 : MUL_OPERATOR | DIV_OPERATOR | MOD | SHL | SHR | MODULUS;
// 	$ ^
OP10 : '$' | '^';

operator :  OP0 | OP1 | OP2 | OP3 | OP4 | OP5 | OP6 | OP7 | OP8 | OP9
         | 'or' | 'xor' | 'and'
         | 'is' | 'isnot' | 'in' | 'notin' | 'of'
         | 'div' | 'mod' | 'shl' | 'shr' | 'not' | 'static' | '..';

prefixOperator : operator;

optInd : COMMENT? INDENT?;

simpleExpr : arrowExpr (OP0 optInd arrowExpr)* pragma?;
arrowExpr : assignExpr (OP1 optInd assignExpr)*;
assignExpr : orExpr (OP2 optInd orExpr)*;
orExpr : andExpr (OP3 optInd andExpr)*;
andExpr : cmpExpr (OP4 optInd cmpExpr)*;
cmpExpr : sliceExpr (OP5 optInd sliceExpr)*;
sliceExpr : ampExpr (OP6 optInd ampExpr)*;
ampExpr : plusExpr (OP7 optInd plusExpr)*;
plusExpr : mulExpr (OP8 optInd mulExpr)*;
mulExpr : dollarExpr (OP9 optInd dollarExpr)*;
dollarExpr : primary (OP10 optInd primary)*;

primary : typeKeyw typeDesc
        |  prefixOperator* identOrLiteral primarySuffix*
        | BIND primary;

identOrLiteral : generalizedLit | symbol | literal
               | par | arrayConstr | setOrTableConstr
               | castExpr;

par : '(' optInd
        //   ( (?=parKeyw complexOrSimpleStmt (';' (parKeyw complexOrSimpleStmt))*) 
          | ';' complexOrSimpleStmt (';' complexOrSimpleStmt)*
          | pragmaStmt
          | ( ('=' expr (';' complexOrSimpleStmt (';' complexOrSimpleStmt)*)? )
                       | (':' expr (',' exprColonEqExpr (',' exprColonEqExpr)*)? ) ) 
          optPar ')';

condExpr : expr colcom expr optInd (ELIF expr colcom expr optInd)* ELSE colcom expr;

ifExpr: IF condExpr;

// pragma : '{.' optInd (exprColonExpr comma?)* optPar ('.}'|'}');
pragma : '{.' optInd test optPar '.}';

test : (exprColonEqExpr comma?)*;
// expr : ifExpr;

expr : ifExpr
        | simpleExpr;

typeKeyw : 'var' | 'out' | 'ref' | 'ptr' | 'shared' | 'tuple'
         | 'proc' | 'iterator' | 'distinct' | 'object' | 'enum';


typeDesc : simpleExpr;

// exprColonExpr : expr (':'|'=' expr)?;

optPar : INDENT?;

generalizedLit : GENERALIZED_STR_LIT | GENERALIZED_TRIPLESTR_LIT;



// KEYW ??
symbol : '`' (IDENTIFIER | literal | (operator|'('|')'|'['|']'|'{'|'}'|'=')+)+ '`' | IDENTIFIER; //| KEYW;

literal :  INT_LIT | INT8_LIT | INT16_LIT | INT32_LIT | INT64_LIT
          | UINT_LIT | UINT8_LIT | UINT16_LIT | UINT32_LIT | UINT64_LIT
          | FLOAT_LIT | FLOAT32_LIT | FLOAT64_LIT
          | STR_LIT | RSTR_LIT | TRIPLESTR_LIT
          | CHAR_LIT
          | NIL;

// primarySuffix : '(' (exprColonEqExpr comma?)* ')' /*doBlocks?*/
// /*      | doBlocks*/
//       | '.' optInd symbol generalizedLit?;
//  /*     | '[' optInd indexExprList optPar ']' */
//       /*| '{' optInd indexExprList optPar '}'; */
//     //  | &( '`'|IDENTIFIER|literal|'cast'|'addr'|'type') expr # command syntax;

primarySuffix : '(' (exprColonEqExpr comma?)* ')' | '.' optInd symbol generalizedLit?;



arrayConstr : '[' optInd (exprColonEqExpr comma?)* optPar ']';

setOrTableConstr : '{' ((exprColonEqExpr comma)* | ':' ) '}';

castExpr : 'cast' '[' optInd typeDesc optPar ']' '(' optInd expr optPar ')';

exprColonEqExpr : expr (':'|'=' expr)?;

parKeyw : 'discard' | 'include' | 'if' | 'while' | 'case' | 'try'
        | 'finally' | 'except' | 'for' | 'block' | 'const' | 'let'
        | 'when' | 'var' | 'mixin';


simpleStmt : ((returnStmt | raiseStmt | yieldStmt | discardStmt | breakStmt
           | continueStmt | pragmaStmt | importStmt /*| exportStmt | fromStmt*/
           | includeStmt | commentStmt) | exprStmt) COMMENT?;

complexOrSimpleStmt : (ifStmt | whenStmt | whileStmt
                //    | tryStmt | forStmt
                    | blockStmt | staticStmt | deferStmt | asmStmt)
                /*    | 'proc' routine
                    | 'method' routine
                    | 'iterator' routine
                    | 'macro' routine
                    | 'template' routine
                    | 'converter' routine
                    | 'type' section(typeDef)
                    | 'const' section(constant)
                    | ('let' | 'var' | 'using') section(variable)
                    | bindStmt | mixinStmt) */
                    | simpleStmt;


pragmaStmt : pragma (':' COMMENT? stmt)?;


exprStmt : simpleExpr
         (( '='? optInd expr colonBody? )
         | ((comma expr)*
         /*    doBlocks */
        //      | macroColon
           ))?;

importStmt : 'import' optInd expr
              ((comma expr)*
              | 'except' optInd (comma (expr comma)*)); 

includeStmt : 'include' optInd expr (comma expr)*;
// fromStmt : 'from' moduleName 'import' optInd expr (comma expr)*;
returnStmt : 'return' optInd expr?;
raiseStmt : 'raise' optInd expr?;
yieldStmt : 'yield' optInd expr?;
discardStmt : 'discard' optInd expr?;
breakStmt : 'break' optInd expr?;
continueStmt : 'break' optInd expr?;
condStmt : expr colcom stmt COMMENT?
           (INDENT 'elif' expr colcom stmt)*
           (INDENT 'else' colcom stmt)?;
ifStmt : 'if' condStmt;
whenStmt : 'when' condStmt;
whileStmt : 'while' expr colcom stmt;
commentStmt : COMMENT;
// tryStmt : 'try' colcom stmt &(INDENT? 'except'|'finally')
//            (INDENT? 'except' exprList colcom stmt)*
//            (INDENT? 'finally' colcom stmt)?;
forStmt : 'for' (identWithPragma (comma identWithPragma)*) 'in' expr colcom stmt;
blockStmt : 'block' symbol? colcom stmt;
staticStmt : 'static' colcom stmt;
deferStmt : 'defer' colcom stmt;
asmStmt : 'asm' pragma? (STR_LIT | RSTR_LIT | TRIPLESTR_LIT);


colonBody : colcom stmt /*doBlocks?*/;

identVis : symbol;// opr?;
identVisDot : symbol '.' optInd symbol;// opr?;
identWithPragma : identVis pragma?;

stmt : (INDENT* complexOrSimpleStmt*)
        // |  simpleStmt ';'? ;       
     |  simpleStmt (';'? simpleStmt)*;

module : (stmt ((';' | INDENT)? stmt)*)?;

// module : stmt;

start       : module;
