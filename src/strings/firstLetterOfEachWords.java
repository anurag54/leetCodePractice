package strings;

public class firstLetterOfEachWords {

	public static void main(String[] args) {
		String s = "Hello World from Java";
		firstLetterOfEachWords obj = new firstLetterOfEachWords();
		obj.printFirstLetter(s);
	}

	public void printFirstLetter(String s) {
		if (s == null || s.trim().isEmpty()) {
			return;
		}

		String[] words = s.trim().split("\\s+");
		for (String word : words) {
			System.out.print(word.charAt(0) + " ");
		}
	}
}
