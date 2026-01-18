package model;

public class Queen extends Piece {
    public Queen( int posX, int posY, String color) {
        super(posX, posY, color);
        if(color == "WHITE") {
            setSymbol('\u265A');
        } else {
            setSymbol('\u2654');
        }
    }

    @Override
    public void move() {
        return;
    }
}
