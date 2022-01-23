package com.joshuadavy.rpg;

import sun.lwawt.macosx.CSystemTray;

public class Weapon {

      private String description;
      private int attackValue;
      private boolean isRanged;
      private int magicValue;
      private int durability;


      public String getDescription() {
            return description;
      }

      public void setDescription(String description) {
            this.description = description;
      }

      public int getAttackValue() {
            return attackValue;
      }

      public void setAttackValue(int attackValue) {
            this.attackValue = attackValue;
      }

      public void setRanged(boolean ranged) {
            isRanged = ranged;
      }

      public int getDurability() {
            return durability;
      }

      public void setDurability(int durability) {
            this.durability = durability;
      }

      public int getMagicValue() {
            return magicValue;
      }

      public void setMagicValue(int magicValue) {
            this.magicValue = magicValue;
      }

      public void useAttack() {
            this.durability = this.durability - 1;
            System.out.println("You attacked with " + this.attackValue + " attack from " + this.description);
            System.out.println("Your " + this.description + "'s durability is now " + this.durability);
            if (magicValue == 0){
                  System.out.println("Your " + this.description + " is not a Magic Weapon");
            }
            else {
                  System.out.println("Your " + this.description + " has a Magic Stat of " + this.magicValue);
            }
      }


}



