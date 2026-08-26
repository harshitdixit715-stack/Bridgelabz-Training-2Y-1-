package LogicalBuilding;

import java.util.*;
public class Palindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        String result = new StringBuilder(str).reverse().toString();
        if(result.equals(str)){
            System.out.println(str+" is Palindrome");
        }else{
            System.out.println(str+ " is not Palindrome");
        }
    }
}
