package optimalSolutions;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWords {

    public static void main(String[] args) {

        String str = "This is an example of example"; // {thisisanexampleofexample=1}
        String str2 = " This     is an example!  of Example"; // {thisisanexampleofexample=1}
        System.out.println(frequencyOfWords(str));
        System.out.println(frequencyOfWords(str2));
        System.out.println(withStream(str));
        System.out.println(withStream(str2));
    }

    public static Map<String, Integer> frequencyOfWords(String sentence) {

        if (sentence == null){
            return null;
        }
        Map<String, Integer> mapOfWords = new HashMap<>(); //space complexity O(n)

        sentence = sentence.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String[] words = sentence.split(" ");

        for (String word : words) {  //time O(n)
            mapOfWords.put(word, mapOfWords.getOrDefault(word, 0) + 1);
        }
        return mapOfWords;
    }
    public static Map<String, Long> withStream(String str){

        if (str == null){
            return null;
        }

        return Arrays.stream(str.trim().toLowerCase().split("[^A-Za-z]+"))
                // .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
    }
}
