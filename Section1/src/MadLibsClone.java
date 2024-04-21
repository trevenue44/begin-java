import java.util.Scanner;

public class MadLibsClone {
    public static void main(String[] args) {
        String adjective1, girlName, adjective2, occupation1, place,
                clothing, hobby, adjective3, occupation2, boyName, manName;
        String sentence1, sentence2;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        adjective1 = keyboard.nextLine();

        System.out.print("Enter a girl's name: ");
        girlName = keyboard.nextLine();

        System.out.print("Enter another adjective: ");
        adjective2 = keyboard.nextLine();

        System.out.print("Enter an occupation: ");
        occupation1 = keyboard.nextLine();

        System.out.print("Enter the name of a place: ");
        place = keyboard.nextLine();

        System.out.print("Enter the name of a piece of clothing: ");
        clothing = keyboard.nextLine();

        System.out.print("Enter the name of a hobby: ");
        hobby = keyboard.nextLine();

        System.out.print("Enter another adjective: ");
        adjective3 = keyboard.nextLine();

        System.out.print("Enter another occupation: ");
        occupation2 = keyboard.nextLine();

        System.out.print("Enter a boy's name: ");
        boyName = keyboard.nextLine();

        System.out.print("Enter a man's name: ");
        manName = keyboard.nextLine();

        sentence1 = "There once was a " + adjective1 + " girl named " +
                girlName + " who was a " + adjective2 + " " + occupation1 +
                " in the kingdom of " + place + ".";
        sentence2 = "She loved to wear " + clothing + " and to " + hobby + "." +
                " She wanted to marry the " + adjective3 + " " + occupation2 + " named " + boyName +
                " but her father, King " + manName + " forbid her from seeing him.";

        System.out.println();

        System.out.println(sentence1);
        System.out.println(sentence2);
    } // end main
}
