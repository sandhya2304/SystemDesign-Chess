package com.chess.model;

import java.util.ArrayList;
import java.util.List;

import com.chess.conditions.PieceCellOccupyBlocker;
import com.chess.exception.InvalidMoveException;
import com.chess.moves.PossibleMovesProvider;

import static com.helpers.ListHelpers.removeDuplicates;


public class Piece 
{
	
	private boolean isKilled = false;
	private  Color color;
	private List<PossibleMovesProvider> movesProviders;
	private Integer numMoves = 0;
	PieceType pieceType;

	private Cell currentCell;

	public Piece(Color color, List<PossibleMovesProvider> movesProviders, PieceType pieceType) {
		super();
		this.color = color;
		this.movesProviders = movesProviders;
		this.pieceType = pieceType;
	}
	
	public boolean isKilled() {
		return isKilled;
	}

	public Color getColor() {
		return color;
	}

	public List<PossibleMovesProvider> getMovesProviders() {
		return movesProviders;
	}


	public Integer getNumMoves() {
		return numMoves;
	}

	public PieceType getPieceType() {
		return pieceType;
	}

	public Cell getCurrentCell() {
		return currentCell;
	}
	
	public void setCurrentCell(Cell currentCell) {
		this.currentCell = currentCell;
	}

	public void killIt()
	{
		this.isKilled = true;
	}
	
	public void move(Player player,Cell toCell,Board board,List<PieceCellOccupyBlocker> additionalBlockers)
	{
		if(isKilled)
		{
			throw new InvalidMoveException();
		}		
		
		List<Cell> nextPossibleCells = 
		
		
		
	}
		
	public void killPieceInCell()
	{
		
		
		
	}
	
	public List<Cell> nextPossibleCells(Board board,List<PieceCellOccupyBlocker> additionalBlockers,Player player)
	{
		List<Cell> result = new ArrayList<>();
		for(PossibleMovesProvider movesProvider:this.movesProviders)
		{
			List<Cell> cells = movesProvider.possibleMoves(this, board, additionalBlockers, player);
			 if(cells != null)		
			 {
				 result.addAll(cells);
			 }
		}
		return removeDuplicates(result);  //helper class methods
	}
	
	public boolean isPieceFromSamePlayer(Piece piece)
	{
		return piece.getColor().equals(this.color);
		
	}
	
}
