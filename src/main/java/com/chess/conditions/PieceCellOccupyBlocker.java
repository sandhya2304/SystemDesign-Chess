package com.chess.conditions;

import com.chess.model.Board;
import com.chess.model.Cell;
import com.chess.model.Piece;
import com.chess.model.Player;



public interface PieceCellOccupyBlocker 
{
	boolean isCellNonOccupiableForPiece(Cell cell,Piece piece,Board board,Player player);
}
