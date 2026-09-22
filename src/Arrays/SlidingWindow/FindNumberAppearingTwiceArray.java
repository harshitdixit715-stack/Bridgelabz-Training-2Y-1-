package Arrays.SlidingWindow;
import java.util.*;
public class FindNumberAppearingTwiceArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Find all Numbers Appearing twice in a Array
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count==2){
                boolean alreadyPrinted = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    alreadyPrinted = true;
                    break;
                  }
               }
            if(!alreadyPrinted){
                System.out.print(arr[i] + " ");
              }
            }
        }
        sc.close();
    }
}
