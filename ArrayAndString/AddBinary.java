package ArrayAndString;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1, j = b.length()-1;
        int carry = 0;

        while (i>=0 || j>=0){
            int sum = carry;
            // ASCII '0' == 48 / '1' == 49
            if (i>=0) sum += a.charAt(i) - '0';
            if (j>=0) sum += b.charAt(j) - 48;
            sb.append(sum%2);
            carry = sum/2;

            i--;
            j--;
        }
        if (carry != 0) sb.append(carry);

        return sb.reverse().toString();
    }

    public static void main (String[] arg) {
        AddBinary obj = new AddBinary();

        System.out.println(obj.addBinary("11", "1"));
        System.out.println(obj.addBinary("1010", "1011"));
    }
}
