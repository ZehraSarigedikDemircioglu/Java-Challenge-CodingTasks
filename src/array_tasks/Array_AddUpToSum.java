package array_tasks;

import java.util.HashMap;
import java.util.Map;

public class Array_AddUpToSum {

    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int[] arr2 = {8, 6, 2, 5, 3, 1};
        System.out.println(sum(arr, 10));
        System.out.println(sum(arr2, 10));
        System.out.println(sum(arr, 7));
        System.out.println(sum(arr2, 7));
    }
    public static Map<Integer, Integer> sum(int[] array, int goalNumber){
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] + array[j] == goalNumber){
                    result.put(array[i], array[j]);
                }
            }
        }
        return result;
    }
}
/*
     given an int[] 'arr' and another int 'sum',
     Write a function which can find a pair of ints in 'arr' that add up to 'sum'.
        Example:
            arr = [8, 7, 2, 5, 3, 1]
            sum = 10
            Output:
                {8=2, 7=3}
*/
