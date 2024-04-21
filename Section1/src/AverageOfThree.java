import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num1, num2, num3, average;

        System.out.println("Please enter three numbers");
        num1 = keyboard.nextDouble();
        num2 = keyboard.nextDouble();
        num3 = keyboard.nextDouble();
        keyboard.nextLine(); // consume newline

        average = (num1 + num2 + num3) / 3.0;

        System.out.println("Average is " + average);
    } // end main
}
