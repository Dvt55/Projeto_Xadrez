package aplication;

import Chess.ChessMatch;

public class program {
	public static void main(String[] args) {
		
		ChessMatch chessmath = new ChessMatch();
		
		UI.printBoard(chessmath.getPieces());
		

	}
	

}
