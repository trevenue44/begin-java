import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int input;

        // priming read
        System.out.println("Enter non-negative integer to add to sum.");
        System.out.println("Or enter a negative integer to exit and print sum.");
        input = keyboard.nextInt();

        while (input >= 0) {
            sum += input;

            System.out.println("Enter an non-negative integer to add to sum.");
            System.out.println("Or enter a negative integer to exit and print sum.");
            input = keyboard.nextInt();
        }

        System.out.println("Your sum is: " + sum);
    } // end main
}
