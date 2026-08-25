package DSA.Array.Questions;
import java.util.Arrays;
public class L1 {
    public static int[] TwoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j< nums.length; j++) {
                int sum  = nums[i]+nums[j];
                if(sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int[] nums = {2, 4, 6, 9, 13, 43, 12, 6, 8, 14};
        System.out.println(Arrays.toString((TwoSum(nums, 12))));
    }
}