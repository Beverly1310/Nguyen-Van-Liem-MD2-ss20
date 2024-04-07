package bai8;

public class Thread2 extends Thread{

    @Override
    public void run() {
        increase(Test.TEST);
    }
    public void increase(int a){
        for (int i = 0; i < 100; i++) {
            System.out.println("Luong 2: "+(a+=1));
        }
    }
}
