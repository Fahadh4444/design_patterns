package org.designs.TicTacToe.GameContext.ConcreteGameStates;

import org.designs.TicTacToe.Entities.Player;
import org.designs.TicTacToe.GameContext.GameContext;
import org.designs.TicTacToe.GameContext.GameState;

public class XWonState implements GameState {
    @Override
    public void next(GameContext context, Player player , boolean hasWon){

    }
    @Override
    public boolean isGameOver(){
        return true;
    }
}
