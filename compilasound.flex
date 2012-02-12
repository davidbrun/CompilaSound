
%%
   
%package fr.uha.ensisa.compil.sound
%class Lexer
%line
%column
%cup

%%
[ \t\f]					{ }
\r\n|\r|\n				{ return getSymbolFactory().newSymbol ("EOLN", Sym.EOLN); }
"="						{ return getSymbolFactory().newSymbol ("EQUAL", Sym.EQUAL); }
"+"						{ return getSymbolFactory().newSymbol ("PLUS", Sym.PLUS); }
"-"						{ return getSymbolFactory().newSymbol ("MINUS", Sym.MINUS); }
"*"						{ return getSymbolFactory().newSymbol ("TIMES", Sym.TIMES); }
"/"						{ return getSymbolFactory().newSymbol ("DIVIDE", Sym.DIVIDE); }
"("						{ return getSymbolFactory().newSymbol ("LPAREN", Sym.LPAREN); }
")"						{ return getSymbolFactory().newSymbol ("RPAREN", Sym.RPAREN); }
   
[0-9]+      			{ return getSymbolFactory().newSymbol ("NUMBER", Sym.NUMBER, new Integer(yytext())); }
[A-Za-z_][A-Za-z_0-9]*	{ return getSymbolFactory().newSymbol ("ID", Sym.ID, new String(yytext())); }
   
[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
