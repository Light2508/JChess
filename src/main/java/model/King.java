package model;

public class King extends Piece{
    public King( int posX, int posY, String color) {
        super(posX, posY, color);
        if(color == "WHITE") {
            setSymbol('\u265B');
        } else {
            setSymbol('\u2655');
        }
    }

    @Override
    public void move() {
        return;
    }
}
