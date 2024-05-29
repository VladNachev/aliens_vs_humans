package com.example.aliens_vs_humans;

public class Human extends Entity{
    public Human(String name, int health, int armor) {
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
        // Implement human specific skills
        return name + " activates an alien skill";
    }
    public String eatFood() {
        // Implement special effects of eating food
        return name + " eats food and gains special effects!";
    }
}
