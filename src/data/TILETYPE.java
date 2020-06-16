package data;

public enum TILETYPE {
    TILE_STRAIGHT("src/resources/tile_straight.png"),
    TILE_TOP_LEFT("src/resources/tile_top_left.png"),
    TILE_TOP_RIGHT("src/resources/tile_top_right.png"),
    TILE_BOTTOM_LEFT("src/resources/tile_bottom_left.png"),
    TILE_BOTTOM_RIGHT("src/resources/tile_bottom_right.png"),
    TILE_START("src/resources/tile_start.png"),
    TILE_BLANK("src/resources/tile_blank.png");

    private String src;

    TILETYPE(String src) {
        this.src = src;
    }

    public String getSource() {
        return src;
    }

}
