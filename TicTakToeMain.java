import java.util.Scanner;

public class TicTakToeMain {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        TicTakToe ticTakToe = new TicTakToe();
        ticTakToe.startNewGame();
        System.out.println("Enter the row");
        int row= input.nextInt();
        System.out.println("Enter the column");
        int column= input.nextInt();
       boolean continuation = ticTakToe.markASpot(row,column);
       while (!continuation){
           System.out.println("Enter the row");
           row= input.nextInt();
           System.out.println("Enter the column");
            column= input.nextInt();
            continuation = ticTakToe.markASpot(row,column);
       }
    }

}
