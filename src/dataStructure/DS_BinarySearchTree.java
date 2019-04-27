package dataStructure;

public class DS_BinarySearchTree {
	
	private Node_BST root;
	private Node_BST leftNode;
	private Node_BST rightNode;
	private Node_BST currentNode;
	

	public DS_BinarySearchTree() {
		super();
		this.root = null;
	}



	@Override
	public String toString() {
		return "DS_BinarySearchTree [root=" + root.getValue() + 
				//", leftNode=" + leftNode.getValue() + ", rightNode=" + rightNode.getValue()
				 ", currentNode=" + currentNode.getValue() + "]";
	}



	public static void main(String[] args) {
		
		DS_BinarySearchTree tree = new DS_BinarySearchTree();
		tree.insert(9);
		tree.insert(4);
		tree.insert(6);
		tree.insert(20);
		tree.insert(170);
		tree.insert(15);
		
		Integer result = tree.lookUp(4);
		
		System.out.println(result);
		
//		System.out.println("Tree left "+tree.currentNode.getLeft());
//		System.out.println(tree.currentNode.getLeft().getRight().getValue());

	}
	
	public void insert(Integer input) {
		
		Node_BST newNode = new Node_BST(input);
		
		if(root == null) {
			root = newNode;
		}else {
			
			//the currentNode keep on update with latest node based on left or right direction which based on the input value
			this.currentNode = this.root;
			//as soon as we hit null in node the loop will exit and return from method
			while(true) {
				
				if(input < currentNode.getValue()) {
					//left
					if(currentNode.getLeft() == null) {
						currentNode.setLeft(newNode);
						return;
					 }
					currentNode = currentNode.getLeft();
					}else {
						//right
						if(currentNode.getRight() == null) {
							currentNode.setRight(newNode);
							return;
						}
						currentNode = currentNode.getRight();
					}
			}
//			if(input < currentNode.getValue()) {
//				if(currentNode.getLeft() == null) {
//					currentNode.setLeft(newNode);
//					leftNode = currentNode.getLeft();
//				}else {
//					if(input < leftNode.getValue()) {
//						leftNode.setLeft(newNode);
//						leftNode = leftNode.getLeft();
//					}
//				}
//			}else {
//				if(root.getRight() == null) {
//					root.setRight(new Node_BST(input));
//					rightNode = root.getRight();
//				}
//			}
		}
	}
	
	public Integer lookUp(Integer input) {
		
		if(this.root == null) {
			return 0;
			
		}
		
		if(this.root.getValue().equals(input)) {
			return root.getValue();
		}
		
		this.currentNode = this.root;
		
		while(this.currentNode != null) {
			
			
			if(input < this.currentNode.getValue() ) {
				this.currentNode = this.currentNode.getLeft();
				
//				if(this.currentNode.getValue() == input) {
//					return this.currentNode.getRight().getValue();
//				}
				
			}else if (input > this.currentNode.getValue() ){
				this.currentNode = this.currentNode.getRight();
//				if(this.currentNode.getValue() == input) {
//					return this.currentNode.getRight().getValue();
//				}
				
			} else if(this.currentNode.getValue().equals(input)) {
				return this.currentNode.getValue();
			}
		}
		
		return 0;
	}

}
