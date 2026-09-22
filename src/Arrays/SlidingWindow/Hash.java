package Arrays.SlidingWindow;
import java.util.*;
public class Hash {
    static void main(String[] args) {
        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("Rahul", 21);
        studentAges.put("Mayank", 22);
        studentAges.put("Ayushi", 20);
        System.out.println("Ayushi age: " + studentAges.get("Ayushi"));
         studentAges.put("Ayushi",21);
         boolean hasMayank = studentAges.containsKey("Mayank");
        System.out.println(hasMayank );
         boolean hasAge20 = studentAges.containsValue(20);
        System.out.println(hasAge20);
    }
}
