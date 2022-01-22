package com.chess.gameplay;

import java.util.List;

import com.chess.gameplay.contracts.PlayerMove;
import com.chess.model.Board;
import com.chess.model.Player;

import static com.chess.conditions.PieceCellOccupyBlockerFactory.defaultAdditionalBlockers;

public class GameController 
{
	
	
	 public static void gamePlay(List<Player> players,Board board)
	 {
		 
		 int currentPlayer = 0;
		 
		 while(true)
		 {
			 Player player = players.get(currentPlayer);
			 
			 PlayerMove playerMove = player.makeMove();
			 playerMove.getPiece().move(player, playerMove.getToCell(), board, defaultAdditionalBlockers());
			 
			 currentPlayer = (currentPlayer + 1) % players.size();
		 }
		 
	 }

}
