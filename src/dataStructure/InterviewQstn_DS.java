package dataStructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InterviewQstn_DS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] recur = {1,5,1,2,3,5,1,2,4};
		int x =  firstRecurringItem2(recur);
		System.out.println(x);
	}

	/*
	 * Find the first recurring elements. {1,5,1,2,3,5,1,2,4}; in this case its 1 
	 */
	public static int firstRecurringItem2(int [] input) {

		int length = input.length;
		HashSet set = new HashSet();
        int recur = -10;
		if(input.length == 0) {
			System.out.println("No elements");
			return -1;
		}

		if(input[0] == input[1]) {
			System.out.println("The recurring elements = " + input[0]);
			return input[0];
		}else {
			int storevalue = input[1];
			for(int i = 0;i<input.length;i++) {
				

				if(set.contains(input[i])) {
					recur = input[i];
					break;
				}else {
					set.add(input[i]);
				}
			} 
			return recur;
		}
	}
	
	/*TO DO
	 * Use the 2 for loop option which a quadratic operation BIG 0(n^2)
	 * but the problem is {1,5,5,1,3,5,1,2,4}; the expected recurring element is 5 but this method 
	 * return 1. So try to optimize to return 5.
     */
	public static int firstRecurringItem(int [] input) {
		
		return 0;
	}
	
	
}


