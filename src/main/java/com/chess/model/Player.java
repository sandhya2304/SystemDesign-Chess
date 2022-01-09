package com.chess.model;

import java.util.List;

public abstract class Player 
{
	
	List<Piece> pieces;
	
	public List<Piece> getPieces() {
		return pieces;
	}

	
	public Piece getPiece(PieceType pieceType)
	{
		for(Piece piece:getPieces())
		{
			if(piece.get)
		}
	}
}
