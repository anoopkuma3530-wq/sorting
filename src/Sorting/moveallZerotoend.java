package Sorting;

import java.util.Arrays;

public class moveallZerotoend {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 9, 5, 7, 0};
//
//        moveZeros(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void moveZeros(int[] arr) {
//        int nonZeroPos = 0;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                arr[nonZeroPos] = arr[i];
//                nonZeroPos++;
//            }
//        }
//
//
//        while (nonZeroPos < arr.length) {
//            arr[nonZeroPos] = 0;
//            nonZeroPos++;
//        }
        int n=arr.length;
        int j=0;for(int i=0;i<n;i++){
            if(arr[i]!=0){
                if(i!=j){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
                System.out.print(arr[j]);
            }
        }
    }
}