package ArrayAndString;

import java.util.Arrays;

public class RotateArray {
    /*
    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     */
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] t = new int[k];

        for(int i=0; i<k%nums.length; i++){
            t[i] = nums[nums.length-k+i];
        }

        for (int i = nums.length-1; i>=k; i--) {
            nums[i] = nums[i-k%nums.length];
        }

        for(int i=0;i<k; i++){
            nums[i] = t[i];
        }
    }

    public void reverse(int[] nums, int start, int end){
        while (start < end){
            int t = nums[start];
            nums[start] = nums[end];
            nums[end] = t;
            start ++;
            end --;
        }
    }

    public void rotateReverse(int[] nums, int k){
        k = k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

        /*
        Time complexity: O(n*k)
        Space complexity: O(1). No extra space.
         */
    }

    public static void main (String[] arg) {
        RotateArray obj = new RotateArray();

        int[] a1 = new int[]{1,2,3,4,5,6,7};
        obj.rotate(a1, 3);
        System.out.println(Arrays.toString(a1));

        int[] a2 = new int[]{-1,-100,3,99};
        obj.rotate(a2, 2);
        System.out.println(Arrays.toString(a2));

        int[] a3 = new int[]{-1};
        obj.rotate(a3, 2);
        System.out.println(Arrays.toString(a3));

        int[] a11 = new int[]{1,2,3,4,5,6,7};
        obj.rotateReverse(a11, 3);
        System.out.println(Arrays.toString(a11));

        int[] a12 = new int[]{-1,-100,3,99};
        obj.rotateReverse(a12, 2);
        System.out.println(Arrays.toString(a12));

        int[] a13 = new int[]{-1};
        obj.rotateReverse(a13, 2);
        System.out.println(Arrays.toString(a13));
    }
}
