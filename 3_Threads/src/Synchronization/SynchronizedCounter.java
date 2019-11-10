package Synchronization;

public class SynchronizedCounter extends Thread {

    //private static Object lock = new Object();
    private static Object lockOne = new Object();
    private static Object lockTwo = new Object();
    // Another way to create a lock -- Underneath.
    // Private ReentrantLock reentrantLock = new ReentrantLock();

    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void decrement () {
        synchronized (lockOne) {
            this.counter--;
        }
    }
    public void increment () {
       synchronized (lockTwo) {
           this.counter++;
       }
       }
}

/*

//Synchronized - Java keyword. Example-

    public synchronized void decrement () {
        this.counter--;
    }
    public synchronized void increment () {
        this.counter++;
    }

 */