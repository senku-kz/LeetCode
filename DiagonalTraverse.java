import java.util.Arrays;

public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] mat) {
        int row_cnt = mat.length;
        int col_cnt = mat[0].length;
        int[] res = new int[row_cnt*col_cnt];
        int cur_row = 0;
        int cur_col = 0;
        boolean direction = true;
        int i = 0;

        while(i<res.length){
            if(direction){
                while (cur_row>-1 && cur_col<col_cnt){
                    res[i] = mat[cur_row][cur_col];

                    cur_row--;
                    cur_col++;
                    i++;
                }
                if(cur_col==col_cnt){
                    cur_row = cur_row + 2;
                    cur_col = cur_col - 1;
                } else {
                    cur_row++;
                }
                direction = false;
            } else {
                while (cur_row<row_cnt && cur_col>-1){
                    res[i] = mat[cur_row][cur_col];

                    cur_row++;
                    cur_col--;
                    i++;
                }
                if(cur_row==row_cnt){
                    cur_row = cur_row - 1;
                    cur_col = cur_col + 2;
                } else {
                    cur_col++;
                }
                direction = true;
            }
        }
        return res;
    }

    public static void main (String[] arg) {
        DiagonalTraverse obj = new DiagonalTraverse();

        System.out.println(Arrays.toString(obj.findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
        System.out.println(Arrays.toString(obj.findDiagonalOrder(new int[][]{{1, 2}, {3, 4}})));
    }
}
