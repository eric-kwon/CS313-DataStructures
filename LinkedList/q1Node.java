
public class q1Node<E> {
	
	public E element;			
	public q1Node<E> next;
	
	public q1Node() {
		this(null, null);		
	}
	
	public q1Node(E element, q1Node<E> next){
		this.element = element;	
		this.next = next;
	}
	
	public E getElement() {
		return element;			
	}
	
	public q1Node<E> getNext() {
		return next;			
	}
	
	public void setNext (q1Node<E> next){
		this.next = next;		
	}
}
