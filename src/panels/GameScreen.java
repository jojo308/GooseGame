package panels;

import data.TILETYPE;
import data.Tile;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends JPanel {

    private JPanel grid;

    public GameScreen(JPanel panel) {
        JButton btn = new JButton("go back");
        btn.addActionListener(e -> {
            CardLayout layout = (CardLayout) panel.getLayout();
            layout.show(panel, "start");
        });

        grid = new JPanel();
        grid.setLayout(new GridLayout(10, 11));
        add(btn);
        generateField(10, 11);
        add(grid);
    }

    // smallest possible board: 14 tiles
    // largest possible board: tbd
    //todo print in spiral
    //todo numbering system according to spiral
    private void generateField(int width, int height) {
        int number;
        //start at bottom left
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
                number = ((i > 0) ? i * 10 + j + 2 : j + 1);
                TILETYPE tiletype = (number%2 == 0) ? TILETYPE.TILE_STRAIGHT : TILETYPE.TILE_BLANK;
                grid.add(new Tile(0, 0, 64, 64, tiletype, number));
                //System.out.print(number + ", ");
            }
            //System.out.println();
        }
    }
}