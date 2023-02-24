package array_tasks;

import java.util.Arrays;

public class Array_CountFrequencies {

    public static void main(String[] args) {
        String[] array = {"a","a", "b","b","c","c","c"};
        String[] array2 = {"a"};
        String[] array3 = {"a","b","b","b","b","b","b","b","b","b","b","b","b"};

        System.out.println(arrayCountFrequency(array));
        System.out.println(arrayCountFrequency(array2));
        System.out.println(arrayCountFrequency(array3));
    }

    public static String arrayCountFrequency(String[] arr){
        String str = "";

        for (String each : arr) {
            if(!str.contains(each)){
                int count = 0;

                for (String element : arr) {
                    if (each.equals(element)) {
                        count++;
                    }
                }
                if(count == 1){
                    str+= each;
                }else{
                    str += each + count;
                }
            }
        }
        return "str: " + str + " length: " +str.length();
    }
}
 /*
    Example 1:
        Input: chars = ["a","a", "b","b","c","c","c"]
        Output: Return 6, and the first 6 characters of the input array should be: ["a", "2", "b","2","c","3"]
            Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
    Example 2:
        Input: chars = ["a"]
        Output: Return 1, and the first character of the input array should be: ["a"]
        Explanation: The only group is "a", which remains uncompressed since it's a single character.
    Example 3:
        Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
        Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
        Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
     */
