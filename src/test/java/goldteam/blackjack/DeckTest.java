package goldteam.blackjack;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    Deck cardsInDeck = new Deck();


    @Test
    void getCardsTest() {
        cardsInDeck.populate();

        Card expected = new Card(Rank.ACE, Suit.CLUB);

        Card actual = cardsInDeck.getCardByIndex(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void getDeckSizeTest() {
        cardsInDeck.populate();
        Integer expected = 52;

        Integer actual = cardsInDeck.getDeckSize();

        Assert.assertEquals(expected, actual);
    }

    @Test
    void giveCardTest() {
        cardsInDeck.populate();
        Card expected = cardsInDeck.getCardByIndex(0);

        Card actual = cardsInDeck.giveCard();

        Assert.assertEquals(expected,actual);


    }

    @Test
    void getCardTest(){
        cardsInDeck.populate();
        Suit expected_suit = Suit.CLUB;
        Integer expected_rank = Rank.ACE.getValue();

        Suit actual_suit = cardsInDeck.getCardByIndex(0).getSuit();
        Integer actual_rank = cardsInDeck.getCardByIndex(0).getRankValue();


        Assert.assertEquals(expected_suit,actual_suit);
        Assert.assertEquals(expected_rank,actual_rank);

    }

    @Test
    void populateTest() {
        cardsInDeck.populate();
        Suit expected_suit = Suit.SPADE;
        Integer expected_rank = Rank.KING.getValue();
        Integer expected_size = 52;

        Suit actual_suit = cardsInDeck.getCardByIndex(51).getSuit();
        Integer actual_rank = cardsInDeck.getCardByIndex(51).getRankValue();
        Integer actual_size = cardsInDeck.getDeckSize();

        Assert.assertEquals(expected_suit,actual_suit);
        Assert.assertEquals(expected_rank,actual_rank);
        Assert.assertEquals(expected_size,actual_size);
    }

}