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
        boolean playCondition;
        int arrayRow = row - 1;
        int arrayColumn = column - 1;
       playCondition= isSpotMarked(arrayRow, arrayColumn);
       return playCondition;
    }

    private boolean isSpotMarked(int arrayRow, int arrayColumn) {
    boolean playCondition = false;
        boolean emptySpace = isEmptySpace(arrayRow, arrayColumn);
        if (turnMonitor % 2 > 0) {
            playCondition=isPlayer1PlayingConditions(emptySpace,arrayRow,arrayColumn);
        } else {
            playCondition=isPlayer2PlayingConditions(emptySpace,arrayRow,arrayColumn);
        }
    return playCondition;

    }
    private boolean isPlayer1PlayingConditions(boolean emptySpace,int arrayRow, int arrayColumn){
        boolean playCondition = false;
        if (emptySpace) {
            chars[arrayRow][arrayColumn] =1;
            playCondition=statusMessages();
            turnMonitor += 1;
        } else {
            System.out.println("Space Occupied try another space");
        }
        return playCondition;
    }

    private boolean isPlayer2PlayingConditions(boolean emptySpace,int arrayRow, int arrayColumn){
        boolean playCondition = false;
        if (emptySpace) {
            chars[arrayRow][arrayColumn] = 8;
            playCondition=  statusMessages();
            turnMonitor += 1;

        } else {
            System.out.println("Space Occupied try another space");
        }
        return playCondition;
    }

    private boolean isEmptySpace(int arrayRow, int arrayColumn) {
        boolean validity = false;
        if (chars[arrayRow][arrayColumn] == 0) {
            validity = true;
        }
        return validity;
    }


    private boolean statusMessages() {
        printGameBoard.printGameBoard(chars);
        boolean winnerMonitor =printGameBoard.isPossibleWinningCombination();

        if(winnerMonitor){
            System.out.printf("The Game has been won by %s%n", (turnMonitor%2>0?"Player1":"Player2"));
        } else {
            System.out.println("The game has no winner yet");
        }
    return winnerMonitor;
    }

}

