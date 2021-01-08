package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}
	
	
	private boolean canMOVE(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null || p.getColor() != getColor();
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		// above
		p.setvalues(position.getRow() - 1, position.getColumn());
		if (getBoard().positionExists(p) && canMOVE(p)) {
			mat [p.getRow()][p.getColumn()] = true;
		}
		
		// below
		p.setvalues(position.getColumn() + 1, position.getColumn());
		if (getBoard().positionExists(p) && canMOVE(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// LEFT
		p.setvalues(position.getRow(), position.getColumn() - 1);
		if (getBoard().positionExists(p) && canMOVE(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// Right
			p.setvalues(position.getRow() , position.getColumn() + 1);
			if (getBoard().positionExists(p) && canMOVE(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			
			}
			
			// NW
			p.setvalues(position.getRow() - 1, position.getColumn() - 1);
			if (getBoard().positionExists(p) && canMOVE(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			// NE
			p.setvalues(position.getRow() - 1, position.getColumn() + 1);
			if (getBoard().positionExists(p) && canMOVE(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// SW
			p.setvalues(position.getRow() + 1, position.getColumn() - 1);
			if (getBoard().positionExists(p) && canMOVE(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// SE
			p.setvalues(position.getRow() + 1, position.getColumn() + 1);
			if (getBoard().positionExists(p) && canMOVE(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
		return mat ;
		
	}
	
}
