
public class q1LinkedList<E> {
	
	public q1Node<E> head = null;	// Head set to null by default //
	public q1Node<E> tail = null;	// Tail set to null by default //	
	public int size = 0;			// Default size set to 0 //		
	
	// Function to add element to the front of the List //
	public void addFirst (E element) {	
		head = new q1Node<>(element,head);
		if (size == 0) tail = head;
		size++; 
	}
	
	// Function to display all the nodes of the List //
	public void printList(q1Node<E> head) {		
		q1Node<E> current = head;
		while (current!=null) {
			System.out.print(current.getElement());
			if (current.getNext()!=null) System.out.print(" - ");
			current = current.getNext();
		}
	}
	
	// Function to reverse the List elements by bubbling method //
	public void reverseList(q1Node<E> head) {
		q1Node<E> currentNode = head;
		q1Node<E> nextNode = null;
		q1Node<E> tempNode = null;
		
		while(currentNode!=null){
			nextNode = currentNode.next;
			currentNode.next = tempNode;
			tempNode = currentNode;
			currentNode = nextNode;
		}
		head = tempNode;
		printList(head);
	}
}
