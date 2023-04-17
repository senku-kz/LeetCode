package ArrayAndString;

import java.util.Arrays;

/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
The tests are generated such that there is exactly one solution. You may not use the same element twice.
Your solution must use only constant extra space.
*/

public class TwoSum2InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        for (int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if((numbers[i] + numbers[j]) == target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[2];
    }

    public static void main (String[] arg) {
        TwoSum2InputArrayIsSorted obj = new TwoSum2InputArrayIsSorted();

        System.out.println(Arrays.toString(obj.twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(obj.twoSum(new int[]{2,3,4}, 6)));
        System.out.println(Arrays.toString(obj.twoSum(new int[]{-1,0}, -1)));
    }
}
