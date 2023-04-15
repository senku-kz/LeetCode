package Arrays101;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i==j)
                    continue;

                if(arr[i]==2*arr[j])
                    return true;
            }
        }
        return false;
    }

    public static void main (String[] arg) {
        CheckIfNAndItsDoubleExist obj = new CheckIfNAndItsDoubleExist();

        System.out.println(obj.checkIfExist(new int[]{10,2,5,3}));
        System.out.println(obj.checkIfExist(new int[]{3,1,7,11}));
    }
}
