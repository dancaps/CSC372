package com.dancaps.m1.d1;

public class NonPlayerCharacter {
    int hitPoints;
    int level;

    public NonPlayerCharacter() {
        this(0, 0);
    }

    public NonPlayerCharacter(int hitPoints, int level) {
        this.hitPoints = hitPoints;
        this.level = level;
    }

    @Override
    public String toString() {
        return "NonPlayerCharacter{" +
                "hitPoints=" + hitPoints +
                ", level=" + level +
                '}';
    }

    public void increaseHitPoints(int hitPoints) {
        this.hitPoints += hitPoints;
    }
    public void decreaseHitPoints(int hitPoints) {
        this.hitPoints = Math.max(this.hitPoints - hitPoints, 0);
    }

    public void increaseLevel() {
        this.level++;
    }
    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getLevel() {
        return level;
    }
}
