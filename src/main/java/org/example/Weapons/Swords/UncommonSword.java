package org.example.Weapons.Swords;

import org.example.Player;
import org.example.Weapons.Weapon;

public class UncommonSword extends Weapon {
    public UncommonSword(String name, Integer damage) {
        setName(name);
        setDamage(damage);
    }

    @Override
    public String toString() {
        return "UncommonSword{" +
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
