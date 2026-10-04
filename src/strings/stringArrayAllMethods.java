package strings;

import java.util.Arrays;

public class stringArrayAllMethods {

    public static void main(String[] args) {

        String[] arr = {"Java", "Selenium", "API", "Testing", "Java"};

        System.out.println("Original Array : " + Arrays.toString(arr));
        // Output: Original Array : [Java, Selenium, API, Testing, Java]


        // 1. length (Array size)
        System.out.println("Array Length : " + arr.length);
        // Output: Array Length : 5


        // 2. Access array element using index
        System.out.println("Element at index 2 : " + arr[2]);
        // Output: Element at index 2 : API


        // 3. Update array element
        arr[2] = "Rest API";

        System.out.println("After Update : " + Arrays.toString(arr));
        // Output: After Update : [Java, Selenium, Rest API, Testing, Java]


        // 4. Loop through array using for loop
        System.out.println("Using for loop:");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // Output:
        // Java
        // Selenium
        // Rest API
        // Testing
        // Java


        // 5. Enhanced for loop
        System.out.println("Using Enhanced for loop:");

        for(String value : arr) {
            System.out.println(value);
        }
        // Prints every String value


        // 6. Convert Array to String
        System.out.println("Array to String : " + Arrays.toString(arr));
        // Output: [Java, Selenium, Rest API, Testing, Java]


        // 7. Sort String Array
        Arrays.sort(arr);

        System.out.println("Sorted Array : " + Arrays.toString(arr));
        // Output: [Java, Java, Rest API, Selenium, Testing]


        // 8. Binary Search
        int index = Arrays.binarySearch(arr, "Selenium");

        System.out.println("Index of Selenium : " + index);
        // Output: Index position of Selenium


        // 9. Copy Array
        String[] copyArr = Arrays.copyOf(arr, arr.length);

        System.out.println("Copied Array : " + Arrays.toString(copyArr));
        // Output: Same values as original array


        // 10. Copy range
        String[] rangeArr = Arrays.copyOfRange(arr, 1, 4);

        System.out.println("Copy Range : " + Arrays.toString(rangeArr));
        // Output: Elements from index 1 to 3


        // 11. Compare two arrays
        String[] arr2 = {"Java", "Java", "Rest API", "Selenium", "Testing"};

        System.out.println("Array Equals : " + Arrays.equals(arr, arr2));
        // Output: true


        // 12. Fill Array with value
        String[] fillArr = new String[5];

        Arrays.fill(fillArr, "Java");

        System.out.println("Filled Array : " + Arrays.toString(fillArr));
        // Output: [Java, Java, Java, Java, Java]


        // 13. Convert Array to Stream
        long count = Arrays.stream(arr).count();

        System.out.println("Array Count using Stream : " + count);
        // Output: 5


        // 14. Find duplicate elements

        String[] duplicateArr = {"Java", "API", "Selenium", "Java"};

        System.out.println("Duplicate Elements:");

        for(int i = 0; i < duplicateArr.length; i++) {

            for(int j = i + 1; j < duplicateArr.length; j++) {

                if(duplicateArr[i].equals(duplicateArr[j])) {

                    System.out.println(duplicateArr[i]);
                }
            }
        }

        // Output:
        // Java


        // 15. Check Array contains value

        boolean found = false;

        for(String value : arr) {

            if(value.equals("Java")) {
                found = true;
                break;
            }
        }

        System.out.println("Contains Java : " + found);
        // Output: true


        // 16. Join Array elements
        String joined = String.join("-", arr);

        System.out.println("Joined Array : " + joined);
        // Output: Java-Java-Rest API-Selenium-Testing


        // 17. Convert String Array to List
        java.util.List<String> list = Arrays.asList(arr);

        System.out.println("Array as List : " + list);
        // Output: Array elements in List format


        // 18. Remove spaces from String Array values

        String[] names = {" Java ", " Selenium "};

        for(int i = 0; i < names.length; i++) {

            names[i] = names[i].trim();

        }

        System.out.println("After Trim : " + Arrays.toString(names));
        // Output: [Java, Selenium]


        // 19. Convert Array elements to Uppercase

        String[] tech = {"java", "selenium"};

        for(int i = 0; i < tech.length; i++) {

            tech[i] = tech[i].toUpperCase();

        }

        System.out.println("Uppercase Array : " + Arrays.toString(tech));
        // Output: [JAVA, SELENIUM]


        // 20. Reverse String Array

        String[] reverse = {"Java", "API", "Selenium"};

        for(int i = reverse.length - 1; i >= 0; i--) {

            System.out.println(reverse[i]);

        }
        System.out.println("Reverse Array : " + Arrays.toString(reverse));
        // Output:
        // Selenium
        // API
        // Java
        // Output: [JAVA, API, SELENIUM]
    }
}