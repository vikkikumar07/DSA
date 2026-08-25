package DSA.Array.Questions;
import java.util.Arrays;

// leetcode q. 1 (TWO SUM)

public class L1 {
    // calculate sum two number
    public static int[] TwoSum(int[] nums, int target) {


        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j< nums.length; j++) {
                // sum two number
                int sum  = nums[i]+nums[j];

                // cheak sum equal to target value
                if(sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {};
    }

    //main function
    public static void main(String[] args){

        //create an array
        int[] nums = {2, 4, 6, 9, 13, 43, 12, 6, 8, 14};

        // print a result using a function
        System.out.println(Arrays.toString((TwoSum(nums, 12))));
    }
}