package Q2.services;

public class NewNode {
	int data; 
	NewNode right;
	
	public NewNode(int data){
		this.data =  data;
	}

	public static void insert(NewNode head, int data) {
		while(head.right != null && head.right.data < data)
			head = head.right;
		if(head.right == null)
			head.right = new NewNode(data);
		else {
			NewNode next = head.right;
			head.right = new NewNode(data);
			head.right.right = next;
		}
	}
	
	public static void print(NewNode node) {
		if(node == null)
			return;
		System.out.print(" "+node.data);
		print(node.right);
	}
}