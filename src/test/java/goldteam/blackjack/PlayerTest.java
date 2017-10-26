package goldteam.blackjack;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PlayerTest {

    Player player = new Player("Elliott", 300.00);

    @Test
    public void getNameTest() {
        String expected = "Elliott";

        String actual = player.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkBalancetest() {
        Double expected = 300.0;
        Double actual = player.checkBalance();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wagerTest() {
        Double expected = 20.0;

        Double actual=player.wager(20.0);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkBalanceAfterWager(){

       Double expected=200.0;

       player.wager(100.0);

       Double acutal=player.checkBalance();

       Assert.assertEquals(expected,acutal);
    }

    @Test
    public void addCardToHandAndViewHandTest(){

        Card card=new Card();
        String expected=card.toString();

        player.addCardtoHand(card);

        String actual=player.viewHand();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHandValueTest(){

        Card card = new Card();
        Card card2 = new Card();
        player.addCardtoHand(card);

        int expected = 0;

        int actual = player.getHandValue();

        Assert.assertEquals(expected, actual);
    }
}

