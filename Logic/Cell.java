package Logic;

import Common.Common;

import java.util.HashMap;

public class Cell {

    private final HashMap<Common.Direction, FlowComponent> neighborMap;
    private FlowComponent contents;
    private Common.CellState cellState;
    private Common.CellPerimeterStatus perimeterStatus;
    private boolean isVisited;
    public Cell() {
        contents = null;
        cellState = Common.CellState.Empty;
        perimeterStatus = Common.CellPerimeterStatus.IsCentral;
        isVisited = false;
        neighborMap = new HashMap<>();
    }

    public FlowComponent getContents() { return contents; }

    public void setContents(FlowComponent newContent) {

        if (newContent instanceof Vertex) {
            contents = newContent;
            cellState = Common.CellState.Vertex;
        }
        else if (newContent instanceof Edge) {
            contents = newContent;
            cellState = Common.CellState.Edge;
        }
        else if (newContent == null) {
            newContent = null;
            cellState = Common.CellState.Empty;
        }
        else {
            // This shouldn't be possible unless I add more FLowComponent subclasses
            System.err.println("Unrecognized Flow Component");
            contents = null;
            cellState = Common.CellState.Empty;
        }

    }

    public void SetNeighbor(Common.Direction direction, FlowComponent neighbor) { neighborMap.put(direction, neighbor); }

    public HashMap<Common.Direction, FlowComponent> GetNeighbors() { return neighborMap; }
    public Common.CellState GetCellState() { return cellState; }

    public Common.CellPerimeterStatus GetPerimeterStatus() { return perimeterStatus; }
    public void SetPerimeterStatus(Common.CellPerimeterStatus perimeterStatus) { this.perimeterStatus = perimeterStatus; }

    public boolean IsVisited() { return isVisited; }
    public void SetVisited(boolean newVisited) { isVisited = newVisited; }

}
