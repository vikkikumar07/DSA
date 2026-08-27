package Maths;
public class L2119 {
    public static boolean isSameAfterReversals(int num) {
        int reverse = 0;

        // cheack a num 0 than reverse 0 return true
        if(num == 0) {
            return true;
        }
        while(num != 0) {
            int digit = num % 10;

            // cheak a last digit a 0 than reverse false
            if(reverse == 0 && digit == 0) {
                return false;
            }
            num = num / 10;

            reverse = reverse * 10 + digit;
        }

        return true;
    }
    public static void main(String[] args) {
        int num = 1200;
        boolean ans = isSameAfterReversals(num);
        System.out.println(ans);

    }
}