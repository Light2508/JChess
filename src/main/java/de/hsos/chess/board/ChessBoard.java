package de.hsos.chess.board;

import de.hsos.chess.pieces.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ChessBoard {
    private ArrayList<Piece> whitePieces = new ArrayList<>();
    private ArrayList<Piece> blackPieces = new ArrayList<>();

    public ChessBoard() {
        init();
    }

    private void init() {
        blackPieces.add(new Rook(0, 0, 'b'));
        blackPieces.add(new Horse(1, 0, 'b'));
        blackPieces.add(new Bishop(2, 0, 'b'));
        blackPieces.add(new Queen(3, 0, 'b'));
        blackPieces.add(new King(4, 0, 'b'));
        blackPieces.add(new Bishop(5, 0, 'b'));
        blackPieces.add(new Horse(6, 0, 'b'));
        blackPieces.add(new Rook(7, 0, 'b'));

        blackPieces.add(new Pawn(0, 1, 'b'));
        blackPieces.add(new Pawn(1, 1, 'b'));
        blackPieces.add(new Pawn(2, 1, 'b'));
        blackPieces.add(new Pawn(3, 1, 'b'));
        blackPieces.add(new Pawn(4, 1, 'b'));
        blackPieces.add(new Pawn(5, 1, 'b'));
        blackPieces.add(new Pawn(6, 1, 'b'));
        blackPieces.add(new Pawn(7, 1, 'b'));



        whitePieces.add(new Pawn(0, 6, 'w'));
        whitePieces.add(new Pawn(1, 6, 'w'));
        whitePieces.add(new Pawn(2, 6, 'w'));
        whitePieces.add(new Pawn(3, 6, 'w'));
        whitePieces.add(new Pawn(4, 6, 'w'));
        whitePieces.add(new Pawn(5, 6, 'w'));
        whitePieces.add(new Pawn(6, 6, 'w'));
        whitePieces.add(new Pawn(7, 6, 'w'));

        whitePieces.add(new Rook(0, 7, 'w'));
        whitePieces.add(new Horse(1, 7, 'w'));
        whitePieces.add(new Bishop(2, 7, 'w'));
        whitePieces.add(new Queen(3, 7, 'w'));
        whitePieces.add(new King(4, 7, 'w'));
        whitePieces.add(new Bishop(5, 7, 'w'));
        whitePieces.add(new Horse(6, 7, 'w'));
        whitePieces.add(new Rook(7, 7, 'w'));
    }

    public ArrayList<Piece> getWhitePieces() {
        return this.whitePieces;
    }

    public ArrayList<Piece> getBlackPieces() {
        return this.blackPieces;
    }

    public ArrayList<Piece> getAllPieces() {
        ArrayList<Piece> pieces = new ArrayList<>();
        pieces.addAll(getWhitePieces());
        pieces.addAll(getBlackPieces());

        return pieces;
    }

    public Piece[][] getBoardArray() {
        Piece[][] boardArray = new Piece[8][8];

        ArrayList<Piece> pieces = getAllPieces();

        for(Piece piece : pieces) {
            int x = piece.getPosX();
            int y = piece.getPosY();

            boardArray[y][x] = piece;
        }

        return boardArray;
    }
}
