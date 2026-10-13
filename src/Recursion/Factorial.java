package Recursion;

public class Factorial {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int small = fact(n-1);
        return n*small;
    }

    public static void main(String[] args) {
        fact(5);
        System.out.println(fact(5));
    }
}
