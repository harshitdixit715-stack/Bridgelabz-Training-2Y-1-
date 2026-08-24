package Arrays;

public class Methods {
    static int mul(int a, int b) {
        return a*b;
    }
    static int sub(int a, int b) {
        return a-b;
    }
    static int add(int a , int b) {
        return a+b;
    }
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println("Addition of two numbers :- " + add(a,b));
        System.out.println("Subtraction of two numbers :- " + sub(a,b));
        System.out.println("multiple of two numbers :- " + mul(a,b));
    }
}
