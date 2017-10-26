package goldteam.blackjack;

import java.util.ArrayList;

public class Game {

    public ArrayList<Player> players = new ArrayList<Player>();
    private Player activePlayer;
    private static final int BLACKJACK = 21;

    public Game() {
        initializeGame();
    }

    protected void initializeGame() {
        Deck deck = new Deck();
        Player dealer = new Player();
        Player player = new Player();
        players.add(dealer);
        players.add(player);

    }

    public Player getPlayer(Player player) {
        int target = players.indexOf(player);
        return players.get(target);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void

    public Player getActivePlayer() {
        return activePlayer;
    }

    public void endTurn(Player activePlayer) {
        for (Player player : players) {
            if (!activePlayer.equals(player))
                this.activePlayer = player;
        }
    }

    public void playerDrawCard(Player player) {
        player.addCard();
    }

    public int calculateHandValue(Player player) {
        ArrayList hand = player.getHand();
    }
    //public


}
