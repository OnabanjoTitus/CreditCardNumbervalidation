public class PrintGamePlayingBoard {
    private  int [][]gameBoard=new int[3][3];


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

   protected boolean possibleWinningCombinations() {
    boolean validity=false;
        if ((gameBoard[0][0])!=(0))
        {
            if(gameBoard[0][0]==gameBoard[1][0] &&   gameBoard[0][1]==gameBoard[2][0]){
                validity=true;
            }
        }
        if ((gameBoard[0][1])!=(0))
        {
            if(gameBoard[0][1]==gameBoard[1][1] && gameBoard[0][1]==gameBoard[2][1])
                validity=true;
        }
        if ((gameBoard[0][2])!=(0))
        {
            if(gameBoard[0][2]==gameBoard[1][2] && gameBoard[0][2]==gameBoard[2][2])
                validity=true;
        }
        if ((gameBoard[0][0])!=(0))
        {
            if(gameBoard[0][0]==gameBoard[0][1] && gameBoard[0][0]==gameBoard[0][2])
                validity=true;
        }
        if ((gameBoard[1][0])!=(0))
        {
            if(gameBoard[1][0]==gameBoard[1][1] && gameBoard[1][0]==gameBoard[1][2])
            validity=true;
        }
        if ((gameBoard[2][0])!=(0))
        {
            if(gameBoard[2][0]==gameBoard[2][1] && gameBoard[2][0]==gameBoard[2][2])
                validity=true;
        }
        if ((gameBoard[0][0])!=(0))
        {
            if(gameBoard[0][0]==gameBoard[1][1] && gameBoard[0][0]==gameBoard[2][2])
                validity=true;
        }

        return validity;
    }
}
