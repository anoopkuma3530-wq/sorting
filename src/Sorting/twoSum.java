package Sorting;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {7, 0, 4, 3, 2, 8, 10};
        int target = 9;


        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));


        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int currentSum = arr[i] + arr[j];

            if (currentSum == target) {
                System.out.println("Found pair: " + arr[i] + " + " + arr[j] + " = " + target);
                break;
            } else if (currentSum > target) {
                j--;
            } else {
                i++;
            }
        }
    }
}