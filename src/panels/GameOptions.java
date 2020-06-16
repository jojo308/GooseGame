package panels;

import javax.swing.*;
import java.awt.*;

public class GameOptions {

    private int width, height;

    public GameOptions(JPanel parent) {
        JPanel panel = new JPanel();
        panel.setSize(300, 500);

        JLabel boardSizeLbl = new JLabel("board size");
        JLabel widthLbl = new JLabel("width");
        JLabel heightLbl = new JLabel("height");
        JSpinner widthSpinner = new JSpinner();
        widthSpinner.setValue(10);
        JSpinner heightSpinner = new JSpinner();
        heightSpinner.setValue(11);
        JButton startBtn = new JButton("start");
        JButton cancelBtn = new JButton("back");

        panel.add(boardSizeLbl);
        panel.add(Box.createHorizontalStrut(50));
        panel.add(widthLbl);
        panel.add(heightLbl);
        panel.add(widthSpinner);
        panel.add(heightSpinner);
        panel.add(startBtn);
        panel.add(cancelBtn);

        int input = JOptionPane.showConfirmDialog(null, panel, "frame", JOptionPane.OK_CANCEL_OPTION);
        if (input == JOptionPane.OK_OPTION) {
            width = (int) widthSpinner.getValue();
            height = (int) heightSpinner.getValue();
            System.out.println("creating new board (" + width + "x" + height + ")");
            CardLayout layout = (CardLayout) parent.getLayout();
            GameScreen gameScreen = new GameScreen(panel);
            layout.show(parent, "game");
        } else {
            CardLayout layout = (CardLayout) parent.getLayout();
            layout.show(parent, "start");
            System.out.println("go back");
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}