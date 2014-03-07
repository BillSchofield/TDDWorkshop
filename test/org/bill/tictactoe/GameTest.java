package org.bill.tictactoe;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {

    @Test
    public void shouldDrawBoardWhenPlayingGame() {
        // Arrange
        Board board = mock(Board.class);
        Game game = new Game(board);

        // Action
        game.play();

        // Assert
        verify(board).print();
    }
}
