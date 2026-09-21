package arrays;

public class duplicateElementsInArray {

    public static int frequency(int[] arr) {

        int duplicateCount = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean visited = false;

            // Check if the element has already been counted
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    visited = true;
                    break;
                }
            }

            if (visited) {
                continue;
            }

            int count = 1;

            // Count frequency
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " time(s)");

            // Print duplicate elements only
            if (count > 1) {
                duplicateCount++;
                System.out.println("Duplicate element: " + arr[i]);
            }
        }

        return duplicateCount;
    }

    public static void main(String[] args) {

        int result = frequency(new int[] {1, 2, 3, 4, 5, 2, 3, 2});

        System.out.println("Number of duplicate elements: " + result);
    }
}