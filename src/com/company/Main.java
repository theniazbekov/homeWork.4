package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
	boss.setHealth(200);
	boss.setDamage(30);
	boss.setTypeOfProtection("Стальной щит гигантов");
	boss.Info();
    }
}
