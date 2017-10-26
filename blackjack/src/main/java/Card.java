public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
    }


    public int getRankValue() {
        return rank.getValue();
    }

    public Suit getSuit() {
        return suit;
    }
}
