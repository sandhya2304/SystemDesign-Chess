package com.chess.conditions;

import com.chess.model.Piece;

public class NoMoveBaseCondition implements MoveBaseCondition
{

	@Override
	public boolean isBaseConditionFullFilled(Piece piece) {
		return true;
	}

}
