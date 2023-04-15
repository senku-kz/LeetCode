package ArrayAndString;

import java.util.Arrays;

/*
* Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn)
* such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
*/
public class ArrayPartition1 {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i+=2){
            sum += nums[i];
        }
        return sum;
    }

    public static void main (String[] arg) {
        ArrayPartition1 obj = new ArrayPartition1();

        System.out.println(obj.arrayPairSum(new int[]{1,4,3,2}));
        System.out.println(obj.arrayPairSum(new int[]{6,2,6,5,1,2}));
    }
}
