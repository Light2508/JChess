package de.hsos.chess.pieces;

import de.hsos.chess.Position;

public abstract class Piece {
    Position position;
    char color;

    public Piece(int x, int y, char color) {
        this.position = new Position(x,y);
        setColor(color);
    }

    public int getColor() {
        return this.color;
    }

    private void setColor(char color) {
        if(color == 'w') {
            this.color = color;
        }else {
            this.color = 'b';
        }
    }


    public abstract void move(int x, int y);
    public abstract boolean isMoveValid(int x, int y);
}
