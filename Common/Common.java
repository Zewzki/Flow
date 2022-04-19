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

    public enum EdgeType {
        LeftRight,
        UpDown,
        NW,
        SW,
        SE,
        NE
    }

    public enum CellState {
        Empty,
        ContainsVertex,
        ContainsEdge
    }

    public enum CellDeadState {
        Alive,
        Dead
    }

    public enum CellPerimeterState {
        IsPerimeter,
        IsPerimeterBy1,
        IsCentral
    }



}
