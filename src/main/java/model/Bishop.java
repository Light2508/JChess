package model;

public class Bishop extends Piece{

    public Bishop( int posX, int posY, String color) {
        super(posX, posY, color);
        if(color == "WHITE") {
            setSymbol('\u265D');
        } else {
            setSymbol('\u2657');
        }
    }

    @Override
    public void move() {
        return;
    }
}
