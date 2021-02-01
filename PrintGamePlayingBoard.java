public class PrintGamePlayingBoard {

    private final int [][]gameBoard=new int[3][3];
    PossibleWinningCombinations possibleWinningCombinations= new PossibleWinningCombinations();

    public void printGameBoard(char[][]chars) {

        for(int row= 0;row<3;row++){
            for(int column=0;column<3;column++){
              boardPrinter(chars,row,column);
            }

            System.out.println();

        }

    }

    private void boardPrinter(char[][]chars,int row,int column){
        gameBoard[row][column]= chars[row][column];
        System.out.print(gameBoard[row][column]);
    }

    protected boolean isPossibleWinningCombination(){
        boolean isValue= possibleWinningCombinations.isWinningCombinations(gameBoard);
        return isValue;
    }
}
