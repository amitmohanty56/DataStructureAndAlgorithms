package algorithm;

public class BubbleSort {
	
	/*In BubbleSort we are bubbling or bouncing the biggest number to the end of array
	 * by comparing with next number in the array. 
	 * To do so we use 2 for loop, the outer for loop is helping us to loop from first every time, in inner loop
	 * and by comparing if we found the big number we will swap the number.
	 * The BIG O time complexity is O(n^2) as we use 2 for loop.
	 * BIG O space complexity is O(1) as we are not using any new data structure or any new array.
	 * */

	public static void main(String[] args) {
		int [] inputArray = {99,33,6,2,1,5,63,87,283,4,0};
		bubbleSort(inputArray);
		
		for(int a : inputArray) {
			System.out.print(a + " ");
		}

	}
	
	public static void bubbleSort(int [] input) {
		int lengthOfInput = input.length;
		int temp = 0;
		for(int i = 0;i < lengthOfInput;i++) {
			
			/*Becoz of input[j+1] we have to loop upto lengthInput-1 as when it reach 10th index 
			and j+1 will try to access 11th index which is not present and throw exception. 
			When we reach 9th index inside loop we do j+1 which is 9+1 = 10 which is the last element.
			*/
          for(int j =0; j< lengthOfInput-1; j++) {
        	  if(input[j] > input[j+1]) {
//        		  System.out.println(input[j] +" : "+ input[j+1]);
        		  //Swap numbers
        		  temp = input[j];
        		  input[j] = input[j+1];
        		  input[j+1] = temp;
        	  }
          }
		}
	}

}
