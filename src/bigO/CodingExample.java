package bigO;

import java.util.HashSet;
import java.util.Set;

public class CodingExample {

	//BIG O full name -> BIG O Asymptotic analysis
	public static void main(String[] args) {
		
//      int [] findSum = {1,2,3,9};
      int [] findSum = {1,2,4,4};
      
    boolean hasFound =  hasPairWithSum(findSum, 8);
    
    if(hasFound) {
    	System.out.println("It's Found the Sum");
    }else {
    	System.out.println("It's Not Found");
    }
    
    String [] array1 = {"a",null,"c","d"};
    String [] array2 = {"y","","y"};
    
//   boolean isContain = containsCommonItem2(array1,null);
   boolean isContain = containsCommonItem2(array1,array2);
   
   System.out.println(isContain);
      
	}
	
	/* Find the sum of 8 of 2 number in a  a given array
	[1,2,3,9] sum = 8 which don't have any suitable pair so its NO
	[1,2,4,4] sum = 8 and it's possible.as 4 +4 = 8;
	Findings: After asked the correct question
	1.Assume positive integer. 
	2.Array may be sorted or unsorted
	3.Can return boolean value once find the pair
	4.if don't have same elements in pair like 4,4 then same elements can repeat in next index
	i assume the array sorted and it will only work if the array is sorted
	*/
	
	public static boolean hasPairWithSum(int [] data,int sum) {
		
		int low = 0;
		int high = data.length -1;
		
		while(low < high) {
			if(data[low] + data[high] == sum) {
				return true;
			}
			low++;
//			high--;
		}
		
		return false;
	}
	
	//Check if the 2 array has the common elements
	// String array1 = ['a','b','c','d']
	// String array2 = ['a','z','y']
    public static boolean containsCommonItem2(String [] input1,String [] input2) {
    	
    	Set store1 = new HashSet();
    	
    	for(int i =0;i<input1.length;i++) {
    		store1.add(input1[i]);
    		   		
    	}
    	
    	for(String j : input2) {
    		
    		if(store1.contains(j)) {
    			return true;
    		}
    	}
    	
    	return false;
    }
}
