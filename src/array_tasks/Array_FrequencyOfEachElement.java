package array_tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array_FrequencyOfEachElement {

    public static void main(String[] args) {
        String[] array = {"Apple","Banana","Apple","Cherry"};
        System.out.println(frequencyOfEachElement(array));
        System.out.println(frequencyOfEachElement2(array));
    }

    public static Map<String, Integer> frequencyOfEachElement(String[] array){
        Map<String, Integer> result = new HashMap<>();

        for (String each : array) {
            int frequency = 0;

            for (String element : array) {
                  if(each.equals(element)){
                      frequency++;
                  }
            }
            result.put(each, frequency);
        }
        return result;
    }

    public static Map<String, Integer> frequencyOfEachElement2(String[] array) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(array).distinct()
                .forEach(e -> map.put(e, (int)Arrays.stream(array).filter(p -> p.equals(e)).count()));
        return map;
    }
}
/*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
*/
