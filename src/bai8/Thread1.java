package bai8;

public class Thread1 extends Thread{
    @Override
    public void run() {
        decrease(Test.TEST);
    }
    public void decrease(int a){
        for (int i = 0; i < 100; i++) {
            System.out.println("luong 1: "+(a-=1));
        }
    }
}
