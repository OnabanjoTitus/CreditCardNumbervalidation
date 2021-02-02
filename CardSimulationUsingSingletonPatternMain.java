public class CardSimulationUsingSingletonPatternMain {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = DeckOfCards.getInstanceOfDeckOFCards();
        deckOfCards.populateDeckOfCards();
        deckOfCards.shuffle();
        for(int i=0;i<52;i++){
            System.out.printf("%-19s",deckOfCards.dealCard());
            if(i%5==0){
                System.out.println();
            }
        }
    }
}
