package Arrays.LogicBuilding;

public class FirstRepeatedElement {
    public static int firstRepeated(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main() {
        int arr[] = {1,2,3,1,5,3};
        int ans = firstRepeated(arr);
        System.out.println(ans);
    }
}
