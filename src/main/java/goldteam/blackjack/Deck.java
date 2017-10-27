package goldteam.blackjack;

import goldteam.blackjack.Card;
import goldteam.blackjack.Rank;
import goldteam.blackjack.Suit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Deck{

    private ArrayList<Card> cards = new ArrayList<Card>(52);


    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getDeckSize(Deck deck) {
        return deck.cards.size();
    }

    public void shuffleDeck(Deck deck) {
        ArrayList<Card> cards = deck.getCards();
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
            for (int j = 1; j < 13; j++) {
                Rank[] rankArray = new Rank[]{Rank.ACE, Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE, Rank.SIX, Rank.SEVEN, Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING};

                /*Suit suit = array[i];
                Rank rank = Rank();*/
                Card card = new Card(rankArray[j], suitArray[i]);
                cards.add(card);

            }


        }

    }

}

