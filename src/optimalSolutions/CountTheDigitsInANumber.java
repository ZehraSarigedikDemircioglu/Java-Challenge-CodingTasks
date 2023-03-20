package optimalSolutions;

public class CountTheDigitsInANumber {

    public static void main(String[] args) {
        int n = 2; // 1
        int n2 = 12; // 2
        int n3 = 123; // 3
        int n4 = 1234; // 4
        int n5 = 12345; // 5
        int n6 = -1; // 1
        int n7 = -12345; // 5

        System.out.println(countDigits(n));
        System.out.println(countDigits(n2));
        System.out.println(countDigits(n3));
        System.out.println(countDigits(n4));
        System.out.println(countDigits(n5));
        System.out.println(countDigits(n6));
        System.out.println(countDigits(n7));

    }

    public static int countDigits(int n) {
        if (n == 0){
            return 1;
        }

        //if a negative number is entered
        if (n < 0){
            n = -n;
        }

        int res = 0;
        while (n != 0) {
            n = n / 10;
            res++;
        }
        return res;
    }
}
