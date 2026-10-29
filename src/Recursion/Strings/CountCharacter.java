package Recursion.Strings;

public class CountCharacter {

    public static int countChar(String s, char ch, int index){
        if(index == s.length()){
            return 0;
        }
        int count = countChar(s,ch,index+1);
        if(s.charAt(index) == ch){
            return 1+count;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "apple";
        char ch = 'p';
        System.out.println(countChar(s,ch,0));
    }
}
