package arrays;

class sortArray {
	public static void main(String[] args) {
		System.out.println("Try clicking the Run button.");
		int arr[] = {4,2,1,3,6};
		sortedArray(arr);
		for(int i=0;i<arr.length;i++)
		{        System.out.print(arr[i]+" ");
		}
	}

	public static int[] sortedArray(int arr[]){

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}