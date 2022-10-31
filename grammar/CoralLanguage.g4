grammar CoralLanguage;


inicial: FUNCTION funcion FUNCTION functionchain main
       | nonempty body;

functionchain: funcion FUNCTION functionchain
             |
             ;

funcion: TKN_ID TKN_OPENING_PAR params TKN_CLOSING_PAR RETURNS returnopt nonempty body;

main: MAIN TKN_OPENING_PAR TKN_CLOSING_PAR RETURNS NOTHING nonempty body;

returnopt: vardeclaration NOTHING;

type : INTEGER
     | FLOAT;

params: type TKN_ID params
      |
      ;

params_suffix: TKN_COMMA type TKN_ID params_suffix
             |
             ;

body: nonempty
    |
    ;

nonempty: vardeclaration body
              | TKN_ID idcall body
              | outputstat body
              | forloop nonempty
              | whileloop nonempty
              | ifstatement
              | srn body
              ;

vardeclaration: type arrdeclaration TKN_ID ;

arrdeclaration : ARRAY TKN_OPENING_PAR arrdeclarationopt TKN_CLOSING_PAR
               |
               ;

arrdeclarationopt: TKN_INT
                 | TKN_QUESTION_MARK;

idcall: idopt idstuff
      | TKN_OPENING_PAR arguments TKN_CLOSING_PAR
      |
      ;

idstuff: TKN_ASSIGN assignation;

idopt: arrpos
     | dotsize
     |
     ;

dotsize: TKN_PERIOD SIZE;

arrpos: TKN_CLOSING_BRA expression TKN_CLOSING_BRA;

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

outputopt: TKN_STR
         | expression;

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

whileloop: WHILE boolexpr;

forloop: FOR TKN_ID idopt idstuff TKN_SEMICOLON boolexpr  TKN_SEMICOLON TKN_ID idopt idstuff;

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
expression2: TKN_ID idexpropt
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

idexpropt: idopt
         | TKN_OPENING_PAR arguments TKN_CLOSING_PAR
         |
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
         | TKN_ID idexpropt
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


/*
grammar = {"S":[["Function","funcion","Function","FunctionChain","main"],["nonempty","body"]],
           "FunctionChain":[["funcion","Function","FunctionChain"],[""]],
           "funcion": [["id","tkn_opening_par","params","tkn_closing_par","returns","returnopt","nonempty","body"]],
           "main": [["Main","tkn_opening_par","tkn_closing_par","returns","nothing","nonempty","body"]],
           "returnopt":[["vardeclaration"],["nothing"]],
           "type": [["integer"],["float"]],
           "params": [["type","id","params'"],[""]],
           "params'":[["tkn_comma","type","id","params'"],[""]],
           "body": [["vardeclaration","body"],["id","idcall","body"],["outputstat","body"],["forloop","nonempty","body"],["whileloop","nonempty","body"],
                ["ifstatement"],["srn","body"],[""]],
           "nonempty":[["vardeclaration"],["id","idcall"],["outputstat"],["forloop","nonempty","body"],["whileloop","nonempty","body"],
                       ["ifstatement"],["srn"]],
           "vardeclaration":[["type","arrdeclaration","id"]],
           "arrdeclaration":[["array","tkn_opening_par","arrdeclarationopt","tkn_closing_par"],[""]],
           "arrdeclarationopt":[["tkn_integer"],["tkn_question_mark"]],
           "idcall":[["idopt","idstuff"],["tkn_opening_par","arguments","tkn_closing_par"]],
           "idstuff":[["tkn_assign","assignation"]],
           "idopt":[["arrpos"],["dotsize"],[""]],
           "dotsize":[["tkn_period","size"]],
           "arrpos":[["tkn_opening_bra","expression","tkn_closing_bra"]],
           "arguments":[["expression","arguments'"],[""]],
           "arguments'":[["tkn_comma","expression","arguments'"],[""]],
           "assignation": [["expression"],["inputstat"]],
           "inputstat":[["Get","next","input"]],
           "outputstat":[["Put","outputopt","to","output","outputending"]],
           "outputopt":[["tkn_str"],["expression"]],
           "outputending":[["with","expression", "decimal", "places"],[""]],
           "ifstatement":[["if","boolexpr","nonempty","body","elseifstat"]],
           "elseifstat":[["elseif","boolexpr","nonempty","body","elseifstat","elsestatement"],["elsestatement"],[""]],
           "elsestatement":[["else","nonempty","body",],[""]],
           "whileloop":[["while","boolexpr"]],
           "forloop":[["for","id","idopt","idstuff","tkn_semicolon","boolexpr","tkn_semicolon","id","idopt","idstuff"]],
           "number":[["tkn_integer"],["tkn_float"]],
           "expression":[["expression1","expression'"]],
           "expression'":[["tkn_minus","expression1","expression'"],["tkn_plus","expression1","expression'"],[""]],
           "expression1":[["plusneg","expression2","expression1'"]],
           "expression1'":[["aritm","plusneg","expression2","expression1'"],[""]],
           "expression2":[["id","idexpropt"],["number"],["tkn_opening_par","expression","tkn_closing_par"],["builtin"]],
           "aritm":[["tkn_mod"],["tkn_div"],["tkn_times"]],
           "plusneg":[["tkn_minus"],["tkn_plus"],[""]],
           "idexpropt":[["idopt"],["tkn_opening_par","arguments","tkn_closing_par"],[""]],
           "boolexpr":[["boolexpr1","boolexpr'"]],
           "boolexpr'":[["or","boolexpr1","boolexpr'"],[""]],
           "boolexpr1":[["boolexpr2","boolexpr1'"]],
           "boolexpr1'":[["and","boolexpr2","boolexpr1'"],[""]],
           "boolexpr2":[["boolexpr3","boolexpr2'"]],
           "boolexpr2'":[["equals","boolexpr3","boolexpr2'"],[""]],
           "boolexpr3":[["boolexpr4","boolexpr3'"]],
           "boolexpr3'":[["comparers","boolexpr4","boolexpr3'"],[""]],
           "boolexpr4":[["boolexpr5","boolexpr4'"]],
           "boolexpr4'":[["tkn_minus","boolexpr5","boolexpr4'"],["tkn_plus","boolexpr5","boolexpr4'"],[""]],
           "boolexpr5":[["plusneg","boolexpr6","boolexpr5'"]],
           "boolexpr5'":[["aritm","plusneg","boolexpr6","boolexpr5'"],[""]],
           "boolexpr6":[["not","tkn_opening_par","boolexpr","tkn_closing_par"],["tkn_opening_par","boolexpr","tkn_closing_par"],["builtin"],["id","idexpropt"],["number"]],
           "equals":[["tkn_equal"],["tkn_neq"]],
           "comparers":[["tkn_less"],["tkn_leq"],["tkn_greater"],["tkn_geq"]],
           "builtin":[["sqrt"],["rdm"],["abs"],["pow"]],
           "sqrt":[["SquareRoot","tkn_opening_par","expression","tkn_closing_par"]],
           "srn":[["SeedRandomNumbers","tkn_opening_par","expression","tkn_closing_par"]],
           "rdm":[["RandomNumber","tkn_opening_par","expression","tkn_comma","expression","tkn_closing_par"]],
           "abs":[["AbsoluteValue","tkn_opening_par","expression","tkn_closing_par"]],
           "pow":[["RaiseToPower","tkn_opening_par","expression","tkn_comma","expression","tkn_closing_par"]]
           }*/
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
PLACES:   'places"';
/*-----------RESERVED WORDS-------*/

TKN_ID : [a-zA-Z][a-zA-Z0-9_]* ;
TKN_INT : [0-9]+;
TKN_FLOAT: [0-9]+( | [.][0-9]+);
TKN_STR: [a-zA-Z][a-zA-Z0-9_]*;
ESP : [ \t\r\n]+ -> skip ;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
