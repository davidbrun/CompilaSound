
%%
   
%package fr.uha.ensisa.compil.sound
%class Lexer
%line
%column
%cup

%%

[ \t\n\r]					{ }
^#.*						{ }

";"							{ return getSymbolFactory().newSymbol ("TERM", Sym.TERM); }

"="							{ return getSymbolFactory().newSymbol ("EQUAL", Sym.EQUAL); }

"note_duration"				{ return getSymbolFactory().newSymbol ("NOTE_DURATION", Sym.NOTE_DURATION); }
"note_velocity"				{ return getSymbolFactory().newSymbol ("NOTE_VELOCITY", Sym.NOTE_VELOCITY); }

"import"					{ return getSymbolFactory().newSymbol ("IMPORT", Sym.IMPORT); }
"play"						{ return getSymbolFactory().newSymbol ("PLAY", Sym.PLAY); }

"load"						{ return getSymbolFactory().newSymbol ("LOAD", Sym.LOAD); }
"with_notes"				{ return getSymbolFactory().newSymbol ("WITH_NOTES", Sym.WITH_NOTES); }

"play_simult"				{ return getSymbolFactory().newSymbol ("PLAY_SIMULT", Sym.PLAY_SIMULT); }

"sequence"					{ return getSymbolFactory().newSymbol ("SEQUENCE", Sym.SEQUENCE); }

"repeat"					{ return getSymbolFactory().newSymbol ("REPEAT", Sym.REPEAT); }
"times"						{ return getSymbolFactory().newSymbol ("TIMES", Sym.TIMES); }
"end"						{ return getSymbolFactory().newSymbol ("END", Sym.END); }

[0-9]+						{ return getSymbolFactory().newSymbol ("NUMBER", Sym.NUMBER, new Integer(yytext())); }
[A-Z]						{ return getSymbolFactory().newSymbol ("NOTE", Sym.NOTE, new String(yytext())); }
[a-zA-Z][a-zA-Z_0-9]*		{ return getSymbolFactory().newSymbol ("VARIABLE", Sym.VARIABLE, new String(yytext())); }
[a-zA-Z_0-9\.\-\/\"\"#]*	{ return getSymbolFactory().newSymbol ("STRING", Sym.STRING, new String(yytext())); }

[^]							{ throw new Error("Illegal character <"+yytext()+">"); }