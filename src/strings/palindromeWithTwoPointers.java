package strings;

public class palindromeWithTwoPointers {

	public static void main(String[] args) {
		String str = "Madam";
		boolean result = isPalindrome(str.toLowerCase());
		if (result) {
			System.out.println(str + " is a Palindrome");
		} else {
			System.out.println(str + " is NOT a Palindrome");
		}
	}

	public static boolean isPalindrome(String str){

		int left =0;
		int right = str.length()-1;

		while (left<right){
			if (str.charAt(left) != str.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}