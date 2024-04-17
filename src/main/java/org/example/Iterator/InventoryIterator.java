package org.example.Iterator;

import org.example.Composite.Inventory;
import org.example.Weapons.Weapon;

import java.util.Stack;

public class InventoryIterator implements Iterator<Weapon> {
    private final Inventory root;
    private final Stack<java.util.Iterator<Weapon>> stack;

    public InventoryIterator(Inventory root) {
        this.root = root;
        this.stack = new Stack<>();
        stack.push(root.getChildren().iterator());
    }

    @Override
    public Boolean hasNext() {
        while (!stack.isEmpty()) {
            java.util.Iterator<Weapon> currentIterator = stack.peek();

            if (currentIterator.hasNext()) {
                return true;
            } else {
                stack.pop();
            }
        }

        return false;
    }

    @Override
    public Weapon next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more weapons");
        }

        java.util.Iterator<Weapon> currentIterator = stack.peek();
        Weapon nextWeapon = currentIterator.next();

        while (nextWeapon instanceof Inventory) {
            stack.push(((Inventory) nextWeapon).getChildren().iterator());
            nextWeapon = stack.peek().next();
        }

        return nextWeapon;
    }

    @Override
    public Weapon first() {
        java.util.Iterator<Weapon> iterator = root.getChildren().iterator();
        stack.push(iterator);

        if (stack.isEmpty()) {
            throw new IllegalStateException("No weapons");
        }

        return stack.peek().next();
    }
}
