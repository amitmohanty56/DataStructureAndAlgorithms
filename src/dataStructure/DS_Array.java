package dataStructure;

import java.lang.reflect.Constructor;

public class DS_Array {
	
	public static int length = 1;
	private DS_Array [] dsArray;
	
	public DS_Array(){
		
		
		this.dsArray = new DS_Array[this.length];
		System.out.println("Its Length in cost"+this.length);
	}

	

	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DS_Array  array = new DS_Array();
//		System.out.println(array.getLength());
//		array.push(new DS_Array());
  System.out.println(array.push(new DS_Array()));
  System.out.println("element is present in  "+array.get(0));
		System.out.println(array.push(new DS_Array()));
		System.out.println(array.push(new DS_Array()));

		
		
	}
	
	public DS_Array get(int index) {
		return this.dsArray[index];
	}
	
	public int push(DS_Array dsArray) {
		if(this.length >= 9) {
			this.length += this.length+10;
			this.dsArray = new DS_Array[this.length];
		}
		
		this.dsArray[this.length-1] = dsArray;
		this.length++;
//		System.out.println("Its Length in push"+this.length);
		return this.length;
	}

}
