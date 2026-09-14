package Maths;

public class L3871 {
    public static long countCommas(long n) {
        long cur = 1000;
        long res = 0;

        while (cur <= n) {
            res += n - cur + 1;
            cur *= 1000;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(countCommas(1002));
    }
}
