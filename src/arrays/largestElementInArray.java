package arrays;

public class largestElementInArray {
	public static int largestElement(int[] arr) {
		int largest = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
		
	}
	public static void main(String[] args) {
		int result = largestElement(new int[] {1,2,3,4,5});
		System.out.println("largest element "+result);
	}
}


