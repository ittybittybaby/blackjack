package goldteam.blackjack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Game game = new Game();

    @Test
    public void initializeGameTest() {
        int expected = 2;
        int actual = game.getPlayers().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void endTurnTest


}