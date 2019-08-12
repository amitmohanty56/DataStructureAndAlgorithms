package algorithm;

public class BinarySearch_FirstORLastOccurrence {

	public static void main(String[] args) {
		
		
int [] searchArray = {2,5,21,21,36,47,65,97,97,100};
		
		int returnIndex = binarySearchFirstOccurance(searchArray,searchArray.length, 21);
//		int returnIndex_Itr = binarySearchLastOccurance(searchArray,searchArray.length, 21);
		
		System.out.println("The return index is :" + returnIndex);
//		System.out.println("The return index_Itr is :" + returnIndex_Itr);

	}

	public static int binarySearchFirstOccurance(int [] inputArray, int lengthOfArray,int searchElement) {
		
		int start = 0;
		int end = lengthOfArray-1;
		int result = -1;
		int midPoint = 0;
		
		while(start <= end) {
			
			midPoint = (start+end)/2;
			
			if(inputArray[midPoint] == searchElement) {
				//return index
				result = midPoint;
				//Once found don't stop,we will search the first half or array to find the first occurrence.
				end = midPoint -1;
			}else if(searchElement < inputArray[midPoint]) {
				end = midPoint-1;
				
			}else {
				start = midPoint+1;
			}
		}
		
		
		return result;
	}
	
	/*
	 * int [] searchArray = {2,21,13,21,36,47,21,81,97,100};
	 */
public static int binarySearchLastOccurance(int [] inputArray, int lengthOfArray,int searchElement) {
		
		int start = 0;
		int end = lengthOfArray-1;
		int result = -1;
		int midPoint = 0;
		
		while(start <= end) {
			
			midPoint = (start+end)/2;
			
			if(inputArray[midPoint] == searchElement) {
				
				//return index
				result = midPoint;
				//Once found don't stop we will search the second half or array to find the last occurrence.
				start = midPoint + 1;
			}else if(searchElement < inputArray[midPoint]) {
				end = midPoint-1;
				
			}else {
				start = midPoint+1;
			}
		}
		
		
		return result;
	}
}
