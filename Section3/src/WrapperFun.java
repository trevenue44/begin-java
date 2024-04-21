import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();

        // boxing
        // myAL.add(new Integer(10));
        myAL.add(10); // instead of the above.
        myAL.add(22);

        // auto-unboxing
        // even though myAL is storing the wrapper class, it gets unboxed into its primitive.
        for (int num : myAL) {
            System.out.println(num);
        }

        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10;

        System.out.println(numericValue);

        final String PI_STRING = "3.14159";
        final double PI = Double.parseDouble(PI_STRING);

        System.out.println("PI is " + PI);
    } // end main
}
