public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(10);

        int result = giveMe10();
        System.out.println(result);

        result = addThese(3, 5);
        System.out.println(result);

        double challengeResult = squareNumber(25);
        System.out.println(challengeResult);
    } // end main

    // void, parameterless method
    public static void printHello() {
        System.out.println("Hello there!");
    } // end printHello

    // void, parameterised method
    public static void printNumber (int a) {
        System.out.println("The number is " + a);
    } // end printNumber

    // value-returning, parameterless method
    public static int giveMe10() {
        return 10;
    } // end giveMe10;

    // value-returning, parameterised
    public static int addThese(int num1, int num2) {
        return num1 + num2;
    } // end addThese

    // challenge
    public static double squareNumber(double number) {
        return number * number;
    } // end squareNumber
}
