package amash.CardGenerator;

import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Stack;


public final class DeckOfCardsGenerator {

    public static Stack<Card>getDeck() {
        return generateNewDeck();
    }

    private static Stack<Card>generateNewDeck(){
        Stack<Card> deck = new Stack<>();
        for (int suitCount = 0; suitCount <= (Deck.getAmountOfSuit()); suitCount++){
            for(int i = 1; i <= Deck.getAmountInSuit(); i++){
                Card card = new Card(i,suitCount);
                deck.push(card);
            }
        }
        Collections.shuffle(deck);
        return deck;
    }



}
