package Maths;

public class L326 {

    public static boolean isPowerOfThree(int n) {

        while (n > 0 && n % 3 == 0) {
            n = n / 3;
        }

        return n == 1;
    }

    public static void mian(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));

    }

}