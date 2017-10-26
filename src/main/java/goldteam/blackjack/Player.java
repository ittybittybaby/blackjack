package goldteam.blackjack;
import java.util.ArrayList;

public class Player {

    private String name;
    private Double money;
    private ArrayList<Card> cardsInHand;

    public Player (String name, Double money){
        this.name=name;
        this.money=money;
        this.cardsInHand=new ArrayList<Card>();
    }


    public String getName(){return name;}

    public Double checkBalance(){return money;}

    public Double wager(Double wager){
        money-=wager;
        return wager;}

    public void addCardtoHand(Card newCard){
        cardsInHand.add(newCard);
    }

    public String viewHand() {
        String handString="";
        for (Card card : cardsInHand) {
            handString+= card.toString();
        }
        return handString;
    }

    public int getHandValue(){
        int total=0;
        for(Card card:cardsInHand){
            total+=card.getRankValue();}
        return total;
    }

    public ArrayList<Card> getHandList(){
        return cardsInHand;
    }


}
