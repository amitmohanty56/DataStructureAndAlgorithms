package algorithm;


/*Properties of MergeSort algorithm:
 * 1. Divide and Conquer rules:
 * In this we divide a problem to sub problems and first find the solution to sub problems
 * then from solution to subproblems we construct the solution to actual problem.
 * 2. Recursive algorithm
 * 3. Stable Algorithm
 * What does it mean in sorting algorithm we sort in increasing order and when it found the same element as stable algorithm it preserve the order
 * as it is in the original list and same in after sorted list.
 * ex: (1,2),(2,5),(4,8),(2,3) so here we have the key, value pair and we can see key 2 is present 2 times in different pair
 * so if we sort based on the basis of key then as per original list it should be (2,5),(2,3) and here it preserve the relative order of key.
 * 4. Not In-place
 * here we divide the list in 2 new array.
 * 6. BIG O -> space complexity -> O(n)
 *          -> time complexity -> O(n log n).
 * */
public class MergeSort {

	public static void main(String[] args) {
		
		int [] input = {2,4,1,6,8,5,3,7,9,3};
		mergerSort(input);
		
		for(int a : input) {
			System.out.println(a);
		}

	}
	
	public static void mergerSort(int [] inputArray) {
		
		int lengthOfInputArray = inputArray.length;
		if(lengthOfInputArray < 2) {
			return;
		}
		
		int midPoint = lengthOfInputArray/2;
		
		int [] left = new int[midPoint];
		int [] right = new int[lengthOfInputArray - midPoint];
		
		for(int i = 0;i < midPoint;i++) {
			left[i] = inputArray[i];
		}
		
		for(int j = midPoint; j < lengthOfInputArray;j++) {
			right[j-midPoint] = inputArray[j]; 
		}
		
		// when we have single element or less than 2 element then the method exit as it hit the base condition in this case the array will have 1 element at its last stage.
		mergerSort(left);  
		// when we have single element or less than 2 element then the method exit as it hit the base condition
		mergerSort(right); 
		/* then here it will compare the last 2 element and start to merge to the original array. ex: left[2],right[4] and original array [2,4] at its lowest level
		so after compare and merge at first it looks like [2,4] as it sorted.next one [1,6] and then after sort and 
		merge of left it looks like [1,2,4,6] and right [3,5,7,8] and finally sort and merge to 
		original array [1,2,3,4,5,6,7,8] that's the final sorted array.*/
		merge(left,right,inputArray); 
		
	}
	
	public static void merge(int [] left,int [] right,int [] inputArray) {
		
		int length_leftArray = left.length;
		int length_rightArray = right.length;
		
		int i = 0,j = 0,k =0;
		
		while(i < length_leftArray && j < length_rightArray) {
			
			if(left[i] <= right[j]) {
				inputArray[k] = left[i];
				i++;
			}else {
				inputArray[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < length_leftArray) {
			inputArray[k] = left[i];
			i++;
			k++;
		}	
		
		while(j < length_rightArray) {
			inputArray[k] = right[j];
			j++;
			k++;
		}
	}

}
