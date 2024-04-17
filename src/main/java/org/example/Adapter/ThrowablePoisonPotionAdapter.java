package org.example.Adapter;

import org.example.Player;
import org.example.Potions.PoisonPotion;
import org.example.Weapons.Weapon;

public class ThrowablePoisonPotionAdapter extends Weapon {
    private PoisonPotion poisonPotion;

    public ThrowablePoisonPotionAdapter(PoisonPotion poisonPotion) {
        this.poisonPotion = poisonPotion;
    }

    @Override
    public Integer sell() {
        return 5;
    }

    @Override
    public void dealDamage(Player player) {
        player.takeDamage(poisonPotion.getDamageValue());
    }
}
