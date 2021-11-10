package pl.ppyrczak;

public class Main {
    public static void main(String[] args) {
//        Deck deck = new Deck();
//        deck.getSortedDeck();
//       // System.out.println(deck);
//        deck.shuffle();
//        System.out.println(deck);
//// game
//        System.out.println("\n=== GAME ===");
//
//        final int CARD_NUM = 5;
//        final int PLAYERS_NUM = 4;
//        Player[] players = new Player[PLAYERS_NUM];
//        for (int i = 0; i < players.length; i++){
//            players[i] = new Player("Player"+i);
//        }
//
//        for(int i = 0; i < CARD_NUM; i++){
//            for(int j = 0; j < PLAYERS_NUM; j++){
//                players[j].addCard(deck.getDeck().get(i*PLAYERS_NUM+j));
//            }
//        }
//        int p = 1;
//
//        for(Player player: players){
//            System.out.println("Player number " + p + " " + player.getCards());
//            p ++;
//            System.out.println();
//        }
        Game game = new Game(1);
        System.out.println();
        game.nextGame();
    }


}
