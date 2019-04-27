package algorithm;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void selectionSort(int [] a, int n) {
		
		for(int i = 0;i < n-1;i++) {
			
			int iMin = i;
			
			for(int j = i+1;j<n;j++) {
				
				if(a[j] < a[iMin]) {
					iMin = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[iMin];
			a[iMin] = temp;
			
		}
	}

}
