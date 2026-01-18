package model;

public abstract class Piece {

    protected int posX;
    protected int posY;
    protected String color;
    protected char symbol;

    public Piece(int posX, int posY, String color) {
        setPosX(posX);
        setPosY(posY);
        setColor(color);
    }

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

    protected void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    protected void setPosX(int posX) {
        this.posX = posX;
    }

    protected void setPosY(int posY) {
        this.posY = posY;
    }

    protected void setColor(String color) {
        this.color = color;
    }
}
