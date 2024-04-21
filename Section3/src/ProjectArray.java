import java.util.Scanner;

public class ProjectArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter an integer: ");
            int input = keyboard.nextInt();
            numbers[i] = input;
        }

        for (int number : numbers) {
            System.out.println("result is " + (number * 2) );
        }
    }
}
