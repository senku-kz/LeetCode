package ArrayAndString;

import java.util.Arrays;

/*
Given an array and a value, remove all instances of that value in-place and return the new length.
 */

public class RemoveElementTwoPointerTechnique {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main (String[] arg) {
        RemoveElementTwoPointerTechnique obj = new RemoveElementTwoPointerTechnique();

        int[] t1 = new int[]{2,7,2,11,15};
        System.out.println(obj.removeElement(t1, 2));
        System.out.println(Arrays.toString(t1));

        int[] t2 = new int[]{2,3,4};
        System.out.println(obj.removeElement(t2, 2));
        System.out.println(Arrays.toString(t2));

        int[] t3 = new int[]{-1,0,5,6,0,5,6,0,0,4};
        System.out.println(obj.removeElement(t3, 0));
        System.out.println(Arrays.toString(t3));
    }
}
