package Arrays101;

import java.util.Arrays;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int e = nums.length-1;
        int tmp;
        for (int i=0; i<=e; i++){
            if(nums[i]%2==1){
                tmp = nums[i];
                for (int k=i; k<e; k++){
                    nums[k] = nums[k+1];
                }
                nums[e] = tmp;
                e--;
                i--;
            }
        }
        return nums;
    }

    public static void main (String[] arg) {
        SortArrayByParity obj = new SortArrayByParity();

        int[] a1 = new int[]{3,1,2,4};
        System.out.println(Arrays.toString(obj.sortArrayByParity(a1)));

        int[] a2 = new int[]{0};
        System.out.println(Arrays.toString(obj.sortArrayByParity(a2)));
    }
}
