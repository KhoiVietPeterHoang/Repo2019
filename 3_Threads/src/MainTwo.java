import Concurrency.CountingThread;
import Semaphore.SemaphoreExample;

import java.util.concurrent.Semaphore;


public class MainTwo extends CountingThread {

    public static void main(String[] args) throws InterruptedException {


        CountingThread countingThread1 = new CountingThread();
        CountingThread countingThread2 = new CountingThread();
        CountingThread countingThread3 = new CountingThread();

        // Setting priority (which still does not decide the exact order of print, due to it depending on several
        //Factors such as machine etc.
        countingThread1.setPriority(Thread.MAX_PRIORITY);
        countingThread2.setPriority(Thread.MIN_PRIORITY);
        countingThread3.setPriority(Thread.MIN_PRIORITY);

        //Setname for thread
        countingThread1.setName("1st");
        countingThread2.setName("2nd");
        countingThread3.setName("3rd");

        //Activating the threads
        countingThread1.start();
        countingThread1.join();
        //Join makes sure X thread runs and finishes itself, before the next threads afterwards
        // launches. You can couple multiple joins as seen underneath here as well, with T1 T2
        countingThread2.start();
        countingThread2.join();
        countingThread3.start();

        // ---------------------------------------
        // TODO: research: notify() , notifyAll()
        // ---------------------------------------

       // Start the semaphore thread
        // Permits value -> Amount of threads that can run at given time in this case 1

        /*

        Semaphore semaphore = new Semaphore(1);

        SemaphoreExample semaphoreOne = new SemaphoreExample(semaphore);
        SemaphoreExample semaphoreTwo = new SemaphoreExample(semaphore);

        Thread semaphoreThreadOne = new Thread(semaphoreOne);
        Thread semaphoreThreadTwo = new Thread(semaphoreTwo);

        semaphoreThreadOne.start();
        semaphoreThreadTwo.start();

        */

        // Example -
        // Thread 1: Wants to use the ressources
        // the semaphore ticks from 1 to 0
        // Same with another thread, it could go from 0 to 1.


    }

}
