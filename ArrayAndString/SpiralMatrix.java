package ArrayAndString;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        String direction = "right";
        int[] row = new int[]{0, matrix.length};
        int[] col = new int[]{0, matrix[0].length};
        int[] currentPosition = new int[]{0, 0};
        int i = 0;
        List<Integer> list= new ArrayList<>();

        while (i<matrix.length * matrix[0].length) {
            switch (direction) {
                case "right":
                    if (currentPosition[1] == col[1]) {
                        currentPosition[0]++;
                        currentPosition[1]--;
                        row[0]++;
                        i--;
                        direction = "down";
                    } else {
                        list.add(matrix[currentPosition[0]][currentPosition[1]]);
                        currentPosition[1]++;
                    }
                    break;
                case "down":
                    if (currentPosition[0] == row[1]) {
                        currentPosition[0]--;
                        currentPosition[1]--;
                        col[1]--;
                        i--;
                        direction = "left";
                    } else {
                        list.add(matrix[currentPosition[0]][currentPosition[1]]);
                        currentPosition[0]++;
                    }
                    break;
                case "left":
                    if (currentPosition[1] < col[0]) {
                        currentPosition[0]--;
                        currentPosition[1]++;
                        col[0]++;
                        i--;
                        direction = "up";
                    } else {
                        list.add(matrix[currentPosition[0]][currentPosition[1]]);
                        currentPosition[1]--;
                    }
                    break;
                case "up":
                    if (currentPosition[0] < row[0]) {
                        currentPosition[0]++;
                        currentPosition[1]++;
                        row[1]--;
                        i--;
                        direction = "right";
                    } else {
                        list.add(matrix[currentPosition[0]][currentPosition[1]]);
                        currentPosition[0]--;
                    }
                    break;
            }
            i++;
        }
        return list;
    }

    public static void main (String[] arg) {
        SpiralMatrix obj = new SpiralMatrix();

        System.out.println(obj.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(obj.spiralOrder(new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}}));
    }
}
