public class Card {
    private static Card card = new Card();
    private  String face;
    private  String suit;

    public static Card getInstance() {
        return card;
    }
    public void setCards(String face,String suit){
        this.suit=suit;
        this.face=face;
    }

    @Override
    public String toString() {
        return face +"of"+ suit;
    }
}
