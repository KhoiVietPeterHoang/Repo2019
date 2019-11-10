public class ThreadsImplementsRunable implements Runnable {

    String message;

    public ThreadsImplementsRunable(String message){
        this.message = message;
    }

    public ThreadsImplementsRunable() {

    }

    @Override
    public void run() {
        System.out.println("ABC");

    }
}








/*
while (true) {

System.out.println("Thread is walking..");
try {
Thread.sleep(10000);
} catch (InterruptedException e) {
e.printStackTrace();
}
*/

