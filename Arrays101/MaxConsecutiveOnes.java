package Arrays101;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0, mx = 0;
        for(int el:nums){
            if(el==0){
                cnt = 0;
            }else{
                cnt++;
            }
            if (cnt>mx)
                mx = cnt;
        }
        return mx;
    }

    public static void main (String[] arg) {
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();

        System.out.println(obj.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        System.out.println(obj.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }
}
