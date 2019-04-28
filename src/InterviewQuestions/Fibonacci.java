package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;


/*Anything we do with recursion CAN be done iteratively(loop) 
 * In this class i have both implementation i.e. recursion and iterative
*/
public class Fibonacci {

	public static void main(String[] args) {

//		findFibonacci(8);

//		System.out.println(getFibonacciNumberIteative(8));

		System.out.println(getFibonacciNumberRecursion(2));
	}

	/*
	 * Fibonacci series is the sum of the previous 2 number. for ex
	 * {0,1,1,2,3,5,8,13,21} so its 0+1 -> 1, 1+1->2, 2+1-> 3, 3+2 ->5
	 * 
	 * To get the nth element of fibonacci series the formula is f(n) = f(n-1) +
	 * f(n-2);
	 */

//  This is an iterative approach.
//	Pass the number to see its fibonacci series.
	public static void findFibonacci(int input) {

		int a = 0;
		int b = 1;
		int result = 0;
		if (input == a || input == b) {
			System.out.println(" " + a + " : " + b);

		} else {
			for (int i = 1; i < input; i++) {
				result = a + b;
				System.out.println(result);

				a = b;
				b = result;

			}
		}
	}

	// find the nth/index value attached to the given nth number.
	//BIG O is O(n) -> becoz of 1 for loop.
	public static int getFibonacciNumberIteative(int n) {

		List list = new ArrayList();
		list.add(0);
		list.add(1);

		// This is one way to do which is more effective than the down one at line 57.
//		for(int i = 2;i <=n ; i ++) {
//			
//			list.add((int)list.get(i-2) + (int)list.get(i-1));
//		}

		// This is anothor way to do.
		int a = 0;
		int b = 1;
		int result = 0;
		for (int i = 2; i <= n; i++) {

			result = a + b;
			a = b;
			b = result;
			list.add(result);
			System.out.println("size :" + list.toString());
		}

		return (int) list.get(n);
	}

	/*
	 * Recursive approach.as the formula to find nth value is Fn = F(n-1) + f(n-2)
	 * where n is the nth element. For ex if we want to find the element or value at
	 * 3 index or 3nth number then f(3) -> f(n-1 + f(n-2) -> f(2) + f(1) -> as the
	 * base condition execute as n < 2 so f(1) returns 1 and f(2) -> f(0) + f(1) ->
	 * returns 1 as base condition executes. f(3) -> f(2) + f(1) -> (f(0) + f(1)) +
	 * 1 -> (1) + 1 -> 2;
	 * 
	 * BIG O for this recursion is  O(2^n) this is exponential time. 
	 * which is really bad performance.
	 * So in this case recursion is not useful and iterative approach is more suitable.
	 * we can improve from O(2^n) to O(n) by using dynamic programming.
	 */
	public static int getFibonacciNumberRecursion(int n) {

		if (n < 2) {
			return n;
		}

		return getFibonacciNumberRecursion(n - 2) + getFibonacciNumberRecursion(n - 1);

	}

}
