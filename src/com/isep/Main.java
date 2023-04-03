package com.isep;

public class Main {
    public static void main(String[] args) {
        MessagePublisher publisher = new MessagePublisher();
        Observer observer1 = new Observer("Newspaper 1");
        Observer observer2 = new Observer("Newspaper 2");

        publisher.attach(observer1);
        publisher.attach(observer2);

        Message message = new Message("Breaking news: Observer pattern is awesome!");
        publisher.notifyUpdate(message);

        publisher.detach(observer2);

        message = new Message("Another update: This design pattern is very useful.");
        publisher.notifyUpdate(message);
    }
}

