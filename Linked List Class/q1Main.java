public class q1Main {
	
	public static void main (String[] args) {
		
		// Brief description output //
		System.out.print("\n");
		System.out.println("QUESTION #1: REVERSE A SINGLY LINKED LIST");
		System.out.println("- - - - - - - - - -");
		System.out.println("NOTE: A DEFAULT LINKED LIST HAS BEEN SET TO DEMONSTRATE REVERSAL");
		System.out.println("- - - - - - - - - -");
		
		// Created List consisting of random integers //
		q1LinkedList<Integer> E = new q1LinkedList<Integer>();
		E.addFirst(34);
		E.addFirst(19);
		E.addFirst(44);
		E.addFirst(72);
		E.addFirst(67);
		
		// Output //
		System.out.print("ORIGINAL LINKED LIST: ");
		E.printList(E.head);
		System.out.print("\nREVERSED LINKED LIST: ");
		E.reverseList(E.head);	
		System.out.print("\n");
	
	}
}
