package Synchronization;

public class ClassicCounter {
    private int counter = 0;
    //Volatile -> Keyword - Puts the value in the main memory. (In this case, 0)
    //private volatile int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void decrement () {
        this.counter--;
    }
    public void increment () {
        this.counter++;
    }
}

/*

- Increment
1 - Reading local value
2 - Increment value
3 - Set the local value


 */