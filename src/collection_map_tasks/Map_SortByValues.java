package collection_map_tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Map_SortByValues {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 5);
        map.put("C", 2);
        map.put("B", 3);
        map.put("E", 4);
        map.put("D", 1);

        System.out.println(sortMapByValues(map));
        sortMapByValues2(map);

    }

    public static Map<String, Integer> sortMapByValues(Map<String, Integer> map) {

//        map.entrySet().stream().map(p -> p.getValue()).sorted().collect(Collectors.toList());

        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        list.addAll(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }

    public static void sortMapByValues2(Map<String, Integer> map) {

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}

/*
Write a method that can sort the map by values
*/
