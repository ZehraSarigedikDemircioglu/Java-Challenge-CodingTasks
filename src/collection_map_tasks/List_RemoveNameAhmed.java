package collection_map_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List_RemoveNameAhmed {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        System.out.println(removeAhmed(list));
        System.out.println(removeAhmed2(list));
        System.out.println(removeAhmed3(list));
    }

    public static List<String> removeAhmed(List<String> list) {

        list.removeAll(Arrays.asList("Ahmed"));
        return list;
    }
    public static List<String> removeAhmed2(List<String> list) {

        return list.stream().filter(name -> !name.equals("Ahmed")).collect(Collectors.toList());
    }
    public static List<String> removeAhmed3(List<String> list) {

        list.removeIf(name -> name.equals("Ahmed"));
        return list;
    }
}
/*
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */
