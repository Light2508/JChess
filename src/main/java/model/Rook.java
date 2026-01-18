package model;

public class Rook extends Piece {
    public Rook( int posX, int posY, String color) {
        super(posX, posY, color);
        if(color == "WHITE") {
            setSymbol('\u265C');
        } else {
            setSymbol('\u2656');
        }
    }

    @Override
    public void move() {
        return;
    }
}
