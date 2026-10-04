package strings;

public class countWords {

public static void main(String[] args) {
	countWords cw = new countWords();
	String s = "Hello, how are you?";
	int wordCount = cw.countWords(s);
	System.out.println("Number of words: " + wordCount);
}

public int countWords(String s) {
    if (s == null || s.trim().isEmpty()) {
        return 0;
    }
    return s.trim().split("\\s+").length;
}
}
