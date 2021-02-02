import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CardTest {
    Card card;

    @BeforeEach
    void setUp() {
        card = Card.getInstance();
    }

    @AfterEach
    void tearDown() {
        card =null;
    }
    @Test
    void testThatTheSingleInstanceOfTheClassCardHasBeenCreated(){
        String faces="";
        String suits="";
    card.setCards(faces,suits);
    }
    @Test
    void testThatFacesAndSuitsHaveBeenCreated(){
        String faces=null;
        String suits=null;
        String cards= faces +"of"+ suits;
        assertEquals(cards,card.toString());
    }
}