package Arrays101;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int mxIdx = 0;
        boolean h=false;
        boolean d=false;

        for(int i=1; i<arr.length; i++){
            if(arr[mxIdx]<arr[i])
                mxIdx = i;
        }

        for(int i=0; i<mxIdx; i++){
            if(arr[i]>=arr[i+1])
                return false;
            h=true;
        }

        for(int i=mxIdx+1; i<arr.length; i++){
            if(arr[i-1]<=arr[i])
                return false;
            d=true;
        }
        return h&&d;
    }

    public static void main (String[] arg) {
        ValidMountainArray obj = new ValidMountainArray();

        System.out.println(obj.validMountainArray(new int[]{2,1}));
        System.out.println(obj.validMountainArray(new int[]{3,5,5}));
        System.out.println(obj.validMountainArray(new int[]{0,3,2,1}));
    }
}
