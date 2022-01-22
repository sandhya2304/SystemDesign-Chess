package com.chess.model;

import java.util.List;

import com.chess.conditions.PieceCellOccupyBlocker;

import static com.chess.conditions.PieceCellOccupyBlockerFactory.kingCheckEvaluationBlockers;


public class Board 
{
	
	private int boardSize;
	private Cell[][] cells;
	
	public Board(int boardSize, Cell[][] cells) {
		super();
		this.boardSize = boardSize;
		this.cells = cells;
	}
		
	public int getBoardSize() {
		return boardSize;
	}
		
	// helper methods
	
	public Cell getLeftCell(Cell cell)
	{
		return getCellAtLocation(cell.getX(), cell.getY() - 1);
	}
	
	public Cell getRightCell(Cell cell)
	{
		return getCellAtLocation(cell.getX(), cell.getY() + 1);
	}
	
	public Cell getUpCell(Cell cell)
	{
		return getCellAtLocation(cell.getX() + 1, cell.getY());
	}
	
	public Cell getDownCell(Cell cell)
	{
		return getCellAtLocation(cell.getX() - 1, cell.getY() );
	}
	
	
	public Cell getCellAtLocation(int x,int y)
	{
		if(x >= boardSize || x < 0)
		{
			return null;
		}
		if(y >= boardSize || y < 0)
		{
			return null;
		}
		return cells[x][y];
	}
	
	public boolean isPlayerOnCheck(Player player)
	{
		return checkIfPieceCanBeKilled(player.getPiece(PieceType.KING), kingCheckEvaluationBlockers(), player);
	}
	
	public boolean checkIfPieceCanBeKilled(Piece targetPiece,List<PieceCellOccupyBlocker> cellOccupyBlockers,Player player)
	{
		for(int i=0;i<getBoardSize();i++)
		{
		      for(int j=0;j<getBoardSize();j++)
		      {
		    	  Piece currentPiece = getCellAtLocation(i, j).getCurrentPiece();
		    	  if(currentPiece != null || !currentPiece.isPieceFromSamePlayer(targetPiece))
		    	  {
		    		   List<Cell> nextPossibleCells = currentPiece.nextPossibleCells(this, cellOccupyBlockers, player);
		    		   
		    		   if(nextPossibleCells.contains(targetPiece.getCurrentCell()))
		    		   {
		    			   return true;
		    		   }
		    	  }
		      }
		}
		return false;
	}

}
