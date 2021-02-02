public class Card {
private String faces;
private String suits;

    public Card(String faces, String suits) {
        this.faces = faces;
        this.suits = suits;
    }

    @Override
    public String toString() {
        return faces+ " of " +suits;
    }
}
