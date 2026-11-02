package LinkList;

public class Traversal {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static Node head;
    public static Node tail;
    public static void inserAtEnd(int value){
        Node temp = new Node(value);
        if(head == null){
            head  = temp;
            tail = head;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }
    public static void insertAtStart(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }
        public static void display(){
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+ " -> ");
                temp = temp.next;
            }
    }
    public static void main(String[] args) {
        inserAtEnd(10);
        inserAtEnd(20);
        inserAtEnd(30);
        inserAtEnd(40);
        inserAtEnd(50);
        display();
    }
}
