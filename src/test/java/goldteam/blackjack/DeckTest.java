package goldteam.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    Deck deck=new Deck();
    @Test
    void getCards() {
    }

    @Test
    void getDeckSize() {

    }

    @Test
    void shuffleDeck() {
    }

    @Test
    void giveCard() {
    }

    @Test
    void populate() {
        deck.populate();
        System.out.println(deck.getCards().get(3).getSuit());
    }

}