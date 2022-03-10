package BoardGame;

public class piece {
	protected position Position;
	private board Board;
	
	public piece(board board) {
		Board = board;
	}

	protected board getBoard() {
		return Board;
	}
	
	
	
}
