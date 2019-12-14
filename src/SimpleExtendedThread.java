
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleExtendedThread implements Runnable{

    String name;
    SharedResource resource;

    public SimpleExtendedThread(int i, SharedResource resource) {
        name = "Thread: " + i;
        System.out.println("Thead created: " + name);
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            System.out.println(name + ": " + i);
            resource.increment(name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(name + " was interrupted");
            }
        }        
    }
}
