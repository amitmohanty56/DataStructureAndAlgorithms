package InterviewQuestions;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findFactorial(5));
	}

	//its a recursive CALL
	public static int findFactorial(int n) {
		if(n==0) {
			return 1;
		}
		
		int factorialValue = n * findFactorial(n-1);
		
		return factorialValue;
	}
}
