package com.joshuadavy.rpg;

public class WeaponAttributes{

      private String description;
      private int attackValue;
      private boolean isRanged;
      private int magicValue;
      private int durability;


      public void useAttack(int attackValue, String description) {
            this.attackValue = attackValue;
            this.description = description;
            this.durability = durability - 1;
            System.out.println("You attacked with " + attackValue + " attack from " + description);
            System.out.println("Your " + description + "'s durability is now " + durability);

      }

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


}



