package Array.Questions;

public class L26 {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i =1 ; i< nums.length; i++) {

            //count unique element
            if(nums[i] != nums[k-1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        System.out.println(removeDuplicates(nums));
        // OUTPUT
        // unique element in a array 1 & 2
        // [1, 2] == 2
    }
    
}
