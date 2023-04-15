package Arrays101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<Integer>();
        HashSet<Integer> numbers = new HashSet<Integer>();

        for(int i:nums){
            numbers.add(i);
        }

        for (int i=1; i<=nums.length; i++){
            if(!numbers.contains(i)){
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }

    public static void main (String[] arg) {
        FindAllNumbersDisappearedInAnArray obj = new FindAllNumbersDisappearedInAnArray();

        System.out.println(obj.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(obj.findDisappearedNumbers(new int[]{1,1}));
    }
}
