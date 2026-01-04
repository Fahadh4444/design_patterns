package org.designs.TicTacToe.Entities;

import org.designs.TicTacToe.Enums.Symbol;
import org.designs.TicTacToe.Strategy.PlayerStrategy;

public class Player {
    private Symbol symbol;
    private PlayerStrategy playerStrategy;

    public Player(Symbol symbol, PlayerStrategy playerStrategy){
        this.symbol=symbol;
        this.playerStrategy=playerStrategy;
    }

    public Symbol getSymbol(){
        return symbol;
    }

    public PlayerStrategy getPlayerStrategy(){
        return playerStrategy;
    }
}
