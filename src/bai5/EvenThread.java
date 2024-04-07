package bai5;

public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
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