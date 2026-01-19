package view;

import java.util.ArrayList;
import model.Piece;

public class ChessView {

    public void showPrintAscii(ArrayList<Piece> pieceList) {

        for(int i=0; i < 8; i++) {
            System.out.print("\n  " + "+-+-+-+-+-+-+-+-+\n");
            System.out.print((8-i) + " " + "|");

            // print the symbol lines
            for(int j=0; j < 8; j++) {
                boolean isCellEmpty = true;

                for(Piece p: pieceList) {
                     if(p.getPosX() == j & p.getPosY() == i) {
                         System.out.print(p.getSymbol());
                         isCellEmpty = false;
                     }
                }
                if(isCellEmpty) {
                    System.out.print("\u3000");
                }
                System.out.print("|");
            }
        }

        // print the bottom Letters
        System.out.print("\n   A B C D E F G H");
    }

    public void printBoard(ArrayList<Piece> pieceList) {
        System.out.print("\n   A   B   C  D   E   F  G   H");
        for(int i=0; i < 8; i++) {
            System.out.print("\n" + (8-i) + " ");

            // print the symbol lines
            for(int j=0; j < 8; j++) {
                boolean isCellEmpty = true;

                for(Piece p: pieceList) {
                    if(p.getPosX() == j & p.getPosY() == i) {
                        System.out.print(alternateBG(j, i) + " " + p.getSymbol() + " ");
                        isCellEmpty = false;
                    }
                }
                if(isCellEmpty) {
                    System.out.print(alternateBG(j, i) + " " + "\u3000" + " ");
                }
            }
            System.out.print(getBGReset());
            System.out.print(" " + (8-i) + " ");
        }

        // print the bottom Letters
        System.out.print("\n   A   B   C  D   E   F  G   H");
        System.out.print("\n");
    }

    /**
     * This should return the appropriate color background for a specific cell
     * @param x position
     * @param y position
     * @return return a unicode for the background
     */
    String alternateBG(int x, int y) {
        String whitebg = "\u001B[47m";
        String blackbg = "\u001B[40m";

        if(y % 2 == 0) {
            if(x % 2 == 0) {
                return whitebg;
            } else {
                return blackbg;
            }
        } else {
            if(x % 2 == 0) {
                return blackbg;
            } else {
                return whitebg;
            }
        }
    }

    String getBGReset() {
        return "\u001B[0m";
    }

}

