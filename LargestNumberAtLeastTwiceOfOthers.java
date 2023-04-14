public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        int m = nums[maxIndex];
        for (int i=1; i<nums.length; i++){
            if(m<nums[i]){
                maxIndex = i;
                m = nums[i];
            }
        }

        for (int x:nums) {
            if(x != m && m<2*x){
                return -1;
            }
        }
        return maxIndex;
    }

    public static void main (String[] arg) {
        LargestNumberAtLeastTwiceOfOthers obj = new LargestNumberAtLeastTwiceOfOthers();

        System.out.println(obj.dominantIndex(new int[]{3, 6, 1, 0}));
        System.out.println(obj.dominantIndex(new int[]{1, 2, 3, 4}));
    }
}
