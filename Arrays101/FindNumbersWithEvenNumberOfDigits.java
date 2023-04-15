package Arrays101;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int cnt;
        int cnt_2 = 0;

        for(int el:nums){
            int v = el;
            cnt = 0;
            while (v>0) {
                v = v/10;
                cnt++;
            }


            if(cnt%2==0){
                cnt_2++;
            }
        }
        return cnt_2;
    }
    public static void main (String[] arg) {
        FindNumbersWithEvenNumberOfDigits obj = new FindNumbersWithEvenNumberOfDigits();

        System.out.println(obj.findNumbers(new int[]{12,345,2,6,7896}));
        System.out.println(obj.findNumbers(new int[]{555,901,482,1771}));
    }
}
