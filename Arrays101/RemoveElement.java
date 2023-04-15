package Arrays101;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int cnt = 0, i=0;
        while(i<nums.length){
            if(nums[i]==val){
                cnt++;
                for (int j=i; j<nums.length-1; j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length-1]=-1;
                i--;
            }
            i++;
        }
        return nums.length-cnt;
    }

    public static void main (String[] arg) {
        RemoveElement obj = new RemoveElement();

        int[] a1 = new int[]{3,2,2,3};
        int k1 = obj.removeElement(a1, 3);
        System.out.println(Arrays.toString(a1));

        int[] a2 = new int[]{0,1,2,2,3,0,4,2};
        int k2 = obj.removeElement(a2, 2);
        System.out.println(Arrays.toString(a2));
    }
}
