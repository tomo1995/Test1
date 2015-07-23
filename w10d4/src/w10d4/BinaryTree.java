package w10d4;

public class BinaryTree<T extends Comparable<T>> {
	private Node root;
	private class Node {
	public T value;
	public Node right;
	public Node left;
	
	public Node(T value) {
		super();
		this.value = value;
		this.right = null;
		this.left = null;
	}
	private void add(Node root, T value){
		if(value.compareTo(root.value) <= 0){
			
		}
	}
	private void printTree(Node root) {
		if (root == null)
			return;
		printTree(root.left);
		System.out.println(root.value);
		printTree(root.right);
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void add(T value){
		Node tmp = new Node(value);
		if(root == null){
			root = tmp;
			return;
		}else {
			//add(root, value);
		}
		
	}
	
}
