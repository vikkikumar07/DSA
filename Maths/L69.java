package Maths;

    // use while loop || long data type || newton's method || maths ||

    import java.util.Scanner;
public class L69 {
    public static int mySqrt(int x) {
        // let x = 10
        if(x == 0) {
            return 0;
        }
        // n = x => n = 10
        long n = x;

        // n*n => 10 * 10 => 100 > 10 || n > 10
        while(n *n > x) {

            // newton's method 
            n = (n + x/n)/2;
            // n = 10 || (10 + 10/10)/2 => 5
            // n = 5 || (5 + 10/5)/2 => 3
            // n = 3 || n*n > x => 3 * 3 > 10 => false loop stop

        }
        // long n ko int me convert kr ans return;
        return (int)n;
    }

    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int x = sc.nextInt();

       int result = mySqrt(x);
       System.out.println(result);
       sc.close();
    }
}
