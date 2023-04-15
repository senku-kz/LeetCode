package ArrayAndString;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {

    }

    public static void main (String[] arg) {
        ReverseString obj = new ReverseString();

        char[] s1 = new char[]{'h','e','l','l','o'};
        obj.reverseString(s1);
        System.out.println(Arrays.toString(s1));

        char[] s2 = new char[]{'H','a','n','n','a','h'};
        obj.reverseString(s2);
        System.out.println(Arrays.toString(s2));
    }
}
