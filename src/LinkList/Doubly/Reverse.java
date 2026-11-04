package LinkList.Doubly;

public class Reverse {
    public static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void reverseDisplay(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        head =a;
        tail = d;
        a.prev = null;
        a.next = b;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = null;
        d.prev = c;
        display();
        System.out.println("After Reverse");
        reverseDisplay();
    }
}
