package algorithm;

public class BinarySearch {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] searchArray = {2,6,13,21,36,47,63,81,97,100};
		
		int returnIndex = binarySearch_Rec(searchArray, 0,searchArray.length-1, 210);
		int returnIndex_Itr = binarySearch_Itr(searchArray,searchArray.length-1, 210);
		
		System.out.println("The return index is :" + returnIndex);
		System.out.println("The return index_Itr is :" + returnIndex_Itr);
	}

	/*
	 * Prerequisite of binary search is the array must be sorted.
	 * This method search on iterative approach.
	 * The BIGO at best case is 1 comparison if it present in middle element 
	 * if not if will be reducing the array by 2(binary) and then search which is BIGO O(log n).
	 * Common Error in this approach is reset of start and end point. also mid element point calculation by not putting the bracket 
	 * and operator precedence /(devision) get more priority than +.
	 * The mid element calculation can be done in a better way is = start + (end-start)/2.
	 * In this way we can avoid overflow of midpoint than integer can store.
	 * Ex: in 32 bit signed integer can store 2^31 and in that case (start+end)/2 can overflow than 2^31.
	 */
	public static int binarySearch_Itr(int [] inputArray,int lengthOfArray,int searchElement) {
		
		
		int start = 0;
		int end = lengthOfArray;
		int midElement = 0;
		
		while(start <= end) {
			midElement = (start+end)/2;
			System.out.println("MidElement " + midElement);
			if(inputArray[midElement] == searchElement) { //if found return directly
				System.out.println("if searchElement == inputArray[midElement] :" + inputArray[midElement]);
				return midElement;
			}else if(searchElement < inputArray[midElement]) {//if it is less than mid element then shift the end point to mid element -1.as its sorted array thats why we can do this.
				end = midElement-1;
				System.out.println("if searchElement < inputArray[midElement] :" + inputArray[midElement]);
			}else {//if it is greater than mid element then shift the start point to mid element + 1 as its sorted array thats why we can do this.
				start = midElement+1;
				System.out.println("if searchElement > inputArray[midElement] :" + inputArray[midElement]);
			}
		}
		
		
		
		return -1;
	}
	
	/*
	 * Recursive Form of BinarySearch.
	 */
	public static int binarySearch_Rec(int [] inputArray,int startOfArray,int endOfArray,int searchElement) {
		
		int start = startOfArray;
		int end = endOfArray;
		int midElement = 0;
		
		if(start > end) {
			return -1;
		}
		
		midElement = (start+end)/2;
		System.out.println("MidElement " + midElement);
		
		if(inputArray[midElement] == searchElement) { //if found return directly
			
			return midElement;
		}else if(searchElement < inputArray[midElement]) {
			end = midElement-1;
			return binarySearch_Rec(inputArray,start,end,searchElement);
			
		}else {
			start = midElement +1;
			return binarySearch_Rec(inputArray,start,end,searchElement);
			
		}
		
		
		
	}
}
