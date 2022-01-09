package com.chess.moves;

import com.chess.model.Board;
import com.chess.model.Cell;
import com.chess.model.Piece;

public interface PieceMoveFurtherCondition 
{
	boolean canPieceMoveFurtherFromCell(Piece piece,Cell cell
			,Board board);
}
