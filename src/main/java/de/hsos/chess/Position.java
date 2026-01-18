package de.hsos.chess;

public class Position {
    private int x = 0;
    private int y = 0;

    public Position(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        if(x >= 0 && x <= 7) {
            this.x = x;
        }else{
            this.x = 0;
        }
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        if(y >= 0 && y <= 7) {
            this.y = y;
        }else{
            this.y = 0;
        }
    }

    public int getY() {
        return this.y;
    }
}
