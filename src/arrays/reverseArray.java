package arrays;

import java.util.Arrays;
public class reverseArray {

    public static int[] reverseArray(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
    public static void main(String[] args){
      reverseArray(new int[] {1,2,3,4,5,6,7,8,9,10});
    }

}