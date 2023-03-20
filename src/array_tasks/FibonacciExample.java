package array_tasks;

public class FibonacciExample {

    public static void main(String[] args) {

        System.out.println(nthFibonacci(9));
        System.out.println(fibonacci(9));
    }

    public static int nthFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static int fibonacci(int num) {

        int result = 0;
        int n1 = 0;
        int n2 = 1;

        for (int i = 1; i < num; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }

        return result;
    }
}
