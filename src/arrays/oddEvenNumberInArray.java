package arrays;

public class oddEvenNumberInArray {
	
	public static void  evenOddNumber(int[] arr){

        for(int i=0; i < arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i]+ " is Even");
            }
            else {
                System.out.println(arr[i]+ " is Odd");
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {3,4,1,2,5,6};
        evenOddNumber(nums);
    }

}
