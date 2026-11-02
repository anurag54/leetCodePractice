package strings;

public class reverseStringWithTwoPointers {
	
	public static void main(String[] args) {
		String str = "Ankita";
		System.out.println(reverseString(str));
	}
	
	public static String reverseString(String str){
		char[] ch = str.toCharArray();
		int left = 0;
		int right = ch.length - 1;
		
		while(left < right){
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		
		return new String(ch);
	}

}
