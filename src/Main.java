
public class Main {

    public static void main(String[] args) throws InterruptedException {

        SharedResource resource = new SharedResource();

        SimpleExtendedThread t1_ = new SimpleExtendedThread(1, resource);
        SimpleExtendedThread t2_ = new SimpleExtendedThread(2, resource);
        SimpleExtendedThread t3_ = new SimpleExtendedThread(3, resource);
        SimpleExtendedThread t4_ = new SimpleExtendedThread(4, resource);
        SimpleExtendedThread t5_ = new SimpleExtendedThread(5, resource);
        SimpleExtendedThread t6_ = new SimpleExtendedThread(6, resource);

        Thread t1 = new Thread(t1_);
        Thread t2 = new Thread(t2_);
        Thread t3 = new Thread(t3_);
        Thread t4 = new Thread(t4_);
        Thread t5 = new Thread(t5_);
        Thread t6 = new Thread(t6_);

        t1.start();
        t2.start();
//        t2.join();
//        Thread.sleep(11);
        t3.start();
//        t3.join();
//        Thread.sleep(15);
        t4.start();
//        t4.join();
//        Thread.sleep(15);
        t5.start();
//        t5.join();
//        Thread.sleep(15);
        t6.start();
//        t6.join();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();

        System.out.println("Done");

    }
}
