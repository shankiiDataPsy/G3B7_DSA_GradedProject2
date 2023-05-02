package Q2.services;

import java.util.ArrayList;

public class Node{
	int data; 
	public Node left = null;
	public Node right = null;
	
	public Node(int data){
		this.data = data;
	}
	
	public static void inOrder(Node node, ArrayList<Integer> list) {
		if(node.left != null)
			inOrder(node.left, list);
		list.add(node.data);
		if(node.right != null)
			inOrder(node.right, list);
	}
}