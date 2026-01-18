package de.hsos.chess.pieces;

public class Pawn extends Piece {
    private boolean isFirstMove = true;

    public Pawn(int x, int y, char color) {
        super(x, y, color, 'p');
    }

    public void move(int x, int y) {

    }

    public boolean isMoveValid(int x, int y) {

        return true;
    }

    @Override
    public String toString() {
        if(getColor() == 'w') {
            return "\u001b[97m^_^";
        }else{
            return "\u001b[30m^_^";
        }
    }
}
