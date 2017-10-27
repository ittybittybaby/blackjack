package goldteam.blackjack;

import java.util.ArrayList;

public class  Game {

    private ArrayList<Player> players = new ArrayList<Player>();
    private Player activePlayer;
    private static final int  BLACKJACK = 21;
    protected Deck deck;

    public Game() {
        initializeGame();
    }

    protected void initializeGame() {
        deck = new Deck();
        deck.populate();
        deck.shuffleDeck();
        Player dealer = new Player("dealer", 1000.0);
        Player player = new Player("Playa' 1", 1000.0);
        players.add(dealer);
        players.add(player);
        activePlayer = dealer;
        giveCardToPlayer();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player getPlayerAtIndex(int index) {
        return players.get(index);
    }

    public void setActivePlayer(Player player) {
        this.activePlayer = player;
    }

    public Player getActivePlayer() {
        return activePlayer;
    }

    public void giveCardToPlayer() {
        Card card = this.deck.giveCard();
        this.activePlayer.addCardToHand(card);
    }

    public void endTurn() {
        for(Player player:players) {
            if(!activePlayer.equals(player))
                this.activePlayer = player;
        }
    }


}
