
public class SharedResource {

    int counter;

    public SharedResource() {
        this.counter = 0;
    }

    public synchronized void increment(String threadName) {
        
        this.counter++;
        System.out.println(threadName + ": " + this.counter);
    }
}
