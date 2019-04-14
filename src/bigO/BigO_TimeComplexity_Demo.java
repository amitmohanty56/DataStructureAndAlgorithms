package bigO;

public class BigO_TimeComplexity_Demo {

	//BIG O full name -> BIG O Asymptotic analysis
	public static void main(String[] args) {

		System.out.println("Hello world!");

		String[] nemo = { "nemo" };
		String[] everyone = { "Dory","bruce","Marlin","nemo","gill" };
		String [] boxes = {"1","2","3","4"};
	//	findNemo(nemo);
	//	logFirstTwoBoxes(boxes);
		
	//	findNemoEfficient(everyone);
		
		int [] logAllPairs = {1,2,3,4};
		//logAllPairs(logAllPairs);
		printAllNumbersThenAllPairSums(logAllPairs);
	}

	/* BIG O(n) -> linear time. here n is the number of input.
	 * if the array has 1 element then n is 1 if 10 elements then n is 10
	 * 
	As the number of input increase the number of operation will increase.*/
	public static void findNemo(String[] inputArray) {

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == "nemo") {
				System.out.println("Oho its found nemo");

			}
		}

	}
	
	
	/* BIG O(1) or BIG O(2) -> Constant time
	NO matter what is the input size its going always fixed/constant operation
	so it can 1 operation or 2 operation which is fixed for any no of input.
	So our operation will take constant time.
	*/
	public static void logFirstTwoBoxes(String [] inputBoxArray) {
		
		System.out.println(inputBoxArray[0]);  //O(1)
		System.out.println(inputBoxArray[1]);  //O(2)
	}
	
	
	/* BIG O(n) Rules: Total 4 Rules
	 * Rule 1: WE always care about what is the worst case scenario.BigO always 
	 * care about worst case.
	 * In the input array the worst case is if the search element is at last position
	 * the best case if the search element is at first position.
	what we were doing is that we keep looping even after we found the nemo
	so by using 'break' keyword we no need to loop after we found nemo
	which is more efficient
	This function is o(n) at worst case -> linear time.*/
	public static void findNemoEfficient(String[] inputArray) {

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == "nemo") {
				System.out.println("Oho its found nemo");
				break;

			}
			System.out.println("find Nemo Efficient Running");
		}

	}
	
	/*Rule 2: Remove constant items
	 * So what's the BOG O of this function is O(1 + n/2 + 100).
	 * But Rule 2 says we don't care about constants so O(n/2 + 1) but in  a big picture  when we scale 
	 * the n is getting is bigger by bigger for ex n is 1 million then adding 100 steps is not a big deal.
	 * also dividing by 2 is decreasingly significant effect. so we drop constants.
	 * As we scale up the 'n' has high impact.the rest are constants which is not noticeable in big inputs
	 *  So the BIG O of this function is O(n).
	 *  Ex: O(a + 200000000). This case it doesn't matter as we drop constants so O(a).
	 * */
    public static void printFirstItemThenFirstHalfThensayHi100Times(int [] inputArray) {
    	
    	System.out.println(inputArray[0]);
    	
    	int middleIndex = (int) Math.floor(inputArray.length/2);
    	int index = 0;
    	
    	while(index < middleIndex) {
    		System.out.println(inputArray[index]);
    		index++;
    		
    		for(int i = 0; i < 100;i++) {
    			System.out.println("Hi");
    		}
    	}
    	
    }
	
	/*
	BIG O(n) or BIG O(n^2)
	Rule 3: Different terms for inputs 
	what it means if we have different inputs having different number of elements means and we loop one after another then 
	Add(+) the BIG O(n + n) or BIG O(1st input + 2nd Input) or BIG O(a+b), if both input have same number of elements then BIG O(n+n) -> BIG O(2n) otherwise BIG O(a+b)/BIG O(n+n) because as per RULE 2 we drop constants so its Big O(2n) -> BIG O(n)
	But if we nested the loop then we multiply(*) 
	-> BIG O(n*n) or BIG O(a*b) or BIG O(1st input * 2nd input) which is  BIG O(n^2) which called Quadratic Time means if we have 2 elements then 4 operation we will do.
	As in the nested loop the inner loop runs depend on the outer loop so 
	if total array size is 10 then when the outer loop is 1 then inner loop run 10 times
	and its like 1 * 10,2 * 10,3 * 10 and so on 10* 10 -> 100 so we can see its 
	multiply the number of times nested loop runs. which is called Quadratic BIG O(n^2)
	So the base line is if 2 inputs and same operation done one after another 
	then add(+) of BIG O(n + n) -> BIG O(2n) because as per RULE 2 we drop constants so its Big O(n)
	and if its nested operation then multiply(*) of BIG O(n^2)
	*/
	//Rule 3: 2 input arguments can have same or different number of elements so to add
    //BIG O of this function BIG O(1st input + 2nd Input)
	public static void comparessBoxTwice(int [] array1,int [] array2) {
		
		
		for(int i = 0;i < array1.length;i++) {
			System.out.println(array1[1]);
		}
		
		for(int i = 0;i < array2.length;i++) {
			System.out.println(array2[1]);
		}
	}
	
	//Rule 3: 1 input arguments but nested loop so multiply
	//BIG O of this function BIG O(1st input * 2nd Input) or BIG O(n*n) -> BIG O(n^2)
	//BIG O(n^2) called Quadratic operation
	public static void logAllPairs(int [] inputArray) {
		
		for(int i =0;i < inputArray.length;i++) {
			
			for(int j = 0; j < inputArray.length;j++) {
				
				System.out.println("The Pair is "+ (inputArray[i] +","+inputArray[j]));
			}
			
		}
		
	}
	
	
	
	/*Rule 4: Drop the non dominant terms
	So what's the BIG O of this function is O(n + n^2) => n is for 1st for loop
	and n^2 is for nested for loop.
	As per Rule 4 we drop the non dominant terms and in this case is n is non dominant terms becoz as the number of 
	inputs increase the n^2 will be impact as it's a nested for loop.
	Another example is what's the BIG O(x^2+3x+100+x/2) of this as per Rule 4
	if we take x = 500 then x^2 is the big number as 3x = 1500 and 100 is constant despite of increase of number
	and x/2 will reduce input by half. So the most dominant is x^2 and when it comes to scale
	BIG O(n^2) has significantly increase.
	*/
	
	public static void printAllNumbersThenAllPairSums(int [] numbers) {
		
		System.out.println("These are the numbers");
		for(int a : numbers) {
			System.out.println("Numbers are :" + a);
		}
		
		System.out.println("And these are their sums");
		for(int a : numbers) {
			for(int b : numbers) {
				System.out.println("Sums"+a +"+"+b+ "= " +(a+b));
			}
		}
	}
	
	
	

}
