import org.junit.Assert;
import org.junit.Test;
import sun.misc.ASCIICaseInsensitiveComparator;

public class CardTest {

    @Test
    public void Card() {
        //: Given
        Card card = new Card(Rank.ACE, Suit.CLUB);
        int expected =  11;
        //: When
        int actual= card.getRankValue();
        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CardSuit(){
        //: Given
        Card card = new Card(Rank.ACE, Suit.HEART);
        Suit expected = Suit.HEART;
        //: When
        Suit actual = card.getSuit();
        //: Then
        Assert.assertEquals(expected, actual);

    }
}
