package com.joshuadavy.rpg;

public class ArmorAttributes {

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



}
