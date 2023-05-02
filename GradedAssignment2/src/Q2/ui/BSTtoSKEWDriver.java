package Q2.ui;

import java.util.ArrayList;

import Q2.services.NewNode;
import Q2.services.Node;


public class BSTtoSKEWDriver {
	
	public static void main(String[] args) {
		Node head = new Node(50);
		head.left = new Node(30);
		head.right = new Node(60);

		head.left.left = new Node(10);
		head.right.left = new Node(55);

		ArrayList<Integer> list = new ArrayList<>();
		Node.inOrder(head, list);
		NewNode newHead = new NewNode(list.get(0));
		
		for(int a = 1; a < list.size(); a++){
			NewNode.insert(newHead, list.get(a));
		}		
		NewNode.print(newHead);
	}

}
