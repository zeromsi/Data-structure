import java.util.LinkedList;

public class SinglyLinkedList {
	static int count = 0;
	static Node head;

	public static void main(String[] args) {
		head = new Node(5);
		Node second = new Node(7);
		Node third = new Node(9);
		head.next = second;
		second.next = third;
		// display(head);
		// count(head);
		// System.out.println(count);
		Node first = new Node(1);
		insertAtStart(first, head);
		display(head);

	}

	public static void display(Node current) {
		if (current == null) {
			return;
		}
		Node node = current;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static void count(Node current) {
		while (current != null) {
			count++;
			current = current.next;
		}
	}

	public static void insertAtStart(Node node, Node startNode) {
		Node first = startNode;
		head=node;
		head.next=startNode;
		//startNode.next=first;
	}
}
