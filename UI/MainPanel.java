package UI;

import Logic.FlowGame;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    private FlowLayout flowLayout;
    private SelectionPanel selectionPanel;
    private PlayPanel playPanel;
    private PuzzleCreationPanel creationPanel;
    private SolvePanel solvePanel;

    private FlowGame flowGame;

    public MainPanel() {

        selectionPanel = new SelectionPanel();

        flowLayout = new FlowLayout();
        setLayout(flowLayout);

        add(selectionPanel);

    }

}
