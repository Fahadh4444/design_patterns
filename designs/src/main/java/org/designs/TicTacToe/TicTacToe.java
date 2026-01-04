package org.designs.TicTacToe;

import org.designs.TicTacToe.Controllers.BoardGame;
import org.designs.TicTacToe.Controllers.GameController.TicTacToeGame;
import org.designs.TicTacToe.Strategy.ConcreteStrategies.HumanPlayerStrategy;
import org.designs.TicTacToe.Strategy.PlayerStrategy;

public class TicTacToe {
    private final PlayerStrategy playerXStrategy;
    private final PlayerStrategy playerOStrategy;
    private final BoardGame game;

    public TicTacToe(){
        this.playerXStrategy = new HumanPlayerStrategy("Fahadh");
        this.playerOStrategy = new HumanPlayerStrategy("Steve");
        this.game = new TicTacToeGame(playerXStrategy,playerOStrategy, 3, 3);
    }
    public void play(){
        game.play();
    }

}
