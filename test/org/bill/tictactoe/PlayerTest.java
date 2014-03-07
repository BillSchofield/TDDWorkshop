package org.bill.tictactoe;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlayerTest {

    @Test
    public void shouldMarkBoardWhereTheUserChoosesWhenTheyMove() throws IOException {
        Board board = mock(Board.class);
        BufferedReader in = mock(BufferedReader.class);
        String location = "0";
        when(in.readLine()).thenReturn(location);
        Player player = new Player(board, in);

        player.move();

//  Continue here
//        verify(board).mark(location);

    }
}
