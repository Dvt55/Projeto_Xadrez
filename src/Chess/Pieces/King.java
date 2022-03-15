package Chess.Pieces;

import BoardGame.board;
import Chess.ChessPiece;
import Chess.Color;

public class King extends ChessPiece{

	public King(board board, Color color) {
		super(board, color);
	}
	@Override
	public String toString() {
		return "K";
	}

}
