public class MoreArrayFun {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // enhanced for loop
        for (int num : array) {
            System.out.println(num);
        }
    }
}
