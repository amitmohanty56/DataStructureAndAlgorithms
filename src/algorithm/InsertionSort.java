package algorithm;

public class InsertionSort {

	public static void main(String[] args) {
		
		int [] input = {7,2,4,3,5,1};
		
		insertionSort(input);
		
		for(int a : input) {
			System.out.println(a);
		}
		

	}
	
	/*This sorting mechanism is inPlace sorting.
	 * So we choose to start from 1st index or can say 2nd elements as if it has only 1 element then its sorted
	 * We will check the current element against the previous element and if the previous element is greater than current element
	 * then the previous element moved one position to right  and this process will go on until all the bigger element moved to one step to right.
	 * and at last we will place the current element to the appropriate index.
	 * for Ex;  {7,2,4,3,5,1} 
	 * In this array we will start from 1st index which is 2 and then compare with 7.
	 * is 7 > 2, yes it is so we move 7 to the 1st index and 2 to the 1st hole -1 which 0 index as hole = current index
	 * so after 1st shift {2,7,4,3,5,1} this is array.
	 * now index is 2 and check 7 > 4 ,yes it is so move 7 to the one step to right 
	 * so array will be {2,4,7,3,5,1} and then check 2 > 4 , no its not so no change.
	 * So now hole/index value is 3 and the value associate is also 3. check 7> 3, yes it is
	 * the move 7 to the right then array will be {2,4,3,7,5,1}. the hole value is hole - 1 so 4 > 3 yes it is 
	 * then move the value to right. then check 2> 3 no its not so no change.
	 * the array will be {2,3,4,7,5,1}.  now index is 4 so check 7>5 yes,then move 7 to the right and then 4> 5 no its not.no change
	 * the array will be {2,3,4,5,7,1}.now index is 5 check 7 > 1 yes,move 7 to right then 5> 1 yes move 5 to right check 4>1 so on
	 * and finally 2> 1 so move 2 to right and the array is now {1,2,3,4,5,7}. fully sorted.
	 * 
	 * BIG O -> time complexity is O(n) as 1 for loop but in case of reverse sort if will be O(n^2).
	 *       -> space complexity is O(1) as no new array created.
	 *       Insertion sort better than selection sort and bubble sort as of less comparison
	 * */
	
	public static void insertionSort(int [] input) {
		
		int value = 0;
		int hole = 0;
		for(int i = 1; i < input.length;i++) {
			
			value = input[i];
			hole = i;
			while(hole > 0 && input[hole -1] > value) {
				input[hole] = input[hole-1];
				hole = hole-1;
			}
			
			input[hole] = value;
		}
	}

}
