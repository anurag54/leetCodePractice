package arrays;
import java.util.*;

public class removeDuplicatesInArray {

	    public static void main(String[] args) {
	       int[] arr = {2,1,3,4,3,4,2,5,6,7,2,8};
	        removeDuplicates(arr);
	    }

	    public static void removeDuplicates(int[] arr){

	    	//Using LinkedHashSet to maintain the order of elements and remove duplicates
	        Set<Integer> set = new LinkedHashSet<>();

	        for(int nums : arr){
	            set.add(nums);
	        }
	        //After removing duplicates , print the unique elements
	        for(int uniqueNums : set){
	            System.out.println(uniqueNums);
	        }
	    }
}
