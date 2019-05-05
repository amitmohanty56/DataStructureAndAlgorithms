package algorithm;

import java.util.Arrays;

/*Most likely not use in real time as it use for teaching/academics only.
 * In Selection sort we take the current element as the smallest and compare with rest of the elements 
 * and where ever we found the smallest element store the index value and then swap the smallest element
 * with first index then second index and then keep going like this until we have list completely sorted.
 * Time complexity -> BIG O -> O(n^2) as we involve 2 for loop.
 * Space Complexity -> O(1)
*/
public class SelectionSort {

	public static void main(String[] args) {
		
		int [] a = {2,65,34,2,1,7,8};
		Arrays.sort(a);
		
		for(int b : a) {
			System.out.print(b + " ");
		}

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
	
	public static void selectionSort2(int [] input) {
		 
	}

}
