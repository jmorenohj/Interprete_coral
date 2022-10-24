grammar CoralLanguage;

/*
inicial : function_inicial
        | codeblock;

function_inicial : FUNCTION inicial_main_vs_id;

function_no_inicial: FUNCTION main_vs_id;

inicial_main_vs_id : TKN_ID func_def;

main_vs_id : TKN_ID func_def
           | main_def;

func_def : TKN_CLOSING_PAR params_def TKN_CLOSING_PAR RETURNS func_def_returns codeblock FUNCTION main_vs_id;

main_def: MAIN TKN_OPENING_PAR TKN_CLOSING_PAR RETURNS NOTHING codeblock;

func_def_returns :   INTEGER func_def_returns_suffix
                 |   FLOAT func_def_returns_suffix
                 |   NOTHING;

func_def_returns_suffix : ARRAY TKN_OPENING_PAR term_new_array TKN_CLOSING_PAR TKN_ID
                        | TKN_ID
                        |
                        ;

params_def : FLOAT TKN_ID params_suffix_def
           | INTEGER TKN_ID params_suffix_def
           |
           ;

params_def_non_empty: FLOAT TKN_ID params_suffix_def
                    | INTEGER TKN_ID params_suffix_def;

params_suffix_def: TKN_COMMA params_def_non_empty
                 |
                 ;

operacion: TKN_OPENING_PAR operacion TKN_CLOSING_PAR operador
         | signo operacion
         | term operador;

operador: TKN_TIMES operacion
        | TKN_PLUS operacion
        | TKN_MINUS operacion
        | TKN_DIV operacion
        | TKN_MOD operacion
        |
        ;

term : TKN_INT
     | TKN_ID id_suffix //Suffix might be "" for id, [] for array, () for function
     | TKN_FLOAT
     | RAND TKN_OPENING_PAR operacion TKN_COMMA operacion TKN_CLOSING_PAR
     | ABS TKN_OPENING_PAR operacion TKN_CLOSING_PAR
     | SQRT TKN_OPENING_PAR operacion TKN_CLOSING_PAR
     | POW TKN_OPENING_PAR operacion TKN_COMMA operacion TKN_CLOSING_PAR;

term_new_array : TKN_INT
               | TKN_QUESTION_MARK;

signo : TKN_PLUS
      | TKN_MINUS;

id_suffix : array_loc
      | function_call
      | TKN_PERIOD SIZE
      |
      ;

array_loc : TKN_OPENING_BRA operacion TKN_CLOSING_BRA;

function_call : TKN_OPENING_PAR params TKN_CLOSING_PAR;

params : operacion params_suffix
       |
       ;
params_suffix : TKN_COMMA params
       |
       ;
*/

inicial: FUNCTION funcion FUNCTION functionchain main
       | nonempty body;

functionchain: funcion FUNCTION functionchain
             |
             ;

funcion: TKN_ID TKN_OPENING_PAR params TKN_CLOSING_PAR RETURNS returnopt nonempty body;

main: MAIN TKN_OPENING_PAR TKN_CLOSING_PAR RETURNS NOTHING nonempty body;

returnopt: vardeclaration nothing;

type : INTEGER
     | FLOAT;

params: type TKN_ID params
      |
      ;

params_suffix: TKN_COMMA type TKN_ID params_suffix
             |
             ;



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
           "operands":[["tkn_minus"],["tkn_plus"],["tkn_mod"],["tkn_div"],["tkn_times"]],
           "builtin":[["sqrt"],["rdm"],["abs"],["pow"]],
           "sqrt":[["SquareRoot","tkn_opening_par","expression","tkn_closing_par"]],
           "srn":[["SeedRandomNumbers","tkn_opening_par","expression","tkn_closing_par"]],
           "rdm":[["RandomNumber","tkn_opening_par","expression","tkn_comma","expression","tkn_closing_par"]],
           "abs":[["AbsoluteValue","tkn_opening_par","expression","tkn_closing_par"]],
           "pow":[["RaiseToPower","tkn_opening_par","expression","tkn_comma","expression","tkn_closing_par"]]
           }
/*-----------OPERATORS------------*/
TKN_ASSIGN :      '=';
TKN_PERIOD :      '.';
TKN_COMMA :       ',';
TKN_SEMICOLON :   ';';
TKN_CLOSING_BRA : ']';
TKN_OPENING_BRA:  '[';
TKN_CLOSING_PAR:  '(';
TKN_OPENING_PAR:  ')';
TKN_PLUS:         '+';
TKN_MINUS:        '-';
TKN_TIMES:        '*';
TKN_DIV:          '/';
TKN_MOD:          '%';
TKN_EQUAL:        '==';
TKN_NEQ_:         '!=';
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
ESP : [ \t\r\n]+ -> skip ;

