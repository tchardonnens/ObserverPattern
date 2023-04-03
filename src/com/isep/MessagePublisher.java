package com.isep;

import java.util.ArrayList;

public class MessagePublisher implements IPublisher {
    private ArrayList<Observer> subscribers;

    public MessagePublisher() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void attach(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void detach(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
        for (Observer subscriber : subscribers) {
            subscriber.update(m);
        }
    }
}
