package strings_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My name is Anurag");

		String[] arr = {"Canada","America","Denmark","Alaska","SanDiego"};

		//Converting array to list
		List<String> list = Arrays.asList(arr);
		System.out.println("ArrayList-->"+list);

		//Filter specific string using streams and filter
	//	List<String> specificList = list.stream().filter(s->s.startsWith("Denmark")).collect(Collectors.toList());
	//	System.out.println("SpecificList-->"+specificList);
		
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("SortedList-->"+sortedList);
		
	//	List<String> reverseSortedList = list.stream().sorted(Comparator.reverseOrder().collect(Collectors.toList());
	//	System.out.println("ReverseSortedList-->"+reverseSortedList);

	}

}
