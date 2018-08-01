package org.billschofield.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class GameTest {

    private Board board;
    private Game game;
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Player playerOne;

    @Before
    public void setUp() {
        board = mock(Board.class);
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        playerOne = mock(Player.class);
        game = new Game(board, printStream, bufferedReader, playerOne);
    }

    @Test
    public void shouldDrawTheBoardTwiceWhenTheGameStarts() throws IOException {
        when(bufferedReader.readLine()).thenReturn("-1");
        game.start();

        verify(board, times(2)).draw();
    }

    @Test
    public void shouldPromptPlayerOneToMoveWhenTheGameStarts() throws IOException {
        when(bufferedReader.readLine()).thenReturn("-1");
        game.start();

        verify(printStream).println("Player 1, enter a number indicating where you want to mark the board");
    }


    @Test
    public void shouldMarkTheBoardWherePlayerOneMoves() throws IOException {
        when(bufferedReader.readLine()).thenReturn("-1");
        when(playerOne.nextMove()).thenReturn(7);

        game.start();

        verify(board).mark(7);
    }

    @Test
    public void shouldMarkTheBoardWhenThePlayerMovesInLocationOneAndTheGameStarts() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");

        game.start();

        verify(board).mark(1);
    }

    @Test
    public void shouldMarkTheBoardWhenThePlayerMovesInLocationOneThousandAndTheGameStarts() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1000");

        game.start();

        verify(board).mark(1000);
    }
}