package Logic;

import Common.Common;
import Generator.LoadPuzzleFromFile;

import java.io.Serializable;

public class FlowPuzzle {

    // Members
    private int boardWidth;
    private int boardHeight;

    private Cell[][] playBoard;
    private Cell[][] soutionBoard;

    // Constructors
    // Create blank board
    public FlowPuzzle(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        soutionBoard = new Cell[this.boardWidth][this.boardHeight];
        playBoard = new Cell[this.boardWidth][this.boardHeight];

        // initialize all
        for (int i = 0; i < this.boardWidth; i++) {
            for (int j = 0; j < this.boardHeight; j++) {
                soutionBoard[i][j] = new Cell();
                playBoard[i][j] = new Cell();
            }
        }

        for (int i = 0; i < this.boardWidth; i++) {
            for (int j = 0; j < this.boardHeight; j++) {

                Cell playCell = playBoard[i][j];

                if (i == 0) {
                    playCell.SetPerimeterStatus(Common.CellPerimeterStatus.IsPerimeter);
                }
                else if (i == this.boardWidth - 1) {
                    playCell.SetPerimeterStatus(Common.CellPerimeterStatus.IsPerimeter);
                }
                else {
                    playCell.SetPerimeterStatus(Common.CellPerimeterStatus.IsCentral);
                }

                if (j == 0) {
                    playCell.SetPerimeterStatus(Common.CellPerimeterStatus.IsPerimeter);
                }
                else if (j == this.boardHeight - 1) {
                    playCell.SetPerimeterStatus(Common.CellPerimeterStatus.IsPerimeter);
                }
                else {
                    playCell.SetPerimeterStatus(Common.CellPerimeterStatus.IsCentral);
                }

            }
        }
    }
    // Load solution board from path
    public FlowPuzzle(String puzzlePath) {
    }

    public void LoadPuzzleFromFile(String puzzlePath) {

    }

    public void ClearPuzzleData() {

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
