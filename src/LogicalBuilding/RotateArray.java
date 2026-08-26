package LogicalBuilding;

import java.util.*;
public class RotateArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];;
        System.out.println("Enter element: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        k= k%n;
        for(int r=0;r<k;r++){
            int end = arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = end;
        }
        System.out.println("Roatated array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
        sc.close();
    }
}
