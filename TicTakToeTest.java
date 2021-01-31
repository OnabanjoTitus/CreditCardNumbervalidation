import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicTakToeTest {
    TicTakToe ticTakToe;

    @BeforeEach
    void setUp() {
        ticTakToe = new TicTakToe();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatTheEntireBoardIsCreated(){
        ticTakToe.startNewGame();
        char [][] chars = new char[3][3];
        assertArrayEquals(chars,ticTakToe.getGameBoard());
    }
    @Test
    void testThatEntireBoardIsEmptyOnCreation(){
        ticTakToe.startNewGame();
        char [][] chars = new char[3][3];
        assertArrayEquals(chars,ticTakToe.getGameBoard());
    }
    @Test
    void testThatArrayElementsCanBeAltered(){
        ticTakToe.startNewGame();
        ticTakToe.markASpot(1,1);
        assertEquals(1,ticTakToe.getGameBoard()[0][0]);
    }
    @Test
    void testThatArrayElementsCanBeMarkedMoreThanOnce(){
        ticTakToe.startNewGame();
        ticTakToe.markASpot(1,1);
        ticTakToe.markASpot(1,2);
        assertEquals(1,ticTakToe.getGameBoard()[0][0]);
        assertEquals(1,ticTakToe.getGameBoard()[0][1]);
    }
    @Test
    void testThatItMarksConsecutiveInputsDifferently(){
        ticTakToe.startNewGame();
        ticTakToe.markASpot(1,1);
        ticTakToe.markASpot(1,2);
        ticTakToe.markASpot(1,3);
        assertEquals(1,ticTakToe.getGameBoard()[0][0]);
        assertEquals(2,ticTakToe.getGameBoard()[0][1]);
        assertEquals(1,ticTakToe.getGameBoard()[0][2]);
    }
    @Test
    void testThatASpotCanNotBeMarkedTwiceOnATheSameBoard(){
        ticTakToe.startNewGame();
        ticTakToe.markASpot(2,2);
        ticTakToe.markASpot(2,2);
        ticTakToe.markASpot(2,3);
       assertEquals(1,ticTakToe.getGameBoard()[1][1]);
       assertEquals(2,ticTakToe.getGameBoard()[1][2]);
   }
   @Test
    void testThatGameCanBeWon(){
        ticTakToe.startNewGame();
        ticTakToe.markASpot(1,1);
        ticTakToe.markASpot(2,2);
        ticTakToe.markASpot(2,1);
        ticTakToe.markASpot(3,2);
        ticTakToe.markASpot(3,1);
        assertTrue(ticTakToe.WeHaveAWinner());

   }
   @Test
    void testThatGameBoardCanBeDisplayedAfterValidatingWinnerOrEndOfGame(){
       ticTakToe.startNewGame();
       ticTakToe.markASpot(1,1);
       ticTakToe.markASpot(2,2);
       ticTakToe.markASpot(2,1);
       ticTakToe.markASpot(3,2);
       ticTakToe.markASpot(3,1);
       ticTakToe.WeHaveAWinner();

   }
}