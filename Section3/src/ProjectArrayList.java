import java.util.ArrayList;
import java.util.Scanner;

public class ProjectArrayList {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        boolean endLoop = false;

        do {
            System.out.println("Enter 0 or more to put in the list or -1 to exit");
            double input = keyboard.nextDouble();

            if (input >= 0) numbers.add(input);
            else endLoop = true;
        } while (!endLoop);

        for (int i = numbers.size() - 1; i >= 0; i--) System.out.println(numbers.get(i));
    }
}
