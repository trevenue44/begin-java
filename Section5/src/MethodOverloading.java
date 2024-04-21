public class MethodOverloading {
    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println(result);

        result = getResult(5, 4);
        System.out.println(result);

        result = getResult(5, "12");
        System.out.println(result);

        String stringResult = getResult("Paul", "Treve");
        System.out.println(stringResult);

    } // end main

    public static int getResult(int num) {
        return num * 2;
    }

    public static int getResult(int num1, int num2) {
        return num1 * num2;
    }

    public static int getResult(int num1, String value) {
        return num1 * Integer.parseInt(value);
    }

    public static String getResult(String string1, String string2) {
        return string1 + " " + string2;
    }
}
