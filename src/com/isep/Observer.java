package com.isep;

public class Observer implements IObserver {
    private String name;
    private Message lastMessage;

    public Observer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Message getLastMessage() {
        return lastMessage;
    }

    @Override
    public void update(Message message) {
        lastMessage = message;
        System.out.println(name + " received the message: " + message.getContent());
    }
}
