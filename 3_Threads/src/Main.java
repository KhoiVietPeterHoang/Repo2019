import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Runtime is the main thread in Java
        Runtime runtime = Runtime.getRuntime();

        //System.out.println(runtime.totalMemory());
        //System.out.println(runtime.freeMemory());
        //System.out.println(runtime.maxMemory());

       /*
       OBS: Only works on non Mac machines
        try {
            runtime.exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }
       */
        // Garbage collection
        //runtime.gc();



       // 2 Ways to use threads

        // extends Threads
        ThreadExtendsThread extendsThread = new ThreadExtendsThread();
        ThreadExtendsThread extendsThread1 = new ThreadExtendsThread();
        ThreadExtendsThread extendsThread2 = new ThreadExtendsThread();
        ThreadExtendsThread extendsThread3 = new ThreadExtendsThread();

        // Starting the thread
        //extendsThread.start();
        //extendsThread1.start();
        //extendsThread2.start();
        //extendsThread3.start();

       // Grouping threads together
       ThreadGroup threadGroup = new ThreadGroup("Naming the group");

       // implements runnable
       ThreadsImplementsRunable runnableThread = new ThreadsImplementsRunable();
       Thread thread = new Thread(threadGroup, runnableThread);
       //thread.start();

       //ThreadGroup threadgroup = new ThreadGroup("Group naming");
       //System.out.println(thread.getThreadGroup().getName());

       //thread.getThreadGroup();

       // Running the runnable
       // runnableThread.run();

        PrintThreads thread0 = new PrintThreads("Long sentence, even longer sentence, a really long sentence");
        PrintThreads thread1 = new PrintThreads("1111111111111111111111111111111111111111111111111111111111 ");
        PrintThreads thread2 = new PrintThreads("2222222222222222222222222222222222222222222222222222222222 ");
        PrintThreads thread3 = new PrintThreads("Cows eat very very much grass");

        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();


    }

}
