package model;

public class Pawn extends Piece {

    public Pawn( int posX, int posY, String color) {
        super(posX, posY, color);
        if(color == "WHITE") {
            setSymbol('\u265F');
        } else {
            setSymbol('\u2659');
        }

    }

    @Override
    public void move() {
        return;
    }
}
