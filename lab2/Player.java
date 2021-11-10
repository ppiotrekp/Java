package pl.ppyrczak;


import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Player {
    private String name;
    private String ID;
    private int ante;
    private Set<Card> cards;
    private Map<Suit, Rank> cards1;

    public Player(String name){

        this.name = name;
        cards = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Card> getCards() {
        return cards;
    }


//    public void checkCards(Set<Card> card) {
//        if( card.contains("SIX")) {
//            System.out.println("AAAAA");
//        }

    public void addCard(Card card) {
        cards.add(card);
    }


}