package org.billschofield.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PlayerTest {

    private BufferedReader bufferedReader;
    private Player player;

    @Before
    public void setUp() {
        bufferedReader = mock(BufferedReader.class);
        player = new Player();
    }

    @Test
    public void shouldMoveWhereThePlayerChoose() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        int move = player.nextMove();

        assertThat(move, is(1));
    }

    @Test
    public void shouldMarkTheBoardWhenThePlayerMovesInLocationOneThousand() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1000");

        int move = player.nextMove();

        assertThat(move, is(1000));
    }
}