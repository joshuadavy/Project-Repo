package com.joshuadavy.rpg;

public class Sword extends WeaponAttributes {

    public Sword() {
        WeaponAttributes weaponAttributes = new WeaponAttributes();

        weaponAttributes.setMagicValue(0);
        weaponAttributes.setAttackValue(69);
        weaponAttributes.setDurability(100);
        weaponAttributes.useAttack(weaponAttributes.getAttackValue(),weaponAttributes.getDescription());
        weaponAttributes.setDescription("Sword");
        weaponAttributes.setRanged(false);
    }
}
