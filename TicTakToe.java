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

    public boolean isMarkASpot(int row, int column) {
        boolean isPlayCondition;
        int arrayRow = row - 1;
        int arrayColumn = column - 1;
       isPlayCondition= isSpotMarked(arrayRow, arrayColumn);
       return isPlayCondition;
    }

    private boolean isSpotMarked(int arrayRow, int arrayColumn) {
    boolean isPlayCondition = false;
        boolean emptySpace = isEmptySpace(arrayRow, arrayColumn);
        if (turnMonitor % 2 > 0) {
            isPlayCondition=isPlayer1PlayingConditions(emptySpace,arrayRow,arrayColumn);
        } else {
            isPlayCondition=isPlayer2PlayingConditions(emptySpace,arrayRow,arrayColumn);
        }
    return isPlayCondition;

    }
    private boolean isPlayer1PlayingConditions(boolean emptySpace,int arrayRow, int arrayColumn){
        boolean isPlayCondition = false;
        if (emptySpace) {
            chars[arrayRow][arrayColumn] =1;
            isPlayCondition=statusMessages();
            turnMonitor += 1;
        } else {
            System.out.println("Space Occupied try another space");
        }
        return isPlayCondition;
    }

    private boolean isPlayer2PlayingConditions(boolean emptySpace,int arrayRow, int arrayColumn){
        boolean isPlayCondition = false;
        if (emptySpace) {
            chars[arrayRow][arrayColumn] = 8;
            isPlayCondition=  statusMessages();
            turnMonitor += 1;

        } else {
            System.out.println("Space Occupied try another space");
        }
        return isPlayCondition;
    }

    private boolean isEmptySpace(int arrayRow, int arrayColumn) {
        boolean isValid = false;
        if (chars[arrayRow][arrayColumn] == 0) {
            isValid = true;
        }
        return isValid;
    }


    private boolean statusMessages() {
        printGameBoard.printGameBoard(chars);
        boolean isWinnerMonitor =printGameBoard.isPossibleWinningCombination();

        if(isWinnerMonitor){
            System.out.printf("The Game has been won by %s%n", (turnMonitor%2>0?"Player1":"Player2"));
        } else {
            System.out.println("The game has no winner yet");
        }
    return isWinnerMonitor;
    }

}

