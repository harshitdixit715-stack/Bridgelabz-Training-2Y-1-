package LinkList.Searching;

public class DeleteFirst {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static void deleteFirst(){
        if(head == null){
            //System.out.println("Empty List");
            return ;
        }
        head = head.next;
    }
    public static void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next = new Node(50);
        head.next.next.next.next = new Node(60);
        display();
        deleteFirst();
        System.out.println("After Decleration");
        display();


    }
}
