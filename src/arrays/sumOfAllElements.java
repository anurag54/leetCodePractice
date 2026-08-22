package arrays;

public class sumOfAllElements {
	public static int sumOfAllElements(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {	
		int result = sumOfAllElements(new int[] {1, 2, 3, 4, 5});
		System.out.println("The sum of all elements in the array is: " + result);
	}

}
