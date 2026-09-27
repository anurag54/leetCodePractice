package strings;

class reverseString {
	public static void main(String[] args) {
		String str = "Ankita";
		System.out.println(reverseString(str));
	}

	public static String reverseString(String str){
		String reverse = "";

		char[] ch = str.toCharArray();

		for(int i=ch.length-1;i>=0;i--){
			reverse = reverse + ch[i];
		}
		return reverse;    
	}
}
