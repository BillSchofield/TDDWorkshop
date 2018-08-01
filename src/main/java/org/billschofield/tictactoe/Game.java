package org.billschofield.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static java.lang.Integer.*;

public class Game {
    private Board board;
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Player playerOne;

    public Game(Board board, PrintStream printStream, BufferedReader bufferedReader, Player playerOne) {
        this.board = board;
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.playerOne = playerOne;
    }

    public void start() {
        board.draw();
        int playerOnesMove = determinePlayerOneMove();
        board.mark(playerOnesMove);
        board.mark(playerOne.nextMove());
        board.draw();
    }

    private int determinePlayerOneMove() {
        printStream.println("Player 1, enter a number indicating where you want to mark the board");
        String locationString = readLine();
        int playerOnesMove = parseInt(locationString);
        return playerOnesMove;
    }

    private String readLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
