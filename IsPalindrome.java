public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        System.out.println(s);
        boolean res = true;
        for (short i=0; i<s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length()-1-i)){
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main (String[] arg) {
        IsPalindrome obj = new IsPalindrome();

        System.out.println(obj.isPalindrome(121));
        System.out.println(obj.isPalindrome(-121));
        System.out.println(obj.isPalindrome(10));
    }
}
