import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

	private static Tree root;
	static Queue<Tree> queues=new LinkedList<>();
	static Queue<Tree> queuesTwo=new LinkedList<>();
	public static void main(String[] args) {
		addTree();
		System.out.println("-----------Iterative-------------");
		iterativeTraverse();
		System.out.println();
		System.out.println("-----------Recursive-------------");
		System.out.print(root.data+" ");
		recursiveTraverse(root);
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

	public static void iterativeTraverse() {
		Queue<Tree> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			Tree temp = queue.poll();
			System.out.print(temp.data+" ");
			if (temp.left != null) {
				queue.offer(temp.left);
			}
			if (temp.right != null) {
				queue.offer(temp.right);
			}
		}
	}
	
	
	public static void recursiveTraverse(Tree node) {
		if(node==null) {
			return;
		}

		if(node.left!=null) {
			System.out.print(node.left.data+" ");
			queuesTwo.offer(node.left);
		}
		if(node.right!=null) {
			System.out.print(node.right.data+" ");
			queuesTwo.offer(node.right);
		}
		Tree temp=queuesTwo.poll();
		 recursiveTraverse(temp);
	}
}
