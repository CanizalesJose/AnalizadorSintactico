import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n,\s]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

{espacio} {/*Ignore*/}
( "#"(.)* ) {/*Ignore*/}
( variables ) {return new Symbol(sym.TKNVARIABLES, yychar, yyline, yytext());}
":" {return new Symbol(sym.TKNDOSPUNTOS, yychar, yyline, yytext());}
(variable) {return new Symbol(sym.TKNVARIABLE, yychar, yyline, yytext());}
(entero) {return new Symbol(sym.TKNENTERO, yychar, yyline, yytext());}
(decimal) {return new Symbol(sym.TKNDECIMAL, yychar, yyline, yytext());}
(simbolo) {return new Symbol(sym.TKNSIMBOLO, yychar, yyline, yytext());}
(texto) {return new Symbol(sym.TKNTEXTO, yychar, yyline, yytext());}
(Logico) {return new Symbol(sym.TKNLOGICO, yychar, yyline, yytext());}
(rfc) {return new Symbol(sym.TKNRFC, yychar, yyline, yytext());}
(curp) {return new Symbol(sym.TKNCURP, yychar, yyline, yytext());}
(codigo-principal) {return new Symbol(sym.TKNCDPRINCIPAL, yychar, yyline, yytext());}
(funciones) {return new Symbol(sym.TKNFUNCIONES, yychar, yyline, yytext());}
(procedimientos) {return new Symbol(sym.TKNPROCEDIMIENTOS, yychar, yyline, yytext());}
(función|funcion) {return new Symbol(sym.TKNFUNCION, yychar, yyline, yytext());}
(devolver) {return new Symbol(sym.TKNDEVOLVER, yychar, yyline, yytext());}
(como) {return new Symbol(sym.TKNCOMO, yychar, yyline, yytext());}
(procedimiento) {return new Symbol(sym.TKNPROCEDIMIENTO, yychar, yyline, yytext());}
(inicio) {return new Symbol(sym.TKNINICIOESTRUCTURA, yychar, yyline, yytext());}
(fin) {return new Symbol(sym.TKNFINESTRUCTURA, yychar, yyline, yytext());}
(\.) {return new Symbol(sym.TKNPUNTO, yychar, yyline, yytext());}
(si) {return new Symbol(sym.TKNSI, yychar, yyline, yytext());}
(entonces) {return new Symbol(sym.TKNENTONCES, yychar, yyline, yytext());}
(sino) {return new Symbol(sym.TKNSINO, yychar, yyline, yytext());}
(para) {return new Symbol(sym.TKNPARA, yychar, yyline, yytext());}
(mientras) {return new Symbol(sym.TKNMIENTRAS, yychar, yyline, yytext());}
(romper) {return new Symbol(sym.TKNROMPER, yychar, yyline, yytext());}
(\+) {return new Symbol(sym.TKNSUMA, yychar, yyline, yytext());}
(-) {return new Symbol(sym.TKNRESTA, yychar, yyline, yytext());}
(\*) {return new Symbol(sym.TKNMULTIPLICACION, yychar, yyline, yytext());}
(\/) {return new Symbol(sym.TKNDIVISION, yychar, yyline, yytext());}
(%) {return new Symbol(sym.TKNMODULO, yychar, yyline, yytext());}
(\++) {return new Symbol(sym.TKNINCREMENTO, yychar, yyline, yytext());}
(--) {return new Symbol(sym.TKNDECREMENTO, yychar, yyline, yytext());}
(=) {return new Symbol(sym.TKNIGUAL, yychar, yyline, yytext());}
(\+=) {return new Symbol(sym.TKNSUMAIGUAL, yychar, yyline, yytext());}
(-=) {return new Symbol(sym.TKNRESTAIGUAL, yychar, yyline, yytext());}
(\*=) {return new Symbol(sym.TKNMULTIGUAL, yychar, yyline, yytext());}
(\/=) {return new Symbol(sym.TKNDIVIGUAL, yychar, yyline, yytext());}
(%=) {return new Symbol(sym.TKNMODIGUAL, yychar, yyline, yytext());}
(==) {return new Symbol(sym.TKNIGUALOG, yychar, yyline, yytext());}
(!=) {return new Symbol(sym.TKNDISTINTO, yychar, yyline, yytext());}
(>) {return new Symbol(sym.TKNMAYOR, yychar, yyline, yytext());}
(<) {return new Symbol(sym.TKNMENOR, yychar, yyline, yytext());}
(>=) {return new Symbol(sym.TKNMAYORIGUAL, yychar, yyline, yytext());}
(<=) {return new Symbol(sym.TKNMENORIGUAL, yychar, yyline, yytext());}
(_Y_) {return new Symbol(sym.TKNY, yychar, yyline, yytext());}
(_O_) {return new Symbol(sym.TKNO, yychar, yyline, yytext());}
(\~) {return new Symbol(sym.TKNNEGACION, yychar, yyline, yytext());}
(\() {return new Symbol(sym.TKNPARENTESISABRE, yychar, yyline, yytext());}
(\)) {return new Symbol(sym.TKNPARENTESISCIERRA, yychar, yyline, yytext());}
(\,) {return new Symbol(sym.TKNCOMA, yychar, yyline, yytext());}
(([A-ZÑ\x26]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1]))([A-Z\d]{3})?) {return new Symbol(sym.TKNDATORFC, yychar, yyline, yytext());}
([A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])[HM]{1}(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)[B-DF-HJ-NP-TV-Z]{3}[0-9A-Z]{1}[0-9]{1}) {return new Symbol(sym.TKNDATOCURP, yychar, yyline, yytext());}
(\")([\u0000-\u007F]*)(\") {return new Symbol(sym.TKNCADENA, yychar, yyline, yytext());}
(\')([\u0000-\u007F])(\') {return new Symbol(sym.TKNSIMBOLOVALOR, yychar, yyline, yytext());}
(verdadero) {return new Symbol(sym.TKNVERDADERO, yychar, yyline, yytext());}
(falso) {return new Symbol(sym.TKNFALSO, yychar, yyline, yytext());}
([0-9]{4})(-)((02-([0-1][0-9]|2[0-8]))|(((01)|(03)|(05)|(07)|(08)|(10)|(12))-([0-2][0-9]|3[0-1]))|(((04)|(06)|(09)|(11))(-)(([0-2][0-9])|(30)))) {return new Symbol(sym.TKNFECHAVALOR, yychar, yyline, yytext());}
(2[0-4]|[01][0-9])(:)([0-5][0-9])(:)([0-5][0-9]) {return new Symbol(sym.TKNHORAVALOR, yychar, yyline, yytext());}
([0-9]{4})(-)((02-([0-1][0-9]|2[0-8]))|(((01)|(03)|(05)|(07)|(08)|(10)|(12))-([0-2][0-9]|3[0-1]))|(((04)|(06)|(09)|(11))(-)(([0-2][0-9])|(30))))(\s)(2[0-4]|[01][0-9])(:)([0-5][0-9])(:)([0-5][0-9]) {return new Symbol(sym.TKNFECHAHORAVALOR, yychar, yyline, yytext());}
(([A-Z]|[a-z])([0-9]|[A-Z]|[a-z]|\á|\é|\í|\ó|\ú|\ü|\_|\-)*) {return new Symbol(sym.TKNID;}
(-[0-9]+)|([0-9]+) {return new Symbol(sym.TKNINT;}
 . {return ERROR;}