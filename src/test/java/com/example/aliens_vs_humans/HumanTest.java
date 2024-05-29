package com.example.aliens_vs_humans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HumanTest {
    public String humanName = "John";
    public int defaultHealth = 100;
    public int defaultArmor = 50;
    Human human = new Human(humanName, defaultHealth, defaultArmor);

    @Test
    public void testHumanCreation() {
        assertNotNull(human);
        assertEquals(humanName, human.getName());
        assertEquals(defaultHealth, human.getHealth());
        assertEquals(defaultArmor, human.getArmor());
    }

    @Test
    public void testTakeDamageLowerThanArmor() {
        int damage = 10;
        // The armor is reducing the Damage value, respectively the health value after the damage as well
        takeDamage(damage);
        // armor can take all the damage
        assertEquals(defaultHealth, human.getHealth()); // default health should not be damaged
    }

    @Test
    public void testTakeDamageHigherThanArmor() {
        int damage = 80;
        // The armor is reducing the Damage value, respectively the health value after the damage as well
        takeDamage(damage);
        // Armor cannot take all the damage
        // Default health is affected
        assertEquals(defaultHealth - (damage - defaultArmor), human.getHealth());
    }

    @Test
    public void testActivateSkill() {
        String activateSkillText = human.activateSkill();
        assertEquals(humanName + " activates an alien skill", activateSkillText);
    }

    @Test
    public void testEatFood() {
        String eatFoodText = human.eatFood();
        assertEquals(humanName + " eats food and gains special effects!", eatFoodText);
    }

    private void takeDamage(int damage) {
        human.takeDamage(damage);
    }
}
