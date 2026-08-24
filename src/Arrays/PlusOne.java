package Arrays;

public class PlusOne {
    public static int [] plusOne(int []digit){
        for(int i=digit.length-1;i>=0;i--){
            if(digit[i]<9){
                digit[i]++;
                return digit;
            }
            digit[i] = 0;
        }
        int[] ans = new int[digit.length + 1];
        ans[0] = 1;

        return ans;
    }
    public static void printArray(int [] arr){
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    static void main(String[] args) {
        int [] digit = {1,2,3};
        int [] result = plusOne(digit);
        printArray(digit);
    }
}
