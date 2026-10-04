package strings;

public class countWords {

	public static void main(String[] args) {
		String s = "Hello, how are you?";
		int wordCount = countWords(s);
		System.out.println("Number of words: " + wordCount);
	}

	public static int countWords(String s) {
		if (s == null || s.trim().isEmpty()) {
			return 0;
		}
		return s.trim().split("\\s+").length;
	}
}
