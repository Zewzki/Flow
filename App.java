import Logic.FlowGame;
import UI.MainFrame;
import UI.MainPanel;

public class App {

    public static void main(String[] args) {

        MainPanel mainPanel = new MainPanel();

        MainFrame mainFrame = new MainFrame(mainPanel);


        FlowGame flowGame = new FlowGame();



    }

}
