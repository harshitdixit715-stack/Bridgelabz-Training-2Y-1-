package LogicalBuilding;

import java.util.*;
public class MaxArea {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []height =  new int[n];
        System.out.println("Enter height: ");
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        int start =0;
        int end = n-1;
        int maxValue =0;
        while(start<end){
            int width = end-start;
            int h = Math.min(height[start],height[end]);
            int area = width*h;
            maxValue = Math.max(maxValue,area);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        System.out.println("Maximun Water: "+ maxValue);
        sc.close();
    }
}
