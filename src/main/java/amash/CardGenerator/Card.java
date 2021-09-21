package amash.CardGenerator;

public class Card extends Deck{


    private int cardValue;
    private String suit;
    private boolean isFaceType;
    private String faceCardType;

    public Card(int cardValue, int cardSuitType) {
        setCardValue(cardValue);
        setSuitByInt(cardSuitType);
        setFaceTypeByInt(cardValue);
    }


    private void setSuitByInt(int cardSuitType){
       switch(cardSuitType){
           default: setSuit("Failed");
           break;
            case 0: setSuit(getSuitTypesFromDeck()[0]);
            break;
            case 1: setSuit(getSuitTypesFromDeck()[1]);
            break;
            case 2: setSuit(getSuitTypesFromDeck()[2]);
            break;
            case 3: setSuit(getSuitTypesFromDeck()[3]);
            break;
        }
    }
    private void setFaceTypeByInt(int cardSuitType){
        switch (cardValue) {
            case 11: setFaceCardType(getFaceCardTypesFromDeck()[0]);
                setFaceType(true);
                break;
            case 12: setFaceCardType(getFaceCardTypesFromDeck()[1]);
                setFaceType(true);
                break;
            case 13: setFaceCardType(getFaceCardTypesFromDeck()[2]);
                setFaceType(true);
                break;
            default: setFaceCardType(getFaceCardTypesFromDeck()[3]);
                setFaceType(false);
                break;
        }
    }

    public boolean isFaceCard() {
        return isFaceType;
    }

    public void setFaceType(boolean faceType) {
        isFaceType = faceType;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public String getFaceCardType() {
        return faceCardType;
    }

    public void setFaceCardType(String faceCardType) {
        this.faceCardType = faceCardType;
    }
}
