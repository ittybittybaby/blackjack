package goldteam.blackjack;
import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    Player player = new Player("Elliott", 300.00);

    @Test
    public void getNameTest() {
        String expected = "Elliott";

        String actual = player.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkBalanceTest() {
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
    public void checkBalanceAfterWagerTest(){

       Double expected=200.0;

       player.wager(100.0);

       Double acutal=player.checkBalance();

       Assert.assertEquals(expected,acutal);
    }

    @Test
    public void addCardToHandAndViewHandTest(){

        Card card=new Card(Rank.TWO,Suit.DIAMOND);
        String expected=card.toString();

        player.addCardToHand(card);

        String actual=player.viewHand();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHandValueTest(){

        Card card = new Card(Rank.ACE,Suit.SPADE);
        Card card2 = new Card(Rank.TEN,Suit.HEART);
        player.addCardToHand(card);

        int expected = 11;

        int actual = player.getHandValue();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHandValueTestAces(){


        Card card = new Card(Rank.TWO,Suit.SPADE);

        for (int i=0; i<8; i++)
        player.addCardToHand(card);

        player.addCardToHand(new Card(Rank.ACE,Suit.DIAMOND));
        player.addCardToHand(new Card(Rank.ACE,Suit.DIAMOND));

        int expected = 18;

        int actual = player.getHandValue();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getWinningsTest(){
        Double expected=600.0;

        player.addWinnings(300.0);
        Double actual=player.checkBalance();

        Assert.assertEquals(expected,actual);
    }
}

