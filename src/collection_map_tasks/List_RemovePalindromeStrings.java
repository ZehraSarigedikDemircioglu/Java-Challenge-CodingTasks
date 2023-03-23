package collection_map_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemovePalindromeStrings {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Apa", "Car", "Tekket", "Java"));
        System.out.println(removePalindrome(list));
    }

    public static List<String> removePalindrome(List<String> list) {

        list.removeIf(word -> isPalindrome(word));
        return list;
    }

    public static boolean isPalindrome(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed.equalsIgnoreCase(str);
    }
}
/*
remove palindrome strings from a List of String
*/
