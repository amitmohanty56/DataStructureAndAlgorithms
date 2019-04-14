package dataStructure;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DS_HashTable {

	Object [] data;
	int size = 0;
	int position = 0;

	private Node_Hash [] node;


	public DS_HashTable(int size) {
		this.data = new Object[size];
		this.node = new Node_Hash[size];
		this.size = size;
		System.out.println("Size is " +data.length);
	}

	private int getHash(String key) {

		int hash = 0;
		for(int i =0;i < key.length();i++) {
			hash = (hash + key.charAt(i) * i) % size;
		}
		return hash;
	}

	public static void main(String[] args) {



		DS_HashTable hashTable = new DS_HashTable(50);

		hashTable.set("grapes", 1000);
        hashTable.set("Apple", 50);
        System.out.println("-------------");
     System.out.println(hashTable.get("grapes"));
     System.out.println("-----------------");
     System.out.println(hashTable.get("Apple"));
     System.out.println("---------------");
     System.out.println(hashTable.get(null));
     
     
	}

	public void set(Object key, Object value) {
		int address = this.getHash(key.toString());
		System.out.println("Address is " + address);
		
		if(this.node[address] == null) {
         this.node[address] = new Node_Hash(address,key,value);
			             
		}else {
			this.node[address].setKey(key);
			this.node[address].setValue(value);
		}
		
			System.out.println(this.node[address].getIndex());
			System.out.println(this.node[address].getKey());
			System.out.println(this.node[address].getValue());
	}
	
	public Object get(Object key) {
		
		Object ret = null;
		
		if(key == null) {
			System.out.println("The key in Null");
		}else {
			int address = this.getHash(key.toString());
			Node_Hash node = this.node[address];
			if(node != null) {
				ret = node.getValue();
			}
			
		}
		return ret;
		
	}

}
