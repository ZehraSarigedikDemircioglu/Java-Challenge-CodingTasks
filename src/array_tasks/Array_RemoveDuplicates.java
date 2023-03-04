package array_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array_RemoveDuplicates {

    public static void main(String[] args) {

        int[] array = {10, 20, 10, 20, 30};
        System.out.println(Arrays.toString(removeDuplicates(array)));
        System.out.println(Arrays.toString(removeDup(array)));

    }
    public static int[] removeDuplicates(int[] array){

        return Arrays.stream(array).distinct().toArray();
    }
    public static int[] removeDup(int[] array){

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            if(!list.contains(each)){
                list.add(each);
            }
        }
        array = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
/*
Write a function that can remove the duplicates from an array of integers
*/
