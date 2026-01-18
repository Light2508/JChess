package model;

public abstract class Piece {

    protected int posX;
    protected int posY;
    protected String colour;
    protected char symbol;

    public abstract void move();

    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public char getSymbol() {
        return this.symbol;
    }
}
