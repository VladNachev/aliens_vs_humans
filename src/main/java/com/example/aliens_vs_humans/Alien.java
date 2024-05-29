package com.example.aliens_vs_humans;

public class Alien extends Entity{
    public Alien(String name, int health, int armor) {
        super(name, health, armor);
    }

    @Override
    public void takeDamage(int damage) {
        // Armor reduces incoming damage
        int reducedDamage = damage - armor;
        if (reducedDamage < 0) {
            reducedDamage = 0;
        }
        super.takeDamage(reducedDamage);
    }
    @Override
    public String activateSkill() {
        // Implement alien-specific skill
        return name + " activates an alien skill";
    }

    public int heal(int healAmount) {
        // Alien heals/regenerates health
        this.health += healAmount;
        return health;
    }
    public String mutate() {
        // Implement mutation effect
        return name + " mutates and changes abilities!";
    }
}
