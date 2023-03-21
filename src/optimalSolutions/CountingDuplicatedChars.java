package optimalSolutions;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountingDuplicatedChars {

    public static void main(String[] args) {

        System.out.println(getNumber("abcde")); // 0
        System.out.println(getNumber("aabBcdE")); // 2 (a and b)
        System.out.println(getNumber("aA11")); // 2 (a and 1)
        System.out.println(getNumber("invisibility")); // 1 (i)
        System.out.println(getNumber("invisibilities")); // 2 (i and s)
    }
    public static int getNumber(String str) {

        Map<Character, Integer> charMap = new LinkedHashMap<>();
        char[] arr = str.toLowerCase().toCharArray();

        for (char each : arr) {
            charMap.put(each, charMap.getOrDefault(each, 0) + 1);
        }

        charMap.entrySet().removeIf(p -> p.getValue() == 1);
        return charMap.size();
    }
}
