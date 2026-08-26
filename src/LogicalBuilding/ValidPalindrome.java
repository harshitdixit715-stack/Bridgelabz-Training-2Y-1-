package LogicalBuilding;

import java.util.*;
public class ValidPalindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int left=0;
        int right = s.length()-1;
        boolean isPalindrome = true;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("Valid Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}
