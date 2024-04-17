package org.example.Potions;

public class PoisonPotion {
    private Integer damageValue;

    public PoisonPotion(Integer damageValue) {
        this.damageValue = damageValue;
    }

    public Integer getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(Integer damageValue) {
        this.damageValue = damageValue;
    }
}
