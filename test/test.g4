grammar test;

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

DIGIT : [0-9];
LETTER : [a-zA-Z];

///////////////////END MILESTONE 1 //////////////////////////////////////

// MILESTONE 2:


dataType : 'int';

identifier : IDENTIFIER;

number : DIGIT+;

comma : ',';

colon : ':';

equals : '=';

plus : '+';

declareStmt : ('let' | 'var') identifier ( comma identifier )* colon dataType;

simpleStmt : identifier equals number;

plusStmt : identifier equals identifier ('+' identifier)+;

stmt : declareStmt | simpleStmt | plusStmt;

module : (stmt ((';' | INDENT+)? stmt)*)?;

start       : module;
