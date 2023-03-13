package optimalSolutions;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        int[] nums2 = {0};

        System.out.println(Arrays.toString(moveZerosToTheEnd(nums))); // [1, 3, 12, 0, 0]
        System.out.println(Arrays.toString(moveZerosToTheEnd(nums2))); // [0]

    }

    public static int[] moveZerosToTheEnd(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] !=0){
                array[count++] = array[i];
            }
        }

        while (count < array.length) {
            array[count++] = 0;
        }
        return array;
    }
}
