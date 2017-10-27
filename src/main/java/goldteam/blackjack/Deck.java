package goldteam.blackjack;

import java.util.ArrayList;
import java.util.Collections;


public class Deck{

    private ArrayList<Card> cards = new ArrayList();

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getDeckSize() {
        return cards.size();
    }

    public Card getCardByIndex(int index) {
        return cards.get(index);
    }

    public void shuffleDeck() {
        ArrayList<Card> cards = this.getCards();
        Collections.shuffle(cards);
    }

    public Card giveCard() {
        Card given = cards.get(0);
        cards.remove(0);
        return given;
    }

    public void populate() {
        cards = new ArrayList();

        for (int i = 0; i < 4; i++) {
            Suit[] suitArray = new Suit[]{Suit.CLUB, Suit.DIAMOND, Suit.HEART, Suit.SPADE};
            for (int j = 0; j < 13; j++) {
                Rank[] rankArray = new Rank[]{Rank.ACE, Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE, Rank.SIX, Rank.SEVEN, Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING};

                Card card = new Card(rankArray[j], suitArray[i]);
                cards.add(card);

            }


        }

    }

}

