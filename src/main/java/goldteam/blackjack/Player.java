package goldteam.blackjack;

import java.util.ArrayList;

public class Player {

    private String name;
    private Double cash;
    private ArrayList<Card> cardsInHand;

    public Player(String name, Double cash) {
        this.name = name;
        this.cash = cash;
        this.cardsInHand = new ArrayList<Card>();
    }


    public String getName() {
        return name;
    }

    public Double checkBalance() {
        return cash;
    }

    public Double wager(Double wager) {
        cash -= wager;
        return wager;
    }

    public void addCardtoHand(Card newCard) {
        cardsInHand.add(newCard);
    }

    public String viewHand() {
        String handString = "";
        for (Card card : cardsInHand) {
            handString += card.toString();
        }
        return handString;
    }

    public int getHandValue() {
        int total = 0;
        int acesCount = 0;

        for (Card card : cardsInHand) {
            if (card.getRankValue() == 11)
                acesCount++;
            total += card.getRankValue();
        }

        if (total > 21) {
            while (acesCount > 0) {
                total -= 10;
                acesCount--;
            }
        }
        return total;
    }

    public ArrayList<Card> getHandList() {
        return cardsInHand;
    }

    public void addWinnings(Double winnings) {
        cash += winnings;
    }


}
