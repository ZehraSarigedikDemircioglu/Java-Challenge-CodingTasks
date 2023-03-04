package array_tasks;

public class Array_FirstDuplicatedElement2 {

    public static void main(String[] args) {

        String[] array = {"abc", "abc", "d", "e", "e"};

        System.out.println(firstDupString(array));

    }

    public static String firstDupString(String[] array) {

        String result = "";


        for (String each : array) {
            int count = 0;

            for (String element : array) {
                if (element.equals(each)) {
                    count++;
                }
            }
            if (count > 1) {
                result += each;
                break;
            }
        }
        return result;
    }

}
/*
    write a program that can find the first duplicated element from the array
*/
