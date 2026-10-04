package strings;

import java.util.*;

public class listToSetConversion {
	 public static void main(String[] args) {

	        List<String> list = new ArrayList<String>();
	        list.add("Java");
	        list.add("Python");
	        list.add("C#");
	        list.add("Java");
	        list.add("Python");

	        // List to Set Conversion --> LinkedHashSet keeps order
	        Set<String> set = new LinkedHashSet<String>(list);
	        System.out.println("List to Set : "+set);

	        //Set to List Conversion
	        List<String> newList = new ArrayList<>(set);
	        System.out.println("Set to List : "+newList);
	    }

}
