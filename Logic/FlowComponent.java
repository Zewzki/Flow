package Logic;

import Common.Common;

import java.util.HashMap;

public class FlowComponent {

    private final Common.Color color;
    private final Common.Shade shade;

    public FlowComponent(Common.Color color, Common.Shade shade) {
        this.color = color;
        this.shade = shade;
    }

    public Common.Color GetColor() { return color; }
    public Common.Shade GetShade() { return shade; }

}
