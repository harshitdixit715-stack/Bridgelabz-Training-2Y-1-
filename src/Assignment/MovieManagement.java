package Assignment;
import java.util.*;
public class MovieManagement {
        static class Node {
            String title;
            String director;
            int year;
            double rating;
            Node next;
            Node prev;
            Node(String title, String director, int year, double rating) {
                this.title = title;
                this.director = director;
                this.year = year;
                this.rating = rating;
                this.next = null;
                this.prev = null;
            }
        }
        static Node head = null;
        static Node tail = null;
        static void addAtBeginning(String title, String director,// 1. Add movie at beginning
                                   int year, double rating) {

            Node newNode = new Node(title, director, year, rating);

            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            System.out.println("Movie added at beginning.");
        }

        static void addAtEnd(String title, String director,
                             int year, double rating) { // 2. Add movie at end

            Node newNode = new Node(title, director, year, rating);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            System.out.println("Movie added at end.");
        }
        static void addAtPosition(String title, String director,
                                  int year, double rating, int position) {        // 3. Add movie at specific position (1-based)

            if (position < 1) {
                System.out.println("Invalid position.");
                return;
            }
            if (position == 1) {
                addAtBeginning(title, director, year, rating);
                return;
            }
            Node temp = head;
            int count = 1;

            while (temp != null && count < position - 1) {
                temp = temp.next;
                count++;
            }

            if (temp == null) {
                System.out.println("Invalid position.");
                return;
            }

            if (temp == tail) {
                addAtEnd(title, director, year, rating);
                return;
            }

            Node newNode = new Node(title, director, year, rating);

            newNode.next = temp.next;
            newNode.prev = temp;

            temp.next.prev = newNode;
            temp.next = newNode;

            System.out.println("Movie added at position " + position);
        }
        static void removeMovie(String title) {        // 4. Remove movie by title
            Node temp = head;
            while (temp != null && !temp.title.equalsIgnoreCase(title)) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Movie not found.");
                return;
            }

            if (temp == head && temp == tail) {
                head = tail = null;
            } else if (temp == head) {
                head = head.next;
                head.prev = null;
            } else if (temp == tail) {
                tail = tail.prev;
                tail.next = null;
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }

            System.out.println("Movie removed successfully.");
        }
        static void searchByDirector(String director) {        // 5. Search movie by director
            Node temp = head;
            boolean found = false;

            while (temp != null) {

                if (temp.director.equalsIgnoreCase(director)) {
                    displayMovie(temp);
                    found = true;
                }

                temp = temp.next;
            }

            if (!found) {
                System.out.println("No movie found for this director.");
            }
        }
        static void searchByRating(double rating) {        // 6. Search movie by rating

            Node temp = head;
            boolean found = false;
            while (temp != null) {
                if (temp.rating == rating) {
                    displayMovie(temp);
                    found = true;
                }
                temp = temp.next;
            }
            if (!found) {
                System.out.println("No movie found with this rating.");
            }
        }
        static void updateRating(String title, double newRating) {        // 7. Update rating by movie title

            Node temp = head;
            while (temp != null) {
                if (temp.title.equalsIgnoreCase(title)) {
                    temp.rating = newRating;
                    System.out.println("Rating updated successfully.");
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Movie not found.");
        }
        static void displayMovie(Node temp) {        // Display one movie
            System.out.println("--------------------");
            System.out.println("Title    : " + temp.title);
            System.out.println("Director : " + temp.director);
            System.out.println("Year     : " + temp.year);
            System.out.println("Rating   : " + temp.rating);
        }
        static void displayForward() {        // 8. Display forward
            if (head == null) {
                System.out.println("No movies available.");
                return;
            }

            Node temp = head;

            System.out.println("\nMovies in Forward Order:");

            while (temp != null) {
                displayMovie(temp);
                temp = temp.next;
            }
        }
        static void displayReverse() {        // 9. Display reverse
            if (tail == null) {
                System.out.println("No movies available.");
                return;
            }
            Node temp = tail;
            System.out.println("\nMovies in Reverse Order:");
            while (temp != null) {
                displayMovie(temp);
                temp = temp.prev;
            }
        }
        public static void main(String[] args) {        // Main method
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("\n===== MOVIE MANAGEMENT SYSTEM =====");
                System.out.println("1. Add Movie at Beginning");
                System.out.println("2. Add Movie at End");
                System.out.println("3. Add Movie at Specific Position");
                System.out.println("4. Remove Movie by Title");
                System.out.println("5. Search by Director");
                System.out.println("6. Search by Rating");
                System.out.println("7. Update Movie Rating");
                System.out.println("8. Display Forward");
                System.out.println("9. Display Reverse");
                System.out.println("10. Exit");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {

                    case 1:
                        System.out.print("Enter title: ");
                        String t1 = sc.nextLine();

                        System.out.print("Enter director: ");
                        String d1 = sc.nextLine();

                        System.out.print("Enter year: ");
                        int y1 = sc.nextInt();

                        System.out.print("Enter rating: ");
                        double r1 = sc.nextDouble();

                        addAtBeginning(t1, d1, y1, r1);
                        break;

                    case 2:
                        System.out.print("Enter title: ");
                        String t2 = sc.nextLine();

                        System.out.print("Enter director: ");
                        String d2 = sc.nextLine();

                        System.out.print("Enter year: ");
                        int y2 = sc.nextInt();

                        System.out.print("Enter rating: ");
                        double r2 = sc.nextDouble();

                        addAtEnd(t2, d2, y2, r2);
                        break;

                    case 3:
                        System.out.print("Enter title: ");
                        String t3 = sc.nextLine();

                        System.out.print("Enter director: ");
                        String d3 = sc.nextLine();

                        System.out.print("Enter year: ");
                        int y3 = sc.nextInt();

                        System.out.print("Enter rating: ");
                        double r3 = sc.nextDouble();

                        System.out.print("Enter position: ");
                        int pos = sc.nextInt();

                        addAtPosition(t3, d3, y3, r3, pos);
                        break;

                    case 4:
                        System.out.print("Enter movie title to remove: ");
                        String removeTitle = sc.nextLine();

                        removeMovie(removeTitle);
                        break;

                    case 5:
                        System.out.print("Enter director name: ");
                        String director = sc.nextLine();

                        searchByDirector(director);
                        break;

                    case 6:
                        System.out.print("Enter rating: ");
                        double rating = sc.nextDouble();

                        searchByRating(rating);
                        break;

                    case 7:
                        System.out.print("Enter movie title: ");
                        String updateTitle = sc.nextLine();

                        System.out.print("Enter new rating: ");
                        double newRating = sc.nextDouble();

                        updateRating(updateTitle, newRating);
                        break;

                    case 8:
                        displayForward();
                        break;

                    case 9:
                        displayReverse();
                        break;

                    case 10:
                        System.out.println("Program Exited.");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }

