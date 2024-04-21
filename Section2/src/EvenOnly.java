public class EvenOnly {
    public static void main(String[] args) {
        for (int number = 0; number < 10; number++) {
            // skip the odd numbers
            if (number % 2 != 0) {
                continue;
            }

            System.out.println(number);
        }
    } // end main
}
