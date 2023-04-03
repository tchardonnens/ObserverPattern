package tests;

import com.isep.Message;
import com.isep.MessagePublisher;
import com.isep.Observer;
import org.junit.Test;

import static org.junit.Assert.*;

public class MessagePublisherTest {

    @Test
    public void testAttachAndNotify() {
        // Setup
        MessagePublisher publisher = new MessagePublisher();
        Observer observer1 = new Observer("Newspaper 1");
        Observer observer2 = new Observer("Newspaper 2");

        // Attach observers to the publisher
        publisher.attach(observer1);
        publisher.attach(observer2);

        // Notify observers with a message
        Message message = new Message("Breaking news: Observer pattern is awesome!");
        publisher.notifyUpdate(message);

        // Verify that both observers received the message
        assertEquals(observer1.getName() + " received the message: " + observer1.getLastMessage().getContent(), "Newspaper 1 received the message: Breaking news: Observer pattern is awesome!");
        assertEquals(observer2.getName() + " received the message: " + observer2.getLastMessage().getContent(), "Newspaper 2 received the message: Breaking news: Observer pattern is awesome!");
    }

    @Test
    public void testDetach() {
        // Setup
        MessagePublisher publisher = new MessagePublisher();
        Observer observer1 = new Observer("Newspaper 1");
        Observer observer2 = new Observer("Newspaper 2");

        // Attach observers to the publisher
        publisher.attach(observer1);
        publisher.attach(observer2);

        // Detach observer2 from the publisher
        publisher.detach(observer2);

        // Notify observers with a message
        Message message = new Message("Breaking news: Observer pattern is awesome!");
        publisher.notifyUpdate(message);

        // Verify that only observer1 received the message
        assertEquals(observer1.getName() + " received the message: " + observer1.getLastMessage().getContent(), "Newspaper 1 received the message: Breaking news: Observer pattern is awesome!");
        assertEquals(observer2.getName() + " received the message: " + observer2.getLastMessage().getContent(), "Newspaper 2 did not receive the message.");
    }

    @Test
    public void testNoObservers() {
        // Setup
        MessagePublisher publisher = new MessagePublisher();

        // Notify with a message (there are no observers)
        Message message = new Message("No observers yet!");
        publisher.notifyUpdate(message);

    }
}
