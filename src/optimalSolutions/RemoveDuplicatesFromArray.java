package optimalSolutions;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int[] array = {10, 10, 20, 20, 30};
        int[] nums = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicatesLength(array)); // 3
        System.out.println(removeDuplicatesLength(nums)); // 2
        System.out.println(removeDuplicatesLength(nums2)); // 5
        System.out.println(removeDuplicate(array)); // 3
        System.out.println(removeDuplicate(nums)); // 2
        System.out.println(removeDuplicate(nums2)); // 5


    }
    public static int removeDuplicatesLength(int[] array) {

        return Arrays.stream(array).distinct().toArray().length;
    }

    public static int removeDuplicate(int[] array) {

        // must be sorted array

        int j = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                array[j] = array[i];
                j++;
            }
        }
        return j;
    }
}
