package org.bill.tictactoe;

public class Main {

    public static void main(String[] args) {

        Board board = new Board(System.out);
        Game game = new Game(board, new Player());
        game.start();
    }
}
