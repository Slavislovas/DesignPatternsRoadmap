package org.example.Potions;

public class HealthPotion {
    private Integer healAmount;

    public HealthPotion(Integer healAmount) {
        this.healAmount = healAmount;
    }

    public Integer getHealAmount() {
        return healAmount;
    }

    public void setHealAmount(Integer healAmount) {
        this.healAmount = healAmount;
    }
}
