package Chess;

import BoardGame.board;
import BoardGame.position;
import Chess.Pieces.King;

public class ChessMatch {
	
	private board Board;
	
	public ChessMatch() {
		Board = new board(8,8);
		InitialSetup();
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
	private void PlaceNewPiece(char column , int row , ChessPiece Piece) {
		Board.placePiece(Piece, new ChessPosition(column,row).toPosition());
	}
	public void InitialSetup() {
		PlaceNewPiece('b', 6 ,new King(Board, Color.WHITE));
	}
	
}
