package optimalSolutions;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {3, 0, 1};
        int[] arr2 = {0, 1};
        int[] arr3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(arr)); // 2
        System.out.println(missingNumber(arr2)); // 2
        System.out.println(missingNumber(arr3)); // 8

    }

    public static int missingNumber(int[] array) {

        int n = array.length;

        int sum = Arrays.stream(array).sum();

        int sumOfArray = n * (n + 1) / 2;

        if (sum == sumOfArray) {
            return 0;
        } else {
            return sumOfArray - sum;
        }
    }
}
