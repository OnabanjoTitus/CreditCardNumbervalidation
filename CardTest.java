import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CardTest {
    Card card;
    DeckOfCards deckOfCards;

    @BeforeEach
    void setUp() {
    String faces=null;
    String suits=null;

        card = new Card(suits,faces);
        deckOfCards=DeckOfCards.getInstanceOfDeckOFCards();
    }

    @AfterEach
    void tearDown() {
        card =null;
    }
    @Test
    void testThatClassCardHasBeenCreated(){
        String faces=null;
        String suits=null;
    assertEquals(faces+ " of " +suits,card.toString());
    }
    @Test
    void testThatDeckOfCardsHasBeenCreated(){
        assertEquals("done",deckOfCards.classCreation());
    }
    @Test
    void testThatDeckOfCardsCanBePopulated(){
        deckOfCards.populateDeckOfCards();
       assertNotNull( deckOfCards.dealCard());
    }
    @Test
    void testThatDeckOfCardsCanBeShuffled(){
        deckOfCards.populateDeckOfCards();
        Card deck[]={deckOfCards.dealCard()};
        deckOfCards.shuffle();
        assertNotEquals(deck,deckOfCards.dealCard());
    }
}