package com.company;

public abstract class Hero {
    private int health;
    private int damage;
    private String superAbility;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public Hero(int health, int damage, String superAbility) {

    }

    public Hero(int health, int damage ) {
    }
}


