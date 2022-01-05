package com.chess.model;




public class Cell 
{
	
	int x;
	int y;
	
	private Piece currentPiece;
	
	public Cell(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	
	
	public int getX() {
		return x;
	}




	public void setX(int x) {
		this.x = x;
	}




	public int getY() {
		return y;
	}




	public void setY(int y) {
		this.y = y;
	}




	public boolean isFree()
	{
		return currentPiece == null;
	}
	

}
