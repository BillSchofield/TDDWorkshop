package org.bill.tictactoe;

public class Game {
    private Board board;
    private Player player;

    public Game(Board board, Player player) {
        this.board = board;
        this.player = player;
    }

    public void start() {
        board.print();
        player.move();
    }
}
