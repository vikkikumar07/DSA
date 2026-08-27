package Maths;

public class L7 {

    public static int reverse(int x) {
        int reverse = 0;

        // x == 0 than loop exit 
        while(0 != x) {

            // find last element
            int digit  = x % 10;
            x = x /10;

            // cheak overflow gaven size
            if (reverse > Integer.MAX_VALUE / 10 ||
                (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (reverse < Integer.MIN_VALUE / 10 ||
                (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reverse = reverse * 10 + digit;

        }

       return reverse;
       
    }

    public static void main(String[] args) {
        int x = 2344;
        int ans = reverse(x);
        System.out.println(ans);
    }
    
}
