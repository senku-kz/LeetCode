package Arrays101;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0)
            return;

        for (int i=m; i<m+n; i++){
            nums1[i] = nums2[i-m];
        }

        int t;
        for(int i=0; i<nums1.length; i++){
            for (int j=0; j<nums1.length-1-i; j++){
                if(nums1[j]>nums1[j+1]){
                    t = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = t;
                }
            }
        }

    }

    public static void main (String[] arg) {
        MergeSortedArray obj = new MergeSortedArray();

        int[] t1a1 = new int[]{1,2,3,0,0,0};
        int[] t1a2 = new int[]{2,5,6};
        obj.merge(t1a1, 3, t1a2, 3);
        System.out.println(Arrays.toString(t1a1));


        int[] t2a1 = new int[]{1};
        int[] t2a2 = new int[]{};
        obj.merge(t2a1, 1, t2a2, 0);
        System.out.println(Arrays.toString(t2a1));
    }
}
