package src;
    import java.util.Scanner;

    public class employeeRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter age (0-100): ");
        int age = scanner.nextInt();

        System.out.print("Enter employee number (27560000...27569999): ");
        long employeeNumber = scanner.nextLong();

        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@mentormarkers.com";

        System.out.println("Employee Details:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Email: " + email);
    }
}

