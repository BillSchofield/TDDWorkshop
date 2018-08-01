package org.billschofield.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        Board board = new Board(printStream);
        Game game = new Game(board, printStream, new BufferedReader(new InputStreamReader(System.in)), new Player());
        game.start();
    }
}
