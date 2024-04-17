package org.example;

import org.example.AbstractFactory.WeaponFactory;
import org.example.AbstractFactory.impl.EpicWeaponFactory;
import org.example.AbstractFactory.impl.RareWeaponFactory;
import org.example.AbstractFactory.impl.UncommonWeaponFactory;
import org.example.Adapter.ThrowableHealthPotionAdapter;
import org.example.Adapter.ThrowablePoisonPotionAdapter;
import org.example.Composite.Inventory;
import org.example.Iterator.Iterator;
import org.example.Observer.EventManager;
import org.example.Potions.HealthPotion;
import org.example.Potions.PoisonPotion;
import org.example.Weapons.Weapon;

public class Main {
    public static void main(String[] args) {
        //Main.testAbstractFactory();
       // Main.testCompositeAndIterator();
        //Main.testObserver();
        Main.testAdapter();
    }

    public static void testAbstractFactory() {
        WeaponFactory weaponFactory;

        System.out.println("---------CREATING UNCOMMON WEAPONS----------");
        weaponFactory = new UncommonWeaponFactory();

        System.out.println(weaponFactory.createSword().toString());
        System.out.println(weaponFactory.createMace().toString());
        System.out.println(weaponFactory.createMace().toString());


        System.out.println("---------CREATING RARE WEAPONS----------");

        weaponFactory = new RareWeaponFactory();

        System.out.println(weaponFactory.createSword().toString());
        System.out.println(weaponFactory.createMace().toString());
        System.out.println(weaponFactory.createMace().toString());

        System.out.println("---------CREATING EPIC WEAPONS----------");

        weaponFactory = new EpicWeaponFactory();

        System.out.println(weaponFactory.createSword().toString());
        System.out.println(weaponFactory.createMace().toString());
        System.out.println(weaponFactory.createMace().toString());
    }

    public static void testCompositeAndIterator() {
        System.out.println("----------TESTING COMPOSITE----------");
        WeaponFactory uncommonWeaponFactory = new UncommonWeaponFactory();
        WeaponFactory rareWeaponFactory = new RareWeaponFactory();
        WeaponFactory epicWeaponFactory = new EpicWeaponFactory();

        Inventory inventory = new Inventory(
                new Inventory( // Uncommon weapon inventory
                        uncommonWeaponFactory.createSword(),
                        uncommonWeaponFactory.createMace(),
                        uncommonWeaponFactory.createAxe()
                ),
                new Inventory( // Rare weapon inventory
                        rareWeaponFactory.createSword(),
                        rareWeaponFactory.createMace(),
                        rareWeaponFactory.createAxe()
                ),
                new Inventory( // Epic weapon inventory
                        epicWeaponFactory.createSword(),
                        epicWeaponFactory.createMace(),
                        epicWeaponFactory.createAxe()
                )
        );

        System.out.println("EACH UNCOMMON WEAPON IS WORTH 1 GOLD");
        System.out.println("EACH RARE WEAPON IS WORTH 2 GOLD");
        System.out.println("EACH EPIC WEAPON IS WORTH 3 GOLD");
        System.out.println("EXPECTED GOLD VALUE FROM SELLING WHOLE INVENTORY: 18");
        System.out.println("RESULT: " + inventory.sell());

        System.out.println("----------TESTING COMPOSITE ITERATOR----------");

        for (Iterator<Weapon> iterator = inventory.getIterator(); iterator.hasNext();)  {
            System.out.println(iterator.next().toString());
        }
    }

    public static void testObserver() {
        System.out.println("----------TESTING OBSERVER----------");
        Player player1 = new Player("First player");
        Player player2 = new Player("Second player");
        Player player3 = new Player("Third player");

        EventManager eventManager = new EventManager(player1, player2, player3);

        Server server = new Server(eventManager);

        System.out.println("ALL PLAYERS ARE NOT CONNECTED TO THE SERVER");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

        System.out.println("CONNECTING PLAYERS TO SERVER");
        server.connectListenersToServer();
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

        System.out.println("DISCONNECTING PLAYERS FROM SERVER");
        server.disconnectListenersFromServer();
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
    }

    private static void testAdapter() {
        System.out.println("----------TESTING ADAPTER----------");
        Player player = new Player("First player");
        WeaponFactory uncommonWeaponFactory = new UncommonWeaponFactory();

        Weapon sword = uncommonWeaponFactory.createSword();
        Weapon axe = uncommonWeaponFactory.createAxe();
        Weapon mace = uncommonWeaponFactory.createMace();

        System.out.println("PLAYER HP: " + player.getHealth());

        System.out.println("TAKING DAMAGE FROM THE UNCOMMON WEAPONS");
        sword.dealDamage(player);
        axe.dealDamage(player);
        mace.dealDamage(player);

        System.out.println("PLAYER HP AFTER TAKING DAMAGE FROM WEAPONS: " + player.getHealth());

        HealthPotion healthPotion = new HealthPotion(5);
        PoisonPotion poisonPotion = new PoisonPotion(5);

        Weapon throwableHealthPotionAdapter = new ThrowableHealthPotionAdapter(healthPotion);
        Weapon throwablePoisonPotionAdapter = new ThrowablePoisonPotionAdapter(poisonPotion);

        System.out.println("THROWING HEALTH POTION AT PLAYER");
        throwableHealthPotionAdapter.dealDamage(player);
        System.out.println("PLAYER HP AFTER GETTING HIT BY THE HEALTH POTION: " + player.getHealth());

        System.out.println("THROWING POISON POTION AT PLAYER");
        throwablePoisonPotionAdapter.dealDamage(player);
        System.out.println("PLAYER HP AFTER GETTING HIT BY THE POISON POTION: " + player.getHealth());
    }
}