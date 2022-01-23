package com.joshuadavy.rpg;

public class Sword extends Weapon {

    public Sword() {
        this.setMagicValue(0);
        this.setAttackValue(15);
        this.setDurability(100);
        this.setDescription("Sword");
        this.setRanged(false);
        this.useAttack();
    }
}
