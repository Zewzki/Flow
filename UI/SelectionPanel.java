package UI;

import javax.swing.*;
import java.awt.*;

public class SelectionPanel extends JPanel {

    private GridBagLayout gbl;
    private GridBagConstraints gbc;

    private JButton playButton;
    private JButton createButton;
    private JButton solveButton;
    public SelectionPanel() {

        gbl = new GridBagLayout();
        gbc = new GridBagConstraints();

        playButton = new JButton("Play");
        createButton = new JButton("Create");
        solveButton = new JButton("Solve");

        setLayout(gbl);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.ipadx = 5;
        gbc.ipady = 1;
        gbc.weightx = 3;
        gbc.weighty = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 3;

        gbc.gridy = 0;

        gbc.gridx = 0;
        add(playButton, gbc);

        gbc.gridx = 1;
        add(createButton, gbc);

        gbc.gridx = 2;
        add(solveButton, gbc);

    }

}
