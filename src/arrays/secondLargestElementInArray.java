package arrays;

public class secondLargestElementInArray {
	public static int secondLargest(int[] nums){
		int largest = nums[0];
		int slargest = -1;

		for(int i=1; i<nums.length;i++){
			if(nums[i]>largest){
				slargest = largest;
				largest = nums[i];
			}
			else if  (nums[i]> slargest && nums[i] < largest){
				slargest = nums[i];
			}
		}
		return slargest;
	}

	public static void main(String[] args){
		int secondNum = secondLargest(new int[] {1,2,7,4,7,6});
		System.out.print("Second Largest Number " + secondNum);
	}

}
