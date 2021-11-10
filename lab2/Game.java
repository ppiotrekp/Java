package pl.ppyrczak;


import java.util.Scanner;
import java.util.Set;

public class Game {
    private int ID;
    Game(int ID) {
        this.ID = ID;
        System.out.println("ID of the game: " + ID);
    }
    public void nextGame() {
        Deck deck = new Deck();
        deck.getSortedDeck();
        // System.out.println(deck);
        deck.shuffle();
        System.out.println(deck);
// game
        System.out.println("\nNEW GAME ");
        int ante;
        Scanner scanner = new Scanner(System.in);

        final int CARD_NUM = 2;
        final int PLAYERS_NUM = 4;
        Player[] players = new Player[PLAYERS_NUM];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Player" + i);
        }

        for (int i = 0; i < CARD_NUM; i++) {
            for (int j = 0; j < PLAYERS_NUM; j++) {
                players[j].addCard(deck.getDeck().get(i * PLAYERS_NUM + j));
            }
        }
        int p = 1;

        for (Player player : players) {
            System.out.println("What is your ante player number " + p + " ? ");
            ante = scanner.nextInt();
            System.out.println("Player number " + p + ", ante is: " + ante + "zl, " + player.getCards());
            p++;
            System.out.println();
        }

        System.out.println();

        for (Player player : players) {
           // System.out.println(player.getCards());
           // player.checkCards(); //nie dziala
    }

    }
}

