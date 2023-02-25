package array_tasks;

import java.util.Arrays;
import java.util.OptionalInt;

public class Array_FindMaximum {

    public static void main(String[] args) {

        int[] array = {10, 35, 21, 60, -12};

        System.out.println(maxNUmber(array));
        System.out.println(maxNumber2(array)); // Stream1
        System.out.println(maxNumber3(array)); //Stream2
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

    public static int maxNumber3(int[] array){
        return Arrays.stream(array).reduce(Integer::max).getAsInt();
    }
}
/*
        Write a function that can find the maximum number from an int Array
*/

