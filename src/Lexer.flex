%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%

{espacio} {/*Ignore*/}
"#".* {/*Ignore*/}
(variables) {lexeme=yytext(); return TKNVARIABLES;}
(:) {lexeme=yytext(); return TKNDOSPUNTOS;}
(variable) {lexeme=yytext(); return TKNVARIABLE;}
(entero) {lexeme=yytext(); return TKNENTERO;}
(decimal) {lexeme=yytext(); return TKNDECIMAL;}
(simbolo) {lexeme=yytext(); return TKNSIMBOLO;}
(texto) {lexeme=yytext(); return TKNTEXTO;}
(Logico) {lexeme=yytext(); return TKNLOGICO;}
(rfc) {lexeme=yytext(); return TKNRFC;}
(curp) {lexeme=yytext(); return TKNCURP;}
(codigo-principal) {lexeme=yytext(); return TKNCDPRINCIPAL;}
(funciones) {lexeme=yytext(); return TKNFUNCIONES;}
(procedimientos) {lexeme=yytext(); return TKNPROCEDIMIENTOS;}
(función|funcion) {lexeme=yytext(); return TKNFUNCION;}
(devolver) {lexeme=yytext(); return TKNDEVOLVER;}
(como) {lexeme=yytext(); return TKNCOMO;}
(procedimiento) {lexeme=yytext(); return TKNPROCEDIMIENTO;}
(inicio) {lexeme=yytext(); return TKNINICIOESTRUCTURA;}
(fin) {lexeme=yytext(); return TKNFINESTRUCTURA;}
(\.) {lexeme=yytext(); return TKNPUNTO;}
(si) {lexeme=yytext(); return TKNSI;}
(entonces) {lexeme=yytext(); return TKNENTONCES;}
(sino) {lexeme=yytext(); return TKNSINO;}
(para) {lexeme=yytext(); return TKNPARA;}
(mientras) {lexeme=yytext(); return TKNMIENTRAS;}
(romper) {lexeme=yytext(); return TKNROMPER;}
(\+) {lexeme=yytext(); return TKNSUMA;}
(-) {lexeme=yytext(); return TKNRESTA;}
(\*) {lexeme=yytext(); return TKNMULTIPLICACION;}
(\/) {lexeme=yytext(); return TKNDIVISION;}
(%) {lexeme=yytext(); return TKNMODULO;}
(\++) {lexeme=yytext(); return TKNINCREMENTO;}
(--) {lexeme=yytext(); return TKNDECREMENTO;}
(=) {lexeme=yytext(); return TKNIGUAL;}
(\+=) {lexeme=yytext(); return TKNSUMAIGUAL;}
(-=) {lexeme=yytext(); return TKNRESTAIGUAL;}
(\*=) {lexeme=yytext(); return TKNMULTIGUAL;}
(\/=) {lexeme=yytext(); return TKNDIVIGUAL;}
(%=) {lexeme=yytext(); return TKNMODIGUAL;}
(==) {lexeme=yytext(); return TKNIGUALOG;}
(!=) {lexeme=yytext(); return TKNDISTINTO;}
(>) {lexeme=yytext(); return TKNMAYOR;}
(<) {lexeme=yytext(); return TKNMENOR;}
(>=) {lexeme=yytext(); return TKNMAYORIGUAL;}
(<=) {lexeme=yytext(); return TKNMENORIGUAL;}
(_Y_) {lexeme=yytext(); return TKNY;}
(_O_) {lexeme=yytext(); return TKNO;}
(\~) {lexeme=yytext(); return TKNNEGACION;}
(\() {lexeme=yytext(); return TKNPARENTESISABRE;}
(\)) {lexeme=yytext(); return TKNPARENTESISCIERRA;}
(\,) {lexeme=yytext(); return TKNCOMA;}
(([A-ZÑ\x26]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1]))([A-Z\d]{3})?) {lexeme=yytext(); return TKNDATORFC;}
([A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])[HM]{1}(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)[B-DF-HJ-NP-TV-Z]{3}[0-9A-Z]{1}[0-9]{1}) {lexeme=yytext(); return TKNDATOCURP;}
(\")([\u0000-\u007F]*)(\") {lexeme=yytext(); return TKNCADENA;}
(\')([\u0000-\u007F])(\') {lexeme=yytext(); return TKNSIMBOLOVALOR;}
(verdadero) {lexeme=yytext(); return TKNVERDADERO;}
(falso) {lexeme=yytext(); return TKNFALSO;}
([0-9]{4})(-)((02-([0-1][0-9]|2[0-8]))|(((01)|(03)|(05)|(07)|(08)|(10)|(12))-([0-2][0-9]|3[0-1]))|(((04)|(06)|(09)|(11))(-)(([0-2][0-9])|(30)))) {lexeme=yytext(); return TKNFECHAVALOR;}
(2[0-4]|[01][0-9])(:)([0-5][0-9])(:)([0-5][0-9]) {lexeme=yytext(); return TKNHORAVALOR;}
([0-9]{4})(-)((02-([0-1][0-9]|2[0-8]))|(((01)|(03)|(05)|(07)|(08)|(10)|(12))-([0-2][0-9]|3[0-1]))|(((04)|(06)|(09)|(11))(-)(([0-2][0-9])|(30))))(\s)(2[0-4]|[01][0-9])(:)([0-5][0-9])(:)([0-5][0-9]) {lexeme=yytext(); return TKNFECHAHORAVALOR;}
(([A-Z]|[a-z])([0-9]|[A-Z]|[a-z]|\á|\é|\í|\ó|\ú|\ü|\_|\-)*) {lexeme=yytext(); return TKNID;}
(-[0-9]+)|([0-9]+) {lexeme=yytext(); return TKNINT;}
 . {return ERROR;}