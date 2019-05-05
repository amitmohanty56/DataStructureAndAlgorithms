package algorithm;


/*QuickSort is an in-place sorting algorithm.
 * BIG O -> Average time complexity is O(n log n)
 *       -> worst case running time O(n^2). If we don't pick the pivot properly. so it has this down side.
 *       -> space complexity is O(log n)
 * Most language library are implemented in QuickSort
 * In QuickSort we pick any random element from the array/list and called it Pivot. In this case we choose the last element of array as Pivot
 * So we start to arrange all the smallest element than Pivot should be left of the Pivot and all the greater element than Pivot 
 * should be right of the Pivot. lets called this process partition.
 * for ex: {7,2,1,6,8,5,3,4}; after partition it will be {2,1,3,4,8,5,7,6};
 * After partitioning we can break the array/list into sub problems just like divide and conquer
   so we will divide the array into 2 part before pivot and after pivot
   and then sort those array. Just like merge sort we won't create any new array we will use temporary variable 
   to store the start and end index of sub array.
   As it will be recursive way we will call partitioning part after we get sub array and sort those sub array
   for ex: {2,1,3,4,8,5,7,6}; -> {2,1,3} {8,5,7,6}  3 will be pivot from first sub array and 6 will be pivot from second array.
   then sort those sub arary -> {2,1,3} {8,5,7,6} -> 1st sub array will be {2,1} ->{2} and as 1 element will be exit condition then we will 
   start sorting this {1,2} -> {1,2} -> {1,2,3} sorted. same goes for 2nd sub array or can say right sub array -> {8,5,7,6}
   get the pivot which is 6 -> {8,5,7,6} -> {8,5,7} - 7 pivot -> {8,5} -> {8} -> 
   sort back then {5,8} -> {5,7,8} -> {5,6,7,8} sorted.
   and finally the original array will sort -> {1,2,3} {5,6,7,8} -> {1,2,3,4,5,6,7,8} final sorted one.
 * */
public class QuickSort {

	public static void main(String[] args) {
		
		int [] A = {7,2,1,6,8,5,3,4,-8,5};
		
//		System.out.println(A[7]);
		quickSort(A,0,A.length-1);
		
		for(int i = 0;i<A.length;i++) {
			System.out.println(A[i]);
		}

	}
    
	/*In this method we will rearrange all the elements less than pivot will be left to pivot
	 * and all the elements greater than pivot will be towards right.
	 * and return the index of the pivot.so that we know from where to where will be sub array as before pivot all the smallest number than pivot
	 * and after all the largest number than pivot 
	 * */
	public static int partition(int[] A, int start, int end) {
		
		int pivot = A[end];
		int partitionIndex = start; // set the partition index at the start initially.
		
		for(int i = start; i < end; i++) {
			
			if(A[i] <= pivot) {
			swap(A,i,partitionIndex); // swap the element if it is less than pivot.
			partitionIndex++;
			
			}
		}
		/* To make proper partition, after the loop finish we will swap the pivot element with end and 
		 * then the elements before pivot are smaller and elements after pivot will greater than pivot.
		 * */		
		
		swap(A,partitionIndex,end);
		
		return partitionIndex;
		
	}
    
	/* After partitioning we can break the array/list into sub problems just like divide and conquer
	 * so we will divide the array into 2 part before pivot and after pivot
	 * and then sort those array 
	 * Just like merge sort we won't create any new array we will use temporary variable 
       to store the start and end index of sub array.
       We need the start and end point becoz we don't want to create the new array and we can set limit of the array.
       Whenever the fucntion call another function then the function paused and wait till called function is executed.
	 * */
	public static void quickSort(int[] A, int start, int end) {
		
		//base condition
		if(start < end) {
			
			// index of the pivot
			int partitionIndex = partition(A,start,end); //index position of correctly placed value.
			
			//To Sort from to start to pivot so all the smallest value than pivot
			quickSort(A,start,partitionIndex-1);
			//TO Sort After pivot to end so all the largest value than pivot
			quickSort(A,partitionIndex+1,end);
		}

	}

	public static void swap(int [] A,int x, int y) {
		
		if(x==y) {
			return;
		}
		
		int temp = A[y];
		 A[y] = A[x];
		 A[x] = temp;

	}
}
