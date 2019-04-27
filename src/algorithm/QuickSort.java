package algorithm;

public class QuickSort {

	public static void main(String[] args) {
		
		int [] A = {7,2,1,6,8,5,3,4};
		
		System.out.println(A[7]);
		quickSort(A,0,A.length-1);
		
		for(int i = 0;i<A.length;i++) {
			System.out.println(A[i]);
		}

	}

	public static int partition(int[] A, int start, int end) {

		int pivot = A[end];
		int partitionIndex = start-1;// set the partition index at the start initially.

		for (int i = start; i <= end-1 ;i++) {

			if (A[i] <= pivot) {
				partitionIndex++;
				//swap(A,A[i], A[partitionIndex]); // swap the element if it is less than pivot.
				int PartitionIndexVal = A[partitionIndex];
				int iVal = A[i];
				A[i] = PartitionIndexVal;
				A[partitionIndex] = iVal;
				
				
			}
		}

		//swap(A,A[partitionIndex+1], A[end]); // swap the pivot with element with partitionIndex.
		
		int partitiionIndexVal = A[partitionIndex+1];
		A[end] = partitiionIndexVal;
		A[partitionIndex+1] = pivot;
		return partitionIndex;
	}

	public static void quickSort(int[] A, int start, int end) {
		
		if(start < end) {
			
			int partitionIndex = partition(A,start,end); //index position of correctly placed value.
			quickSort(A,start,partitionIndex-1);
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
