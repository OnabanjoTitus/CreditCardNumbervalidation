import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTakToeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicTakToe ticTakToe = new TicTakToe();
        ticTakToe.startNewGame();

        try {
            System.out.println("Enter the row");
            int row = input.nextInt();
            System.out.println("Enter the column");
            int column = input.nextInt();
            boolean continuation = ticTakToe.isMarkASpot(row, column);
            while (!continuation) {
                System.out.println("Enter the row");
                row = input.nextInt();
                System.out.println("Enter the column");
                column = input.nextInt();
                continuation = ticTakToe.isMarkASpot(row, column);

            }
        }catch (InputMismatchException inputMismatchException){
            System.err.println("Error in your input");
        }
    }

}
