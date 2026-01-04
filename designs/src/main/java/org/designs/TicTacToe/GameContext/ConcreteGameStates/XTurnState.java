package org.designs.TicTacToe.GameContext.ConcreteGameStates;

import org.designs.TicTacToe.Entities.Player;
import org.designs.TicTacToe.Enums.Symbol;
import org.designs.TicTacToe.GameContext.GameContext;
import org.designs.TicTacToe.GameContext.GameState;

public class XTurnState implements GameState {
    @Override
    public void next(GameContext gameContext, Player player, boolean hasWon){
        if(hasWon){
            gameContext.setState(player.getSymbol() == Symbol.X ? new XWonState() : new OWonState());
        }else {
            // Switch to OTurnState
            gameContext.setState(new OTurnState());
        }
    }

    @Override
    public boolean isGameOver(){
        return false;
    }
}
