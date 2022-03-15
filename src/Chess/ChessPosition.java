package Chess;

import BoardGame.position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Você não pode acessar esta posição no xadrez");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
	protected position toPosition() {
		return new position(8-row , column - 'a');
	}
	protected static ChessPosition fromPosition(position Position) {
		return new ChessPosition((char)('a' - Position.getColumn()) , 8 - Position.getRow());
	}

	@Override
	public String toString() {
		return " " + column + row;
	}
	
	
}
