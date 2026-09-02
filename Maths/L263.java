package Maths;
public class L263 {

    // ugly => 2, 3, 5 is divided number is last number 1 is true
    // 
    public static boolean isUgly(int n) {
       return cheakugly(n);
    }

    public static boolean cheakugly(int n) {
        // cheak negative number
        if(n <= 0) {
            return false;
        }
        if(n == 1) {
            return true;
        }
        if(n % 2 == 0 ) {
            n = n/ 2;
           return cheakugly(n);
        }
        if(n % 3 == 0 ) {
            n = n/ 3;
           return cheakugly(n);
        }
        if(n % 5 == 0 ) {
            n = n/ 5;
           return cheakugly(n);
        }
        return false;
    }

    public static void mian(String[] args) {
        int n = 18;
        boolean result = isUgly(n);
        System.out.println(result);

    }
}