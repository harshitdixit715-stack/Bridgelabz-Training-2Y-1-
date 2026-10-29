package LinkList;

public class Basics {
    String name;
    public Basics(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Basics s1 = new Basics("Harshit");
        System.out.println(s1.name);
    }
}
