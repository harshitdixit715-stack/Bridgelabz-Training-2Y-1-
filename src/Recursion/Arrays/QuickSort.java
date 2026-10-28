package Recursion.Arrays;

public class QuickSort {
    public static void quickSort(int arr[], int low , int high){
        if(low>=high){
            return ;
        }
        int pivot = partition(arr, low, high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
    }
    public static int partition(int [] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = {4,3,1,2,5,9,7,10,6};
        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
