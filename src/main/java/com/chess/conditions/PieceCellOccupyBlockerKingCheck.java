package com.chess.conditions;

import com.chess.model.Board;
import com.chess.model.Cell;
import com.chess.model.Piece;
import com.chess.model.Player;




public class PieceCellOccupyBlockerKingCheck implements PieceCellOccupyBlocker
{

	@Override
	public boolean isCellNonOccupiableForPiece(Cell cell, Piece piece, Board board, Player player) 
	{
		Cell pieceOriginalCell = piece.getCurrentCell();
		piece.setCurrentCell(cell);
		
		boolean playerGettingCheckByMove = board.isPlayerOnCheck(player);
		piece.setCurrentCell(pieceOriginalCell);
		
		return playerGettingCheckByMove;
	}
	
	

}
