package Arrays.LogicBuilding;

import java.util.Arrays;

public class Leetcode_977 {
    public static int[] sortedSquare(int[]nums){
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        int result[] = sortedSquare(nums);
        System.out.println(Arrays.toString(result));
    }
}
