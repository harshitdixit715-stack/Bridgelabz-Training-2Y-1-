package Arrays.LogicBuilding;

import java.util.Arrays;

public class ThirdMaxElement{
    public static int thirdElement(int[] nums) {
        int count = 1;
        Arrays.sort(nums);
        for (int i=nums.length-1;i>0; i--) {
            if (nums[i] != nums[i - 1]) {
                count++;
            }
            if (count == 3) {
                return nums[i - 1];
            }
        }
        return nums[nums.length - 1];
    }

    static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(thirdElement(nums));
    }
}
