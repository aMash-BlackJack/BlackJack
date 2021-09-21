package amash.CardGenerator;

import java.util.Stack;

public class BlackJackGameRules {

    public static void applyBlackJackGameRules(Stack<Card> deck){
        for (Card c:deck)
        {
            if(c.isFaceCard()){
                c.setCardValue(10);
            }
        }
    }
}
