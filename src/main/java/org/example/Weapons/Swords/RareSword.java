package org.example.Weapons.Swords;

import org.example.Player;
import org.example.Weapons.Weapon;

public class RareSword extends Weapon {
    public RareSword(String name, Integer damage) {
        setName(name);
        setDamage(damage);
    }

    @Override
    public String toString() {
        return "RareSword{" +
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
