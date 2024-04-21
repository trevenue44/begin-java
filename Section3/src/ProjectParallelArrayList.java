import java.util.Scanner;
import java.util.ArrayList;

public class ProjectParallelArrayList {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a name: ");
            String name = keyboard.nextLine();

            System.out.print("Enter age: ");
            int age = keyboard.nextInt();
            keyboard.nextLine(); // remove character from the nextInt read above

            System.out.println(); // adding a spacing

            names.add(name);
            ages.add(age);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s is %s years old.%n", names.get(i), ages.get(i));
        }
    }
}

