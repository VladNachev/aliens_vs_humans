package com.example.aliens_vs_humans;

public abstract class Entity {
    protected String name;
    protected int health;
    protected int armor;

    public Entity(String name, int health, int armor) {
        this.name = name;
        this.health = health;
        this.armor = armor;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void dealDamage(Entity target, int damage) {
        target.takeDamage(damage);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public abstract String activateSkill();

}
