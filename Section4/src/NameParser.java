import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter you full name: ");
        String fullName = keyboard.nextLine();

        int spaceIndex = fullName.indexOf(" ");

        String firstName = fullName.substring(0, spaceIndex);
        String lastName = fullName.substring(spaceIndex + 1);

        System.out.println("First name is " + firstName.toUpperCase());
        System.out.println("Last name is " + lastName.toLowerCase());
    }
}
