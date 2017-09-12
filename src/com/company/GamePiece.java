package com.company;

public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;
    int maxX;
    int maxY;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.maxX = 100;
        this.maxY = 100;
        this.frozen = false;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public String getPosition() {
        return "GamePiece{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void move(int x, int y){

        if(!isFrozen()) {
            if (x > maxX)
                this.positionX = maxX;
            else
            this.positionX = x;
            if (y > maxY )
                this.positionY = maxY;
            else
                this.positionY = y;
        }
    }
    public void freeze(){
        this.frozen = true;
    }
    public void unfreeze() {
        this.frozen = false;
    }
}
