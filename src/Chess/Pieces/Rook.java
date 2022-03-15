package Chess.Pieces;

import BoardGame.board;
import Chess.ChessPiece;
import Chess.Color;

public class Rook extends ChessPiece{

	public Rook(board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}
	
}
