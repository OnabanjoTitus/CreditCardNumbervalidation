import com.sun.source.tree.WildcardTree;

import java.util.Arrays;

public class TicTakToe {
    private char[][] chars;
    private int turnMonitor = 1;


    PrintGamePlayingBoard printGameBoard = new PrintGamePlayingBoard();



    public void startNewGame() {
        chars = new char[3][3];
    }

    public char[][] getGameBoard() {
        return chars;
    }

    public boolean markASpot(int row, int column) {
        boolean playCondition;
        int arrayRow = row - 1;
        int arrayColumn = column - 1;
       playCondition= markTheSpot(arrayRow, arrayColumn);
       return playCondition;
    }
    private boolean markTheSpot(int arrayRow, int arrayColumn) {
    boolean playCondition = false;
        if (turnMonitor % 2 > 0) {
            boolean emptySpace = IsEmptySpace(arrayRow, arrayColumn);
            if (emptySpace) {
                chars[arrayRow][arrayColumn] =1;
                playCondition=statusMessages();
                turnMonitor += 1;

            } else {
                System.out.println("Space Occupied try another space");
            }
        } else {
            boolean emptySpace = IsEmptySpace(arrayRow, arrayColumn);
            if (emptySpace) {
                chars[arrayRow][arrayColumn] = 8;
              playCondition=  statusMessages();
                turnMonitor += 1;

            } else {
                System.out.println("Space Occupied try another space");
            }
        }
return playCondition;

    }

    private boolean IsEmptySpace(int arrayRow, int arrayColumn) {
        boolean validity = false;
        if (chars[arrayRow][arrayColumn] == 0) {
            validity = true;
        }
        return validity;
    }


    private boolean statusMessages() {
        printGameBoard.printGameBoard(chars);
        boolean winnerMonitor = printGameBoard.possibleWinningCombinations();

        if(winnerMonitor){
            System.out.printf("The Game has been won by %s%n", (turnMonitor%2>0?"Player1":"Player2"));
        } else {
            System.out.println("The game has no winner yet");
        }
    return winnerMonitor;
    }

}

