package strings;


class missingNumberInArray {
 public static void main(String[] args) {
     int[] nums = {0,1,2,3,4,5,6,8};
     System.out.println(missingNumber(nums));
 }

 public static int missingNumber(int[] nums){
     int sum =0;
     int n = nums.length;
     for(int i=0;i<n;i++){
         sum = sum + nums[i];
     }
     int actualSum = (n * (n+1))/2;
     int missingNum = actualSum - sum;
     return missingNum;
 }

}
