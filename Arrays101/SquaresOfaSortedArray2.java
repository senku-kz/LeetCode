package Arrays101;

import java.util.Arrays;

public class SquaresOfaSortedArray2 {
    public int[] sortedSquares(int[] nums) {
        for (int i=0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main (String[] arg) {
        SquaresOfaSortedArray2 obj = new SquaresOfaSortedArray2();

        System.out.println(Arrays.toString(obj.sortedSquares(new int[]{-4,-1,0,3,10})));
        System.out.println(Arrays.toString(obj.sortedSquares(new int[]{-7,-3,2,3,11})));
    }
}
