package Arrays101;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int t = nums[0];
        int j = 1;
        for(int i=1; i<nums.length; i++){
            if(t != nums[i]){
                t = nums[i];
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main (String[] arg) {
        RemoveDuplicatesFromSortedArray2 obj = new RemoveDuplicatesFromSortedArray2();

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
