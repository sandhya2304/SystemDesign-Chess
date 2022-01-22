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



public abstract class PossibleMovesProvider 
{
	
	int maxSteps;
	MoveBaseCondition baseCondition;
	PieceMoveFurtherCondition furtherCondition;
	PieceCellOccupyBlocker baseBlocker;
	
	public PossibleMovesProvider(int maxSteps, MoveBaseCondition baseCondition,
			PieceMoveFurtherCondition furtherCondition, PieceCellOccupyBlocker baseBlocker) {
		super();
		this.maxSteps = maxSteps;
		this.baseCondition = baseCondition;
		this.furtherCondition = furtherCondition;
		this.baseBlocker = baseBlocker;
	}
	
	protected abstract List<Cell> possibleMovesAsPerCurrentType(Piece piece,Board board,
		       List<PieceCellOccupyBlocker> additionalBlockers,Player player);

	
	public List<Cell> possibleMoves(Piece piece,Board board,List<PieceCellOccupyBlocker> additionalBlockers,Player player)
	{
		
		if(baseCondition.isBaseConditionFullFilled(piece))
		{
			return possibleMovesAsPerCurrentType(piece, board, additionalBlockers, player);
		}
		return null;
	}
	

	protected List<Cell> findAllNextMoves(Piece piece,NextCellProvider nextCellProvider,Board board,
			List<PieceCellOccupyBlocker> cellOccupyBlockers,Player player)
	{
		List<Cell> result = new ArrayList();
		Cell nextCell = nextCellProvider.nextCell(piece.getCurrentCell());
		int numSteps = 1;
		
		while(nextCell != null && numSteps <= maxSteps)
		{
			if(checkIfCellCanBeOccupied(piece, nextCell, board, cellOccupyBlockers, player))
			{
				result.add(nextCell);
			}
			if(! furtherCondition.canPieceMoveFurtherFromCell(piece, nextCell, board))
			{
				break;
			}
			
			nextCell = nextCellProvider.nextCell(nextCell);
			numSteps++;
						
		}
		
		return result;
	}
	
	
	public boolean checkIfCellCanBeOccupied(Piece piece,Cell cell,Board board,
			  List<PieceCellOccupyBlocker> additionalBlockers,Player player)
	{
		if(baseBlocker != null && baseBlocker.isCellNonOccupiableForPiece(cell, piece, board, player))
		{
			return false;
		}
		for(PieceCellOccupyBlocker cellOccupyBlocker:additionalBlockers)
		{
			if(cellOccupyBlocker.isCellNonOccupiableForPiece(cell, piece, board, player))
			{
				return false;
			}
		}
		return true;
	}
	

}
