package org.example;

public class Gladiator {
    protected int constitution;
    protected int strength;
    protected int xp;
    protected int dexterity;
    protected int level;
    protected int charisma;
    protected int basicAttack;
    protected int basicHp;
    protected boolean haveShield;

    public Gladiator(int constitution, int strength, int xp, int dexterity, int level, int charisma, int basicAttack, int basicHp, boolean haveShield) {
        this.constitution = constitution;
        this.strength = strength;
        this.xp = xp;
        this.dexterity = dexterity;
        this.level = level;
        this.charisma = charisma;
        this.basicAttack = basicAttack;
        this.basicHp = basicHp;
        this.haveShield = haveShield;
    }

    public void printStats() {
        System.out.println("Constitution: " + constitution);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Charisma: " + charisma);
        System.out.println("Level: " + level);
        System.out.println("XP: " + xp);
        System.out.println("Basic Attack: " + basicAttack);
        System.out.println("Basic HP: " + basicHp);
        System.out.println("Have Shield: " + haveShield);
    }
}
