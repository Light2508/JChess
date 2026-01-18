package de.hsos.chess.pieces;

public class King extends Piece {
    public King(int x, int y, char color) {
        super(x, y, color, 'k');
    }

    public void move(int x, int y) {

    }

    public boolean isMoveValid(int x, int y) {
        return false;
    }

    public String toString() {
        if(getColor() == 'w') {
            return "\u001b[97m>_<";
        }else{
            return "\u001b[30m>_<";
        }
    }
}
