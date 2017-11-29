/*************************************************************************
 * 	Pace University 
 * 	Fall 2017 
 * 	Programming Languages and Implementations
 *
 * 	Course: CS 361 
 * 	Author: Christelle Scharff
 * 	Code completed by: Tomer Alon & Angie Ramirez
 * 
 *************************************************************************/
public class ScannerDemo {

	private static String file1 = ("prog8.jay");
	private static int counter = 1;
	private static Token t;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);

		System.out.println(file1);

		while (!ts.isEndofFile()) {
			t = ts.nextToken();
			System.out.println("Token " + counter + ": '" + t.getValue() + "'" + " Type: " + t.getType());
			counter++;
		}
	}
}
