package com.isep;


public interface IPublisher {
    void attach(Observer o);
    void detach(Observer o);
    void notifyUpdate(Message m);
}