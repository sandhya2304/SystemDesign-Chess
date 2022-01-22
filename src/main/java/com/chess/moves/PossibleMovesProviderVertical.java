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


import static com.chess.moves.VerticalMoveDirection.*;


public class PossibleMovesProviderVertical extends PossibleMovesProvider 
{
	private VerticalMoveDirection verticalMoveDirection;

	public PossibleMovesProviderVertical(int maxSteps, MoveBaseCondition baseCondition,
			PieceMoveFurtherCondition furtherCondition, PieceCellOccupyBlocker baseBlocker) {
		super(maxSteps, baseCondition, furtherCondition, baseBlocker);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, Board board,
			List<PieceCellOccupyBlocker> additionalBlockers, Player player) 
	{
		List<Cell> result = new ArrayList<Cell>();
		
		if(this.verticalMoveDirection == UP || this.verticalMoveDirection == BOTH)
		{
			result.addAll(findAllNextMoves(piece, board::getUpCell, board, additionalBlockers, player));
		}
		
		if (this.verticalMoveDirection == DOWN || this.verticalMoveDirection == BOTH) {
            result.addAll(findAllNextMoves(piece, board::getDownCell, board, additionalBlockers, player));
        }
		
		return result;
	}
	
	

}
