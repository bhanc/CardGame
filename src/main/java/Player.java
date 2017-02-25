package main.java;

/**
 * Created by Bartosz Hanc on 2017-02-24.
 */
public class Player {
    private Deck deck;

    public Player(){
        this.deck = new Deck();
    };
    public Player(Deck deck){
        this.deck = deck;
    }

    public Deck getDeck() {
        return deck;
    }
}
