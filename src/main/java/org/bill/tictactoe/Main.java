package org.bill.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        Board board = new Board(System.out);
        BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        Game game = new Game(board);
        game.start();
    }
}
