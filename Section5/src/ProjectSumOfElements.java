import java.util.ArrayList;
import java.util.Random;

public class ProjectSumOfElements {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            myList.add(random.nextInt(100));
        }

        System.out.println(myList);

        System.out.println("Sum is " + sumElements(myList));
    } // end main

    public static int sumElements(ArrayList<Integer> list) {
        int sum = 0;

        for (int number : list) {
            sum += number;
        }

        return sum;
    } // end sumElements
}
