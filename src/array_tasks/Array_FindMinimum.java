package array_tasks;

import java.util.Arrays;

public class Array_FindMinimum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(minNumber(array));
    }
    public static int minNumber(int[] array){
        return Arrays.stream(array).min().getAsInt();
    }
}
/*
    Write a function that can find the maximum number from an int Array
*/
