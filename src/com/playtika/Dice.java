package com.playtika;

import java.util.Random;

public class Dice {
    private int point;
    private final static int min = 1;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    private final static int max = 6;

    public int rollDice(){
        this.point =min + new Random().nextInt(max-min+1);
        return this.point;
    }
}
