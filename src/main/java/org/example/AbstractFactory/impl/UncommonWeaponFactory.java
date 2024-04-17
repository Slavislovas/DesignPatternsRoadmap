package org.example.AbstractFactory.impl;

import org.example.AbstractFactory.WeaponFactory;
import org.example.Weapons.Axes.UncommonAxe;
import org.example.Weapons.Maces.UncommonMace;
import org.example.Weapons.Swords.UncommonSword;
import org.example.Weapons.Weapon;

public class UncommonWeaponFactory extends WeaponFactory {
    @Override
    public Weapon createSword() {
        return new UncommonSword("Uncommon sword of destruction", 1);
    }

    @Override
    public Weapon createMace() {
        return new UncommonMace("Uncommon mace of bashing", 1);
    }

    @Override
    public Weapon createAxe() {
        return new UncommonAxe("Uncommon axe of splitting", 1);
    }
}
