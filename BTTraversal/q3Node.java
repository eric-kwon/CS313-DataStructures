
public class q3Node {

	int element;			// Integer element		
	q3Node left, right;		// Left and right nodes
	
	// Default constructor //
	public q3Node(){
		left = null;
		right = null;
		element = 0;
	}
	
	// Constructor //
	public q3Node(int e){
		left = null;
		right = null;
		element = e;
	}
	
	// Function to assign left node //
	public void setLeft (q3Node e){
		left = e;
	}
	
	// Function to assign right node //
	public void setRight (q3Node e){
		right = e;
	}
	
	// Function to perform pre-order traversal //
	public void preOrderTrav (q3Node root){
		if (root != null){
			System.out.print(root.element + " ");
			preOrderTrav (root.left);
			preOrderTrav (root.right);
			
		}
	}
	
	// Function to perform in-order traversal //
	public void inOrderTrav (q3Node root){
		if (root != null){
			inOrderTrav (root.left);
			System.out.print(root.element + " ");
			inOrderTrav (root.right);
			
		}
	}
	
	// Function to perform post-order traversal //
	public void postOrderTrav (q3Node root){
		if (root != null){
			postOrderTrav (root.left);
			postOrderTrav (root.right);
			System.out.print (root.element + " ");
			
		}
	}
}
