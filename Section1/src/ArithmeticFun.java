public class ArithmeticFun {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        // binary operators
        int result = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = a % b;

        System.out.println("Result: " + result);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // compound operators
        result += 20; // result = result + 20
        System.out.println("New Result: " + result);

        // Unary operator
        // increment and decrement operators
        result++;
        System.out.println("result++ " + result);

        result--;
        System.out.println("result-- " + result);

        product *= 2; // product = product * 2;
        System.out.println("Product x 2: " + product);
    } // end main
}
