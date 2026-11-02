package strings;

import java.util.*;

public class removeDuplicateCharacters {

	public static void main(String[] args) {
		String str = "leetcode";
		String result = removeDuplicates(str);
		System.out.println(result);
	}

	public static String removeDuplicates(String str){
		Set<Character> set = new LinkedHashSet<>();
		char[] ch = str.toCharArray();

		for(char ch1 : ch){
			set.add(ch1);
		}
		StringBuilder result = new StringBuilder();
		//After removing duplicates 
		for(char uniqueChar : set){
			result.append(uniqueChar);
		}
		return result.toString();
	}
}
