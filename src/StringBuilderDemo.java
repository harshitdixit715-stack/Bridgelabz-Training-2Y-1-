public class StringBuilderDemo {
    static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Harshit");
        System.out.println("to add append method "+ str);
        str.insert(5,'X');
        System.out.println("to add insert method "+ str);
        str.reverse();
        System.out.println("to add reverse method " + str);
        str.delete(4,5);
        System.out.println("to add delete method " + str);
        str.deleteCharAt(2);
        System.out.println("to add deleteCharacter method " + str);
    }
}
