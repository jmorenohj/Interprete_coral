grammar CoralLanguage;


inicial: FUNCTION funcion FUNCTION functionchain main
       | nonempty body;

functionchain: funcion FUNCTION functionchain
             |
             ;

funcion: TKN_ID TKN_OPENING_PAR params TKN_CLOSING_PAR RETURNS returnopt nonempty body;

main: MAIN TKN_OPENING_PAR TKN_CLOSING_PAR RETURNS NOTHING nonempty body;

returnopt: vardeclaration
         | NOTHING;

type : INTEGER
     | FLOAT;

params: type TKN_ID params_suffix
      |
      ;

params_suffix: TKN_COMMA type TKN_ID params_suffix
             |
             ;

body: nonempty
    |
    ;

nonempty: vardeclaration body
              | idcall body
              | outputstat body
              | forloop
              | whileloop
              | ifstatement
              | srn body
              | expression
              ;

vardeclaration: type arrdeclaration TKN_ID ;

arrdeclaration : ARRAY TKN_OPENING_PAR arrdeclarationopt TKN_CLOSING_PAR
               |
               ;

arrdeclarationopt: TKN_INT
                 | TKN_QUESTION_MARK;

idcall: TKN_ID idopt idstuff
      | TKN_ID TKN_OPENING_PAR arguments TKN_CLOSING_PAR
      ;


idstuff: TKN_ASSIGN assignation;

idopt: TKN_ID arrpos
     | TKN_ID dotsize
     | TKN_ID
     ;

dotsize: TKN_PERIOD SIZE;

arrpos: TKN_OPENING_BRA expression TKN_CLOSING_BRA;

arguments: expression arguments_suffix
         |
         ;

arguments_suffix: TKN_COMMA expression arguments_suffix
                |
                ;

assignation: expression
           | inputstat;

inputstat: GET NEXT INPUT;

outputstat: PUT outputopt TO OUTPUT outputending;

outputopt: TKN_STR | expression;

outputending: WITH expression DECIMAL PLACES
            |
            ;

ifstatement: IF boolexpr nonempty body elseifstat;

elseifstat: ELSEIF boolexpr nonempty body elseifstat elsestatement
          | elsestatement
          |
          ;

elsestatement: ELSE nonempty body
             |
             ;

whileloop: WHILE boolexpr nonempty;

forloop: FOR TKN_ID idstuff TKN_SEMICOLON boolexpr  TKN_SEMICOLON TKN_ID idstuff nonempty body;

number: TKN_INT
      | TKN_FLOAT;


expression: expression1 expression_suffix;
expression_suffix: TKN_MINUS expression1 expression_suffix
                 | TKN_PLUS expression1 expression_suffix
                 |
                 ;
expression1: plusneg expression2 expression1_suffix;
expression1_suffix: aritm plusneg expression2 expression1_suffix
                  |
                  ;
expression2: idexpropt
           | number
           | TKN_OPENING_PAR expression TKN_CLOSING_PAR
           | builtin;

aritm: TKN_MOD
     | TKN_DIV
     | TKN_TIMES;

plusneg: TKN_MINUS
       | TKN_PLUS
       |
       ;

idexpropt: TKN_ID TKN_OPENING_PAR arguments TKN_CLOSING_PAR
        | idopt
         ;

boolexpr: boolexpr1 boolexpr_suffix;
boolexpr_suffix: OR boolexpr1 boolexpr_suffix
               |
               ;

boolexpr1: boolexpr2 boolexpr1_suffix;
boolexpr1_suffix: AND boolexpr2 boolexpr1_suffix
                |
                ;
boolexpr2: boolexpr3 boolexpr2_suffix;
boolexpr2_suffix: equals boolexpr3 boolexpr2_suffix
                |
                ;
boolexpr3: boolexpr4 boolexpr3_suffix;
boolexpr3_suffix: comparers boolexpr4 boolexpr3_suffix
                |
                ;
boolexpr4: boolexpr5 boolexpr4_suffix;
boolexpr4_suffix: TKN_MINUS boolexpr5 boolexpr4_suffix
                | TKN_PLUS boolexpr5 boolexpr4_suffix
                |
                ;
boolexpr5: plusneg boolexpr6 boolexpr5_suffix;
boolexpr5_suffix: aritm plusneg boolexpr6 boolexpr5_suffix
                |
                ;
boolexpr6: NOT TKN_OPENING_PAR boolexpr TKN_CLOSING_PAR
         | TKN_OPENING_PAR boolexpr TKN_CLOSING_PAR
         | builtin
         | idexpropt
         | number;

equals: TKN_EQUAL
      | TKN_NEQ;

comparers: TKN_LESS
         | TKN_LEQ
         | TKN_GREATER
         | TKN_GEQ;

builtin: sqrt
       | rdm
       | abs
       | pow;

sqrt: SQRT TKN_OPENING_PAR expression TKN_CLOSING_PAR;

srn: SRN TKN_OPENING_PAR expression TKN_CLOSING_PAR;

rdm: RAND TKN_OPENING_PAR expression TKN_COMMA expression TKN_CLOSING_PAR;

abs: ABS TKN_OPENING_PAR expression TKN_CLOSING_PAR;

pow: POW TKN_OPENING_PAR expression TKN_COMMA expression TKN_CLOSING_PAR;

/*-----------OPERATORS------------*/
TKN_ASSIGN :      '=';
TKN_PERIOD :      '.';
TKN_COMMA :       ',';
TKN_SEMICOLON :   ';';
TKN_CLOSING_BRA : ']';
TKN_OPENING_BRA:  '[';
TKN_CLOSING_PAR:  ')';
TKN_OPENING_PAR:  '(';
TKN_PLUS:         '+';
TKN_MINUS:        '-';
TKN_TIMES:        '*';
TKN_DIV:          '/';
TKN_MOD:          '%';
TKN_EQUAL:        '==';
TKN_NEQ:         '!=';
TKN_LESS:         '<';
TKN_LEQ:          '<=';
TKN_GREATER:      '>';
TKN_GEQ:          '>=';
TKN_QUESTION_MARK:'?';
/*-----------OPERATORS------------*/

/*-----------RESERVED WORDS-------*/
GET:      'Get';
NEXT:     'next';
INPUT:    'input';
PUT:      'Put';
TO:       'to';
OUTPUT:   'output';
IF:       'if';
ELSEIF:   'elseif';
ELSE:     'else';
WHILE:    'while';
FOR:      'for';
INTEGER:  'integer';
FLOAT:    'float';
ARRAY:    'array';
FUNCTION: 'Function';
RETURNS:  'returns';
SIZE:     'size';
MAIN:     'Main';
OR:       'or';
AND:      'and';
NOTHING:  'nothing';
NOT:      'not';
SRN:      'SeedRandomNumbers';
ABS:      'AbsoluteValue';
SQRT:     'SquareRoot';
POW:      'RaiseToPower';
RAND:     'RandomNumber';
WITH:     'with';
DECIMAL:  'decimal';
PLACES:   'places';
/*-----------RESERVED WORDS-------*/

TKN_ID : [a-zA-Z][a-zA-Z0-9_]* ;
TKN_INT : [0-9]+;
TKN_FLOAT: [0-9]+( | [.][0-9]+);
TKN_STR: '"' (ESC|~('\\'))*?('"');
fragment ESC: '\\"' | '\\\\' | '\\n' | '\\t';
ESP : [ \t\r\n]+ -> skip ;
LINE_COMMENT: '//' ~[\r\n]* -> skip;