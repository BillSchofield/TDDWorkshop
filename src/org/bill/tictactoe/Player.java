package org.bill.tictactoe;

import java.io.BufferedReader;

public class Player {
    private Board board;

    public Player(Board board, BufferedReader in) {
        this.board = board;
    }

    public void move() {
        board.mark("");
    }
}
