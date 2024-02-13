import java.util.Arrays;
public class Deck {
    private Card[] deck;

    public Deck() {
        deck = new Card[52];
        int index = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Card.Rank.values()) {
                deck[index++] = new Card(suit, rank);
            }
        }
    }

    public void print() {
        Arrays.stream(deck).forEach(System.out::println);
    }
}
