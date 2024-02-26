//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class LibrarySystem {
    static String[] studentUsers = {"202310370311134"};
    static String adminUsername = "admin";
    static String adminPassword = "admin";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====library system====");
        int option;
        do {
            System.out.println("1. login as student");
            System.out.println("2. login as admin");
            System.out.println("3. exit");
            System.out.print("choose option(1-3): ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    loginAsStudent(scanner);
                    break;
                case 2:
                    loginAsAdmin(scanner);
                    break;
                case 3:
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (option != 3);

        scanner.close();
    }

    static void loginAsStudent(Scanner scanner) {
        System.out.print("enter your NIM: ");
        String nim = scanner.nextLine();

        boolean found = false;
        for (String user : studentUsers) {
            if (user.equals(nim)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("successful login as student");
        } else {
            System.out.println("user not found");
        }

        System.out.println("====library system====");
    }

    static void loginAsAdmin(Scanner scanner) {
        System.out.print("enter your username (admin): ");
        String username = scanner.nextLine();
        System.out.print("enter your password (admin): ");
        String password = scanner.nextLine();

        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            System.out.println("successful login as admin");
        } else {
            System.out.println("admin user not found!!");
        }

        System.out.println("====library system====");
    }
}