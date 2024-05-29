package com.example.aliens_vs_humans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AlienTest {
    String alienName = "Zorg";
    int defaultHealth = 100;
    int defaultArmor = 50;
    Alien alien = new Alien(alienName, defaultHealth, defaultArmor);


    @Test
    public void testAlienCreation() {
        assertNotNull(alien);
        assertEquals(alienName, alien.getName());
        assertEquals(defaultHealth, alien.getHealth());
        assertEquals(defaultArmor, alien.getArmor());
    }

    @Test
    public void testTakeDamageLowerThanArmor() {
        int damage = 20;
        // The armor is reducing the Damage value, respectively the health value after the damage as well
        takeDamage(damage);
        // armor can take all the damage
        assertEquals(defaultHealth, alien.getHealth()); // default health should not be damaged

    }

    @Test
    public void testTakeDamageHigherThanArmor() {
        int damage = 70;
        // The armor is reducing the Damage value, respectively the health value after the damage as well
        takeDamage(damage);
        // Armor cannot take all the damage
        // Default health is affected
        assertEquals(defaultHealth - (damage - defaultArmor), alien.getHealth());
    }

    @Test
    public void testHealing() {
        int damage = 80;
        int healAmount = 20;
        takeDamage(damage); // We need to take damage first
        alien.heal(healAmount);
        assertEquals((defaultHealth - (damage - defaultArmor) + healAmount), alien.getHealth());
    }

    @Test
    public void testActivateSkill() {
        String activateSkillText = alien.activateSkill();
        assertEquals(alienName + " activates an alien skill", activateSkillText);
    }

    @Test
    public void testMutation() {
        String mutationSkillText = alien.mutate();
        assertEquals(alienName + " mutates and changes abilities!", mutationSkillText);
    }
    private void takeDamage(int damage) {
        alien.takeDamage(damage);
    }

}
