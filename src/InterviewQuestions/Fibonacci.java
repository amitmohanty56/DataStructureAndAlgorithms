package InterviewQuestions;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findFibonacci(0);
	}

	public static void findFibonacci(int input) {
		
		int a = 0;
		int b = 1;
		int result = 0;
		if(input == a || input == b) {
			System.out.println(" "+ a +" : "+b);
		
		}else {
			for(int i = 1;i < input;i++) {
				result = a + b;
				System.out.println(result);
				a = b;
				b = result;
				
			}
		}
	}
}
