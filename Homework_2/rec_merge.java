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
 *  http://www.eecs.qmul.ac.uk/~mmh/ItA/algorithms/resources/mergesort.html (sort method)
 *  https://stackoverflow.com/questions/5958169/how-to-merge-two-sorted-arrays-into-a-sorted-array (merge method)
 *  https://stackoverflow.com/questions/12254145/how-do-i-sort-numbers-from-an-array-into-two-different-arrays-in-java (split method)
 *
 *  Assignment: 2

 *************************************************************************/
public class rec_merge {

	private static void split(int[] A) {
		int[] evenArray = split_even(A);
		int[] oddArray = split_odd(A);

		System.out.println("\nEven integers in array: ");
		printArray(evenArray);
		System.out.println("\nOdd integers in array: ");
		printArray(oddArray);
	}
	 	
	private static int[] split_even(int[] A) {
		int evenSize = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				evenSize++;
			}
		}

		int[] evenArray = new int[evenSize];

		int evenIdx = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				evenArray[evenIdx++] = A[i];
			}
		}
		return evenArray;
	}

	private static int[] split_odd(int[] A) {
		int oddSize = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 != 0) {
				oddSize++;
			}
		}

		int[] oddArray = new int[oddSize];

		int oddIdx = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 != 0) {
				oddArray[oddIdx++] = A[i];
			}
		}
		return oddArray;
	}
	
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
	
	private static int[] merge(int[] evenArray, int[] oddArray) {
		
		int[] answer = new int[evenArray.length + oddArray.length];

		int i = 0, j = 0, k = 0;
		while (i < evenArray.length && j < oddArray.length) {
			if (evenArray[i] < oddArray[j]) {
				answer[k] = evenArray[i];
				i++;
			} else {
				answer[k] = oddArray[j];
				j++;
			}
			k++;
		}
		while (i < evenArray.length) {
			answer[k] = evenArray[i];
			i++;
			k++;
		}
		while (j < oddArray.length) {
			answer[k] = oddArray[j];
			j++;
			k++;
		}

		return answer;
	}

	public static void printArray(int[] A) { // function to print array
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + "  ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = { 5, 8, 6, 4, 10, 7, 3, 22, 1, 1, 3, 2, 6, 11, 15, 0, 9 };

		int[] evenArray = split_even(a);
		int[] oddArray = split_odd(a);
		int[] ans = merge(evenArray, oddArray);
		System.out.println("Original array: ");
		printArray(a);
		split(a);
		sort(ans);
		System.out.println("\nMerged (sorted) array: ");
		printArray(ans);
		
/*	System.out.println();
		System.out.println("Even integers in array: ");
		printArray(evenArray);
		System.out.println("\nOdd integers in array: ");
		printArray(oddArray);
		System.out.println();
		System.out.println("Merged array: ");
		printArray(ans);
*/
		
	}
}
