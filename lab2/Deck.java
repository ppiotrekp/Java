package pl.ppyrczak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    List<Card> deck = new ArrayList<>();

    public Deck getSortedDeck(){
        for(Rank rank : Rank.values()){
            for(Suit suit : Suit.values()){
                deck.add(new Card(rank,suit));
            }
        }
        return this;
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public List<Card> getDeck() {
        return deck;
    }
    public List<Card> checkCards() {
        if(Card.)
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }


}