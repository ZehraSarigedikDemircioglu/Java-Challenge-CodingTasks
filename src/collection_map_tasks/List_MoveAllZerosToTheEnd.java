package collection_map_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_MoveAllZerosToTheEnd {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 5));

        System.out.println(removeAllZerosToTheEnd(list));
    }

    public static List<Integer> removeAllZerosToTheEnd(List<Integer> list){

        int currentSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();

        int zeros = currentSize - newSize;

        for (int i = 0; i < zeros; i++) {
            list.add(0);
        }
        return list;
    }
}


/*
write a program that can move all the zeros to the end of the List of integers
*/
