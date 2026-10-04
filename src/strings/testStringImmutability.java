package strings;

public class testStringImmutability {



	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = s1; // Both reference the same object in the String Pool

		// Attempting to modify s1
		s1 = s1.concat(" World"); 

		System.out.println("New String : "+s1); // Output: Hello World
		System.out.println("Original String : "+s2); // Output: Hello 

		// The original object "Hello" (referenced by s2) remains unchanged.
		// s1 now references a completely new object "Hello World".
	}

}
