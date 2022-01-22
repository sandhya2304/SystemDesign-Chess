package com.chess.moves;

import java.util.ArrayList;
import java.util.List;

import com.chess.conditions.MoveBaseCondition;
import com.chess.conditions.PieceCellOccupyBlocker;
import com.chess.conditions.PieceMoveFurtherCondition;
import com.chess.model.Board;
import com.chess.model.Cell;
import com.chess.model.Piece;
import com.chess.model.Player;



public class PossibleMovesProviderHorizontal extends PossibleMovesProvider 
{

	public PossibleMovesProviderHorizontal(int maxSteps, MoveBaseCondition baseCondition,
			PieceMoveFurtherCondition furtherCondition, PieceCellOccupyBlocker baseBlocker) {
		super(maxSteps, baseCondition, furtherCondition, baseBlocker);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, Board board,
			List<PieceCellOccupyBlocker> additionalBlockers, Player player) 
	{
		List<Cell> result = new ArrayList<Cell>();
		result.addAll(findAllNextMoves(piece, board::getLeftCell, board, additionalBlockers, player));
		result.addAll(findAllNextMoves(piece, board::getRightCell, board, additionalBlockers, player));
		
		return result;
	}
	
	

}
