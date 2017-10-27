package goldteam.blackjack;

import goldteam.blackjack.Card;
import goldteam.blackjack.Rank;
import goldteam.blackjack.Suit;
import org.junit.Assert;
import org.junit.Test;

public class CardTest {

    @Test
    public void Card() {

        Card card = new Card(Rank.ACE, Suit.CLUB);
        int expected =  11;

        int actual= card.getRankValue();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CardSuit(){

        Card card = new Card(Rank.ACE, Suit.HEART);
        Suit expected = Suit.HEART;

        Suit actual = card.getSuit();

        Assert.assertEquals(expected, actual);

    }
}
