package ArrayAndString;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        int t;

        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);

            if (i>2) {
                for (int j = 1; j < i - 1; j++) {
                    t = triangle.get(i - 2).get(j-1) + triangle.get(i - 2).get(j);
                    list.add(t);
                }
            }

            if (i>1) {
                list.add(1);
            }
            triangle.add(list);
        }
        return triangle;
    }

    public static void main (String[] arg) {
        PascalsTriangle obj = new PascalsTriangle();

        System.out.println(obj.generate(5));
        System.out.println(obj.generate(1));
    }
}
