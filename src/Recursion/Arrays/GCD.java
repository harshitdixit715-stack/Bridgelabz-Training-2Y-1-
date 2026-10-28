package Recursion.Arrays;

public class GCD {
    public static int gcd( int a, int b){
        if(b==0){
            return a;
        }else{                          // uclidus algorith
            return gcd(b,a%b);
        }
    }
    public static int lcm(int a, int b){
        return (a/gcd(a,b))*b;
    }
    public static void main(String[] args) {
        System.out.println(gcd(12,18));
        System.out.println(lcm(12,16));
    }
}
