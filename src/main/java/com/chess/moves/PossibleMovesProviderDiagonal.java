package com.chess.moves;

import java.util.List;

import com.chess.conditions.MoveBaseCondition;
import com.chess.conditions.PieceCellOccupyBlocker;
import com.chess.conditions.PieceMoveFurtherCondition;
import com.chess.model.Board;
import com.chess.model.Cell;
import com.chess.model.Piece;
import com.chess.model.Player;

public class PossibleMovesProviderDiagonal extends PossibleMovesProvider 
{

	public PossibleMovesProviderDiagonal(int maxSteps, MoveBaseCondition baseCondition,
			PieceMoveFurtherCondition furtherCondition, PieceCellOccupyBlocker baseBlocker) {
		super(maxSteps, baseCondition, furtherCondition, baseBlocker);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, Board board,
			List<PieceCellOccupyBlocker> additionalBlockers, Player player)
	{
		return null;
	}
	
	

}
