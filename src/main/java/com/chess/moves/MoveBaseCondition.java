package com.chess.moves;

import com.chess.model.Piece;

public interface MoveBaseCondition 
{
	
	boolean isBaseConditionFullFilled(Piece piece);

}
