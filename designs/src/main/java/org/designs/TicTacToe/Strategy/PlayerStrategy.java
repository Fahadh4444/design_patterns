package org.designs.TicTacToe.Strategy;

import org.designs.TicTacToe.Entities.Board;
import org.designs.TicTacToe.Entities.Position;

public interface PlayerStrategy {
    public Position makeMove(Board board);
}
