package goldteam.blackjack;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players = new ArrayList<Player>();
    private Player activePlayer;
    private static final int  BLACKJACK = 21;

    public Game() {
        initializeGame();
    }

    protected void initializeGame() {
        Deck deck = new Deck();
        Player dealer = new Player("dealer", 1000.0);
        Player player = new Player("Playa' 1", 1000.0);
        players.add(dealer);
        players.add(player);
        activePlayer = dealer;

    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setActivePlayer(Player player) {
        this.activePlayer = player;
    }

    public Player getActivePlayer() {
        return activePlayer;
    }

    public void giveCardToPlayer(Player player, Deck deck) {
        player.addCardtoHand(deck.giveCard());
    }

    public void endTurn(Player activePlayer) {
        for(Player player:players) {
            if(!activePlayer.equals(player))
                this.activePlayer = player;
        }
    }

    public void giveCardToPlayer(){

    }



    //public


}
