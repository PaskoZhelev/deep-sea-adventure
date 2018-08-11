package com.pmz.deepseaadventures.domain;

import com.pmz.deepseaadventures.domain.enums.TreasureType;

public class Treasure {

    private int id;
    private TreasureType treasureType;
    private int points;

    public Treasure(int id, TreasureType treasureType, int points) {
        this.id = id;
        this.treasureType = treasureType;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TreasureType getTreasureType() {
        return treasureType;
    }

    public void setTreasureType(TreasureType treasureType) {
        this.treasureType = treasureType;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
