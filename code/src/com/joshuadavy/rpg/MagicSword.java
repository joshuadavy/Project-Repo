package com.joshuadavy.rpg;

public class MagicSword extends Weapon {

    public MagicSword() {
        this.setDescription("Magic Sword");
        this.setMagicValue(25);
        this.setAttackValue(10);
        this.setDurability(100);
        this.setRanged(false);
        this.useAttack();
    }
}
