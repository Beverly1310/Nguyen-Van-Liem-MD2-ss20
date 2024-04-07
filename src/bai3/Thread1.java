package bai3;

public class Thread1 extends Thread{
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                System.out.println(i);
            }
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
