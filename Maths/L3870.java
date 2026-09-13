package Maths;

public class L3870 {
    // count comman in range
    public static int countCommas(int n) {
        return Math.max(n - 999, 0);
    }

    public static void main(String[] args) {
        System.out.println(countCommas(1002));
    }
}