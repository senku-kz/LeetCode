package ArrayAndString;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        return new ArrayList<>();
    }

    public static void main (String[] arg) {
        PascalsTriangle obj = new PascalsTriangle();

        System.out.println(obj.generate(5));
        System.out.println(obj.generate(1));
    }
}
