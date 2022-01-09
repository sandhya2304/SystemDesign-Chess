package com.chess.exception;



public class InvalidMoveException extends RuntimeException
{
	String msg;

	public InvalidMoveException(String msg) {
		super();
		this.msg = msg;
	}
	
	public InvalidMoveException() {
		// TODO Auto-generated constructor stub
	}

}
