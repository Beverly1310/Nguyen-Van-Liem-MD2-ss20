package bai7;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Math.random()*100);
    }
}
