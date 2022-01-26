package com.joshuadavy.rpg;

public class LeatherArmor extends Armor {

    public LeatherArmor(){
        this.setDescription("Leather Armor");
        this.setDurability(100);
        this.setMagicDefenseValue(5);
        this.setPhysicalDefenseValue(10);
        this.equipArmor();
    }
}
