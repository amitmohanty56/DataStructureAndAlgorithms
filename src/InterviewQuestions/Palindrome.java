package InterviewQuestions;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(checkPalindrome(12));
	}

	public static boolean checkPalindrome(int input) {
		
		int temp = input;
		
		int rev = 0,rem;
		
		while(temp != 0) {
			
			rem = temp%10;
			rev = rev * 10 + rem;
			temp = temp/10;
		}
		
       if(input == rev) {
    	   return true;
       }else {
    	   return false;
       }
	}
}
