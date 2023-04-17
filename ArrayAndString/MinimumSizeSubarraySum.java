package ArrayAndString;

/*
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int min = nums.length;
        boolean k = false;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==target) return 1;

            int sum = nums[i], cnt = 1;
            for (int j=i+1; j<nums.length; j++){
                sum += nums[j];
                cnt++;
                if (sum==target && min>=cnt) {
                    min = cnt;
                    k = true;
                }
                if (sum>target) break;
            }
        }
        return k ? min : 0;
    }

    public static void main (String[] arg) {
        MinimumSizeSubarraySum obj = new MinimumSizeSubarraySum();

//        //2
//        int[] a1 = new int[]{2,3,1,2,4,3};
//        System.out.println(obj.minSubArrayLen(7, a1));
//
//        //1
//        int[] a2 = new int[]{1,4,4};
//        System.out.println(obj.minSubArrayLen(4, a2));
//
//        //0
//        int[] a3 = new int[]{1,1,1,1,1,1,1,1};
//        System.out.println(obj.minSubArrayLen(11, a3));

        //3
        int[] a4 = new int[]{1,2,3,4,5};
        System.out.println(obj.minSubArrayLen(11, a4));
    }
}
