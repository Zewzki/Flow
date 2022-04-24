package Common;

public class Common {

    public enum Color {
        Red,
        Blue,
        Green,
        Yellow,
        Purple,
        Cyan,
        Orange,
        Gray
    }

    public enum Shade {
        Light,
        Normal,
        Dark
    }

    public enum CellState {
        Empty,
        Vertex,
        Edge
    }

    public enum Direction {
        North,
        South,
        East,
        West
    }

    public enum EdgeType {
        LeftRight,
        UpDown,
        NW,
        SW,
        SE,
        NE
    }

    public enum CellDeadState {
        NA,
        Alive,
        Dead
    }

    public enum CellPerimeterStatus {
        IsPerimeter,
        IsCentral
    }



}
