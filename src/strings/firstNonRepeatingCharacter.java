package strings;

public class firstNonRepeatingCharacter {
	
	public static int firstUniqChar(String s) {
		int[] count = new int[26];
		char[] chars = s.toCharArray();
		
		for(char c : chars) {
			count[c - 'a']++;
		}
		for (int i = 0; i < chars.length; i++) {
			if (count[chars[i] - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(firstUniqChar(s));
		String s2 = "loveleetcode";
		System.out.println(firstUniqChar(s2));
		String s3 = "aabb";
	}

}
