package bai5;

public class OldThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
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
