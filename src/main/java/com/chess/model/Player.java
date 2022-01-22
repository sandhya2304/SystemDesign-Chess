package com.chess.model;

import java.util.List;

import com.chess.exception.PieceNotFoundException;

public abstract class Player 
{
	
	List<Piece> pieces;
	
	abstract public PlayerMove makeMove();
	
	public List<Piece> getPieces() {
		return pieces;
	}

	
	public Piece getPiece(PieceType pieceType)
	{
		for(Piece piece:getPieces())
		{
			if(piece.getPieceType() == pieceType)
			{
				return piece;
			}
		}
		throw new PieceNotFoundException();
	}
}
