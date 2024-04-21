import java.util.Scanner;
import java.util.ArrayList;

public class ProjectNamePermutation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        String fullName;
        String firstName;
        String lastName;
        int indexOfSpace;

        final int NUM_NAMES = 5;

        for (int i = 0; i < NUM_NAMES; i++) {
            System.out.printf("Enter name %s: ", i);
            fullName = keyboard.nextLine();

            indexOfSpace = fullName.indexOf(" ");
            firstName = fullName.substring(0, indexOfSpace);
            lastName = fullName.substring(indexOfSpace + 1);

            firstNames.add(firstName);
            lastNames.add(lastName);
        }

        System.out.println();

        for (String storedFirstName : firstNames) {
            for (String storedLastName : lastNames) {
                System.out.printf("%s %s\n", storedFirstName, storedLastName);
            }
        }
    }
}
