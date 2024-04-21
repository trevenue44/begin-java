import java.util.Scanner;

/*
    `java.lang` is automatically imported in every Java class that we create.
    `String` belongs to the java.lang package and hence we never need to import it.
 */

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        double someNumber;
        String city;

        System.out.println("What is your name? ");
        name = keyboard.nextLine();

        System.out.println("What is your age?");
        age = keyboard.nextInt();
        keyboard.nextLine(); // consumes the newline character. nextInt() above doesn't.

        System.out.println("Enter some real number");
        someNumber = keyboard.nextDouble();
        keyboard.nextLine(); // consumes the newline character.

        System.out.println("What is your city?");
        city = keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("You're " + age + " years old.");
        System.out.println("Your number times 2 is " + (someNumber * 2));
        System.out.println("Your city is " + city);
    } // end main
}
