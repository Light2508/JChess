package view;

import java.util.ArrayList;
import model.Piece;

public class ChessView {

    public void showBoard(ArrayList<Piece> pieceList) {

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
                    System.out.print(" ");
                }
                System.out.print("|");
            }
        }

        // print the bottom Letters
        System.out.print("\n   A B C D E F G H");
    }

}

