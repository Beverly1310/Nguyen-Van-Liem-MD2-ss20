package bai2;

public class SumThread extends Thread{
    @Override
    public void run() {
        int sum =0;
        for (int i = 1; i <=1000 ; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
