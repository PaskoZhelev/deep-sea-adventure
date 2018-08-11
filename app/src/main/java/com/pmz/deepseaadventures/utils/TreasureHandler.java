package com.pmz.deepseaadventures.utils;

import com.pmz.deepseaadventures.constants.GeneralConstants;
import com.pmz.deepseaadventures.domain.Player;
import com.pmz.deepseaadventures.domain.Treasure;
import com.pmz.deepseaadventures.utils.factory.TreasureFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.pmz.deepseaadventures.constants.GeneralConstants.VALUE_FOUR_TREASURE_END_INDEX;
import static com.pmz.deepseaadventures.constants.GeneralConstants.VALUE_FOUR_TREASURE_START_INDEX;
import static com.pmz.deepseaadventures.constants.GeneralConstants.VALUE_ONE_TREASURE_END_INDEX;
import static com.pmz.deepseaadventures.constants.GeneralConstants.VALUE_ONE_TREASURE_START_INDEX;
import static com.pmz.deepseaadventures.constants.GeneralConstants.VALUE_THREE_TREASURE_END_INDEX;
import static com.pmz.deepseaadventures.constants.GeneralConstants.VALUE_THREE_TREASURE_START_INDEX;
import static com.pmz.deepseaadventures.constants.GeneralConstants.VALUE_TWO_TREASURE_END_INDEX;
import static com.pmz.deepseaadventures.constants.GeneralConstants.VALUE_TWO_TREASURE_START_INDEX;

public class TreasureHandler {

    private List<Treasure> allTreasures;

    private List<Integer> availableValueOneTreasures;
    private List<Integer> availableValueTwoTreasures;
    private List<Integer> availableValueThreeTreasures;
    private List<Integer> availableValueFourTreasures;

    private List<Integer> allAvailableValueTreasures;

    public TreasureHandler() {
        this.allTreasures = TreasureFactory.constructAllTreasures();
        this.availableValueOneTreasures = TreasureFactory
                .constructValueTreasures(VALUE_ONE_TREASURE_START_INDEX, VALUE_ONE_TREASURE_END_INDEX);
        this.availableValueTwoTreasures = TreasureFactory
                .constructValueTreasures(VALUE_TWO_TREASURE_START_INDEX, VALUE_TWO_TREASURE_END_INDEX);
        this.availableValueThreeTreasures = TreasureFactory
                .constructValueTreasures(VALUE_THREE_TREASURE_START_INDEX, VALUE_THREE_TREASURE_END_INDEX);
        this.availableValueFourTreasures = TreasureFactory
                .constructValueTreasures(VALUE_FOUR_TREASURE_START_INDEX, VALUE_FOUR_TREASURE_END_INDEX);

        allAvailableValueTreasures = new ArrayList<>();
        shuffleValueTreasureLists();
        combineAvailableValueTreasureLists();
    }

    public List<Treasure> getAllTreasures() {
        return allTreasures;
    }

    public Treasure getTreasureById(int id) {
        return allTreasures.get(id);
    }

    public List<Integer> getAvailableValueOneTreasures() {
        return availableValueOneTreasures;
    }

    public List<Integer> getAvailableValueTwoTreasures() {
        return availableValueTwoTreasures;
    }

    public List<Integer> getAvailableValueThreeTreasures() {
        return availableValueThreeTreasures;
    }

    public List<Integer> getAvailableValueFourTreasures() {
        return availableValueFourTreasures;
    }

    private void shuffleValueTreasureLists() {
        Collections.shuffle(availableValueOneTreasures);
        Collections.shuffle(availableValueTwoTreasures);
        Collections.shuffle(availableValueThreeTreasures);
        Collections.shuffle(availableValueFourTreasures);
    }

    public List<Integer> getAllAvailableValueTreasures() {
        return allAvailableValueTreasures;
    }

    public void combineAvailableValueTreasureLists() {
        allAvailableValueTreasures.clear();
        allAvailableValueTreasures.addAll(availableValueOneTreasures);
        allAvailableValueTreasures.addAll(availableValueTwoTreasures);
        allAvailableValueTreasures.addAll(availableValueThreeTreasures);
        allAvailableValueTreasures.addAll(availableValueFourTreasures);
    }

    public void removeCollectedValueTreasures(List<Player> players) {
        for (Player player : players) {
            List<Integer> collectedTreasures = player.getCurrentRoundTreasureIds();
            for (Integer treasureId : collectedTreasures) {
                getResponsibleValueTreasuresList(treasureId).remove(Integer.valueOf(treasureId));
            }
        }
    }

    private List<Integer> getResponsibleValueTreasuresList(int treasureId){
        if(treasureId >= VALUE_ONE_TREASURE_START_INDEX && treasureId <=  VALUE_ONE_TREASURE_END_INDEX){
            return availableValueOneTreasures;
        } else if (treasureId >= VALUE_TWO_TREASURE_START_INDEX && treasureId <=  VALUE_TWO_TREASURE_END_INDEX){
            return availableValueTwoTreasures;
        } else if (treasureId >= VALUE_THREE_TREASURE_START_INDEX && treasureId <=  VALUE_THREE_TREASURE_END_INDEX){
            return availableValueThreeTreasures;
        } else {
            return availableValueFourTreasures;
        }
    }
}
