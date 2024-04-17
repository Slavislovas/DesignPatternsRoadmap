package org.example.Weapons.Axes;

import org.example.Player;
import org.example.Weapons.Weapon;

public class UncommonAxe extends Weapon {
    public UncommonAxe(String name, Integer damage) {
        setName(name);
        setDamage(damage);
    }

    @Override
    public String toString() {
        return "UncommonAxe{" +
                "name='" + getName() + '\'' +
                "damage='" + getDamage() + '\'' +
                '}';
    }

    @Override
    public void dealDamage(Player player) {
        player.takeDamage(getDamage());
    }

    @Override
    public Integer sell() {
        return 1;
    }
}
