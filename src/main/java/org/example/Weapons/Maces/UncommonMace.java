package org.example.Weapons.Maces;

import org.example.Player;
import org.example.Weapons.Weapon;

public class UncommonMace extends Weapon {
    public UncommonMace(String name, Integer damage) {
        setName(name);
        setDamage(damage);
    }

    @Override
    public String toString() {
        return "UncommonMace{" +
                "name='" + getName() + '\'' +
                "damage='" + getDamage() + '\'' +
                '}';
    }

    @Override
    public Integer sell() {
        return 1;
    }

    @Override
    public void dealDamage(Player player) {
        player.takeDamage(getDamage());
    }
}
