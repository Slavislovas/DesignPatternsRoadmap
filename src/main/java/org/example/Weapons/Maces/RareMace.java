package org.example.Weapons.Maces;

import org.example.Player;
import org.example.Weapons.Weapon;

public class RareMace extends Weapon {
    public RareMace(String name, Integer damage) {
        setName(name);
        setDamage(damage);
    }

    @Override
    public String toString() {
        return "RareMace{" +
                "name='" + getName() + '\'' +
                "damage='" + getDamage() + '\'' +
                '}';
    }

    @Override
    public Integer sell() {
        return 2;
    }

    @Override
    public void dealDamage(Player player) {
        player.takeDamage(getDamage());
    }
}
