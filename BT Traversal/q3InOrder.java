
public class q3InOrder {
	
	// Function to create a binary tree of pre-assigned integers //
	public static q3Node newBinaryTree(){
		q3Node root = new q3Node(10);
		q3Node node1 = new q3Node(20);
		q3Node node2 = new q3Node(40);
		q3Node node3 = new q3Node(50);
		q3Node node4 = new q3Node(30);
		q3Node node5 = new q3Node(60);
		q3Node node6 = new q3Node(70);
		
		root.setLeft(node1);
		root.setRight(node4);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		
		node4.setLeft(node5);
		node4.setRight(node6);
		
		return root;
	}

	public static void main(String[] args){
		
		// Brief description output //
		System.out.println("\nQUESTION #3: IN-ORDER TRAVERSAL OF BINARY TREE");
		System.out.println("- - - - - - - - - -");
		System.out.println("ORIGINAL BINARY TREE AS BELOW");
		System.out.println("          10           ");
		System.out.println("    20          30     ");
		System.out.println(" 40    50    60    70  ");
		System.out.println("- - - - - - - - - -");
		
		// Creating new tree //
		q3Node newTree = new q3Node();
		q3Node rootNode = newBinaryTree();
		
		// Output //
		System.out.print("INORDER TRAVERSAL: ");
		newTree.inOrderTrav(rootNode);
		System.out.print("\n");
	}
}
