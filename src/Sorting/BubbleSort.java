package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={8,9,3,7,2,15};
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            int swaps = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) break;
        }
        System.out.print(Arrays.toString(arr));
    }
}