package Logic;

import Common.Common;

import java.io.Serializable;

public class FlowPuzzle {

    // Members
    private int boardWidth;
    private int boardHeight;

    private Cell[][] board;

    // Constructors
    public FlowPuzzle(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        board = new Cell[this.boardWidth][this.boardHeight];

        for (int i = 0; i < this.boardWidth; i++) {
            for (int j = 0; j < this.boardHeight; j++) {
                board[i][j] = new Cell();
            }
        }

        for (int i = 0; i < this.boardWidth; i++) {
            for (int j = 0; j < this.boardHeight; j++) {

                Cell c = board[i][j];

                if (i == 0) {
                    c.SetPerimeterStatus(Common.CellPerimeterStatus.IsPerimeter);
                }
                else if (i == this.boardWidth - 1) {
                    c.SetPerimeterStatus(Common.CellPerimeterStatus.IsPerimeter);
                }
                else {
                    c.SetPerimeterStatus(Common.CellPerimeterStatus.IsCentral);
                }

                if (j == 0) {
                    c.SetPerimeterStatus(Common.CellPerimeterStatus.IsPerimeter);
                }
                else if (j == this.boardHeight - 1) {
                    c.SetPerimeterStatus(Common.CellPerimeterStatus.IsPerimeter);
                }
                else {
                    c.SetPerimeterStatus(Common.CellPerimeterStatus.IsCentral);
                }

            }
        }

    }

    public FlowPuzzle(String puzzlePath) {
    }

    // Enums

    // Public Methods

    // Private Methods

    // Getters & Setters

    public int getBoardWidth() { return boardWidth; }
    public void setBoardWidth(int boardWidth) { this.boardWidth = boardWidth; }

    public int getBoardHeight() { return boardHeight; }
    public void setBoardHeight(int boardHeight) { this.boardHeight = boardHeight; }

}
