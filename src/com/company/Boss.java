package com.company;

public class Boss {
    private int health;
    private int damage;
    private String typeOfProtection;

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

    public String getTypeOfProtection() {
        return typeOfProtection;
    }

    public void setTypeOfProtection(String typeOfProtection) {
        this.typeOfProtection = typeOfProtection;

    }

    public void Info() {
        System.out.println("Здоровье босса: " + getHealth());
        System.out.println("Урон босса: " + getDamage());
        System.out.println("Тип защиты босса: " + getTypeOfProtection());


    }

}
