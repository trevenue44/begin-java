/*
    Some notes on primitive data types in python.
    There are 8 Primitive types. The following list them with their memory allocations.
    1. byte - 1 byte
    2. short - 2 bytes
    3. int - 4 bytes
    4. long - 8 bytes
    5. float - 4 bytes
    6. double - 8 bytes
    7. char - 16 bytes
    8. boolean - 8/16 bytes, depending on the system.
*/

public class ConversionFun {
    public static void main(String[] args) {
        double myDouble = 3.14;

        // in Java, real numbers by default are of type double
        // adding the `F` tells java you're storing it as a float
        float myFloat = 3.14F; // narrowing/lossy conversion

        double yourDouble = myFloat; // widening/lossless conversion.
    }
}
