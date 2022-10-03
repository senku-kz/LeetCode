/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/

public class RomanToInteger {
    public int romanToInt(String s) {
        int n = 0;

        for (int i=0; i<s.length(); i+=1){
            // System.out.println(s.charAt(i));
            if(s.charAt(i) == 'I'){
                n +=1;
            }

            if(s.charAt(i) == 'V'){
                n += 5;
                if (i>0 && s.charAt(i-1) == 'I'){
                    n -= 2;
                }
            }

            if(s.charAt(i) == 'X'){
                n += 10;
                if (i>0 && s.charAt(i-1) == 'I'){
                    n -= 2;
                }
            }

            if(s.charAt(i) == 'L'){
                n += 50;
                if (i>0 && s.charAt(i-1) == 'X'){
                    n -= 20;
                }
            }

            if(s.charAt(i) == 'C'){
                n += 100;
                if (i>0 && s.charAt(i-1) == 'X'){
                    n -= 20;
                }
            }


            if(s.charAt(i) == 'D'){
                n += 500;
                if (i>0 && s.charAt(i-1) == 'C'){
                    n -= 200;
                }
            }

            if(s.charAt(i) == 'M'){
                n += 1000;
                if (i>0 && s.charAt(i-1) == 'C'){
                    n -= 200;
                }
            }
        }
        return n;
    }

    public static void main (String[] arg) {
        RomanToInteger romanToInt = new RomanToInteger();

        System.out.println(romanToInt.romanToInt("III"));
        System.out.println(romanToInt.romanToInt("LVIII"));
        System.out.println(romanToInt.romanToInt("MCMXCIV"));
        System.out.println(romanToInt.romanToInt("IV"));
        System.out.println(romanToInt.romanToInt("IX"));
        System.out.println(romanToInt.romanToInt("XL"));
        System.out.println(romanToInt.romanToInt("XC"));
        System.out.println(romanToInt.romanToInt("CD"));
        System.out.println(romanToInt.romanToInt("CM"));
        System.out.println(romanToInt.romanToInt("MXL"));
    }
}
