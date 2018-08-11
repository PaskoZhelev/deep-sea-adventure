package com.pmz.deepseaadventures.utils;

import com.pmz.deepseaadventures.domain.Tile;
import com.pmz.deepseaadventures.utils.factory.TileFactory;

import java.util.List;

public class TileHandler {

    private List<Tile> allTiles;

    public TileHandler() {
        this.allTiles = TileFactory.constructAllTiles();
    }

    public List<Tile> getAllTiles() {
        return allTiles;
    }

    public void populateTiles(List<Integer> allAvailableValueTreasures) {
        for (int i = 0; i < allAvailableValueTreasures.size(); i++) {
            allTiles.get(i + 1)                                             //must start from 1 because tile 0 is the starting tile
                    .assignTreasure(
                            allAvailableValueTreasures.get(i));
        }
    }

}

