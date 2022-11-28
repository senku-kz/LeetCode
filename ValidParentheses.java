import java.util.Stack;

public class ValidParentheses {
    public static void main (String[] arg) {
        ValidParentheses obj = new ValidParentheses();

//        System.out.println(obj.validParentheses("()"));
//        System.out.println(obj.validParentheses("()[]{}"));
//        System.out.println(obj.validParentheses("(]"));
//        System.out.println(obj.validParentheses("([)]"));
//        System.out.println(obj.validParentheses("){"));

//        System.out.println(obj.validParenthesesReplace("()"));
//        System.out.println(obj.validParenthesesReplace("()[]{}"));
//        System.out.println(obj.validParenthesesReplace("(]"));
//        System.out.println(obj.validParenthesesReplace("([)]"));
//        System.out.println(obj.validParenthesesReplace("){"));
        System.out.println(obj.validParenthesesReplace("([])"));

    }

    public boolean validParentheses(String s){
        if (s.length()%2 != 0)
            return false;

        Character c1 = '(';
        Character c2 = ')';
        Character c3 = '[';
        Character c4 = ']';
        Character c5 = '{';
        Character c6 = '}';
        Character v;
        Character t;

        Stack<Character> stk= new Stack<>();

        for (int i=0; i<s.length(); i++) {
            v = s.charAt(i);
            if (v.equals(c1) || v.equals(c3) || v.equals(c5)) {
                stk.push(v);
            }

            if (v.equals(c2)) {
                t = stk.pop();
                if (!c1.equals(t)) {
                    return false;
                }
            }

            if (v.equals(c4)) {
                t = stk.pop();
                if (!c3.equals(t)) {
                    return false;
                }
            }

            if (v.equals(c6)) {
                t = stk.pop();
                if (!c5.equals(t)) {
                    return false;
                }
            }
        }
        return stk.empty();
    }

    public boolean validParenthesesReplace(String s){
        if (s.length()%2 != 0)
            return false;
        int l = s.length()/2;
        for (int i=0; i<l; i++) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        return s.isEmpty();
    }

}
