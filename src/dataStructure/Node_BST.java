package dataStructure;

public class Node_BST {
	
	private Integer value;
	private Node_BST left;
	private Node_BST right;
	
	
	
	public Node_BST(Integer value) {
		super();
		this.value = value;
	}
	
	
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Node_BST getLeft() {
		return left;
	}
	public void setLeft(Node_BST left) {
		this.left = left;
	}
	public Node_BST getRight() {
		return right;
	}
	public void setRight(Node_BST right) {
		this.right = right;
	}
	
	
	

}
