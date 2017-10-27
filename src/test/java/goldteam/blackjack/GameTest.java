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
    public void setActivePlayerTest() {
        game.initializeGame();
        ArrayList<Player> players = game.getPlayers();
        game.setActivePlayer(players.get(1));

        Player expected = players.get(1);

        Player actual = game.getActivePlayer();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void giveCardToPlayerTest() {
        game.initializeGame();
        Player dealer = game.getPlayerAtIndex(0);
        game.giveCardToPlayer();
        ArrayList cards = dealer.getHandList();

        int expected = 1;


        int actual = cards.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void endTurnTest() {
        game.initializeGame();
        game.endTurn();
        //game

        //Player expected =

    }

}