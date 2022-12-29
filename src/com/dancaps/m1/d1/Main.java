package com.dancaps.m1.d1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int turnOrder;

        NonPlayerCharacter npc = new NonPlayerCharacter(100, 10); // Creating an NPC
        System.out.println("These are the NPC attributes: " + npc.toString()); // Using custom toString method
        System.out.println();

        Monster spider = new Monster(); // Creates a default monster object
        System.out.println("These are the SPIDER attributes: " + spider.toString()); // Using custom toString method
        System.out.println();

        Monster snake = new Monster(50, 5, "Snake", 10); // Creates a custom monster object
        System.out.println("These are the SNAKE attributes: " + snake.toString()); // Using custom toString method
        System.out.println();

        while(snake.isAlive() && spider.isAlive()) {
            System.out.println();
            turnOrder = randomNumber.nextInt(2);
            if(turnOrder == 0) {
                System.out.println("Snake is attacking!");
                System.out.println(snake.getType() + " hits " + spider.getType() + " for " + snake.getDamage()
                 + " points of damage.");
                spider.decreaseHitPoints(snake.getDamage()); // Decrease the hit points of spider
                if(spider.isAlive()) {
                    System.out.println(spider.getType() + " now has " + spider.getHitPoints() + " hit points left.");
                } else {
                    System.out.println("Sadly " + spider.getType() + " has lost the battle.");
                }
            } else {
                System.out.println("Spider is attacking!");
                System.out.println(spider.getType() + " hits " + snake.getType() + " for " + spider.getDamage()
                        + " points of damage.");
                snake.decreaseHitPoints(spider.getDamage()); // Decrease the hit points of spider
                if(snake.isAlive()) {
                    System.out.println(snake.getType() + " now has " + snake.getHitPoints() + " hit points left.");
                } else {
                    System.out.println("Sadly " + snake.getType() + " has lost the battle.");
                }
            }
        }
        System.out.println();
    }
}