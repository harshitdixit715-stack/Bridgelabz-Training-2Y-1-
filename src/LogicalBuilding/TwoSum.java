package LogicalBuilding;

import java.util.*;
public class TwoSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("enter element");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;i<n;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("Indicate: "+ i + " " + j);
                    System.out.println("Values: "+ arr[i]+"+"+arr[j]);
                    return ;
                }
            }
        }
        System.out.println("No pair found");
        sc.close();
    }
}
