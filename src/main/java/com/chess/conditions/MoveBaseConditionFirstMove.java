package com.chess.conditions;

import com.chess.model.Piece;




public class MoveBaseConditionFirstMove implements MoveBaseCondition
{

	@Override
	public boolean isBaseConditionFullFilled(Piece piece) 
	{
		
		return piece.getNumMoves() == 0;
	}
	
	

}
