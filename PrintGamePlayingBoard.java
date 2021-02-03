import java.util.InputMismatchException;

public class PrintGamePlayingBoard {

    private final int [][]gameBoard=new int[3][3];
    PossibleWinningCombinations possibleWinningCombinations= new PossibleWinningCombinations();

    public void printGameBoard(char[][]chars) {

       try {
           for(int row= 0;row<3;row++){
               for(int column=0;column<3;column++){
                   boardPrinter(chars,row,column);
               }

               System.out.println();

           }
       }catch (InputMismatchException inputMismatchException){
           System.err.println("Invalid input");
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
