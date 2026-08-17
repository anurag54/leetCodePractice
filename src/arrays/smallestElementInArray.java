package arrays;

public class smallestElementInArray {
	public static int smallestElement(int[] arr) {
		int smallest = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		return smallest;
		
	}
	public static void main(String[] args) {
		int result = smallestElement(new int[] {6,7,3,4,5});
		System.out.println("largest element "+result);
	}
}
