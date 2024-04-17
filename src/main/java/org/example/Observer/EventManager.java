package org.example.Observer;

import java.util.List;

public class EventManager {
    private List<EventListener> eventListeners;

    public EventManager(EventListener... eventListeners) {
        this.eventListeners = List.of(eventListeners);
    }

    public void subscribe(EventListener eventListener) {
        eventListeners.add(eventListener);
    }

    public void unsubscribe(EventListener eventListener) {
        eventListeners.remove(eventListener);
    }

    public void notify(String message) {
        for(EventListener eventListener : eventListeners) {
            eventListener.update(message);
        }
    }
}
