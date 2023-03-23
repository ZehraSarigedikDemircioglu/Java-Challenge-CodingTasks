package collection_map_tasks;

import java.util.HashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {

    public static void main(String[] args) {

        frequencyOfEachChar("Java Developer");
    }

    public static void frequencyOfEachChar(String str){

        Map<Character, Integer> map = new HashMap<>();

        for (char each : str.toCharArray()) {
            if(map.containsKey(each)){
                map.put(each, map.get(each) + 1);
            }else{
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }
}
/*
Write a method that prints the frequency of each character from a String
*/
