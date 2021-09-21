package amash.CardGenerator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Stack;

@SpringBootTest
class CardGeneratorApplicationTests {
    static Deck createdDeck = null;
    static Card createdCard = null;
    static Card createdCardHearts = null;
    static Card createdCardSpades = null;
    static Card createdCardClubs = null;
    static Card createdCardDiamonds = null;
    static Card createdCardFail = null;
    static Stack<Card> deckOfCards = null;
    static Stack<Card> deckOfCardsWithoutThirteen = null;


    @BeforeAll
    static void CreateDeck() {
        createdDeck = new Deck();
        createdCard = new Card(0, 0);
        createdCardHearts = new Card(1,0);
        createdCardSpades = new Card(11,1);
        createdCardClubs = new Card(12,2);
        createdCardDiamonds = new Card(13,3);
        createdCardFail = new Card(32,5);
        deckOfCards = DeckOfCardsGenerator.getDeck();
        deckOfCardsWithoutThirteen = DeckOfCardsGenerator.getDeck();
    }

    @Test
    @DisplayName("A test to see if a new deck is created")
    void CreateNewDeckTest() {
        assertTrue((createdDeck != null), "This test failed because a deck could not be instantiated");
    }

    @Test
    @DisplayName("A test to see if the amount in cards is equal to 52")
    void cardAmountTest() {
        assertEquals(amash.CardGenerator.Deck.getAmount(), 52, "This test failed because the amount variable in deck does not equal 52");
    }

    @Test
    @DisplayName("A test to see if the amount in cards suit is equal to 13")
    void cardAmountInSuitTest() {
        assertEquals(amash.CardGenerator.Deck.getAmountInSuit(), 13, "This test failed because the amount variable in deck does not equal 13");
    }

    @Test
    @DisplayName("A test to check that the suits are the correct values for a deck of cards")
    void faceCardTypeTest() {
        String[] suitTypes = {"Hearts", "Spades", "Clubs", "Diamonds"};
        assertArrayEquals(createdDeck.getSuitTypesFromDeck(), suitTypes, "This test failed because the types of suits were not the same");
    }

    @Test
    @DisplayName("A test to see if a new card is created")
    void createNewCardTest() {
        assertTrue((createdCard != null), "This test failed because a card could not be instantiated");
    }

    @Test
    @DisplayName("A test to see if a new card has the correctly inputted values after being instantiated")
    void createNewCardWithValuesTest() {
        createdCard.setCardValue(1);
        assertEquals( 1, createdCard.getCardValue(),"This Test failed because the cards value was not set");
    }

    @Test
    @DisplayName("A test to see if a new card has the correctly inputted suits after being instantiated")
    void suitTypeTest() {
        assertEquals("Hearts", createdCardHearts.getSuit(), "This test failed because the card type is not Hearts" );
        assertEquals( "Spades", createdCardSpades.getSuit(), "This test failed because the card type is not Spades" );
        assertEquals( "Clubs", createdCardClubs.getSuit(),"This test failed because the card type is not Clubs" );
        assertEquals( "Diamonds", createdCardDiamonds.getSuit(),"This test failed because the card type is not Diamonds" );
    }

    @Test
    @DisplayName("A test to see if a new card has the correctly inputted suits after being instantiated")
    void suitTypeFailTest() {
        assertEquals("Failed", createdCardFail.getSuit(), "This test failed because the card type is not failed" );
    }
    @Test
    @DisplayName("A test to see if a new card has the correctly inputted suits after being instantiated")
    void FaceCardTypeTest() {
        assertEquals("False", createdCardHearts.getFaceCardType(), "This test failed because the card type is not False" );
        assertEquals( "Jack", createdCardSpades.getFaceCardType(), "This test failed because the card type is not Jack" );
        assertEquals( "Queen", createdCardClubs.getFaceCardType(),"This test failed because the card type is not Queen" );
        assertEquals( "King", createdCardDiamonds.getFaceCardType(),"This test failed because the card type is not King" );
    }
    @Test
    @DisplayName("A test to see if a new card has the correctly identified the FaceCard")
    void isFaceCardTest() {
        assertTrue(createdCardClubs.isFaceCard());
    }

    @Test
    @DisplayName("A test to see if a new stack of cards can be generated")
    void newDeckCreationTest(){
        assertNotNull(deckOfCards);
    }
    @Test
    @DisplayName("A test to see if deck contains four suits")
    void newDeckContainsFourSuitsTest(){
        int iterator = 0;
        boolean exitClause = true;
        for (Card c: deckOfCards) {
            if (c.getSuit().equals("Diamonds") || c.getSuit().equals("Hearts") || c.getSuit().equals("Spades") || c.getSuit().equals("Clubs")){
                iterator++;
            } else {
            exitClause = false;
            }
        }
        assertTrue(exitClause);
        assertEquals(52, iterator);
    }

    @Test
    @DisplayName("A test to see if deck contains 13 cards of diamonds")
    void newDeckContainsThirteenCardsOfDiamondTest() {
        int i = 0;
        for (Card c : deckOfCards) {
            if (c.getSuit().equals("Diamonds")) {
                i++;
            }
        }
        assertEquals(13, i, "failed because there are not 13 cards int the diamond suit");
    }
    @Test
    @DisplayName("A test to see if deck contains 13 cards of hearts")
    void newDeckContainsThirteenCardsOfHeartsTest() {
        int i = 0;
        for (Card c : deckOfCards) {
            if (c.getSuit().equals("Hearts")) {
                i++;
            }
        }
        assertEquals(13, i, "failed because there are not 13 cards int the Hearts suit");
    }
    @Test
    @DisplayName("A test to see if deck contains 13 cards of Spades")
    void newDeckContainsThirteenCardsOfSpadesTest() {
        int i = 0;
        for (Card c : deckOfCards) {
            if (c.getSuit().equals("Spades")) {
                i++;
            }
        }
        assertEquals(13, i, "failed because there are not 13 cards int the Spades suit");
    }
    @Test
    @DisplayName("A test to see if deck contains 13 cards of Clubs")
    void newDeckContainsThirteenCardsOfClubsTest() {
        int i = 0;
        for (Card c : deckOfCards) {
            if (c.getSuit().equals("Diamonds")) {
                i++;
            }
        }
        assertEquals(13, i, "failed because there are not 13 cards int the Clubs suit");
    }

    @Test
    @DisplayName("A test to see if a new deck contains the correct values")
    void newDeckContainsCorrectCardValue(){
        int x = 0 ;
            for (Card c: deckOfCards) {
                x = x + c.getCardValue();
                }
                assertEquals(364, x, "total value of cards don't add up to 364");
            }

    @Test
    @DisplayName("A test to see if a deck has the game rules properly applied")
    void newDeckContainsNoCardsOfValueThirteenAfterGameRules(){
        BlackJackGameRules.applyBlackJackGameRules(deckOfCardsWithoutThirteen);
        boolean thirteenFound = false;
        for (Card c:deckOfCardsWithoutThirteen
             ) {
            if (c.getCardValue() == 13){
                thirteenFound = true;
            }
            assertFalse(thirteenFound);
        }
    }
}




