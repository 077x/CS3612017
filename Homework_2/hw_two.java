/*************************************************************************
 *
 *  Pace University
 *  Fall 2017
 *  Programming Languages & Implementations
 *
 *  Course: CS 361
 *  Author: Tomer Alon
 *  
 *  References: 
 *  http://www.cs.cmu.edu/~ref/pgss/lecture/7/index.html (for Question5)
 *  http://www.eecs.qmul.ac.uk/~mmh/ItA/algorithms/resources/mergesort.html (for Question 6 [sort method])
 *  https://stackoverflow.com/questions/5958169/how-to-merge-two-sorted-arrays-into-a-sorted-array (for Question 6 [mergeSort method])
 *  http://www.cs.utexas.edu/~mitra/csSpring2008/cs313/lectures/recursion.html (for Question 6 [printArray method])
 *
 *  Assignment: 2

 *************************************************************************/

/*
 Question2
	public class Circle{
		public double center_x, center_y; 
		public double radius; 
		public void draw() { 
		// (1) method to draw circle on the screen
		} 

		public void draw(Color color) { 
		// (2) method to draw circle on the screen with a 
		// given color
		}
	}

		public class ColoredCircle extends Circle{ 
		public int color; 
		//Circle c = new Circle();
		ColoredCircle d = new ColoredCircle();;
		//ColoredCircle d = c;
		Circle c = d;
		
		public void draw() { 
		// (3) method to draw the colored circle
			}
		}
	
		public static void main (String[]args) {
			System.out.println();
			//c = d; 
			//c.draw();	
		} 
*/
/*
 Question3c
	public static void main (String[]args) {
		
		int i = 5;
		i = i+5;

	}*/
/*	
 Question3d
	public static int sum_for(int n) {
		int i = 0, sum = 0;
		for (i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static int sum_while(int n) {
		int i = 0, sum = 0;
		while (i <= n) {
			sum += i;
			i++;
		}
		return sum;
	}
	public static void main(String[]args) {
	System.out.println(sum_for(2));
	System.out.println(sum_while(2));
}*/
/*	
 Question3e
	public static int fact(int n){
		if (n==0) { //base case
	       return 1;
	    }
	    else {
	    	return (n * fact(n-1));
	    }
	}
	
	public static void main(String[]args) {
		System.out.println(fact(5));
	}
	
*/
/*
 Question3f
public static int gcd (int a, int b) {
	if (b == 0) {
		return a;
	}
	else {
		return gcd(b, a%b);
	}
}
	public static void main(String[]args) {
		System.out.println(gcd(54,24));
	}*/
/*
 Question5 Write a recursive function recPow that computes 2^n for n >= 0	
	public static int recPow(int n) {
		if (n < 0) {
			throw new RuntimeException("n has to be an integer greater than zero.");
		}
		else if (n>=31) {
			throw new RuntimeException("Integer Overflow");
		}
		else if (n == 0) {
			return 1;
		}
		else if (n == 1) {
			return 2;
		}
		else {
			return 2 * recPow((n-1));
		}
	}
	
public static void main (String[]args) {	
	for(int i = 0; i <= 31; i++) {	
		System.out.println("2^"+i + " = " + recPow(i));
		}
}*/
/*
 Question6 Write a recursive function merge that merges 2 arrays in Java
	public static int[] sort(int[] a){
		 // Sort the contents of array a in ascending numerical order
		  if(a.length > 1){
		      int i,mid = a.length/2;
		      int[] half1 = new int[mid];
		      int[] half2 = new int[a.length - mid];
		      for(i = 0; i < mid; i++)
		        half1[i] = a[i];

		      for(; i < a.length; i++)
		        half2[i - mid] = a[i];
		      sort(half1);
		      sort(half2);
		      int ja = 0, ka = 0;
		      for(i = 0; ja < half1.length && ka < half2.length; i++)
		         if(half1[ja] < half2[ka]){
		             a[i] = half1[ja];
		             ja++; 
		            }
		         else{
		             a[i] = half2[ka];
		             ka++;
		            }
		      for(; ja < half1.length; i++, ja++)
		        a[i] = half1[ja];
		      for(; ka < half2.length; i++, ka++)
		        a[i] = half2[ka];
		     }
		 return a;
		 }
		
	public static int[] mergeSort(int[] a, int[] b) { 
		//function to merge two arrays
		
		int[] answer = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
			while (i < a.length && j < b.length){
			   if (a[i] < b[j]){
			       answer[k] = a[i];
			       i++;
			   }
			   else{
				   answer[k] = b[j];
			       j++;
			   }
			       k++;
			}
			while (i < a.length){
			       answer[k] = a[i];
			       i++;
			       k++;
			}
			while (j < b.length){
			       answer[k] = b[j];
			       j++;
			       k++;
			}
			return sort(answer);
	}
		
	public static void printArray ( int[] anArray ){ //function to print array
		    for ( int i = 0; i < anArray.length; i++ )
		      System.out.print ( anArray[i] + "  " );
		    System.out.println ();
		  }
		
	public static void main (String[]args) {
		int []a = {5,4,6,8,10,7,3};
		int []b = {1,3,2,6,11,15,0,9};
		int []answera = (sort(a));
		int []answerb = (sort(b));
		int []ans = mergeSort(a,b);
		printArray(answera);
		printArray(answerb);
		printArray(ans);
		
		}*/

public class hw_two {
	//Sources are cited in the first comment.
	//Every coding question is within the comments listed above. Just cut out the comment into the class to compile the code.

}