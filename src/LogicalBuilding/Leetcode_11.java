package LogicalBuilding;

public class Leetcode_11 {
    static void main(String[] args) {
        int []height = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println("Maximum water container area: " + result);
    }
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxValue = 0;
        while(start<end) {
            int width = end - start;
            int h = Math.min(height[start], height[end]);
            int area = width * h;
            maxValue = Math.max(maxValue, area);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxValue;
    }
}
