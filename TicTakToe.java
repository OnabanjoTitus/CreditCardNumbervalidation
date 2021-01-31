import java.util.Arrays;

public class TicTakToe {
    private char[][] chars;
    private int turnMonitor = 1;
    private int[][]gameBoard=new int[3][3];

    public void startNewGame() {
        chars = new char[3][3];
    }

    public char[][] getGameBoard() {
        return chars;
    }

    public void markASpot(int row, int column) {
        int arrayRow = row - 1;
        int arrayColumn = column - 1;
        markTheSpot(arrayRow, arrayColumn);
    }

    private void markTheSpot(int arrayRow, int arrayColumn) {
        if (turnMonitor % 2 > 0) {
            boolean emptySpace = IsEmptySpace(arrayRow, arrayColumn);
            if (emptySpace) {
                chars[arrayRow][arrayColumn] = 1;
                turnMonitor += 1;
            } else {
                System.out.println("Space Occupied try another space");
            }
        } else {
            boolean emptySpace = IsEmptySpace(arrayRow, arrayColumn);
            if (emptySpace) {
                chars[arrayRow][arrayColumn] = 2;
                turnMonitor += 1;
            } else {
                System.out.println("Space Occupied try another space");
            }
        }

    }

    private boolean IsEmptySpace(int arrayRow, int arrayColumn) {
        boolean validity = false;
        if (chars[arrayRow][arrayColumn] == 0) {
            validity = true;
        }
        return validity;
    }

    public boolean WeHaveAWinner() {
    boolean winnerMonitor;
        winnerMonitor = WinnerChecker();
//        if(winnerMonitor){
            printGameBoard();
//        }
        return winnerMonitor;
    }

    private void printGameBoard() {
        for(int row= 0;row<3;row++){
            for(int column=0;column<3;column++){
                gameBoard[row][column]=chars[row][column];
                System.out.print(gameBoard[row][column]);
                //System.out.println(Arrays.deepToString(gameBoard));
            }
            System.out.println();

        }

    }

    private boolean WinnerChecker() {
        boolean winnerCheck;
       winnerCheck = possibleWinningCombinations();
    return winnerCheck;
    }

    private boolean possibleWinningCombinations() {
        if(String.valueOf(chars[0][0]).equals(String.valueOf(chars[1][0]))){
            return String.valueOf(chars[0][0]).equals(String.valueOf(chars[2][0]));
        }
        return false;
    }
}

