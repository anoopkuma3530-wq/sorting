package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 3, 7, 6, 4, 2};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;


                }

            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;


//            System.out.print(arr);
        }
        System.out.print(Arrays.toString(arr));
    }
}

