package Arrays101;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j=0, n=0, v=0;
        while(n+v<nums.length){
            if(nums[j]==0){
                for(int i=j+1; i<nums.length; i++){
                    nums[i-1] = nums[i];
                }
                nums[nums.length-1] = 0;
                n++;
                continue;
            }else{
                v++;
            }
            j++;
        }

    }

    public static void main (String[] arg) {
        MoveZeroes obj = new MoveZeroes();

        int[] a1 = new int[]{0,1,0,3,12};
        obj.moveZeroes(a1);
        System.out.println(Arrays.toString(a1));

        int[] a2 = new int[]{0};
        obj.moveZeroes(a2);
        System.out.println(Arrays.toString(a2));
    }
}
