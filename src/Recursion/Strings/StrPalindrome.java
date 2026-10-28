package Recursion.Strings;

public class StrPalindrome {
    public static boolean Palindrome(String str, int left, int right){
        if(left>=right){
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return Palindrome(str, left + 1, right - 1);
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(Palindrome(str,0,str.length()-1));
    }
}
