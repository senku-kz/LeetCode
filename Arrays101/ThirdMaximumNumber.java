package Arrays101;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int tmp;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length-1-i; j++){
                if(nums[j]<nums[j+1]){
                    tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }

        int cnt = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                cnt++;
            }
        }

        int[] arr = new int[nums.length-cnt];
        arr[0] = nums[0];
        int k = 1;
        for(int i=1; i<nums.length; i++){
            if(arr[k-1] != nums[i]){
                arr[k] = nums[i];
                k++;
            }
        }

        if(arr.length<3)
            return arr[0];

        return arr[2];
    }

    public static void main (String[] arg) {
        ThirdMaximumNumber obj = new ThirdMaximumNumber();

        System.out.println(obj.thirdMax(new int[]{3,2,1}));
        System.out.println(obj.thirdMax(new int[]{1,2}));
        System.out.println(obj.thirdMax(new int[]{2,2,3,1}));
    }
}
