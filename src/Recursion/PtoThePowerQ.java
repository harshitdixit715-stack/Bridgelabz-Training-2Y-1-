package Recursion;

public class PtoThePowerQ {
    public static int Power(int p,int q ){
        if(q==0){
            return 1;
        }
        if(p==1){
            return 0;
        }
        int basecase = Power(p,q-1);
        int ptoTheq = p*basecase;
        return ptoTheq;
    }

    static void main(String[] args) {
        int p=2, q=4;
        int ans = Power(p,q);
        System.out.println(ans);

    }
}











