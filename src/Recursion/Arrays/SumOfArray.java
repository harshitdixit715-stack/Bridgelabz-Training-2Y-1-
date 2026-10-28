package Recursion.Arrays;

public class SumOfArray {
    public static int sum (int arr[] , int index){
        if(index == arr.length){
            return 0;
        }
        int add = sum(arr,index+1);
        return arr[index]+add;
    }
    static void main(String[] args) {
        int arr[] = {1,2,3,56,3,6,4,3,6};
        System.out.println(sum(arr,0));
    }
}
