package optimalSolutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int arr[] = {2, 3, 5, 8, 9, 10, 11};
        System.out.println(Arrays.toString(twoSum(arr, 5))); // [0, 1]
        System.out.println(Arrays.toString(twoSum(arr, 20))); // [4, 6]
        System.out.println(Arrays.toString(twoSum(arr, 25))); // []
    }

    public static int[] twoSum(int[] array, int targetValue) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int potentialMatch = targetValue - array[i];
            if (map.containsKey(potentialMatch)) {
                return new int[]{map.get(potentialMatch), i};
            } else {
                map.put(array[i], i);
            }
        }
        return new int[]{};
    }
}
