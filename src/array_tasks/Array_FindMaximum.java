package array_tasks;

import java.util.Arrays;
import java.util.OptionalInt;

public class Array_FindMaximum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(maxNUmber(array));
        System.out.println(maxNumber2(array));
    }

    public static int maxNUmber(int[] array){
        int max = Integer.MIN_VALUE;

        for (int each : array) {
            if(each > max){
                max = each;
            }
        }
        return max;
    }
    public static int maxNumber2(int[] array){
        return Arrays.stream(array).max().getAsInt();
    }
}
/*
        Write a function that can find the maximum number from an int Array
*/

