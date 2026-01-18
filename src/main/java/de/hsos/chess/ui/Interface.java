package de.hsos.chess.ui;

import de.hsos.chess.board.ChessBoard;
import de.hsos.chess.pieces.Piece;

import java.util.ArrayList;

public class Interface {

    public static void printBoard(ChessBoard board) {
        Piece[][] boardArray = board.getBoardArray();

        boolean bgColor = false;

        System.out.println("   a  b  c  d  e  f  g  h");

        for(int i = 0; i < boardArray.length; i++) {
            Piece[] row = boardArray[i];

            System.out.print(i + " ");

            for(Piece piece : row) {
                if(bgColor) {
                    System.out.print("\u001b[100m");
                }else{
                    System.out.print("\u001b[47m");
                }

                bgColor = !bgColor;

                System.out.print((piece + "\u001b[0m").replace("null", "   "));
            }

            bgColor = !bgColor;

            System.out.print(" " + i);
            System.out.println();
        }

        System.out.println("   a  b  c  d  e  f  g  h");
    }
}
