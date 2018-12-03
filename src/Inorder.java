/*
 * Inorder tree traversal is a traversal where we visit last left node then root then right node.
 * 
 */

public class Inorder {
	private static Tree root;
	public static void main(String[] args) {		
		addTree();
		recursiveTraversal(root);
	}
	
	public static void addTree() {
		root = new Tree(5);
		Tree one = new Tree(7);
		Tree two = new Tree(9);
		Tree three = new Tree(3);
		Tree four = new Tree(2);
		Tree five = new Tree(8);
		Tree six = new Tree(6);
		Tree seven = new Tree(18);
		Tree eight = new Tree(15);
		Tree nine = new Tree(20);
		Tree ten = new Tree(16);
		root.left = one;
		root.right = two;
		one.left = three;
		one.right = four;
		two.left=five;
		two.right=six;
		three.left=seven;
		three.right=eight;
		five.left=nine;
		five.right=ten;
	}
	
	private static void recursiveTraversal (Tree node){
		if(node==null) {
			return;
		}		

		recursiveTraversal(node.left);
		System.out.print(node.data+" ");
		recursiveTraversal(node.right);
		
	}
	
	private static void iterativeTraversal() {
		
	}


}
