package model;

public class Piece {
    private char color;
    private String type;
    private boolean isPlayer;

    public Piece(char color, String type, boolean isPlayer){
        this.color = color;
        this.type = type;
        this.isPlayer = isPlayer;
    }

    public void Empty(char color){
        type = "empty";
        isPlayer = false;
    }


    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPlayer() {
        return isPlayer;
    }

    public void setPlayer(boolean player) {
        isPlayer = player;
    }
}
