package optimalSolutions;

public class CalculateXToPowerN {

    public static void main(String[] args) {

        System.out.println(power(2, 3)); // 8.0
        System.out.println(power(-2, 3)); // -8.0
        System.out.println(power(-2, 2)); // 4.0
        System.out.println(power(1.10, 3)); // 1.3310
    }

    public static double power(double x, int n) {
        if(n == 0){
            return 1.0;
        }

        double xpower = power(x,n-1); //x power n-1 (xpower)

        return x * xpower;
    }
}
