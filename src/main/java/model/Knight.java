package model;

public class Knight extends Piece {
    public Knight( int posX, int posY, String color) {
        super(posX, posY, color);
        if(color == "WHITE") {
            setSymbol('\u265E');
        } else {
            setSymbol('\u2658');
        }
    }

    @Override
    public void move() {
        return;
    }
}
