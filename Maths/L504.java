package Maths;

public class L504 {
    public static String convertToBase7(int num) {
        // base case
        if (num == 0) {
            return "0";
        }

        // cheak nagetive number
        boolean nagetive = num < 0;

        // remove nagetive in num
        num = Math.abs(num);

        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.append(num % 7);
            num = num / 7;
        }

        // nagetive is true than add nagetive
        if (nagetive) {
            sb.append("-");
        }

        // return reverse number in string
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(884));
    }
}
