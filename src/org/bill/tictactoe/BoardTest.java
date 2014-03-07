package org.bill.tictactoe;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;

public class BoardTest {

    @Test
    public void shouldPrintEmptyBoard(){
        PrintStream printStream = mock(PrintStream.class);
        new Board(printStream).print();
        Mockito.verify(printStream).println(
                   "  |   |  \n"
                 + "---------\n"
                 + "  |   |  \n"
                 + "---------\n"
                 + "  |   |  \n"
        );
    }
}
