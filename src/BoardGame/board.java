package BoardGame;

public class board {
	
	private int rows;
	private int columns;
	private piece[][] pieces;
	public board(int rows, int columns) {
		if(rows < 0 || columns < 0) {
			throw new BoardException("O tabuleiro não existe");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new piece[rows][columns];
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public piece Piece(int row , int column) {
		if(!test(row,column)) {
			throw new BoardException("Posição inexistente");
		}
		return pieces[row][column];
	}
	public piece Piece(position Position) {
		if(!positionExist(Position)) {
			throw new BoardException("Posição inexistente");
		}
		return pieces[Position.getRow()][Position.getColumn()];
	}
	public void placePiece(piece Piece , position Position) {
		if(ThereIsaPiece(Position)) {
			throw new BoardException("Não é permitido colocar uma peça em uma posição com outra peça");
		}
		pieces[Position.getRow()][Position.getColumn()] = Piece;
		Piece.Position = Position;
	}
	private boolean test(int row, int column) {
		return row >=0 && row <= rows && column >=0 && column <= columns;
	}
	public boolean positionExist(position Position) {
		return test(Position.getRow(),Position.getColumn());
	}
	public boolean ThereIsaPiece(position Position) {
		if(!positionExist(Position)) {
			throw new BoardException("Posição inexistente");
		}
		return Piece(Position)!= null;
	}
}
