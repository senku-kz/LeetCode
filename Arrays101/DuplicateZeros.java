package Arrays101;

import java.util.Arrays;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if (arr[i] == 0){
                arr = this.arrShift(arr, i);
                if (i<arr.length-1){
                    arr[i+1] = 0;
                    i++;
                }
            }
        }
    }

    protected int[] arrShift(int[] arr, int i){
        for (int e=arr.length-2; e>i; e--){
            arr[e+1] = arr[e];
        }
        return arr;
    }

    public static void main (String[] arg) {
        DuplicateZeros obj = new DuplicateZeros();

        int[] t1 = new int[]{1,0,2,3,0,4,5,0};
        obj.duplicateZeros(t1);
        System.out.println(Arrays.toString(t1));

        int[] t2 = new int[]{1,2,3};
        obj.duplicateZeros(t2);
        System.out.println(Arrays.toString(t2));
    }
}
