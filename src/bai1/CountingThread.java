package bai1;

public class CountingThread extends Thread{
    @Override
    public void run() {
        for (int i = 10;i>0;i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
