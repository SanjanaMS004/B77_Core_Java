package multithread;

public class ThreadMethods {
    public static void main(String[] args) {
        ChildThread ct1 = new ChildThread(5, "Thread1");
        ChildThread ct2 = new ChildThread(6, "Thread2");

        System.out.println("Current Thread: " + Thread.currentThread());

        ct1.start();
        ct2.start();

        Thread.currentThread().setName("Parent Thread");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println("Current Thread: " + Thread.currentThread());

        try {
            ct1.join();
            ct2.join(300);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }
}