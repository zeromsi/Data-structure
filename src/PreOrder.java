import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PreOrder {
	private static Tree root;

	public static void main(String[] args) {
		addTree();
		PreOrder PreOrder = new PreOrder();
		recursiveTraversal(root);
		System.out.println();
		itarativeTraversal();
		// PreOrder.iterativeTraverse(root);
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
		two.left = five;
		two.right = six;
		three.left = seven;
		three.right = eight;
		five.left = nine;
		five.right = ten;
		// one.right = four;
	}

	private static void recursiveTraversal(Tree node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		if (node.left != null) {
			recursiveTraversal(node.left);
		}
		if (node.right != null) {
			recursiveTraversal(node.right);
		}
	}

	private static void itarativeTraversal() {
		Stack<Tree> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Tree node = stack.pop();
			System.out.print(node.data + " ");
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
				
			}
		}	
	}	
}