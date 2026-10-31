package arrays;

import java.util.*;

public class duplicateElementsAndFrequencies {

	public static void main(String[] args) {
		int[] arr = {2,1,3,4,3,4,2,5,6,7,2,8};
		duplicateElementInArray(arr);

	}

	public static void duplicateElementInArray(int[] arr){

		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				int freq = map.get(arr[i]);
				map.put(arr[i],freq+1);
			}
			else 
				map.put(arr[i],1);
		}
		for(Map.Entry<Integer,Integer> maEntry : map.entrySet()){
			int key = maEntry.getKey();
			int value = maEntry.getValue(); 
			//System.out.println(key+" "+value);
			if(value>=2){
			//	System.out.println("Duplicate Elements: "+key);
				System.out.println("Duplicate Elements: "+key+" "+"Frequency: "+value);
			}

		}
	}
	
	
// LeetCode 287. Find the Duplicate Number	
//	public int findDuplicate(int[] nums) {
//
//		HashMap<Integer,Integer> map = new HashMap<>();
//
//		for(int num : nums){
//
//			map.put(num, map.getOrDefault(num,0)+1);
//
//			if(map.get(num)>1){
//				return num;
//			}
//
//		}
//
//		return -1;
//	}
	
}