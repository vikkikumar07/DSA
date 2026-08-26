package Array.Questions;

// Given an integer array nums and an integer val, 
// remove all occurrences of val in nums in-place. 
// The order of the elements may be changed. Then return 
// the number of elements in nums which are not equal to val.

// Consider the number of elements in nums which are 
// not equal to val be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the
//  elements which are not equal to val. The remaining elements of nums are not
//  important as well as the size of nums.
// Return k.

public class L27 {
    // target value remove in array
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i<nums.length; i++) {

            //ex. val = 2, than [0,2] == val but [1,3,4] != val
            // return 3

            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 2, 6, 4};

        int result = removeElement(nums, 2);

        System.out.println(result);
        

    }
}
