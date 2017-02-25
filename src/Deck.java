import java.util.ArrayList;

/**
 * Created by Bartosz Hanc on 2017-02-24.
 */
public class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>();

    public Deck(){
        generateDeck();
    }

    public void addCard(Card card){
        deck.add(card);
    }

    public void removeCard(int i){ // TODO: do better removeCard
        deck.remove(i);
    }

    public void generateDeck(){
        for(int i = 0; i < 20; i++){
            deck.add(new Card("Karta " + (i+1) ));
        }
    }

    //Test method. To delete
    public void showDeck(){
        for(Card card : deck){
            System.out.println(card);
        }
    }
}
