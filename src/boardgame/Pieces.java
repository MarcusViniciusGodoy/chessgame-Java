package boardgame;

public class Pieces {

	protected Position position;
	private Board board;
	
	public Pieces(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
}
