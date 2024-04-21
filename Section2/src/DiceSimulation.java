import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();

        // simulating 10 dice rolls
        for (int rollCount = 0; rollCount < 10; rollCount++) {
            int number = random.nextInt(6) + 1; // use shifting to simulate from 1 to 6;
            System.out.println(number);
        }
    } // end main
}
