public class ThreadDemo {
    public static void main(String[] args) {
        // Create a shared resource
        SharedCounter counter = new SharedCounter();

        // Create two threads that will increment the counter
        Thread thread1 = new Thread(new IncrementTask(counter), "Thread-1");
        Thread thread2 = new Thread(new IncrementTask(counter), "Thread-2");

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final counter value
        System.out.println("Final counter value: " + counter.getCount());
    }
}

// Shared resource class
class SharedCounter {
    private int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

// Task that will be executed by threads
class IncrementTask implements Runnable {
    private SharedCounter counter;
    private static final int ITERATIONS = 1000;

    public IncrementTask(SharedCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < ITERATIONS; i++) {
            counter.increment();

            // Small delay to increase chance of thread interference
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " completed");
    }
}