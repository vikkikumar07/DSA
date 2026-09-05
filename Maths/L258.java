package Maths;

public class L258 {

    public static int addDigits(int num) {
        int sum = sumDigit(num);
        while (sum >= 10) {
            sum = sumDigit(sum);
        }
        return sum;
    }

    private static int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 232;
        System.out.println(addDigits(n));
    }
}
