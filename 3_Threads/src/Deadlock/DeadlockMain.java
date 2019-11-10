package Deadlock;

public class DeadlockMain {

    public static void main(String[] args) {

        String lockOne = "I'm the lock number one";
        String lockTwo = "I'm the lock number two";


        //Underneath we have an anonymous class, in which you write everthing within the brackets.
        Thread threadOne = new Thread() {
            public void run() {
                synchronized (lockOne) {
                    System.out.println("Thread 1 locking with number one");

                    // Making sure deadlock occurs everytime through Sleep.
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (lockTwo){
                        System.out.println("Thread 1 locking with number two");
                    }
                }

            }
        };

        Thread threadTwo = new Thread() {
            public void run() {
                synchronized (lockTwo) {
                    System.out.println("Thread 2 locking with number two");

                    synchronized (lockOne) {
                        System.out.println("Thread 2 locking with number one");
                    }
                }

            }
        };

        threadOne.start();
        threadTwo.start();

    }

}
