package com.example.aliens_vs_humans;

public class Demo {
    public static void main(String[] args) {
        Human human = new Human("John", 100, 10);
        Alien alien = new Alien("Zorg", 100, 20);

        System.out.println(human.getName() + " has " + human.getHealth() + " health.");
        System.out.println(alien.getName() + " has " + alien.getHealth() + " health.");

        human.dealDamage(alien, 80);
        System.out.println(alien.getName() + " has " + alien.getHealth() + " health after taking damage.");

        alien.heal(15);
        System.out.println(alien.getName() + " has " + alien.getHealth() + " health after healing.");

        System.out.println(human.activateSkill());
        System.out.println(alien.activateSkill());
        System.out.println(human.eatFood());
        System.out.println(alien.mutate());

    }
}
