package collection_map_tasks;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Map_TimeSeries {

    public static void main(String[] args) {


    }

    public static Map<Integer, Double> timeSeriesSum(Map<Integer, Double> map) {

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