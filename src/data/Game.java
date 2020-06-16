package data;

public class Game {

    public enum  dice { ONE, TWO}

    private int width, height;
    private Tile[] tiles;
    private String[] players;

    //todo add constructor builder
    public Game() {
        width = 10;
        height = 11;
    }

    public Game(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public Game(int width, int height, String[] players) {
        this.width = width;
        this.height = height;
        this.players = players;
    }

    /*public int getTiles() {
        return tiles;
    }

    public void setTiles(int tiles) {
        this.tiles = tiles;
    }*/

    public String[] getPlayers() {
        return players;
    }

    public void setPlayers(String[] players) {
        this.players = players;
    }
}
