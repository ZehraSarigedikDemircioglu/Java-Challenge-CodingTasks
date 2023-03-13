package optimalSolutions;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharString {

    public static void main(String[] args) {

        String str = "Java Developer";

        System.out.println(firstRepeatingChar(str)); // a

    }

    public static Character firstRepeatingChar(String str) {

        Set<Character> chars = new HashSet<>();

        for (char each : str.toCharArray()) {
            if(!chars.add(each)){
                return each;
            }
        }
        return null;
    }
}
