package Recursion.Arrays;

public class PrintArray {
    public static void printDec(int arr[] , int index){
        if(index == arr.length){
            return ;
        }
        printDec(arr,index+1);
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        int arr [] = {1,23,4,45,23,2};
        printDec(arr,0);
    }
}
