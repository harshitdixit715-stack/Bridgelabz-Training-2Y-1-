package LinkList;

public class CountNode {
    public static class Node {
        int data;
        Traversal.Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static Traversal.Node head;
    public static Traversal.Node tail;
    public static void inserAtEnd(int value){
        Traversal.Node temp = new Traversal.Node(value);
        if(head == null){
            head  = temp;
            tail = head;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }
    public static int countNode() {
        int count = 0;
        Traversal.Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
    public static void display(){
        Traversal.Node temp = head;
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
        System.out.println("\nTotal Nodes: " + countNode());
    }
}
