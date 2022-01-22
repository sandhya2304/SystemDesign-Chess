package com.chess.gameplay.contracts;

import com.chess.model.Cell;
import com.chess.model.Piece;



public class PlayerMove 
{
	
	Piece piece;
    Cell toCell;
    
    
    public Piece getPiece() {
		return piece;
	}
	
    
    public Cell getToCell() {
		return toCell;
	}
}
