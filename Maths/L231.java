package Maths;

public class L231 {
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }

        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        int n = 64;
        boolean ans = isPowerOfTwo(n);
        System.out.println(ans);
    }
}
