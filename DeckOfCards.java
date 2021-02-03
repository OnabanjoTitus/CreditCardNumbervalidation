import java.security.SecureRandom;

public class DeckOfCards {
    private static DeckOfCards deckOfCards = new DeckOfCards();
    private Card[] deck;
    private int currentCard;
    private static int Number_Of_Cards = 52;
    private static final SecureRandom randomNumbers = new SecureRandom();

    public static DeckOfCards getInstanceOfDeckOFCards() {
        return deckOfCards;
    }

    public void populateDeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        deck = new Card[Number_Of_Cards];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++) {
            deck[count] =
                    new Card(faces[count % 13], suits[count / 13]);
        }
    }

    public String classCreation(){
        return "done";
    }
    public void shuffle(){
     currentCard=0;
        for (int first = 0; first < deck.length; first++){

            int second = randomNumbers.nextInt(Number_Of_Cards);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    public Card dealCard(){
         if (currentCard < deck.length)
             return deck[currentCard++];
         else
        return null;
         }
}



