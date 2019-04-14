package bigO;

public class BigO_SpaceComplexity_Demo {
	
	//BIG O full name -> BIG O Asymptotic analysis
	//Space Complexity
	
	public static void main(String[] args) {
		
		 boo(4);
		 arrayOfHiNTimes(5);
		 
		 String s = "Hello";
		 System.out.println(s.length());
		
	}

	/*So here the space complexity is how many variables we create.
	 * we create one variable and i.e. i . we  don't consider the input variable as a space occupying
	 * so space complexity is O(1)
     */	
	public static void boo(int n) {
		
		for(int i =0;i < n;i++) {
			System.out.println(i);
		}
	}
	
	/*What's the space complexity of this method
	 * so we create a new data structure(array) which will occupy space
	 * then create variable i and initialize the array.so its O(1 + 6n).
	 * as we know we don't consider constants so its O(n)
     */	
	public static void arrayOfHiNTimes(int n) {
		
		String [] hiarray = new String[n];
		for(int i =0;i < n;i++) {
			hiarray[i] = "Hi";
			System.out.println(hiarray[i]);
		}
	}
}
