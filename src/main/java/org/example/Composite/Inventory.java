package org.example.Composite;

import org.example.Iterator.InventoryIterator;
import org.example.Iterator.IterableCollection;
import org.example.Iterator.Iterator;
import org.example.Player;
import org.example.Weapons.Weapon;

import java.util.List;

public class Inventory extends Weapon implements IterableCollection<Weapon> {
    List<Weapon> weapons;

    public Inventory(Weapon... weapons) {
        this.weapons = List.of(weapons);
    }

    public void add(Weapon weapon) {
        weapons.add(weapon);
    }

    public void remove(Weapon weapon) {
        weapons.remove(weapon);
    }

    public List<Weapon> getChildren() {
        return weapons;
    }

    @Override
    public Integer sell() {
        Integer totalSum = 0;

        for (Weapon weapon : weapons) {
            totalSum += weapon.sell();
        }

        return totalSum;
    }

    @Override
    public void dealDamage(Player player) {
        for (Weapon weapon : weapons) {
            weapon.dealDamage(player);
        }
    }

    @Override
    public Iterator<Weapon> getIterator() {
        return new InventoryIterator(this);
    }
}
