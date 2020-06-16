package data;

import javafx.scene.layout.Border;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Tile extends JComponent {

    private int x, y, width, height;
    private TILETYPE tiletype;

    private int number;
    private Event event;

    public Tile(int x, int y, int width, int height, TILETYPE tiletype, int number) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.tiletype = tiletype;
        this.number = number;
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(64,64));
    }

    public int getNumber() {
        return number;
    }

    public void addEvent(Event event) {
        this.event = event;
    }

    public Dimension getPreferredSize() {
        return new Dimension(width,height);
    }

    @Override
    public void paintComponent(Graphics g) {
        try {
            super.paintComponent(g);
            Image sprite = ImageIO.read(new File(tiletype.getSource()));
            g.drawImage(sprite, x, y, this);
        } catch (IOException e) {
            System.out.println("failed to load " + tiletype.getSource());
            e.printStackTrace();
        }
    }


    public Event getEvent() {
        return event;
    }
}