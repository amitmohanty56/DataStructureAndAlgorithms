package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DS_LinkedList {
	
	private Node_LList head;
	private Node_LList tail;
	private int length = 1;
	private Node_LList node;
	
	public DS_LinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public DS_LinkedList(Object value) {
		this.head = new Node_LList(value);
		this.tail = this.head;
		this.length = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DS_LinkedList ll = new DS_LinkedList(10);
		ll.append(20);
		ll.append(30);
		ll.append(40);
		Node_LList nl = ll.prepend(100);
		ll.insert(2, 500);
		ll.insert(0, 700);
		ll.insert(-1, 900);
		ll.remove(2);
		ll.remove(2);
		ll.remove(3);
        List list = ll.printList();
        
        for(Object o : list) {
        	
        	System.out.println("The values are -> "+o);
        }
        
        
	
		
//		System.out.println(nl);
//		System.out.println(ll.head);
//		System.out.println(ll.head.getValue());
	}
	
	public void append(Object value) {
//		if(this.head.getNext() == null) {
//			Node_LList nextNode = new Node_LList(value);
////			
//			this.head.setNext(nextNode);
//			this.tail = nextNode;
//			
//			
//		}else {
			Node_LList nextNode = new Node_LList(value);
			this.tail.setNext(nextNode);
			this.tail = nextNode;
//		}
		
		this.length++;
	}
	
	public Node_LList prepend(Object value) {
		
		Node_LList node = new Node_LList(value);
		node.setNext(this.head);
		this.head = node;
		this.length++;
		
		return node;
	}
	
	public List printList() {
		
		List list = new ArrayList();
		Node_LList currentNode = this.head;
		
		while(currentNode != null) {
			
			list.add(currentNode.getValue());
			currentNode = (Node_LList) currentNode.getNext();
		}
		
		return list;
	}
	
	public void insert(int index, Object value) {
		int count = 0;
		
		if(index >= this.length) {
			this.append(value);
			return;
		}
		if(index <= 0) {
			this.prepend(value);
			return;
		}
		
		Node_LList currentNode = this.head;
		Node_LList prevNode = this.head;
		
		while(currentNode != null) {
			
			if(count != index) {
				currentNode = currentNode.getNext();
				
				if(count > 0) {
					prevNode = prevNode.getNext();
				}
				count ++;
				continue;
			}else {
				Node_LList newNode = new Node_LList(value);
				newNode.setNext(currentNode);
				
					prevNode.setNext(newNode); 		
					
				this.length++;
				break;
			}
		}
	}
	
	public void remove(int index) {
		int count = 0;
		Node_LList currentNode = this.head;
		Node_LList prevNode = this.head;
		
		
		while(currentNode != null) {

			if(count != index) { 
				currentNode = currentNode.getNext();

				if(count > 0) {
					prevNode = prevNode.getNext();
				}
				count ++;
				continue;
			}else {
				Node_LList removeNode = currentNode.getNext();
//				newNode.setNext(currentNode);

				prevNode.setNext(removeNode); 		
               System.out.println(removeNode.getValue());
				this.length--;
				break;
			}
		}
		
	}
	
	public int size() {
		
		return this.length +1;
	}

}
