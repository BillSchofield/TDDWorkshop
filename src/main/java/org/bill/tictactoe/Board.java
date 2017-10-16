package org.bill.tictactoe;

import java.io.PrintStream;

public class Board {
    private PrintStream out;

    public Board(PrintStream out) {
        this.out = out;
    }

    public void print() {
        out.println(
              "  |   |  \n"
            + "---------\n"
            + "  |   |  \n"
            + "---------\n"
            + "  |   |  \n"
        );
    }
}
