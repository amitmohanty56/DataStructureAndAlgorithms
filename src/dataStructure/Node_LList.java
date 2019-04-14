package dataStructure;


//Node for LinkedList 
public class Node_LList {

	private Node_LList prev;
	private Object value;
	private Node_LList next;
	
	public Node_LList(){
		
	}
	
	public Node_LList(Object value) {
		this.value = value;
	}

	public Node_LList getPrev() {
		return prev;
	}

	public void setPrev(Object prev) {
		this.prev = (Node_LList) prev;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Node_LList getNext() {
		return next;
	}

	public void setNext(Object next) {
		this.next = (Node_LList) next;
	}
	
	
}
