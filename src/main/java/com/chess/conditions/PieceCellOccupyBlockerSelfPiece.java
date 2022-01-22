package com.chess.conditions;

import com.chess.model.Board;
import com.chess.model.Cell;
import com.chess.model.Piece;
import com.chess.model.Player;




public class PieceCellOccupyBlockerSelfPiece implements PieceCellOccupyBlocker
{

	@Override
	public boolean isCellNonOccupiableForPiece(Cell cell, Piece piece, Board board, Player player) 
	{
	    if(cell.isFree())
	    {
	    	return false;
	    }
		return cell.getCurrentPiece().getColor() == piece.getColor();
	}
	
	

}
