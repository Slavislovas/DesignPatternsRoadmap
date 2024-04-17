package org.example.Adapter;

import org.example.Player;
import org.example.Potions.HealthPotion;
import org.example.Weapons.Weapon;

public class ThrowableHealthPotionAdapter extends Weapon {
    private HealthPotion healthPotion;

    public ThrowableHealthPotionAdapter(HealthPotion healthPotion) {
        this.healthPotion = healthPotion;
    }

    @Override
    public Integer sell() {
        return 5;
    }

    @Override
    public void dealDamage(Player player) {
        player.heal(healthPotion.getHealAmount());
    }
}
