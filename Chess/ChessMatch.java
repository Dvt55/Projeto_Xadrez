package Chess;

import BoardGame.board;

public class ChessMatch {
	
	private board Board;
	
	public ChessMatch() {
		Board = new board(8,8);
	}
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[Board.getRows()][Board.getColumns()];
		
		for(int i=0; i<Board.getRows(); i++) {
			for(int j=0; j<Board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) Board.Piece(i,j);
			}
		}
		return mat;
	}
	
	
}
