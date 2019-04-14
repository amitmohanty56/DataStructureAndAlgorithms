package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class DS_DoublyLinkedList {
	
	private Node_LList head;
	private Node_LList tail;
	private int length;
	
	public DS_DoublyLinkedList(Object value) {
		this.head = new Node_LList(value);
		this.tail = head;
		this.length =0;
		
	}

	public static void main(String[] args) {
		DS_DoublyLinkedList ddl = new DS_DoublyLinkedList(10);
		
		ddl.append(20);
		ddl.append(30);
		ddl.prepend(200);
		ddl.prepend(500);
		ddl.insert(3000, -9);
		ddl.insert(7000, 4);
		System.out.println("the size is " + ddl.size());
//		ddl.remove(50);
//		ddl.remove(0);
		
		System.out.println("the size is " + ddl.size());
		List list = ddl.printList();
		
		for(Object o : list) {
			System.out.println(o);
		}
		
//		System.out.println(" prev value "+ddl.tail.getPrev().getValue());
//		System.out.println(" Tail value "+ddl.tail.getValue());
		
		System.out.println("------Reverse List------");
		
		List reverseList = ddl.printReverseList();
		
		for(Object o : reverseList) {
			System.out.println(o);
		}

	}
	
	public void append(Object value) {
		Node_LList newNode = new Node_LList(value);
		this.tail.setNext(newNode);
		this.tail = newNode;
		this.length++;
		this.tail.setPrev(traverseToIndex(this.length-1));
		
	}
	
	public void prepend(Object value) {
		
		Node_LList newNode = new Node_LList(value);
		newNode.setNext(this.head);
		this.head.setPrev(newNode);
		this.head = newNode;
		this.length++;
	}
	
	public void insert(Object value,int index) {
		
		
		
		if(index > this.length) {
			append(value);
			this.length++;
			return;
		}
		
		if(index < 0) {
			prepend(value);
			this.length++;
			return;
		}
		
		
		
		Node_LList newNode = new Node_LList(value);
		Node_LList prev = traverseToIndex(index-1);
		Node_LList next = prev.getNext();
		prev.setNext(newNode);
		newNode.setPrev(prev);
		newNode.setNext(next);
		next.setPrev(newNode);
		this.length++;
		
	}
	
	public void remove(int index) {
		
		
		
		if(index > this.length) {
			Node_LList lastNode = traverseToIndex(this.length-2);	
			lastNode.setNext(null);
			this.tail = lastNode;
			this.length--;
			return;
		}
		
		if(index <= 0) {
			Node_LList firstNode = traverseToIndex(1);
			firstNode.setPrev(null);
			this.head = firstNode;
			this.length--;
			return;
			
		}
		System.out.println(this.length-1);
		Node_LList prev = traverseToIndex(index-1);	
		Node_LList removeNode = traverseToIndex(index);
//		System.out.println(removeNode.getValue());
		Node_LList next = removeNode.getNext();
		prev.setNext(next);
		next.setPrev(prev);
		this.length--;
		
	}
	
	public Node_LList traverseToIndex(int index) {
		
		if(index > this.length) {
			index = this.length;
		}
		
		if(index < 0) {
			index = 0;
		}
		
		int counter = 0;
		Node_LList currentNode = this.head;
		while(counter != index) {

			currentNode = currentNode.getNext();
			counter++;
		
		}
		
		return currentNode;
	}
	
	public List printList() {
		
		Node_LList node = this.head;
		List list = new ArrayList();
		
		while(node != null) {
			list.add(node.getValue());
			node = node.getNext();
		}
		
		return list;
	}
	
	public List printReverseList() {
		
		List reverseList = new ArrayList();
		Node_LList node = this.tail;
		
		while(node != null) {
			reverseList.add(node.getValue());
			node = node.getPrev();
		}
		
		return reverseList;
	}
	
	public int size() {
		if(this.length ==0) {
			return this.length+1;
		}else {			
			return this.length;
		}
		
	}

}
