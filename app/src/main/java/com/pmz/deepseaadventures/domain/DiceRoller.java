package com.pmz.deepseaadventures.domain;

import java.util.Random;

public class DiceRoller {

    private int die1;
    private int die2;

    private Random rand;

    public DiceRoller() {
        rand = new Random();
        rollDice();
    }

    public void rollDice() {
        setDie1(generateRandomNumber());
        setDie2(generateRandomNumber());
    }

    public int getSum() {
        return die1 + die2;
    }

    public int generateRandomNumber() {
        return rand.nextInt(3) + 1;
    }

    public int getDie1() {
        return die1;
    }

    public void setDie1(int die1) {
        this.die1 = die1;
    }

    public int getDie2() {
        return die2;
    }

    public void setDie2(int die2) {
        this.die2 = die2;
    }
}
