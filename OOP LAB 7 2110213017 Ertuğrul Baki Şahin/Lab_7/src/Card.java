public class Card {
    enum  Rank {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }

    enum Suit {
        DIOMAND,
        CLUB,
        HEART,

    }

    public Card() {

    }
    private Rank Rank;
    private Suit Suit;
    private int Value;
    private String toString;

    public int getRank() {return rank;}
    public int getSuit() {
        return suit;
    }
    public int getValue () {
        return Rank.Value;
    }
    public String toSting() {
        System.out.println(getSuit());
        System.out.

    }

}
