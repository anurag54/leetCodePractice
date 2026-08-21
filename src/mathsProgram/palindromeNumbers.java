package mathsProgram;

public class palindromeNumbers {
	
	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int original = x;
		int reversed = 0;
		while (x != 0) {
			int digit = x % 10;
			reversed = reversed * 10 + digit;
			x /= 10;
		}
		return original == reversed;
	}
	
	public static void main(String[] args) {
		int num1 = 121;
		int num2 = -121;
		int num3 = 10;
		
		System.out.println(num1 + " is palindrome: " + isPalindrome(num1));
		System.out.println(num2 + " is palindrome: " + isPalindrome(num2));
		System.out.println(num3 + " is palindrome: " + isPalindrome(num3));
	}

}
