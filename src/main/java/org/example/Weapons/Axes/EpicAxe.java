package org.example.Weapons.Axes;

import org.example.Player;
import org.example.Weapons.Weapon;

public class EpicAxe extends Weapon {
    private String specialAbility;

    public EpicAxe(String name, Integer damage, String specialAbility) {
        setName(name);
        setDamage(damage);
        this.specialAbility = specialAbility;
    }

    @Override
    public String toString() {
        return "EpicAxe{" +
                "name='" + getName() + '\'' +
                "damage='" + getDamage() + '\'' +
                "specialAbility='" + specialAbility + '\'' +
                '}';
    }

    @Override
    public Integer sell() {
        return 3;
    }

    @Override
    public void dealDamage(Player player) {
        player.takeDamage(getDamage());
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }
}
