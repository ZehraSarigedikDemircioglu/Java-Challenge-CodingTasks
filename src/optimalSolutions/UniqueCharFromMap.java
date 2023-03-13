package optimalSolutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharFromMap {

    public static void main(String[] args) {

        String str = "bcccaaaf";
        System.out.println(uniqueChar(str)); // {b=1, f=1}
    }

    public static Map<Character, Integer> uniqueChar(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            if (frequency == 1) {
                map.put(each.charAt(0), frequency);
            }
        }
        return map;
    }

}
