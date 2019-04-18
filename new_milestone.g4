grammar new_milestone;

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

// TRIPLE_STR_LIT
RSTR_LIT : 'r"'~["]*'"';

GENERALIZED_STR_LIT : IDENTIFIER STR_LIT;

GENERALIZED_TRIPLESTR_LIT : IDENTIFIER TRIPLESTR_LIT;

DIGIT : [0-9] ;
LETTER : [a-zA-Z];

///////////////////END MILESTONE 1//////////////////////////////////////

////////////////// MILESTONE 2//////////////////////////////////////////

module : stmt ((';' | INDENT)? stmt)*;
comma : ',' COMMENT?;
semicolon : ';' COMMENT?;
colon : ':' COMMENT?;
colcom : ':' COMMENT?;
OP0 : '->' | '=>';

OP1 : '+=' | '*=';

OP2 : AT | '?';

OP3 : OR | XOR;

OP4 : AND;

OP5 : '==' | '<=' | '>=' | GREATER_THAN | '!=' | IN | NOTIN | ISNOT | NOT | OF ;

OP6 : '..';

OP7 : AND_OPERATOR;

OP8 : ADD_OPERATOR | MINUS_OPERATOR;

OP9 : MUL_OPERATOR | DIV_OPERATOR | MOD | SHL | SHR | MODULUS;

OP10 : '$' | '^';

operator :  OP0 | OP1 | OP2 | OP3 | OP4 | OP5 | OP6 | OP7 | OP8 | OP9
         | 'or' | 'xor' | 'and'
         | 'is' | 'isnot' | 'in' | 'notin' | 'of'
         | 'div' | 'mod' | 'shl' | 'shr' | 'not' | 'static' | '..';
prefixOperator : operator;
optInd : COMMENT?;
optPar : (INDENT)?;
simpleExpr : arrowExpr (('->' | '=>') optInd arrowExpr)*;
arrowExpr : assignExpr (('+=' | '*=') optInd assignExpr)*;
assignExpr : orExpr (('@' | '?') optInd orExpr)*;
orExpr : andExpr (('or' | 'xor') optInd andExpr)*;
andExpr : cmpExpr ('and' optInd cmpExpr)*;
cmpExpr : sliceExpr (('==' | '<=' | '>=' | '>' | '!=' | 'in' | 'notin' | 'isnot' | 'not' | 'of' ) optInd sliceExpr)*;
sliceExpr : ampExpr ('..' optInd ampExpr)*;
ampExpr : plusExpr ('&' optInd plusExpr)*;
plusExpr : mulExpr (('+' | '-') optInd mulExpr)*;
mulExpr : dollarExpr (('*' | '/' | 'mod' | 'shl' | 'shr' | '%') optInd dollarExpr)*;
dollarExpr : primary (('$' | '^') optInd primary)*;
symbol : '`' (IDENTIFIER | literal | (operator|'('|')'|'['|']'|'{'|'}'|'=')+)+ '`' | IDENTIFIER | 'addr' | 'type' | parKeyw | typeKeyw; //ident to identifier
indexExpr : expr;
indexExprList : indexExpr (comma indexExpr)*;
exprColonEqExpr : expr (':'|'=' expr)?;
exprList : expr (comma expr)*;
dotExpr : expr '.' optInd symbol;
qualifiedIdent : symbol ('.' optInd symbol)?;
exprColonEqExprList : exprColonEqExpr (comma exprColonEqExpr)* (comma)?;
setOrTableConstr : '{' ((exprColonEqExpr comma)* | ':' ) '}';
castExpr : 'cast' '[' optInd typeDesc optPar ']' '(' optInd expr optPar ')';
parKeyw : 'discard' | 'include' | 'if' | 'while' | 'case' | 'try'
        | 'finally' | 'except' | 'for' | 'block' | 'const' | 'let'
        | 'when' | 'var' | 'mixin';
par : '(' optInd
          ( parKeyw complexOrSimpleStmt (';' complexOrSimpleStmt)*
          | ';' complexOrSimpleStmt (';' complexOrSimpleStmt)*
          | pragmaStmt
          | simpleExpr ( ('=' expr (';' complexOrSimpleStmt (';' complexOrSimpleStmt)*)? )
                       | (':' expr (',' exprColonEqExpr (',' exprColonEqExpr)*)? ) ) )
          optPar ')';
literal : INT_LIT | INT8_LIT | INT16_LIT | INT32_LIT | INT64_LIT
          | UINT_LIT | UINT8_LIT | UINT16_LIT | UINT32_LIT | UINT64_LIT
          | FLOAT_LIT | FLOAT32_LIT | FLOAT64_LIT
          | STR_LIT | RSTR_LIT | TRIPLESTR_LIT
          | CHAR_LIT
          | NIL;
generalizedLit : GENERALIZED_STR_LIT | GENERALIZED_TRIPLESTR_LIT;
identOrLiteral : generalizedLit | symbol | literal
               | par | arrayConstr | setOrTableConstr
               | castExpr;
tupleConstr : '(' optInd (exprColonEqExpr comma?)* optPar ')';
arrayConstr : '[' optInd (exprColonEqExpr comma?)* optPar ']';
primarySuffix : '(' (exprColonEqExpr comma?)* ')' doBlocks?
      | doBlocks
      | '.' optInd symbol generalizedLit?
      | '[' optInd indexExprList optPar ']'
      | '{' optInd indexExprList optPar '}'
      | ( '`'|IDENTIFIER|literal|'cast'|'addr'|'type') expr;
condExpr : expr colcom expr optInd
        ('elif' expr colcom expr optInd)*
         'else' colcom expr;
ifExpr : 'if' condExpr;
whenExpr : 'when' condExpr;
pragma : '{.' optInd (exprColonExpr comma?)* optPar ('.}' | '}');
exprColonExpr : expr (':'|'=' expr)?; //possible error
identVis : symbol;// opr?;
identVisDot : symbol '.' optInd symbol;// opr?;
identWithPragma : identVis pragma?;
identWithPragmaDot : identVisDot pragma?;
declColonEquals : identWithPragma (comma identWithPragma)* comma?
                  (':' optInd typeDesc)? ('=' optInd expr)?;
identColonEquals : IDENTIFIER (comma IDENTIFIER)* comma?
     (':' optInd typeDesc)? ('=' optInd expr)?;
inlTupleDecl : 'tuple'
    '[' optInd  (identColonEquals (comma | semicolon)?)*  optPar ']';
extTupleDecl : 'tuple'
    COMMENT? ( identColonEquals ( identColonEquals)*)?;
tupleClass : 'tuple';
paramList : '(' declColonEquals (( comma | semicolon ) declColonEquals)* ')';
paramListArrow : paramList? ('->' optInd typeDesc)?;
paramListColon : paramList? (':' optInd typeDesc)?;
doBlock : 'do' paramListArrow pragma? colcom stmt;
doBlocks : doBlock (INDENT+ doBlock)*;
procExpr : 'proc' paramListColon pragma? ('=' COMMENT? stmt)?;
distinct : 'distinct' optInd typeDesc;
expr : (ifExpr
      | whenExpr
    //   | caseExpr
      | tryExpr)
      | simpleExpr;
typeKeyw : 'var' | 'out' | 'ref' | 'ptr' | 'shared' | 'tuple'
         | 'proc' | 'iterator' | 'distinct' | 'object' | 'enum';
primary : typeKeyw typeDesc
        |  prefixOperator* identOrLiteral primarySuffix*
        | 'static' primary
        | 'bind' primary;
typeDesc : simpleExpr;
typeDefAux : simpleExpr
           | 'concept' typeClass;
macroColon : ':' stmt? ( INDENT+ 'of' exprList ':' stmt
                       | INDENT+ 'elif' expr ':' stmt
                       | INDENT+ 'except' exprList ':' stmt
                       | INDENT+ 'else' ':' stmt )*;
exprStmt : simpleExpr
         (( ':' optInd expr )
         | ( expr (comma expr)*
             doBlocks
              | macroColon
           ))?;
importStmt : 'import' optInd expr
              ((comma expr)*
              | 'except' optInd (expr (comma expr)*));

exportStmt : 'export' optInd expr
              ((comma expr)*
              | 'except' optInd (expr (comma expr)*));

includeStmt : 'include' optInd expr (comma expr)*;
fromStmt : 'from' IDENTIFIER 'import' optInd expr (comma expr)*;
returnStmt : 'return' optInd expr?;
raiseStmt : 'raise' optInd expr?;
yieldStmt : 'yield' optInd expr?;
discardStmt : 'discard' optInd expr?;
breakStmt : 'break' optInd expr?;
continueStmt : 'break' optInd expr?;
condStmt : expr colcom stmt COMMENT?
           (INDENT+ 'elif' expr colcom stmt)*
           (INDENT+ 'else' colcom stmt)?;
ifStmt : 'if' condStmt;
whenStmt : 'when' condStmt;
whileStmt : 'while' expr colcom stmt;
ofBranch : 'of' exprList colcom stmt;
ofBranches : ofBranch (INDENT+ ofBranch)*
                      (INDENT+ 'elif' expr colcom stmt)*
                      (INDENT+ 'else' colcom stmt)?;
caseStmt : 'case' expr ':'? COMMENT?
            (INDENT ofBranches 
            | INDENT ofBranches);
tryStmt : 'try' colcom stmt (INDENT? 'except'|'finally')
           (INDENT? 'except' exprList colcom stmt)*
           (INDENT? 'finally' colcom stmt)?;
tryExpr : 'try' colcom stmt (optInd 'except'|'finally')
           (optInd 'except' exprList colcom stmt)*
           (optInd 'finally' colcom stmt)?;
exceptBlock : 'except' colcom stmt;
forStmt : 'for' (identWithPragma (comma identWithPragma)*) 'in' expr colcom stmt;
blockStmt : 'block' symbol? colcom stmt;
staticStmt : 'static' colcom stmt;
deferStmt : 'defer' colcom stmt;
asmStmt : 'asm' pragma? (STR_LIT | RSTR_LIT | TRIPLESTR_LIT);
genericParam : symbol (comma symbol)* (colon expr)? (':' optInd expr)?;
genericParamList : '[' optInd
                    genericParam (( comma | semicolon ) genericParam)* optPar ']';
pattern : '{' stmt '}';
indAndComment : (INDENT COMMENT)? | COMMENT?;
routine : optInd identVis pattern? genericParamList?
  paramListColon pragma? ('=' COMMENT? stmt)? indAndComment;
commentStmt : COMMENT;
// section(p) : COMMENT? p / (INDENT (p | COMMENT)^+INDENT);
constant : identWithPragma (colon typeDesc)? '=' optInd expr indAndComment;

objectWhen : 'when' expr colcom objectPart COMMENT?
            ('elif' expr colcom objectPart COMMENT?)*
            ('else' colcom objectPart COMMENT?)?;
objectBranch : 'of' exprList colcom objectPart;
objectBranches : objectBranch (INDENT+ objectBranch)*
                      (INDENT+ 'elif' expr colcom objectPart)*
                      (INDENT+ 'else' colcom objectPart)?;
objectCase : 'case' identWithPragma ':' typeDesc ':'? COMMENT?
            (INDENT objectBranches 
            | INDENT objectBranches);

objectPart : INDENT objectPart (INDENT objectPart)*
           | objectWhen | objectCase | 'nil' | 'discard' | declColonEquals;

typeClassParam : ('var' | 'out')? symbol;
typeClass : typeClassParam ( ',' typeClassParam )* (pragma)? ('of' typeDesc (',' typeDesc)*)?
              INDENT stmt;
typeDef : identWithPragmaDot genericParamList? '=' optInd typeDefAux
            indAndComment?;
varTuple : '(' optInd identWithPragma (comma identWithPragma)* optPar ')' '=' optInd expr;
variable : (varTuple | identColonEquals) indAndComment;
bindStmt : 'bind' optInd qualifiedIdent (comma qualifiedIdent)*;
mixinStmt : 'mixin' optInd qualifiedIdent (comma qualifiedIdent)*;
pragmaStmt : pragma (':' COMMENT? stmt)?;
simpleStmt : ((returnStmt | raiseStmt | yieldStmt | discardStmt | breakStmt
           | continueStmt | pragmaStmt | importStmt | exportStmt | fromStmt
           | includeStmt | commentStmt) | exprStmt) COMMENT?;

echoStmt : 'echo (' STR_LIT (',' VARIABLE STR_LIT)*  ')';

complexOrSimpleStmt : (ifStmt | whenStmt | whileStmt
                    | tryStmt | forStmt
                    | blockStmt | staticStmt | deferStmt | asmStmt
                    | 'proc' routine
                    | 'method' routine
                    | 'iterator' routine
                    | 'macro' routine
                    | 'template' routine
                    | 'converter' routine
                    | 'type' (typeDef | (INDENT (typeDef | COMMENT) (INDENT (typeDef | COMMENT))*))
                    | 'const' (constant | (INDENT (constant | COMMENT) (INDENT (constant | COMMENT))*))
                    | ('let' | 'var')? (exprColonEqExprList)
                    | ('let' | 'var') (COMMENT? variable | (INDENT (variable | COMMENT) (INDENT (variable | COMMENT))*))
                    | bindStmt | mixinStmt)
                    | echoStmt
                    | simpleStmt;
//COMMENT? p / (IND{>} (p / COMMENT)^+IND{=} DED)
stmt : (complexOrSimpleStmt)+
     | (simpleStmt)+;

     //COMMENT? variable | (INDENT (variable | COMMENT) (INDENT (variable | COMMENT))*) |