package bai10;

import java.util.Scanner;

public class SleepingThread extends Thread{
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao thoi gian muon ngu: ");
        long count = Integer.parseInt(scanner.nextLine());
        try {
            sleep(count* 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Da ngu trong: "+count+"s");
    }
}
