package com.chess.conditions;

import com.chess.model.Piece;

public interface MoveBaseCondition 
{
	
	boolean isBaseConditionFullFilled(Piece piece);

}
