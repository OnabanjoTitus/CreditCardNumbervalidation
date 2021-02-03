import java.util.InputMismatchException;

public class Card {
private String faces;
private String suits;

    public Card(String faces, String suits) {
       try {
           this.faces = faces;

        this.suits = suits;}
       catch (InputMismatchException inputMismatchException){
           System.err.println("Invalid input entered");
       }
    }

    @Override
    public String toString() {
        return faces+ " of " +suits;
    }
}
