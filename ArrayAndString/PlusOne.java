package ArrayAndString;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int s = 1;
        int t = 0;

        for (int i = digits.length-1; i > -1 ; i--) {
            t = digits[i] + s;
            if (t>9){
                digits[i] = t%10;
                s = t/10;
            }else {
                digits[i] = t;
                s = 0;
            }
        }

        if (s !=0){
            int[] d = new int[digits.length + 1];
            d[0] = s;
            for (int i = 0; i < digits.length; i++) {
                d[i+1] = digits[i];
            }
            return d;
        }

        return digits;
    }

    public static void main (String[] arg) {
        PlusOne obj = new PlusOne();

        System.out.println(Arrays.toString(obj.plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(obj.plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(obj.plusOne(new int[]{9, 9})));
    }

}
