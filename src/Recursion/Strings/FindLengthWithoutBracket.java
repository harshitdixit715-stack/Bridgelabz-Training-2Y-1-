package Recursion.Strings;

public class FindLengthWithoutBracket {
        public static void printChars(String str) {
            // Base Case
            if (str.equals("")) {
                return;
            }
            System.out.println(str.charAt(0));
            // Recursive Call
            printChars(str.substring(1));
        }
        public static void main(String[] args) {
            printChars("HELLO");
        }
    }
