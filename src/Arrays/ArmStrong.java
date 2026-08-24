package Arrays;

public class ArmStrong {
    public static int count(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count(n);
    }
    public static boolean isArmStrong(int n){
        int original = n;
        int d = n%10;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += (int)Math.pow(rem,d);
            n = n/10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmStrong(n));
    }
}
