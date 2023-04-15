package ArrayAndString;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        boolean checker;
        for (int i=0; i<haystack.length()-needle.length()+1; i++) {
            checker = true;
            for (int j=0; j<needle.length(); j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    checker = false;
                    break;
                }
            }
            if (checker){
                return i;
            }
        }
        return -1;
    }

    public static void main (String[] arg) {
        ImplementStrStr obj = new ImplementStrStr();

        System.out.println(obj.strStr("sadbutsad", "sad"));
        System.out.println(obj.strStr("leetcode", "leeto"));
        System.out.println(obj.strStr("a", "a"));
    }
}
