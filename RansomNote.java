/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true


Constraints:

1 <= ransomNote.length, magazine.length <= 10^5
ransomNote and magazine consist of lowercase English letters.
*/

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean res = true;
        int f;

        for (int i=0; i<ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            f = magazine.indexOf(c);
            if (f < 0){
                return false;
            }
            magazine = magazine.substring(0, f) + magazine.substring(f+1, magazine.length());
        }
        return res;
    }
    public static void main (String[] arg) {
        RansomNote obj = new RansomNote();

        System.out.println(obj.canConstruct("a", "b"));
        System.out.println(obj.canConstruct("aa", "ab"));
        System.out.println(obj.canConstruct("aa", "aab"));
    }

}
