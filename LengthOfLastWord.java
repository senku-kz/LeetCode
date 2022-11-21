public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean startWord = false;
        for (int i=s.length()-1; i>=0; i--){
            if (s.charAt(i) == ' ' && startWord)
                break;

            if (s.charAt(i) != ' ') {
                length++;
                startWord = true;
            }
        }
        return length;
    }

    public static void main (String[] arg) {
        LengthOfLastWord obj = new LengthOfLastWord();

        System.out.println(obj.lengthOfLastWord("Hello World"));
        System.out.println(obj.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(obj.lengthOfLastWord("luffy is still joyboy"));

    }
}
