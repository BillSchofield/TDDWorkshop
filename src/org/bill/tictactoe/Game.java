package org.bill.tictactoe;

public class Game {
    private Board board;

    public Game(Board board) {

        this.board = board;
    }

    public void play() {
        board.print();
    }
}
