package ArrayAndString;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0)
            return "";
        if (strs[0].length()==0){
            return "";
        }
        boolean p = true;
        String prefix = "";
        short i = 0;
        do{
            for (short str=1; str< strs.length; str++){
                if (strs[str].length()==i || strs[0].charAt(i) != strs[str].charAt(i)){
                    p = false;
                    break;
                }
            }
            if (p) {
                prefix += strs[0].charAt(i);
            }
            i++;
            if( strs[0].length() == i){
                p = false;
            }
        }while (p);
        return prefix;
    }

    public static void main (String[] arg) {
        LongestCommonPrefix obj = new LongestCommonPrefix();

        System.out.println(obj.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(obj.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(obj.longestCommonPrefix(new String[]{"flow", "flower", "flowerist"}));
        System.out.println(obj.longestCommonPrefix(new String[]{"flow", "flo", "flowerist"}));
    }
}
