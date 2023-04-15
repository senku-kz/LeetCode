package Arrays101;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int mx;
        for(int i=0; i<arr.length-1; i++){
            mx = arr[i+1];
            for(int j=i+1; j<arr.length; j++){
                if(mx<arr[j])
                    mx = arr[j];
            }
            arr[i] = mx;
        }
        arr[arr.length-1] = -1;
        return arr;
    }

    public static void main (String[] arg) {
        ReplaceElementsWithGreatestElementOnRightSide obj = new ReplaceElementsWithGreatestElementOnRightSide();

        System.out.println(Arrays.toString(obj.replaceElements(new int[]{17,18,5,4,6,1})));
        System.out.println(Arrays.toString(obj.replaceElements(new int[]{400})));
    }
}
