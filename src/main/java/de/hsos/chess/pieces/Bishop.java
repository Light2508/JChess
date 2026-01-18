package de.hsos.chess.pieces;

public class Bishop extends Piece {
    public Bishop(int x, int y, char color) {
        super(x, y, color, 'b');
    }

    public void move(int x, int y) {

    }

    public boolean isMoveValid(int x, int y) {
        return false;
    }

    public String toString() {
        if(getColor() == 'w') {
            return "\u001b[97mO_O";
        }else{
            return "\u001b[30mO_O";
        }
    }
}
