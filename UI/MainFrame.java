package UI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public final MainPanel mainPanel;
    public final int ScreenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
    public final int ScreenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

    public int preferredWidth;
    public int preferredHeight;

    public MainFrame(MainPanel mainPanel) {

        this.mainPanel = mainPanel;

        preferredWidth = (int) (ScreenWidth * (3.0 / 4.0));
        preferredHeight = (int) (ScreenHeight * (3.0 / 4.0));

        setPreferredSize(new Dimension(preferredWidth, preferredHeight));
        setSize(new Dimension(preferredWidth, preferredHeight));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(mainPanel);

        setVisible(true);

    }

}
