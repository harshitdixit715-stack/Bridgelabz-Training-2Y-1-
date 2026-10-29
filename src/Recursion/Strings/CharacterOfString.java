package Recursion.Strings;

public class CharacterOfString {
    public static void printCharcter(String s, int index ){
        if(index == s.length()){
            return;
        }
        System.out.println(s.charAt(index));
        printCharcter(s,index+1);
    }

    public static void main(String[] args) {
        String s = "Harshit";
        printCharcter(s,0);
    }
}
