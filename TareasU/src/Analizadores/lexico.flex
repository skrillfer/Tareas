package Analizadores;


import java.util.LinkedList;
import java_cup.runtime.*;
%%
%class LexParser
%public
%full
%unicode
%line
%column
%char
%ignorecase
%cup

LineTerminator = \r|\n|\r\n|\n\r|\t
WhiteSpace = {LineTerminator} | [ \t\f]|\t
Id = [:jletter:]["�"|"�"|"�"|"�"|"�"|[:jletterdigit:]|"_"|]*

%%
/* SIGNOS */
<YYINITIAL> "{" {return new Symbol(sym.alla, new token(yycolumn, yyline, yytext()));}
<YYINITIAL> "}" {return new Symbol(sym.clla, new token(yycolumn, yyline, yytext()));}
<YYINITIAL> ";" {return new Symbol(sym.pyc, new token(yycolumn, yyline, yytext()));}

/* Palabras reservadas */
<YYINITIAL> "int" {return new Symbol(sym.inT, new token(yycolumn, yyline, yytext()));}
<YYINITIAL> "char" {return new Symbol(sym.chaR, new token(yycolumn, yyline, yytext()));}
<YYINITIAL> "bool" {return new Symbol(sym.booL, new token(yycolumn, yyline, yytext()));}

<YYINITIAL> {Id} {return new Symbol(sym.id, new token(yycolumn, yyline, yytext()));}

{LineTerminator} {/* ignorar */}
{WhiteSpace} {/* ignorar */}
. {System.out.println(yyline+","+yycolumn+"=["+yytext()+"],"+yychar); }