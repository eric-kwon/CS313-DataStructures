
public class q1Main<K,V> {

	public static void main (String args[]){
		
	System.out.println("");
	System.out.println("QUESTION #1: IMPLEMENT HEAP PRIORITY QUEUE AND REIMPLEMENT UPHEAP AND DOWNHEAP FUNCTION USING RECURSION");
	System.out.println("- - - - - - - - - -");
	System.out.println("NOTE: INSERTED PROVIDED KEY VALUE SET, AND REMOVED (REMOVEMIN) ALL UNTIL EMPTY");
	System.out.println("- - - - - - - - - -");
	
	heapPriorityQueue <Integer, String> newList = new heapPriorityQueue<Integer, String>();
	newList.insert(5,"A");
	System.out.println("(5,A) INSERTED");
	newList.insert(7,"F");
	System.out.println("(7,F) INSERTED");
	newList.insert(1,"D");
	System.out.println("(1,D) INSERTED");
	newList.insert(3,"J");
	System.out.println("(3,J) INSERTED");
	newList.insert(6,"L");
	System.out.println("(6,L) INSERTED");
	newList.insert(8,"G");
	System.out.println("(8,G) INSERTED");
	newList.insert(2,"H");
	System.out.println("(2,H) INSERTED");
	System.out.println("- - - - - - - - - -");
	
	while(!newList.isEmpty()){
	Entry<Integer,String> removed = newList.removeMin();
	int removedKey = removed.getKey();
	String removedString = removed.getValue();
	System.out.println("("+removedKey+","+removedString+") REMOVED");
	}
	System.out.println("");
	}
}