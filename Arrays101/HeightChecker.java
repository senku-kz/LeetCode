package Arrays101;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        System.arraycopy(heights, 0, expected, 0, heights.length);

        int tmp;
        for(int j=0; j<heights.length; j++){
            for(int i=0; i<heights.length-j-1; i++){
                if (expected[i]>expected[i+1]){
                    tmp = expected[i];
                    expected[i] = expected[i+1];
                    expected[i+1] = tmp;
                }
            }
        }

        int cnt = 0;
        for (int i=0; i<heights.length; i++){
            if(heights[i] != expected[i])
                cnt++;
        }
        return cnt;
    }

    public static void main (String[] arg) {
        HeightChecker obj = new HeightChecker();

        System.out.println(obj.heightChecker(new int[]{1,1,4,2,1,3}));
        System.out.println(obj.heightChecker(new int[]{5,1,2,3,4}));
    }
}
