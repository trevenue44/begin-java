public class ArrayFun {
    public static void main(String[] args) {
        int[] myArray; // the array itself is always a reference type.
        myArray = new int[5]; // initialize and specify the number of cells

        myArray[0] = 10;
        myArray[1] = 22;
        myArray[2] = 5;
        myArray[3] = 17;
        myArray[4] = 20;

//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }

        for (int num : myArray) {
            System.out.println(num);
        }
    } // end main
}
