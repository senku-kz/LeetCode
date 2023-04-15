package Arrays101;

import java.util.Arrays;

public class SquaresOfaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i] * nums[i];
        }

        int tmp;
        for(int k=0; k<arr.length; k++){
            for(int i=0; i<arr.length-1-k; i++){
                if(arr[i]> arr[i+1]){
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main (String[] arg) {
        SquaresOfaSortedArray obj = new SquaresOfaSortedArray();

        System.out.println(Arrays.toString(obj.sortedSquares(new int[]{-4,-1,0,3,10})));
        System.out.println(Arrays.toString(obj.sortedSquares(new int[]{-7,-3,2,3,11})));
    }
}
