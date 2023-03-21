package number_tasks;

public class Number_ReverseInteger {

    public static void main(String[] args) {

        int number = 9;
        int number2 = 12;
        int number3 = 123;
        int number4 = 1234;
        int number5 = 12345;

        System.out.println(reverse(number));
        System.out.println(reverse(number2));
        System.out.println(reverse(number3));
        System.out.println(reverse(number4));
        System.out.println(reverse(number5));


    }

    public static int reverse(int number) {

        if (number >= 0 && number <= 9) {
            return number;
        }

        int result = 0;

        while (number != 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        return result;
    }
}
