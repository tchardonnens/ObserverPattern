# ObserverPattern
Pub/Sub in Java using Observer patterns

         +----------------+              +----------------+
         |   Publisher    |              |    Subscriber  |
         |----------------|              |----------------|
         |                |              |                |
         |  - Subscribers |◄-------------|                |
         |                |              |                |
         | +notifyUpdate()|              |   +update()    |
         +----------------+              +----------------+

