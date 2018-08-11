package com.pmz.deepseaadventures.domain;

import com.pmz.deepseaadventures.constants.GeneralConstants;
import com.pmz.deepseaadventures.utils.TileHandler;
import com.pmz.deepseaadventures.utils.TreasureHandler;

import java.util.ArrayList;
import java.util.List;

import static com.pmz.deepseaadventures.constants.GeneralConstants.BLUE_COLOR_MEEPLE;
import static com.pmz.deepseaadventures.constants.GeneralConstants.GREEN_COLOR_MEEPLE;
import static com.pmz.deepseaadventures.constants.GeneralConstants.RED_COLOR_MEEPLE;
import static com.pmz.deepseaadventures.domain.enums.PlayerType.BOT;
import static com.pmz.deepseaadventures.domain.enums.PlayerType.PLAYER;

public class GameEngine {

    private DiceRoller diceRoller;
    private TreasureHandler treasureHandler;
    private TileHandler tileHandler;
    private int numberOfPlayers;
    private List<Player> players;


    public GameEngine() {
        diceRoller = new DiceRoller();
        treasureHandler = new TreasureHandler();
        tileHandler = new TileHandler();
        tileHandler.populateTiles(treasureHandler.getAllAvailableValueTreasures());

        players = new ArrayList<>();
        players.add(0, new Player(0, PLAYER, GREEN_COLOR_MEEPLE));
        players.add(1, new Player(1, BOT, RED_COLOR_MEEPLE));
        players.add(2, new Player(2, BOT, BLUE_COLOR_MEEPLE));
        assignStartingTileToPlayers();
        numberOfPlayers = players.size();
    }

    public void rollDice() {
        diceRoller.rollDice();
    }

    public int getDiceSum() {
        return diceRoller.getSum();
    }

    public int getDice1Result() {
        return diceRoller.getDie1();
    }

    public int getDice2Result() {
        return diceRoller.getDie2();
    }

    public List<Tile> getAllTiles() {
        return tileHandler.getAllTiles();
    }

    public List<Treasure> getAllTreasures() {
        return treasureHandler.getAllTreasures();
    }

    public DiceRoller getDiceRoller() {
        return diceRoller;
    }

    public TreasureHandler getTreasureHandler() {
        return treasureHandler;
    }

    public TileHandler getTileHandler() {
        return tileHandler;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void assignStartingTileToPlayers() {
        for (Player player : players) {
            player.setCurrentTile(getAllTiles().get(0));
        }
    }

    public void occupyTile(Player player, Tile tile) {
        tile.makeTileOccupied();
        player.setCurrentTile(tile);
    }
}
