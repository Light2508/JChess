package de.hsos.chess.controller;

import de.hsos.chess.board.ChessBoard;
import de.hsos.chess.ui.Interface;

public class Chess {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();

        Interface.printBoard(board);
    }
}
