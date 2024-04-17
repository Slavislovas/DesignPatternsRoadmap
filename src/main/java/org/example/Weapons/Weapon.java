package org.example.Weapons;

import org.example.Player;

public abstract class Weapon {
    private String name;
    private Integer damage;

    public abstract Integer sell();
    public abstract void dealDamage(Player player);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }
}
