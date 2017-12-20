import java.util.Scanner;

public class q2Main {

	public String reverseString (String strInput){
		
		/* Recursive method to return a substring of the target string at index 1 
		 * followed by the character at index 0. Base case is if the size of string
		 * is less than 1 or if the string is null to begin with.*/
		if (strInput == null || strInput.length() <= 1) 
		return strInput;
		return reverseString (strInput.substring(1)) + strInput.charAt(0);
		
	}
		
	public static void main (String[] args){
		
		// Brief description output //
		System.out.print("\n");
		System.out.println("QUESTION #2: TAKE A STRING AND REVERSE");
		System.out.println("- - - - - - - - - -");
		System.out.println("STEP 1: ENTER A STRING TO BE REVERSED");
		System.out.println("- - - - - - - - - -");
		Scanner keyInput = new Scanner(System.in);
		System.out.print("ENTER A STRING: ");
		String strInput = keyInput.nextLine();
		keyInput.close();
		
		// Create a string object from input and push it through the implemented function //
		q2Main object = new q2Main();
		String strReversed = object.reverseString(strInput);
		
		// Output //
		System.out.println("ORIGINAL STRING :" + strInput);
		System.out.println("REVERSED STRING :" + strReversed);
	}
	
	
}
