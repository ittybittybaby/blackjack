package goldteam.blackjack;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

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
    public void getPlayerTest() {
        ArrayList players = game.getPlayers();
        Player expected = (Player) players.get(1);
        Player player = (Player) players.get(0);

        Player actual = game.getPlayer(player);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void playerDrawCardTest() {
        ArrayList players = game.getPlayers();
        Player dealer = (Player)players.get(0);
        Player
    }


}