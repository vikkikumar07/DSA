package Array.Questions;

public class L414 {

    public static int thirdMax(int[] nums) {

        long frist = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long thrid = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == frist || num == second || num == thrid) {
                continue;
            }

            if (num > frist) {
                thrid = second;
                second = frist;
                frist = num;
            } else if (num > second) {
                thrid = second;
                second = num;
            } else if (num > thrid) {
                thrid = num;
            }
        }

        if (thrid == Long.MIN_VALUE) {
            return (int) frist;
        }

        return (int) thrid;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 1 };

        System.out.println(thirdMax(nums));

    }
}