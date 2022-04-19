package Logic;

import Common.Common;

public class FlowComponent {

    private final Common.Color color;
    private final FlowComponent[] neighbors;

    private boolean visited;

    public FlowComponent(Common.Color color, FlowComponent[] neighbors) {
        this.color = color;
        this.neighbors = neighbors;
        visited = false;
    }

    public Common.Color GetColor() { return color; }

    public FlowComponent[] GetNeighbors() { return neighbors; }

    public boolean IsVisited() { return visited; }

    public void SetVisited(boolean newVisited) { visited = newVisited; }

}
