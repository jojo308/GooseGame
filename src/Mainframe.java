import panels.GameScreen;
import panels.MainMenu;
import panels.Options;

import javax.swing.*;
import java.awt.*;

public class Mainframe {

    private final static String TITLE = "Goose game";
    private final static int FRAME_WIDTH = 1500;
    private final static int FRAME_HEIGHT = 1000;

    protected void displayGUI() {
        JFrame frame = new JFrame(TITLE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new CardLayout());

        MainMenu panel1 = new MainMenu(contentPane);
        GameScreen panel2 = new GameScreen(contentPane);
        Options panel3 = new Options(contentPane);

        contentPane.add(panel1, "start");
        contentPane.add(panel2, "game");
        contentPane.add(panel3, "options");

        frame.getContentPane().add(contentPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

