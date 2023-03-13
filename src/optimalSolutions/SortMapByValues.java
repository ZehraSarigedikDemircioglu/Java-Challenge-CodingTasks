package optimalSolutions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValues {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Sarah", 1);
        map.put("Mary", 3);
        map.put("Mike", 2);

        System.out.println(sortByValues(map)); // {Sarah=1, Mike=2, Mary=3}
    }

    public static Map<String, Integer> sortByValues(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        return map;
    }
}
