package bai5;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OldThread oldThread =new OldThread();
        EvenThread evenThread = new EvenThread();
        oldThread.start();
        oldThread.join();
        evenThread.start();

    }
}
