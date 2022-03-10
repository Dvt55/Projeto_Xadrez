package Chess;

import BoardGame.board;
import BoardGame.piece;

public class ChessPiece extends piece{
	
	private Color color;

	public ChessPiece(board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
