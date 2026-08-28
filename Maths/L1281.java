package Maths;
//Question Intro
// n = 123 , return (product 1 * 2 * 3 = 6) - (sum 1 + 2 + 3 = 6) = 0

import java.util.Scanner;
public class L1281 {

    public static int subtractProductAndSum(int n) {
        // variable for calculate product
        int product = 1;
        // variable for calculate sum
        int sum = 0;

        // n == 0
        while(0 < n) {

            //find last digit (123 % 10 = 3)
            int digit = n % 10;

            product *= digit;
            sum += digit;

            // remove last digit (123/10 = 12.3 than int hold 12)
            n = n / 10;
        }
        return product - sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate a number's digit of diff's product and sum");
        System.out.println("Enter a Number");
        int n = input.nextInt();

        int result = subtractProductAndSum(n);
        System.out.println(result);
        input.close();

    }
}