package org.designs.TicTacToe.GameContext;

import org.designs.TicTacToe.Entities.Player;

public interface GameState {
    void next(GameContext context, Player player , boolean hasWon);
    boolean isGameOver();
}
