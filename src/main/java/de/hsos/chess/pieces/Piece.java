package de.hsos.chess.pieces;

public abstract class Piece {
    private final char name;
    protected Position position;
    private char color;

    public Piece(int x, int y, char color, char name) {
        this.name = name;
        this.position = new Position(x,y);
        setColor(color);
    }

    public char getName() {
        return this.name;
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

    public int getPosX() {
        return this.position.getX();
    }

    public int getPosY() {
        return this.position.getY();
    }

    public abstract void move(int x, int y);
    public abstract boolean isMoveValid(int x, int y);
    public abstract String toString();
}
