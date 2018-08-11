package com.pmz.deepseaadventures.utils.factory;

import com.pmz.deepseaadventures.constants.GeneralConstants;
import com.pmz.deepseaadventures.domain.Tile;

import java.util.ArrayList;
import java.util.List;

import static com.pmz.deepseaadventures.constants.GeneralConstants.NUMBER_OF_TILES;

public class TileFactory {

    public static List<Tile> constructAllTiles() {
        List<Tile> tiles = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_TILES; i++) {     // 33 tiles in total; 0 is the starting tile
            tiles.add(new Tile(i));
        }

        return tiles;
    }
}
