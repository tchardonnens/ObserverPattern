package com.isep;

public class Observer implements IObserver {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    @Override
    public void update(Message message) {
        System.out.println(name + " received the message: " + message.getContent());
    }
}
