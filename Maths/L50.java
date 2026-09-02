package Maths;

public class L50 {
    public static double myPow(double x, int n) {
        long N = n;  // convert to long to handle Integer.MIN_VALUE
        
        // when n is negative
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;

        while (N > 0) {
            if (N % 2 == 1) {
                result *= x;
            }
            x *= x;
            N /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        double x = 14.00;
        double result = myPow(x,n);
        System.out.println(result);

    }
}
