package boardgame;

public class Piece {
	
	protected Position posicion;
	private Board board;
	
	
	public Piece(Board board) {
		super();
		this.board = board;
	}


	protected Board getBoard() {
		return board;
	}



	
	

}
