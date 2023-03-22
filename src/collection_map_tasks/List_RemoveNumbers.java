package collection_map_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNumbers {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 100, 200, 300, 400, 500));

        System.out.println(remove(list));
    }

    public static List<Integer> remove(List<Integer> list){

        list.removeIf(num -> num > 100);
        return list;
    }
}

/*
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
*/
