package arrays;

public class secondSmallestElementInArray {
	public static int secondSmallest(int[] nums){
		int smallest = nums[0];
		int ssmallest = -1;

		for(int i=0; i<nums.length;i++){
			if(nums[i] < smallest){
				ssmallest = smallest;
				smallest = nums[i];
			}
			else if  (nums[i] < ssmallest && nums[i] != smallest){
				ssmallest = nums[i];
			}
		}
		return ssmallest;
	}

	public static void main(String[] args){
		int secondNum = secondSmallest(new int[] {5,2,7,4,7,6});
		System.out.print("Second Smallest Number "+secondNum);
	}

}
