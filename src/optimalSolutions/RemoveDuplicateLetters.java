package optimalSolutions;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLetters {

    public static void main(String[] args) {
        String str = "abcadghabd"; // a b c d g h
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String word) {

        Set<Character> nonDup = new LinkedHashSet<>();
        String result = "";
        for (Character ch : word.toCharArray()) {
            nonDup.add(ch);
        }
        for (Character each : nonDup){
            result += " "+ each;
        }
        return result;
    }
}
