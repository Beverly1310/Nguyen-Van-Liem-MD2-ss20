package bai3;

public class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            if (i%2!=0){
                System.out.println(i);
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
