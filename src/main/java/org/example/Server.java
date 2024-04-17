package org.example;

import org.example.Observer.EventManager;

public class Server {
    private EventManager eventManager;

    public Server(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void connectListenersToServer() {
        eventManager.notify("CONNECT");
    }

    public void disconnectListenersFromServer() {
        eventManager.notify("DISCONNECT");
    }
}
