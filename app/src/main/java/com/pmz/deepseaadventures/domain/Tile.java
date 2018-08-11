package com.pmz.deepseaadventures.domain;

import com.pmz.deepseaadventures.constants.GeneralConstants;

import static com.pmz.deepseaadventures.constants.GeneralConstants.TAKEN_TREASURE_ID;

public class Tile {

    private int number;
    private boolean occupied;       // whether the tile is occupied by a meeple
    private int treasureId;         // -1 = Empty Tile; 0 = Taken treasure

    public Tile(int number) {
        this.number = number;
        this.occupied = false;
        this.treasureId = -1;
    }

    public void assignTreasure(int treasureId) {
        this.treasureId = treasureId;
    }

    public void makeTileOccupied() {
        this.occupied = true;
    }

    public void makeTileUnoccupied() {
        this.occupied = false;
    }

    public void takeTreasure() {
        this.treasureId = TAKEN_TREASURE_ID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public int getTreasureId() {
        return treasureId;
    }

    public boolean isEmpty() {
        return treasureId == -1;
    }

    public void setEmpty() {
        this.treasureId = -1;
    }

}
