//IMPLEMENTATION OF Vector
// PROPERTIES focussed : its thread safe nature

import java.util.Vector;
import java.util.Iterator;

public class SecureChatServer {
    private Vector<String> messageQueue = new Vector<>();
    private static final int MAX_MESSAGES = 100;

    // Thread-safe message addition
    public void addMessage(String user, String message) {
        if (messageQueue.size() < MAX_MESSAGES) {
            String formattedMsg = "[" + user + "]: " + message;
            messageQueue.add(formattedMsg);
            System.out.println("Message queued: " + formattedMsg);
        } else {
            System.out.println("Message queue full!");
        }
    }

    // Thread-safe message retrieval
    public void displayMessages() {
        synchronized (messageQueue) {
            System.out.println("\n--- Chat Log ---");
            Iterator<String> it = messageQueue.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    public static void main(String[] args) {
        SecureChatServer chat = new SecureChatServer();

        // Simulate multiple users sending messages concurrently
        Thread user1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                chat.addMessage("Alice", "Hello! #" + i);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        });

        Thread user2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                chat.addMessage("Bob", "How's it going? #" + i);
                try { Thread.sleep(150); } catch (InterruptedException e) {}
            }
        });

        user1.start();
        user2.start();

        try {
            user1.join();
            user2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        chat.displayMessages();
    }
}