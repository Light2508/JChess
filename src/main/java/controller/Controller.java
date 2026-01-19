package controller;

import model.*;
import view.*;
import java.util.ArrayList;

public class Controller {

    public void startGame() {
        // build setup
        ArrayList<Piece> pieceList = createPieceList();

        ChessView view = new ChessView();
        view.printBoard(pieceList);


    }

    /**
     * creates a new list with all the pieces in it placed at the standard beginning spot on the field
     * @return returns the list as an arraylist
     */
    ArrayList<Piece> createPieceList() {
        ArrayList<Piece> pieceList = new ArrayList<Piece>();

        pieceList.add(new Pawn(0, 1, "BLACK"));
        pieceList.add(new Pawn(1, 1, "BLACK"));
        pieceList.add(new Pawn(2, 1, "BLACK"));
        pieceList.add(new Pawn(3, 1, "BLACK"));
        pieceList.add(new Pawn(4, 1, "BLACK"));
        pieceList.add(new Pawn(5, 1, "BLACK"));
        pieceList.add(new Pawn(6, 1, "BLACK"));
        pieceList.add(new Pawn(7, 1, "BLACK"));

        pieceList.add(new Rook(0, 0, "BLACK"));
        pieceList.add(new Rook(7, 0, "BLACK"));
        pieceList.add(new Knight(1, 0, "BLACK"));
        pieceList.add(new Knight(6, 0, "BLACK"));
        pieceList.add(new Bishop(2, 0, "BLACK"));
        pieceList.add(new Bishop(5, 0, "BLACK"));
        pieceList.add(new Queen(3, 0, "BLACK"));
        pieceList.add(new King(4, 0, "BLACK"));

        pieceList.add(new Pawn(0, 6, "WHITE"));
        pieceList.add(new Pawn(1, 6, "WHITE"));
        pieceList.add(new Pawn(2, 6, "WHITE"));
        pieceList.add(new Pawn(3, 6, "WHITE"));
        pieceList.add(new Pawn(4, 6, "WHITE"));
        pieceList.add(new Pawn(5, 6, "WHITE"));
        pieceList.add(new Pawn(6, 6, "WHITE"));
        pieceList.add(new Pawn(7, 6, "WHITE"));

        pieceList.add(new Rook(0, 7, "WHITE"));
        pieceList.add(new Rook(7, 7, "WHITE"));
        pieceList.add(new Knight(1, 7, "WHITE"));
        pieceList.add(new Knight(6, 7, "WHITE"));
        pieceList.add(new Bishop(2, 7, "WHITE"));
        pieceList.add(new Bishop(5, 7, "WHITE"));
        pieceList.add(new Queen(3, 7, "WHITE"));
        pieceList.add(new King(4, 7, "WHITE"));

        return pieceList;
    }

}
