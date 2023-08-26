import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>(null);
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("Menu: ");
            System.out.println("1. Insert a person at the beginning");
            System.out.println("2. Display the list");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name: ");
                    String name = scanner.next();

                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();

                    Person person = new Person(name, age);
                    Node<Person> node = new Node<>(person, null);

                    list.prepend(node);
                    break;
                case 2:
                    System.out.println("Displaying the list: ");
                    list.display();
                    System.out.println("End of the list.");
                    break;
                case 3:
                    scanner.close();
                    System.out.println("Exiting the program!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        }
    }
}
