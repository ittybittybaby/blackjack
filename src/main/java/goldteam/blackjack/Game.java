package goldteam.blackjack;

import java.util.ArrayList;

public class  Game {

    private ArrayList<Player> players = new ArrayList<Player>();
    private Player activePlayer;
    private static final int  BLACKJACK = 21;

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

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player getActivePlayer() {
        return activePlayer;
    }

    public void endTurn(Player activePlayer) {
        for(Player player:players) {
            if(!activePlayer.equals(player))
                this.activePlayer = player;
        }
    }

    public void giveCardToPlayer(Player player, Deck deck){
        return;
    }

    public void setActivePlayer(Player player){

    }

    public Player getActivePlayerByName(String name){

    }



    //public


}
