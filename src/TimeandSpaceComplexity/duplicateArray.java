package TimeandSpaceComplexity;

public class duplicateArray {
    public static void main(String[] args) {
        int[] arr={5,1,2,4,3,4};
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]) System.out.println(arr[i]);
        int sum=0;
        int n =arr.length;
        for(int ele:arr){
            sum +=ele;
            }
        int expectedSum = (n-1)*n/2;
        int duplicate = sum - expectedSum;
//        System.out.println(duplicate);

        System.out.println(duplicate);
    }
}
