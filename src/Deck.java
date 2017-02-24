import java.util.ArrayList;

/**
 * Created by Bartosz Hanc on 2017-02-24.
 */
public class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>();

    public Deck(){}

    public void addCard(Card card){
        deck.add(card);
    }

    public void removeCard(int i){ // TODO: do better removeCard
        deck.remove(i);
    }
}
