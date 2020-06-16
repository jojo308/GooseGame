package panels;

import javax.swing.*;
import java.awt.*;

public class Options extends JPanel {

    public Options(JPanel panel) {
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));

        JLabel fullscreenLbl = new JLabel("enable fullscreen");
        JCheckBox fullscreenCB = new JCheckBox();

        JLabel soundLbl = new JLabel("volume");
        JCheckBox soundCB = new JCheckBox();

        JButton returnBtn = new JButton("return");
        returnBtn.addActionListener(e -> {
            CardLayout layout = (CardLayout) panel.getLayout();
            layout.show(panel, "start");
        });

        optionsPanel.add(fullscreenLbl);
        optionsPanel.add(fullscreenCB);
        optionsPanel.add(soundLbl);
        optionsPanel.add(soundCB);
        optionsPanel.add(returnBtn);
        add(optionsPanel);
    }
}