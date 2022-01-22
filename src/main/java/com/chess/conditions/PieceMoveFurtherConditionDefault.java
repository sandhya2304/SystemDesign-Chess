package com.chess.conditions;

import com.chess.model.Board;
import com.chess.model.Cell;
import com.chess.model.Piece;

public class PieceMoveFurtherConditionDefault implements PieceMoveFurtherCondition
{

	@Override
	public boolean canPieceMoveFurtherFromCell(Piece piece, Cell cell, Board board) 
	{
		return cell.isFree();
	}
	
	

}
