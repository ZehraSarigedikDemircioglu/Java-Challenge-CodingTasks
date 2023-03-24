package collection_map_tasks;

import java.util.*;

public class Map_TimeSeries {

    public static void main(String[] args) {

        Map<Integer, Double> map1 = new HashMap<>();
        map1.put(1, 1.0);
        map1.put(2, 1.5);
        map1.put(3, 2.0);

        Map<Integer, Double> map2 = new HashMap<>();
        map2.put(2, 1.0);
        map2.put(3, 2.5);
        map2.put(5, 1.0);

        System.out.println(timeSeriesSum(map1, map2));


    }

    public static Map<Integer, Double> timeSeriesSum(Map<Integer, Double> map1, Map<Integer, Double> map2) {

        Map<Integer, Double> map = new HashMap<>();
        map.putAll(map1);
        Set<Integer> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());

        boolean flag = true;
        while (flag) {
            map2.keySet().forEach((k) -> {
                if (map.keySet().contains(k)) {
                    map.put(k, map.get(k) + map2.get(k));
                } else {
                    map.put(k, map2.get(k));
                }
            });

            if (keys.size() == map.keySet().size())
                flag = false;
        }
        return map;
    }
}
/*
A time series is represented as a list of time/value pairs. Write a function whose input is two time series and whose output is a new time series of the summation of them.
        Example:
            series A: [(1, 1.0), (2, 1.5), (3, 2.0)]
            series B: [(2, 1.0), (3, 2.5), (5, 1.0)]
        Assuming we have '0' for a time pair that's missing, this is the result:
        output:
            [(1, 1.0), (2, 2.5), (3, 4.5), (5, 1.0)]
*/