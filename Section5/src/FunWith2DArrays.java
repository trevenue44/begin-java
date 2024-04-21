import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        int[][] my2DArray = new int[4][3];

        fill2DArray(my2DArray);

        print2DArray(my2DArray);

        System.out.println("Twice 2D Array");
        twice2DArray(my2DArray);
        print2DArray(my2DArray);
    }

    public static void fill2DArray(int[][] twoDArray) {
        Random random = new Random();

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = random.nextInt(100);
            }
        }
    }

    public static void twice2DArray(int[][] twoDArray) {
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = 2 * twoDArray[i][j];
            }
        }
    }

    public static void print2DArray(int[][] twoDArray) {
        for (int[] array : twoDArray) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
