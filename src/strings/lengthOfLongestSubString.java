package strings;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubString {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {

		Map<Character, Integer> map = new HashMap<>();

		int left = 0; int maxLength = 0;

		for(int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);

			if(map.containsKey(ch)) {
				left = Math.max(left, map.get(ch) + 1);
			}

			map.put(ch, right);
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;
	}
}
