package controller;

import model.*;
import view.*;
import java.util.ArrayList;

public class Controller {

    public void startGame() {
        // build setup
        ArrayList<Piece> pieceList = new ArrayList<Piece>();

        ChessView view = new ChessView();
        view.showBoard(pieceList);

    }

}
