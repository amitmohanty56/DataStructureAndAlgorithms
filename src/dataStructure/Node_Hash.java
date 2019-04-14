package dataStructure;

public class Node_Hash {
	
	private int index;
	private Object key;
	private Object value;
	
	public Node_Hash(int index, Object key, Object value) {
		super();
		this.index = index;
		this.key = key;
		this.value = value;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Object getKey() {
		return key;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	

}
