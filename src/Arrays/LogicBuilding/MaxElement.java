package Arrays.LogicBuilding;

public class MaxElement {
    public static int maxValue(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int secondMax(int arr[]) {
        int max = maxValue(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return maxValue(arr);
    }
    static void main(String[] args) {
        int arr[] = {7,5,3,2,4,7};
        System.out.println("This is a Max Element: "+ maxValue(arr));
        System.out.println("this is a Second Maximum Element : "+ secondMax(arr));
    }
}
