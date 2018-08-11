package com.pmz.deepseaadventures.domain;

import com.pmz.deepseaadventures.domain.enums.PlayerType;

import java.util.ArrayList;
import java.util.List;

import static com.pmz.deepseaadventures.domain.enums.PlayerType.BOT;

public class Player {

    private int id;
    private int points;
    private Tile currentTile;
    private PlayerType playerType;
    private String playerColor;
    private List<Integer> allTreasureIds;
    private List<Integer> currentRoundTreasureIds;

    public Player(int id, PlayerType playerType, String playerColor) {
        this.id = id;
        this.points = 0;
        this.playerType = playerType;
        this.playerColor = playerColor;
        this.allTreasureIds = new ArrayList<>();
        this.currentRoundTreasureIds = new ArrayList<>();
    }

    public void calculateAllTreasuresPoints() {
        //TODO
    }

    public boolean isBotPlayer() {
        return playerType == BOT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tile getCurrentTile() {
        return currentTile;
    }

    public void setCurrentTile(Tile currentTile) {
        this.currentTile = currentTile;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public String getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }

    public List<Integer> getAllTreasureIds() {
        return allTreasureIds;
    }

    public void setAllTreasureIds(List<Integer> allTreasureIds) {
        this.allTreasureIds = allTreasureIds;
    }

    public List<Integer> getCurrentRoundTreasureIds() {
        return currentRoundTreasureIds;
    }

    public void setCurrentRoundTreasureIds(List<Integer> currentRoundTreasureIds) {
        this.currentRoundTreasureIds = currentRoundTreasureIds;
    }

    public int numberOfCarriedTreasures() {
        return currentRoundTreasureIds.size();
    }


}
