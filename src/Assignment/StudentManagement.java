package Assignment;
 import java.util.*;
public class StudentManagement {
    static class Node {
        int rollNo;
        String name;
        int age;
        String grade;
        Node next;

        Node(int rollNo, String name, int age, String grade) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    static Node head = null;
    static void addAtBeginning(int roll, String name,// 1. Add student at beginning
                               int age, String grade) {

        Node newNode = new Node(roll, name, age, grade);

        newNode.next = head;
        head = newNode;

        System.out.println("Student added at beginning.");
    }
    static void addAtEnd(int roll, String name,// 2. Add student at end
                         int age, String grade) {

        Node newNode = new Node(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        System.out.println("Student added at end.");
    }
    static void addAtPosition(int roll, String name,// Add student at specific position
                              int age, String grade, int pos) {

        if (pos < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (pos == 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        Node newNode = new Node(roll, name, age, grade);

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Student added at position " + pos);
    }
    static void deleteStudent(int roll) { //Delete student by Roll Number
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.rollNo == roll) {
            head = head.next;
            System.out.println("Student deleted.");
            return;
        }
        Node temp = head;
        while (temp.next != null &&
                temp.next.rollNo != roll) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student not found.");
            return;
        }
        temp.next = temp.next.next;
        System.out.println("Student deleted.");
    }
    static void searchStudent(int roll) { //Search student by Roll Number
        Node temp = head;
        while (temp != null) {
            if (temp.rollNo == roll) {
                System.out.println("Student Found!");
                System.out.println("Roll No: " + temp.rollNo);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }
    static void displayStudents() { // display all students
        if (head == null) {
            System.out.println("No student records.");
            return;
        }
        Node temp = head;
        System.out.println("\nStudent Records:");
        while (temp != null) {
            System.out.println("-------------------");
            System.out.println("Roll No: " + temp.rollNo);
            System.out.println("Name: " + temp.name);
            System.out.println("Age: " + temp.age);
            System.out.println("Grade: " + temp.grade);
            temp = temp.next;
        }
    }
    static void updateGrade(int roll, String newGrade) { //Update student grade
        Node temp = head;
        while (temp != null) {
            if (temp.rollNo == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Specific Position");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Display Students");
            System.out.println("7. Update Grade");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();
                    if (choice == 1) {
                        addAtBeginning(roll, name, age, grade);
                    } else if (choice == 2) {
                        addAtEnd(roll, name, age, grade);
                    } else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        addAtPosition(roll, name, age, grade, pos);
                    }
                    break;
                case 4:
                    System.out.print("Enter Roll Number to delete: ");
                    int deleteRoll = sc.nextInt();
                    deleteStudent(deleteRoll);
                    break;
                case 5:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = sc.nextInt();
                    searchStudent(searchRoll);
                    break;
                case 6:
                    displayStudents();
                    break;
                case 7:
                    System.out.print("Enter Roll Number: ");
                    int updateRoll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Grade: ");
                    String newGrade = sc.nextLine();
                    updateGrade(updateRoll, newGrade);
                    break;
                case 8:
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
