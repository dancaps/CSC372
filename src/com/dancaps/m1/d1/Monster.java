package com.dancaps.m1.d1;

public class Monster extends NonPlayerCharacter {
    String type;
    int damage;

    public Monster() {
        this(50, 5, "Spider", 10);
    }

    public Monster(int hitPoints, int level, String type, int damage) {
        super(hitPoints, level);
        this.type = type;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "type='" + type + '\'' +
                ", damage=" + damage +
                ", hitPoints=" + hitPoints +
                ", level=" + level +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public boolean isAlive() {
        return hitPoints > 0;
    }
}
