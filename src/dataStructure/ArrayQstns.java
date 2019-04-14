package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayQstns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Hi My Name is Andrei Should be";
		
//		reverseString(input);   // O(n)
//		reverseString2(input);
		int [] array1 = {0,3,4,31};
		int [] array2 = {4,6,30};
//	    int [] value =	mergeSortedArray(array1, array2);
		
	    List l = mergeSortList(array1, array2);
//		for(int a : value) {
//			System.out.print("Fianl value" +a);
//		}
	}

	public static void reverseString(String inputArray) {
		
		if(inputArray != null || inputArray.length() > 2) {
		char [] reverseArray = new char[inputArray.length()]; //O(1)   
		char [] inputChar = inputArray.toCharArray(); //O(1)
		int count =0; 
		String finalString = "";
		for(int i = inputArray.length()-1;i>=0;i--) {
			reverseArray[count] =  inputChar[i];
			finalString += inputChar[i];
			System.out.print(reverseArray[count]);       // O(n)
			
			count++;
		}
		System.out.println();
		System.out.println(" FinalString ->" +finalString);
//		System.out.println("Arrays "+Arrays.toString(reverseArray));
		
       }
	}
	
	public static void reverseString2(String input) {
		
		char [] reverseArray = new char[input.length()]; //O(1) 
		int count =0; 
		for(int i = input.length()-1;i>=0;i--) {
			reverseArray[count] =  input.charAt(i);	
			System.out.print(reverseArray[count]);
			count++;
			
		}
		
		
	}
	
	public static int [] mergeSortedArray(int [] input1,int [] input2) {
		
		int [] sortedArray = new int[input1.length + input2.length];
		
	    int length = input1.length + input2.length;
	    int array1Item = input1[0];
	    int array2Item = input2[0];
	    
	    
//	    if(input1.length >= input2.length) {
//	    	length = input1.length;
//	    }else {
//	    	length = input2.length;
//	    }
	    
	    if(input1.length ==0) {
	    	return input2;
	    }else if (input2.length == 0) {
	    	
	    	return input1;
	    }
	    System.out.println("Total length is " +length);
	    int j = 1;
	    int k =1;
		for(int i =0;i< length;i++) {
			if(array1Item < array2Item) {
				sortedArray[i] = array1Item;
		System.out.print(array1Item + "-");
		System.out.println("k value "+k);
				array1Item = input1[k];
				k++;
			}else {
				
				
					sortedArray[i] = array2Item;
					System.out.println(" "+array2Item);
					System.out.println("J value "+j);
					if(j< input2.length)	{
					array2Item = input2[j];
					j++;
				}
				
			}
			
			
			
		}
	
		return sortedArray;
	}
	
	public static List mergeSortList(int [] input1,int [] input2) {
		
		List input1List = Arrays.asList(input1);
		List input2List = Arrays.asList(input2);
		System.out.println(input1List.size() + " Size "+input2List.size());
		if(input1.length == 0) {
			return input2List;
		}
		if (input2.length == 0) {
			return input1List;
		}
		int array1Item = input1[0];
		int array2Item = input2[0];
		int totalItemsLength = input1.length + input2.length;
		
		int j = 1;
		int k = 1;
		List mergeList = new ArrayList();
		
		for(int i =0;i<totalItemsLength;i++) {
			System.out.println(array1Item +"-"+array2Item);
			System.out.println(j + " index "+k);
			if(j < input1.length || array1Item < array2Item) {
				mergeList.add(array1Item);
				array1Item = input1[j];
				j++;
			}else {
				
				mergeList.add(array2Item);
				if( k < input2.length ) {
					array2Item = input2[k];
					k++;
				}
				
			}
		}
		
		return mergeList;
	}
}
