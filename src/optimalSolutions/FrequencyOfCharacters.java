package optimalSolutions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "JavaDeveloper";
        frequencyOfCharacters(str); // {J=1, a=2, v=2, D=1, e=3, l=1, o=1, p=1, r=1}
    }

    public static void frequencyOfCharacters(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }
}
