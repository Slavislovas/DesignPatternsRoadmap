package org.example.AbstractFactory;

import org.example.Weapons.Weapon;

public abstract class WeaponFactory {
    public abstract Weapon createSword();
    public abstract Weapon createMace();
    public abstract Weapon createAxe();
}
