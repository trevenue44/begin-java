import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ProjectTicTacToe {
    public static void main(String[] args) {
        runGame();
    } // end main

    public static void runGame() {
        final String[][] board = new String[3][3];
        final String emptyCharacter = " ";
        String currentPlayer = getInitialPlayer();
        int[] playerInput;
        String winner = null;
        boolean boardIsFull;

        fillEmptyBoard(board, emptyCharacter);

        while (true)  {
            printBoard(board);

            do playerInput = takePlayerInput(currentPlayer);
            while (!isValidPlayerInput(board, playerInput, emptyCharacter));

            addPlayerInputToBoard(board, currentPlayer, playerInput);

            boardIsFull = checkIfBoardIsFull(board, emptyCharacter);
            if (boardIsFull) break;

            winner = getWinner(board, emptyCharacter);
            if (winner != null) break;

            currentPlayer = getNextPlayer(currentPlayer);
            System.out.println();
        }

        printBoard(board);
        if (boardIsFull) System.out.println("This is a draw! You should probably play again ;)");
        else System.out.printf("Congratulations %s, you have won!", winner);
        System.out.println();
    } // end runGame

    public static void fillEmptyBoard(String[][] board, String emptyCharacter) {
        for (String[] row : board) {
            Arrays.fill(row, emptyCharacter);
        }
    } // end fillEmptyBoard

    public static void printBoard(String[][] board) {
        for (int rowId = 0; rowId < board.length - 1; rowId++) {
            String[] row = board[rowId];
            System.out.println(row[0] + " | " + row[1] + " | " + row[2]);
            System.out.println("----------");
        }
        String[] lastRow = board[board.length - 1];
        System.out.println(lastRow[0] + " | " + lastRow[1] + " | " + lastRow[2]);
    } // end printBoard

    public static int[] takePlayerInput(String currentPlayer) {
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("It's %s's turn. Enter input: ", currentPlayer);
        int rowId = keyboard.nextInt();
        int colId = keyboard.nextInt();
        keyboard.nextLine();

        return new int[]{rowId, colId};
    } // end takePlayerInput

    public static boolean isValidPlayerInput(String[][] board, int[] playerInput, String emptyCharacter) {
        // check array indices
        if (playerInput[0] >= board.length || playerInput[1] >= board[0].length) return false;
        return board[playerInput[0]][playerInput[1]].equals(emptyCharacter);
    } // end isValidPlayerInput

    public static String getNextPlayer(String currentPlayer) {
        return switch (currentPlayer) {
            case "X", "x" -> "O";
            case "O", "o" -> "X";
            default -> throw new RuntimeException("Invalid value of currentPlayer.");
        };
    } // end getNextPlayer

    public static String getInitialPlayer() {
        String[] playerOptions = new String[]{"X", "O"};
        Random random = new Random();
        return playerOptions[random.nextInt(playerOptions.length)];
    } // end getInitialPlayer

    public static void addPlayerInputToBoard(String[][] board, String currentPlayer, int[] playerInput) {
        board[playerInput[0]][playerInput[1]] = currentPlayer;
    } // end addUserInputToBoard

    public static String getWinner(String[][] board, String emptyCharacter) {
        // checking row equality
        for (String[] row : board) {
            if (!row[0].equals(emptyCharacter) && row[0].equals(row[1]) && row[0].equals(row[2])) return row[0];
        }

        // checking column equalities
        for (int columnId = 0; columnId < board[0].length ; columnId++) {
            if (!board[0][columnId].equals(emptyCharacter)
                    && board[0][columnId].equals(board[1][columnId])
                    && board[0][columnId].equals(board[2][columnId]))
                return board[0][columnId];
        }

        // checking leading diagonal
        if (!board[0][0].equals(emptyCharacter)
                && board[0][0].equals(board[1][1])
                && board[0][0].equals(board[2][2]))
            return board[0][0];

        // other diagonal
        else if (!board[0][2].equals(emptyCharacter)
                && board[0][2].equals(board[1][1])
                && board[0][2].equals(board[2][0]))
            return board[0][2];

        return null;
    } // end getWinner

    public static boolean checkIfBoardIsFull(String[][] board, String emptyCharacter) {
        for (String[] row : board) {
            for (String value : row) {
                if (value.equals(emptyCharacter)) return false;
            }
        }
        return true;
    } // end checkIfBoardIsFull
}
