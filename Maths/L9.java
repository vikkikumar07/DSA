package Maths;
import java.util.*;
public class L9 {
    public static boolean isPalindrome(int x) {

        // -121 is invlide 
        if(x < 0) {
            return false;
        }
        int original = x;
        int revers = 0;

        // x greatser than 0 continue loop run
        while(x > 0) {
            // x % 10 == n = 121, digit 1 (last digit find to use )
            int digit = x % 10;

            //12*10+1
            revers = revers * 10 + digit;

            //x / 10 than 1/10 = 0 stop loop
            x = x / 10;
        }
        
        return original == revers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();

        boolean result = isPalindrome(x);
        if(result) {
            System.out.println("Number is a Palindrome.");
        } else {
            System.out.println("Number is not Palindrome.");
        }
        sc.close();
    }
}