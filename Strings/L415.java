package Strings;

public class L415 {
    public static String addStrings(String num1, String num2) {
        // string length i|j
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {

            // find last character convert int
            int a = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int b = (j >= 0) ? num2.charAt(j) - '0' : 0;

            // add
            int sum = a + b + carry;

            // insert ans string
            ans.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }

        // ans reverse than convert to string and return
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String n1 = "233";
        String n2 = "903";
        System.out.println(addStrings(n1, n2));
    }
}
