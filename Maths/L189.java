package Maths;

    //Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
public class L189 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] num , int left, int right) {
        while(left < right) {
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
        }
    }

    public static void mian(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotate(arr,3);
        System.out.println(arr);
    }
}
