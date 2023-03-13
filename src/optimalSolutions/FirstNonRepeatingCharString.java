package optimalSolutions;

import java.util.Map;
import java.util.TreeMap;

public class FirstNonRepeatingCharString {

    public static void main(String[] args) {

        String str = "Java Developer";
        System.out.println(findFirstNonRepeatingChar(str)); // J
    }

    public static Character findFirstNonRepeatingChar(String str){

        str = str.replace(" ", "");
        Map<Character, Integer> map = new TreeMap<>();

        int count = 0;

        for (char each : str.toCharArray()) {
            if(map.containsKey(each)){
                count = map.get(each);
                map.put(each, count + 1);
            }else{
                map.put(each, 1);
            }
        }
        for (Character ch : str.toCharArray()) {
            if (map.get(ch) == 1){
                return ch;
            }
        }
        return null;
    }
}
