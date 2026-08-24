package Arrays;

public class BuildArray {
    public static int[] buildArray(int []nums){
        int ans [] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        int result[] = buildArray(nums);
        printArray(result);
    }
}
