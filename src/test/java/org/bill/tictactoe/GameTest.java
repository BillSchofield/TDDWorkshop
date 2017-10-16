package org.bill.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {

    private Board board;
    private Game game;
    private Player player;

    @Before
    public void setUp() throws Exception {
        board = mock(Board.class);
        player = mock(Player.class);
        game = new Game(board, player);
    }

    @Test
    public void shouldPrintBoardWhenGameStarts() {
        game.start();

        verify(board).print();
    }

    @Test
    public void playerShouldMoveWhenGameStarts() {
        game.start();

        verify(player).move();
    }

}
