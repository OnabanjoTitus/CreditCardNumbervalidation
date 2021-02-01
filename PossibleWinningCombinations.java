public class PossibleWinningCombinations {
    private  int [][]gameBoard=new int[3][3];



    public boolean isWinningCombinations(int [][]value){
        boolean values;
        arraySortersForGameRules(value);
        values=isPossibleWinningCombinations();
        return values;

    }


    private void arraySortersForGameRules(int [][]value){

        for(int row= 0;row<3;row++){
            for(int column=0;column<3;column++){
                gameBoard[row][column]= value[row][column];
            }
        }
    }



    private boolean isPossibleWinningCombinations() {
        boolean validity=false;
        if ((gameBoard[0][0])!=(0))
        {
            if(gameBoard[0][0]==gameBoard[1][0] &&   gameBoard[0][0]==gameBoard[2][0]){
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
        if ((gameBoard[0][2])!=(0))
        {
            if(gameBoard[0][2]==gameBoard[1][1] && gameBoard[0][2]==gameBoard[2][0])
                validity=true;
        }

        return validity;
    }
}
