package com.joshuadavy.rpg;

public class Armor {

    String description;
    int physicalDefenseValue;
    int magicDefenseValue;
    int durability;


    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhysicalDefenseValue(int physicalDefenseValue) {
        this.physicalDefenseValue = physicalDefenseValue;
    }

    public void setMagicDefenseValue(int magicDefenseValue) {
        this.magicDefenseValue = magicDefenseValue;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void equipArmor() {
        BaseStats baseStats = new BaseStats();
        int addedDefense = baseStats.getDefense() + this.physicalDefenseValue;
        int addedMagicDefense = baseStats.getMagicDefense() + this.magicDefenseValue;
        System.out.println("Your " + this.description + " has a Defense of "
                + this.physicalDefenseValue + " and a Magic Defense of " +this.magicDefenseValue);
        System.out.println("With your " + this.description + " equipped, you now have " + addedDefense + " Physical Defense" +
                " and " + addedMagicDefense + " Magic Defense");
    }



}
