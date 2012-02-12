package fr.uha.ensisa.compil.sound;

import java.io.FileReader;
import java_cup.runtime.ComplexSymbolFactory;

public class Main {
	
	static public void main(String args[]) {
		try {
			String name;
			if (args.length == 1)
				name = args[0];
			else
				name = "test.txt";
			
			ComplexSymbolFactory csf = new ComplexSymbolFactory();
			Lexer l = new Lexer(new FileReader(name));
			l.setSymbolFactory(csf);
			Parser p = new Parser(l, csf);
			p.parse();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}