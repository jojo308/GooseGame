package panels;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JPanel {

    public MainMenu(JPanel panel) {
        panel.setBackground(Color.GREEN);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));

        JButton start = new JButton("start game");
        start.addActionListener(e -> {
            GameOptions gameOptions = new GameOptions(panel);

        });
        start.setBounds(0, 0, 150, 50);

        JButton options = new JButton("options");
        options.addActionListener(e -> {
            CardLayout layout = (CardLayout) panel.getLayout();
            layout.show(panel, "options");
        });

        JButton exit = new JButton("quit game");
        exit.addActionListener(e -> {
            int input = JOptionPane.showConfirmDialog(panel,
                    "Do you really want to quit?", "",
                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (input == 0) {
                System.exit(0);
            }
        });

        buttonPanel.add(start);
        buttonPanel.add(Box.createRigidArea(new Dimension(100, 100)));
        buttonPanel.add(options);
        buttonPanel.add(Box.createRigidArea(new Dimension(100, 100)));
        buttonPanel.add(exit);
        buttonPanel.add(Box.createRigidArea(new Dimension(100, 100)));
        add(buttonPanel);
    }
}