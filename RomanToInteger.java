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
