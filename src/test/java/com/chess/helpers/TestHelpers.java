package com.chess.helpers;

import java.util.ArrayList;
import java.util.List;

import com.chess.model.Board;
import com.chess.model.Cell;
import com.chess.model.Color;
import com.chess.model.Piece;
import com.chess.moves.VerticalMoveDirection;

public class TestHelpers 
{
	
	   
	  public static Board createBoard()
	  {
		    Cell[][] cells = new Cell[8][8];
		    for(int i = 0;i<8;i++)
		    {
		    	for(int j = 0;j<8;j++)
		    	{
		    		cells[i][j] = new Cell(i,j);
		    	}
		    }
		    return new Board(8, cells);
	  }
	  
	  
	  public static List<Piece> pieceSet(Color color,Board board,int mainPiecesRowNum,
			       int pawnPiecesRowNum,VerticalMoveDirection pawnDirection)
	  {
		  List<Piece> allPieces = new ArrayList<Piece>();
		  
		  for(int i=0;i<8;i++)
		  {
			  Piece pawn = pawn(color, pawnDirection);
			  addPieceToBoard(board, pawn, pawnPiecesRowNum, i);
			  allPieces.add(pawn);			  
		  }
		  
		  Piece king = king(color);		  
		  addPieceToBoard(board, king, mainPiecesRowNum, 3);
		  
		  Piece queen = queen(color);
		  addPieceToBoard(board, queen, mainPiecesRowNum, 4);
		  
		  Piece rook1 = rook(color);
		  addPieceToBoard(board, rook1, mainPiecesRowNum, 0);
		  
		  Piece rook2 = rook(color);
		  addPieceToBoard(board, rook2, mainPiecesRowNum, 7);
		  
		  Piece bishop1 = bishop(color);
		  addPieceToBoard(board, bishop1, mainPiecesRowNum, 2);
		  
		  Piece bishop2 = bishop(color);
		  addPieceToBoard(board, bishop2, mainPiecesRowNum, 5);
		  
		  Piece knight1 = knight(color);
		  addPieceToBoard(board, knight1, mainPiecesRowNum, 1);
		  
		  Piece knight2 = knight(color);
		  addPieceToBoard(board, knight2, mainPiecesRowNum, 6);
		  
		  
		  return allPieces;
	  }
	  
	  
	  public static Piece knight(Color color)
	  {
		  
		  
	  }
	  
	  public static Piece bishop(Color color)
	  {
		  
		  
	  }
	  
	  public static Piece rook(Color color)
	  {
		  
		  
	  }
	  
	  public static Piece king(Color color)
	  {
		  
		  
	  }
	  
	  public static Piece queen(Color color)
	  {
		  
		  
	  }
	  
	  
	  
	  public static void addPieceToBoard(Board board,Piece piece,int rowNum,int colNum)
	  {
		  Cell cell = board.getCellAtLocation(rowNum, colNum);
		  piece.setCurrentCell(cell);
		  cell.setCurrentPiece(piece);
		  
	  }
	  
	  
	  public static Piece pawn(Color color,VerticalMoveDirection pawnDirection)
	  {
		  
	  }
	  
	  
	  
	  
	  

}
