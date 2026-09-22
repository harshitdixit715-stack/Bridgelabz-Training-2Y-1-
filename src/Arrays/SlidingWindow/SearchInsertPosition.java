package Arrays.SlidingWindow;
import java.util.*;
public class SearchInsertPosition {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        int index =0;
        while(index<n && arr[index]<target ){
            index++;
        }
        System.out.println(index);
        sc.close();
    }
}
