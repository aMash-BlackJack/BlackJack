package amash.CardGenerator;

public class Deck {
    private final String[] suitTypes = {"Hearts", "Spades", "Clubs", "Diamonds"};
    private final String[] faceTypes = {"Jack", "Queen", "King", "False"};
    private static final int amount = 52;
    private static final int amountInSuit = 13;
    private static final int amountOfSuit = 3;
    public static int getAmount() {
        return amount;
    }
    public static int getAmountInSuit(){
        return amountInSuit;
    }
    public static int getAmountOfSuit() {return amountOfSuit; }
    public String[] getSuitTypesFromDeck(){
    return suitTypes;
    }
    public String[] getFaceCardTypesFromDeck(){
        return faceTypes;
    }

}
