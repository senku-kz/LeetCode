package ArrayAndString;

/*
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, sum = 0;
        int res = nums.length + 1;
        for (int r=0; r<nums.length; r++) {
            if (nums[r] == target) return 1;

            sum += nums[r];

            while (sum >= target) {
                if ((r - l + 1) < res) {
                    res = r - l + 1;
                }
                sum = sum - nums[l];
                l++;
            }
        }
       return res == nums.length + 1 ? 0 : res;
    }

    public static void main (String[] arg) {
        MinimumSizeSubarraySum obj = new MinimumSizeSubarraySum();

        //2
        int[] a1 = new int[]{2,3,1,2,4,3};
        System.out.println(obj.minSubArrayLen(7, a1));

        //1
        int[] a2 = new int[]{1,4,4};
        System.out.println(obj.minSubArrayLen(4, a2));

        //0
        int[] a3 = new int[]{1,1,1,1,1,1,1,1};
        System.out.println(obj.minSubArrayLen(11, a3));

        //3
        int[] a4 = new int[]{1,2,3,4,5};
        System.out.println(obj.minSubArrayLen(11, a4));
    }
}
