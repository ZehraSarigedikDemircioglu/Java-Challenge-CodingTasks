package array_tasks;

import java.util.Arrays;

public class Array_SecondLargestNumber {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4};
        System.out.println(secondLargestNumber(arr));
        System.out.println(secondLargestNumber2(arr));
    }

    public static int secondLargestNumber(int[] arr) {

        return Arrays.stream(arr).filter(p -> p != Arrays.stream(arr).max().getAsInt()).max().getAsInt();
    }

    public static int secondLargestNumber2(int[] arr) {

        int max1 = arr[0];
        int max2 = arr[1];
        for (int each : arr) {
            if (each > max1) {
                max2 = max1;
                max1 = each;
            } else if(each > max2){
                max2 = each;
            }
        }
        return max2;
    }
}
