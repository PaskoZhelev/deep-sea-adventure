package com.pmz.deepseaadventures.utils.factory;

import com.pmz.deepseaadventures.domain.Treasure;
import com.pmz.deepseaadventures.domain.enums.TreasureType;

import java.util.ArrayList;
import java.util.List;

import static com.pmz.deepseaadventures.domain.enums.TreasureType.TAKEN_TREASURE;
import static com.pmz.deepseaadventures.domain.enums.TreasureType.VALUE_FOUR_TREASURE;
import static com.pmz.deepseaadventures.domain.enums.TreasureType.VALUE_ONE_TREASURE;
import static com.pmz.deepseaadventures.domain.enums.TreasureType.VALUE_THREE_TREASURE;
import static com.pmz.deepseaadventures.domain.enums.TreasureType.VALUE_TWO_TREASURE;

public class TreasureFactory {

    public static List<Treasure> constructAllTreasures() {
        List<Treasure> treasures = new ArrayList<>();

        treasures.add(0, new Treasure(0, TAKEN_TREASURE, 0));
        treasures.add(1, new Treasure(1, VALUE_ONE_TREASURE, 0));
        treasures.add(2, new Treasure(2, VALUE_ONE_TREASURE, 0));
        treasures.add(3, new Treasure(3, VALUE_ONE_TREASURE, 1));
        treasures.add(4, new Treasure(4, VALUE_ONE_TREASURE, 1));
        treasures.add(5, new Treasure(5, VALUE_ONE_TREASURE, 2));
        treasures.add(6, new Treasure(6, VALUE_ONE_TREASURE, 2));
        treasures.add(7, new Treasure(7, VALUE_ONE_TREASURE, 3));
        treasures.add(8, new Treasure(8, VALUE_ONE_TREASURE, 3));
        treasures.add(9, new Treasure(9, VALUE_TWO_TREASURE, 4));
        treasures.add(10, new Treasure(10, VALUE_TWO_TREASURE, 4));
        treasures.add(11, new Treasure(11, VALUE_TWO_TREASURE, 5));
        treasures.add(12, new Treasure(12, VALUE_TWO_TREASURE, 5));
        treasures.add(13, new Treasure(13, VALUE_TWO_TREASURE, 6));
        treasures.add(14, new Treasure(14, VALUE_TWO_TREASURE, 6));
        treasures.add(15, new Treasure(15, VALUE_TWO_TREASURE, 7));
        treasures.add(16, new Treasure(16, VALUE_TWO_TREASURE, 7));
        treasures.add(17, new Treasure(17, VALUE_THREE_TREASURE, 8));
        treasures.add(18, new Treasure(18, VALUE_THREE_TREASURE, 8));
        treasures.add(19, new Treasure(19, VALUE_THREE_TREASURE, 9));
        treasures.add(20, new Treasure(20, VALUE_THREE_TREASURE, 9));
        treasures.add(21, new Treasure(21, VALUE_THREE_TREASURE, 10));
        treasures.add(22, new Treasure(22, VALUE_THREE_TREASURE, 10));
        treasures.add(23, new Treasure(23, VALUE_THREE_TREASURE, 11));
        treasures.add(24, new Treasure(24, VALUE_THREE_TREASURE, 11));
        treasures.add(25, new Treasure(25, VALUE_FOUR_TREASURE, 12));
        treasures.add(26, new Treasure(26, VALUE_FOUR_TREASURE, 12));
        treasures.add(27, new Treasure(27, VALUE_FOUR_TREASURE, 13));
        treasures.add(28, new Treasure(28, VALUE_FOUR_TREASURE, 13));
        treasures.add(29, new Treasure(29, VALUE_FOUR_TREASURE, 14));
        treasures.add(30, new Treasure(30, VALUE_FOUR_TREASURE, 14));
        treasures.add(31, new Treasure(31, VALUE_FOUR_TREASURE, 15));
        treasures.add(32, new Treasure(32, VALUE_FOUR_TREASURE, 15));

        return treasures;
    }

    public static List<Integer> constructValueTreasures(int startIndex, int endIndex) {
        List<Integer> valueTreasures = new ArrayList<>();
        for(int i = startIndex; i <= endIndex; i++) {
            valueTreasures.add(i);
        }

        return valueTreasures;
    }
}
