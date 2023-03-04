package array_tasks;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 4, 0, 2, 3, 1, 0};
        System.out.println(Arrays.toString(moveZerosToTheEnd(arr)));
    }

    public static int[] moveZerosToTheEnd(int[] array){

        int[] result = new int[array.length];

        int count = 0;
        for (int each : array) {
            if(each != 0){
                result[count++] = each;
            }
        }
        return result;
    }
}
 /*
write a program that can move all the zeros to the end of an array
 */
