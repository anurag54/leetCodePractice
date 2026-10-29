package strings;

import java.util.Arrays;

public class twoStringsAreAnagram {

 public static void main(String[] args) {
		twoStringsAreAnagram obj = new twoStringsAreAnagram();
		System.out.println(obj.isAnagram("anagram", "nagaram"));
		System.out.println(obj.isAnagram("rat", "car"));
		System.out.println(obj.isAnagram("jar", "jam"));
	}

public boolean isAnagram(String s, String t) {
	if(s.length()!=t.length()){
		return false;
	}
	else{
		char[] char1 = s.toCharArray();
		char[] char2 = t.toCharArray();

		Arrays.sort(char1);
		Arrays.sort(char2);

		return Arrays.equals(char1,char2);

	}

 }
}