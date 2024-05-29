package com.example.aliens_vs_humans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntityTest {
    public String alienName = "Zorg";
    public String humanName = "John";
    public int defaultHealth = 100;
    public int defaultArmor = 70;

    @Test
    public void testEntityCreation() {
        Entity entity = new Alien(alienName, defaultHealth, defaultArmor); // Using Alien since Entity is abstract
        assertNotNull(entity);
    }

    @Test
    public void testGettersAndSetters() {
        String newName = "Peter";
        int newHealth = defaultHealth - 10;
        int newArmor = defaultArmor - 20;
        Entity entity = new Human(humanName, defaultHealth, defaultArmor); // Using Human since Entity is abstract
        assertEquals(humanName, entity.getName());
        assertEquals(defaultHealth, entity.getHealth());
        assertEquals(defaultArmor, entity.getArmor());
        // Changing the Name, Health, and Armor
        entity.setName(newName);
        entity.setHealth(newHealth);
        entity.setArmor(newArmor);
        // Validation
        assertEquals(newName, entity.getName());
        assertEquals(newHealth, entity.getHealth());
        assertEquals(newArmor, entity.getArmor());
    }
}
