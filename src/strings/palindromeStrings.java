package strings;

public class palindromeStrings {

 public static void main(String[] args) {
      String str = "Racar";
      String rev = palindromeString(str);
      if (str.equalsIgnoreCase(rev)) {
         System.out.println("Palindrome");
     } else {
         System.out.println("Not Palindrome");
     }
 }

 public static String palindromeString(String str){
       String rev = "";
       char[] ch = str.toCharArray();
       for(int i=ch.length-1;i>=0;i--){
           rev = rev + ch[i];
     }
     return rev;
 }
}