package arrays;

import java.util.Arrays;
class moveZerosToRight {

 public static int[] moveZeros(int[] arr){
     int left =0; 
     for(int right=0;right<arr.length;right++){
         if(arr[right]!=0){
         int temp = arr[right];
         arr[right]= arr[left];
         arr[left]= temp;
         left++;
         }
     }
     return arr;
 }
 public static void main(String[] args) {
     int[] arr1 = moveZeros(new int[] {5,0,4,0,3});
     System.out.println(Arrays.toString(arr1));
 }
}