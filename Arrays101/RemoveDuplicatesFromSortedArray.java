package Arrays101;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int a=0;
        for(int i=nums.length-2; i>=0; i--){
            if (nums[i] == nums[i+1]){
                for(int k=i; k<nums.length-1; k++){
                    nums[k] = nums[k+1];
                }
                nums[nums.length-1]=0;
                a++;
            }
        }
        return nums.length-a;
    }

    public static void main (String[] arg) {
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();

        int[] a1 = new int[]{1,1,2};
        int k1 = obj.removeDuplicates(a1);
        System.out.println(k1);
        System.out.println(Arrays.toString(a1));

        int[] a2 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int k2 = obj.removeDuplicates(a2);
        System.out.println(k2);
        System.out.println(Arrays.toString(a2));
    }
}
