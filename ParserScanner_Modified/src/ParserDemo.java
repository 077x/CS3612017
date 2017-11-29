/*************************************************************************
 * 	Pace University 
 * 	Fall 2017 
 * 	Programming Languages and Implementations
 *
 * 	Course: CS 361 
 * 	Author: Christelle Scharff
 * 	Code completed by: Tomer Alon & Angie Ramirez
 * 	
 * Analysis of Jay's Lexical and Syntactical Syntax
 * 
 *************************************************************************/

public class ParserDemo {
	private static String file1 = "prog9.jay";

	public static void main(String[] args) {
		TokenStream tStream = new TokenStream(file1);
		System.out.println("test1");
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		System.out.println("test2");
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");
	}

}
