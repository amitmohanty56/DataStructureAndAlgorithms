package dataStructure;


/*Binary Search Tree(BST)
 * Its a binary tree in which for each node, value of all the left nodes in left subtree is lesser or equal than roots
 * and value of all the nodes in right subtree is greater than roots
 *  
 *          Correct binary search tree
 * ex:            15
 *              /    \
 *             10     20
 *            /  \   /  \
 *           8   12 17  25
 *           
 *       Wrong binary search tree    
 *                15
 *              /    \
 *             10     20
 *            /  \   /  \
 *           8   16 17  25
 *           
 *
 *How Binary search works?
 *So first we will get the middle point of the array/list
 *Then compare the given element against the middle point
 *if (input < middle element) -> discard the all elements to the right of the middle point and look for in left of the middle element.
 *if (input > middle element) -> discard the all elements to the left of the middle point and look for in right of the middle element.
 *Then again get the middle element in the respective half and compare again and try to find the match.
 *
 *In Binary element we look for the n element in search space and then we compare against middle element and if don't find we reduced to n/2.
 *n -> n/2 -> n/4 ->...either we find the element or get the 1 element/node in search space.
 *
 *During insertion or deletion a binary search tree may imbalance as we create node and link to other node so we need to balance the BST.
 * */
public class DS_BinarySearchTree {
	
	private Node_BST root;
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
		
		Integer result = tree.lookUp(170);
		
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
	//For search operation BIG O -> time complexity O(log (n))
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
