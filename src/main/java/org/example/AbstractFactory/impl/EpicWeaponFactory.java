package org.example.AbstractFactory.impl;

import org.example.AbstractFactory.WeaponFactory;
import org.example.Weapons.Axes.EpicAxe;
import org.example.Weapons.Maces.EpicMace;
import org.example.Weapons.Swords.EpicSword;
import org.example.Weapons.Weapon;

public class EpicWeaponFactory extends WeaponFactory {
    @Override
    public Weapon createSword() {
        return new EpicSword("Epic sword of Odin", 3, "Whirlwind Slash");
    }

    @Override
    public Weapon createMace() {
        return new EpicMace("Epic mace of Godrick", 3, "Stunning strike");
    }

    @Override
    public Weapon createAxe() {
        return new EpicAxe("Epic axe of Godfrey", 3, "Overhead Strike");
    }
}
