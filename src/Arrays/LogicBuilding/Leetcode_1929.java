package Arrays.LogicBuilding;

import java.util.Arrays;

public class Leetcode_1929 {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int index = 0;
        int ans[] = new int[2*n];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            index++;
        }
        for(int i=0;i<nums.length;i++){
            ans[index] = nums[i];
            index++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,2,1};
        int result[] = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}
