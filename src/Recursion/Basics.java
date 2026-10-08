package Recursion;

public class Basics {
    static void method1() {
        int x=1;
        method2();

    }
    static void method2() {
        int x = 2;
        method3();
    }
    static void method3() {
        int x =3;
        System.out.println(x);
    }
    static void main(String[] args) {
        method1();
    }
}
