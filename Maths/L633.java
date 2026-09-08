package Maths;

public class L633 {

    // c = a^2 + b^2 => true : false

    public static boolean judgeSquareSum(int c) {
        // long data type use int overflow ho sakta hai
        long left = 0;
        long right = (long) Math.sqrt(c);

        while (left <= right) {
            // c = a^2 + b^2
            long sum = left * left + right * right;

            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
    }
}
