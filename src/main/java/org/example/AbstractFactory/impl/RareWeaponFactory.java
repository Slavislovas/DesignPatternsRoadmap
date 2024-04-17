package org.example.AbstractFactory.impl;

import org.example.AbstractFactory.WeaponFactory;
import org.example.Weapons.Axes.RareAxe;
import org.example.Weapons.Maces.RareMace;
import org.example.Weapons.Swords.RareSword;
import org.example.Weapons.Weapon;

public class RareWeaponFactory extends WeaponFactory {
    @Override
    public Weapon createSword() {
        return new RareSword("Rare sword of slashing", 2);
    }

    @Override
    public Weapon createMace() {
        return new RareMace("Rare mace of stunning", 2);
    }

    @Override
    public Weapon createAxe() {
        return new RareAxe("Rare axe of bleeding", 2);
    }
}
