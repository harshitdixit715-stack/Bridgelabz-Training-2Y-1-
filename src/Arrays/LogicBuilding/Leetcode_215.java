package Arrays.LogicBuilding;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_215 {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value of k: ");
        int k = sc.nextInt();
        int nums[] = {3,2,1,5,6,4};
        int result = findKthLargest(nums,k);
        System.out.println("The " + k + "-th largest element is: " + result);
    }
}
