package org.example;

import org.example.Observer.EventListener;

public class Player implements EventListener {
    private String username;
    private Integer health;
    private Boolean connected;

    public Player(String username) {
        this.username = username;
        this.connected = false;
        this.health = 100;
    }

    @Override
    public void update(String message) {
        String[] splitMessage = message.split(" ");

        switch (splitMessage[0]){
            case "CONNECT":
                this.connected = true;
                break;
            case "DISCONNECT":
                this.connected = false;
                break;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                "health='" + health + '\'' +
                ", connected=" + connected +
                '}';
    }

    public void takeDamage(Integer damage) {
        health -= damage;
    }

    public void heal(Integer healAmount) {
        health += healAmount;
    }

    public Integer getHealth() {
        return health;
    }
}
