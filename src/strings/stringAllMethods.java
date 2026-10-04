package strings;

public class stringAllMethods {

    public static void main(String[] args) {

        String str = "My name is Java";

        System.out.println("Original String : " + str); 
        // Output: Original String : My name is Java


        // 1. length()
        System.out.println("Length : " + str.length()); 
        // Output: Length : 15


        // 2. charAt()
        System.out.println("Character at index 3 : " + str.charAt(3)); 
        // Output: Character at index 3 : n


        // 3. substring(beginIndex)
        System.out.println("Substring from index 3 : " + str.substring(3)); 
        // Output: Substring from index 3 : name is Java


        // 4. substring(beginIndex, endIndex)
        System.out.println("Substring (3,7) : " + str.substring(3, 7)); 
        // Output: Substring (3,7) : name


        // 5. toUpperCase()
        System.out.println("Uppercase : " + str.toUpperCase()); 
        // Output: Uppercase : MY NAME IS JAVA


        // 6. toLowerCase()
        System.out.println("Lowercase : " + str.toLowerCase()); 
        // Output: Lowercase : my name is java


        // 7. contains()
        System.out.println("Contains 'Java' : " + str.contains("Java")); 
        // Output: Contains 'Java' : true


        // 8. startsWith()
        System.out.println("Starts with 'My' : " + str.startsWith("My")); 
        // Output: Starts with 'My' : true


        // 9. endsWith()
        System.out.println("Ends with 'Java' : " + str.endsWith("Java")); 
        // Output: Ends with 'Java' : true


        // 10. equals()
        System.out.println("Equals : " + str.equals("My name is Java")); 
        // Output: Equals : true


        // 11. equalsIgnoreCase()
        System.out.println("Equals Ignore Case : " + str.equalsIgnoreCase("my name is java")); 
        // Output: Equals Ignore Case : true


        // 12. indexOf()
        System.out.println("Index of 'name' : " + str.indexOf("name")); 
        // Output: Index of 'name' : 3


        // 13. lastIndexOf()
        System.out.println("Last index of 'a' : " + str.lastIndexOf('a')); 
        // Output: Last index of 'a' : 13


        // 14. replace()
        System.out.println("Replace Java with Python : " + str.replace("Java", "Python")); 
        // Output: Replace Java with Python : My name is Python


        // 15. replaceAll()
        System.out.println("Replace all 'a' : " + str.replaceAll("a", "@")); 
        // Output: Replace all 'a' : My n@me is J@v@


        // 16. replaceFirst()
        System.out.println("Replace first 'a' : " + str.replaceFirst("a", "@")); 
        // Output: Replace first 'a' : My n@me is Java


        // 17. concat()
        System.out.println("Concat : " + str.concat(" Programming")); 
        // Output: Concat : My name is Java Programming


        // 18. trim()
        String s1 = "   Hello Java   ";
        System.out.println("Trim : " + s1.trim()); 
        // Output: Trim : Hello Java


        // 19. isEmpty()
        String s2 = "";
        System.out.println("Is Empty : " + s2.isEmpty()); 
        // Output: Is Empty : true


        // 20. isBlank() (Java 11+)
        String s3 = "   ";
        System.out.println("Is Blank : " + s3.isBlank()); 
        // Output: Is Blank : true


        // 21. split()
        String[] words = str.split(" ");

        System.out.println("Split:");
        // Output: Split:

        for (String word : words) {
            System.out.println(word);
            // Output:
            // My
            // name
            // is
            // Java
        }


        // 22. toCharArray()
        char[] ch = str.toCharArray();

        System.out.println("Characters:");
        // Output: Characters:

        for (char c : ch) {
            System.out.print(c + " ");
            // Output: M y   n a m e   i s   J a v a
        }

        System.out.println();


        // 23. compareTo()
        System.out.println("CompareTo : " + str.compareTo("My name")); 
        // Output: CompareTo : 8
        // Positive value means first string is greater


        // 24. compareToIgnoreCase()
        System.out.println("Compare Ignore Case : " + str.compareToIgnoreCase("my name is java")); 
        // Output: Compare Ignore Case : 0
        // 0 means both strings are equal ignoring case


        // 25. matches()
        System.out.println("Matches : " + str.matches(".*Java")); 
        // Output: Matches : true
        // Checks whether string matches the given regular expression


        // 26. toString()
        System.out.println("toString() : " + str.toString()); 
        // Output: toString() : My name is Java


        // 27. valueOf()
        int num = 100;

        String value = String.valueOf(num);

        System.out.println("ValueOf : " + value); 
        // Output: ValueOf : 100


        // 28. join()
        String joined = String.join("-", "Java", "Selenium", "API");

        System.out.println("Join : " + joined); 
        // Output: Join : Java-Selenium-API


        // 29. repeat()
        System.out.println("Repeat : " + "Hi ".repeat(3)); 
        // Output: Repeat : Hi Hi Hi


        // 30. intern()
        String s4 = new String("Java");

        String s5 = s4.intern();

        System.out.println("Intern : " + s5); 
        // Output: Intern : Java
        // Returns the String from String Pool
    }
}
