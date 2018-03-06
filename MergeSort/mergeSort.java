import java.util.Random;

public class mergeSort {
	
	public static void merge (int[] result, int[] left, int[] right) {
		int l1 = 0; // Left index
		int r1 = 0; // Right index
		
		for (int i = 0; i < result.length ; i++){
			if (r1 >= right.length || (l1 < left.length && left[l1] <= right[r1])){
				result[i] = left[l1];
				l1++;
			}
			else {
				result[i] = right[r1];
				r1++;
			}
		}
	}
	
	public static void mergeSort(int[] array){
		if (array.length >= 2) {
			int[] left = arrayLeft(array);
			int[] right = arrayRight(array);
			
			mergeSort(left);
			mergeSort(right);
			
			merge(array,left,right);
		}
	}
	
	public static int[] arrayLeft (int[] array) {
		int halfsize = array.length / 2;
		int[] left = new int[halfsize];
		for (int i = 0; i < halfsize ; i++){
			left[i] = array[i];
		}
		return left;
	}
	
	public static int[] arrayRight (int[] array) {
		int halfsize = array.length / 2;
		int otherhalf = array.length - halfsize;
		int[] right = new int[otherhalf];
		for (int i=0 ; i < otherhalf ; i++) {
			right[i] = array[i+halfsize];
		}
		return right;
	}
	
	public static void main (String args[]){
		
		System.out.println("\nQUESTION 2: IMPLEMENT AN ARRAY BASED MERGE SORT");
		System.out.println("- - - - - - - - - -");
		System.out.println("NOTE: RANDOM INTEGERS FROM 0 TO 100 INSERTED INTO ARRAY OF SIZE 15");
		System.out.println("- - - - - - - - - -");
		
		int[] randomArray = new int[15];
		int size = randomArray.length;
		Random rand = new Random();
		
		for (int i=0; i<size ; i++){
			randomArray[i] = rand.nextInt(100);
		}
		
		System.out.print("RANDOM ARRAY: (");
		
		for (int i=0; i<size ; i++){
			System.out.print(randomArray[i]);
			if (i!=size-1)
			System.out.print(" - ");
		}
		
		System.out.println(")");
		
		System.out.print("SORTED ARRAY: (");
		
		mergeSort(randomArray);
		
		for (int i=0; i<size ; i++){
			System.out.print(randomArray[i]);
			if (i!=size-1)
			System.out.print(" - ");
		}
		
		System.out.println(")\n");
	}

}