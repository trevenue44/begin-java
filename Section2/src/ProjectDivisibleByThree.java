import java.util.Scanner;

public class ProjectDivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;

        System.out.print("Enter an integer: ");
        input = keyboard.nextInt();

        if (input % 3 == 0) {
            System.out.println(input + " is divisible by 3.");
        }
        else {
            System.out.println(input + " is NOT divisible by 3.");
        }
    } // end main
}
