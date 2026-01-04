package org.designs.TicTacToe.Controllers.GameController;

import org.designs.TicTacToe.Controllers.BoardGame;
import org.designs.TicTacToe.Entities.Board;
import org.designs.TicTacToe.Entities.Player;
import org.designs.TicTacToe.Entities.Position;
import org.designs.TicTacToe.Enums.Symbol;
import org.designs.TicTacToe.GameContext.ConcreteGameStates.OWonState;
import org.designs.TicTacToe.GameContext.ConcreteGameStates.XWonState;
import org.designs.TicTacToe.GameContext.GameContext;
import org.designs.TicTacToe.GameContext.GameState;
import org.designs.TicTacToe.Strategy.PlayerStrategy;

public class TicTacToeGame implements BoardGame {
    private Board board;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;
    private GameContext gameContext;

    public TicTacToeGame(PlayerStrategy xStrategy, PlayerStrategy oStrategy, int rows, int columns){
        this.board = new Board(rows, columns);
        this.playerX = new Player(Symbol.X, xStrategy);
        this.playerO = new Player(Symbol.O, oStrategy);
        this.currentPlayer = playerX;
        this.gameContext = new GameContext();
    }

    @Override
    public void play(){
        while(!gameContext.isGameOver()){
            board.printBoard();
            Position move = currentPlayer.getPlayerStrategy().makeMove(board);
            board.makeMove(move, currentPlayer.getSymbol());
            board.checkGameState(gameContext, currentPlayer);
            switchPlayer();
        }
        announceResult();
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }

    // Displays the outcome of the game based on the final game state.
    private void announceResult() {
        GameState state = gameContext.getCurrentState();
        board.printBoard();
        if (state instanceof XWonState) {
            System.out.println("Player X wins!");
        } else if (state instanceof OWonState) {
            System.out.println("Player O wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
