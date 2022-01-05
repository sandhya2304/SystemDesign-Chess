package com.chess.model;

import java.util.List;

import com.chess.moves.PossibleMovesProvider;

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
	
	public void killIt()
	{
		this.isKilled = true;
	}
	
	public void move()
	{
		
	}
	
	
}
